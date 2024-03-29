package growthcraft.deco.shared;

import java.util.HashMap;
import java.util.Map;

public class Reference {
    public static final String MODID = "growthcraft_deco";

    public static final String NAME = "Growthcraft Decorations";
    public static final String NAME_SHORT = "deco";
    public static final String VERSION = "9.2.0";

    private Reference() { /* Prevent default public constructor */ }

    public enum ToolTypeNames {
        PICKAXE("pickaxe"),
        AXE("axe"),
        NONE("none");

        private final String text;

        ToolTypeNames(final String text) {
            this.text = text;
        }

        @Override
        public String toString() {
            return text;
        }
    }

    public static class UnlocalizedName {
        public static final String GLASS_PANE_BLACK_GLOWING = "glass_stained_black_pane_glowing";
        public static final String GLASS_PANE_BLUE_GLOWING = "glass_stained_blue_pane_glowing";
        public static final String GLASS_PANE_BROWN_GLOWING = "glass_stained_brown_pane_glowing";
        public static final String GLASS_PANE_CLEAR_GLOWING = "glass_stained_clear_pane_glowing";
        public static final String GLASS_PANE_CYAN_GLOWING = "glass_stained_cyan_pane_glowing";
        public static final String GLASS_PANE_GRAY_GLOWING = "glass_stained_gray_pane_glowing";
        public static final String GLASS_PANE_GREEN_GLOWING = "glass_stained_green_pane_glowing";
        public static final String GLASS_PANE_LIGHT_BLUE_GLOWING = "glass_stained_light_blue_pane_glowing";
        public static final String GLASS_PANE_LIGHT_GRAY_GLOWING = "glass_stained_light_gray_pane_glowing";
        public static final String GLASS_PANE_LIME_GLOWING = "glass_stained_lime_pane_glowing";
        public static final String GLASS_PANE_MAGENTA_GLOWING = "glass_stained_magenta_pane_glowing";
        public static final String GLASS_PANE_ORANGE_GLOWING = "glass_stained_orange_pane_glowing";
        public static final String GLASS_PANE_PINK_GLOWING = "glass_stained_pink_pane_glowing";
        public static final String GLASS_PANE_PURPLE_GLOWING = "glass_stained_purple_pane_glowing";
        public static final String GLASS_PANE_RED_GLOWING = "glass_stained_red_glowing";
        public static final String GLASS_PANE_WHITE_GLOWING = "glass_stained_white_pane_glowing";
        public static final String GLASS_PANE_YELLOW_GLOWING = "glass_stained_yellow_pane_glowing";

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
        public static final String STAIR_ACACIA_CARPET_PINK = "stairs_acacia_carpet_pink";
        public static final String STAIR_ACACIA_CARPET_PURPLE = "stairs_acacia_carpet_purple";
        public static final String STAIR_ACACIA_CARPET_RED = "stairs_acacia_carpet_red";
        public static final String STAIR_ACACIA_CARPET_WHITE = "stairs_acacia_carpet_white";
        public static final String STAIR_ACACIA_CARPET_YELLOW = "stairs_acacia_carpet_yellow";
        public static final String STAIR_BIRCH_CARPET_BLACK = "stairs_birch_carpet_black";
        public static final String STAIR_BIRCH_CARPET_BLUE = "stairs_birch_carpet_blue";
        public static final String STAIR_BIRCH_CARPET_BROWN = "stairs_birch_carpet_brown";
        public static final String STAIR_BIRCH_CARPET_CYAN = "stairs_birch_carpet_cyan";
        public static final String STAIR_BIRCH_CARPET_GRAY = "stairs_birch_carpet_gray";
        public static final String STAIR_BIRCH_CARPET_GREEN = "stairs_birch_carpet_green";
        public static final String STAIR_BIRCH_CARPET_LIGHT_BLUE = "stairs_birch_carpet_light_blue";
        public static final String STAIR_BIRCH_CARPET_LIGHT_GRAY = "stairs_birch_carpet_light_gray";
        public static final String STAIR_BIRCH_CARPET_LIME = "stairs_birch_carpet_lime";
        public static final String STAIR_BIRCH_CARPET_MAGENTA = "stairs_birch_carpet_magenta";
        public static final String STAIR_BIRCH_CARPET_ORANGE = "stairs_birch_carpet_orange";
        public static final String STAIR_BIRCH_CARPET_PARTIAL_BLACK = "stairs_birch_carpet_partial_black";
        public static final String STAIR_BIRCH_CARPET_PARTIAL_BLUE = "stairs_birch_carpet_partial_blue";
        public static final String STAIR_BIRCH_CARPET_PARTIAL_BROWN = "stairs_birch_carpet_partial_brown";
        public static final String STAIR_BIRCH_CARPET_PARTIAL_CYAN = "stairs_birch_carpet_partial_cyan";
        public static final String STAIR_BIRCH_CARPET_PARTIAL_GRAY = "stairs_birch_carpet_partial_gray";
        public static final String STAIR_BIRCH_CARPET_PARTIAL_GREEN = "stairs_birch_carpet_partial_green";
        public static final String STAIR_BIRCH_CARPET_PARTIAL_LIGHT_BLUE = "stairs_birch_carpet_partial_light_blue";
        public static final String STAIR_BIRCH_CARPET_PARTIAL_LIGHT_GRAY = "stairs_birch_carpet_partial_light_gray";
        public static final String STAIR_BIRCH_CARPET_PARTIAL_LIME = "stairs_birch_carpet_partial_lime";
        public static final String STAIR_BIRCH_CARPET_PARTIAL_MAGENTA = "stairs_birch_carpet_partial_magenta";
        public static final String STAIR_BIRCH_CARPET_PARTIAL_ORANGE = "stairs_birch_carpet_partial_orange";
        public static final String STAIR_BIRCH_CARPET_PARTIAL_PINK = "stairs_birch_carpet_partial_pink";
        public static final String STAIR_BIRCH_CARPET_PARTIAL_PURPLE = "stairs_birch_carpet_partial_purple";
        public static final String STAIR_BIRCH_CARPET_PARTIAL_RED = "stairs_birch_carpet_partial_red";
        public static final String STAIR_BIRCH_CARPET_PARTIAL_WHITE = "stairs_birch_carpet_partial_white";
        public static final String STAIR_BIRCH_CARPET_PARTIAL_YELLOW = "stairs_birch_carpet_partial_yellow";
        public static final String STAIR_BIRCH_CARPET_PINK = "stairs_birch_carpet_pink";
        public static final String STAIR_BIRCH_CARPET_PURPLE = "stairs_birch_carpet_purple";
        public static final String STAIR_BIRCH_CARPET_RED = "stairs_birch_carpet_red";
        public static final String STAIR_BIRCH_CARPET_WHITE = "stairs_birch_carpet_white";
        public static final String STAIR_BIRCH_CARPET_YELLOW = "stairs_birch_carpet_yellow";
        public static final String STAIR_CRIMSON_CARPET_BLACK = "stairs_crimson_carpet_black";
        public static final String STAIR_CRIMSON_CARPET_BLUE = "stairs_crimson_carpet_blue";
        public static final String STAIR_CRIMSON_CARPET_BROWN = "stairs_crimson_carpet_brown";
        public static final String STAIR_CRIMSON_CARPET_CYAN = "stairs_crimson_carpet_cyan";
        public static final String STAIR_CRIMSON_CARPET_GRAY = "stairs_crimson_carpet_gray";
        public static final String STAIR_CRIMSON_CARPET_GREEN = "stairs_crimson_carpet_green";
        public static final String STAIR_CRIMSON_CARPET_LIGHT_BLUE = "stairs_crimson_carpet_light_blue";
        public static final String STAIR_CRIMSON_CARPET_LIGHT_GRAY = "stairs_crimson_carpet_light_gray";
        public static final String STAIR_CRIMSON_CARPET_LIME = "stairs_crimson_carpet_lime";
        public static final String STAIR_CRIMSON_CARPET_MAGENTA = "stairs_crimson_carpet_magenta";
        public static final String STAIR_CRIMSON_CARPET_ORANGE = "stairs_crimson_carpet_orange";
        public static final String STAIR_CRIMSON_CARPET_PARTIAL_BLACK = "stairs_crimson_carpet_partial_black";
        public static final String STAIR_CRIMSON_CARPET_PARTIAL_BLUE = "stairs_crimson_carpet_partial_blue";
        public static final String STAIR_CRIMSON_CARPET_PARTIAL_BROWN = "stairs_crimson_carpet_partial_brown";
        public static final String STAIR_CRIMSON_CARPET_PARTIAL_CYAN = "stairs_crimson_carpet_partial_cyan";
        public static final String STAIR_CRIMSON_CARPET_PARTIAL_GRAY = "stairs_crimson_carpet_partial_gray";
        public static final String STAIR_CRIMSON_CARPET_PARTIAL_GREEN = "stairs_crimson_carpet_partial_green";
        public static final String STAIR_CRIMSON_CARPET_PARTIAL_LIGHT_BLUE = "stairs_crimson_carpet_partial_light_blue";
        public static final String STAIR_CRIMSON_CARPET_PARTIAL_LIGHT_GRAY = "stairs_crimson_carpet_partial_light_gray";
        public static final String STAIR_CRIMSON_CARPET_PARTIAL_LIME = "stairs_crimson_carpet_partial_lime";
        public static final String STAIR_CRIMSON_CARPET_PARTIAL_MAGENTA = "stairs_crimson_carpet_partial_magenta";
        public static final String STAIR_CRIMSON_CARPET_PARTIAL_ORANGE = "stairs_crimson_carpet_partial_orange";
        public static final String STAIR_CRIMSON_CARPET_PARTIAL_PINK = "stairs_crimson_carpet_partial_pink";
        public static final String STAIR_CRIMSON_CARPET_PARTIAL_PURPLE = "stairs_crimson_carpet_partial_purple";
        public static final String STAIR_CRIMSON_CARPET_PARTIAL_RED = "stairs_crimson_carpet_partial_red";
        public static final String STAIR_CRIMSON_CARPET_PARTIAL_WHITE = "stairs_crimson_carpet_partial_white";
        public static final String STAIR_CRIMSON_CARPET_PARTIAL_YELLOW = "stairs_crimson_carpet_partial_yellow";
        public static final String STAIR_CRIMSON_CARPET_PINK = "stairs_crimson_carpet_pink";
        public static final String STAIR_CRIMSON_CARPET_PURPLE = "stairs_crimson_carpet_purple";
        public static final String STAIR_CRIMSON_CARPET_RED = "stairs_crimson_carpet_red";
        public static final String STAIR_CRIMSON_CARPET_WHITE = "stairs_crimson_carpet_white";
        public static final String STAIR_CRIMSON_CARPET_YELLOW = "stairs_crimson_carpet_yellow";
        public static final String STAIR_DARK_OAK_CARPET_BLACK = "stairs_dark_oak_carpet_black";
        public static final String STAIR_DARK_OAK_CARPET_BLUE = "stairs_dark_oak_carpet_blue";
        public static final String STAIR_DARK_OAK_CARPET_BROWN = "stairs_dark_oak_carpet_brown";
        public static final String STAIR_DARK_OAK_CARPET_CYAN = "stairs_dark_oak_carpet_cyan";
        public static final String STAIR_DARK_OAK_CARPET_GRAY = "stairs_dark_oak_carpet_gray";
        public static final String STAIR_DARK_OAK_CARPET_GREEN = "stairs_dark_oak_carpet_green";
        public static final String STAIR_DARK_OAK_CARPET_LIGHT_BLUE = "stairs_dark_oak_carpet_light_blue";
        public static final String STAIR_DARK_OAK_CARPET_LIGHT_GRAY = "stairs_dark_oak_carpet_light_gray";
        public static final String STAIR_DARK_OAK_CARPET_LIME = "stairs_dark_oak_carpet_lime";
        public static final String STAIR_DARK_OAK_CARPET_MAGENTA = "stairs_dark_oak_carpet_magenta";
        public static final String STAIR_DARK_OAK_CARPET_ORANGE = "stairs_dark_oak_carpet_orange";
        public static final String STAIR_DARK_OAK_CARPET_PARTIAL_BLACK = "stairs_dark_oak_carpet_partial_black";
        public static final String STAIR_DARK_OAK_CARPET_PARTIAL_BLUE = "stairs_dark_oak_carpet_partial_blue";
        public static final String STAIR_DARK_OAK_CARPET_PARTIAL_BROWN = "stairs_dark_oak_carpet_partial_brown";
        public static final String STAIR_DARK_OAK_CARPET_PARTIAL_CYAN = "stairs_dark_oak_carpet_partial_cyan";
        public static final String STAIR_DARK_OAK_CARPET_PARTIAL_GRAY = "stairs_dark_oak_carpet_partial_gray";
        public static final String STAIR_DARK_OAK_CARPET_PARTIAL_GREEN = "stairs_dark_oak_carpet_partial_green";
        public static final String STAIR_DARK_OAK_CARPET_PARTIAL_LIGHT_BLUE = "stairs_dark_oak_carpet_partial_light_blue";
        public static final String STAIR_DARK_OAK_CARPET_PARTIAL_LIGHT_GRAY = "stairs_dark_oak_carpet_partial_light_gray";
        public static final String STAIR_DARK_OAK_CARPET_PARTIAL_LIME = "stairs_dark_oak_carpet_partial_lime";
        public static final String STAIR_DARK_OAK_CARPET_PARTIAL_MAGENTA = "stairs_dark_oak_carpet_partial_magenta";
        public static final String STAIR_DARK_OAK_CARPET_PARTIAL_ORANGE = "stairs_dark_oak_carpet_partial_orange";
        public static final String STAIR_DARK_OAK_CARPET_PARTIAL_PINK = "stairs_dark_oak_carpet_partial_pink";
        public static final String STAIR_DARK_OAK_CARPET_PARTIAL_PURPLE = "stairs_dark_oak_carpet_partial_purple";
        public static final String STAIR_DARK_OAK_CARPET_PARTIAL_RED = "stairs_dark_oak_carpet_partial_red";
        public static final String STAIR_DARK_OAK_CARPET_PARTIAL_WHITE = "stairs_dark_oak_carpet_partial_white";
        public static final String STAIR_DARK_OAK_CARPET_PARTIAL_YELLOW = "stairs_dark_oak_carpet_partial_yellow";
        public static final String STAIR_DARK_OAK_CARPET_PINK = "stairs_dark_oak_carpet_pink";
        public static final String STAIR_DARK_OAK_CARPET_PURPLE = "stairs_dark_oak_carpet_purple";
        public static final String STAIR_DARK_OAK_CARPET_RED = "stairs_dark_oak_carpet_red";
        public static final String STAIR_DARK_OAK_CARPET_WHITE = "stairs_dark_oak_carpet_white";
        public static final String STAIR_DARK_OAK_CARPET_YELLOW = "stairs_dark_oak_carpet_yellow";
        public static final String STAIR_JUNGLE_CARPET_BLACK = "stairs_jungle_carpet_black";
        public static final String STAIR_JUNGLE_CARPET_BLUE = "stairs_jungle_carpet_blue";
        public static final String STAIR_JUNGLE_CARPET_BROWN = "stairs_jungle_carpet_brown";
        public static final String STAIR_JUNGLE_CARPET_CYAN = "stairs_jungle_carpet_cyan";
        public static final String STAIR_JUNGLE_CARPET_GRAY = "stairs_jungle_carpet_gray";
        public static final String STAIR_JUNGLE_CARPET_GREEN = "stairs_jungle_carpet_green";
        public static final String STAIR_JUNGLE_CARPET_LIGHT_BLUE = "stairs_jungle_carpet_light_blue";
        public static final String STAIR_JUNGLE_CARPET_LIGHT_GRAY = "stairs_jungle_carpet_light_gray";
        public static final String STAIR_JUNGLE_CARPET_LIME = "stairs_jungle_carpet_lime";
        public static final String STAIR_JUNGLE_CARPET_MAGENTA = "stairs_jungle_carpet_magenta";
        public static final String STAIR_JUNGLE_CARPET_ORANGE = "stairs_jungle_carpet_orange";
        public static final String STAIR_JUNGLE_CARPET_PARTIAL_BLACK = "stairs_jungle_carpet_partial_black";
        public static final String STAIR_JUNGLE_CARPET_PARTIAL_BLUE = "stairs_jungle_carpet_partial_blue";
        public static final String STAIR_JUNGLE_CARPET_PARTIAL_BROWN = "stairs_jungle_carpet_partial_brown";
        public static final String STAIR_JUNGLE_CARPET_PARTIAL_CYAN = "stairs_jungle_carpet_partial_cyan";
        public static final String STAIR_JUNGLE_CARPET_PARTIAL_GRAY = "stairs_jungle_carpet_partial_gray";
        public static final String STAIR_JUNGLE_CARPET_PARTIAL_GREEN = "stairs_jungle_carpet_partial_green";
        public static final String STAIR_JUNGLE_CARPET_PARTIAL_LIGHT_BLUE = "stairs_jungle_carpet_partial_light_blue";
        public static final String STAIR_JUNGLE_CARPET_PARTIAL_LIGHT_GRAY = "stairs_jungle_carpet_partial_light_gray";
        public static final String STAIR_JUNGLE_CARPET_PARTIAL_LIME = "stairs_jungle_carpet_partial_lime";
        public static final String STAIR_JUNGLE_CARPET_PARTIAL_MAGENTA = "stairs_jungle_carpet_partial_magenta";
        public static final String STAIR_JUNGLE_CARPET_PARTIAL_ORANGE = "stairs_jungle_carpet_partial_orange";
        public static final String STAIR_JUNGLE_CARPET_PARTIAL_PINK = "stairs_jungle_carpet_partial_pink";
        public static final String STAIR_JUNGLE_CARPET_PARTIAL_PURPLE = "stairs_jungle_carpet_partial_purple";
        public static final String STAIR_JUNGLE_CARPET_PARTIAL_RED = "stairs_jungle_carpet_partial_red";
        public static final String STAIR_JUNGLE_CARPET_PARTIAL_WHITE = "stairs_jungle_carpet_partial_white";
        public static final String STAIR_JUNGLE_CARPET_PARTIAL_YELLOW = "stairs_jungle_carpet_partial_yellow";
        public static final String STAIR_JUNGLE_CARPET_PINK = "stairs_jungle_carpet_pink";
        public static final String STAIR_JUNGLE_CARPET_PURPLE = "stairs_jungle_carpet_purple";
        public static final String STAIR_JUNGLE_CARPET_RED = "stairs_jungle_carpet_red";
        public static final String STAIR_JUNGLE_CARPET_WHITE = "stairs_jungle_carpet_white";
        public static final String STAIR_JUNGLE_CARPET_YELLOW = "stairs_jungle_carpet_yellow";
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
        public static final String STAIR_OAK_CARPET_PINK = "stairs_oak_carpet_pink";
        public static final String STAIR_OAK_CARPET_PURPLE = "stairs_oak_carpet_purple";
        public static final String STAIR_OAK_CARPET_RED = "stairs_oak_carpet_red";
        public static final String STAIR_OAK_CARPET_WHITE = "stairs_oak_carpet_white";
        public static final String STAIR_OAK_CARPET_YELLOW = "stairs_oak_carpet_yellow";
        public static final String STAIR_SPRUCE_CARPET_BLACK = "stairs_spruce_carpet_black";
        public static final String STAIR_SPRUCE_CARPET_BLUE = "stairs_spruce_carpet_blue";
        public static final String STAIR_SPRUCE_CARPET_BROWN = "stairs_spruce_carpet_brown";
        public static final String STAIR_SPRUCE_CARPET_CYAN = "stairs_spruce_carpet_cyan";
        public static final String STAIR_SPRUCE_CARPET_GRAY = "stairs_spruce_carpet_gray";
        public static final String STAIR_SPRUCE_CARPET_GREEN = "stairs_spruce_carpet_green";
        public static final String STAIR_SPRUCE_CARPET_LIGHT_BLUE = "stairs_spruce_carpet_light_blue";
        public static final String STAIR_SPRUCE_CARPET_LIGHT_GRAY = "stairs_spruce_carpet_light_gray";
        public static final String STAIR_SPRUCE_CARPET_LIME = "stairs_spruce_carpet_lime";
        public static final String STAIR_SPRUCE_CARPET_MAGENTA = "stairs_spruce_carpet_magenta";
        public static final String STAIR_SPRUCE_CARPET_ORANGE = "stairs_spruce_carpet_orange";
        public static final String STAIR_SPRUCE_CARPET_PARTIAL_BLACK = "stairs_spruce_carpet_partial_black";
        public static final String STAIR_SPRUCE_CARPET_PARTIAL_BLUE = "stairs_spruce_carpet_partial_blue";
        public static final String STAIR_SPRUCE_CARPET_PARTIAL_BROWN = "stairs_spruce_carpet_partial_brown";
        public static final String STAIR_SPRUCE_CARPET_PARTIAL_CYAN = "stairs_spruce_carpet_partial_cyan";
        public static final String STAIR_SPRUCE_CARPET_PARTIAL_GRAY = "stairs_spruce_carpet_partial_gray";
        public static final String STAIR_SPRUCE_CARPET_PARTIAL_GREEN = "stairs_spruce_carpet_partial_green";
        public static final String STAIR_SPRUCE_CARPET_PARTIAL_LIGHT_BLUE = "stairs_spruce_carpet_partial_light_blue";
        public static final String STAIR_SPRUCE_CARPET_PARTIAL_LIGHT_GRAY = "stairs_spruce_carpet_partial_light_gray";
        public static final String STAIR_SPRUCE_CARPET_PARTIAL_LIME = "stairs_spruce_carpet_partial_lime";
        public static final String STAIR_SPRUCE_CARPET_PARTIAL_MAGENTA = "stairs_spruce_carpet_partial_magenta";
        public static final String STAIR_SPRUCE_CARPET_PARTIAL_ORANGE = "stairs_spruce_carpet_partial_orange";
        public static final String STAIR_SPRUCE_CARPET_PARTIAL_PINK = "stairs_spruce_carpet_partial_pink";
        public static final String STAIR_SPRUCE_CARPET_PARTIAL_PURPLE = "stairs_spruce_carpet_partial_purple";
        public static final String STAIR_SPRUCE_CARPET_PARTIAL_RED = "stairs_spruce_carpet_partial_red";
        public static final String STAIR_SPRUCE_CARPET_PARTIAL_WHITE = "stairs_spruce_carpet_partial_white";
        public static final String STAIR_SPRUCE_CARPET_PARTIAL_YELLOW = "stairs_spruce_carpet_partial_yellow";
        public static final String STAIR_SPRUCE_CARPET_PINK = "stairs_spruce_carpet_pink";
        public static final String STAIR_SPRUCE_CARPET_PURPLE = "stairs_spruce_carpet_purple";
        public static final String STAIR_SPRUCE_CARPET_RED = "stairs_spruce_carpet_red";
        public static final String STAIR_SPRUCE_CARPET_WHITE = "stairs_spruce_carpet_white";
        public static final String STAIR_SPRUCE_CARPET_YELLOW = "stairs_spruce_carpet_yellow";
        public static final String STAIR_WARPED_CARPET_BLACK = "stairs_warped_carpet_black";
        public static final String STAIR_WARPED_CARPET_BLUE = "stairs_warped_carpet_blue";
        public static final String STAIR_WARPED_CARPET_BROWN = "stairs_warped_carpet_brown";
        public static final String STAIR_WARPED_CARPET_CYAN = "stairs_warped_carpet_cyan";
        public static final String STAIR_WARPED_CARPET_GRAY = "stairs_warped_carpet_gray";
        public static final String STAIR_WARPED_CARPET_GREEN = "stairs_warped_carpet_green";
        public static final String STAIR_WARPED_CARPET_LIGHT_BLUE = "stairs_warped_carpet_light_blue";
        public static final String STAIR_WARPED_CARPET_LIGHT_GRAY = "stairs_warped_carpet_light_gray";
        public static final String STAIR_WARPED_CARPET_LIME = "stairs_warped_carpet_lime";
        public static final String STAIR_WARPED_CARPET_MAGENTA = "stairs_warped_carpet_magenta";
        public static final String STAIR_WARPED_CARPET_ORANGE = "stairs_warped_carpet_orange";
        public static final String STAIR_WARPED_CARPET_PARTIAL_BLACK = "stairs_warped_carpet_partial_black";
        public static final String STAIR_WARPED_CARPET_PARTIAL_BLUE = "stairs_warped_carpet_partial_blue";
        public static final String STAIR_WARPED_CARPET_PARTIAL_BROWN = "stairs_warped_carpet_partial_brown";
        public static final String STAIR_WARPED_CARPET_PARTIAL_CYAN = "stairs_warped_carpet_partial_cyan";
        public static final String STAIR_WARPED_CARPET_PARTIAL_GRAY = "stairs_warped_carpet_partial_gray";
        public static final String STAIR_WARPED_CARPET_PARTIAL_GREEN = "stairs_warped_carpet_partial_green";
        public static final String STAIR_WARPED_CARPET_PARTIAL_LIGHT_BLUE = "stairs_warped_carpet_partial_light_blue";
        public static final String STAIR_WARPED_CARPET_PARTIAL_LIGHT_GRAY = "stairs_warped_carpet_partial_light_gray";
        public static final String STAIR_WARPED_CARPET_PARTIAL_LIME = "stairs_warped_carpet_partial_lime";
        public static final String STAIR_WARPED_CARPET_PARTIAL_MAGENTA = "stairs_warped_carpet_partial_magenta";
        public static final String STAIR_WARPED_CARPET_PARTIAL_ORANGE = "stairs_warped_carpet_partial_orange";
        public static final String STAIR_WARPED_CARPET_PARTIAL_PINK = "stairs_warped_carpet_partial_pink";
        public static final String STAIR_WARPED_CARPET_PARTIAL_PURPLE = "stairs_warped_carpet_partial_purple";
        public static final String STAIR_WARPED_CARPET_PARTIAL_RED = "stairs_warped_carpet_partial_red";
        public static final String STAIR_WARPED_CARPET_PARTIAL_WHITE = "stairs_warped_carpet_partial_white";
        public static final String STAIR_WARPED_CARPET_PARTIAL_YELLOW = "stairs_warped_carpet_partial_yellow";
        public static final String STAIR_WARPED_CARPET_PINK = "stairs_warped_carpet_pink";
        public static final String STAIR_WARPED_CARPET_PURPLE = "stairs_warped_carpet_purple";
        public static final String STAIR_WARPED_CARPET_RED = "stairs_warped_carpet_red";
        public static final String STAIR_WARPED_CARPET_WHITE = "stairs_warped_carpet_white";
        public static final String STAIR_WARPED_CARPET_YELLOW = "stairs_warped_carpet_yellow";
        public static final String STAIR_OAK_GLOWING = "stairs_oak_glowing";
        public static final String STAIR_SPRUCE_GLOWING = "stairs_spruce_glowing";
        public static final String STAIR_BIRCH_GLOWING = "stairs_birch_glowing";
        public static final String STAIR_JUNGLE_GLOWING = "stairs_jungle_glowing";
        public static final String STAIR_ACACIA_GLOWING = "stairs_acacia_glowing";
        public static final String STAIR_DARK_OAK_GLOWING = "stairs_dark_oak_glowing";
        public static final String STAIR_MANGROVE_GLOWING = "stairs_mangrove_glowing";
        public static final String STAIR_DARK_PRISMARINE_GLOWING = "stairs_dark_prismarine_glowing";
        public static final String STAIR_PRISMARINE_GLOWING = "stairs_prismarine_glowing";
        public static final String STAIR_PRISMARINE_BRICK_GLOWING = "stairs_prismarine_brick_glowing";
        public static final String STAIR_COBBLESTONE_GLOWING = "stairs_cobblestone_glowing";
        public static final String STAIR_SANDSTONE_GLOWING = "stairs_sandstone_glowing";
        public static final String STAIR_RED_SANDSTONE_GLOWING = "stairs_red_sandstone_glowing";
        public static final String STAIR_BRICK_GLOWING = "stairs_brick_glowing";
        public static final String STAIR_STONE_BRICK_GLOWING = "stairs_stone_brick_glowing";
        public static final String STAIR_MUD_BRICK_GLOWING = "stairs_mud_brick_glowing";
        public static final String STAIR_NETHER_BRICK_GLOWING = "stairs_nether_brick_glowing";
        public static final String STAIR_WARPED_GLOWING = "stairs_warped_glowing";
        public static final String STAIR_CRIMSON_GLOWING = "stairs_crimson_glowing";
        public static final String STAIR_QUARTZ_GLOWING = "stairs_quartz_glowing";
        public static final String STAIR_PURPUR_GLOWING = "stairs_purpur_glowing";
        public static final String STAIR_POLISHED_GRANITE_GLOWING = "stairs_polished_granite_glowing";
        public static final String STAIR_SMOOTH_RED_SANDSTONE_GLOWING = "stairs_smooth_red_sandstone_glowing";
        public static final String STAIR_MOSSY_STONE_BRICK_GLOWING = "stairs_mossy_stone_brick_glowing";
        public static final String STAIR_POLISHED_DIORITE_GLOWING = "stairs_polished_diorite_glowing";
        public static final String STAIR_MOSSY_COBBLESTONE_GLOWING = "stairs_mossy_cobblestone_glowing";
        public static final String STAIR_END_STONE_BRICK_GLOWING = "stairs_end_stone_brick_glowing";
        public static final String STAIR_STONE_GLOWING = "stairs_stone_glowing";
        public static final String STAIR_SMOOTH_SANDSTONE_GLOWING = "stairs_smooth_sandstone_glowing";
        public static final String STAIR_SMOOTH_QUARTZ_GLOWING = "stairs_smooth_quartz_glowing";
        public static final String STAIR_GRANITE_GLOWING = "stairs_granite_glowing";
        public static final String STAIR_ANDESITE_GLOWING = "stairs_andesite_glowing";
        public static final String STAIR_RED_NETHER_BRICK_GLOWING = "stairs_red_nether_brick_glowing";
        public static final String STAIR_POLISHED_ANDESITE_GLOWING = "stairs_polished_andesite_glowing";
        public static final String STAIR_DIORITE_GLOWING = "stairs_diorite_glowing";
        public static final String STAIR_BLACKSTONE_GLOWING = "stairs_blackstone_glowing";
        public static final String STAIR_POLISHED_BLACKSTONE_BRICK_GLOWING = "stairs_polished_blackstone_brick_glowing";
        public static final String STAIR_POLISHED_BLACKSTONE_GLOWING = "stairs_polished_blackstone_glowing";
        public static final String STAIR_CUT_COPPER_GLOWING = "stairs_cut_copper_glowing";
        public static final String STAIR_EXPOSED_CUT_COPPER_GLOWING = "stairs_exposed_cut_copper_glowing";
        public static final String STAIR_WEATHERED_CUT_COPPER_GLOWING = "stairs_weathered_cut_copper_glowing";
        public static final String STAIR_OXIDIZED_CUT_COPPER_GLOWING = "stairs_oxidized_cut_copper_glowing";
        public static final String STAIR_WAXED_CUT_COPPER_GLOWING = "stairs_waxed_cut_copper_glowing";
        public static final String STAIR_WAXED_EXPOSED_CUT_COPPER_GLOWING = "stairs_waxed_exposed_cut_copper_glowing";
        public static final String STAIR_WAXED_WEATHERED_CUT_COPPER_GLOWING = "stairs_waxed_weathered_cut_copper_glowing";
        public static final String STAIR_WAXED_OXIDIZED_CUT_COPPER_GLOWING = "stairs_waxed_oxidized_cut_copper_glowing";
        public static final String STAIR_COBBLED_DEEPSLATE_GLOWING = "stairs_cobbled_deepslate_glowing";
        public static final String STAIR_POLISHED_DEEPSLATE_GLOWING = "stairs_polished_deepslate_glowing";
        public static final String STAIR_DEEPSLATE_BRICK_GLOWING = "deepslate_brick_stairs_glowing";
        public static final String STAIR_DEEPSLATE_TILE_GLOWING = "deepslate_tiles_stairs_glowing";
        public static final String STAIR_BAMBOO_GLOWING = "stairs_bamboo_glowing";
        public static final String STAIR_BAMBOO_MOSAIC_GLOWING = "stairs_bamboo_mosaic_glowing";
        public static final String STONE_GLOWING = "stone_glowing";
        public static final String GRANITE_GLOWING = "granite_glowing";
        public static final String POLISHED_GRANITE_GLOWING = "polished_granite_glowing";
        public static final String ANDESITE_GLOWING = "andesite_glowing";


