package growthcraft.deco.block;

import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;

import java.util.function.Supplier;

public class CarpetStairBlock extends StairBlock {

    public CarpetStairBlock(BlockState state, Properties properties) {
        super(state, properties);
    }

    public CarpetStairBlock(Supplier<BlockState> state, Properties properties) {
        super(state, properties);
    }

}