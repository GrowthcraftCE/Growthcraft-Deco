package growthcraft.deco.utils;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.Block;

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
        return BuiltInRegistries.BLOCK.getValue(Identifier.withDefaultNamespace(color + "_wool"));
    }

    public static Block getCarpetBlockByColor(String color) {
        return BuiltInRegistries.BLOCK.getValue(Identifier.withDefaultNamespace(color + "_carpet"));
    }

    private Identifier key(Block block) {
        return BuiltInRegistries.BLOCK.getKey(block);
    }
}
