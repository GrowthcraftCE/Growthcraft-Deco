package growthcraft.deco.common.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

public class GlowSlab extends SlabBlock {

    public GlowSlab() {
        this(getInitProperties(Material.GLASS));
    }

    public GlowSlab(Properties properties) {
        super(properties);
    }

    private static Properties getInitProperties(Material material) {
        Properties properties = Properties.create(material);
        properties.hardnessAndResistance(1.0F, 1.0F);
        properties.sound(SoundType.GLASS);
        properties.notSolid();
        properties.setAllowsSpawn(Blocks::neverAllowSpawn);
        properties.setOpaque(Blocks::isntSolid);
        properties.setBlocksVision(Blocks::isntSolid);
        return properties;
    }

    @Override
    public int getLightValue(BlockState state, IBlockReader world, BlockPos pos) {
        return 15;
    }
}
