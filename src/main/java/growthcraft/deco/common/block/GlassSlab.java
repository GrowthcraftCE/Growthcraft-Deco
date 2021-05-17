package growthcraft.deco.common.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.Direction;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class GlassSlab extends SlabBlock {

    public GlassSlab() {
        this(getInitProperties(Material.GLASS));
    }

    public GlassSlab(Properties properties) {
        super(properties);
    }

    private static Properties getInitProperties(Material material) {
        Properties properties = Properties.create(material);
        properties.hardnessAndResistance(0.3F, 0.3F);
        properties.sound(SoundType.GLASS);
        properties.notSolid();
        return properties;
    }

    @OnlyIn(Dist.CLIENT)
    public boolean isSideInvisible(BlockState state, BlockState adjacentBlockState, Direction side) {
        return false;
    }

}
