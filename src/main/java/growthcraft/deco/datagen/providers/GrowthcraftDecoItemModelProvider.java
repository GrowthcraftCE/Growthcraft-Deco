package growthcraft.deco.datagen.providers;

import growthcraft.deco.init.GrowthcraftDecoBlocks;
import growthcraft.deco.shared.Reference;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

/**
 * @credit Kaupenjoe for his DataGenerator tutorials
 */
public class GrowthcraftDecoItemModelProvider extends ItemModelProvider {

    public GrowthcraftDecoItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Reference.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        //simpleItem(ModItems.BLACK_OPAL);
        this.glassPanes();
    }

    private void glassPanes() {
        this.translucentPaneBlockItem(GrowthcraftDecoBlocks.GLASS_STAINED_BLACK_PANE_GLOWING, Blocks.BLACK_STAINED_GLASS);
        this.translucentPaneBlockItem(GrowthcraftDecoBlocks.GLASS_STAINED_BLUE_PANE_GLOWING, Blocks.BLACK_STAINED_GLASS);
        this.translucentPaneBlockItem(GrowthcraftDecoBlocks.GLASS_STAINED_BROWN_PANE_GLOWING, Blocks.BROWN_STAINED_GLASS);
        this.translucentPaneBlockItem(GrowthcraftDecoBlocks.GLASS_STAINED_CLEAR_PANE_GLOWING, Blocks.GLASS);
        this.translucentPaneBlockItem(GrowthcraftDecoBlocks.GLASS_STAINED_CYAN_PANE_GLOWING, Blocks.CYAN_STAINED_GLASS);
        this.translucentPaneBlockItem(GrowthcraftDecoBlocks.GLASS_STAINED_GRAY_PANE_GLOWING, Blocks.GRAY_STAINED_GLASS);
        this.translucentPaneBlockItem(GrowthcraftDecoBlocks.GLASS_STAINED_GREEN_PANE_GLOWING, Blocks.GREEN_STAINED_GLASS);
        this.translucentPaneBlockItem(GrowthcraftDecoBlocks.GLASS_STAINED_LIGHT_BLUE_PANE_GLOWING, Blocks.LIGHT_BLUE_STAINED_GLASS);
        this.translucentPaneBlockItem(GrowthcraftDecoBlocks.GLASS_STAINED_LIGHT_GRAY_PANE_GLOWING, Blocks.LIGHT_GRAY_STAINED_GLASS);
        this.translucentPaneBlockItem(GrowthcraftDecoBlocks.GLASS_STAINED_LIME_PANE_GLOWING, Blocks.LIME_STAINED_GLASS);
        this.translucentPaneBlockItem(GrowthcraftDecoBlocks.GLASS_STAINED_MAGENTA_PANE_GLOWING, Blocks.MAGENTA_STAINED_GLASS);
        this.translucentPaneBlockItem(GrowthcraftDecoBlocks.GLASS_STAINED_ORANGE_PANE_GLOWING, Blocks.ORANGE_STAINED_GLASS);
        this.translucentPaneBlockItem(GrowthcraftDecoBlocks.GLASS_STAINED_PINK_PANE_GLOWING, Blocks.PINK_STAINED_GLASS);
        this.translucentPaneBlockItem(GrowthcraftDecoBlocks.GLASS_STAINED_PURPLE_PANE_GLOWING, Blocks.PURPLE_STAINED_GLASS);
        this.translucentPaneBlockItem(GrowthcraftDecoBlocks.GLASS_STAINED_RED_PANE_GLOWING, Blocks.RED_STAINED_GLASS);
        this.translucentPaneBlockItem(GrowthcraftDecoBlocks.GLASS_STAINED_WHITE_PANE_GLOWING, Blocks.WHITE_STAINED_GLASS);
        this.translucentPaneBlockItem(GrowthcraftDecoBlocks.GLASS_STAINED_YELLOW_PANE_GLOWING, Blocks.YELLOW_STAINED_GLASS);

    }

    private ItemModelBuilder translucentPaneBlockItem(RegistryObject<Block> block) {
        return this.translucentPaneBlockItem(block, block.getId());
    }

    private ItemModelBuilder translucentPaneBlockItem(RegistryObject<Block> block, Block mirroredBlock) {
        return this.translucentPaneBlockItem(block, ForgeRegistries.BLOCKS.getKey(mirroredBlock));
    }

    private ItemModelBuilder translucentPaneBlockItem(RegistryObject<Block> block, ResourceLocation layer0) {
        return withExistingParent(block.getId().getPath(), new ResourceLocation("item/generated"))
                .renderType("translucent")
                .texture("layer0", layer0.getNamespace() + ":block/" + layer0.getPath());
    }

    private ItemModelBuilder saplingItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Reference.MODID, "block/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Reference.MODID, "item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(Reference.MODID, "item/" + item.getId().getPath()));
    }
}
