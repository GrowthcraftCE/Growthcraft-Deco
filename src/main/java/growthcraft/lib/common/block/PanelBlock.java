package growthcraft.lib.common.block;

import growthcraft.lib.utils.SoundUtils;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.HorizontalFaceBlock;
import net.minecraft.block.material.Material;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.AttachFace;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;

public class PanelBlock extends HorizontalFaceBlock {

    protected static final VoxelShape AABB_CEILING = Block.makeCuboidShape(0.0D, 15.0D, 0.0D, 16.0D, 16.0D, 16.0D);
    protected static final VoxelShape AABB_FLOOR = Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 1.0D, 16.0D);
    protected static final VoxelShape AABB_NORTH = Block.makeCuboidShape(0.0D, 0.0D, 15.0D, 16.0D, 16.0D, 16.0D);
    protected static final VoxelShape AABB_SOUTH = Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 1.0D);
    protected static final VoxelShape AABB_WEST = Block.makeCuboidShape(15.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D);
    protected static final VoxelShape AABB_EAST = Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 1.0D, 16.0D, 16.0D);

    public PanelBlock(Properties properties) {
        super(properties);
        this.setDefaultState(this.stateContainer.getBaseState().with(HORIZONTAL_FACING, Direction.NORTH).with(FACE, AttachFace.WALL));
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(HORIZONTAL_FACING, FACE);
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        Direction direction = state.get(HORIZONTAL_FACING);
        switch (state.get(FACE)) {
            case FLOOR:
                return AABB_FLOOR;
            case WALL:
                switch (direction) {
                    case EAST:
                        return AABB_EAST;
                    case WEST:
                        return AABB_WEST;
                    case SOUTH:
                        return AABB_SOUTH;
                    case NORTH:
                    default:
                        return AABB_NORTH;
                }
            case CEILING:
            default:
                return AABB_CEILING;
        }
    }

    @Override
    public boolean isValidPosition(BlockState state, IWorldReader worldIn, BlockPos pos) {
        return true;
    }
}
