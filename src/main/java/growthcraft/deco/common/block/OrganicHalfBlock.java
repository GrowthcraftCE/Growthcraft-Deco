package growthcraft.deco.common.block;

import growthcraft.deco.lib.block.HalfBlock;
import growthcraft.deco.utils.BlockPropertiesUtils;
import net.minecraft.world.level.block.Blocks;

public class OrganicHalfBlock extends HalfBlock {
    public OrganicHalfBlock() {
        this(0);
    }

    public OrganicHalfBlock(int lightLevel) {
        super(BlockPropertiesUtils.getInitProperties("organic_slab", Blocks.GLASS_PANE), lightLevel);
    }
}
