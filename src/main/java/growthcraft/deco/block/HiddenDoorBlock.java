package growthcraft.deco.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class HiddenDoorBlock extends DoorBlock {

    public HiddenDoorBlock(Block block, BlockSetType blockSetType) {
        this(Properties.copy(block), blockSetType);
    }

    public HiddenDoorBlock(Properties properties, BlockSetType blockSetType) {
        super(properties, blockSetType);
    }

}
