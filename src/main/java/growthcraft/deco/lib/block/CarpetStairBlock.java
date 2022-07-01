package growthcraft.deco.lib.block;

import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;

import java.util.function.Supplier;

public class CarpetStairBlock extends StairBlock {

    @SuppressWarnings("deprecation")
    public CarpetStairBlock(BlockState state, Properties properties) {
        super(state, properties);
    }

    public CarpetStairBlock(Supplier<BlockState> state, Properties properties) {
        super(state, properties);
    }

}
