package growthcraft.deco.lib.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockState;

public class HalfBlock extends SlabBlock {

    private int lightLevel = 0;

    public HalfBlock(Properties properties) {
        super(properties);
        this.lightLevel = 0;
    }

    public HalfBlock(Properties properties, int lightLevel) {
        this(properties);
        this.lightLevel = lightLevel;
    }

    @Override
    public int getLightEmission(BlockState state, BlockGetter level, BlockPos pos) {
        return this.lightLevel > 0 ? lightLevel : super.getLightEmission(state, level, pos);
    }
}