        public static final String POLISHED_ANDESITE_GLOWING = "polished_andesite_glowing";
        public static final String DIRT_GLOWING = "dirt_glowing";
        public static final String COARSE_DIRT_GLOWING = "coarse_dirt_glowing";
        public static final String COBBLESTONE_GLOWING = "cobblestone_glowing";
        public static final String OAK_PLANKS_GLOWING = "oak_planks_glowing";
        public static final String SPRUCE_PLANKS_GLOWING = "spruce_planks_glowing";
        public static final String BIRCH_PLANKS_GLOWING = "birch_planks_glowing";
        public static final String JUNGLE_PLANKS_GLOWING = "jungle_planks_glowing";
        public static final String ACACIA_PLANKS_GLOWING = "acacia_planks_glowing";
        public static final String CHERRY_PLANKS_GLOWING = "cherry_planks_glowing";
        public static final String DARK_OAK_PLANKS_GLOWING = "dark_oak_planks_glowing";
        public static final String MANGROVE_PLANKS_GLOWING = "mangrove_planks_glowing";
        public static final String BAMBOO_PLANKS_GLOWING = "bamboo_planks_glowing";
        public static final String BAMBOO_MOSAIC_GLOWING = "bamboo_mosaic_glowing";
        public static final String LAPIS_BLOCK_GLOWING = "lapis_block_glowing";
        public static final String SANDSTONE_GLOWING = "sandstone_glowing";
        public static final String CHISELED_SANDSTONE_GLOWING = "chiseled_sandstone_glowing";
        public static final String CUT_SANDSTONE_GLOWING = "cut_sandstone_glowing";
        public static final String WHITE_WOOL_GLOWING = "white_wool_glowing";
        public static final String ORANGE_WOOL_GLOWING = "orange_wool_glowing";
        public static final String MAGENTA_WOOL_GLOWING = "magenta_wool_glowing";
        public static final String LIGHT_BLUE_WOOL_GLOWING = "light_blue_wool_glowing";
        public static final String YELLOW_WOOL_GLOWING = "yellow_wool_glowing";
        public static final String LIME_WOOL_GLOWING = "lime_wool_glowing";
        public static final String PINK_WOOL_GLOWING = "pink_wool_glowing";
        public static final String GRAY_WOOL_GLOWING = "gray_wool_glowing";
        public static final String LIGHT_GRAY_WOOL_GLOWING = "light_gray_wool_glowing";
        public static final String CYAN_WOOL_GLOWING = "cyan_wool_glowing";
        public static final String PURPLE_WOOL_GLOWING = "purple_wool_glowing";
        public static final String BLUE_WOOL_GLOWING = "blue_wool_glowing";
        public static final String BROWN_WOOL_GLOWING = "brown_wool_glowing";
        public static final String GREEN_WOOL_GLOWING = "green_wool_glowing";
        public static final String RED_WOOL_GLOWING = "red_wool_glowing";
        public static final String BLACK_WOOL_GLOWING = "black_wool_glowing";
        public static final String GOLD_BLOCK_GLOWING = "gold_block_glowing";
        public static final String IRON_BLOCK_GLOWING = "iron_block_glowing";
        public static final String BRICKS_GLOWING = "bricks_glowing";
        public static final String BOOKSHELF_GLOWING = "bookshelf_glowing";
        public static final String MOSSY_COBBLESTONE_GLOWING = "mossy_cobblestone_glowing";
        public static final String OBSIDIAN_GLOWING = "obsidian_glowing";
        public static final String DIAMOND_BLOCK_GLOWING = "diamond_block_glowing";
        public static final String SNOW_BLOCK_GLOWING = "snow_block_glowing";
        public static final String CLAY_GLOWING = "clay_glowing";
        public static final String SOUL_SOIL_GLOWING = "soul_soil_glowing";
        public static final String STONE_BRICKS_GLOWING = "stone_bricks_glowing";
        public static final String MOSSY_STONE_BRICKS_GLOWING = "mossy_stone_bricks_glowing";
        public static final String CRACKED_STONE_BRICKS_GLOWING = "cracked_stone_bricks_glowing";
        public static final String CHISELED_STONE_BRICKS_GLOWING = "chiseled_stone_bricks_glowing";
        public static final String PACKED_MUD_GLOWING = "packed_mud_glowing";
        public static final String MUD_BRICKS_GLOWING = "mud_bricks_glowing";
        public static final String NETHER_BRICKS_GLOWING = "nether_bricks_glowing";
        public static final String END_STONE_GLOWING = "end_stone_glowing";
        public static final String EMERALD_BLOCK_GLOWING = "emerald_block_glowing";
        public static final String QUARTZ_BLOCK_GLOWING = "quartz_block_glowing";
        public static final String CHISELED_QUARTZ_BLOCK_GLOWING = "chiseled_quartz_block_glowing";
        public static final String BLACK_TERRACOTTA_GLOWING = "black_terracotta_glowing";
        public static final String BLUE_TERRACOTTA_GLOWING = "blue_terracotta_glowing";
        public static final String BROWN_TERRACOTTA_GLOWING = "brown_terracotta_glowing";
        public static final String CYAN_TERRACOTTA_GLOWING = "cyan_terracotta_glowing";
        public static final String GRAY_TERRACOTTA_GLOWING = "gray_terracotta_glowing";
        public static final String GREEN_TERRACOTTA_GLOWING = "green_terracotta_glowing";
        public static final String LIGHT_BLUE_TERRACOTTA_GLOWING = "light_blue_terracotta_glowing";
        public static final String LIGHT_GRAY_TERRACOTTA_GLOWING = "light_gray_terracotta_glowing";
        public static final String LIME_TERRACOTTA_GLOWING = "lime_terracotta_glowing";
        public static final String MAGENTA_TERRACOTTA_GLOWING = "magenta_terracotta_glowing";
        public static final String ORANGE_TERRACOTTA_GLOWING = "orange_terracotta_glowing";
        public static final String PINK_TERRACOTTA_GLOWING = "pink_terracotta_glowing";
        public static final String PURPLE_TERRACOTTA_GLOWING = "purple_terracotta_glowing";
        public static final String RED_TERRACOTTA_GLOWING = "red_terracotta_glowing";
        public static final String WHITE_TERRACOTTA_GLOWING = "white_terracotta_glowing";
        public static final String YELLOW_TERRACOTTA_GLOWING = "yellow_terracotta_glowing";
        public static final String PRISMARINE_GLOWING = "prismarine_glowing";
        public static final String PRISMARINE_BRICKS_GLOWING = "prismarine_bricks_glowing";
        public static final String DARK_PRISMARINE_GLOWING = "dark_prismarine_glowing";
        public static final String TERRACOTTA_GLOWING = "terracotta_glowing";
        public static final String COAL_BLOCK_GLOWING = "coal_block_glowing";
        public static final String PACKED_ICE_GLOWING = "packed_ice_glowing";
        public static final String RED_SANDSTONE_GLOWING = "red_sandstone_glowing";
        public static final String CHISELED_RED_SANDSTONE_GLOWING = "chiseled_red_sandstone_glowing";
        public static final String CUT_RED_SANDSTONE_GLOWING = "cut_red_sandstone_glowing";
        public static final String SMOOTH_STONE_GLOWING = "smooth_stone_glowing";
        public static final String SMOOTH_SANDSTONE_GLOWING = "smooth_sandstone_glowing";
        public static final String SMOOTH_QUARTZ_GLOWING = "smooth_quartz_glowing";
        public static final String SMOOTH_RED_SANDSTONE_GLOWING = "smooth_red_sandstone_glowing";
        public static final String PURPUR_BLOCK_GLOWING = "purpur_block_glowing";
        public static final String PURPUR_PILLAR_GLOWING = "purpur_pillar_glowing";
        public static final String END_STONE_BRICKS_GLOWING = "end_stone_bricks_glowing";
        public static final String NETHER_WART_BLOCK_GLOWING = "nether_wart_block_glowing";
        public static final String RED_NETHER_BRICKS_GLOWING = "red_nether_bricks_glowing";
        public static final String BLACK_CONCRETE_GLOWING = "black_concrete_glowing";
        public static final String BLUE_CONCRETE_GLOWING = "blue_concrete_glowing";
        public static final String BROWN_CONCRETE_GLOWING = "brown_concrete_glowing";
        public static final String CYAN_CONCRETE_GLOWING = "cyan_concrete_glowing";
        public static final String GRAY_CONCRETE_GLOWING = "gray_concrete_glowing";
        public static final String GREEN_CONCRETE_GLOWING = "green_concrete_glowing";
        public static final String LIGHT_BLUE_CONCRETE_GLOWING = "light_blue_concrete_glowing";
        public static final String LIGHT_GRAY_CONCRETE_GLOWING = "light_gray_concrete_glowing";
        public static final String LIME_CONCRETE_GLOWING = "lime_concrete_glowing";
        public static final String MAGENTA_CONCRETE_GLOWING = "magenta_concrete_glowing";
        public static final String ORANGE_CONCRETE_GLOWING = "orange_concrete_glowing";
        public static final String PINK_CONCRETE_GLOWING = "pink_concrete_glowing";
        public static final String PURPLE_CONCRETE_GLOWING = "purple_concrete_glowing";
        public static final String RED_CONCRETE_GLOWING = "red_concrete_glowing";
        public static final String WHITE_CONCRETE_GLOWING = "white_concrete_glowing";
        public static final String YELLOW_CONCRETE_GLOWING = "yellow_concrete_glowing";
        public static final String DRIED_KELP_BLOCK_GLOWING = "dried_kelp_block_glowing";
        public static final String WARPED_WART_BLOCK_GLOWING = "warped_wart_block_glowing";
        public static final String CRIMSON_PLANKS_GLOWING = "crimson_planks_glowing";
        public static final String WARPED_PLANKS_GLOWING = "warped_planks_glowing";
        public static final String HONEYCOMB_BLOCK_GLOWING = "honeycomb_block_glowing";
        public static final String NETHERITE_BLOCK_GLOWING = "netherite_block_glowing";
        public static final String LODESTONE_GLOWING = "lodestone_glowing";
        public static final String BLACKSTONE_GLOWING = "blackstone_glowing";
        public static final String POLISHED_BLACKSTONE_GLOWING = "polished_blackstone_glowing";
        public static final String POLISHED_BLACKSTONE_BRICKS_GLOWING = "polished_blackstone_bricks_glowing";
        public static final String CRACKED_POLISHED_BLACKSTONE_BRICKS_GLOWING = "cracked_polished_blackstone_bricks_glowing";
        public static final String CHISELED_POLISHED_BLACKSTONE_GLOWING = "chiseled_polished_blackstone_glowing";
        public static final String GILDED_BLACKSTONE_GLOWING = "gilded_blackstone_glowing";
        public static final String CHISELED_NETHER_BRICKS_GLOWING = "chiseled_nether_bricks_glowing";
        public static final String CRACKED_NETHER_BRICKS_GLOWING = "cracked_nether_bricks_glowing";
        public static final String QUARTZ_BRICKS_GLOWING = "quartz_bricks_glowing";
        public static final String TUFF_GLOWING = "tuff_glowing";
        public static final String CALCITE_GLOWING = "calcite_glowing";
        public static final String WAXED_COPPER_BLOCK_GLOWING = "waxed_copper_block_glowing";
        public static final String WAXED_WEATHERED_COPPER_GLOWING = "waxed_weathered_copper_glowing";
        public static final String WAXED_EXPOSED_COPPER_GLOWING = "waxed_exposed_copper_glowing";
        public static final String WAXED_OXIDIZED_COPPER_GLOWING = "waxed_oxidized_copper_glowing";
        public static final String WAXED_OXIDIZED_CUT_COPPER_GLOWING = "waxed_oxidized_cut_copper_glowing";
        public static final String WAXED_WEATHERED_CUT_COPPER_GLOWING = "waxed_weathered_cut_copper_glowing";
        public static final String WAXED_EXPOSED_CUT_COPPER_GLOWING = "waxed_exposed_cut_copper_glowing";
        public static final String WAXED_CUT_COPPER_GLOWING = "waxed_cut_copper_glowing";
        public static final String DRIPSTONE_BLOCK_GLOWING = "dripstone_block_glowing";
        public static final String COBBLED_DEEPSLATE_GLOWING = "cobbled_deepslate_glowing";
        public static final String POLISHED_DEEPSLATE_GLOWING = "polished_deepslate_glowing";
        public static final String DEEPSLATE_TILES_GLOWING = "deepslate_tiles_glowing";
        public static final String DEEPSLATE_BRICKS_GLOWING = "deepslate_bricks_glowing";
        public static final String CHISELED_DEEPSLATE_GLOWING = "chiseled_deepslate_glowing";
        public static final String CRACKED_DEEPSLATE_BRICKS_GLOWING = "cracked_deepslate_bricks_glowing";
        public static final String CRACKED_DEEPSLATE_TILES_GLOWING = "cracked_deepslate_tiles_glowing";
        public static final String SMOOTH_BASALT_GLOWING = "smooth_basalt_glowing";
        public static final String RAW_IRON_BLOCK_GLOWING = "raw_iron_block_glowing";
        public static final String RAW_COPPER_BLOCK_GLOWING = "raw_copper_block_glowing";
        public static final String RAW_GOLD_BLOCK_GLOWING = "raw_gold_block_glowing";
        public static final String REINFORCED_DEEPSLATE_GLOWING = "reinforced_deepslate_glowing";


