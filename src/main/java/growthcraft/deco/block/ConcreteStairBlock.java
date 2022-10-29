package growthcraft.deco.block;

import growthcraft.deco.utils.BlockPropertiesUtils;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

import java.util.function.Supplier;

public class ConcreteStairBlock extends StairBlock {

    public ConcreteStairBlock() {
        this(
                Blocks.STONE_STAIRS.defaultBlockState(),
                BlockPropertiesUtils.getInitProperties("concrete_stairs", Blocks.STONE_STAIRS)
        );
    }

    public ConcreteStairBlock(BlockState state, BlockBehaviour.Properties properties) {
        super(state, properties);
    }

    public ConcreteStairBlock(Supplier<BlockState> state, Properties properties) {
        super(state, properties);
    }
}
