package growthcraft.deco.shared;

import growthcraft.deco.init.GrowthcraftDecoBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class Reference {
    public static final String MODID = "growthcraft_deco";
    public static final CreativeModeTab CREATIVE_TAB = new CreativeModeTab(Reference.MODID) {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(GrowthcraftDecoBlocks.SLAB_GLOWSHROOM.get());
        }
    };

    public static final String NAME = "Growthcraft Decorations";
    public static final String NAME_SHORT = "deco";
    public static final String VERSION = "7.1.0";

    private Reference() { /* Prevent default public constructor */ }

    public static class UnlocalizedName {
        public static final String STAIR_OAK_CARPET_BLACK = "stairs_oak_carpet_black";
        public static final String STAIR_OAK_CARPET_BLUE = "stairs_oak_carpet_blue";
        public static final String STAIR_OAK_CARPET_BROWN = "stairs_oak_carpet_brown";
        public static final String STAIR_OAK_CARPET_CYAN = "stairs_oak_carpet_cyan";
        public static final String STAIR_OAK_CARPET_GRAY = "stairs_oak_carpet_gray";
        public static final String STAIR_OAK_CARPET_GREEN = "stairs_oak_carpet_green";
        public static final String STAIR_OAK_CARPET_LIGHT_BLUE = "stairs_oak_carpet_light_blue";
        public static final String STAIR_OAK_CARPET_LIGHT_GRAY = "stairs_oak_carpet_light_gray";
        public static final String STAIR_OAK_CARPET_LIME = "stairs_oak_carpet_lime";
        public static final String STAIR_OAK_CARPET_MAGENTA = "stairs_oak_carpet_magenta";
        public static final String STAIR_OAK_CARPET_ORANGE = "stairs_oak_carpet_orange";
        public static final String STAIR_OAK_CARPET_PINK = "stairs_oak_carpet_pink";
        public static final String STAIR_OAK_CARPET_PURPLE = "stairs_oak_carpet_purple";
        public static final String STAIR_OAK_CARPET_RED = "stairs_oak_carpet_red";
        public static final String STAIR_OAK_CARPET_WHITE = "stairs_oak_carpet_white";
        public static final String STAIR_OAK_CARPET_YELLOW = "stairs_oak_carpet_yellow";

        public static final String STAIR_OAK_CARPET_PARTIAL_BLACK = "stairs_oak_carpet_partial_black";
        public static final String STAIR_OAK_CARPET_PARTIAL_BLUE = "stairs_oak_carpet_partial_blue";
        public static final String STAIR_OAK_CARPET_PARTIAL_BROWN = "stairs_oak_carpet_partial_brown";
        public static final String STAIR_OAK_CARPET_PARTIAL_CYAN = "stairs_oak_carpet_partial_cyan";
        public static final String STAIR_OAK_CARPET_PARTIAL_GRAY = "stairs_oak_carpet_partial_gray";
        public static final String STAIR_OAK_CARPET_PARTIAL_GREEN = "stairs_oak_carpet_partial_green";
        public static final String STAIR_OAK_CARPET_PARTIAL_LIGHT_BLUE = "stairs_oak_carpet_partial_light_blue";
        public static final String STAIR_OAK_CARPET_PARTIAL_LIGHT_GRAY = "stairs_oak_carpet_partial_light_gray";
        public static final String STAIR_OAK_CARPET_PARTIAL_LIME = "stairs_oak_carpet_partial_lime";
        public static final String STAIR_OAK_CARPET_PARTIAL_MAGENTA = "stairs_oak_carpet_partial_magenta";
        public static final String STAIR_OAK_CARPET_PARTIAL_ORANGE = "stairs_oak_carpet_partial_orange";
        public static final String STAIR_OAK_CARPET_PARTIAL_PINK = "stairs_oak_carpet_partial_pink";
        public static final String STAIR_OAK_CARPET_PARTIAL_PURPLE = "stairs_oak_carpet_partial_purple";
        public static final String STAIR_OAK_CARPET_PARTIAL_RED = "stairs_oak_carpet_partial_red";
        public static final String STAIR_OAK_CARPET_PARTIAL_WHITE = "stairs_oak_carpet_partial_white";
        public static final String STAIR_OAK_CARPET_PARTIAL_YELLOW = "stairs_oak_carpet_partial_yellow";
        public static final String STAIR_ACACIA_CARPET_BLACK = "stairs_acacia_carpet_black";
        public static final String STAIR_ACACIA_CARPET_BLUE = "stairs_acacia_carpet_blue";
        public static final String STAIR_ACACIA_CARPET_BROWN = "stairs_acacia_carpet_brown";
        public static final String STAIR_ACACIA_CARPET_CYAN = "stairs_acacia_carpet_cyan";
        public static final String STAIR_ACACIA_CARPET_GRAY = "stairs_acacia_carpet_gray";
        public static final String STAIR_ACACIA_CARPET_GREEN = "stairs_acacia_carpet_green";
        public static final String STAIR_ACACIA_CARPET_LIGHT_BLUE = "stairs_acacia_carpet_light_blue";
        public static final String STAIR_ACACIA_CARPET_LIGHT_GRAY = "stairs_acacia_carpet_light_gray";
        public static final String STAIR_ACACIA_CARPET_LIME = "stairs_acacia_carpet_lime";
        public static final String STAIR_ACACIA_CARPET_MAGENTA = "stairs_acacia_carpet_magenta";
        public static final String STAIR_ACACIA_CARPET_ORANGE = "stairs_acacia_carpet_orange";
        public static final String STAIR_ACACIA_CARPET_PINK = "stairs_acacia_carpet_pink";
        public static final String STAIR_ACACIA_CARPET_PURPLE = "stairs_acacia_carpet_purple";
        public static final String STAIR_ACACIA_CARPET_RED = "stairs_acacia_carpet_red";
        public static final String STAIR_ACACIA_CARPET_WHITE = "stairs_acacia_carpet_white";
        public static final String STAIR_ACACIA_CARPET_YELLOW = "stairs_acacia_carpet_yellow";

        public static final String STAIR_ACACIA_CARPET_PARTIAL_BLACK = "stairs_acacia_carpet_partial_black";
        public static final String STAIR_ACACIA_CARPET_PARTIAL_BLUE = "stairs_acacia_carpet_partial_blue";
        public static final String STAIR_ACACIA_CARPET_PARTIAL_BROWN = "stairs_acacia_carpet_partial_brown";
        public static final String STAIR_ACACIA_CARPET_PARTIAL_CYAN = "stairs_acacia_carpet_partial_cyan";
        public static final String STAIR_ACACIA_CARPET_PARTIAL_GRAY = "stairs_acacia_carpet_partial_gray";
        public static final String STAIR_ACACIA_CARPET_PARTIAL_GREEN = "stairs_acacia_carpet_partial_green";
        public static final String STAIR_ACACIA_CARPET_PARTIAL_LIGHT_BLUE = "stairs_acacia_carpet_partial_light_blue";
        public static final String STAIR_ACACIA_CARPET_PARTIAL_LIGHT_GRAY = "stairs_acacia_carpet_partial_light_gray";
        public static final String STAIR_ACACIA_CARPET_PARTIAL_LIME = "stairs_acacia_carpet_partial_lime";
        public static final String STAIR_ACACIA_CARPET_PARTIAL_MAGENTA = "stairs_acacia_carpet_partial_magenta";
        public static final String STAIR_ACACIA_CARPET_PARTIAL_ORANGE = "stairs_acacia_carpet_partial_orange";
        public static final String STAIR_ACACIA_CARPET_PARTIAL_PINK = "stairs_acacia_carpet_partial_pink";
        public static final String STAIR_ACACIA_CARPET_PARTIAL_PURPLE = "stairs_acacia_carpet_partial_purple";
        public static final String STAIR_ACACIA_CARPET_PARTIAL_RED = "stairs_acacia_carpet_partial_red";
        public static final String STAIR_ACACIA_CARPET_PARTIAL_WHITE = "stairs_acacia_carpet_partial_white";
        public static final String STAIR_ACACIA_CARPET_PARTIAL_YELLOW = "stairs_acacia_carpet_partial_yellow";

        public static final String GLASS_PANEL_BLACK = "panel_glass_black";
        public static final String GLASS_PANEL_BLACK_GLOWING = "panel_glass_black_glowing";
        public static final String GLASS_PANEL_BLUE = "panel_glass_blue";
        public static final String GLASS_PANEL_BLUE_GLOWING = "panel_glass_blue_glowing";
        public static final String GLASS_PANEL_BROWN = "panel_glass_brown";
        public static final String GLASS_PANEL_BROWN_GLOWING = "panel_glass_brown_glowing";
        public static final String GLASS_PANEL_CLEAR = "panel_glass_clear";
        public static final String GLASS_PANEL_CLEAR_GLOWING = "panel_glass_clear_glowing";
        public static final String GLASS_PANEL_CYAN = "panel_glass_cyan";
        public static final String GLASS_PANEL_CYAN_GLOWING = "panel_glass_cyan_glowing";
        public static final String GLASS_PANEL_GRAY = "panel_glass_gray";
        public static final String GLASS_PANEL_GRAY_GLOWING = "panel_glass_gray_glowing";
        public static final String GLASS_PANEL_GREEN = "panel_glass_green";
        public static final String GLASS_PANEL_GREEN_GLOWING = "panel_glass_green_glowing";
        public static final String GLASS_PANEL_LIGHT_BLUE = "panel_glass_light_blue";
        public static final String GLASS_PANEL_LIGHT_BLUE_GLOWING = "panel_glass_light_blue_glowing";
        public static final String GLASS_PANEL_LIGHT_GRAY = "panel_glass_light_gray";
        public static final String GLASS_PANEL_LIGHT_GRAY_GLOWING = "panel_glass_light_gray_glowing";
        public static final String GLASS_PANEL_LIME = "panel_glass_lime";
        public static final String GLASS_PANEL_LIME_GLOWING = "panel_glass_lime_glowing";
        public static final String GLASS_PANEL_MAGENTA = "panel_glass_magenta";
        public static final String GLASS_PANEL_MAGENTA_GLOWING = "panel_glass_magenta_glowing";
        public static final String GLASS_PANEL_ORANGE = "panel_glass_orange";
        public static final String GLASS_PANEL_ORANGE_GLOWING = "panel_glass_orange_glowing";
        public static final String GLASS_PANEL_PINK = "panel_glass_pink";
        public static final String GLASS_PANEL_PINK_GLOWING = "panel_glass_pink_glowing";
        public static final String GLASS_PANEL_PURPLE = "panel_glass_purple";
        public static final String GLASS_PANEL_PURPLE_GLOWING = "panel_glass_purple_glowing";
        public static final String GLASS_PANEL_RED = "panel_glass_red";
        public static final String GLASS_PANEL_RED_GLOWING = "panel_glass_red_glowing";
        public static final String GLASS_PANEL_WHITE = "panel_glass_white";
        public static final String GLASS_PANEL_WHITE_GLOWING = "panel_glass_white_glowing";
        public static final String GLASS_PANEL_YELLOW = "panel_glass_yellow";
        public static final String GLASS_PANEL_YELLOW_GLOWING = "panel_glass_yellow_glowing";
        public static final String PANEL_GLOWSHROOM = "panel_glowshroom";
        public static final String PANEL_GLOWSTONE = "panel_glowstone";
        public static final String SLAB_GLASS_BLACK = "slab_glass_black";
        public static final String SLAB_GLASS_BLACK_GLOWING = "slab_glass_black_glowing";
        public static final String SLAB_GLASS_BLUE = "slab_glass_blue";
        public static final String SLAB_GLASS_BLUE_GLOWING = "slab_glass_blue_glowing";
        public static final String SLAB_GLASS_BROWN = "slab_glass_brown";
        public static final String SLAB_GLASS_BROWN_GLOWING = "slab_glass_brown_glowing";
        public static final String SLAB_GLASS_CLEAR = "slab_glass_clear";
        public static final String SLAB_GLASS_CLEAR_GLOWING = "slab_glass_clear_glowing";
        public static final String SLAB_GLASS_CYAN = "slab_glass_cyan";
        public static final String SLAB_GLASS_CYAN_GLOWING = "slab_glass_cyan_glowing";
        public static final String SLAB_GLASS_GRAY = "slab_glass_gray";
        public static final String SLAB_GLASS_GRAY_GLOWING = "slab_glass_gray_glowing";
        public static final String SLAB_GLASS_GREEN = "slab_glass_green";
        public static final String SLAB_GLASS_GREEN_GLOWING = "slab_glass_green_glowing";
        public static final String SLAB_GLASS_LIGHT_BLUE = "slab_glass_light_blue";
        public static final String SLAB_GLASS_LIGHT_BLUE_GLOWING = "slab_glass_light_blue_glowing";
        public static final String SLAB_GLASS_LIGHT_GRAY = "slab_glass_light_gray";
        public static final String SLAB_GLASS_LIGHT_GRAY_GLOWING = "slab_glass_light_gray_glowing";
        public static final String SLAB_GLASS_LIME = "slab_glass_lime";
        public static final String SLAB_GLASS_LIME_GLOWING = "slab_glass_lime_glowing";
        public static final String SLAB_GLASS_MAGENTA = "slab_glass_magenta";
        public static final String SLAB_GLASS_MAGENTA_GLOWING = "slab_glass_magenta_glowing";
        public static final String SLAB_GLASS_ORANGE = "slab_glass_orange";
        public static final String SLAB_GLASS_ORANGE_GLOWING = "slab_glass_orange_glowing";
        public static final String SLAB_GLASS_PINK = "slab_glass_pink";
        public static final String SLAB_GLASS_PINK_GLOWING = "slab_glass_pink_glowing";
        public static final String SLAB_GLASS_PURPLE = "slab_glass_purple";
        public static final String SLAB_GLASS_PURPLE_GLOWING = "slab_glass_purple_glowing";
        public static final String SLAB_GLASS_RED = "slab_glass_red";
        public static final String SLAB_GLASS_RED_GLOWING = "slab_glass_red_glowing";
        public static final String SLAB_GLASS_WHITE = "slab_glass_white";
        public static final String SLAB_GLASS_WHITE_GLOWING = "slab_glass_white_glowing";
        public static final String SLAB_GLASS_YELLOW = "slab_glass_yellow";
        public static final String SLAB_GLASS_YELLOW_GLOWING = "slab_glass_yellow_glowing";
        public static final String SLAB_GLOWSHROOM = "slab_glowshroom";
        public static final String SLAB_GLOWSTONE = "slab_glowstone";
        public static final String STAIRS_CONCRETE_BLACK = "stairs_concrete_black";
        public static final String STAIRS_CONCRETE_BLUE = "stairs_concrete_blue";
        public static final String STAIRS_CONCRETE_BROWN = "stairs_concrete_brown";
        public static final String STAIRS_CONCRETE_CYAN = "stairs_concrete_cyan";
        public static final String STAIRS_CONCRETE_GRAY = "stairs_concrete_gray";
        public static final String STAIRS_CONCRETE_GREEN = "stairs_concrete_green";
        public static final String STAIRS_CONCRETE_LIGHT_BLUE = "stairs_concrete_light_blue";
        public static final String STAIRS_CONCRETE_LIGHT_GRAY = "stairs_concrete_light_gray";
        public static final String STAIRS_CONCRETE_LIME = "stairs_concrete_lime";
        public static final String STAIRS_CONCRETE_MAGENTA = "stairs_concrete_magenta";
        public static final String STAIRS_CONCRETE_ORANGE = "stairs_concrete_orange";
        public static final String STAIRS_CONCRETE_PINK = "stairs_concrete_pink";
        public static final String STAIRS_CONCRETE_PURPLE = "stairs_concrete_purple";
        public static final String STAIRS_CONCRETE_RED = "stairs_concrete_red";
        public static final String STAIRS_CONCRETE_WHITE = "stairs_concrete_white";
        public static final String STAIRS_CONCRETE_YELLOW = "stairs_concrete_yellow";
        public static final String STAIRS_TERRACOTTA_BLACK = "stairs_terracotta_black";
        public static final String STAIRS_TERRACOTTA_BLUE = "stairs_terracotta_blue";
        public static final String STAIRS_TERRACOTTA_BROWN = "stairs_terracotta_brown";
        public static final String STAIRS_TERRACOTTA_CYAN = "stairs_terracotta_cyan";
        public static final String STAIRS_TERRACOTTA_GRAY = "stairs_terracotta_gray";
        public static final String STAIRS_TERRACOTTA_GREEN = "stairs_terracotta_green";
        public static final String STAIRS_TERRACOTTA_LIGHT_BLUE = "stairs_terracotta_light_blue";
        public static final String STAIRS_TERRACOTTA_LIGHT_GRAY = "stairs_terracotta_light_gray";
        public static final String STAIRS_TERRACOTTA_LIME = "stairs_terracotta_lime";
        public static final String STAIRS_TERRACOTTA_MAGENTA = "stairs_terracotta_magenta";
        public static final String STAIRS_TERRACOTTA_ORANGE = "stairs_terracotta_orange";
        public static final String STAIRS_TERRACOTTA_PINK = "stairs_terracotta_pink";
        public static final String STAIRS_TERRACOTTA_PURPLE = "stairs_terracotta_purple";
        public static final String STAIRS_TERRACOTTA_RED = "stairs_terracotta_red";
        public static final String STAIRS_TERRACOTTA_WHITE = "stairs_terracotta_white";
        public static final String STAIRS_TERRACOTTA_YELLOW = "stairs_terracotta_yellow";
        public static final String STAIRS_WOOL_BLACK = "stairs_wool_black";
        public static final String STAIRS_WOOL_BLUE = "stairs_wool_blue";
        public static final String STAIRS_WOOL_BROWN = "stairs_wool_brown";
        public static final String STAIRS_WOOL_CYAN = "stairs_wool_cyan";
        public static final String STAIRS_WOOL_GRAY = "stairs_wool_gray";
        public static final String STAIRS_WOOL_GREEN = "stairs_wool_green";
        public static final String STAIRS_WOOL_LIGHT_BLUE = "stairs_wool_light_blue";
        public static final String STAIRS_WOOL_LIGHT_GRAY = "stairs_wool_light_gray";
        public static final String STAIRS_WOOL_LIME = "stairs_wool_lime";
        public static final String STAIRS_WOOL_MAGENTA = "stairs_wool_magenta";
        public static final String STAIRS_WOOL_ORANGE = "stairs_wool_orange";
        public static final String STAIRS_WOOL_PINK = "stairs_wool_pink";
        public static final String STAIRS_WOOL_PURPLE = "stairs_wool_purple";
        public static final String STAIRS_WOOL_RED = "stairs_wool_red";
        public static final String STAIRS_WOOL_WHITE = "stairs_wool_white";
        public static final String STAIRS_WOOL_YELLOW = "stairs_wool_yellow";
    }

}
