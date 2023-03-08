package growthcraft.deco.datagen;

import growthcraft.deco.init.GrowthcraftDecoBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
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
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, GrowthcraftDecoBlocks.GLASS_PANE_BLUE_GLOWING.get(), 8)
                .define('A', Blocks.BLUE_STAINED_GLASS_PANE)
                .define('B', Blocks.GLOWSTONE)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .unlockedBy("has_item", has(Blocks.GLOWSTONE))
                .save(recipeConsumer);
    }

}
