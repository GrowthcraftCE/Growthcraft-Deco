package growthcraft.deco.block;

import growthcraft.deco.utils.BlockPropertiesUtils;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;

import java.util.function.Supplier;

public class TerracottaStairBlock extends StairBlock {

    public TerracottaStairBlock() {
        this(
                Blocks.STONE_STAIRS.defaultBlockState(),
                BlockPropertiesUtils.getInitProperties("terracotta_stairs", Blocks.STONE_STAIRS)
        );
    }

    public TerracottaStairBlock(BlockState state, Properties properties) {
        super(state, properties);

    }

    public TerracottaStairBlock(Supplier<BlockState> state, Properties properties) {
        super(state, properties);
    }
}