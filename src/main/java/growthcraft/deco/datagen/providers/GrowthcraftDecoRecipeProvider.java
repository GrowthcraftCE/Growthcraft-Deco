package growthcraft.deco.datagen.providers;

import growthcraft.deco.init.GrowthcraftDecoBlocks;
import growthcraft.deco.init.GrowthcraftDecoTags;
import growthcraft.deco.shared.Reference;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
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
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANE_BLACK_GLOWING.get(), Blocks.BLACK_STAINED_GLASS_PANE);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANE_BLUE_GLOWING.get(), Blocks.BLUE_STAINED_GLASS_PANE);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANE_BROWN_GLOWING.get(), Blocks.BROWN_STAINED_GLASS_PANE);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANE_CLEAR_GLOWING.get(), Blocks.GLASS_PANE);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANE_CYAN_GLOWING.get(), Blocks.CYAN_STAINED_GLASS_PANE);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANE_GRAY_GLOWING.get(), Blocks.GRAY_STAINED_GLASS_PANE);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANE_GREEN_GLOWING.get(), Blocks.GREEN_STAINED_GLASS_PANE);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANE_LIGHT_BLUE_GLOWING.get(), Blocks.LIGHT_BLUE_STAINED_GLASS_PANE);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANE_LIGHT_GRAY_GLOWING.get(), Blocks.LIGHT_GRAY_STAINED_GLASS_PANE);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANE_LIME_GLOWING.get(), Blocks.LIME_STAINED_GLASS_PANE);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANE_MAGENTA_GLOWING.get(), Blocks.MAGENTA_STAINED_GLASS_PANE);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANE_ORANGE_GLOWING.get(), Blocks.ORANGE_STAINED_GLASS_PANE);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANE_PINK_GLOWING.get(), Blocks.PINK_STAINED_GLASS_PANE);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANE_PURPLE_GLOWING.get(), Blocks.PURPLE_STAINED_GLASS_PANE);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANE_RED_GLOWING.get(), Blocks.RED_STAINED_GLASS_PANE);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANE_WHITE_GLOWING.get(), Blocks.WHITE_STAINED_GLASS_PANE);
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANE_YELLOW_GLOWING.get(), Blocks.YELLOW_STAINED_GLASS_PANE);

        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_BLACK.get(), GrowthcraftDecoBlocks.SLAB_GLASS_BLACK.get());
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_BLUE.get(), GrowthcraftDecoBlocks.SLAB_GLASS_BLUE.get());
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_BROWN.get(), GrowthcraftDecoBlocks.SLAB_GLASS_BROWN.get());
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_CLEAR.get(), GrowthcraftDecoBlocks.SLAB_GLASS_CLEAR.get());
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_CYAN.get(), GrowthcraftDecoBlocks.SLAB_GLASS_CYAN.get());
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_GRAY.get(), GrowthcraftDecoBlocks.SLAB_GLASS_GRAY.get());
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_GREEN.get(), GrowthcraftDecoBlocks.SLAB_GLASS_GREEN.get());
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_LIGHT_BLUE.get(), GrowthcraftDecoBlocks.SLAB_GLASS_LIGHT_BLUE.get());
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_LIGHT_GRAY.get(), GrowthcraftDecoBlocks.SLAB_GLASS_LIGHT_GRAY.get());
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_LIME.get(), GrowthcraftDecoBlocks.SLAB_GLASS_LIME.get());
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_MAGENTA.get(), GrowthcraftDecoBlocks.SLAB_GLASS_MAGENTA.get());
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_ORANGE.get(), GrowthcraftDecoBlocks.SLAB_GLASS_ORANGE.get());
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_PINK.get(), GrowthcraftDecoBlocks.SLAB_GLASS_PINK.get());
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_PURPLE.get(), GrowthcraftDecoBlocks.SLAB_GLASS_PURPLE.get());
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_RED.get(), GrowthcraftDecoBlocks.SLAB_GLASS_RED.get());
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_WHITE.get(), GrowthcraftDecoBlocks.SLAB_GLASS_WHITE.get());
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_YELLOW.get(), GrowthcraftDecoBlocks.SLAB_GLASS_YELLOW.get());

        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_BLACK_GLOWING.get(), GrowthcraftDecoBlocks.GLASS_PANEL_BLACK.get());
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_BLUE_GLOWING.get(), GrowthcraftDecoBlocks.GLASS_PANEL_BLUE.get());
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_BROWN_GLOWING.get(), GrowthcraftDecoBlocks.GLASS_PANEL_BROWN.get());
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_CLEAR_GLOWING.get(), GrowthcraftDecoBlocks.GLASS_PANEL_CLEAR.get());
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_CYAN_GLOWING.get(), GrowthcraftDecoBlocks.GLASS_PANEL_CYAN.get());
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_GRAY_GLOWING.get(), GrowthcraftDecoBlocks.GLASS_PANEL_GRAY.get());
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_GREEN_GLOWING.get(), GrowthcraftDecoBlocks.GLASS_PANEL_GREEN.get());
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_LIGHT_BLUE_GLOWING.get(), GrowthcraftDecoBlocks.GLASS_PANEL_LIGHT_BLUE.get());
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_LIGHT_GRAY_GLOWING.get(), GrowthcraftDecoBlocks.GLASS_PANEL_LIGHT_GRAY.get());
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_LIME_GLOWING.get(), GrowthcraftDecoBlocks.GLASS_PANEL_LIME.get());
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_MAGENTA_GLOWING.get(), GrowthcraftDecoBlocks.GLASS_PANEL_MAGENTA.get());
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_ORANGE_GLOWING.get(), GrowthcraftDecoBlocks.GLASS_PANEL_ORANGE.get());
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_PINK_GLOWING.get(), GrowthcraftDecoBlocks.GLASS_PANEL_PINK.get());
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_PURPLE_GLOWING.get(), GrowthcraftDecoBlocks.GLASS_PANEL_PURPLE.get());
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_RED_GLOWING.get(), GrowthcraftDecoBlocks.GLASS_PANEL_RED.get());
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_WHITE_GLOWING.get(), GrowthcraftDecoBlocks.GLASS_PANEL_WHITE.get());
        this.buildGlowingRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_YELLOW_GLOWING.get(), GrowthcraftDecoBlocks.GLASS_PANEL_YELLOW.get());

        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_BLACK_GLOWING.get(),
                GrowthcraftDecoBlocks.SLAB_GLASS_BLACK_GLOWING.get(), "panel_glass_black_glowing_from_slab");
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_BLUE_GLOWING.get(),
                GrowthcraftDecoBlocks.SLAB_GLASS_BLUE_GLOWING.get(), "panel_glass_blue_glowing_from_slab");
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_BROWN_GLOWING.get(),
                GrowthcraftDecoBlocks.SLAB_GLASS_BROWN_GLOWING.get(), "panel_glass_brown_glowing_from_slab");
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_CLEAR_GLOWING.get(),
                GrowthcraftDecoBlocks.SLAB_GLASS_CLEAR_GLOWING.get(), "panel_glass_clear_glowing_from_slab");
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_CYAN_GLOWING.get(),
                GrowthcraftDecoBlocks.SLAB_GLASS_CYAN_GLOWING.get(), "panel_glass_cyan_glowing_from_slab");
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_GRAY_GLOWING.get(),
                GrowthcraftDecoBlocks.SLAB_GLASS_GRAY_GLOWING.get(), "panel_glass_gray_glowing_from_slab");
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_GREEN_GLOWING.get(),
                GrowthcraftDecoBlocks.SLAB_GLASS_GREEN_GLOWING.get(), "panel_glass_green_glowing_from_slab");
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_LIGHT_BLUE_GLOWING.get(),
                GrowthcraftDecoBlocks.SLAB_GLASS_LIGHT_BLUE_GLOWING.get(), "panel_glass_light_blue_glowing_from_slab");
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_LIGHT_GRAY_GLOWING.get(),
                GrowthcraftDecoBlocks.SLAB_GLASS_LIGHT_GRAY_GLOWING.get(), "panel_glass_light_gray_glowing_from_slab");
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_LIME_GLOWING.get(),
                GrowthcraftDecoBlocks.SLAB_GLASS_LIME_GLOWING.get(), "panel_glass_lime_glowing_from_slab");
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_MAGENTA_GLOWING.get(),
                GrowthcraftDecoBlocks.SLAB_GLASS_MAGENTA_GLOWING.get(), "panel_glass_magenta_glowing_from_slab");
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_ORANGE_GLOWING.get(),
                GrowthcraftDecoBlocks.SLAB_GLASS_ORANGE_GLOWING.get(), "panel_glass_orange_glowing_from_slab");
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_PINK_GLOWING.get(),
                GrowthcraftDecoBlocks.SLAB_GLASS_PINK_GLOWING.get(), "panel_glass_pink_glowing_from_slab");
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_PURPLE_GLOWING.get(),
                GrowthcraftDecoBlocks.SLAB_GLASS_PURPLE_GLOWING.get(), "panel_glass_purple_glowing_from_slab");
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_RED_GLOWING.get(),
                GrowthcraftDecoBlocks.SLAB_GLASS_RED_GLOWING.get(), "panel_glass_red_glowing_from_slab");
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_WHITE_GLOWING.get(),
                GrowthcraftDecoBlocks.SLAB_GLASS_WHITE_GLOWING.get(), "panel_glass_white_glowing_from_slab");
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.GLASS_PANEL_YELLOW_GLOWING.get(),
                GrowthcraftDecoBlocks.SLAB_GLASS_YELLOW_GLOWING.get(), "panel_glass_yellow_glowing_from_slab");

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
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.SLAB_GLOWSTONE.get(), Blocks.GLOWSTONE);
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.SLAB_GLOWSHROOM.get(), Blocks.SHROOMLIGHT);

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

        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.PANEL_GLOWSHROOM.get(), GrowthcraftDecoBlocks.SLAB_GLOWSHROOM.get());
        this.buildSlabRecipe(recipeConsumer, GrowthcraftDecoBlocks.PANEL_GLOWSTONE.get(), GrowthcraftDecoBlocks.SLAB_GLOWSTONE.get());

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

    private void buildSlabRecipe(Consumer<FinishedRecipe> recipeConsumer, ItemLike result, ItemLike ingredient) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, result, 6)
                .define('A', ingredient)
                .pattern("AAA")
                .unlockedBy("has_item", has(ingredient))
                .save(recipeConsumer);
    }

    private void buildSlabRecipe(Consumer<FinishedRecipe> recipeConsumer, ItemLike result, ItemLike ingredient, String customRecipeName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, result, 6)
                .define('A', ingredient)
                .pattern("AAA")
                .unlockedBy("has_item", has(ingredient))
                .save(recipeConsumer, new ResourceLocation(Reference.MODID, customRecipeName).toString());
    }

    private void buildStairRecipe(Consumer<FinishedRecipe> recipeConsumer, ItemLike result, ItemLike ingredient) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, result, 4)
                .define('A', ingredient)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .unlockedBy("has_item", has(ingredient))
                .save(recipeConsumer);
    }

    private void buildCarpetedStairRecipe(Consumer<FinishedRecipe> recipeConsumer, ItemLike result, ItemLike base, ItemLike carpet) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, result, 4)
                .define('A', base)
                .define('B', carpet)
                .pattern("AAA")
                .pattern("BBB")
                .pattern("AAA")
                .unlockedBy("has_item", has(base))
                .unlockedBy("has_item", has(carpet))
                .save(recipeConsumer);
    }

}
