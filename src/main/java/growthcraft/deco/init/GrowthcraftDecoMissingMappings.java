package growthcraft.deco.init;

import growthcraft.deco.shared.Reference;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.MissingMappingsEvent;

import java.util.HashMap;
import java.util.Map;

import static java.util.Map.entry;

public class GrowthcraftDecoMissingMappings {

    public static void missingMappingEventHandler(MissingMappingsEvent event) {
        event.getAllMappings(ForgeRegistries.Keys.ITEMS).forEach( missingItemMapping -> {
            if(missingItemMapping.getKey().getNamespace() == Reference.MODID) {
                switch (missingItemMapping.getKey().toString()) {
                    case "growthcraft_deco:stairs_deepslate_brick_glowing" -> missingItemMapping.remap(ForgeRegistries.ITEMS.getValue(
                            new ResourceLocation(Reference.MODID, Reference.UnlocalizedName.STAIR_DEEPSLATE_BRICK_GLOWING))
                    );
                    case "growthcraft_deco:deepslate_tile_stairs_glowing", "growthcraft_deco:stairs_deepslate_tile_glowing" ->
                            missingItemMapping.remap(ForgeRegistries.ITEMS.getValue(
                                    new ResourceLocation(Reference.MODID, Reference.UnlocalizedName.STAIR_DEEPSLATE_TILE_GLOWING))
                            );
                    default -> throw new IllegalStateException("Unexpected value: " + missingItemMapping.getKey().toString());
                }
            }
        });

        event.getAllMappings(ForgeRegistries.Keys.BLOCKS).forEach( missingBlockMapping -> {
            if(missingBlockMapping.getKey().getNamespace() == Reference.MODID) {
                switch (missingBlockMapping.getKey().toString()) {
                    case "growthcraft_deco:stairs_deepslate_brick_glowing" -> missingBlockMapping.remap(ForgeRegistries.BLOCKS.getValue(
                            new ResourceLocation(Reference.MODID, Reference.UnlocalizedName.STAIR_DEEPSLATE_BRICK_GLOWING))
                    );
                    case "growthcraft_deco:deepslate_tile_stairs_glowing", "growthcraft_deco:stairs_deepslate_tile_glowing" ->
                            missingBlockMapping.remap(ForgeRegistries.BLOCKS.getValue(
                                    new ResourceLocation(Reference.MODID, Reference.UnlocalizedName.STAIR_DEEPSLATE_TILE_GLOWING))
                            );
                    default -> throw new IllegalStateException("Unexpected value: " + missingBlockMapping.getKey().toString());
                }
            }
        });
    }

}
