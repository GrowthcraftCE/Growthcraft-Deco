package growthcraft.deco.utils;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.List;

public class ColorUtils {
    static List<String> colors = List.of(
            "black", "blue", "brown", "cyan", "gray", "green", "light_blue", "light_gray", "lime",
            "magenta", "orange", "pink", "purple", "red", "white", "yellow"
    );

    public static List<String> getColorNames() {
        return colors;
    }

    public static Block getWoolBlock(String color) {
        return ForgeRegistries.BLOCKS.getValue(ResourceLocation.withDefaultNamespace(color + "_wool"));
    }

    public static Block getCarpetBlockByColor(String color) {
        return ForgeRegistries.BLOCKS.getValue(ResourceLocation.withDefaultNamespace(color + "_carpet"));
    }

    private ResourceLocation key(Block block) {
        return ForgeRegistries.BLOCKS.getKey(block);
    }
}
