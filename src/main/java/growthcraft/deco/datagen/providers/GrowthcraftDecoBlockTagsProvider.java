package growthcraft.deco.datagen.providers;

import growthcraft.deco.init.GrowthcraftDecoBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.Registry;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;
import java.util.concurrent.CompletableFuture;

public class GrowthcraftDecoBlockTagsProvider extends TagsProvider<Block> {

    public GrowthcraftDecoBlockTagsProvider(PackOutput packOutput,
                                            ResourceKey<? extends Registry<Block>> registryKey,
                                            CompletableFuture<HolderLookup.Provider> lookupProvider,
                                            String modId,
                                            @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, registryKey, lookupProvider, modId, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        GrowthcraftDecoBlocks.GLOWING_VANILLA_BLOCKS_MINEABLE_PICKAXE.forEach((unlocalizedName, block) -> {
                    tag(BlockTags.MINEABLE_WITH_PICKAXE).add(Objects.requireNonNull(block.getKey()));
                }
        );

        GrowthcraftDecoBlocks.GLOWING_VANILLA_BLOCKS_MINEABLE_AXE.forEach((unlocalizedName, block) -> {
                    tag(BlockTags.MINEABLE_WITH_AXE).add(Objects.requireNonNull(block.getKey()));
                }
        );

    }


    private void addMineableTags(ResourceKey<Block> blockResourceKey, String tool) {
        if (Objects.equals(tool, "pickaxe")) {
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(blockResourceKey);
        } else if (Objects.equals(tool, "axe")) {
            tag(BlockTags.MINEABLE_WITH_AXE).add(blockResourceKey);
        }
    }

}
