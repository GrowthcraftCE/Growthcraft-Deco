package growthcraft.deco.common.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

public class GlowShroomSlab extends SlabBlock {

    public GlowShroomSlab() {
        this(getInitProperties(Material.ORGANIC));
    }

    public GlowShroomSlab(Properties properties) {
        super(properties);
    }

    private static Properties getInitProperties(Material material) {
        Properties properties = Properties.create(material);
        properties.hardnessAndResistance(1.0F, 1.0F);
        properties.sound(SoundType.SHROOMLIGHT);
        properties.setAllowsSpawn(Blocks::neverAllowSpawn);
        return properties;
    }

    @Override
    public int getLightValue(BlockState state, IBlockReader world, BlockPos pos) {
        return 15;
    }
}