        public static final String TAG_GLOWING = "glowing";

        public static final String CREATIVE_TAB = "tab";


    }

    public class LocalizedNames {
        public static Map<String, String> GENERAL_EN_US = Map.ofEntries(
                Map.entry("item_group.growthcraft_deco.tab", "Growthcraft Decorations"),
                Map.entry("block.growthcraft_deco.stairs_acacia_carpet_black", "Black Carpet Acacia Stairs"),
                Map.entry("block.growthcraft_deco.stairs_acacia_carpet_blue", "Blue Carpet Acacia Stairs"),
                Map.entry("block.growthcraft_deco.stairs_acacia_carpet_brown", "Brown Carpet Acacia Stairs"),
                Map.entry("block.growthcraft_deco.stairs_acacia_carpet_cyan", "Cyan Carpet Acacia Stairs"),
                Map.entry("block.growthcraft_deco.stairs_acacia_carpet_gray", "Gray Carpet Acacia Stairs"),
                Map.entry("block.growthcraft_deco.stairs_acacia_carpet_green", "Green Carpet Acacia Stairs"),
                Map.entry("block.growthcraft_deco.stairs_acacia_carpet_light_blue", "Light Blue Carpet Acacia Stairs"),
                Map.entry("block.growthcraft_deco.stairs_acacia_carpet_light_gray", "Light Gray Carpet Acacia Stairs"),
                Map.entry("block.growthcraft_deco.stairs_acacia_carpet_lime", "Lime Carpet Acacia Stairs"),
                Map.entry("block.growthcraft_deco.stairs_acacia_carpet_magenta", "Magenta Carpet Acacia Stairs"),
                Map.entry("block.growthcraft_deco.stairs_acacia_carpet_orange", "Orange Carpet Acacia Stairs"),
                Map.entry("block.growthcraft_deco.stairs_acacia_carpet_partial_black", "Black Carpet Acacia Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_acacia_carpet_partial_blue", "Blue Carpet Acacia Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_acacia_carpet_partial_brown", "Brown Carpet Acacia Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_acacia_carpet_partial_cyan", "Cyan Carpet Acacia Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_acacia_carpet_partial_gray", "Gray Carpet Acacia Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_acacia_carpet_partial_green", "Green Carpet Acacia Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_acacia_carpet_partial_light_blue", "Light Blue Carpet Acacia Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_acacia_carpet_partial_light_gray", "Light Gray Carpet Acacia Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_acacia_carpet_partial_lime", "Lime Carpet Acacia Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_acacia_carpet_partial_magenta", "Magenta Carpet Acacia Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_acacia_carpet_partial_orange", "Orange Carpet Acacia Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_acacia_carpet_partial_pink", "Pink Carpet Acacia Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_acacia_carpet_partial_purple", "Purple Carpet Acacia Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_acacia_carpet_partial_red", "Red Carpet Acacia Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_acacia_carpet_partial_white", "White Carpet Acacia Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_acacia_carpet_partial_yellow", "Yellow Carpet Acacia Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_acacia_carpet_pink", "Pink Carpet Acacia Stairs"),
                Map.entry("block.growthcraft_deco.stairs_acacia_carpet_purple", "Purple Carpet Acacia Stairs"),
                Map.entry("block.growthcraft_deco.stairs_acacia_carpet_red", "Red Carpet Acacia Stairs"),
                Map.entry("block.growthcraft_deco.stairs_acacia_carpet_white", "White Carpet Acacia Stairs"),
                Map.entry("block.growthcraft_deco.stairs_acacia_carpet_yellow", "Yellow Carpet Acacia Stairs"),
                Map.entry("block.growthcraft_deco.stairs_birch_carpet_black", "Black Carpet Birch Stairs"),
                Map.entry("block.growthcraft_deco.stairs_birch_carpet_blue", "Blue Carpet Birch Stairs"),
                Map.entry("block.growthcraft_deco.stairs_birch_carpet_brown", "Brown Carpet Birch Stairs"),
                Map.entry("block.growthcraft_deco.stairs_birch_carpet_cyan", "Cyan Carpet Birch Stairs"),
                Map.entry("block.growthcraft_deco.stairs_birch_carpet_gray", "Gray Carpet Birch Stairs"),
                Map.entry("block.growthcraft_deco.stairs_birch_carpet_green", "Green Carpet Birch Stairs"),
                Map.entry("block.growthcraft_deco.stairs_birch_carpet_light_blue", "Light Blue Carpet Birch Stairs"),
                Map.entry("block.growthcraft_deco.stairs_birch_carpet_light_gray", "Light Gray Carpet Birch Stairs"),
                Map.entry("block.growthcraft_deco.stairs_birch_carpet_lime", "Lime Carpet Birch Stairs"),
                Map.entry("block.growthcraft_deco.stairs_birch_carpet_magenta", "Magenta Carpet Birch Stairs"),
                Map.entry("block.growthcraft_deco.stairs_birch_carpet_orange", "Orange Carpet Birch Stairs"),
                Map.entry("block.growthcraft_deco.stairs_birch_carpet_partial_black", "Black Carpet Birch Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_birch_carpet_partial_blue", "Blue Carpet Birch Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_birch_carpet_partial_brown", "Brown Carpet Birch Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_birch_carpet_partial_cyan", "Cyan Carpet Birch Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_birch_carpet_partial_gray", "Gray Carpet Birch Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_birch_carpet_partial_green", "Green Carpet Birch Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_birch_carpet_partial_light_blue", "Light Blue Carpet Birch Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_birch_carpet_partial_light_gray", "Light Gray Carpet Birch Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_birch_carpet_partial_lime", "Lime Carpet Birch Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_birch_carpet_partial_magenta", "Magenta Carpet Birch Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_birch_carpet_partial_orange", "Orange Carpet Birch Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_birch_carpet_partial_pink", "Pink Carpet Birch Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_birch_carpet_partial_purple", "Purple Carpet Birch Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_birch_carpet_partial_red", "Red Carpet Birch Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_birch_carpet_partial_white", "White Carpet Birch Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_birch_carpet_partial_yellow", "Yellow Carpet Birch Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_birch_carpet_pink", "Pink Carpet Birch Stairs"),
                Map.entry("block.growthcraft_deco.stairs_birch_carpet_purple", "Purple Carpet Birch Stairs"),
                Map.entry("block.growthcraft_deco.stairs_birch_carpet_red", "Red Carpet Birch Stairs"),
                Map.entry("block.growthcraft_deco.stairs_birch_carpet_white", "White Carpet Birch Stairs"),
                Map.entry("block.growthcraft_deco.stairs_birch_carpet_yellow", "Yellow Carpet Birch Stairs"),
                Map.entry("block.growthcraft_deco.stairs_concrete_black", "Black Concrete Stairs"),
                Map.entry("block.growthcraft_deco.stairs_concrete_blue", "Blue Concrete Stairs"),
                Map.entry("block.growthcraft_deco.stairs_concrete_brown", "Brown Concrete Stairs"),
                Map.entry("block.growthcraft_deco.stairs_concrete_cyan", "Cyan Concrete Stairs"),
                Map.entry("block.growthcraft_deco.stairs_concrete_gray", "Gray Concrete Stairs"),
                Map.entry("block.growthcraft_deco.stairs_concrete_green", "Green Concrete Stairs"),
                Map.entry("block.growthcraft_deco.stairs_concrete_light_blue", "Light Blue Concrete Stairs"),
                Map.entry("block.growthcraft_deco.stairs_concrete_light_gray", "Light Gray Concrete Stairs"),
                Map.entry("block.growthcraft_deco.stairs_concrete_lime", "Lime Concrete Stairs"),
                Map.entry("block.growthcraft_deco.stairs_concrete_magenta", "Magenta Concrete Stairs"),
                Map.entry("block.growthcraft_deco.stairs_concrete_orange", "Orange Concrete Stairs"),
                Map.entry("block.growthcraft_deco.stairs_concrete_pink", "Pink Concrete Stairs"),
                Map.entry("block.growthcraft_deco.stairs_concrete_purple", "Purple Concrete Stairs"),
                Map.entry("block.growthcraft_deco.stairs_concrete_red", "Red Concrete Stairs"),
                Map.entry("block.growthcraft_deco.stairs_concrete_white", "White Concrete Stairs"),
                Map.entry("block.growthcraft_deco.stairs_concrete_yellow", "Yellow Concrete Stairs"),
                Map.entry("block.growthcraft_deco.stairs_crimson_carpet_black", "Black Carpet Crimson Stairs"),
                Map.entry("block.growthcraft_deco.stairs_crimson_carpet_blue", "Blue Carpet Crimson Stairs"),
                Map.entry("block.growthcraft_deco.stairs_crimson_carpet_brown", "Brown Carpet Crimson Stairs"),
                Map.entry("block.growthcraft_deco.stairs_crimson_carpet_cyan", "Cyan Carpet Crimson Stairs"),
                Map.entry("block.growthcraft_deco.stairs_crimson_carpet_gray", "Gray Carpet Crimson Stairs"),
                Map.entry("block.growthcraft_deco.stairs_crimson_carpet_green", "Green Carpet Crimson Stairs"),
                Map.entry("block.growthcraft_deco.stairs_crimson_carpet_light_blue", "Light Blue Carpet Crimson Stairs"),
                Map.entry("block.growthcraft_deco.stairs_crimson_carpet_light_gray", "Light Gray Carpet Crimson Stairs"),
                Map.entry("block.growthcraft_deco.stairs_crimson_carpet_lime", "Lime Carpet Crimson Stairs"),
                Map.entry("block.growthcraft_deco.stairs_crimson_carpet_magenta", "Magenta Carpet Crimson Stairs"),
                Map.entry("block.growthcraft_deco.stairs_crimson_carpet_orange", "Orange Carpet Crimson Stairs"),
                Map.entry("block.growthcraft_deco.stairs_crimson_carpet_partial_black", "Black Carpet Crimson Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_crimson_carpet_partial_blue", "Blue Carpet Crimson Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_crimson_carpet_partial_brown", "Brown Carpet Crimson Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_crimson_carpet_partial_cyan", "Cyan Carpet Crimson Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_crimson_carpet_partial_gray", "Gray Carpet Crimson Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_crimson_carpet_partial_green", "Green Carpet Crimson Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_crimson_carpet_partial_light_blue", "Light Blue Carpet Crimson Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_crimson_carpet_partial_light_gray", "Light Gray Carpet Crimson Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_crimson_carpet_partial_lime", "Lime Carpet Crimson Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_crimson_carpet_partial_magenta", "Magenta Carpet Crimson Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_crimson_carpet_partial_orange", "Orange Carpet Crimson Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_crimson_carpet_partial_pink", "Pink Carpet Crimson Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_crimson_carpet_partial_purple", "Purple Carpet Crimson Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_crimson_carpet_partial_red", "Red Carpet Crimson Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_crimson_carpet_partial_white", "White Carpet Crimson Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_crimson_carpet_partial_yellow", "Yellow Carpet Crimson Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_crimson_carpet_pink", "Pink Carpet Crimson Stairs"),
                Map.entry("block.growthcraft_deco.stairs_crimson_carpet_purple", "Purple Carpet Crimson Stairs"),
                Map.entry("block.growthcraft_deco.stairs_crimson_carpet_red", "Red Carpet Crimson Stairs"),
                Map.entry("block.growthcraft_deco.stairs_crimson_carpet_white", "White Carpet Crimson Stairs"),
                Map.entry("block.growthcraft_deco.stairs_crimson_carpet_yellow", "Yellow Carpet Crimson Stairs"),
                Map.entry("block.growthcraft_deco.stairs_dark_oak_carpet_black", "Black Carpet Dark Oak Stairs"),
                Map.entry("block.growthcraft_deco.stairs_dark_oak_carpet_blue", "Blue Carpet Dark Oak Stairs"),
                Map.entry("block.growthcraft_deco.stairs_dark_oak_carpet_brown", "Brown Carpet Dark Oak Stairs"),
                Map.entry("block.growthcraft_deco.stairs_dark_oak_carpet_cyan", "Cyan Carpet Dark Oak Stairs"),
                Map.entry("block.growthcraft_deco.stairs_dark_oak_carpet_gray", "Gray Carpet Dark Oak Stairs"),
                Map.entry("block.growthcraft_deco.stairs_dark_oak_carpet_green", "Green Carpet Dark Oak Stairs"),
                Map.entry("block.growthcraft_deco.stairs_dark_oak_carpet_light_blue", "Light Blue Carpet Dark Oak Stairs"),
                Map.entry("block.growthcraft_deco.stairs_dark_oak_carpet_light_gray", "Light Gray Carpet Dark Oak Stairs"),
                Map.entry("block.growthcraft_deco.stairs_dark_oak_carpet_lime", "Lime Carpet Dark Oak Stairs"),
                Map.entry("block.growthcraft_deco.stairs_dark_oak_carpet_magenta", "Magenta Carpet Dark Oak Stairs"),
                Map.entry("block.growthcraft_deco.stairs_dark_oak_carpet_orange", "Orange Carpet Dark Oak Stairs"),
                Map.entry("block.growthcraft_deco.stairs_dark_oak_carpet_partial_black", "Black Carpet Dark Oak Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_dark_oak_carpet_partial_blue", "Blue Carpet Dark Oak Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_dark_oak_carpet_partial_brown", "Brown Carpet Dark Oak Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_dark_oak_carpet_partial_cyan", "Cyan Carpet Dark Oak Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_dark_oak_carpet_partial_gray", "Gray Carpet Dark Oak Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_dark_oak_carpet_partial_green", "Green Carpet Dark Oak Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_dark_oak_carpet_partial_light_blue", "Light Blue Carpet Dark Oak Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_dark_oak_carpet_partial_light_gray", "Light Gray Carpet Dark Oak Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_dark_oak_carpet_partial_lime", "Lime Carpet Dark Oak Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_dark_oak_carpet_partial_magenta", "Magenta Carpet Dark Oak Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_dark_oak_carpet_partial_orange", "Orange Carpet Dark Oak Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_dark_oak_carpet_partial_pink", "Pink Carpet Dark Oak Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_dark_oak_carpet_partial_purple", "Purple Carpet Dark Oak Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_dark_oak_carpet_partial_red", "Red Carpet Dark Oak Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_dark_oak_carpet_partial_white", "White Carpet Dark Oak Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_dark_oak_carpet_partial_yellow", "Yellow Carpet Dark Oak Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_dark_oak_carpet_pink", "Pink Carpet Dark Oak Stairs"),
                Map.entry("block.growthcraft_deco.stairs_dark_oak_carpet_purple", "Purple Carpet Dark Oak Stairs"),
                Map.entry("block.growthcraft_deco.stairs_dark_oak_carpet_red", "Red Carpet Dark Oak Stairs"),
                Map.entry("block.growthcraft_deco.stairs_dark_oak_carpet_white", "White Carpet Dark Oak Stairs"),
                Map.entry("block.growthcraft_deco.stairs_dark_oak_carpet_yellow", "Yellow Carpet Dark Oak Stairs"),
                Map.entry("block.growthcraft_deco.stairs_jungle_carpet_black", "Black Carpet Jungle Stairs"),
                Map.entry("block.growthcraft_deco.stairs_jungle_carpet_blue", "Blue Carpet Jungle Stairs"),
                Map.entry("block.growthcraft_deco.stairs_jungle_carpet_brown", "Brown Carpet Jungle Stairs"),
                Map.entry("block.growthcraft_deco.stairs_jungle_carpet_cyan", "Cyan Carpet Jungle Stairs"),
                Map.entry("block.growthcraft_deco.stairs_jungle_carpet_gray", "Gray Carpet Jungle Stairs"),
                Map.entry("block.growthcraft_deco.stairs_jungle_carpet_green", "Green Carpet Jungle Stairs"),
                Map.entry("block.growthcraft_deco.stairs_jungle_carpet_light_blue", "Light Blue Carpet Jungle Stairs"),
                Map.entry("block.growthcraft_deco.stairs_jungle_carpet_light_gray", "Light Gray Carpet Jungle Stairs"),
                Map.entry("block.growthcraft_deco.stairs_jungle_carpet_lime", "Lime Carpet Jungle Stairs"),
                Map.entry("block.growthcraft_deco.stairs_jungle_carpet_magenta", "Magenta Carpet Jungle Stairs"),
                Map.entry("block.growthcraft_deco.stairs_jungle_carpet_orange", "Orange Carpet Jungle Stairs"),
                Map.entry("block.growthcraft_deco.stairs_jungle_carpet_partial_black", "Black Carpet Jungle Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_jungle_carpet_partial_blue", "Blue Carpet Jungle Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_jungle_carpet_partial_brown", "Brown Carpet Jungle Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_jungle_carpet_partial_cyan", "Cyan Carpet Jungle Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_jungle_carpet_partial_gray", "Gray Carpet Jungle Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_jungle_carpet_partial_green", "Green Carpet Jungle Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_jungle_carpet_partial_light_blue", "Light Blue Carpet Jungle Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_jungle_carpet_partial_light_gray", "Light Gray Carpet Jungle Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_jungle_carpet_partial_lime", "Lime Carpet Jungle Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_jungle_carpet_partial_magenta", "Magenta Carpet Jungle Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_jungle_carpet_partial_orange", "Orange Carpet Jungle Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_jungle_carpet_partial_pink", "Pink Carpet Jungle Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_jungle_carpet_partial_purple", "Purple Carpet Jungle Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_jungle_carpet_partial_red", "Red Carpet Jungle Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_jungle_carpet_partial_white", "White Carpet Jungle Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_jungle_carpet_partial_yellow", "Yellow Carpet Jungle Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_jungle_carpet_pink", "Pink Carpet Jungle Stairs"),
                Map.entry("block.growthcraft_deco.stairs_jungle_carpet_purple", "Purple Carpet Jungle Stairs"),
                Map.entry("block.growthcraft_deco.stairs_jungle_carpet_red", "Red Carpet Jungle Stairs"),
                Map.entry("block.growthcraft_deco.stairs_jungle_carpet_white", "White Carpet Jungle Stairs"),
                Map.entry("block.growthcraft_deco.stairs_jungle_carpet_yellow", "Yellow Carpet Jungle Stairs"),
                Map.entry("block.growthcraft_deco.stairs_oak_carpet_black", "Black Carpet Oak Stairs"),
                Map.entry("block.growthcraft_deco.stairs_oak_carpet_blue", "Blue Carpet Oak Stairs"),
                Map.entry("block.growthcraft_deco.stairs_oak_carpet_brown", "Brown Carpet Oak Stairs"),
                Map.entry("block.growthcraft_deco.stairs_oak_carpet_cyan", "Cyan Carpet Oak Stairs"),
                Map.entry("block.growthcraft_deco.stairs_oak_carpet_gray", "Gray Carpet Oak Stairs"),
                Map.entry("block.growthcraft_deco.stairs_oak_carpet_green", "Green Carpet Oak Stairs"),
                Map.entry("block.growthcraft_deco.stairs_oak_carpet_light_blue", "Light Blue Carpet Oak Stairs"),
                Map.entry("block.growthcraft_deco.stairs_oak_carpet_light_gray", "Light Gray Carpet Oak Stairs"),
                Map.entry("block.growthcraft_deco.stairs_oak_carpet_lime", "Lime Carpet Oak Stairs"),
                Map.entry("block.growthcraft_deco.stairs_oak_carpet_magenta", "Magenta Carpet Oak Stairs"),
                Map.entry("block.growthcraft_deco.stairs_oak_carpet_orange", "Orange Carpet Oak Stairs"),
                Map.entry("block.growthcraft_deco.stairs_oak_carpet_partial_black", "Black Carpet Oak Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_oak_carpet_partial_blue", "Blue Carpet Oak Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_oak_carpet_partial_brown", "Brown Carpet Oak Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_oak_carpet_partial_cyan", "Cyan Carpet Oak Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_oak_carpet_partial_gray", "Gray Carpet Oak Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_oak_carpet_partial_green", "Green Carpet Oak Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_oak_carpet_partial_light_blue", "Light Blue Carpet Oak Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_oak_carpet_partial_light_gray", "Light Gray Carpet Oak Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_oak_carpet_partial_lime", "Lime Carpet Oak Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_oak_carpet_partial_magenta", "Magenta Carpet Oak Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_oak_carpet_partial_orange", "Orange Carpet Oak Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_oak_carpet_partial_pink", "Pink Carpet Oak Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_oak_carpet_partial_purple", "Purple Carpet Oak Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_oak_carpet_partial_red", "Red Carpet Oak Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_oak_carpet_partial_white", "White Carpet Oak Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_oak_carpet_partial_yellow", "Yellow Carpet Oak Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_oak_carpet_pink", "Pink Carpet Oak Stairs"),
                Map.entry("block.growthcraft_deco.stairs_oak_carpet_purple", "Purple Carpet Oak Stairs"),
                Map.entry("block.growthcraft_deco.stairs_oak_carpet_red", "Red Carpet Oak Stairs"),
                Map.entry("block.growthcraft_deco.stairs_oak_carpet_white", "White Carpet Oak Stairs"),
                Map.entry("block.growthcraft_deco.stairs_oak_carpet_yellow", "Yellow Carpet Oak Stairs"),
                Map.entry("block.growthcraft_deco.stairs_spruce_carpet_black", "Black Carpet Spruce Stairs"),
                Map.entry("block.growthcraft_deco.stairs_spruce_carpet_blue", "Blue Carpet Spruce Stairs"),
                Map.entry("block.growthcraft_deco.stairs_spruce_carpet_brown", "Brown Carpet Spruce Stairs"),
                Map.entry("block.growthcraft_deco.stairs_spruce_carpet_cyan", "Cyan Carpet Spruce Stairs"),
                Map.entry("block.growthcraft_deco.stairs_spruce_carpet_gray", "Gray Carpet Spruce Stairs"),
                Map.entry("block.growthcraft_deco.stairs_spruce_carpet_green", "Green Carpet Spruce Stairs"),
                Map.entry("block.growthcraft_deco.stairs_spruce_carpet_light_blue", "Light Blue Carpet Spruce Stairs"),
                Map.entry("block.growthcraft_deco.stairs_spruce_carpet_light_gray", "Light Gray Carpet Spruce Stairs"),
                Map.entry("block.growthcraft_deco.stairs_spruce_carpet_lime", "Lime Carpet Spruce Stairs"),
                Map.entry("block.growthcraft_deco.stairs_spruce_carpet_magenta", "Magenta Carpet Spruce Stairs"),
                Map.entry("block.growthcraft_deco.stairs_spruce_carpet_orange", "Orange Carpet Spruce Stairs"),
                Map.entry("block.growthcraft_deco.stairs_spruce_carpet_partial_black", "Black Carpet Spruce Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_spruce_carpet_partial_blue", "Blue Carpet Spruce Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_spruce_carpet_partial_brown", "Brown Carpet Spruce Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_spruce_carpet_partial_cyan", "Cyan Carpet Spruce Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_spruce_carpet_partial_gray", "Gray Carpet Spruce Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_spruce_carpet_partial_green", "Green Carpet Spruce Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_spruce_carpet_partial_light_blue", "Light Blue Carpet Spruce Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_spruce_carpet_partial_light_gray", "Light Gray Carpet Spruce Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_spruce_carpet_partial_lime", "Lime Carpet Spruce Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_spruce_carpet_partial_magenta", "Magenta Carpet Spruce Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_spruce_carpet_partial_orange", "Orange Carpet Spruce Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_spruce_carpet_partial_pink", "Pink Carpet Spruce Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_spruce_carpet_partial_purple", "Purple Carpet Spruce Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_spruce_carpet_partial_red", "Red Carpet Spruce Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_spruce_carpet_partial_white", "White Carpet Spruce Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_spruce_carpet_partial_yellow", "Yellow Carpet Spruce Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_spruce_carpet_pink", "Pink Carpet Spruce Stairs"),
                Map.entry("block.growthcraft_deco.stairs_spruce_carpet_purple", "Purple Carpet Spruce Stairs"),
                Map.entry("block.growthcraft_deco.stairs_spruce_carpet_red", "Red Carpet Spruce Stairs"),
                Map.entry("block.growthcraft_deco.stairs_spruce_carpet_white", "White Carpet Spruce Stairs"),
                Map.entry("block.growthcraft_deco.stairs_spruce_carpet_yellow", "Yellow Carpet Spruce Stairs"),
                Map.entry("block.growthcraft_deco.stairs_terracotta_black", "Black Terracotta Stairs"),
                Map.entry("block.growthcraft_deco.stairs_terracotta_blue", "Blue Terracotta Stairs"),
                Map.entry("block.growthcraft_deco.stairs_terracotta_brown", "Brown Terracotta Stairs"),
                Map.entry("block.growthcraft_deco.stairs_terracotta_cyan", "Cyan Terracotta Stairs"),
                Map.entry("block.growthcraft_deco.stairs_terracotta_gray", "Gray Terracotta Stairs"),
                Map.entry("block.growthcraft_deco.stairs_terracotta_green", "Green Terracotta Stairs"),
                Map.entry("block.growthcraft_deco.stairs_terracotta_light_blue", "Light Blue Terracotta Stairs"),
                Map.entry("block.growthcraft_deco.stairs_terracotta_light_gray", "Light Gray Terracotta Stairs"),
                Map.entry("block.growthcraft_deco.stairs_terracotta_lime", "Lime Terracotta Stairs"),
                Map.entry("block.growthcraft_deco.stairs_terracotta_magenta", "Magenta Terracotta Stairs"),
                Map.entry("block.growthcraft_deco.stairs_terracotta_orange", "Orange Terracotta Stairs"),
                Map.entry("block.growthcraft_deco.stairs_terracotta_pink", "Pink Terracotta Stairs"),
                Map.entry("block.growthcraft_deco.stairs_terracotta_purple", "Purple Terracotta Stairs"),
                Map.entry("block.growthcraft_deco.stairs_terracotta_red", "Red Terracotta Stairs"),
                Map.entry("block.growthcraft_deco.stairs_terracotta_white", "White Terracotta Stairs"),
                Map.entry("block.growthcraft_deco.stairs_terracotta_yellow", "Yellow Terracotta Stairs"),
                Map.entry("block.growthcraft_deco.stairs_warped_carpet_black", "Black Carpet Warped Stairs"),
                Map.entry("block.growthcraft_deco.stairs_warped_carpet_blue", "Blue Carpet Warped Stairs"),
                Map.entry("block.growthcraft_deco.stairs_warped_carpet_brown", "Brown Carpet Warped Stairs"),
                Map.entry("block.growthcraft_deco.stairs_warped_carpet_cyan", "Cyan Carpet Warped Stairs"),
                Map.entry("block.growthcraft_deco.stairs_warped_carpet_gray", "Gray Carpet Warped Stairs"),
                Map.entry("block.growthcraft_deco.stairs_warped_carpet_green", "Green Carpet Warped Stairs"),
                Map.entry("block.growthcraft_deco.stairs_warped_carpet_light_blue", "Light Blue Carpet Warped Stairs"),
                Map.entry("block.growthcraft_deco.stairs_warped_carpet_light_gray", "Light Gray Carpet Warped Stairs"),
                Map.entry("block.growthcraft_deco.stairs_warped_carpet_lime", "Lime Carpet Warped Stairs"),
                Map.entry("block.growthcraft_deco.stairs_warped_carpet_magenta", "Magenta Carpet Warped Stairs"),
                Map.entry("block.growthcraft_deco.stairs_warped_carpet_orange", "Orange Carpet Warped Stairs"),
                Map.entry("block.growthcraft_deco.stairs_warped_carpet_partial_black", "Black Carpet Warped Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_warped_carpet_partial_blue", "Blue Carpet Warped Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_warped_carpet_partial_brown", "Brown Carpet Warped Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_warped_carpet_partial_cyan", "Cyan Carpet Warped Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_warped_carpet_partial_gray", "Gray Carpet Warped Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_warped_carpet_partial_green", "Green Carpet Warped Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_warped_carpet_partial_light_blue", "Light Blue Carpet Warped Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_warped_carpet_partial_light_gray", "Light Gray Carpet Warped Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_warped_carpet_partial_lime", "Lime Carpet Warped Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_warped_carpet_partial_magenta", "Magenta Carpet Warped Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_warped_carpet_partial_orange", "Orange Carpet Warped Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_warped_carpet_partial_pink", "Pink Carpet Warped Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_warped_carpet_partial_purple", "Purple Carpet Warped Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_warped_carpet_partial_red", "Red Carpet Warped Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_warped_carpet_partial_white", "White Carpet Warped Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_warped_carpet_partial_yellow", "Yellow Carpet Warped Stairs (Partial)"),
                Map.entry("block.growthcraft_deco.stairs_warped_carpet_pink", "Pink Carpet Warped Stairs"),
                Map.entry("block.growthcraft_deco.stairs_warped_carpet_purple", "Purple Carpet Warped Stairs"),
                Map.entry("block.growthcraft_deco.stairs_warped_carpet_red", "Red Carpet Warped Stairs"),
                Map.entry("block.growthcraft_deco.stairs_warped_carpet_white", "White Carpet Warped Stairs"),
                Map.entry("block.growthcraft_deco.stairs_warped_carpet_yellow", "Yellow Carpet Warped Stairs"),
                Map.entry("block.growthcraft_deco.stairs_weathered_cut_copper_glowing", "Weathered Cut Copper Stairs Glowing"),
                Map.entry("block.growthcraft_deco.stairs_wool_black", "Black Wool Stairs"),
                Map.entry("block.growthcraft_deco.stairs_wool_blue", "Blue Wool Stairs"),
                Map.entry("block.growthcraft_deco.stairs_wool_brown", "Brown Wool Stairs"),
                Map.entry("block.growthcraft_deco.stairs_wool_cyan", "Cyan Wool Stairs"),
                Map.entry("block.growthcraft_deco.stairs_wool_gray", "Gray Wool Stairs"),
                Map.entry("block.growthcraft_deco.stairs_wool_green", "Green Wool Stairs"),
                Map.entry("block.growthcraft_deco.stairs_wool_light_blue", "Light Blue Wool Stairs"),
                Map.entry("block.growthcraft_deco.stairs_wool_light_gray", "Light Gray Wool Stairs"),
                Map.entry("block.growthcraft_deco.stairs_wool_lime", "Lime Wool Stairs"),
                Map.entry("block.growthcraft_deco.stairs_wool_magenta", "Magenta Wool Stairs"),
                Map.entry("block.growthcraft_deco.stairs_wool_orange", "Orange Wool Stairs"),
                Map.entry("block.growthcraft_deco.stairs_wool_pink", "Pink Wool Stairs"),
                Map.entry("block.growthcraft_deco.stairs_wool_purple", "Purple Wool Stairs"),
                Map.entry("block.growthcraft_deco.stairs_wool_red", "Red Wool Stairs"),
                Map.entry("block.growthcraft_deco.stairs_wool_white", "White Wool Stairs"),
                Map.entry("block.growthcraft_deco.stairs_wool_yellow", "Yellow Wool Stairs"),
                Map.entry("block.growthcraft_deco.panel_glass_black", "Black Glass Panel"),
                Map.entry("block.growthcraft_deco.panel_glass_black_glowing", "Black Glass Panel (Glowing)"),
                Map.entry("block.growthcraft_deco.panel_glass_blue", "Blue Glass Panel"),
                Map.entry("block.growthcraft_deco.panel_glass_blue_glowing", "Blue Glass Panel (Glowing)"),
                Map.entry("block.growthcraft_deco.panel_glass_brown", "Brown Glass Panel"),
                Map.entry("block.growthcraft_deco.panel_glass_brown_glowing", "Brown Glass Panel (Glowing)"),
                Map.entry("block.growthcraft_deco.panel_glass_clear", "Glass Panel"),
                Map.entry("block.growthcraft_deco.panel_glass_clear_glowing", "Glass Panel (Glowing)"),
                Map.entry("block.growthcraft_deco.panel_glass_cyan", "Cyan Glass Panel"),
                Map.entry("block.growthcraft_deco.panel_glass_cyan_glowing", "Cyan Glass Panel (Glowing)"),
                Map.entry("block.growthcraft_deco.panel_glass_gray", "Gray Glass Panel"),
                Map.entry("block.growthcraft_deco.panel_glass_gray_glowing", "Gray Glass Panel (Glowing)"),
                Map.entry("block.growthcraft_deco.panel_glass_green", "Green Glass Panel"),
                Map.entry("block.growthcraft_deco.panel_glass_green_glowing", "Green Glass Panel (Glowing)"),
                Map.entry("block.growthcraft_deco.panel_glass_light_blue", "Light Blue Glass Panel"),
                Map.entry("block.growthcraft_deco.panel_glass_light_blue_glowing", "Light Blue Glass Panel (Glowing)"),
                Map.entry("block.growthcraft_deco.panel_glass_light_gray", "Light Gray Glass Panel"),
                Map.entry("block.growthcraft_deco.panel_glass_light_gray_glowing", "Light Gray Glass Panel (Glowing)"),
                Map.entry("block.growthcraft_deco.panel_glass_lime", "Lime Glass Panel"),
                Map.entry("block.growthcraft_deco.panel_glass_lime_glowing", "Lime Glass Panel (Glowing)"),
                Map.entry("block.growthcraft_deco.panel_glass_magenta", "Magenta Glass Panel"),
                Map.entry("block.growthcraft_deco.panel_glass_magenta_glowing", "Magenta Glass Panel (Glowing)"),
                Map.entry("block.growthcraft_deco.panel_glass_orange", "Orange Glass Panel"),
                Map.entry("block.growthcraft_deco.panel_glass_orange_glowing", "Orange Glass Panel (Glowing)"),
                Map.entry("block.growthcraft_deco.panel_glass_pink", "Pink Glass Panel"),
                Map.entry("block.growthcraft_deco.panel_glass_pink_glowing", "Pink Glass Panel (Glowing)"),
                Map.entry("block.growthcraft_deco.panel_glass_purple", "Purple Glass Panel"),
                Map.entry("block.growthcraft_deco.panel_glass_purple_glowing", "Purple Glass Panel (Glowing)"),
                Map.entry("block.growthcraft_deco.panel_glass_red", "Red Glass Panel"),
                Map.entry("block.growthcraft_deco.panel_glass_red_glowing", "Red Glass Panel (Glowing)"),
                Map.entry("block.growthcraft_deco.panel_glass_white", "White Glass Panel"),
                Map.entry("block.growthcraft_deco.panel_glass_white_glowing", "White Glass Panel (Glowing)"),
                Map.entry("block.growthcraft_deco.panel_glass_yellow", "Yellow Glass Panel"),
                Map.entry("block.growthcraft_deco.panel_glass_yellow_glowing", "Yellow Glass Panel (Glowing)"),
                Map.entry("block.growthcraft_deco.panel_glowshroom", "Glowshroom Panel"),
                Map.entry("block.growthcraft_deco.panel_glowstone", "Glowstone Panel"),
                Map.entry("block.growthcraft_deco.glass_stained_black_pane_glowing", "Black Stained Glass Pane (Glowing)"),
                Map.entry("block.growthcraft_deco.glass_stained_blue_pane_glowing", "Blue Stained Glass Pane (Glowing)"),
                Map.entry("block.growthcraft_deco.glass_stained_brown_pane_glowing", "Brown Stained Glass Pane (Glowing)"),
                Map.entry("block.growthcraft_deco.glass_stained_clear_pane_glowing", "Clear Stained Glass Pane (Glowing)"),
                Map.entry("block.growthcraft_deco.glass_stained_cyan_pane_glowing", "Cyan Stained Glass Pane (Glowing)"),
                Map.entry("block.growthcraft_deco.glass_stained_gray_pane_glowing", "Gray Stained Glass Pane (Glowing)"),
                Map.entry("block.growthcraft_deco.glass_stained_green_pane_glowing", "Green Stained Glass Pane (Glowing)"),
                Map.entry("block.growthcraft_deco.glass_stained_light_blue_pane_glowing", "Light Blue Stained Glass Pane (Glowing)"),
                Map.entry("block.growthcraft_deco.glass_stained_light_gray_pane_glowing", "Light Gray Stained Glass Pane (Glowing)"),
                Map.entry("block.growthcraft_deco.glass_stained_lime_pane_glowing", "Lime Stained Glass Pane (Glowing)"),
                Map.entry("block.growthcraft_deco.glass_stained_magenta_pane_glowing", "Magenta Stained Glass Pane (Glowing)"),
                Map.entry("block.growthcraft_deco.glass_stained_orange_pane_glowing", "Orange Stained Glass Pane (Glowing)"),
                Map.entry("block.growthcraft_deco.glass_stained_pink_pane_glowing", "Pink Stained Glass Pane (Glowing)"),
                Map.entry("block.growthcraft_deco.glass_stained_purple_pane_glowing", "Purple Stained Glass Pane (Glowing)"),
                Map.entry("block.growthcraft_deco.glass_stained_red_pane_glowing", "Red Stained Glass Pane (Glowing)"),
                Map.entry("block.growthcraft_deco.glass_stained_white_pane_glowing", "White Stained Glass Pane (Glowing)"),
                Map.entry("block.growthcraft_deco.glass_stained_yellow_pane_glowing", "Yellow Stained Glass Pane (Glowing)"),
                Map.entry("block.growthcraft_deco.slab_glass_black", "Black Glass Slab"),
                Map.entry("block.growthcraft_deco.slab_glass_black_glowing", "Black Glass Slab (Glowing)"),
                Map.entry("block.growthcraft_deco.slab_glass_blue", "Blue Glass Slab"),
                Map.entry("block.growthcraft_deco.slab_glass_blue_glowing", "Blue Glass Slab (Glowing)"),
                Map.entry("block.growthcraft_deco.slab_glass_brown", "Brown Glass Slab"),
                Map.entry("block.growthcraft_deco.slab_glass_brown_glowing", "Brown Glass Slab (Glowing)"),
                Map.entry("block.growthcraft_deco.slab_glass_clear", "Glass Slab"),
                Map.entry("block.growthcraft_deco.slab_glass_clear_glowing", "Glass Slab (Glowing)"),
                Map.entry("block.growthcraft_deco.slab_glass_cyan", "Cyan Glass Slab"),
                Map.entry("block.growthcraft_deco.slab_glass_cyan_glowing", "Cyan Glass Slab (Glowing)"),
                Map.entry("block.growthcraft_deco.slab_glass_gray", "Gray Glass Slab"),
                Map.entry("block.growthcraft_deco.slab_glass_gray_glowing", "Gray Glass Slab (Glowing)"),
                Map.entry("block.growthcraft_deco.slab_glass_green", "Green Glass Slab"),
                Map.entry("block.growthcraft_deco.slab_glass_green_glowing", "Green Glass Slab (Glowing)"),
                Map.entry("block.growthcraft_deco.slab_glass_light_blue", "Light Blue Glass Slab"),
                Map.entry("block.growthcraft_deco.slab_glass_light_blue_glowing", "Light Blue Glass Slab (Glowing)"),
                Map.entry("block.growthcraft_deco.slab_glass_light_gray", "Light Gray Glass Slab"),
                Map.entry("block.growthcraft_deco.slab_glass_light_gray_glowing", "Light Gray Glass Slab (Glowing)"),
                Map.entry("block.growthcraft_deco.slab_glass_lime", "Lime Glass Slab"),
                Map.entry("block.growthcraft_deco.slab_glass_lime_glowing", "Lime Glass Slab (Glowing)"),
                Map.entry("block.growthcraft_deco.slab_glass_magenta", "Magenta Glass Slab"),
                Map.entry("block.growthcraft_deco.slab_glass_magenta_glowing", "Magenta Glass Slab (Glowing)"),
                Map.entry("block.growthcraft_deco.slab_glass_orange", "Orange Glass Slab"),
                Map.entry("block.growthcraft_deco.slab_glass_orange_glowing", "Orange Glass Slab (Glowing)"),
                Map.entry("block.growthcraft_deco.slab_glass_pink", "Pink Glass Slab"),
                Map.entry("block.growthcraft_deco.slab_glass_pink_glowing", "Pink Glass Slab (Glowing)"),
                Map.entry("block.growthcraft_deco.slab_glass_purple", "Purple Glass Slab"),
                Map.entry("block.growthcraft_deco.slab_glass_purple_glowing", "Purple Glass Slab (Glowing)"),
                Map.entry("block.growthcraft_deco.slab_glass_red", "Red Glass Slab"),
                Map.entry("block.growthcraft_deco.slab_glass_red_glowing", "Red Glass Slab (Glowing)"),
                Map.entry("block.growthcraft_deco.slab_glass_white", "White Glass Slab"),
                Map.entry("block.growthcraft_deco.slab_glass_white_glowing", "White Glass Slab (Glowing)"),
                Map.entry("block.growthcraft_deco.slab_glass_yellow", "Yellow Glass Slab"),
                Map.entry("block.growthcraft_deco.slab_glass_yellow_glowing", "Yellow Glass Slab (Glowing)"),
                Map.entry("block.growthcraft_deco.slab_glowshroom", "Glowshroom Slab"),
                Map.entry("block.growthcraft_deco.slab_glowstone", "Glowstone Slab"),
                Map.entry("block.growthcraft_deco.stairs_waxed_cut_copper_glowing", "Waxed Cut Copper Stairs (Glowing)"),
                Map.entry("block.growthcraft_deco.stairs_waxed_exposed_cut_copper_glowing", "Waxed Exposed Cut Copper Stairs (Glowing)"),
                Map.entry("block.growthcraft_deco.stairs_waxed_oxidized_cut_copper_glowing", "Waxed Oxidized Cut Copper Stairs (Glowing)"),
                Map.entry("block.growthcraft_deco.stairs_waxed_weathered_cut_copper_glowing", "Waxed Weathered Cut Copper Stairs (Glowing)")
        );

        public static HashMap<String, String> GLOWING_BLOCKS_EN_US = new HashMap<String, String>();
        public static HashMap<String, String> DOORS_EN_US = new HashMap<String, String>();
    }

}