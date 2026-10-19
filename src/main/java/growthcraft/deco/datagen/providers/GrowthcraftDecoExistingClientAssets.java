package growthcraft.deco.datagen.providers;

import com.google.gson.JsonParser;
import growthcraft.deco.shared.Reference;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;

/** Retains checked-in client assets until their legacy generators have a replacement. */
public final class GrowthcraftDecoExistingClientAssets implements DataProvider {
    private final Path assets;

    public GrowthcraftDecoExistingClientAssets(PackOutput output) {
        assets = output.getOutputFolder(PackOutput.Target.RESOURCE_PACK).resolve(Reference.MODID);
    }

    @Override
    public CompletableFuture<?> run(CachedOutput output) {
        var writes = new ArrayList<CompletableFuture<?>>();
        try {
            for (String directory : new String[]{"blockstates", "models"}) {
                Path root = assets.resolve(directory);
                if (!Files.isDirectory(root)) {
                    throw new IOException("Missing checked-in client assets: " + root);
                }
                try (var files = Files.walk(root)) {
                    for (Path file : files.filter(path -> path.toString().endsWith(".json")
                            && !GrowthcraftDecoSulfurCinnabarAssets.owns(path)).toList()) {
                        writes.add(DataProvider.saveStable(output,
                                JsonParser.parseString(Files.readString(file)), file));
                    }
                }
            }
        } catch (IOException exception) {
            return CompletableFuture.failedFuture(exception);
        }
        return CompletableFuture.allOf(writes.toArray(CompletableFuture[]::new));
    }

    @Override
    public String getName() {
        return "Growthcraft Deco Existing Client Assets";
    }
}
