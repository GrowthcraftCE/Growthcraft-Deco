package growthcraft.deco.datagen.providers;

import growthcraft.deco.init.GrowthcraftDecoBlocks;
import growthcraft.deco.shared.Reference;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
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

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(
                blockRegistryObject.get(),
                cubeAll(blockRegistryObject.get())
        );
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
