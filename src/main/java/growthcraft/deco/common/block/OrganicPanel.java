package growthcraft.deco.common.block;

import growthcraft.deco.lib.block.PanelBlock;
import growthcraft.deco.utils.BlockPropertiesUtils;
import net.minecraft.world.level.block.Blocks;

public class OrganicPanel extends PanelBlock {

    public OrganicPanel() {
        super(BlockPropertiesUtils.getInitProperties("organic_panel", Blocks.GLASS_PANE), 0);
    }

    public OrganicPanel(int lightLevel) {
        super(BlockPropertiesUtils.getInitProperties("organic_panel", Blocks.GLASS_PANE), lightLevel);
    }

}
