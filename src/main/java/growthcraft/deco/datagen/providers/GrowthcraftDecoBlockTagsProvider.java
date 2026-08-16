package growthcraft.deco.datagen.providers;

import growthcraft.deco.init.GrowthcraftDecoBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.BlockTagsProvider;

import java.util.Objects;
import java.util.concurrent.CompletableFuture;

public class GrowthcraftDecoBlockTagsProvider extends BlockTagsProvider {

    public GrowthcraftDecoBlockTagsProvider(PackOutput packOutput,
                                            CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(packOutput, lookupProvider, growthcraft.deco.shared.Reference.MODID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        GrowthcraftDecoBlocks.BLOCKS_MINEABLE_PICKAXE.forEach((unlocalizedName, block) -> {
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(block.get());
        });

        GrowthcraftDecoBlocks.BLOCKS_MINEABLE_AXE.forEach((unlocalizedName, block) -> {
            tag(BlockTags.MINEABLE_WITH_AXE).add(block.get());
        });

    }

}
