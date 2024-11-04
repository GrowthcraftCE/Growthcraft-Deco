package growthcraft.deco.datagen.providers;

import growthcraft.deco.shared.Reference;
import growthcraft.deco.utils.ColorUtils;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

import static growthcraft.deco.init.GrowthcraftDecoBlocks.GLOWING_TRANSPARENT_BLOCKS_STATE_MAP;

public class GrowthcraftDecoBlockModelProvider extends BlockModelProvider {

    public GrowthcraftDecoBlockModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Reference.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        this.carpetStairBlocks();
        this.transparentBlocks();
    }

    private void transparentBlocks() {
        // TODO: Generate model files for Glowing Vanilla Transparent Blocks
        GLOWING_TRANSPARENT_BLOCKS_STATE_MAP.forEach((blockRegistryObject, resourceLocation) -> {
            ResourceLocation blockResourceLocation = key(blockRegistryObject.get());
            String modelLocation = ResourceLocation.fromNamespaceAndPath(blockResourceLocation.getNamespace(),
                    "block/" + blockResourceLocation.getPath()).toString();
            this.transparentBlockWithParent(modelLocation, resourceLocation.toString());
        });

    }

    private void carpetStairBlocks() {
        this.carpetStairsWithPartialModels("block/stairs/stairs_tuff_carpet", "minecraft:block/tuff");
        this.carpetStairsWithPartialModels("block/stairs/stairs_tuff_brick_carpet", "minecraft:block/tuff_bricks");
        this.carpetStairsWithPartialModels("block/stairs/stairs_polished_tuff_carpet", "minecraft:block/polished_tuff");
    }

    private void transparentBlockWithParent(String name, String parent) {
        this.withExistingParent(name, parent).renderType("cutout");
    }

    private void carpetStairsWithPartialModels(String baseName, String baseTextureLocation) {
        String stairBaseParentModel = "growthcraft_deco:block/stairs/template/stairs";
        String modelBaseFileName = String.format("%s_", baseName);

        ColorUtils.getColorNames().forEach(color -> {
            String stairModelName = modelBaseFileName.concat(color);
            String colorTextureLocation = String.format("minecraft:block/%s_wool", color);

            this.withExistingParent(stairModelName, stairBaseParentModel)
                    .texture("base", baseTextureLocation)
                    .texture("carpet", colorTextureLocation)
                    .texture("particle", baseTextureLocation);

            this.withExistingParent(stairModelName.concat("_inner"), stairBaseParentModel.concat("_inner"))
                    .texture("base", baseTextureLocation)
                    .texture("carpet", colorTextureLocation)
                    .texture("particle", baseTextureLocation);

            this.withExistingParent(stairModelName.concat("_outer"), stairBaseParentModel.concat("_outer"))
                    .texture("base", baseTextureLocation)
                    .texture("carpet", colorTextureLocation)
                    .texture("particle", baseTextureLocation);

            String stairPartialModelName = modelBaseFileName.concat("partial").concat("_" + color);
            this.withExistingParent(stairPartialModelName, stairBaseParentModel.concat("_partial"))
                    .texture("base", baseTextureLocation)
                    .texture("carpet", colorTextureLocation)
                    .texture("particle", baseTextureLocation);

            this.withExistingParent(stairPartialModelName.concat("_inner"), stairBaseParentModel.concat("_partial").concat("_inner"))
                    .texture("base", baseTextureLocation)
                    .texture("carpet", colorTextureLocation)
                    .texture("particle", baseTextureLocation);

            this.withExistingParent(stairPartialModelName.concat("_outer"), stairBaseParentModel.concat("_partial").concat("_outer"))
                    .texture("base", baseTextureLocation)
                    .texture("carpet", colorTextureLocation)
                    .texture("particle", baseTextureLocation);
        });

    }



    private ResourceLocation key(Block block) {
        return ForgeRegistries.BLOCKS.getKey(block);
    }
}
