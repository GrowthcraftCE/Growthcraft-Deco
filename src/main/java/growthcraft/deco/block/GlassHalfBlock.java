package growthcraft.deco.block;

import growthcraft.deco.lib.block.HalfBlock;
import growthcraft.deco.utils.BlockPropertiesUtils;
import net.minecraft.world.level.block.Blocks;

public class GlassHalfBlock extends HalfBlock {
    public GlassHalfBlock() {
        this(0);
    }

    public GlassHalfBlock(int lightLevel) {
        super(BlockPropertiesUtils.getInitProperties("glass_slab", Blocks.GLASS_PANE), lightLevel);
    }
}