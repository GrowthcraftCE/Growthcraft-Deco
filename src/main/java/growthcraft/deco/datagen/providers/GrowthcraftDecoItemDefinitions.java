package growthcraft.deco.datagen.providers;

import com.google.gson.JsonObject;
import growthcraft.deco.init.GrowthcraftDecoBlocks;
import growthcraft.deco.shared.Reference;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.Identifier;

import java.util.concurrent.CompletableFuture;

/** Generates Minecraft 26 item definitions that point at Deco's existing item models. */
public final class GrowthcraftDecoItemDefinitions implements DataProvider {
    private final PackOutput.PathProvider paths;

    public GrowthcraftDecoItemDefinitions(PackOutput output) {
        this.paths = output.createPathProvider(PackOutput.Target.RESOURCE_PACK, "items");
    }

    @Override
    public CompletableFuture<?> run(CachedOutput output) {
        return CompletableFuture.allOf(GrowthcraftDecoBlocks.BLOCKS.getEntries().stream().map(block -> {
            Identifier id = block.getId();
            JsonObject model = new JsonObject();
            model.addProperty("type", "minecraft:model");
            model.addProperty("model", Reference.MODID + ":item/" + id.getPath());

            JsonObject definition = new JsonObject();
            definition.add("model", model);
            return DataProvider.saveStable(output, definition, paths.json(id));
        }).toArray(CompletableFuture[]::new));
    }

    @Override
    public String getName() {
        return "Growthcraft Deco Item Definitions";
    }
}
