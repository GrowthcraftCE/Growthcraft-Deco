package growthcraft.deco.common.block;

import growthcraft.lib.common.block.PanelBlock;
import growthcraft.lib.utils.SoundUtils;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

public class GlassPanel extends PanelBlock {

    private static final Material MATERIAL_GLASS = Material.GLASS;

    private int lightLevel = 0;

    public GlassPanel() {
        super(getInitProperties());
    }

    public GlassPanel(int lightLevel) {
        this();
        this.lightLevel = lightLevel;
    }

    private static Properties getInitProperties() {
        Properties properties = Properties.create(MATERIAL_GLASS);
        properties.hardnessAndResistance(0.3F, 0.3F);
        properties.sound(SoundUtils.getSoundFromMaterial(MATERIAL_GLASS));
        properties.notSolid();
        properties.setAllowsSpawn(Blocks::neverAllowSpawn);
        properties.setOpaque(Blocks::isntSolid);
        properties.setBlocksVision(Blocks::isntSolid);
        return properties;
    }

    @Override
    public int getLightValue(BlockState state, IBlockReader world, BlockPos pos) {
        return this.lightLevel > 0 ? lightLevel : super.getLightValue(state, world, pos);
    }

}
