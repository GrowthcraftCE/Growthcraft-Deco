package growthcraft.deco.block;

import growthcraft.deco.utils.BlockPropertiesUtils;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

import java.util.function.Supplier;

public class WoolStairBlock extends StairBlock {

    public WoolStairBlock() {
        this(
                Blocks.OAK_STAIRS.defaultBlockState(),
                BlockPropertiesUtils.getInitProperties("wool_stairs", Blocks.WHITE_WOOL)
        );
    }

    public WoolStairBlock(BlockState state, BlockBehaviour.Properties properties) {
        super(state, properties);

    }

    public WoolStairBlock(Supplier<BlockState> state, Properties properties) {
        super(state, properties);
    }
}