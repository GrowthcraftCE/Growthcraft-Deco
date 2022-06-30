package growthcraft.deco.common.block;

import growthcraft.deco.lib.block.HalfBlock;
import growthcraft.deco.utils.BlockPropertiesUtils;
import net.minecraft.world.level.block.Blocks;

public class StoneHalfBlock extends HalfBlock {
    public StoneHalfBlock() {
        this(0);
    }

    public StoneHalfBlock(int lightLevel) {
        super(BlockPropertiesUtils.getInitProperties("stone_slab", Blocks.GLASS_PANE), lightLevel);
    }
}
