package growthcraft.deco.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

import java.util.function.Supplier;

public class GlowingStairBlock extends StairBlock {

    private int lightLevel = 0;

    public GlowingStairBlock(BlockState state, BlockBehaviour.Properties properties) {
        super(state, properties);
        this.lightLevel = 15;
    }

    public GlowingStairBlock(BlockState state, BlockBehaviour.Properties properties, int lightLevel) {
        super(state, properties);
        this.lightLevel = lightLevel;
    }

    public GlowingStairBlock(Supplier<BlockState> state, Properties properties, int lightLevel) {
        this(state, properties);
        this.lightLevel = lightLevel;
    }

    public GlowingStairBlock(Supplier<BlockState> state, Properties properties) {
        super(state, properties);
    }

    @Override
    public int getLightEmission(BlockState state, BlockGetter level, BlockPos pos) {
        return this.lightLevel > 0 ? lightLevel : super.getLightEmission(state, level, pos);
    }

}
