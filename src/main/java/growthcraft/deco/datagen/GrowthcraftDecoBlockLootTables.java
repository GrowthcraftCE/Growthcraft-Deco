package growthcraft.deco.datagen;

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
        // Simple Self Drop
        this.dropSelf(GrowthcraftDecoBlocks.CONCRETE_STAIRS_BLACK.get());

        // Silk Touch Required
        this.dropWhenSilkTouch(GrowthcraftDecoBlocks.GLASS_PANE_BLACK_GLOWING.get());

        // TODO: Drop Half Slab and/or Double Slab

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return GrowthcraftDecoBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
