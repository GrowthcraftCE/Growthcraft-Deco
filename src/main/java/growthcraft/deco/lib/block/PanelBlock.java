package growthcraft.deco.lib.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FaceAttachedHorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.AttachFace;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class PanelBlock extends FaceAttachedHorizontalDirectionalBlock {
    protected static final VoxelShape AABB_CEILING = Block.box(
            0.0D, 15.0D, 0.0D,
            16.0D, 16.0D, 16.0D
    );
    protected static final VoxelShape AABB_EAST = Block.box(
            0.0D, 0.0D, 0.0D,
            1.0D, 16.0D, 16.0D
    );
    protected static final VoxelShape AABB_FLOOR = Block.box(
            0.0D, 0.0D, 0.0D,
            16.0D, 1.0D, 16.0D
    );
    protected static final VoxelShape AABB_NORTH = Block.box(
            0.0D, 0.0D, 15.0D,
            16.0D, 16.0D, 16.0D
    );
    protected static final VoxelShape AABB_SOUTH = Block.box(
            0.0D, 0.0D, 0.0D,
            16.0D, 16.0D, 1.0D
    );
    protected static final VoxelShape AABB_WEST = Block.box(
            15.0D, 0.0D, 0.0D,
            16.0D, 16.0D, 16.0D
    );
    private int lightLevel = 0;

    public PanelBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(FACE, AttachFace.WALL));
        this.lightLevel = 0;
    }

    public PanelBlock(Properties properties, int lightLevel) {
        this(properties);
        this.lightLevel = lightLevel;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, FACE);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter worldIn, BlockPos pos, CollisionContext context) {
        Direction direction = state.getValue(FACING);

        switch (state.getValue(FACE)) {
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
    public int getLightEmission(BlockState state, BlockGetter level, BlockPos pos) {
        return this.lightLevel > 0 ? lightLevel : super.getLightEmission(state, level, pos);
    }

    @Override
    public boolean canSurvive(BlockState p_53186_, LevelReader p_53187_, BlockPos p_53188_) {
        return true;
    }
}
