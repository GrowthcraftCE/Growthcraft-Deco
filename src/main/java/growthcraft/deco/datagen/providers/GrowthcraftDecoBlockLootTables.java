package growthcraft.deco.datagen.providers;

import growthcraft.deco.init.GrowthcraftDecoBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

/**
 * @credit Kaupenjoe for his DataGenerator tutorials
 */
public class GrowthcraftDecoBlockLootTables extends BlockLootSubProvider {

    protected GrowthcraftDecoBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.simpleLootTables();
        this.silkTouchLootTables();
        this.slabLootTables();
    }

    /**
     * Simple block loot table that drops the given block.
     */
    private void simpleLootTables() {
        this.dropSelf(GrowthcraftDecoBlocks.STAIRS_CONCRETE_BLACK.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIRS_CONCRETE_BLUE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIRS_CONCRETE_BROWN.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIRS_CONCRETE_CYAN.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIRS_CONCRETE_GRAY.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIRS_CONCRETE_GREEN.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIRS_CONCRETE_LIGHT_BLUE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIRS_CONCRETE_LIGHT_GRAY.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIRS_CONCRETE_LIME.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIRS_CONCRETE_MAGENTA.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIRS_CONCRETE_ORANGE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIRS_CONCRETE_PINK.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIRS_CONCRETE_PURPLE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIRS_CONCRETE_RED.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIRS_CONCRETE_WHITE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIRS_CONCRETE_YELLOW.get());
        this.dropSelf(GrowthcraftDecoBlocks.PANEL_GLOWSTONE.get());
        this.dropSelf(GrowthcraftDecoBlocks.PANEL_GLOWSHROOM.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_ACACIA_CARPET_BLACK.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_ACACIA_CARPET_BLUE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_ACACIA_CARPET_BROWN.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_ACACIA_CARPET_CYAN.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_ACACIA_CARPET_GRAY.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_ACACIA_CARPET_GREEN.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_ACACIA_CARPET_LIGHT_BLUE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_ACACIA_CARPET_LIGHT_GRAY.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_ACACIA_CARPET_LIME.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_ACACIA_CARPET_MAGENTA.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_ACACIA_CARPET_ORANGE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_ACACIA_CARPET_PARTIAL_BLACK.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_ACACIA_CARPET_PARTIAL_BLUE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_ACACIA_CARPET_PARTIAL_BROWN.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_ACACIA_CARPET_PARTIAL_CYAN.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_ACACIA_CARPET_PARTIAL_GRAY.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_ACACIA_CARPET_PARTIAL_GREEN.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_ACACIA_CARPET_PARTIAL_LIGHT_BLUE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_ACACIA_CARPET_PARTIAL_LIGHT_GRAY.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_ACACIA_CARPET_PARTIAL_LIME.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_ACACIA_CARPET_PARTIAL_MAGENTA.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_ACACIA_CARPET_PARTIAL_ORANGE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_ACACIA_CARPET_PARTIAL_PINK.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_ACACIA_CARPET_PARTIAL_PURPLE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_ACACIA_CARPET_PARTIAL_RED.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_ACACIA_CARPET_PARTIAL_WHITE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_ACACIA_CARPET_PARTIAL_YELLOW.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_ACACIA_CARPET_PINK.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_ACACIA_CARPET_PURPLE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_ACACIA_CARPET_RED.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_ACACIA_CARPET_WHITE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_ACACIA_CARPET_YELLOW.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_BIRCH_CARPET_BLACK.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_BIRCH_CARPET_BLUE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_BIRCH_CARPET_BROWN.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_BIRCH_CARPET_CYAN.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_BIRCH_CARPET_GRAY.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_BIRCH_CARPET_GREEN.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_BIRCH_CARPET_LIGHT_BLUE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_BIRCH_CARPET_LIGHT_GRAY.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_BIRCH_CARPET_LIME.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_BIRCH_CARPET_MAGENTA.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_BIRCH_CARPET_ORANGE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_BIRCH_CARPET_PARTIAL_BLACK.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_BIRCH_CARPET_PARTIAL_BLUE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_BIRCH_CARPET_PARTIAL_BROWN.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_BIRCH_CARPET_PARTIAL_CYAN.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_BIRCH_CARPET_PARTIAL_GRAY.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_BIRCH_CARPET_PARTIAL_GREEN.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_BIRCH_CARPET_PARTIAL_LIGHT_BLUE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_BIRCH_CARPET_PARTIAL_LIGHT_GRAY.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_BIRCH_CARPET_PARTIAL_LIME.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_BIRCH_CARPET_PARTIAL_MAGENTA.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_BIRCH_CARPET_PARTIAL_ORANGE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_BIRCH_CARPET_PARTIAL_PINK.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_BIRCH_CARPET_PARTIAL_PURPLE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_BIRCH_CARPET_PARTIAL_RED.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_BIRCH_CARPET_PARTIAL_WHITE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_BIRCH_CARPET_PARTIAL_YELLOW.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_BIRCH_CARPET_PINK.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_BIRCH_CARPET_PURPLE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_BIRCH_CARPET_RED.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_BIRCH_CARPET_WHITE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_BIRCH_CARPET_YELLOW.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_CRIMSON_CARPET_BLACK.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_CRIMSON_CARPET_BLUE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_CRIMSON_CARPET_BROWN.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_CRIMSON_CARPET_CYAN.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_CRIMSON_CARPET_GRAY.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_CRIMSON_CARPET_GREEN.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_CRIMSON_CARPET_LIGHT_BLUE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_CRIMSON_CARPET_LIGHT_GRAY.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_CRIMSON_CARPET_LIME.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_CRIMSON_CARPET_MAGENTA.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_CRIMSON_CARPET_ORANGE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_CRIMSON_CARPET_PARTIAL_BLACK.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_CRIMSON_CARPET_PARTIAL_BLUE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_CRIMSON_CARPET_PARTIAL_BROWN.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_CRIMSON_CARPET_PARTIAL_CYAN.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_CRIMSON_CARPET_PARTIAL_GRAY.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_CRIMSON_CARPET_PARTIAL_GREEN.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_CRIMSON_CARPET_PARTIAL_LIGHT_BLUE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_CRIMSON_CARPET_PARTIAL_LIGHT_GRAY.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_CRIMSON_CARPET_PARTIAL_LIME.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_CRIMSON_CARPET_PARTIAL_MAGENTA.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_CRIMSON_CARPET_PARTIAL_ORANGE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_CRIMSON_CARPET_PARTIAL_PINK.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_CRIMSON_CARPET_PARTIAL_PURPLE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_CRIMSON_CARPET_PARTIAL_RED.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_CRIMSON_CARPET_PARTIAL_WHITE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_CRIMSON_CARPET_PARTIAL_YELLOW.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_CRIMSON_CARPET_PINK.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_CRIMSON_CARPET_PURPLE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_CRIMSON_CARPET_RED.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_CRIMSON_CARPET_WHITE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_CRIMSON_CARPET_YELLOW.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_DARK_OAK_CARPET_BLACK.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_DARK_OAK_CARPET_BLUE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_DARK_OAK_CARPET_BROWN.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_DARK_OAK_CARPET_CYAN.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_DARK_OAK_CARPET_GRAY.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_DARK_OAK_CARPET_GREEN.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_DARK_OAK_CARPET_LIGHT_BLUE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_DARK_OAK_CARPET_LIGHT_GRAY.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_DARK_OAK_CARPET_LIME.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_DARK_OAK_CARPET_MAGENTA.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_DARK_OAK_CARPET_ORANGE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_DARK_OAK_CARPET_PARTIAL_BLACK.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_DARK_OAK_CARPET_PARTIAL_BLUE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_DARK_OAK_CARPET_PARTIAL_BROWN.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_DARK_OAK_CARPET_PARTIAL_CYAN.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_DARK_OAK_CARPET_PARTIAL_GRAY.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_DARK_OAK_CARPET_PARTIAL_GREEN.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_DARK_OAK_CARPET_PARTIAL_LIGHT_BLUE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_DARK_OAK_CARPET_PARTIAL_LIGHT_GRAY.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_DARK_OAK_CARPET_PARTIAL_LIME.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_DARK_OAK_CARPET_PARTIAL_MAGENTA.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_DARK_OAK_CARPET_PARTIAL_ORANGE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_DARK_OAK_CARPET_PARTIAL_PINK.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_DARK_OAK_CARPET_PARTIAL_PURPLE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_DARK_OAK_CARPET_PARTIAL_RED.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_DARK_OAK_CARPET_PARTIAL_WHITE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_DARK_OAK_CARPET_PARTIAL_YELLOW.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_DARK_OAK_CARPET_PINK.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_DARK_OAK_CARPET_PURPLE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_DARK_OAK_CARPET_RED.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_DARK_OAK_CARPET_WHITE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_DARK_OAK_CARPET_YELLOW.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_JUNGLE_CARPET_BLACK.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_JUNGLE_CARPET_BLUE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_JUNGLE_CARPET_BROWN.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_JUNGLE_CARPET_CYAN.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_JUNGLE_CARPET_GRAY.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_JUNGLE_CARPET_GREEN.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_JUNGLE_CARPET_LIGHT_BLUE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_JUNGLE_CARPET_LIGHT_GRAY.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_JUNGLE_CARPET_LIME.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_JUNGLE_CARPET_MAGENTA.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_JUNGLE_CARPET_ORANGE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_JUNGLE_CARPET_PARTIAL_BLACK.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_JUNGLE_CARPET_PARTIAL_BLUE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_JUNGLE_CARPET_PARTIAL_BROWN.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_JUNGLE_CARPET_PARTIAL_CYAN.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_JUNGLE_CARPET_PARTIAL_GRAY.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_JUNGLE_CARPET_PARTIAL_GREEN.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_JUNGLE_CARPET_PARTIAL_LIGHT_BLUE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_JUNGLE_CARPET_PARTIAL_LIGHT_GRAY.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_JUNGLE_CARPET_PARTIAL_LIME.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_JUNGLE_CARPET_PARTIAL_MAGENTA.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_JUNGLE_CARPET_PARTIAL_ORANGE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_JUNGLE_CARPET_PARTIAL_PINK.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_JUNGLE_CARPET_PARTIAL_PURPLE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_JUNGLE_CARPET_PARTIAL_RED.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_JUNGLE_CARPET_PARTIAL_WHITE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_JUNGLE_CARPET_PARTIAL_YELLOW.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_JUNGLE_CARPET_PINK.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_JUNGLE_CARPET_PURPLE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_JUNGLE_CARPET_RED.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_JUNGLE_CARPET_WHITE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_JUNGLE_CARPET_YELLOW.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_OAK_CARPET_BLACK.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_OAK_CARPET_BLUE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_OAK_CARPET_BROWN.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_OAK_CARPET_CYAN.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_OAK_CARPET_GRAY.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_OAK_CARPET_GREEN.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_OAK_CARPET_LIGHT_BLUE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_OAK_CARPET_LIGHT_GRAY.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_OAK_CARPET_LIME.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_OAK_CARPET_MAGENTA.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_OAK_CARPET_ORANGE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_OAK_CARPET_PARTIAL_BLACK.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_OAK_CARPET_PARTIAL_BLUE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_OAK_CARPET_PARTIAL_BROWN.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_OAK_CARPET_PARTIAL_CYAN.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_OAK_CARPET_PARTIAL_GRAY.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_OAK_CARPET_PARTIAL_GREEN.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_OAK_CARPET_PARTIAL_LIGHT_BLUE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_OAK_CARPET_PARTIAL_LIGHT_GRAY.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_OAK_CARPET_PARTIAL_LIME.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_OAK_CARPET_PARTIAL_MAGENTA.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_OAK_CARPET_PARTIAL_ORANGE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_OAK_CARPET_PARTIAL_PINK.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_OAK_CARPET_PARTIAL_PURPLE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_OAK_CARPET_PARTIAL_RED.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_OAK_CARPET_PARTIAL_WHITE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_OAK_CARPET_PARTIAL_YELLOW.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_OAK_CARPET_PINK.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_OAK_CARPET_PURPLE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_OAK_CARPET_RED.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_OAK_CARPET_WHITE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_OAK_CARPET_YELLOW.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_SPRUCE_CARPET_BLACK.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_SPRUCE_CARPET_BLUE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_SPRUCE_CARPET_BROWN.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_SPRUCE_CARPET_CYAN.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_SPRUCE_CARPET_GRAY.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_SPRUCE_CARPET_GREEN.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_SPRUCE_CARPET_LIGHT_BLUE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_SPRUCE_CARPET_LIGHT_GRAY.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_SPRUCE_CARPET_LIME.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_SPRUCE_CARPET_MAGENTA.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_SPRUCE_CARPET_ORANGE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_SPRUCE_CARPET_PARTIAL_BLACK.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_SPRUCE_CARPET_PARTIAL_BLUE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_SPRUCE_CARPET_PARTIAL_BROWN.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_SPRUCE_CARPET_PARTIAL_CYAN.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_SPRUCE_CARPET_PARTIAL_GRAY.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_SPRUCE_CARPET_PARTIAL_GREEN.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_SPRUCE_CARPET_PARTIAL_LIGHT_BLUE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_SPRUCE_CARPET_PARTIAL_LIGHT_GRAY.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_SPRUCE_CARPET_PARTIAL_LIME.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_SPRUCE_CARPET_PARTIAL_MAGENTA.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_SPRUCE_CARPET_PARTIAL_ORANGE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_SPRUCE_CARPET_PARTIAL_PINK.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_SPRUCE_CARPET_PARTIAL_PURPLE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_SPRUCE_CARPET_PARTIAL_RED.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_SPRUCE_CARPET_PARTIAL_WHITE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_SPRUCE_CARPET_PARTIAL_YELLOW.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_SPRUCE_CARPET_PINK.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_SPRUCE_CARPET_PURPLE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_SPRUCE_CARPET_RED.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_SPRUCE_CARPET_WHITE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_SPRUCE_CARPET_YELLOW.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIRS_TERRACOTTA_BLACK.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIRS_TERRACOTTA_BLUE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIRS_TERRACOTTA_BROWN.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIRS_TERRACOTTA_CYAN.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIRS_TERRACOTTA_GRAY.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIRS_TERRACOTTA_GREEN.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIRS_TERRACOTTA_LIGHT_BLUE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIRS_TERRACOTTA_LIGHT_GRAY.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIRS_TERRACOTTA_LIME.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIRS_TERRACOTTA_MAGENTA.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIRS_TERRACOTTA_ORANGE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIRS_TERRACOTTA_PINK.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIRS_TERRACOTTA_PURPLE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIRS_TERRACOTTA_RED.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIRS_TERRACOTTA_WHITE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIRS_TERRACOTTA_YELLOW.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_WARPED_CARPET_BLACK.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_WARPED_CARPET_BLUE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_WARPED_CARPET_BROWN.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_WARPED_CARPET_CYAN.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_WARPED_CARPET_GRAY.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_WARPED_CARPET_GREEN.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_WARPED_CARPET_LIGHT_BLUE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_WARPED_CARPET_LIGHT_GRAY.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_WARPED_CARPET_LIME.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_WARPED_CARPET_MAGENTA.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_WARPED_CARPET_ORANGE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_WARPED_CARPET_PARTIAL_BLACK.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_WARPED_CARPET_PARTIAL_BLUE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_WARPED_CARPET_PARTIAL_BROWN.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_WARPED_CARPET_PARTIAL_CYAN.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_WARPED_CARPET_PARTIAL_GRAY.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_WARPED_CARPET_PARTIAL_GREEN.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_WARPED_CARPET_PARTIAL_LIGHT_BLUE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_WARPED_CARPET_PARTIAL_LIGHT_GRAY.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_WARPED_CARPET_PARTIAL_LIME.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_WARPED_CARPET_PARTIAL_MAGENTA.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_WARPED_CARPET_PARTIAL_ORANGE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_WARPED_CARPET_PARTIAL_PINK.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_WARPED_CARPET_PARTIAL_PURPLE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_WARPED_CARPET_PARTIAL_RED.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_WARPED_CARPET_PARTIAL_WHITE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_WARPED_CARPET_PARTIAL_YELLOW.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_WARPED_CARPET_PINK.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_WARPED_CARPET_PURPLE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_WARPED_CARPET_RED.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_WARPED_CARPET_WHITE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_WARPED_CARPET_YELLOW.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_WAXED_CUT_COPPER_GLOWING.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_WAXED_EXPOSED_CUT_COPPER_GLOWING.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_WAXED_OXIDIZED_CUT_COPPER_GLOWING.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_WAXED_WEATHERED_CUT_COPPER_GLOWING.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_WEATHERED_CUT_COPPER_GLOWING.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_WOOL_BLACK.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_WOOL_BLUE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_WOOL_BROWN.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_WOOL_CYAN.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_WOOL_GRAY.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_WOOL_GREEN.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_WOOL_LIGHT_BLUE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_WOOL_LIGHT_GRAY.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_WOOL_LIME.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_WOOL_MAGENTA.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_WOOL_ORANGE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_WOOL_PINK.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_WOOL_PURPLE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_WOOL_RED.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_WOOL_WHITE.get());
        this.dropSelf(GrowthcraftDecoBlocks.STAIR_WOOL_YELLOW.get());

        // Iterate over all the simple vanilla glowing blocks.
        GrowthcraftDecoBlocks.GLOWING_VANILLA_BLOCKS.forEach(
                (name, blockRegistryObject) -> {
                    this.dropSelf(blockRegistryObject.get());
                }
        );

        GrowthcraftDecoBlocks.GLOWING_STAIR_BLOCKS.forEach(
                (name, blockRegistryObject) -> {
                    this.dropSelf(blockRegistryObject.get());
                }
        );

        GrowthcraftDecoBlocks.HIDDEN_DOOR_BLOCKS.forEach(
                (name, blockRegistryObject) -> {
                    this.dropSelf(blockRegistryObject.get());
                }
        );

    }

    /**
     * Block drop loot tables that just require silk touch.
     */
    private void silkTouchLootTables() {
        // Silk Touch Required
        this.dropWhenSilkTouch(GrowthcraftDecoBlocks.GLASS_STAINED_BLACK_PANE_GLOWING.get());
        this.dropWhenSilkTouch(GrowthcraftDecoBlocks.GLASS_STAINED_BLUE_PANE_GLOWING.get());
        this.dropWhenSilkTouch(GrowthcraftDecoBlocks.GLASS_STAINED_BROWN_PANE_GLOWING.get());
        this.dropWhenSilkTouch(GrowthcraftDecoBlocks.GLASS_STAINED_CLEAR_PANE_GLOWING.get());
        this.dropWhenSilkTouch(GrowthcraftDecoBlocks.GLASS_STAINED_CYAN_PANE_GLOWING.get());
        this.dropWhenSilkTouch(GrowthcraftDecoBlocks.GLASS_STAINED_GRAY_PANE_GLOWING.get());
        this.dropWhenSilkTouch(GrowthcraftDecoBlocks.GLASS_STAINED_GREEN_PANE_GLOWING.get());
        this.dropWhenSilkTouch(GrowthcraftDecoBlocks.GLASS_STAINED_LIGHT_BLUE_PANE_GLOWING.get());
        this.dropWhenSilkTouch(GrowthcraftDecoBlocks.GLASS_STAINED_LIGHT_GRAY_PANE_GLOWING.get());
        this.dropWhenSilkTouch(GrowthcraftDecoBlocks.GLASS_STAINED_LIME_PANE_GLOWING.get());
        this.dropWhenSilkTouch(GrowthcraftDecoBlocks.GLASS_STAINED_MAGENTA_PANE_GLOWING.get());
        this.dropWhenSilkTouch(GrowthcraftDecoBlocks.GLASS_STAINED_ORANGE_PANE_GLOWING.get());
        this.dropWhenSilkTouch(GrowthcraftDecoBlocks.GLASS_STAINED_PINK_PANE_GLOWING.get());
        this.dropWhenSilkTouch(GrowthcraftDecoBlocks.GLASS_STAINED_PURPLE_PANE_GLOWING.get());
        this.dropWhenSilkTouch(GrowthcraftDecoBlocks.GLASS_STAINED_RED_PANE_GLOWING.get());
        this.dropWhenSilkTouch(GrowthcraftDecoBlocks.GLASS_STAINED_WHITE_PANE_GLOWING.get());
        this.dropWhenSilkTouch(GrowthcraftDecoBlocks.GLASS_STAINED_YELLOW_PANE_GLOWING.get());
        this.dropWhenSilkTouch(GrowthcraftDecoBlocks.GLASS_PANEL_BLACK_GLOWING.get());
        this.dropWhenSilkTouch(GrowthcraftDecoBlocks.GLASS_PANEL_BLUE_GLOWING.get());
        this.dropWhenSilkTouch(GrowthcraftDecoBlocks.GLASS_PANEL_BROWN_GLOWING.get());
        this.dropWhenSilkTouch(GrowthcraftDecoBlocks.GLASS_PANEL_CLEAR_GLOWING.get());
        this.dropWhenSilkTouch(GrowthcraftDecoBlocks.GLASS_PANEL_CYAN_GLOWING.get());
        this.dropWhenSilkTouch(GrowthcraftDecoBlocks.GLASS_PANEL_GRAY_GLOWING.get());
        this.dropWhenSilkTouch(GrowthcraftDecoBlocks.GLASS_PANEL_GREEN_GLOWING.get());
        this.dropWhenSilkTouch(GrowthcraftDecoBlocks.GLASS_PANEL_LIGHT_BLUE_GLOWING.get());
        this.dropWhenSilkTouch(GrowthcraftDecoBlocks.GLASS_PANEL_LIGHT_GRAY_GLOWING.get());
        this.dropWhenSilkTouch(GrowthcraftDecoBlocks.GLASS_PANEL_LIME_GLOWING.get());
        this.dropWhenSilkTouch(GrowthcraftDecoBlocks.GLASS_PANEL_MAGENTA_GLOWING.get());
        this.dropWhenSilkTouch(GrowthcraftDecoBlocks.GLASS_PANEL_ORANGE_GLOWING.get());
        this.dropWhenSilkTouch(GrowthcraftDecoBlocks.GLASS_PANEL_PINK_GLOWING.get());
        this.dropWhenSilkTouch(GrowthcraftDecoBlocks.GLASS_PANEL_PURPLE_GLOWING.get());
        this.dropWhenSilkTouch(GrowthcraftDecoBlocks.GLASS_PANEL_RED_GLOWING.get());
        this.dropWhenSilkTouch(GrowthcraftDecoBlocks.GLASS_PANEL_WHITE_GLOWING.get());
        this.dropWhenSilkTouch(GrowthcraftDecoBlocks.GLASS_PANEL_YELLOW_GLOWING.get());
        this.dropWhenSilkTouch(GrowthcraftDecoBlocks.GLASS_PANEL_BLACK.get());
        this.dropWhenSilkTouch(GrowthcraftDecoBlocks.GLASS_PANEL_BLUE.get());
        this.dropWhenSilkTouch(GrowthcraftDecoBlocks.GLASS_PANEL_BROWN.get());
        this.dropWhenSilkTouch(GrowthcraftDecoBlocks.GLASS_PANEL_CLEAR.get());
        this.dropWhenSilkTouch(GrowthcraftDecoBlocks.GLASS_PANEL_CYAN.get());
        this.dropWhenSilkTouch(GrowthcraftDecoBlocks.GLASS_PANEL_GRAY.get());
        this.dropWhenSilkTouch(GrowthcraftDecoBlocks.GLASS_PANEL_GREEN.get());
        this.dropWhenSilkTouch(GrowthcraftDecoBlocks.GLASS_PANEL_LIGHT_BLUE.get());
        this.dropWhenSilkTouch(GrowthcraftDecoBlocks.GLASS_PANEL_LIGHT_GRAY.get());
        this.dropWhenSilkTouch(GrowthcraftDecoBlocks.GLASS_PANEL_LIME.get());
        this.dropWhenSilkTouch(GrowthcraftDecoBlocks.GLASS_PANEL_MAGENTA.get());
        this.dropWhenSilkTouch(GrowthcraftDecoBlocks.GLASS_PANEL_ORANGE.get());
        this.dropWhenSilkTouch(GrowthcraftDecoBlocks.GLASS_PANEL_PINK.get());
        this.dropWhenSilkTouch(GrowthcraftDecoBlocks.GLASS_PANEL_PURPLE.get());
        this.dropWhenSilkTouch(GrowthcraftDecoBlocks.GLASS_PANEL_RED.get());
        this.dropWhenSilkTouch(GrowthcraftDecoBlocks.GLASS_PANEL_WHITE.get());
        this.dropWhenSilkTouch(GrowthcraftDecoBlocks.GLASS_PANEL_YELLOW.get());
    }

    /**
     * Block loot tables that are slabs and double slabs.
     */
    private void slabLootTables() {
        // Drop Half Slab and/or Double Slab
        this.add(GrowthcraftDecoBlocks.SLAB_GLASS_BLACK.get(), this::createSlabItemTable);
        this.add(GrowthcraftDecoBlocks.SLAB_GLASS_BLUE.get(), this::createSlabItemTable);
        this.add(GrowthcraftDecoBlocks.SLAB_GLASS_BROWN.get(), this::createSlabItemTable);
        this.add(GrowthcraftDecoBlocks.SLAB_GLASS_CLEAR.get(), this::createSlabItemTable);
        this.add(GrowthcraftDecoBlocks.SLAB_GLASS_CYAN.get(), this::createSlabItemTable);
        this.add(GrowthcraftDecoBlocks.SLAB_GLASS_GRAY.get(), this::createSlabItemTable);
        this.add(GrowthcraftDecoBlocks.SLAB_GLASS_GREEN.get(), this::createSlabItemTable);
        this.add(GrowthcraftDecoBlocks.SLAB_GLASS_LIGHT_BLUE.get(), this::createSlabItemTable);
        this.add(GrowthcraftDecoBlocks.SLAB_GLASS_LIGHT_GRAY.get(), this::createSlabItemTable);
        this.add(GrowthcraftDecoBlocks.SLAB_GLASS_LIME.get(), this::createSlabItemTable);
        this.add(GrowthcraftDecoBlocks.SLAB_GLASS_MAGENTA.get(), this::createSlabItemTable);
        this.add(GrowthcraftDecoBlocks.SLAB_GLASS_ORANGE.get(), this::createSlabItemTable);
        this.add(GrowthcraftDecoBlocks.SLAB_GLASS_PINK.get(), this::createSlabItemTable);
        this.add(GrowthcraftDecoBlocks.SLAB_GLASS_PURPLE.get(), this::createSlabItemTable);
        this.add(GrowthcraftDecoBlocks.SLAB_GLASS_RED.get(), this::createSlabItemTable);
        this.add(GrowthcraftDecoBlocks.SLAB_GLASS_WHITE.get(), this::createSlabItemTable);
        this.add(GrowthcraftDecoBlocks.SLAB_GLASS_YELLOW.get(), this::createSlabItemTable);
        this.add(GrowthcraftDecoBlocks.SLAB_GLASS_BLACK_GLOWING.get(), this::createSlabItemTable);
        this.add(GrowthcraftDecoBlocks.SLAB_GLASS_BLUE_GLOWING.get(), this::createSlabItemTable);
        this.add(GrowthcraftDecoBlocks.SLAB_GLASS_BROWN_GLOWING.get(), this::createSlabItemTable);
        this.add(GrowthcraftDecoBlocks.SLAB_GLASS_CLEAR_GLOWING.get(), this::createSlabItemTable);
        this.add(GrowthcraftDecoBlocks.SLAB_GLASS_CYAN_GLOWING.get(), this::createSlabItemTable);
        this.add(GrowthcraftDecoBlocks.SLAB_GLASS_GRAY_GLOWING.get(), this::createSlabItemTable);
        this.add(GrowthcraftDecoBlocks.SLAB_GLASS_GREEN_GLOWING.get(), this::createSlabItemTable);
        this.add(GrowthcraftDecoBlocks.SLAB_GLASS_LIGHT_BLUE_GLOWING.get(), this::createSlabItemTable);
        this.add(GrowthcraftDecoBlocks.SLAB_GLASS_LIGHT_GRAY_GLOWING.get(), this::createSlabItemTable);
        this.add(GrowthcraftDecoBlocks.SLAB_GLASS_LIME_GLOWING.get(), this::createSlabItemTable);
        this.add(GrowthcraftDecoBlocks.SLAB_GLASS_MAGENTA_GLOWING.get(), this::createSlabItemTable);
        this.add(GrowthcraftDecoBlocks.SLAB_GLASS_ORANGE_GLOWING.get(), this::createSlabItemTable);
        this.add(GrowthcraftDecoBlocks.SLAB_GLASS_PINK_GLOWING.get(), this::createSlabItemTable);
        this.add(GrowthcraftDecoBlocks.SLAB_GLASS_PURPLE_GLOWING.get(), this::createSlabItemTable);
        this.add(GrowthcraftDecoBlocks.SLAB_GLASS_RED_GLOWING.get(), this::createSlabItemTable);
        this.add(GrowthcraftDecoBlocks.SLAB_GLASS_WHITE_GLOWING.get(), this::createSlabItemTable);
        this.add(GrowthcraftDecoBlocks.SLAB_GLASS_YELLOW_GLOWING.get(), this::createSlabItemTable);
        this.add(GrowthcraftDecoBlocks.SLAB_GLOWSHROOM.get(), this::createSlabItemTable);
        this.add(GrowthcraftDecoBlocks.SLAB_GLOWSTONE.get(), this::createSlabItemTable);
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return GrowthcraftDecoBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }

}
