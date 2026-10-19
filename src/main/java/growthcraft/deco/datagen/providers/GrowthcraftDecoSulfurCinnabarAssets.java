package growthcraft.deco.datagen.providers;

import com.google.gson.JsonParser;
import growthcraft.deco.init.GrowthcraftDecoBlocks;
import growthcraft.deco.shared.Reference;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;

/** Generates new stone-family assets using the established tuff geometry and rotations. */
public final class GrowthcraftDecoSulfurCinnabarAssets implements DataProvider {
    private final Path assets;

    public GrowthcraftDecoSulfurCinnabarAssets(PackOutput output) {
        assets = output.getOutputFolder(PackOutput.Target.RESOURCE_PACK).resolve(Reference.MODID);
    }

    public static boolean owns(Path file) {
        String name = file.getFileName().toString();
        return GrowthcraftDecoBlocks.SULFUR_CINNABAR_VARIANTS.keySet().stream()
                .anyMatch(id -> name.equals(id + ".json") || name.startsWith(id + "_"));
    }

    @Override
    public CompletableFuture<?> run(CachedOutput output) {
        var writes = new ArrayList<CompletableFuture<?>>();
        try (var models = Files.walk(assets.resolve("models/block"))) {
            var modelFiles = models.filter(path -> path.toString().endsWith(".json")).toList();
            for (var entry : GrowthcraftDecoBlocks.SULFUR_CINNABAR_VARIANTS.entrySet()) {
                String id = entry.getKey();
                var variant = entry.getValue();
                String template = variant.template();
                var sources = new ArrayList<Path>();
                sources.add(assets.resolve("blockstates/" + template + ".json"));
                sources.add(assets.resolve("models/item/" + template + ".json"));
                modelFiles.stream().filter(file -> {
                    String name = file.getFileName().toString();
                    return name.equals(template + ".json") || name.startsWith(template + "_");
                }).forEach(sources::add);
                for (Path source : sources) {
                    Path target = source.resolveSibling(source.getFileName().toString().replace(template, id));
                    String json = Files.readString(source)
                            .replace("\"minecraft:block/tuff\"", "\"minecraft:block/" + variant.texture() + "\"")
                            .replace(template, id);
                    writes.add(DataProvider.saveStable(output, JsonParser.parseString(json), target));
                }
            }
        } catch (IOException exception) {
            return CompletableFuture.failedFuture(exception);
        }
        return CompletableFuture.allOf(writes.toArray(CompletableFuture[]::new));
    }

    @Override
    public String getName() {
        return "Growthcraft Deco Sulfur and Cinnabar Assets";
    }
}
