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
        this.glowingBlocks();
        this.simpleBlockItems();
        this.variantStairBlockItems();
        this.variantDoorBlockItems();
    }

    private void glowingBlocks() {
        //this.simpleBlockItem(GrowthcraftDecoBlocks.STAIR_ACACIA_GLOWING, Blocks.ACACIA_STAIRS);
        //this.simpleBlockItem(GrowthcraftDecoBlocks.STAIR_ANDESITE_GLOWING, Blocks.ANDESITE_STAIRS);
        //this.simpleBlockItem(GrowthcraftDecoBlocks.STAIR_BAMBOO_GLOWING, Blocks.BAMBOO_STAIRS);
        //this.simpleBlockItem(GrowthcraftDecoBlocks.STAIR_BAMBOO_MOSAIC_GLOWING, Blocks.BAMBOO_MOSAIC_STAIRS);
        //this.simpleBlockItem(GrowthcraftDecoBlocks.STAIR_BIRCH_GLOWING, Blocks.BIRCH_STAIRS);
        //this.simpleBlockItem(GrowthcraftDecoBlocks.STAIR_BLACKSTONE_GLOWING, Blocks.BLACKSTONE_STAIRS);
        this.simpleBlockItem(GrowthcraftDecoBlocks.STAIR_BRICK_GLOWING, Blocks.BRICK_STAIRS);
        this.simpleBlockItem(GrowthcraftDecoBlocks.STAIR_COBBLED_DEEPSLATE_GLOWING, Blocks.COBBLED_DEEPSLATE_STAIRS);
        this.simpleBlockItem(GrowthcraftDecoBlocks.STAIR_COBBLESTONE_GLOWING, Blocks.COBBLESTONE_STAIRS);
        this.simpleBlockItem(GrowthcraftDecoBlocks.STAIR_CRIMSON_GLOWING, Blocks.CRIMSON_STAIRS);
        this.simpleBlockItem(GrowthcraftDecoBlocks.STAIR_CUT_COPPER_GLOWING, Blocks.CUT_COPPER_STAIRS);
        //this.simpleBlockItem(GrowthcraftDecoBlocks.STAIR_DARK_OAK_GLOWING, Blocks.DARK_OAK_STAIRS);
        //this.simpleBlockItem(GrowthcraftDecoBlocks.STAIR_DARK_PRISMARINE_GLOWING, Blocks.DARK_PRISMARINE_STAIRS);
        //this.simpleBlockItem(GrowthcraftDecoBlocks.STAIR_DEEPSLATE_BRICK_GLOWING, Blocks.DEEPSLATE_BRICK_STAIRS);
        //this.simpleBlockItem(GrowthcraftDecoBlocks.STAIR_DEEPSLATE_TILE_GLOWING, Blocks.DEEPSLATE_TILE_STAIRS);
        this.simpleBlockItem(GrowthcraftDecoBlocks.STAIR_DIORITE_GLOWING, Blocks.DIORITE_STAIRS);
        this.simpleBlockItem(GrowthcraftDecoBlocks.STAIR_END_STONE_BRICK_GLOWING, Blocks.END_STONE_BRICK_STAIRS);
        this.simpleBlockItem(GrowthcraftDecoBlocks.STAIR_EXPOSED_CUT_COPPER_GLOWING, Blocks.EXPOSED_CUT_COPPER_STAIRS);
        this.simpleBlockItem(GrowthcraftDecoBlocks.STAIR_GRANITE_GLOWING, Blocks.GRANITE_STAIRS);
        this.simpleBlockItem(GrowthcraftDecoBlocks.STAIR_JUNGLE_GLOWING, Blocks.JUNGLE_STAIRS);
        this.simpleBlockItem(GrowthcraftDecoBlocks.STAIR_MANGROVE_GLOWING, Blocks.MANGROVE_STAIRS);
        this.simpleBlockItem(GrowthcraftDecoBlocks.STAIR_MOSSY_COBBLESTONE_GLOWING, Blocks.MOSSY_COBBLESTONE_STAIRS);
        this.simpleBlockItem(GrowthcraftDecoBlocks.STAIR_MOSSY_STONE_BRICK_GLOWING, Blocks.MOSSY_STONE_BRICK_STAIRS);
        this.simpleBlockItem(GrowthcraftDecoBlocks.STAIR_MUD_BRICK_GLOWING, Blocks.MUD_BRICK_STAIRS);
        this.simpleBlockItem(GrowthcraftDecoBlocks.STAIR_NETHER_BRICK_GLOWING, Blocks.NETHER_BRICK_STAIRS);
        this.simpleBlockItem(GrowthcraftDecoBlocks.STAIR_OAK_GLOWING, Blocks.OAK_STAIRS);
        this.simpleBlockItem(GrowthcraftDecoBlocks.STAIR_OXIDIZED_CUT_COPPER_GLOWING, Blocks.OXIDIZED_CUT_COPPER_STAIRS);
        this.simpleBlockItem(GrowthcraftDecoBlocks.STAIR_POLISHED_ANDESITE_GLOWING, Blocks.POLISHED_ANDESITE_STAIRS);
        this.simpleBlockItem(GrowthcraftDecoBlocks.STAIR_POLISHED_BLACKSTONE_GLOWING, Blocks.POLISHED_BLACKSTONE_STAIRS);
        this.simpleBlockItem(GrowthcraftDecoBlocks.STAIR_POLISHED_BLACKSTONE_BRICK_GLOWING, Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS);
        this.simpleBlockItem(GrowthcraftDecoBlocks.STAIR_POLISHED_DEEPSLATE_GLOWING, Blocks.POLISHED_DEEPSLATE_STAIRS);
        this.simpleBlockItem(GrowthcraftDecoBlocks.STAIR_POLISHED_DIORITE_GLOWING, Blocks.POLISHED_DIORITE_STAIRS);
        this.simpleBlockItem(GrowthcraftDecoBlocks.STAIR_POLISHED_GRANITE_GLOWING, Blocks.POLISHED_GRANITE_STAIRS);
        this.simpleBlockItem(GrowthcraftDecoBlocks.STAIR_PRISMARINE_BRICK_GLOWING, Blocks.PRISMARINE_BRICK_STAIRS);
        this.simpleBlockItem(GrowthcraftDecoBlocks.STAIR_PRISMARINE_GLOWING, Blocks.PRISMARINE_STAIRS);
        this.simpleBlockItem(GrowthcraftDecoBlocks.STAIR_PURPUR_GLOWING, Blocks.PURPUR_STAIRS);
        this.simpleBlockItem(GrowthcraftDecoBlocks.STAIR_QUARTZ_GLOWING, Blocks.QUARTZ_STAIRS);
        this.simpleBlockItem(GrowthcraftDecoBlocks.STAIR_RED_NETHER_BRICK_GLOWING, Blocks.RED_NETHER_BRICK_STAIRS);
        this.simpleBlockItem(GrowthcraftDecoBlocks.STAIR_RED_SANDSTONE_GLOWING, Blocks.RED_SANDSTONE_STAIRS);
        this.simpleBlockItem(GrowthcraftDecoBlocks.STAIR_SANDSTONE_GLOWING, Blocks.SANDSTONE_STAIRS);
        this.simpleBlockItem(GrowthcraftDecoBlocks.STAIR_SMOOTH_QUARTZ_GLOWING, Blocks.SMOOTH_QUARTZ_STAIRS);
        this.simpleBlockItem(GrowthcraftDecoBlocks.STAIR_SMOOTH_RED_SANDSTONE_GLOWING, Blocks.SMOOTH_RED_SANDSTONE_STAIRS);
        this.simpleBlockItem(GrowthcraftDecoBlocks.STAIR_SMOOTH_SANDSTONE_GLOWING, Blocks.SMOOTH_RED_SANDSTONE_STAIRS);
        this.simpleBlockItem(GrowthcraftDecoBlocks.STAIR_SPRUCE_GLOWING, Blocks.SPRUCE_STAIRS);
        this.simpleBlockItem(GrowthcraftDecoBlocks.STAIR_STONE_BRICK_GLOWING, Blocks.STONE_BRICK_STAIRS);
        this.simpleBlockItem(GrowthcraftDecoBlocks.STAIR_STONE_GLOWING, Blocks.STONE_STAIRS);
        this.simpleBlockItem(GrowthcraftDecoBlocks.STAIR_WARPED_GLOWING, Blocks.WARPED_STAIRS);
        this.simpleBlockItem(GrowthcraftDecoBlocks.STAIR_WAXED_CUT_COPPER_GLOWING, Blocks.CUT_COPPER_STAIRS);
        this.simpleBlockItem(GrowthcraftDecoBlocks.STAIR_WAXED_EXPOSED_CUT_COPPER_GLOWING, Blocks.EXPOSED_CUT_COPPER_STAIRS);
        this.simpleBlockItem(GrowthcraftDecoBlocks.STAIR_WAXED_OXIDIZED_CUT_COPPER_GLOWING, Blocks.OXIDIZED_CUT_COPPER_STAIRS);
        this.simpleBlockItem(GrowthcraftDecoBlocks.STAIR_WAXED_WEATHERED_CUT_COPPER_GLOWING, Blocks.WEATHERED_CUT_COPPER_STAIRS);
        this.simpleBlockItem(GrowthcraftDecoBlocks.STAIR_WEATHERED_CUT_COPPER_GLOWING, Blocks.WEATHERED_CUT_COPPER_STAIRS);
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

    private void simpleBlockItems() {

    }

    private void variantStairBlockItems() {
        GrowthcraftDecoBlocks.GLOWING_STAIR_BLOCKS_STATE_MAP.forEach(((blockRegistryObject, resourceLocation) -> {
            simpleBlockItem(blockRegistryObject, blockRegistryObject.get());
        }));
    }

    private void variantDoorBlockItems() {
        GrowthcraftDecoBlocks.HIDDEN_DOOR_VANILLA_BLOCK_STATE_MAP.forEach(((blockRegistryObject, resourceLocation) -> {
            variantDoorBlockItem(blockRegistryObject, resourceLocation);
        }));
    }

    private ItemModelBuilder variantDoorBlockItem(RegistryObject<Block> block, ResourceLocation resourceLocation) {
        return this.getBuilder(block.getId().getPath())
                .parent(getExistingFile(new ResourceLocation(Reference.MODID, "item/template_hidden_door")))
                .texture("layer0", resourceLocation)
                .texture("particle", resourceLocation);
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> block, Block mirroredBlock) {
        return simpleBlockItem(block, ForgeRegistries.BLOCKS.getKey(mirroredBlock));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> block, ResourceLocation parentBlockModel) {
        return withExistingParent(block.getId().getPath(), parentBlockModel.getNamespace() + ":block/" + parentBlockModel.getPath());
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
