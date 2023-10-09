package growthcraft.deco.init;

import growthcraft.deco.shared.Reference;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.MissingMappingsEvent;

import java.util.Map;

public class GrowthcraftDecoMissingMappings {

    private static final Map<String, ResourceLocation> MISSING_MAPPINGS = Map.ofEntries(
            Map.entry("growthcraft_deco:stairs_deepslate_brick_glowing",
                    new ResourceLocation(Reference.MODID, Reference.UnlocalizedName.STAIR_DEEPSLATE_BRICK_GLOWING)),
            Map.entry("growthcraft_deco:deepslate_tile_stairs_glowing",
                    new ResourceLocation(Reference.MODID, Reference.UnlocalizedName.STAIR_DEEPSLATE_TILE_GLOWING)),
            Map.entry("growthcraft_deco:stairs_deepslate_tile_glowing",
                    new ResourceLocation(Reference.MODID, Reference.UnlocalizedName.STAIR_DEEPSLATE_TILE_GLOWING))
    );

    public static void missingMappingEventHandler(MissingMappingsEvent event) {
        event.getAllMappings(ForgeRegistries.Keys.ITEMS).forEach(missingRegistryObject -> {
            if (missingRegistryObject.getKey().getNamespace().equals(Reference.MODID)) {
                replaceMissingRegistryItem(missingRegistryObject);
            }
        });

        event.getAllMappings(ForgeRegistries.Keys.BLOCKS).forEach(missingRegistryObject -> {
            if (missingRegistryObject.getKey().getNamespace().equals(Reference.MODID)) {
                replaceMissingRegistryBlock(missingRegistryObject);
            }
        });
    }

    private static void replaceMissingRegistryItem(MissingMappingsEvent.Mapping<Item> missingRegistryObject) {
        ResourceLocation replacementResourceLocation = MISSING_MAPPINGS.get(
                missingRegistryObject.getKey().toString()
        );

        if (replacementResourceLocation != null) {
            missingRegistryObject.remap(
                    ForgeRegistries.ITEMS.getValue(
                            MISSING_MAPPINGS.get(missingRegistryObject.getKey().toString())
                    )
            );
        } else {
            throw new IllegalStateException("Unexpected value: " + missingRegistryObject.getKey().toString());
        }
    }

    private static void replaceMissingRegistryBlock(MissingMappingsEvent.Mapping<Block> missingRegistryObject) {
        ResourceLocation replacementResourceLocation = MISSING_MAPPINGS.get(
                missingRegistryObject.getKey().toString()
        );

        if (replacementResourceLocation != null) {
            missingRegistryObject.remap(
                    ForgeRegistries.BLOCKS.getValue(
                            MISSING_MAPPINGS.get(missingRegistryObject.getKey().toString())
                    )
            );
        } else {
            throw new IllegalStateException("Unexpected value: " + missingRegistryObject.getKey().toString());
        }
    }


}
