package growthcraft.deco.utils;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

public class BlockPropertiesUtils {

    /**
     * Generate the initial block properties for the given block.
     *
     * @param blockType String with block type criteria.
     * @param block     Block to base the block properties from.
     * @return Customized block properties.
     */
    public static BlockBehaviour.Properties getInitProperties(String blockType, Block block) {
        BlockBehaviour.Properties properties = BlockBehaviour.Properties.copy(block);

        switch (blockType) {
            case "concrete_stairs" -> {
                properties.sound(SoundType.STONE);
                properties.strength(1.8F, 1.8F);
            }
            case "glass_panel", "glass_slab" -> {
                properties.sound(SoundType.GLASS);
                properties.strength(0.3F, 0.3F);
                properties.noOcclusion();
                properties.isValidSpawn(BlockPropertiesUtils::never);
                properties.isRedstoneConductor(BlockPropertiesUtils::never);
                properties.isSuffocating(BlockPropertiesUtils::never);
                properties.isViewBlocking(BlockPropertiesUtils::never);
            }
            case "organic_panel" -> {
                properties.sound(SoundType.SHROOMLIGHT);
                properties.strength(0.3F, 0.3F);
                properties.noOcclusion();
                properties.isValidSpawn(BlockPropertiesUtils::never);
                properties.isRedstoneConductor(BlockPropertiesUtils::never);
                properties.isSuffocating(BlockPropertiesUtils::never);
                properties.isViewBlocking(BlockPropertiesUtils::never);
            }
            case "stone_slab" -> {
                properties.sound(SoundType.STONE);
                properties.strength(2.0F, 6.0F);
                properties.noOcclusion();
                properties.isValidSpawn(BlockPropertiesUtils::never);
                properties.isRedstoneConductor(BlockPropertiesUtils::never);
                properties.isSuffocating(BlockPropertiesUtils::never);
                properties.isViewBlocking(BlockPropertiesUtils::never);
            }
            case "organic_slab" -> {
                properties.sound(SoundType.SHROOMLIGHT);
                properties.strength(1.0F, 1.0F);
                properties.noOcclusion();
                properties.isValidSpawn(BlockPropertiesUtils::never);
                properties.isRedstoneConductor(BlockPropertiesUtils::never);
                properties.isSuffocating(BlockPropertiesUtils::never);
                properties.isViewBlocking(BlockPropertiesUtils::never);
            }
            case "terracotta_stairs" -> {
                properties.sound(SoundType.STONE);
                properties.strength(1.25F, 4.2F);
            }
            case "wool_stairs" -> {
                properties.sound(SoundType.WOOL);
                properties.strength(0.8F, 0.8F);
            }
            default -> {
                // Do nothing.
            }
        }

        return properties;
    }

    private static Boolean never(BlockState state, BlockGetter world, BlockPos pos, EntityType<?> entity) {
        return BlockPropertiesUtils.never(state, world, pos);
    }

    private static Boolean always(BlockState state, BlockGetter world, BlockPos pos, EntityType<?> entity) {
        return BlockPropertiesUtils.always(state, world, pos);
    }

    private static boolean always(BlockState state, BlockGetter world, BlockPos pos) {
        return true;
    }

    private static boolean never(BlockState state, BlockGetter world, BlockPos pos) {
        return false;
    }
}