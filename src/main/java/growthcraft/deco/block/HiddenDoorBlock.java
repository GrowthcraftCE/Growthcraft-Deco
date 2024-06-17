package growthcraft.deco.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class HiddenDoorBlock extends DoorBlock {

    public HiddenDoorBlock(Block block, BlockSetType blockSetType) {
        this(blockSetType, Properties.ofFullCopy(block));
    }

    public HiddenDoorBlock(BlockSetType blockSetType, Properties properties) {
        super(blockSetType, properties);
    }

}
