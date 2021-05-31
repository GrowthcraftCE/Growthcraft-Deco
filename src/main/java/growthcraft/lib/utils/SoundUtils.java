package growthcraft.lib.utils;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class SoundUtils {

    private SoundUtils() { /* Prevent default public constructor */ }

    public static SoundType getSoundFromMaterial(Material material) {
        if (material == Material.GLASS) {
            return SoundType.GLASS;
        }
        if (material == Material.ORGANIC) {
            return SoundType.SHROOMLIGHT;
        }
        return SoundType.STONE;
    }
}
