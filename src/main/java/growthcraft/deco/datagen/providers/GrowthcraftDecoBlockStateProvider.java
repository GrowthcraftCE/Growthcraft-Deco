package growthcraft.deco.datagen.providers;

import growthcraft.deco.GrowthcraftDeco;
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

import java.util.HashMap;

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
    }

    private void glassPanes() {
        this.paneWithRenderType(GrowthcraftDecoBlocks.GLASS_STAINED_BLACK_PANE_GLOWING.get(),
                "minecraft:block/black_stained_glass", "minecraft:block/black_stained_glass_pane_top");
        this.paneWithRenderType(GrowthcraftDecoBlocks.GLASS_STAINED_BLUE_PANE_GLOWING.get(),
                "minecraft:block/blue_stained_glass", "minecraft:block/blue_stained_glass_pane_top");
        this.paneWithRenderType(GrowthcraftDecoBlocks.GLASS_STAINED_BROWN_PANE_GLOWING.get(),
                "minecraft:block/brown_stained_glass", "minecraft:block/brown_stained_glass_pane_top");
        this.paneWithRenderType(GrowthcraftDecoBlocks.GLASS_STAINED_CLEAR_PANE_GLOWING.get(),
                "minecraft:block/glass", "minecraft:block/glass_pane_top");
        this.paneWithRenderType(GrowthcraftDecoBlocks.GLASS_STAINED_CYAN_PANE_GLOWING.get(),
                "minecraft:block/cyan_stained_glass", "minecraft:block/cyan_stained_glass_pane_top");
        this.paneWithRenderType(GrowthcraftDecoBlocks.GLASS_STAINED_GRAY_PANE_GLOWING.get(),
                "minecraft:block/gray_stained_glass", "minecraft:block/gray_stained_glass_pane_top");
        this.paneWithRenderType(GrowthcraftDecoBlocks.GLASS_STAINED_GREEN_PANE_GLOWING.get(),
                "minecraft:block/green_stained_glass", "minecraft:block/green_stained_glass_pane_top");
        this.paneWithRenderType(GrowthcraftDecoBlocks.GLASS_STAINED_LIGHT_BLUE_PANE_GLOWING.get(),
                "minecraft:block/light_blue_stained_glass", "minecraft:block/light_blue_stained_glass_pane_top");
        this.paneWithRenderType(GrowthcraftDecoBlocks.GLASS_STAINED_LIGHT_GRAY_PANE_GLOWING.get(),
                "minecraft:block/light_gray_stained_glass", "minecraft:block/light_gray_stained_glass_pane_top");
        this.paneWithRenderType(GrowthcraftDecoBlocks.GLASS_STAINED_LIME_PANE_GLOWING.get(),
                "minecraft:block/lime_stained_glass", "minecraft:block/lime_stained_glass_pane_top");
        this.paneWithRenderType(GrowthcraftDecoBlocks.GLASS_STAINED_MAGENTA_PANE_GLOWING.get(),
                "minecraft:block/magenta_stained_glass", "minecraft:block/magenta_stained_glass_pane_top");
        this.paneWithRenderType(GrowthcraftDecoBlocks.GLASS_STAINED_ORANGE_PANE_GLOWING.get(),
                "minecraft:block/orange_stained_glass", "minecraft:block/orange_stained_glass_pane_top");
        this.paneWithRenderType(GrowthcraftDecoBlocks.GLASS_STAINED_PINK_PANE_GLOWING.get(),
                "minecraft:block/pink_stained_glass", "minecraft:block/pink_stained_glass_pane_top");
        this.paneWithRenderType(GrowthcraftDecoBlocks.GLASS_STAINED_PURPLE_PANE_GLOWING.get(),
                "minecraft:block/purple_stained_glass", "minecraft:block/purple_stained_glass_pane_top");
        this.paneWithRenderType(GrowthcraftDecoBlocks.GLASS_STAINED_RED_PANE_GLOWING.get(),
                "minecraft:block/red_stained_glass", "minecraft:block/red_stained_glass_pane_top");
        this.paneWithRenderType(GrowthcraftDecoBlocks.GLASS_STAINED_WHITE_PANE_GLOWING.get(),
                "minecraft:block/white_stained_glass", "minecraft:block/white_stained_glass_pane_top");
        this.paneWithRenderType(GrowthcraftDecoBlocks.GLASS_STAINED_YELLOW_PANE_GLOWING.get(),
                "minecraft:block/yellow_stained_glass", "minecraft:block/yellow_stained_glass_pane_top");
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
        ResourceLocation modelLocation = new ResourceLocation(namespace, modelPath);
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
                new ResourceLocation(pane),
                new ResourceLocation(edge),
                new ResourceLocation("translucent")
        );
    }

    private ResourceLocation key(Block block) {
        return ForgeRegistries.BLOCKS.getKey(block);
    }
}
