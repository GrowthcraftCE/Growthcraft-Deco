package growthcraft.deco.block;

import growthcraft.deco.lib.block.PanelBlock;
import growthcraft.deco.utils.BlockPropertiesUtils;
import net.minecraft.world.level.block.Blocks;

public class GlassPanel extends PanelBlock {

    public GlassPanel() {
        this(0);
    }

    public GlassPanel(int lightLevel) {
        super(BlockPropertiesUtils.getInitProperties("glass_panel", Blocks.GLASS_PANE), lightLevel);
    }

}