package growthcraft.deco.datagen.providers;

import growthcraft.deco.init.GrowthcraftDecoBlocks;
import growthcraft.deco.init.GrowthcraftDecoTags;
import growthcraft.deco.shared.Reference;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

/**
 * @credit Kaupenjoe for his DataGenerator tutorials
 */
public class GrowthcraftDecoRecipeProvider extends RecipeProvider implements IConditionBuilder {


    public GrowthcraftDecoRecipeProvider(PackOutput packOutput) {
        super(packOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> recipeConsumer) {
        this.carpetedStairsRecipes(recipeConsumer);
        this.glowingRecipes(recipeConsumer);
        this.partialCarpetedStairsRecipes(recipeConsumer);
        this.slabRecipes(recipeConsumer);
        this.stairRecipes(recipeConsumer);
        this.stoneCuttingRecipes(recipeConsumer);
    }

    private void stoneCuttingRecipes(Consumer<FinishedRecipe> recipeConsumer) {
        this.buildStonecuttingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIRS_CONCRETE_BLACK.get(), Blocks.BLACK_CONCRETE, 1);
        this.buildStonecuttingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIRS_CONCRETE_BLUE.get(), Blocks.BLUE_CONCRETE, 1);
        this.buildStonecuttingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIRS_CONCRETE_BROWN.get(), Blocks.BROWN_CONCRETE, 1);
        this.buildStonecuttingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIRS_CONCRETE_CYAN.get(), Blocks.CYAN_CONCRETE, 1);
        this.buildStonecuttingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIRS_CONCRETE_GRAY.get(), Blocks.GRAY_CONCRETE, 1);
        this.buildStonecuttingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIRS_CONCRETE_GREEN.get(), Blocks.GREEN_CONCRETE, 1);
        this.buildStonecuttingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIRS_CONCRETE_LIGHT_BLUE.get(), Blocks.LIGHT_BLUE_CONCRETE, 1);
        this.buildStonecuttingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIRS_CONCRETE_LIGHT_GRAY.get(), Blocks.LIGHT_GRAY_CONCRETE, 1);
        this.buildStonecuttingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIRS_CONCRETE_LIME.get(), Blocks.LIME_CONCRETE, 1);
        this.buildStonecuttingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIRS_CONCRETE_MAGENTA.get(), Blocks.MAGENTA_CONCRETE, 1);
        this.buildStonecuttingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIRS_CONCRETE_ORANGE.get(), Blocks.ORANGE_CONCRETE, 1);
        this.buildStonecuttingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIRS_CONCRETE_PINK.get(), Blocks.PINK_CONCRETE, 1);
        this.buildStonecuttingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIRS_CONCRETE_PURPLE.get(), Blocks.PURPLE_CONCRETE, 1);
        this.buildStonecuttingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIRS_CONCRETE_RED.get(), Blocks.RED_CONCRETE, 1);
        this.buildStonecuttingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIRS_CONCRETE_WHITE.get(), Blocks.WHITE_CONCRETE, 1);
        this.buildStonecuttingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIRS_CONCRETE_YELLOW.get(), Blocks.YELLOW_CONCRETE, 1);
        this.buildStonecuttingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIRS_TERRACOTTA_BLACK.get(), Blocks.BLACK_TERRACOTTA, 1);
        this.buildStonecuttingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIRS_TERRACOTTA_BLUE.get(), Blocks.BLUE_TERRACOTTA, 1);
        this.buildStonecuttingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIRS_TERRACOTTA_BROWN.get(), Blocks.BROWN_TERRACOTTA, 1);
        this.buildStonecuttingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIRS_TERRACOTTA_CYAN.get(), Blocks.CYAN_TERRACOTTA, 1);
        this.buildStonecuttingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIRS_TERRACOTTA_GRAY.get(), Blocks.GRAY_TERRACOTTA, 1);
        this.buildStonecuttingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIRS_TERRACOTTA_GREEN.get(), Blocks.GREEN_TERRACOTTA, 1);
        this.buildStonecuttingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIRS_TERRACOTTA_LIGHT_BLUE.get(), Blocks.LIGHT_BLUE_TERRACOTTA, 1);
        this.buildStonecuttingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIRS_TERRACOTTA_LIGHT_GRAY.get(), Blocks.LIGHT_GRAY_TERRACOTTA, 1);
        this.buildStonecuttingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIRS_TERRACOTTA_LIME.get(), Blocks.LIME_TERRACOTTA, 1);
        this.buildStonecuttingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIRS_TERRACOTTA_MAGENTA.get(), Blocks.MAGENTA_TERRACOTTA, 1);
        this.buildStonecuttingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIRS_TERRACOTTA_ORANGE.get(), Blocks.ORANGE_TERRACOTTA, 1);
        this.buildStonecuttingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIRS_TERRACOTTA_PINK.get(), Blocks.PINK_TERRACOTTA, 1);
        this.buildStonecuttingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIRS_TERRACOTTA_PURPLE.get(), Blocks.PURPLE_TERRACOTTA, 1);
        this.buildStonecuttingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIRS_TERRACOTTA_RED.get(), Blocks.RED_TERRACOTTA, 1);
        this.buildStonecuttingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIRS_TERRACOTTA_WHITE.get(), Blocks.WHITE_TERRACOTTA, 1);
        this.buildStonecuttingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIRS_TERRACOTTA_YELLOW.get(), Blocks.YELLOW_TERRACOTTA, 1);
    }

    private void slabRecipes(Consumer<FinishedRecipe> recipeConsumer) {
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_BLACK.get(), GrowthcraftDecoBlocks.SLAB_GLASS_BLACK.get());
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_BLACK_GLOWING.get(), GrowthcraftDecoBlocks.SLAB_GLASS_BLACK_GLOWING.get(), "from_slab");
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_BLUE.get(), GrowthcraftDecoBlocks.SLAB_GLASS_BLUE.get());
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_BLUE_GLOWING.get(), GrowthcraftDecoBlocks.SLAB_GLASS_BLUE_GLOWING.get(), "from_slab");
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_BROWN.get(), GrowthcraftDecoBlocks.SLAB_GLASS_BROWN.get());
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_BROWN_GLOWING.get(), GrowthcraftDecoBlocks.SLAB_GLASS_BROWN_GLOWING.get(), "from_slab");
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_CLEAR.get(), GrowthcraftDecoBlocks.SLAB_GLASS_CLEAR.get());
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_CLEAR_GLOWING.get(), GrowthcraftDecoBlocks.SLAB_GLASS_CLEAR_GLOWING.get(), "from_slab");
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_CYAN.get(), GrowthcraftDecoBlocks.SLAB_GLASS_CYAN.get());
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_CYAN_GLOWING.get(), GrowthcraftDecoBlocks.SLAB_GLASS_CYAN_GLOWING.get(), "from_slab");
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_GRAY.get(), GrowthcraftDecoBlocks.SLAB_GLASS_GRAY.get());
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_GRAY_GLOWING.get(), GrowthcraftDecoBlocks.SLAB_GLASS_GRAY_GLOWING.get(), "from_slab");
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_GREEN.get(), GrowthcraftDecoBlocks.SLAB_GLASS_GREEN.get());
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_GREEN_GLOWING.get(), GrowthcraftDecoBlocks.SLAB_GLASS_GREEN_GLOWING.get(), "from_slab");
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_LIGHT_BLUE.get(), GrowthcraftDecoBlocks.SLAB_GLASS_LIGHT_BLUE.get());
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_LIGHT_BLUE_GLOWING.get(), GrowthcraftDecoBlocks.SLAB_GLASS_LIGHT_BLUE_GLOWING.get(), "from_slab");
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_LIGHT_GRAY.get(), GrowthcraftDecoBlocks.SLAB_GLASS_LIGHT_GRAY.get());
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_LIGHT_GRAY_GLOWING.get(), GrowthcraftDecoBlocks.SLAB_GLASS_LIGHT_GRAY_GLOWING.get(), "from_slab");
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_LIME.get(), GrowthcraftDecoBlocks.SLAB_GLASS_LIME.get());
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_LIME_GLOWING.get(), GrowthcraftDecoBlocks.SLAB_GLASS_LIME_GLOWING.get(), "from_slab");
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_MAGENTA.get(), GrowthcraftDecoBlocks.SLAB_GLASS_MAGENTA.get());
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_MAGENTA_GLOWING.get(), GrowthcraftDecoBlocks.SLAB_GLASS_MAGENTA_GLOWING.get(), "from_slab");
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_ORANGE.get(), GrowthcraftDecoBlocks.SLAB_GLASS_ORANGE.get());
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_ORANGE_GLOWING.get(), GrowthcraftDecoBlocks.SLAB_GLASS_ORANGE_GLOWING.get(), "from_slab");
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_PINK.get(), GrowthcraftDecoBlocks.SLAB_GLASS_PINK.get());
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_PINK_GLOWING.get(), GrowthcraftDecoBlocks.SLAB_GLASS_PINK_GLOWING.get(), "from_slab");
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_PURPLE.get(), GrowthcraftDecoBlocks.SLAB_GLASS_PURPLE.get());
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_PURPLE_GLOWING.get(), GrowthcraftDecoBlocks.SLAB_GLASS_PURPLE_GLOWING.get(), "from_slab");
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_RED.get(), GrowthcraftDecoBlocks.SLAB_GLASS_RED.get());
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_RED_GLOWING.get(), GrowthcraftDecoBlocks.SLAB_GLASS_RED_GLOWING.get(), "from_slab");
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_WHITE.get(), GrowthcraftDecoBlocks.SLAB_GLASS_WHITE.get());
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_WHITE_GLOWING.get(), GrowthcraftDecoBlocks.SLAB_GLASS_WHITE_GLOWING.get(), "from_slab");
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_YELLOW.get(), GrowthcraftDecoBlocks.SLAB_GLASS_YELLOW.get());
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_YELLOW_GLOWING.get(), GrowthcraftDecoBlocks.SLAB_GLASS_YELLOW_GLOWING.get(), "from_slab");
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.PANEL_GLOWSHROOM.get(), GrowthcraftDecoBlocks.SLAB_GLOWSHROOM.get());
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.PANEL_GLOWSTONE.get(), GrowthcraftDecoBlocks.SLAB_GLOWSTONE.get());
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.SLAB_GLASS_BLACK.get(), Blocks.BLACK_STAINED_GLASS);
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.SLAB_GLASS_BLUE.get(), Blocks.BLUE_STAINED_GLASS);
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.SLAB_GLASS_BROWN.get(), Blocks.BROWN_STAINED_GLASS);
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.SLAB_GLASS_CLEAR.get(), Blocks.GLASS);
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.SLAB_GLASS_CYAN.get(), Blocks.CYAN_STAINED_GLASS);
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.SLAB_GLASS_GRAY.get(), Blocks.GRAY_STAINED_GLASS);
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.SLAB_GLASS_GREEN.get(), Blocks.GREEN_STAINED_GLASS);
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.SLAB_GLASS_LIGHT_BLUE.get(), Blocks.LIGHT_BLUE_STAINED_GLASS);
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.SLAB_GLASS_LIGHT_GRAY.get(), Blocks.LIGHT_GRAY_STAINED_GLASS);
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.SLAB_GLASS_LIME.get(), Blocks.LIME_STAINED_GLASS);
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.SLAB_GLASS_MAGENTA.get(), Blocks.MAGENTA_STAINED_GLASS);
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.SLAB_GLASS_ORANGE.get(), Blocks.ORANGE_STAINED_GLASS);
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.SLAB_GLASS_PINK.get(), Blocks.PINK_STAINED_GLASS);
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.SLAB_GLASS_PURPLE.get(), Blocks.PURPLE_STAINED_GLASS);
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.SLAB_GLASS_RED.get(), Blocks.RED_STAINED_GLASS);
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.SLAB_GLASS_WHITE.get(), Blocks.WHITE_STAINED_GLASS);
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.SLAB_GLASS_YELLOW.get(), Blocks.YELLOW_STAINED_GLASS);
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.SLAB_GLOWSHROOM.get(), Blocks.SHROOMLIGHT);
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.SLAB_GLOWSTONE.get(), Blocks.GLOWSTONE);
    }

    private void stairRecipes(Consumer<FinishedRecipe> recipeConsumer) {
        this.buildStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_WOOL_BLACK.get(), Blocks.BLACK_WOOL);
        this.buildStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_WOOL_BLUE.get(), Blocks.BLUE_WOOL);
        this.buildStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_WOOL_BROWN.get(), Blocks.BROWN_WOOL);
        this.buildStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_WOOL_CYAN.get(), Blocks.CYAN_WOOL);
        this.buildStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_WOOL_GRAY.get(), Blocks.GRAY_WOOL);
        this.buildStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_WOOL_GREEN.get(), Blocks.GREEN_WOOL);
        this.buildStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_WOOL_LIGHT_BLUE.get(), Blocks.LIGHT_BLUE_WOOL);
        this.buildStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_WOOL_LIGHT_GRAY.get(), Blocks.LIGHT_GRAY_WOOL);
        this.buildStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_WOOL_LIME.get(), Blocks.LIME_WOOL);
        this.buildStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_WOOL_MAGENTA.get(), Blocks.MAGENTA_WOOL);
        this.buildStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_WOOL_ORANGE.get(), Blocks.ORANGE_WOOL);
        this.buildStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_WOOL_PINK.get(), Blocks.PINK_WOOL);
        this.buildStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_WOOL_PURPLE.get(), Blocks.PURPLE_WOOL);
        this.buildStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_WOOL_RED.get(), Blocks.RED_WOOL);
        this.buildStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_WOOL_WHITE.get(), Blocks.WHITE_WOOL);
        this.buildStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_WOOL_YELLOW.get(), Blocks.YELLOW_WOOL);

    }

    private void glowingRecipes(Consumer<FinishedRecipe> recipeConsumer) {

        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_STAINED_BLACK_PANE_GLOWING.get(), Blocks.BLACK_STAINED_GLASS_PANE);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_STAINED_BLUE_PANE_GLOWING.get(), Blocks.BLUE_STAINED_GLASS_PANE);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_STAINED_BROWN_PANE_GLOWING.get(), Blocks.BROWN_STAINED_GLASS_PANE);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_STAINED_CLEAR_PANE_GLOWING.get(), Blocks.GLASS_PANE);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_STAINED_CYAN_PANE_GLOWING.get(), Blocks.CYAN_STAINED_GLASS_PANE);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_STAINED_GRAY_PANE_GLOWING.get(), Blocks.GRAY_STAINED_GLASS_PANE);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_STAINED_GREEN_PANE_GLOWING.get(), Blocks.GREEN_STAINED_GLASS_PANE);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_STAINED_LIGHT_BLUE_PANE_GLOWING.get(), Blocks.LIGHT_BLUE_STAINED_GLASS_PANE);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_STAINED_LIGHT_GRAY_PANE_GLOWING.get(), Blocks.LIGHT_GRAY_STAINED_GLASS_PANE);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_STAINED_LIME_PANE_GLOWING.get(), Blocks.LIME_STAINED_GLASS_PANE);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_STAINED_MAGENTA_PANE_GLOWING.get(), Blocks.MAGENTA_STAINED_GLASS_PANE);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_STAINED_ORANGE_PANE_GLOWING.get(), Blocks.ORANGE_STAINED_GLASS_PANE);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_STAINED_PINK_PANE_GLOWING.get(), Blocks.PINK_STAINED_GLASS_PANE);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_STAINED_PURPLE_PANE_GLOWING.get(), Blocks.PURPLE_STAINED_GLASS_PANE);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_STAINED_RED_PANE_GLOWING.get(), Blocks.RED_STAINED_GLASS_PANE);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_STAINED_WHITE_PANE_GLOWING.get(), Blocks.WHITE_STAINED_GLASS_PANE);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_STAINED_YELLOW_PANE_GLOWING.get(), Blocks.YELLOW_STAINED_GLASS_PANE);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.SLAB_GLASS_BLACK_GLOWING.get(), GrowthcraftDecoBlocks.SLAB_GLASS_BLACK.get());
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.SLAB_GLASS_BLUE_GLOWING.get(), GrowthcraftDecoBlocks.SLAB_GLASS_BLUE.get());
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.SLAB_GLASS_BROWN_GLOWING.get(), GrowthcraftDecoBlocks.SLAB_GLASS_BROWN.get());
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.SLAB_GLASS_CLEAR_GLOWING.get(), GrowthcraftDecoBlocks.SLAB_GLASS_CLEAR.get());
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.SLAB_GLASS_CYAN_GLOWING.get(), GrowthcraftDecoBlocks.SLAB_GLASS_CYAN.get());
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.SLAB_GLASS_GRAY_GLOWING.get(), GrowthcraftDecoBlocks.SLAB_GLASS_GRAY.get());
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.SLAB_GLASS_GREEN_GLOWING.get(), GrowthcraftDecoBlocks.SLAB_GLASS_GREEN.get());
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.SLAB_GLASS_LIGHT_BLUE_GLOWING.get(), GrowthcraftDecoBlocks.SLAB_GLASS_LIGHT_BLUE.get());
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.SLAB_GLASS_LIGHT_GRAY_GLOWING.get(), GrowthcraftDecoBlocks.SLAB_GLASS_LIGHT_GRAY.get());
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.SLAB_GLASS_LIME_GLOWING.get(), GrowthcraftDecoBlocks.SLAB_GLASS_LIME.get());
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.SLAB_GLASS_MAGENTA_GLOWING.get(), GrowthcraftDecoBlocks.SLAB_GLASS_MAGENTA.get());
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.SLAB_GLASS_ORANGE_GLOWING.get(), GrowthcraftDecoBlocks.SLAB_GLASS_ORANGE.get());
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.SLAB_GLASS_PINK_GLOWING.get(), GrowthcraftDecoBlocks.SLAB_GLASS_PINK.get());
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.SLAB_GLASS_PURPLE_GLOWING.get(), GrowthcraftDecoBlocks.SLAB_GLASS_PURPLE.get());
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.SLAB_GLASS_RED_GLOWING.get(), GrowthcraftDecoBlocks.SLAB_GLASS_RED.get());
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.SLAB_GLASS_WHITE_GLOWING.get(), GrowthcraftDecoBlocks.SLAB_GLASS_WHITE.get());
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.SLAB_GLASS_YELLOW_GLOWING.get(), GrowthcraftDecoBlocks.SLAB_GLASS_YELLOW.get());
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_ACACIA_GLOWING.get(), Blocks.ACACIA_STAIRS);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_ANDESITE_GLOWING.get(), Blocks.ANDESITE_STAIRS);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_BIRCH_GLOWING.get(), Blocks.BIRCH_STAIRS);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_BLACKSTONE_GLOWING.get(), Blocks.BLACKSTONE_STAIRS);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_BRICK_GLOWING.get(), Blocks.BRICK_STAIRS);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_COBBLED_DEEPSLATE_GLOWING.get(), Blocks.COBBLED_DEEPSLATE_STAIRS);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_COBBLESTONE_GLOWING.get(), Blocks.COBBLESTONE_STAIRS);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_CRIMSON_GLOWING.get(), Blocks.CRIMSON_STAIRS);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_CUT_COPPER_GLOWING.get(), Blocks.CUT_COPPER_STAIRS);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_DARK_OAK_GLOWING.get(), Blocks.DARK_OAK_STAIRS);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_DARK_PRISMARINE_GLOWING.get(), Blocks.DARK_PRISMARINE_STAIRS);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_DEEPSLATE_BRICK_GLOWING.get(), Blocks.DEEPSLATE_BRICK_STAIRS);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_DEEPSLATE_TILE_GLOWING.get(), Blocks.DEEPSLATE_TILE_STAIRS);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_DIORITE_GLOWING.get(), Blocks.DIORITE_STAIRS);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_END_STONE_BRICK_GLOWING.get(), Blocks.END_STONE_BRICK_STAIRS);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_EXPOSED_CUT_COPPER_GLOWING.get(), Blocks.EXPOSED_CUT_COPPER_STAIRS);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_GRANITE_GLOWING.get(), Blocks.GRANITE_STAIRS);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_JUNGLE_GLOWING.get(), Blocks.JUNGLE_STAIRS);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_MANGROVE_GLOWING.get(), Blocks.MANGROVE_STAIRS);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_MOSSY_COBBLESTONE_GLOWING.get(), Blocks.MOSSY_COBBLESTONE_STAIRS);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_MOSSY_STONE_BRICK_GLOWING.get(), Blocks.MOSSY_STONE_BRICK_STAIRS);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_MUD_BRICK_GLOWING.get(), Blocks.MUD_BRICK_STAIRS);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_NETHER_BRICK_GLOWING.get(), Blocks.NETHER_BRICK_STAIRS);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_OAK_GLOWING.get(), Blocks.OAK_STAIRS);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_OXIDIZED_CUT_COPPER_GLOWING.get(), Blocks.OXIDIZED_CUT_COPPER_STAIRS);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_POLISHED_ANDESITE_GLOWING.get(), Blocks.POLISHED_ANDESITE_STAIRS);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_POLISHED_BLACKSTONE_BRICK_GLOWING.get(), Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_POLISHED_BLACKSTONE_GLOWING.get(), Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_POLISHED_DEEPSLATE_GLOWING.get(), Blocks.POLISHED_DEEPSLATE_STAIRS);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_POLISHED_DIORITE_GLOWING.get(), Blocks.POLISHED_DIORITE_STAIRS);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_POLISHED_GRANITE_GLOWING.get(), Blocks.POLISHED_GRANITE_STAIRS);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_PRISMARINE_BRICK_GLOWING.get(), Blocks.PRISMARINE_BRICK_STAIRS);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_PRISMARINE_GLOWING.get(), Blocks.PRISMARINE_STAIRS);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_PURPUR_GLOWING.get(), Blocks.PURPUR_STAIRS);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_QUARTZ_GLOWING.get(), Blocks.QUARTZ_STAIRS);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_RED_NETHER_BRICK_GLOWING.get(), Blocks.RED_NETHER_BRICK_STAIRS);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_RED_SANDSTONE_GLOWING.get(), Blocks.RED_SANDSTONE_STAIRS);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_SMOOTH_QUARTZ_GLOWING.get(), Blocks.SMOOTH_QUARTZ_STAIRS);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_SMOOTH_RED_SANDSTONE_GLOWING.get(), Blocks.SMOOTH_RED_SANDSTONE_STAIRS);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_SMOOTH_SANDSTONE_GLOWING.get(), Blocks.SMOOTH_SANDSTONE_STAIRS);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_SPRUCE_GLOWING.get(), Blocks.SPRUCE_STAIRS);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_STONE_BRICK_GLOWING.get(), Blocks.STONE_BRICK_STAIRS);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_STONE_GLOWING.get(), Blocks.STONE_STAIRS);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_WARPED_GLOWING.get(), Blocks.WARPED_STAIRS);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_WAXED_CUT_COPPER_GLOWING.get(), Blocks.WAXED_CUT_COPPER_STAIRS);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_WAXED_EXPOSED_CUT_COPPER_GLOWING.get(), Blocks.WAXED_EXPOSED_CUT_COPPER_STAIRS);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_WAXED_OXIDIZED_CUT_COPPER_GLOWING.get(), Blocks.WAXED_OXIDIZED_CUT_COPPER_STAIRS);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_WAXED_WEATHERED_CUT_COPPER_GLOWING.get(), Blocks.WAXED_WEATHERED_CUT_COPPER_STAIRS);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_WEATHERED_CUT_COPPER_GLOWING.get(), Blocks.WEATHERED_CUT_COPPER_STAIRS);
    }

    private void carpetedStairsRecipes(Consumer<FinishedRecipe> recipeConsumer) {
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_ACACIA_CARPET_BLACK.get(), Blocks.ACACIA_STAIRS, Blocks.BLACK_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_ACACIA_CARPET_BLUE.get(), Blocks.ACACIA_STAIRS, Blocks.BLUE_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_ACACIA_CARPET_BROWN.get(), Blocks.ACACIA_STAIRS, Blocks.BROWN_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_ACACIA_CARPET_CYAN.get(), Blocks.ACACIA_STAIRS, Blocks.CYAN_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_ACACIA_CARPET_GRAY.get(), Blocks.ACACIA_STAIRS, Blocks.GRAY_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_ACACIA_CARPET_GREEN.get(), Blocks.ACACIA_STAIRS, Blocks.GREEN_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_ACACIA_CARPET_LIGHT_BLUE.get(), Blocks.ACACIA_STAIRS, Blocks.LIGHT_BLUE_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_ACACIA_CARPET_LIGHT_GRAY.get(), Blocks.ACACIA_STAIRS, Blocks.LIGHT_GRAY_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_ACACIA_CARPET_LIME.get(), Blocks.ACACIA_STAIRS, Blocks.LIME_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_ACACIA_CARPET_MAGENTA.get(), Blocks.ACACIA_STAIRS, Blocks.MAGENTA_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_ACACIA_CARPET_ORANGE.get(), Blocks.ACACIA_STAIRS, Blocks.ORANGE_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_ACACIA_CARPET_PINK.get(), Blocks.ACACIA_STAIRS, Blocks.PINK_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_ACACIA_CARPET_PURPLE.get(), Blocks.ACACIA_STAIRS, Blocks.PURPLE_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_ACACIA_CARPET_RED.get(), Blocks.ACACIA_STAIRS, Blocks.RED_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_ACACIA_CARPET_WHITE.get(), Blocks.ACACIA_STAIRS, Blocks.WHITE_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_ACACIA_CARPET_YELLOW.get(), Blocks.ACACIA_STAIRS, Blocks.YELLOW_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_BIRCH_CARPET_BLACK.get(), Blocks.BIRCH_STAIRS, Blocks.BLACK_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_BIRCH_CARPET_BLUE.get(), Blocks.BIRCH_STAIRS, Blocks.BLUE_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_BIRCH_CARPET_BROWN.get(), Blocks.BIRCH_STAIRS, Blocks.BROWN_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_BIRCH_CARPET_CYAN.get(), Blocks.BIRCH_STAIRS, Blocks.CYAN_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_BIRCH_CARPET_GRAY.get(), Blocks.BIRCH_STAIRS, Blocks.GRAY_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_BIRCH_CARPET_GREEN.get(), Blocks.BIRCH_STAIRS, Blocks.GREEN_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_BIRCH_CARPET_LIGHT_BLUE.get(), Blocks.BIRCH_STAIRS, Blocks.LIGHT_BLUE_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_BIRCH_CARPET_LIGHT_GRAY.get(), Blocks.BIRCH_STAIRS, Blocks.LIGHT_GRAY_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_BIRCH_CARPET_LIME.get(), Blocks.BIRCH_STAIRS, Blocks.LIME_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_BIRCH_CARPET_MAGENTA.get(), Blocks.BIRCH_STAIRS, Blocks.MAGENTA_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_BIRCH_CARPET_ORANGE.get(), Blocks.BIRCH_STAIRS, Blocks.ORANGE_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_BIRCH_CARPET_PINK.get(), Blocks.BIRCH_STAIRS, Blocks.PINK_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_BIRCH_CARPET_PURPLE.get(), Blocks.BIRCH_STAIRS, Blocks.PURPLE_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_BIRCH_CARPET_RED.get(), Blocks.BIRCH_STAIRS, Blocks.RED_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_BIRCH_CARPET_WHITE.get(), Blocks.BIRCH_STAIRS, Blocks.WHITE_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_BIRCH_CARPET_YELLOW.get(), Blocks.BIRCH_STAIRS, Blocks.YELLOW_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_CRIMSON_CARPET_BLACK.get(), Blocks.CRIMSON_STAIRS, Blocks.BLACK_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_CRIMSON_CARPET_BLUE.get(), Blocks.CRIMSON_STAIRS, Blocks.BLUE_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_CRIMSON_CARPET_BROWN.get(), Blocks.CRIMSON_STAIRS, Blocks.BROWN_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_CRIMSON_CARPET_CYAN.get(), Blocks.CRIMSON_STAIRS, Blocks.CYAN_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_CRIMSON_CARPET_GRAY.get(), Blocks.CRIMSON_STAIRS, Blocks.GRAY_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_CRIMSON_CARPET_GREEN.get(), Blocks.CRIMSON_STAIRS, Blocks.GREEN_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_CRIMSON_CARPET_LIGHT_BLUE.get(), Blocks.CRIMSON_STAIRS, Blocks.LIGHT_BLUE_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_CRIMSON_CARPET_LIGHT_GRAY.get(), Blocks.CRIMSON_STAIRS, Blocks.LIGHT_GRAY_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_CRIMSON_CARPET_LIME.get(), Blocks.CRIMSON_STAIRS, Blocks.LIME_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_CRIMSON_CARPET_MAGENTA.get(), Blocks.CRIMSON_STAIRS, Blocks.MAGENTA_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_CRIMSON_CARPET_ORANGE.get(), Blocks.CRIMSON_STAIRS, Blocks.ORANGE_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_CRIMSON_CARPET_PINK.get(), Blocks.CRIMSON_STAIRS, Blocks.PINK_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_CRIMSON_CARPET_PURPLE.get(), Blocks.CRIMSON_STAIRS, Blocks.PURPLE_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_CRIMSON_CARPET_RED.get(), Blocks.CRIMSON_STAIRS, Blocks.RED_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_CRIMSON_CARPET_WHITE.get(), Blocks.CRIMSON_STAIRS, Blocks.WHITE_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_CRIMSON_CARPET_YELLOW.get(), Blocks.CRIMSON_STAIRS, Blocks.YELLOW_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_DARK_OAK_CARPET_BLACK.get(), Blocks.DARK_OAK_STAIRS, Blocks.BLACK_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_DARK_OAK_CARPET_BLUE.get(), Blocks.DARK_OAK_STAIRS, Blocks.BLUE_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_DARK_OAK_CARPET_BROWN.get(), Blocks.DARK_OAK_STAIRS, Blocks.BROWN_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_DARK_OAK_CARPET_CYAN.get(), Blocks.DARK_OAK_STAIRS, Blocks.CYAN_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_DARK_OAK_CARPET_GRAY.get(), Blocks.DARK_OAK_STAIRS, Blocks.GRAY_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_DARK_OAK_CARPET_GREEN.get(), Blocks.DARK_OAK_STAIRS, Blocks.GREEN_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_DARK_OAK_CARPET_LIGHT_BLUE.get(), Blocks.DARK_OAK_STAIRS, Blocks.LIGHT_BLUE_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_DARK_OAK_CARPET_LIGHT_GRAY.get(), Blocks.DARK_OAK_STAIRS, Blocks.LIGHT_GRAY_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_DARK_OAK_CARPET_LIME.get(), Blocks.DARK_OAK_STAIRS, Blocks.LIME_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_DARK_OAK_CARPET_MAGENTA.get(), Blocks.DARK_OAK_STAIRS, Blocks.MAGENTA_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_DARK_OAK_CARPET_ORANGE.get(), Blocks.DARK_OAK_STAIRS, Blocks.ORANGE_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_DARK_OAK_CARPET_PINK.get(), Blocks.DARK_OAK_STAIRS, Blocks.PINK_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_DARK_OAK_CARPET_PURPLE.get(), Blocks.DARK_OAK_STAIRS, Blocks.PURPLE_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_DARK_OAK_CARPET_RED.get(), Blocks.DARK_OAK_STAIRS, Blocks.RED_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_DARK_OAK_CARPET_WHITE.get(), Blocks.DARK_OAK_STAIRS, Blocks.WHITE_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_DARK_OAK_CARPET_YELLOW.get(), Blocks.DARK_OAK_STAIRS, Blocks.YELLOW_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_JUNGLE_CARPET_BLACK.get(), Blocks.JUNGLE_STAIRS, Blocks.BLACK_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_JUNGLE_CARPET_BLUE.get(), Blocks.JUNGLE_STAIRS, Blocks.BLUE_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_JUNGLE_CARPET_BROWN.get(), Blocks.JUNGLE_STAIRS, Blocks.BROWN_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_JUNGLE_CARPET_CYAN.get(), Blocks.JUNGLE_STAIRS, Blocks.CYAN_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_JUNGLE_CARPET_GRAY.get(), Blocks.JUNGLE_STAIRS, Blocks.GRAY_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_JUNGLE_CARPET_GREEN.get(), Blocks.JUNGLE_STAIRS, Blocks.GREEN_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_JUNGLE_CARPET_LIGHT_BLUE.get(), Blocks.JUNGLE_STAIRS, Blocks.LIGHT_BLUE_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_JUNGLE_CARPET_LIGHT_GRAY.get(), Blocks.JUNGLE_STAIRS, Blocks.LIGHT_GRAY_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_JUNGLE_CARPET_LIME.get(), Blocks.JUNGLE_STAIRS, Blocks.LIME_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_JUNGLE_CARPET_MAGENTA.get(), Blocks.JUNGLE_STAIRS, Blocks.MAGENTA_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_JUNGLE_CARPET_ORANGE.get(), Blocks.JUNGLE_STAIRS, Blocks.ORANGE_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_JUNGLE_CARPET_PINK.get(), Blocks.JUNGLE_STAIRS, Blocks.PINK_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_JUNGLE_CARPET_PURPLE.get(), Blocks.JUNGLE_STAIRS, Blocks.PURPLE_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_JUNGLE_CARPET_RED.get(), Blocks.JUNGLE_STAIRS, Blocks.RED_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_JUNGLE_CARPET_WHITE.get(), Blocks.JUNGLE_STAIRS, Blocks.WHITE_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_JUNGLE_CARPET_YELLOW.get(), Blocks.JUNGLE_STAIRS, Blocks.YELLOW_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_OAK_CARPET_BLACK.get(), Blocks.OAK_STAIRS, Blocks.BLACK_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_OAK_CARPET_BLUE.get(), Blocks.OAK_STAIRS, Blocks.BLUE_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_OAK_CARPET_BROWN.get(), Blocks.OAK_STAIRS, Blocks.BROWN_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_OAK_CARPET_CYAN.get(), Blocks.OAK_STAIRS, Blocks.CYAN_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_OAK_CARPET_GRAY.get(), Blocks.OAK_STAIRS, Blocks.GRAY_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_OAK_CARPET_GREEN.get(), Blocks.OAK_STAIRS, Blocks.GREEN_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_OAK_CARPET_LIGHT_BLUE.get(), Blocks.OAK_STAIRS, Blocks.LIGHT_BLUE_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_OAK_CARPET_LIGHT_GRAY.get(), Blocks.OAK_STAIRS, Blocks.LIGHT_GRAY_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_OAK_CARPET_LIME.get(), Blocks.OAK_STAIRS, Blocks.LIME_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_OAK_CARPET_MAGENTA.get(), Blocks.OAK_STAIRS, Blocks.MAGENTA_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_OAK_CARPET_ORANGE.get(), Blocks.OAK_STAIRS, Blocks.ORANGE_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_OAK_CARPET_PINK.get(), Blocks.OAK_STAIRS, Blocks.PINK_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_OAK_CARPET_PURPLE.get(), Blocks.OAK_STAIRS, Blocks.PURPLE_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_OAK_CARPET_RED.get(), Blocks.OAK_STAIRS, Blocks.RED_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_OAK_CARPET_WHITE.get(), Blocks.OAK_STAIRS, Blocks.WHITE_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_OAK_CARPET_YELLOW.get(), Blocks.OAK_STAIRS, Blocks.YELLOW_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_SPRUCE_CARPET_BLACK.get(), Blocks.SPRUCE_STAIRS, Blocks.BLACK_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_SPRUCE_CARPET_BLUE.get(), Blocks.SPRUCE_STAIRS, Blocks.BLUE_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_SPRUCE_CARPET_BROWN.get(), Blocks.SPRUCE_STAIRS, Blocks.BROWN_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_SPRUCE_CARPET_CYAN.get(), Blocks.SPRUCE_STAIRS, Blocks.CYAN_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_SPRUCE_CARPET_GRAY.get(), Blocks.SPRUCE_STAIRS, Blocks.GRAY_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_SPRUCE_CARPET_GREEN.get(), Blocks.SPRUCE_STAIRS, Blocks.GREEN_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_SPRUCE_CARPET_LIGHT_BLUE.get(), Blocks.SPRUCE_STAIRS, Blocks.LIGHT_BLUE_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_SPRUCE_CARPET_LIGHT_GRAY.get(), Blocks.SPRUCE_STAIRS, Blocks.LIGHT_GRAY_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_SPRUCE_CARPET_LIME.get(), Blocks.SPRUCE_STAIRS, Blocks.LIME_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_SPRUCE_CARPET_MAGENTA.get(), Blocks.SPRUCE_STAIRS, Blocks.MAGENTA_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_SPRUCE_CARPET_ORANGE.get(), Blocks.SPRUCE_STAIRS, Blocks.ORANGE_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_SPRUCE_CARPET_PINK.get(), Blocks.SPRUCE_STAIRS, Blocks.PINK_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_SPRUCE_CARPET_PURPLE.get(), Blocks.SPRUCE_STAIRS, Blocks.PURPLE_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_SPRUCE_CARPET_RED.get(), Blocks.SPRUCE_STAIRS, Blocks.RED_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_SPRUCE_CARPET_WHITE.get(), Blocks.SPRUCE_STAIRS, Blocks.WHITE_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_SPRUCE_CARPET_YELLOW.get(), Blocks.SPRUCE_STAIRS, Blocks.YELLOW_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_WARPED_CARPET_BLACK.get(), Blocks.WARPED_STAIRS, Blocks.BLACK_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_WARPED_CARPET_BLUE.get(), Blocks.WARPED_STAIRS, Blocks.BLUE_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_WARPED_CARPET_BROWN.get(), Blocks.WARPED_STAIRS, Blocks.BROWN_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_WARPED_CARPET_CYAN.get(), Blocks.WARPED_STAIRS, Blocks.CYAN_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_WARPED_CARPET_GRAY.get(), Blocks.WARPED_STAIRS, Blocks.GRAY_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_WARPED_CARPET_GREEN.get(), Blocks.WARPED_STAIRS, Blocks.GREEN_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_WARPED_CARPET_LIGHT_BLUE.get(), Blocks.WARPED_STAIRS, Blocks.LIGHT_BLUE_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_WARPED_CARPET_LIGHT_GRAY.get(), Blocks.WARPED_STAIRS, Blocks.LIGHT_GRAY_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_WARPED_CARPET_LIME.get(), Blocks.WARPED_STAIRS, Blocks.LIME_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_WARPED_CARPET_MAGENTA.get(), Blocks.WARPED_STAIRS, Blocks.MAGENTA_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_WARPED_CARPET_ORANGE.get(), Blocks.WARPED_STAIRS, Blocks.ORANGE_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_WARPED_CARPET_PINK.get(), Blocks.WARPED_STAIRS, Blocks.PINK_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_WARPED_CARPET_PURPLE.get(), Blocks.WARPED_STAIRS, Blocks.PURPLE_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_WARPED_CARPET_RED.get(), Blocks.WARPED_STAIRS, Blocks.RED_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_WARPED_CARPET_WHITE.get(), Blocks.WARPED_STAIRS, Blocks.WHITE_CARPET);
        this.buildCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_WARPED_CARPET_YELLOW.get(), Blocks.WARPED_STAIRS, Blocks.YELLOW_CARPET);
    }

    private void partialCarpetedStairsRecipes(Consumer<FinishedRecipe> recipeConsumer) {
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_ACACIA_CARPET_PARTIAL_BLACK.get(), Blocks.ACACIA_STAIRS, Blocks.BLACK_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_ACACIA_CARPET_PARTIAL_BLUE.get(), Blocks.ACACIA_STAIRS, Blocks.BLUE_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_ACACIA_CARPET_PARTIAL_BROWN.get(), Blocks.ACACIA_STAIRS, Blocks.BROWN_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_ACACIA_CARPET_PARTIAL_CYAN.get(), Blocks.ACACIA_STAIRS, Blocks.CYAN_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_ACACIA_CARPET_PARTIAL_GRAY.get(), Blocks.ACACIA_STAIRS, Blocks.GRAY_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_ACACIA_CARPET_PARTIAL_GREEN.get(), Blocks.ACACIA_STAIRS, Blocks.GREEN_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_ACACIA_CARPET_PARTIAL_LIGHT_BLUE.get(), Blocks.ACACIA_STAIRS, Blocks.LIGHT_BLUE_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_ACACIA_CARPET_PARTIAL_LIGHT_GRAY.get(), Blocks.ACACIA_STAIRS, Blocks.LIGHT_GRAY_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_ACACIA_CARPET_PARTIAL_LIME.get(), Blocks.ACACIA_STAIRS, Blocks.LIME_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_ACACIA_CARPET_PARTIAL_MAGENTA.get(), Blocks.ACACIA_STAIRS, Blocks.MAGENTA_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_ACACIA_CARPET_PARTIAL_ORANGE.get(), Blocks.ACACIA_STAIRS, Blocks.ORANGE_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_ACACIA_CARPET_PARTIAL_PINK.get(), Blocks.ACACIA_STAIRS, Blocks.PINK_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_ACACIA_CARPET_PARTIAL_PURPLE.get(), Blocks.ACACIA_STAIRS, Blocks.PURPLE_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_ACACIA_CARPET_PARTIAL_RED.get(), Blocks.ACACIA_STAIRS, Blocks.RED_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_ACACIA_CARPET_PARTIAL_WHITE.get(), Blocks.ACACIA_STAIRS, Blocks.WHITE_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_ACACIA_CARPET_PARTIAL_YELLOW.get(), Blocks.ACACIA_STAIRS, Blocks.YELLOW_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_BIRCH_CARPET_PARTIAL_BLACK.get(), Blocks.BIRCH_STAIRS, Blocks.BLACK_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_BIRCH_CARPET_PARTIAL_BLUE.get(), Blocks.BIRCH_STAIRS, Blocks.BLUE_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_BIRCH_CARPET_PARTIAL_BROWN.get(), Blocks.BIRCH_STAIRS, Blocks.BROWN_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_BIRCH_CARPET_PARTIAL_CYAN.get(), Blocks.BIRCH_STAIRS, Blocks.CYAN_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_BIRCH_CARPET_PARTIAL_GRAY.get(), Blocks.BIRCH_STAIRS, Blocks.GRAY_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_BIRCH_CARPET_PARTIAL_GREEN.get(), Blocks.BIRCH_STAIRS, Blocks.GREEN_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_BIRCH_CARPET_PARTIAL_LIGHT_BLUE.get(), Blocks.BIRCH_STAIRS, Blocks.LIGHT_BLUE_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_BIRCH_CARPET_PARTIAL_LIGHT_GRAY.get(), Blocks.BIRCH_STAIRS, Blocks.LIGHT_GRAY_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_BIRCH_CARPET_PARTIAL_LIME.get(), Blocks.BIRCH_STAIRS, Blocks.LIME_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_BIRCH_CARPET_PARTIAL_MAGENTA.get(), Blocks.BIRCH_STAIRS, Blocks.MAGENTA_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_BIRCH_CARPET_PARTIAL_ORANGE.get(), Blocks.BIRCH_STAIRS, Blocks.ORANGE_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_BIRCH_CARPET_PARTIAL_PINK.get(), Blocks.BIRCH_STAIRS, Blocks.PINK_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_BIRCH_CARPET_PARTIAL_PURPLE.get(), Blocks.BIRCH_STAIRS, Blocks.PURPLE_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_BIRCH_CARPET_PARTIAL_RED.get(), Blocks.BIRCH_STAIRS, Blocks.RED_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_BIRCH_CARPET_PARTIAL_WHITE.get(), Blocks.BIRCH_STAIRS, Blocks.WHITE_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_BIRCH_CARPET_PARTIAL_YELLOW.get(), Blocks.BIRCH_STAIRS, Blocks.YELLOW_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_CRIMSON_CARPET_PARTIAL_BLACK.get(), Blocks.CRIMSON_STAIRS, Blocks.BLACK_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_CRIMSON_CARPET_PARTIAL_BLUE.get(), Blocks.CRIMSON_STAIRS, Blocks.BLUE_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_CRIMSON_CARPET_PARTIAL_BROWN.get(), Blocks.CRIMSON_STAIRS, Blocks.BROWN_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_CRIMSON_CARPET_PARTIAL_CYAN.get(), Blocks.CRIMSON_STAIRS, Blocks.CYAN_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_CRIMSON_CARPET_PARTIAL_GRAY.get(), Blocks.CRIMSON_STAIRS, Blocks.GRAY_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_CRIMSON_CARPET_PARTIAL_GREEN.get(), Blocks.CRIMSON_STAIRS, Blocks.GREEN_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_CRIMSON_CARPET_PARTIAL_LIGHT_BLUE.get(), Blocks.CRIMSON_STAIRS, Blocks.LIGHT_BLUE_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_CRIMSON_CARPET_PARTIAL_LIGHT_GRAY.get(), Blocks.CRIMSON_STAIRS, Blocks.LIGHT_GRAY_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_CRIMSON_CARPET_PARTIAL_LIME.get(), Blocks.CRIMSON_STAIRS, Blocks.LIME_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_CRIMSON_CARPET_PARTIAL_MAGENTA.get(), Blocks.CRIMSON_STAIRS, Blocks.MAGENTA_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_CRIMSON_CARPET_PARTIAL_ORANGE.get(), Blocks.CRIMSON_STAIRS, Blocks.ORANGE_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_CRIMSON_CARPET_PARTIAL_PINK.get(), Blocks.CRIMSON_STAIRS, Blocks.PINK_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_CRIMSON_CARPET_PARTIAL_PURPLE.get(), Blocks.CRIMSON_STAIRS, Blocks.PURPLE_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_CRIMSON_CARPET_PARTIAL_RED.get(), Blocks.CRIMSON_STAIRS, Blocks.RED_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_CRIMSON_CARPET_PARTIAL_WHITE.get(), Blocks.CRIMSON_STAIRS, Blocks.WHITE_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_CRIMSON_CARPET_PARTIAL_YELLOW.get(), Blocks.CRIMSON_STAIRS, Blocks.YELLOW_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_DARK_OAK_CARPET_PARTIAL_BLACK.get(), Blocks.DARK_OAK_STAIRS, Blocks.BLACK_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_DARK_OAK_CARPET_PARTIAL_BLUE.get(), Blocks.DARK_OAK_STAIRS, Blocks.BLUE_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_DARK_OAK_CARPET_PARTIAL_BROWN.get(), Blocks.DARK_OAK_STAIRS, Blocks.BROWN_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_DARK_OAK_CARPET_PARTIAL_CYAN.get(), Blocks.DARK_OAK_STAIRS, Blocks.CYAN_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_DARK_OAK_CARPET_PARTIAL_GRAY.get(), Blocks.DARK_OAK_STAIRS, Blocks.GRAY_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_DARK_OAK_CARPET_PARTIAL_GREEN.get(), Blocks.DARK_OAK_STAIRS, Blocks.GREEN_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_DARK_OAK_CARPET_PARTIAL_LIGHT_BLUE.get(), Blocks.DARK_OAK_STAIRS, Blocks.LIGHT_BLUE_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_DARK_OAK_CARPET_PARTIAL_LIGHT_GRAY.get(), Blocks.DARK_OAK_STAIRS, Blocks.LIGHT_GRAY_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_DARK_OAK_CARPET_PARTIAL_LIME.get(), Blocks.DARK_OAK_STAIRS, Blocks.LIME_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_DARK_OAK_CARPET_PARTIAL_MAGENTA.get(), Blocks.DARK_OAK_STAIRS, Blocks.MAGENTA_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_DARK_OAK_CARPET_PARTIAL_ORANGE.get(), Blocks.DARK_OAK_STAIRS, Blocks.ORANGE_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_DARK_OAK_CARPET_PARTIAL_PINK.get(), Blocks.DARK_OAK_STAIRS, Blocks.PINK_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_DARK_OAK_CARPET_PARTIAL_PURPLE.get(), Blocks.DARK_OAK_STAIRS, Blocks.PURPLE_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_DARK_OAK_CARPET_PARTIAL_RED.get(), Blocks.DARK_OAK_STAIRS, Blocks.RED_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_DARK_OAK_CARPET_PARTIAL_WHITE.get(), Blocks.DARK_OAK_STAIRS, Blocks.WHITE_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_DARK_OAK_CARPET_PARTIAL_YELLOW.get(), Blocks.DARK_OAK_STAIRS, Blocks.YELLOW_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_JUNGLE_CARPET_PARTIAL_BLACK.get(), Blocks.JUNGLE_STAIRS, Blocks.BLACK_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_JUNGLE_CARPET_PARTIAL_BLUE.get(), Blocks.JUNGLE_STAIRS, Blocks.BLUE_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_JUNGLE_CARPET_PARTIAL_BROWN.get(), Blocks.JUNGLE_STAIRS, Blocks.BROWN_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_JUNGLE_CARPET_PARTIAL_CYAN.get(), Blocks.JUNGLE_STAIRS, Blocks.CYAN_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_JUNGLE_CARPET_PARTIAL_GRAY.get(), Blocks.JUNGLE_STAIRS, Blocks.GRAY_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_JUNGLE_CARPET_PARTIAL_GREEN.get(), Blocks.JUNGLE_STAIRS, Blocks.GREEN_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_JUNGLE_CARPET_PARTIAL_LIGHT_BLUE.get(), Blocks.JUNGLE_STAIRS, Blocks.LIGHT_BLUE_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_JUNGLE_CARPET_PARTIAL_LIGHT_GRAY.get(), Blocks.JUNGLE_STAIRS, Blocks.LIGHT_GRAY_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_JUNGLE_CARPET_PARTIAL_LIME.get(), Blocks.JUNGLE_STAIRS, Blocks.LIME_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_JUNGLE_CARPET_PARTIAL_MAGENTA.get(), Blocks.JUNGLE_STAIRS, Blocks.MAGENTA_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_JUNGLE_CARPET_PARTIAL_ORANGE.get(), Blocks.JUNGLE_STAIRS, Blocks.ORANGE_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_JUNGLE_CARPET_PARTIAL_PINK.get(), Blocks.JUNGLE_STAIRS, Blocks.PINK_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_JUNGLE_CARPET_PARTIAL_PURPLE.get(), Blocks.JUNGLE_STAIRS, Blocks.PURPLE_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_JUNGLE_CARPET_PARTIAL_RED.get(), Blocks.JUNGLE_STAIRS, Blocks.RED_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_JUNGLE_CARPET_PARTIAL_WHITE.get(), Blocks.JUNGLE_STAIRS, Blocks.WHITE_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_JUNGLE_CARPET_PARTIAL_YELLOW.get(), Blocks.JUNGLE_STAIRS, Blocks.YELLOW_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_OAK_CARPET_PARTIAL_BLACK.get(), Blocks.OAK_STAIRS, Blocks.BLACK_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_OAK_CARPET_PARTIAL_BLUE.get(), Blocks.OAK_STAIRS, Blocks.BLUE_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_OAK_CARPET_PARTIAL_BROWN.get(), Blocks.OAK_STAIRS, Blocks.BROWN_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_OAK_CARPET_PARTIAL_CYAN.get(), Blocks.OAK_STAIRS, Blocks.CYAN_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_OAK_CARPET_PARTIAL_GRAY.get(), Blocks.OAK_STAIRS, Blocks.GRAY_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_OAK_CARPET_PARTIAL_GREEN.get(), Blocks.OAK_STAIRS, Blocks.GREEN_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_OAK_CARPET_PARTIAL_LIGHT_BLUE.get(), Blocks.OAK_STAIRS, Blocks.LIGHT_BLUE_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_OAK_CARPET_PARTIAL_LIGHT_GRAY.get(), Blocks.OAK_STAIRS, Blocks.LIGHT_GRAY_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_OAK_CARPET_PARTIAL_LIME.get(), Blocks.OAK_STAIRS, Blocks.LIME_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_OAK_CARPET_PARTIAL_MAGENTA.get(), Blocks.OAK_STAIRS, Blocks.MAGENTA_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_OAK_CARPET_PARTIAL_ORANGE.get(), Blocks.OAK_STAIRS, Blocks.ORANGE_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_OAK_CARPET_PARTIAL_PINK.get(), Blocks.OAK_STAIRS, Blocks.PINK_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_OAK_CARPET_PARTIAL_PURPLE.get(), Blocks.OAK_STAIRS, Blocks.PURPLE_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_OAK_CARPET_PARTIAL_RED.get(), Blocks.OAK_STAIRS, Blocks.RED_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_OAK_CARPET_PARTIAL_WHITE.get(), Blocks.OAK_STAIRS, Blocks.WHITE_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_OAK_CARPET_PARTIAL_YELLOW.get(), Blocks.OAK_STAIRS, Blocks.YELLOW_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_SPRUCE_CARPET_PARTIAL_BLACK.get(), Blocks.SPRUCE_STAIRS, Blocks.BLACK_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_SPRUCE_CARPET_PARTIAL_BLUE.get(), Blocks.SPRUCE_STAIRS, Blocks.BLUE_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_SPRUCE_CARPET_PARTIAL_BROWN.get(), Blocks.SPRUCE_STAIRS, Blocks.BROWN_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_SPRUCE_CARPET_PARTIAL_CYAN.get(), Blocks.SPRUCE_STAIRS, Blocks.CYAN_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_SPRUCE_CARPET_PARTIAL_GRAY.get(), Blocks.SPRUCE_STAIRS, Blocks.GRAY_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_SPRUCE_CARPET_PARTIAL_GREEN.get(), Blocks.SPRUCE_STAIRS, Blocks.GREEN_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_SPRUCE_CARPET_PARTIAL_LIGHT_BLUE.get(), Blocks.SPRUCE_STAIRS, Blocks.LIGHT_BLUE_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_SPRUCE_CARPET_PARTIAL_LIGHT_GRAY.get(), Blocks.SPRUCE_STAIRS, Blocks.LIGHT_GRAY_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_SPRUCE_CARPET_PARTIAL_LIME.get(), Blocks.SPRUCE_STAIRS, Blocks.LIME_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_SPRUCE_CARPET_PARTIAL_MAGENTA.get(), Blocks.SPRUCE_STAIRS, Blocks.MAGENTA_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_SPRUCE_CARPET_PARTIAL_ORANGE.get(), Blocks.SPRUCE_STAIRS, Blocks.ORANGE_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_SPRUCE_CARPET_PARTIAL_PINK.get(), Blocks.SPRUCE_STAIRS, Blocks.PINK_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_SPRUCE_CARPET_PARTIAL_PURPLE.get(), Blocks.SPRUCE_STAIRS, Blocks.PURPLE_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_SPRUCE_CARPET_PARTIAL_RED.get(), Blocks.SPRUCE_STAIRS, Blocks.RED_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_SPRUCE_CARPET_PARTIAL_WHITE.get(), Blocks.SPRUCE_STAIRS, Blocks.WHITE_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_SPRUCE_CARPET_PARTIAL_YELLOW.get(), Blocks.SPRUCE_STAIRS, Blocks.YELLOW_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_WARPED_CARPET_PARTIAL_BLACK.get(), Blocks.WARPED_STAIRS, Blocks.BLACK_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_WARPED_CARPET_PARTIAL_BLUE.get(), Blocks.WARPED_STAIRS, Blocks.BLUE_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_WARPED_CARPET_PARTIAL_BROWN.get(), Blocks.WARPED_STAIRS, Blocks.BROWN_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_WARPED_CARPET_PARTIAL_CYAN.get(), Blocks.WARPED_STAIRS, Blocks.CYAN_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_WARPED_CARPET_PARTIAL_GRAY.get(), Blocks.WARPED_STAIRS, Blocks.GRAY_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_WARPED_CARPET_PARTIAL_GREEN.get(), Blocks.WARPED_STAIRS, Blocks.GREEN_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_WARPED_CARPET_PARTIAL_LIGHT_BLUE.get(), Blocks.WARPED_STAIRS, Blocks.LIGHT_BLUE_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_WARPED_CARPET_PARTIAL_LIGHT_GRAY.get(), Blocks.WARPED_STAIRS, Blocks.LIGHT_GRAY_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_WARPED_CARPET_PARTIAL_LIME.get(), Blocks.WARPED_STAIRS, Blocks.LIME_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_WARPED_CARPET_PARTIAL_MAGENTA.get(), Blocks.WARPED_STAIRS, Blocks.MAGENTA_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_WARPED_CARPET_PARTIAL_ORANGE.get(), Blocks.WARPED_STAIRS, Blocks.ORANGE_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_WARPED_CARPET_PARTIAL_PINK.get(), Blocks.WARPED_STAIRS, Blocks.PINK_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_WARPED_CARPET_PARTIAL_PURPLE.get(), Blocks.WARPED_STAIRS, Blocks.PURPLE_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_WARPED_CARPET_PARTIAL_RED.get(), Blocks.WARPED_STAIRS, Blocks.RED_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_WARPED_CARPET_PARTIAL_WHITE.get(), Blocks.WARPED_STAIRS, Blocks.WHITE_CARPET);
        this.buildPartialCarpetedStairRecipe(recipeConsumer, GrowthcraftDecoBlocks.STAIR_WARPED_CARPET_PARTIAL_YELLOW.get(), Blocks.WARPED_STAIRS, Blocks.YELLOW_CARPET);
    }

    private void buildGlowingRecipe(Consumer<FinishedRecipe> recipeConsumer, ItemLike result, ItemLike ingredient) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, result, 8)
                .define('A', ingredient)
                .define('B', GrowthcraftDecoTags.Items.GLOWING)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .unlockedBy("has_item", has(GrowthcraftDecoTags.Items.GLOWING))
                .save(recipeConsumer);
    }

    public void buildSlabRecipe(Consumer<FinishedRecipe> recipeConsumer, ItemLike result, ItemLike ingredient) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, result, 6)
                .define('A', ingredient)
                .pattern("AAA")
                .unlockedBy("has_item", has(ingredient))
                .save(recipeConsumer);
    }

    public void buildSlabRecipe(Consumer<FinishedRecipe> recipeConsumer, ItemLike result, ItemLike ingredient, String recipePostfixName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, result, 6)
                .define('A', ingredient)
                .pattern("AAA")
                .unlockedBy("has_item", has(ingredient))
                .save(recipeConsumer, new ResourceLocation(Reference.MODID, RecipeProvider.getItemName(result)).toString() + "_" + recipePostfixName);
    }

    public void buildStairRecipe(Consumer<FinishedRecipe> recipeConsumer, ItemLike result, ItemLike ingredient) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, result, 4)
                .define('A', ingredient)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .unlockedBy("has_item", has(ingredient))
                .save(recipeConsumer);
    }

    public void buildCarpetedStairRecipe(Consumer<FinishedRecipe> recipeConsumer, ItemLike result, ItemLike base, ItemLike carpet) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, result, 6)
                .define('A', base)
                .define('B', carpet)
                .pattern("AAA")
                .pattern("BBB")
                .pattern("AAA")
                .unlockedBy(getHasName(base), has(base))
                .unlockedBy(getHasName(carpet), has(carpet))
                .save(recipeConsumer);
    }

    public void buildPartialCarpetedStairRecipe(Consumer<FinishedRecipe> recipeConsumer, ItemLike result, ItemLike base, ItemLike carpet) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, result, 8)
                .define('A', base)
                .define('B', carpet)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .unlockedBy(getHasName(base), has(base))
                .unlockedBy(getHasName(carpet), has(carpet))
                .save(recipeConsumer);
    }

    public void buildStonecuttingRecipe(Consumer<FinishedRecipe> recipeConsumer, ItemLike result, ItemLike ingredient, int resultCount) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ingredient), RecipeCategory.DECORATIONS, result, resultCount)
                .unlockedBy(getHasName(ingredient), has(ingredient))
                .save(recipeConsumer, new ResourceLocation(Reference.MODID, getConversionRecipeName(result, ingredient)).toString() + "_stonecutting");
    }

}
