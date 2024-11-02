package growthcraft.deco.datagen.providers;

import growthcraft.deco.init.GrowthcraftDecoBlocks;
import growthcraft.deco.shared.Reference;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

/**
 * @credit Kaupenjoe for his DataGenerator tutorials
 */
public class GrowthcraftDecoBlockStateProvider extends BlockStateProvider {
    public GrowthcraftDecoBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Reference.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        // Simple Cube Blocks with Simple BlockItem Models
        //this.blockWithItem(GrowthcraftDecoBlocks.STONE_BRICKS_GLOWING.get());
        this.glassPanes();
        this.slabs();
        this.clonedSimpleBlocks();
        this.carpetStairBlocks();
    }

    private void carpetStairBlocks() {
        GrowthcraftDecoBlocks.CARPET_STAIR_BLOCKS_STATE_MAP.forEach((blockRegistryObject, resourceLocation) -> {
            this.carpetStairs(blockRegistryObject.get(), resourceLocation);
        });

        GrowthcraftDecoBlocks.CARPET_PARTIAL_STAIR_BLOCKS_STATE_MAP.forEach((blockRegistryObject, resourceLocation) -> {
            this.carpetStairs(blockRegistryObject.get(), resourceLocation);
        });

    }

    private void glassPanes() {
        this.paneWithRenderType(GrowthcraftDecoBlocks.GLASS_STAINED_BLACK_PANE_GLOWING.get(),
                "block/black_stained_glass", "block/black_stained_glass_pane_top");
        this.paneWithRenderType(GrowthcraftDecoBlocks.GLASS_STAINED_BLUE_PANE_GLOWING.get(),
                "block/blue_stained_glass", "block/blue_stained_glass_pane_top");
        this.paneWithRenderType(GrowthcraftDecoBlocks.GLASS_STAINED_BROWN_PANE_GLOWING.get(),
                "block/brown_stained_glass", "block/brown_stained_glass_pane_top");
        this.paneWithRenderType(GrowthcraftDecoBlocks.GLASS_STAINED_CLEAR_PANE_GLOWING.get(),
                "block/glass", "block/glass_pane_top");
        this.paneWithRenderType(GrowthcraftDecoBlocks.GLASS_STAINED_CYAN_PANE_GLOWING.get(),
                "block/cyan_stained_glass", "block/cyan_stained_glass_pane_top");
        this.paneWithRenderType(GrowthcraftDecoBlocks.GLASS_STAINED_GRAY_PANE_GLOWING.get(),
                "block/gray_stained_glass", "block/gray_stained_glass_pane_top");
        this.paneWithRenderType(GrowthcraftDecoBlocks.GLASS_STAINED_GREEN_PANE_GLOWING.get(),
                "block/green_stained_glass", "block/green_stained_glass_pane_top");
        this.paneWithRenderType(GrowthcraftDecoBlocks.GLASS_STAINED_LIGHT_BLUE_PANE_GLOWING.get(),
                "block/light_blue_stained_glass", "block/light_blue_stained_glass_pane_top");
        this.paneWithRenderType(GrowthcraftDecoBlocks.GLASS_STAINED_LIGHT_GRAY_PANE_GLOWING.get(),
                "block/light_gray_stained_glass", "block/light_gray_stained_glass_pane_top");
        this.paneWithRenderType(GrowthcraftDecoBlocks.GLASS_STAINED_LIME_PANE_GLOWING.get(),
                "block/lime_stained_glass", "block/lime_stained_glass_pane_top");
        this.paneWithRenderType(GrowthcraftDecoBlocks.GLASS_STAINED_MAGENTA_PANE_GLOWING.get(),
                "block/magenta_stained_glass", "block/magenta_stained_glass_pane_top");
        this.paneWithRenderType(GrowthcraftDecoBlocks.GLASS_STAINED_ORANGE_PANE_GLOWING.get(),
                "block/orange_stained_glass", "block/orange_stained_glass_pane_top");
        this.paneWithRenderType(GrowthcraftDecoBlocks.GLASS_STAINED_PINK_PANE_GLOWING.get(),
                "block/pink_stained_glass", "block/pink_stained_glass_pane_top");
        this.paneWithRenderType(GrowthcraftDecoBlocks.GLASS_STAINED_PURPLE_PANE_GLOWING.get(),
                "block/purple_stained_glass", "block/purple_stained_glass_pane_top");
        this.paneWithRenderType(GrowthcraftDecoBlocks.GLASS_STAINED_RED_PANE_GLOWING.get(),
                "block/red_stained_glass", "block/red_stained_glass_pane_top");
        this.paneWithRenderType(GrowthcraftDecoBlocks.GLASS_STAINED_WHITE_PANE_GLOWING.get(),
                "block/white_stained_glass", "block/white_stained_glass_pane_top");
        this.paneWithRenderType(GrowthcraftDecoBlocks.GLASS_STAINED_YELLOW_PANE_GLOWING.get(),
                "block/yellow_stained_glass", "block/yellow_stained_glass_pane_top");
    }

    private void clonedSimpleBlocks() {
        // Glowing Variants for Vanilla Blocks
        GrowthcraftDecoBlocks.GLOWING_VANILLA_BLOCK_STATE_MAP.forEach((blockRegistryObject, resourceLocation) -> {
            blockWithExistingModel(blockRegistryObject.get(), resourceLocation);
        });

        // Glowing Variants for Vanilla Stairs
        GrowthcraftDecoBlocks.GLOWING_STAIR_BLOCKS_STATE_MAP.forEach((blockRegistryObject, resourceLocation) -> {
            stairsBlock((StairBlock) blockRegistryObject.get(), resourceLocation);
        });

        // Hidden Door Variants for Vanilla Blocks
        GrowthcraftDecoBlocks.HIDDEN_DOOR_VANILLA_BLOCK_STATE_MAP.forEach(((blockRegistryObject, resourceLocation) -> {
            // Generate the Block Models needed for the door block
            doorBlock((DoorBlock) blockRegistryObject.get(), resourceLocation, resourceLocation);
        }));
    }

    private void slabs() {
        //slabBlock(GrowthcraftDecoBlocks.SLAB_GLASS_BLACK.get(), mcLoc());
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(
                blockRegistryObject.get(),
                cubeAll(blockRegistryObject.get())
        );
    }

    private void glowingVanillaBlocksWithExistingModel(String unlocalizedName, String namespace, String modelPath) {
        blockWithExistingModel(GrowthcraftDecoBlocks.GLOWING_VANILLA_BLOCKS.get(unlocalizedName).get(), namespace, modelPath);
    }

    private void blockWithExistingModel(Block block, String namespace, String modelPath) {
        // TODO: Make a generic data gen to use an existing blocks blockstate model.
        ResourceLocation modelLocation = ResourceLocation.fromNamespaceAndPath(namespace, modelPath);
        blockWithExistingModel(block, modelLocation);
    }

    private void blockWithExistingModel(Block block, ResourceLocation modelLocation) {
        simpleBlock(block, models().getExistingFile(modelLocation));
        simpleBlockItem(block, models().getExistingFile(modelLocation));
    }

    private void paneWithRenderType(Block block, String pane, String edge) {
        paneBlockWithRenderType(
                (IronBarsBlock) block,
                key(block).toString(),
                ResourceLocation.withDefaultNamespace(pane),
                ResourceLocation.withDefaultNamespace(edge),
                ResourceLocation.withDefaultNamespace("translucent")
        );
    }

    private void carpetStairs(Block block, ResourceLocation modelLocation) {
        this.stairsBlock((StairBlock) block,
                new ModelFile.UncheckedModelFile(
                        ResourceLocation.fromNamespaceAndPath(Reference.MODID,
                                "block/stairs/".concat(modelLocation.getPath())
                        )
                ),
                new ModelFile.UncheckedModelFile(
                        ResourceLocation.fromNamespaceAndPath(Reference.MODID,
                                "block/stairs/".concat(modelLocation.getPath()).concat("_inner")
                        )
                ),
                new ModelFile.UncheckedModelFile(
                        ResourceLocation.fromNamespaceAndPath(Reference.MODID,
                                "block/stairs/".concat(modelLocation.getPath()).concat("_outer")
                        )
                )
        );
    }

    private void carpetStairs(Block block, String baseName, String color) {

        this.stairsBlock((StairBlock) block,
                new ModelFile.UncheckedModelFile(
                        ResourceLocation.fromNamespaceAndPath(Reference.MODID,
                                String.format("block/stairs/stairs_%s_carpet_%s", baseName, color))
                ),
                new ModelFile.UncheckedModelFile(
                        ResourceLocation.fromNamespaceAndPath(Reference.MODID,
                                String.format("block/stairs/stairs_%s_carpet_%s_inner", baseName, color))
                ),
                new ModelFile.UncheckedModelFile(
                        ResourceLocation.fromNamespaceAndPath(Reference.MODID,
                                String.format("block/stairs/stairs_%s_carpet_%s_outer", baseName, color))
                )
        );


    }

    private ResourceLocation key(Block block) {
        return ForgeRegistries.BLOCKS.getKey(block);
    }
}
