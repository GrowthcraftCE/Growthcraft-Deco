package growthcraft.deco.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StainedGlassPaneBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

public class GlassPane extends StainedGlassPaneBlock {

    private int lightLevel = 0;

    public GlassPane(DyeColor dyeColor) {
        this(dyeColor, 15);
    }

    public GlassPane(DyeColor dyeColor, int lightLevel) {
        super(dyeColor, BlockBehaviour.Properties.of().strength(0.3F).sound(SoundType.GLASS).noOcclusion());
        this.lightLevel = lightLevel;
    }

    @Override
    public int getLightEmission(BlockState state, BlockGetter level, BlockPos pos) {
        return this.lightLevel > 0 ? lightLevel : super.getLightEmission(state, level, pos);
    }

}
