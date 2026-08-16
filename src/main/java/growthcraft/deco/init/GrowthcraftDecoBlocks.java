package growthcraft.deco.init;

import growthcraft.deco.block.*;
import growthcraft.deco.shared.Reference;
import growthcraft.deco.utils.ColorUtils;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StainedGlassBlock;
import net.minecraft.world.level.block.TintedGlassBlock;
import net.minecraft.world.level.block.TransparentBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import org.apache.commons.lang3.text.WordUtils;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Supplier;

public class GrowthcraftDecoBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Reference.MODID);

    public static HashMap<String, DeferredBlock<Block>> GLOWING_BLOCKS = new HashMap<>();
    public static HashMap<String, DeferredBlock<Block>> GLOWING_STAIR_BLOCKS = new HashMap<>();
    public static HashMap<String, DeferredBlock<Block>> GLOWING_SLAB_BLOCKS = new HashMap<>();
    public static HashMap<String, DeferredBlock<Block>> GLOWING_TRANSPARENT_BLOCKS = new HashMap<>();
    public static HashMap<String, DeferredBlock<Block>> GLOWING_GLASS_BLOCKS = new HashMap<>();
    public static HashMap<String, DeferredBlock<Block>> CARPET_STAIR_BLOCKS = new HashMap<>();
    public static HashMap<String, DeferredBlock<Block>> CARPET_PARTIAL_STAIR_BLOCKS = new HashMap<>();
    public static HashMap<String, DeferredBlock<Block>> HIDDEN_DOOR_BLOCKS = new HashMap<>();

    public static HashMap<DeferredBlock<Block>, Block> GLOWING_BLOCKS_RECIPE_MAP = new HashMap<>();
    public static HashMap<DeferredBlock<Block>, Block> GLOWING_STAIR_BLOCKS_RECIPE_MAP = new HashMap<>();
    public static HashMap<DeferredBlock<Block>, Block> GLOWING_SLAB_BLOCKS_RECIPE_MAP = new HashMap<>();
    public static HashMap<DeferredBlock<Block>, Block> GLOWING_TRANSPARENT_BLOCKS_RECIPE_MAP = new HashMap<>();
    public static HashMap<DeferredBlock<Block>, Block> GLOWING_GLASS_BLOCKS_RECIPE_MAP = new HashMap<>();
    public static HashMap<DeferredBlock<Block>, HashMap<String, Block>> CARPET_STAIR_BLOCKS_RECIPE_MAP = new HashMap<>();
    public static HashMap<DeferredBlock<Block>, HashMap<String, Block>> CARPET_PARTIAL_STAIR_BLOCKS_RECIPE_MAP = new HashMap<>();
    public static HashMap<DeferredBlock<Block>, Block> HIDDEN_DOOR_BLOCKS_RECIPE_MAP = new HashMap<>();

    public static HashMap<DeferredBlock<Block>, ResourceLocation> GLOWING_BLOCK_STATE_MAP = new HashMap<>();
    public static HashMap<DeferredBlock<Block>, ResourceLocation> GLOWING_STAIR_BLOCKS_STATE_MAP = new HashMap<>();
    public static HashMap<DeferredBlock<Block>, ResourceLocation> GLOWING_SLAB_BLOCKS_STATE_MAP = new HashMap<>();
    public static HashMap<DeferredBlock<Block>, ResourceLocation> GLOWING_TRANSPARENT_BLOCKS_STATE_MAP = new HashMap<>();
    public static HashMap<DeferredBlock<Block>, ResourceLocation> GLOWING_GLASS_BLOCKS_STATE_MAP = new HashMap<>();
    public static HashMap<DeferredBlock<Block>, ResourceLocation> CARPET_STAIR_BLOCKS_STATE_MAP = new HashMap<>();
    public static HashMap<DeferredBlock<Block>, ResourceLocation> CARPET_PARTIAL_STAIR_BLOCKS_STATE_MAP = new HashMap<>();
    public static HashMap<DeferredBlock<Block>, ResourceLocation> HIDDEN_DOOR_VANILLA_BLOCK_STATE_MAP = new HashMap<>();

    /**
     * ToolType Mineable Tag Data Generation.
     */
    public static HashMap<String, DeferredBlock<Block>> BLOCKS_MINEABLE_AXE = new HashMap<>();
    public static HashMap<String, DeferredBlock<Block>> BLOCKS_MINEABLE_PICKAXE = new HashMap<>();

    public static final DeferredBlock<Block> STAIRS_CONCRETE_BLACK = registerBlock(
            Reference.UnlocalizedName.STAIRS_CONCRETE_BLACK,
            ConcreteStairBlock::new
    );
    public static final DeferredBlock<Block> STAIRS_CONCRETE_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIRS_CONCRETE_BLUE,
            ConcreteStairBlock::new
    );
    public static final DeferredBlock<Block> STAIRS_CONCRETE_BROWN = registerBlock(
            Reference.UnlocalizedName.STAIRS_CONCRETE_BROWN,
            ConcreteStairBlock::new
    );
    public static final DeferredBlock<Block> STAIRS_CONCRETE_CYAN = registerBlock(
            Reference.UnlocalizedName.STAIRS_CONCRETE_CYAN,
            ConcreteStairBlock::new
    );
    public static final DeferredBlock<Block> STAIRS_CONCRETE_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIRS_CONCRETE_GRAY,
            ConcreteStairBlock::new
    );
    public static final DeferredBlock<Block> STAIRS_CONCRETE_GREEN = registerBlock(
            Reference.UnlocalizedName.STAIRS_CONCRETE_GREEN,
            ConcreteStairBlock::new
    );
    public static final DeferredBlock<Block> STAIRS_CONCRETE_LIGHT_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIRS_CONCRETE_LIGHT_BLUE,
            ConcreteStairBlock::new
    );
    public static final DeferredBlock<Block> STAIRS_CONCRETE_LIGHT_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIRS_CONCRETE_LIGHT_GRAY,
            ConcreteStairBlock::new
    );
    public static final DeferredBlock<Block> STAIRS_CONCRETE_LIME = registerBlock(
            Reference.UnlocalizedName.STAIRS_CONCRETE_LIME,
            ConcreteStairBlock::new
    );
    public static final DeferredBlock<Block> STAIRS_CONCRETE_MAGENTA = registerBlock(
            Reference.UnlocalizedName.STAIRS_CONCRETE_MAGENTA,
            ConcreteStairBlock::new
    );
    public static final DeferredBlock<Block> STAIRS_CONCRETE_ORANGE = registerBlock(
            Reference.UnlocalizedName.STAIRS_CONCRETE_ORANGE,
            ConcreteStairBlock::new
    );
    public static final DeferredBlock<Block> STAIRS_CONCRETE_PINK = registerBlock(
            Reference.UnlocalizedName.STAIRS_CONCRETE_PINK,
            ConcreteStairBlock::new
    );
    public static final DeferredBlock<Block> STAIRS_CONCRETE_PURPLE = registerBlock(
            Reference.UnlocalizedName.STAIRS_CONCRETE_PURPLE,
            ConcreteStairBlock::new
    );
    public static final DeferredBlock<Block> STAIRS_CONCRETE_RED = registerBlock(
            Reference.UnlocalizedName.STAIRS_CONCRETE_RED,
            ConcreteStairBlock::new
    );
    public static final DeferredBlock<Block> STAIRS_CONCRETE_WHITE = registerBlock(
            Reference.UnlocalizedName.STAIRS_CONCRETE_WHITE,
            ConcreteStairBlock::new
    );
    public static final DeferredBlock<Block> STAIRS_CONCRETE_YELLOW = registerBlock(
            Reference.UnlocalizedName.STAIRS_CONCRETE_YELLOW,
            ConcreteStairBlock::new
    );

    public static final DeferredBlock<Block> GLASS_STAINED_BLACK_PANE_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANE_BLACK_GLOWING,
            () -> new GlassPane(DyeColor.BLACK)
    );

    public static final DeferredBlock<Block> GLASS_PANEL_BLACK = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_BLACK,
            GlassPanel::new
    );

    public static final DeferredBlock<Block> GLASS_PANEL_BLACK_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_BLACK_GLOWING,
            () -> new GlassPanel(15)
    );

    public static final DeferredBlock<Block> GLASS_STAINED_BLUE_PANE_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANE_BLUE_GLOWING,
            () -> new GlassPane(DyeColor.BLUE)
    );

    public static final DeferredBlock<Block> GLASS_PANEL_BLUE = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_BLUE,
            GlassPanel::new
    );
    public static final DeferredBlock<Block> GLASS_PANEL_BLUE_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_BLUE_GLOWING,
            () -> new GlassPanel(15)
    );
    public static final DeferredBlock<Block> GLASS_STAINED_BROWN_PANE_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANE_BROWN_GLOWING,
            () -> new GlassPane(DyeColor.BROWN)
    );
    public static final DeferredBlock<Block> GLASS_PANEL_BROWN = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_BROWN,
            GlassPanel::new
    );
    public static final DeferredBlock<Block> GLASS_PANEL_BROWN_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_BROWN_GLOWING,
            () -> new GlassPanel(15)
    );
    public static final DeferredBlock<Block> GLASS_STAINED_CLEAR_PANE_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANE_CLEAR_GLOWING,
            () -> new GlassPane(DyeColor.WHITE)
    );
    public static final DeferredBlock<Block> GLASS_PANEL_CLEAR = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_CLEAR,
            GlassPanel::new
    );
    public static final DeferredBlock<Block> GLASS_PANEL_CLEAR_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_CLEAR_GLOWING,
            () -> new GlassPanel(15)
    );
    public static final DeferredBlock<Block> GLASS_STAINED_CYAN_PANE_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANE_CYAN_GLOWING,
            () -> new GlassPane(DyeColor.CYAN)
    );
    public static final DeferredBlock<Block> GLASS_PANEL_CYAN = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_CYAN,
            GlassPanel::new
    );
    public static final DeferredBlock<Block> GLASS_PANEL_CYAN_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_CYAN_GLOWING,
            () -> new GlassPanel(15)
    );
    public static final DeferredBlock<Block> GLASS_STAINED_GRAY_PANE_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANE_GRAY_GLOWING,
            () -> new GlassPane(DyeColor.GRAY)
    );
    public static final DeferredBlock<Block> GLASS_PANEL_GRAY = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_GRAY,
            GlassPanel::new
    );
    public static final DeferredBlock<Block> GLASS_PANEL_GRAY_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_GRAY_GLOWING,
            () -> new GlassPanel(15)
    );
    public static final DeferredBlock<Block> GLASS_STAINED_GREEN_PANE_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANE_GREEN_GLOWING,
            () -> new GlassPane(DyeColor.GREEN)
    );
    public static final DeferredBlock<Block> GLASS_PANEL_GREEN = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_GREEN,
            GlassPanel::new
    );
    public static final DeferredBlock<Block> GLASS_PANEL_GREEN_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_GREEN_GLOWING,
            () -> new GlassPanel(15)
    );
    public static final DeferredBlock<Block> GLASS_STAINED_LIGHT_BLUE_PANE_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANE_LIGHT_BLUE_GLOWING,
            () -> new GlassPane(DyeColor.LIGHT_BLUE)
    );
    public static final DeferredBlock<Block> GLASS_PANEL_LIGHT_BLUE = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_LIGHT_BLUE,
            GlassPanel::new
    );
    public static final DeferredBlock<Block> GLASS_PANEL_LIGHT_BLUE_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_LIGHT_BLUE_GLOWING,
            () -> new GlassPanel(15)
    );
    public static final DeferredBlock<Block> GLASS_STAINED_LIGHT_GRAY_PANE_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANE_LIGHT_GRAY_GLOWING,
            () -> new GlassPane(DyeColor.LIGHT_GRAY)
    );
    public static final DeferredBlock<Block> GLASS_PANEL_LIGHT_GRAY = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_LIGHT_GRAY,
            GlassPanel::new
    );
    public static final DeferredBlock<Block> GLASS_PANEL_LIGHT_GRAY_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_LIGHT_GRAY_GLOWING,
            () -> new GlassPanel(15)
    );
    public static final DeferredBlock<Block> GLASS_STAINED_LIME_PANE_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANE_LIME_GLOWING,
            () -> new GlassPane(DyeColor.LIME)
    );
    public static final DeferredBlock<Block> GLASS_PANEL_LIME = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_LIME,
            GlassPanel::new
    );
    public static final DeferredBlock<Block> GLASS_PANEL_LIME_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_LIME_GLOWING,
            () -> new GlassPanel(15)
    );
    public static final DeferredBlock<Block> GLASS_STAINED_MAGENTA_PANE_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANE_MAGENTA_GLOWING,
            () -> new GlassPane(DyeColor.MAGENTA)
    );
    public static final DeferredBlock<Block> GLASS_PANEL_MAGENTA = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_MAGENTA,
            GlassPanel::new
    );
    public static final DeferredBlock<Block> GLASS_PANEL_MAGENTA_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_MAGENTA_GLOWING,
            () -> new GlassPanel(15)
    );
    public static final DeferredBlock<Block> GLASS_STAINED_ORANGE_PANE_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANE_ORANGE_GLOWING,
            () -> new GlassPane(DyeColor.ORANGE)
    );
    public static final DeferredBlock<Block> GLASS_PANEL_ORANGE = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_ORANGE,
            GlassPanel::new
    );
    public static final DeferredBlock<Block> GLASS_PANEL_ORANGE_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_ORANGE_GLOWING,
            () -> new GlassPanel(15)
    );
    public static final DeferredBlock<Block> GLASS_STAINED_PINK_PANE_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANE_PINK_GLOWING,
            () -> new GlassPane(DyeColor.PINK)
    );
    public static final DeferredBlock<Block> GLASS_PANEL_PINK = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_PINK,
            GlassPanel::new
    );
    public static final DeferredBlock<Block> GLASS_PANEL_PINK_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_PINK_GLOWING,
            () -> new GlassPanel(15)
    );
    public static final DeferredBlock<Block> GLASS_STAINED_PURPLE_PANE_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANE_PURPLE_GLOWING,
            () -> new GlassPane(DyeColor.PURPLE)
    );
    public static final DeferredBlock<Block> GLASS_PANEL_PURPLE = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_PURPLE,
            GlassPanel::new
    );
    public static final DeferredBlock<Block> GLASS_PANEL_PURPLE_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_PURPLE_GLOWING,
            () -> new GlassPanel(15)
    );
    public static final DeferredBlock<Block> GLASS_STAINED_RED_PANE_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANE_RED_GLOWING,
            () -> new GlassPane(DyeColor.RED)
    );
    public static final DeferredBlock<Block> GLASS_PANEL_RED = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_RED,
            GlassPanel::new
    );
    public static final DeferredBlock<Block> GLASS_PANEL_RED_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_RED_GLOWING,
            () -> new GlassPanel(15)
    );
    public static final DeferredBlock<Block> GLASS_STAINED_WHITE_PANE_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANE_WHITE_GLOWING,
            () -> new GlassPane(DyeColor.WHITE)
    );
    public static final DeferredBlock<Block> GLASS_PANEL_WHITE = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_WHITE,
            GlassPanel::new
    );
    public static final DeferredBlock<Block> GLASS_PANEL_WHITE_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_WHITE_GLOWING,
            () -> new GlassPanel(15)
    );
    public static final DeferredBlock<Block> GLASS_STAINED_YELLOW_PANE_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANE_YELLOW_GLOWING,
            () -> new GlassPane(DyeColor.YELLOW)
    );
    public static final DeferredBlock<Block> GLASS_PANEL_YELLOW = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_YELLOW,
            GlassPanel::new
    );
    public static final DeferredBlock<Block> GLASS_PANEL_YELLOW_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_YELLOW_GLOWING,
            () -> new GlassPanel(15)
    );
    public static final DeferredBlock<Block> PANEL_GLOWSHROOM = registerBlock(
            Reference.UnlocalizedName.PANEL_GLOWSHROOM,
            OrganicPanel::new
    );
    public static final DeferredBlock<Block> PANEL_GLOWSTONE = registerBlock(
            Reference.UnlocalizedName.PANEL_GLOWSTONE,
            GlassPanel::new
    );
    public static final DeferredBlock<Block> SLAB_GLASS_BLACK = registerBlock(
            Reference.UnlocalizedName.SLAB_GLASS_BLACK,
            GlassHalfBlock::new
    );
    public static final DeferredBlock<Block> SLAB_GLASS_BLACK_GLOWING = registerBlock(
            Reference.UnlocalizedName.SLAB_GLASS_BLACK_GLOWING,
            () -> new GlassHalfBlock(15)
    );
    public static final DeferredBlock<Block> SLAB_GLASS_BLUE = registerBlock(
            Reference.UnlocalizedName.SLAB_GLASS_BLUE,
            GlassHalfBlock::new
    );
    public static final DeferredBlock<Block> SLAB_GLASS_BLUE_GLOWING = registerBlock(
            Reference.UnlocalizedName.SLAB_GLASS_BLUE_GLOWING,
            () -> new GlassHalfBlock(15)
    );
    public static final DeferredBlock<Block> SLAB_GLASS_BROWN = registerBlock(
            Reference.UnlocalizedName.SLAB_GLASS_BROWN,
            GlassHalfBlock::new
    );
    public static final DeferredBlock<Block> SLAB_GLASS_BROWN_GLOWING = registerBlock(
            Reference.UnlocalizedName.SLAB_GLASS_BROWN_GLOWING,
            () -> new GlassHalfBlock(15)
    );
    public static final DeferredBlock<Block> SLAB_GLASS_CLEAR = registerBlock(
            Reference.UnlocalizedName.SLAB_GLASS_CLEAR,
            GlassHalfBlock::new
    );
    public static final DeferredBlock<Block> SLAB_GLASS_CLEAR_GLOWING = registerBlock(
            Reference.UnlocalizedName.SLAB_GLASS_CLEAR_GLOWING,
            () -> new GlassHalfBlock(15)
    );
    public static final DeferredBlock<Block> SLAB_GLASS_CYAN = registerBlock(
            Reference.UnlocalizedName.SLAB_GLASS_CYAN,
            GlassHalfBlock::new
    );
    public static final DeferredBlock<Block> SLAB_GLASS_CYAN_GLOWING = registerBlock(
            Reference.UnlocalizedName.SLAB_GLASS_CYAN_GLOWING,
            () -> new GlassHalfBlock(15)
    );
    public static final DeferredBlock<Block> SLAB_GLASS_GRAY = registerBlock(
            Reference.UnlocalizedName.SLAB_GLASS_GRAY,
            GlassHalfBlock::new
    );
    public static final DeferredBlock<Block> SLAB_GLASS_GRAY_GLOWING = registerBlock(
            Reference.UnlocalizedName.SLAB_GLASS_GRAY_GLOWING,
            () -> new GlassHalfBlock(15)
    );
    public static final DeferredBlock<Block> SLAB_GLASS_GREEN = registerBlock(
            Reference.UnlocalizedName.SLAB_GLASS_GREEN,
            GlassHalfBlock::new
    );
    public static final DeferredBlock<Block> SLAB_GLASS_GREEN_GLOWING = registerBlock(
            Reference.UnlocalizedName.SLAB_GLASS_GREEN_GLOWING,
            () -> new GlassHalfBlock(15)
    );
    public static final DeferredBlock<Block> SLAB_GLASS_LIGHT_BLUE = registerBlock(
            Reference.UnlocalizedName.SLAB_GLASS_LIGHT_BLUE,
            GlassHalfBlock::new
    );
    public static final DeferredBlock<Block> SLAB_GLASS_LIGHT_BLUE_GLOWING = registerBlock(
            Reference.UnlocalizedName.SLAB_GLASS_LIGHT_BLUE_GLOWING,
            () -> new GlassHalfBlock(15)
    );
    public static final DeferredBlock<Block> SLAB_GLASS_LIGHT_GRAY = registerBlock(
            Reference.UnlocalizedName.SLAB_GLASS_LIGHT_GRAY,
            GlassHalfBlock::new
    );
    public static final DeferredBlock<Block> SLAB_GLASS_LIGHT_GRAY_GLOWING = registerBlock(
            Reference.UnlocalizedName.SLAB_GLASS_LIGHT_GRAY_GLOWING,
            () -> new GlassHalfBlock(15)
    );
    public static final DeferredBlock<Block> SLAB_GLASS_LIME = registerBlock(
            Reference.UnlocalizedName.SLAB_GLASS_LIME,
            GlassHalfBlock::new
    );
    public static final DeferredBlock<Block> SLAB_GLASS_LIME_GLOWING = registerBlock(
            Reference.UnlocalizedName.SLAB_GLASS_LIME_GLOWING,
            () -> new GlassHalfBlock(15)
    );
    public static final DeferredBlock<Block> SLAB_GLASS_MAGENTA = registerBlock(
            Reference.UnlocalizedName.SLAB_GLASS_MAGENTA,
            GlassHalfBlock::new
    );
    public static final DeferredBlock<Block> SLAB_GLASS_MAGENTA_GLOWING = registerBlock(
            Reference.UnlocalizedName.SLAB_GLASS_MAGENTA_GLOWING,
            () -> new GlassHalfBlock(15)
    );
    public static final DeferredBlock<Block> SLAB_GLASS_ORANGE = registerBlock(
            Reference.UnlocalizedName.SLAB_GLASS_ORANGE,
            GlassHalfBlock::new
    );
    public static final DeferredBlock<Block> SLAB_GLASS_ORANGE_GLOWING = registerBlock(
            Reference.UnlocalizedName.SLAB_GLASS_ORANGE_GLOWING,
            () -> new GlassHalfBlock(15)
    );
    public static final DeferredBlock<Block> SLAB_GLASS_PINK = registerBlock(
            Reference.UnlocalizedName.SLAB_GLASS_PINK,
            GlassHalfBlock::new
    );
    public static final DeferredBlock<Block> SLAB_GLASS_PINK_GLOWING = registerBlock(
            Reference.UnlocalizedName.SLAB_GLASS_PINK_GLOWING,
            () -> new GlassHalfBlock(15)
    );
    public static final DeferredBlock<Block> SLAB_GLASS_PURPLE = registerBlock(
            Reference.UnlocalizedName.SLAB_GLASS_PURPLE,
            GlassHalfBlock::new
    );
    public static final DeferredBlock<Block> SLAB_GLASS_PURPLE_GLOWING = registerBlock(
            Reference.UnlocalizedName.SLAB_GLASS_PURPLE_GLOWING,
            () -> new GlassHalfBlock(15)
    );
    public static final DeferredBlock<Block> SLAB_GLASS_RED = registerBlock(
            Reference.UnlocalizedName.SLAB_GLASS_RED,
            GlassHalfBlock::new
    );
    public static final DeferredBlock<Block> SLAB_GLASS_RED_GLOWING = registerBlock(
            Reference.UnlocalizedName.SLAB_GLASS_RED_GLOWING,
            () -> new GlassHalfBlock(15)
    );
    public static final DeferredBlock<Block> SLAB_GLASS_WHITE = registerBlock(
            Reference.UnlocalizedName.SLAB_GLASS_WHITE,
            GlassHalfBlock::new
    );
    public static final DeferredBlock<Block> SLAB_GLASS_WHITE_GLOWING = registerBlock(
            Reference.UnlocalizedName.SLAB_GLASS_WHITE_GLOWING,
            () -> new GlassHalfBlock(15)
    );
    public static final DeferredBlock<Block> SLAB_GLASS_YELLOW = registerBlock(
            Reference.UnlocalizedName.SLAB_GLASS_YELLOW,
            GlassHalfBlock::new
    );
    public static final DeferredBlock<Block> SLAB_GLASS_YELLOW_GLOWING = registerBlock(
            Reference.UnlocalizedName.SLAB_GLASS_YELLOW_GLOWING,
            () -> new GlassHalfBlock(15)
    );
    public static final DeferredBlock<Block> SLAB_GLOWSHROOM = registerBlock(
            Reference.UnlocalizedName.SLAB_GLOWSHROOM,
            () -> new OrganicHalfBlock(15)
    );
    public static final DeferredBlock<Block> SLAB_GLOWSTONE = registerBlock(
            Reference.UnlocalizedName.SLAB_GLOWSTONE,
            GlassHalfBlock::new
    );
    public static final DeferredBlock<Block> STAIR_ACACIA_CARPET_BLACK = registerBlock(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_BLACK,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_ACACIA_CARPET_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_BLUE,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_ACACIA_CARPET_BROWN = registerBlock(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_BROWN,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_ACACIA_CARPET_CYAN = registerBlock(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_CYAN,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_ACACIA_CARPET_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_GRAY,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_ACACIA_CARPET_GREEN = registerBlock(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_GREEN,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_ACACIA_CARPET_LIGHT_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_LIGHT_BLUE,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_ACACIA_CARPET_LIGHT_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_LIGHT_GRAY,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_ACACIA_CARPET_LIME = registerBlock(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_LIME,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_ACACIA_CARPET_MAGENTA = registerBlock(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_MAGENTA,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_ACACIA_CARPET_ORANGE = registerBlock(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_ORANGE,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_ACACIA_CARPET_PARTIAL_BLACK = registerBlock(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_PARTIAL_BLACK,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_ACACIA_CARPET_PARTIAL_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_PARTIAL_BLUE,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_ACACIA_CARPET_PARTIAL_BROWN = registerBlock(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_PARTIAL_BROWN,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_ACACIA_CARPET_PARTIAL_CYAN = registerBlock(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_PARTIAL_CYAN,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_ACACIA_CARPET_PARTIAL_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_PARTIAL_GRAY,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_ACACIA_CARPET_PARTIAL_GREEN = registerBlock(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_PARTIAL_GREEN,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_ACACIA_CARPET_PARTIAL_LIGHT_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_PARTIAL_LIGHT_BLUE,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_ACACIA_CARPET_PARTIAL_LIGHT_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_PARTIAL_LIGHT_GRAY,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_ACACIA_CARPET_PARTIAL_LIME = registerBlock(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_PARTIAL_LIME,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_ACACIA_CARPET_PARTIAL_MAGENTA = registerBlock(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_PARTIAL_MAGENTA,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_ACACIA_CARPET_PARTIAL_ORANGE = registerBlock(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_PARTIAL_ORANGE,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_ACACIA_CARPET_PARTIAL_PINK = registerBlock(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_PARTIAL_PINK,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_ACACIA_CARPET_PARTIAL_PURPLE = registerBlock(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_PARTIAL_PURPLE,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_ACACIA_CARPET_PARTIAL_RED = registerBlock(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_PARTIAL_RED,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_ACACIA_CARPET_PARTIAL_WHITE = registerBlock(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_PARTIAL_WHITE,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_ACACIA_CARPET_PARTIAL_YELLOW = registerBlock(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_PARTIAL_YELLOW,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_ACACIA_CARPET_PINK = registerBlock(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_PINK,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_ACACIA_CARPET_PURPLE = registerBlock(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_PURPLE,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_ACACIA_CARPET_RED = registerBlock(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_RED,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_ACACIA_CARPET_WHITE = registerBlock(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_WHITE,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_ACACIA_CARPET_YELLOW = registerBlock(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_YELLOW,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_BIRCH_CARPET_BLACK = registerBlock(
            Reference.UnlocalizedName.STAIR_BIRCH_CARPET_BLACK,
            () -> new CarpetStairBlock(Blocks.BIRCH_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_BIRCH_CARPET_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIR_BIRCH_CARPET_BLUE,
            () -> new CarpetStairBlock(Blocks.BIRCH_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_BIRCH_CARPET_BROWN = registerBlock(
            Reference.UnlocalizedName.STAIR_BIRCH_CARPET_BROWN,
            () -> new CarpetStairBlock(Blocks.BIRCH_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_BIRCH_CARPET_CYAN = registerBlock(
            Reference.UnlocalizedName.STAIR_BIRCH_CARPET_CYAN,
            () -> new CarpetStairBlock(Blocks.BIRCH_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_BIRCH_CARPET_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIR_BIRCH_CARPET_GRAY,
            () -> new CarpetStairBlock(Blocks.BIRCH_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_BIRCH_CARPET_GREEN = registerBlock(
            Reference.UnlocalizedName.STAIR_BIRCH_CARPET_GREEN,
            () -> new CarpetStairBlock(Blocks.BIRCH_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_BIRCH_CARPET_LIGHT_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIR_BIRCH_CARPET_LIGHT_BLUE,
            () -> new CarpetStairBlock(Blocks.BIRCH_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_BIRCH_CARPET_LIGHT_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIR_BIRCH_CARPET_LIGHT_GRAY,
            () -> new CarpetStairBlock(Blocks.BIRCH_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_BIRCH_CARPET_LIME = registerBlock(
            Reference.UnlocalizedName.STAIR_BIRCH_CARPET_LIME,
            () -> new CarpetStairBlock(Blocks.BIRCH_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_BIRCH_CARPET_MAGENTA = registerBlock(
            Reference.UnlocalizedName.STAIR_BIRCH_CARPET_MAGENTA,
            () -> new CarpetStairBlock(Blocks.BIRCH_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_BIRCH_CARPET_ORANGE = registerBlock(
            Reference.UnlocalizedName.STAIR_BIRCH_CARPET_ORANGE,
            () -> new CarpetStairBlock(Blocks.BIRCH_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_BIRCH_CARPET_PARTIAL_BLACK = registerBlock(
            Reference.UnlocalizedName.STAIR_BIRCH_CARPET_PARTIAL_BLACK,
            () -> new CarpetStairBlock(Blocks.BIRCH_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_BIRCH_CARPET_PARTIAL_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIR_BIRCH_CARPET_PARTIAL_BLUE,
            () -> new CarpetStairBlock(Blocks.BIRCH_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_BIRCH_CARPET_PARTIAL_BROWN = registerBlock(
            Reference.UnlocalizedName.STAIR_BIRCH_CARPET_PARTIAL_BROWN,
            () -> new CarpetStairBlock(Blocks.BIRCH_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_BIRCH_CARPET_PARTIAL_CYAN = registerBlock(
            Reference.UnlocalizedName.STAIR_BIRCH_CARPET_PARTIAL_CYAN,
            () -> new CarpetStairBlock(Blocks.BIRCH_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_BIRCH_CARPET_PARTIAL_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIR_BIRCH_CARPET_PARTIAL_GRAY,
            () -> new CarpetStairBlock(Blocks.BIRCH_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_BIRCH_CARPET_PARTIAL_GREEN = registerBlock(
            Reference.UnlocalizedName.STAIR_BIRCH_CARPET_PARTIAL_GREEN,
            () -> new CarpetStairBlock(Blocks.BIRCH_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_BIRCH_CARPET_PARTIAL_LIGHT_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIR_BIRCH_CARPET_PARTIAL_LIGHT_BLUE,
            () -> new CarpetStairBlock(Blocks.BIRCH_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_BIRCH_CARPET_PARTIAL_LIGHT_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIR_BIRCH_CARPET_PARTIAL_LIGHT_GRAY,
            () -> new CarpetStairBlock(Blocks.BIRCH_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_BIRCH_CARPET_PARTIAL_LIME = registerBlock(
            Reference.UnlocalizedName.STAIR_BIRCH_CARPET_PARTIAL_LIME,
            () -> new CarpetStairBlock(Blocks.BIRCH_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_BIRCH_CARPET_PARTIAL_MAGENTA = registerBlock(
            Reference.UnlocalizedName.STAIR_BIRCH_CARPET_PARTIAL_MAGENTA,
            () -> new CarpetStairBlock(Blocks.BIRCH_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_BIRCH_CARPET_PARTIAL_ORANGE = registerBlock(
            Reference.UnlocalizedName.STAIR_BIRCH_CARPET_PARTIAL_ORANGE,
            () -> new CarpetStairBlock(Blocks.BIRCH_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_BIRCH_CARPET_PARTIAL_PINK = registerBlock(
            Reference.UnlocalizedName.STAIR_BIRCH_CARPET_PARTIAL_PINK,
            () -> new CarpetStairBlock(Blocks.BIRCH_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_BIRCH_CARPET_PARTIAL_PURPLE = registerBlock(
            Reference.UnlocalizedName.STAIR_BIRCH_CARPET_PARTIAL_PURPLE,
            () -> new CarpetStairBlock(Blocks.BIRCH_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_BIRCH_CARPET_PARTIAL_RED = registerBlock(
            Reference.UnlocalizedName.STAIR_BIRCH_CARPET_PARTIAL_RED,
            () -> new CarpetStairBlock(Blocks.BIRCH_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_BIRCH_CARPET_PARTIAL_WHITE = registerBlock(
            Reference.UnlocalizedName.STAIR_BIRCH_CARPET_PARTIAL_WHITE,
            () -> new CarpetStairBlock(Blocks.BIRCH_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_BIRCH_CARPET_PARTIAL_YELLOW = registerBlock(
            Reference.UnlocalizedName.STAIR_BIRCH_CARPET_PARTIAL_YELLOW,
            () -> new CarpetStairBlock(Blocks.BIRCH_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_BIRCH_CARPET_PINK = registerBlock(
            Reference.UnlocalizedName.STAIR_BIRCH_CARPET_PINK,
            () -> new CarpetStairBlock(Blocks.BIRCH_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_BIRCH_CARPET_PURPLE = registerBlock(
            Reference.UnlocalizedName.STAIR_BIRCH_CARPET_PURPLE,
            () -> new CarpetStairBlock(Blocks.BIRCH_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_BIRCH_CARPET_RED = registerBlock(
            Reference.UnlocalizedName.STAIR_BIRCH_CARPET_RED,
            () -> new CarpetStairBlock(Blocks.BIRCH_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_BIRCH_CARPET_WHITE = registerBlock(
            Reference.UnlocalizedName.STAIR_BIRCH_CARPET_WHITE,
            () -> new CarpetStairBlock(Blocks.BIRCH_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_BIRCH_CARPET_YELLOW = registerBlock(
            Reference.UnlocalizedName.STAIR_BIRCH_CARPET_YELLOW,
            () -> new CarpetStairBlock(Blocks.BIRCH_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_CRIMSON_CARPET_BLACK = registerBlock(
            Reference.UnlocalizedName.STAIR_CRIMSON_CARPET_BLACK,
            () -> new CarpetStairBlock(Blocks.CRIMSON_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_CRIMSON_CARPET_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIR_CRIMSON_CARPET_BLUE,
            () -> new CarpetStairBlock(Blocks.CRIMSON_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_CRIMSON_CARPET_BROWN = registerBlock(
            Reference.UnlocalizedName.STAIR_CRIMSON_CARPET_BROWN,
            () -> new CarpetStairBlock(Blocks.CRIMSON_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_CRIMSON_CARPET_CYAN = registerBlock(
            Reference.UnlocalizedName.STAIR_CRIMSON_CARPET_CYAN,
            () -> new CarpetStairBlock(Blocks.CRIMSON_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_CRIMSON_CARPET_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIR_CRIMSON_CARPET_GRAY,
            () -> new CarpetStairBlock(Blocks.CRIMSON_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_CRIMSON_CARPET_GREEN = registerBlock(
            Reference.UnlocalizedName.STAIR_CRIMSON_CARPET_GREEN,
            () -> new CarpetStairBlock(Blocks.CRIMSON_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_CRIMSON_CARPET_LIGHT_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIR_CRIMSON_CARPET_LIGHT_BLUE,
            () -> new CarpetStairBlock(Blocks.CRIMSON_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_CRIMSON_CARPET_LIGHT_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIR_CRIMSON_CARPET_LIGHT_GRAY,
            () -> new CarpetStairBlock(Blocks.CRIMSON_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_CRIMSON_CARPET_LIME = registerBlock(
            Reference.UnlocalizedName.STAIR_CRIMSON_CARPET_LIME,
            () -> new CarpetStairBlock(Blocks.CRIMSON_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_CRIMSON_CARPET_MAGENTA = registerBlock(
            Reference.UnlocalizedName.STAIR_CRIMSON_CARPET_MAGENTA,
            () -> new CarpetStairBlock(Blocks.CRIMSON_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_CRIMSON_CARPET_ORANGE = registerBlock(
            Reference.UnlocalizedName.STAIR_CRIMSON_CARPET_ORANGE,
            () -> new CarpetStairBlock(Blocks.CRIMSON_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_CRIMSON_CARPET_PARTIAL_BLACK = registerBlock(
            Reference.UnlocalizedName.STAIR_CRIMSON_CARPET_PARTIAL_BLACK,
            () -> new CarpetStairBlock(Blocks.CRIMSON_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_CRIMSON_CARPET_PARTIAL_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIR_CRIMSON_CARPET_PARTIAL_BLUE,
            () -> new CarpetStairBlock(Blocks.CRIMSON_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_CRIMSON_CARPET_PARTIAL_BROWN = registerBlock(
            Reference.UnlocalizedName.STAIR_CRIMSON_CARPET_PARTIAL_BROWN,
            () -> new CarpetStairBlock(Blocks.CRIMSON_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_CRIMSON_CARPET_PARTIAL_CYAN = registerBlock(
            Reference.UnlocalizedName.STAIR_CRIMSON_CARPET_PARTIAL_CYAN,
            () -> new CarpetStairBlock(Blocks.CRIMSON_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_CRIMSON_CARPET_PARTIAL_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIR_CRIMSON_CARPET_PARTIAL_GRAY,
            () -> new CarpetStairBlock(Blocks.CRIMSON_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_CRIMSON_CARPET_PARTIAL_GREEN = registerBlock(
            Reference.UnlocalizedName.STAIR_CRIMSON_CARPET_PARTIAL_GREEN,
            () -> new CarpetStairBlock(Blocks.CRIMSON_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_CRIMSON_CARPET_PARTIAL_LIGHT_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIR_CRIMSON_CARPET_PARTIAL_LIGHT_BLUE,
            () -> new CarpetStairBlock(Blocks.CRIMSON_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_CRIMSON_CARPET_PARTIAL_LIGHT_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIR_CRIMSON_CARPET_PARTIAL_LIGHT_GRAY,
            () -> new CarpetStairBlock(Blocks.CRIMSON_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_CRIMSON_CARPET_PARTIAL_LIME = registerBlock(
            Reference.UnlocalizedName.STAIR_CRIMSON_CARPET_PARTIAL_LIME,
            () -> new CarpetStairBlock(Blocks.CRIMSON_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_CRIMSON_CARPET_PARTIAL_MAGENTA = registerBlock(
            Reference.UnlocalizedName.STAIR_CRIMSON_CARPET_PARTIAL_MAGENTA,
            () -> new CarpetStairBlock(Blocks.CRIMSON_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_CRIMSON_CARPET_PARTIAL_ORANGE = registerBlock(
            Reference.UnlocalizedName.STAIR_CRIMSON_CARPET_PARTIAL_ORANGE,
            () -> new CarpetStairBlock(Blocks.CRIMSON_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_CRIMSON_CARPET_PARTIAL_PINK = registerBlock(
            Reference.UnlocalizedName.STAIR_CRIMSON_CARPET_PARTIAL_PINK,
            () -> new CarpetStairBlock(Blocks.CRIMSON_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_CRIMSON_CARPET_PARTIAL_PURPLE = registerBlock(
            Reference.UnlocalizedName.STAIR_CRIMSON_CARPET_PARTIAL_PURPLE,
            () -> new CarpetStairBlock(Blocks.CRIMSON_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_CRIMSON_CARPET_PARTIAL_RED = registerBlock(
            Reference.UnlocalizedName.STAIR_CRIMSON_CARPET_PARTIAL_RED,
            () -> new CarpetStairBlock(Blocks.CRIMSON_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_CRIMSON_CARPET_PARTIAL_WHITE = registerBlock(
            Reference.UnlocalizedName.STAIR_CRIMSON_CARPET_PARTIAL_WHITE,
            () -> new CarpetStairBlock(Blocks.CRIMSON_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_CRIMSON_CARPET_PARTIAL_YELLOW = registerBlock(
            Reference.UnlocalizedName.STAIR_CRIMSON_CARPET_PARTIAL_YELLOW,
            () -> new CarpetStairBlock(Blocks.CRIMSON_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_CRIMSON_CARPET_PINK = registerBlock(
            Reference.UnlocalizedName.STAIR_CRIMSON_CARPET_PINK,
            () -> new CarpetStairBlock(Blocks.CRIMSON_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_CRIMSON_CARPET_PURPLE = registerBlock(
            Reference.UnlocalizedName.STAIR_CRIMSON_CARPET_PURPLE,
            () -> new CarpetStairBlock(Blocks.CRIMSON_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_CRIMSON_CARPET_RED = registerBlock(
            Reference.UnlocalizedName.STAIR_CRIMSON_CARPET_RED,
            () -> new CarpetStairBlock(Blocks.CRIMSON_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_CRIMSON_CARPET_WHITE = registerBlock(
            Reference.UnlocalizedName.STAIR_CRIMSON_CARPET_WHITE,
            () -> new CarpetStairBlock(Blocks.CRIMSON_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_CRIMSON_CARPET_YELLOW = registerBlock(
            Reference.UnlocalizedName.STAIR_CRIMSON_CARPET_YELLOW,
            () -> new CarpetStairBlock(Blocks.CRIMSON_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_DARK_OAK_CARPET_BLACK = registerBlock(
            Reference.UnlocalizedName.STAIR_DARK_OAK_CARPET_BLACK,
            () -> new CarpetStairBlock(Blocks.DARK_OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_DARK_OAK_CARPET_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIR_DARK_OAK_CARPET_BLUE,
            () -> new CarpetStairBlock(Blocks.DARK_OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_DARK_OAK_CARPET_BROWN = registerBlock(
            Reference.UnlocalizedName.STAIR_DARK_OAK_CARPET_BROWN,
            () -> new CarpetStairBlock(Blocks.DARK_OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_DARK_OAK_CARPET_CYAN = registerBlock(
            Reference.UnlocalizedName.STAIR_DARK_OAK_CARPET_CYAN,
            () -> new CarpetStairBlock(Blocks.DARK_OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_DARK_OAK_CARPET_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIR_DARK_OAK_CARPET_GRAY,
            () -> new CarpetStairBlock(Blocks.DARK_OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_DARK_OAK_CARPET_GREEN = registerBlock(
            Reference.UnlocalizedName.STAIR_DARK_OAK_CARPET_GREEN,
            () -> new CarpetStairBlock(Blocks.DARK_OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_DARK_OAK_CARPET_LIGHT_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIR_DARK_OAK_CARPET_LIGHT_BLUE,
            () -> new CarpetStairBlock(Blocks.DARK_OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_DARK_OAK_CARPET_LIGHT_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIR_DARK_OAK_CARPET_LIGHT_GRAY,
            () -> new CarpetStairBlock(Blocks.DARK_OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_DARK_OAK_CARPET_LIME = registerBlock(
            Reference.UnlocalizedName.STAIR_DARK_OAK_CARPET_LIME,
            () -> new CarpetStairBlock(Blocks.DARK_OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_DARK_OAK_CARPET_MAGENTA = registerBlock(
            Reference.UnlocalizedName.STAIR_DARK_OAK_CARPET_MAGENTA,
            () -> new CarpetStairBlock(Blocks.DARK_OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_DARK_OAK_CARPET_ORANGE = registerBlock(
            Reference.UnlocalizedName.STAIR_DARK_OAK_CARPET_ORANGE,
            () -> new CarpetStairBlock(Blocks.DARK_OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_DARK_OAK_CARPET_PARTIAL_BLACK = registerBlock(
            Reference.UnlocalizedName.STAIR_DARK_OAK_CARPET_PARTIAL_BLACK,
            () -> new CarpetStairBlock(Blocks.DARK_OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_DARK_OAK_CARPET_PARTIAL_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIR_DARK_OAK_CARPET_PARTIAL_BLUE,
            () -> new CarpetStairBlock(Blocks.DARK_OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_DARK_OAK_CARPET_PARTIAL_BROWN = registerBlock(
            Reference.UnlocalizedName.STAIR_DARK_OAK_CARPET_PARTIAL_BROWN,
            () -> new CarpetStairBlock(Blocks.DARK_OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_DARK_OAK_CARPET_PARTIAL_CYAN = registerBlock(
            Reference.UnlocalizedName.STAIR_DARK_OAK_CARPET_PARTIAL_CYAN,
            () -> new CarpetStairBlock(Blocks.DARK_OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_DARK_OAK_CARPET_PARTIAL_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIR_DARK_OAK_CARPET_PARTIAL_GRAY,
            () -> new CarpetStairBlock(Blocks.DARK_OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_DARK_OAK_CARPET_PARTIAL_GREEN = registerBlock(
            Reference.UnlocalizedName.STAIR_DARK_OAK_CARPET_PARTIAL_GREEN,
            () -> new CarpetStairBlock(Blocks.DARK_OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_DARK_OAK_CARPET_PARTIAL_LIGHT_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIR_DARK_OAK_CARPET_PARTIAL_LIGHT_BLUE,
            () -> new CarpetStairBlock(Blocks.DARK_OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_DARK_OAK_CARPET_PARTIAL_LIGHT_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIR_DARK_OAK_CARPET_PARTIAL_LIGHT_GRAY,
            () -> new CarpetStairBlock(Blocks.DARK_OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_DARK_OAK_CARPET_PARTIAL_LIME = registerBlock(
            Reference.UnlocalizedName.STAIR_DARK_OAK_CARPET_PARTIAL_LIME,
            () -> new CarpetStairBlock(Blocks.DARK_OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_DARK_OAK_CARPET_PARTIAL_MAGENTA = registerBlock(
            Reference.UnlocalizedName.STAIR_DARK_OAK_CARPET_PARTIAL_MAGENTA,
            () -> new CarpetStairBlock(Blocks.DARK_OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_DARK_OAK_CARPET_PARTIAL_ORANGE = registerBlock(
            Reference.UnlocalizedName.STAIR_DARK_OAK_CARPET_PARTIAL_ORANGE,
            () -> new CarpetStairBlock(Blocks.DARK_OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_DARK_OAK_CARPET_PARTIAL_PINK = registerBlock(
            Reference.UnlocalizedName.STAIR_DARK_OAK_CARPET_PARTIAL_PINK,
            () -> new CarpetStairBlock(Blocks.DARK_OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_DARK_OAK_CARPET_PARTIAL_PURPLE = registerBlock(
            Reference.UnlocalizedName.STAIR_DARK_OAK_CARPET_PARTIAL_PURPLE,
            () -> new CarpetStairBlock(Blocks.DARK_OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_DARK_OAK_CARPET_PARTIAL_RED = registerBlock(
            Reference.UnlocalizedName.STAIR_DARK_OAK_CARPET_PARTIAL_RED,
            () -> new CarpetStairBlock(Blocks.DARK_OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_DARK_OAK_CARPET_PARTIAL_WHITE = registerBlock(
            Reference.UnlocalizedName.STAIR_DARK_OAK_CARPET_PARTIAL_WHITE,
            () -> new CarpetStairBlock(Blocks.DARK_OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_DARK_OAK_CARPET_PARTIAL_YELLOW = registerBlock(
            Reference.UnlocalizedName.STAIR_DARK_OAK_CARPET_PARTIAL_YELLOW,
            () -> new CarpetStairBlock(Blocks.DARK_OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_DARK_OAK_CARPET_PINK = registerBlock(
            Reference.UnlocalizedName.STAIR_DARK_OAK_CARPET_PINK,
            () -> new CarpetStairBlock(Blocks.DARK_OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_DARK_OAK_CARPET_PURPLE = registerBlock(
            Reference.UnlocalizedName.STAIR_DARK_OAK_CARPET_PURPLE,
            () -> new CarpetStairBlock(Blocks.DARK_OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_DARK_OAK_CARPET_RED = registerBlock(
            Reference.UnlocalizedName.STAIR_DARK_OAK_CARPET_RED,
            () -> new CarpetStairBlock(Blocks.DARK_OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_DARK_OAK_CARPET_WHITE = registerBlock(
            Reference.UnlocalizedName.STAIR_DARK_OAK_CARPET_WHITE,
            () -> new CarpetStairBlock(Blocks.DARK_OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_DARK_OAK_CARPET_YELLOW = registerBlock(
            Reference.UnlocalizedName.STAIR_DARK_OAK_CARPET_YELLOW,
            () -> new CarpetStairBlock(Blocks.DARK_OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_JUNGLE_CARPET_BLACK = registerBlock(
            Reference.UnlocalizedName.STAIR_JUNGLE_CARPET_BLACK,
            () -> new CarpetStairBlock(Blocks.JUNGLE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_JUNGLE_CARPET_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIR_JUNGLE_CARPET_BLUE,
            () -> new CarpetStairBlock(Blocks.JUNGLE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_JUNGLE_CARPET_BROWN = registerBlock(
            Reference.UnlocalizedName.STAIR_JUNGLE_CARPET_BROWN,
            () -> new CarpetStairBlock(Blocks.JUNGLE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_JUNGLE_CARPET_CYAN = registerBlock(
            Reference.UnlocalizedName.STAIR_JUNGLE_CARPET_CYAN,
            () -> new CarpetStairBlock(Blocks.JUNGLE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_JUNGLE_CARPET_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIR_JUNGLE_CARPET_GRAY,
            () -> new CarpetStairBlock(Blocks.JUNGLE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_JUNGLE_CARPET_GREEN = registerBlock(
            Reference.UnlocalizedName.STAIR_JUNGLE_CARPET_GREEN,
            () -> new CarpetStairBlock(Blocks.JUNGLE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_JUNGLE_CARPET_LIGHT_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIR_JUNGLE_CARPET_LIGHT_BLUE,
            () -> new CarpetStairBlock(Blocks.JUNGLE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_JUNGLE_CARPET_LIGHT_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIR_JUNGLE_CARPET_LIGHT_GRAY,
            () -> new CarpetStairBlock(Blocks.JUNGLE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_JUNGLE_CARPET_LIME = registerBlock(
            Reference.UnlocalizedName.STAIR_JUNGLE_CARPET_LIME,
            () -> new CarpetStairBlock(Blocks.JUNGLE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_JUNGLE_CARPET_MAGENTA = registerBlock(
            Reference.UnlocalizedName.STAIR_JUNGLE_CARPET_MAGENTA,
            () -> new CarpetStairBlock(Blocks.JUNGLE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_JUNGLE_CARPET_ORANGE = registerBlock(
            Reference.UnlocalizedName.STAIR_JUNGLE_CARPET_ORANGE,
            () -> new CarpetStairBlock(Blocks.JUNGLE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_JUNGLE_CARPET_PARTIAL_BLACK = registerBlock(
            Reference.UnlocalizedName.STAIR_JUNGLE_CARPET_PARTIAL_BLACK,
            () -> new CarpetStairBlock(Blocks.JUNGLE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_JUNGLE_CARPET_PARTIAL_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIR_JUNGLE_CARPET_PARTIAL_BLUE,
            () -> new CarpetStairBlock(Blocks.JUNGLE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_JUNGLE_CARPET_PARTIAL_BROWN = registerBlock(
            Reference.UnlocalizedName.STAIR_JUNGLE_CARPET_PARTIAL_BROWN,
            () -> new CarpetStairBlock(Blocks.JUNGLE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_JUNGLE_CARPET_PARTIAL_CYAN = registerBlock(
            Reference.UnlocalizedName.STAIR_JUNGLE_CARPET_PARTIAL_CYAN,
            () -> new CarpetStairBlock(Blocks.JUNGLE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_JUNGLE_CARPET_PARTIAL_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIR_JUNGLE_CARPET_PARTIAL_GRAY,
            () -> new CarpetStairBlock(Blocks.JUNGLE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_JUNGLE_CARPET_PARTIAL_GREEN = registerBlock(
            Reference.UnlocalizedName.STAIR_JUNGLE_CARPET_PARTIAL_GREEN,
            () -> new CarpetStairBlock(Blocks.JUNGLE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_JUNGLE_CARPET_PARTIAL_LIGHT_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIR_JUNGLE_CARPET_PARTIAL_LIGHT_BLUE,
            () -> new CarpetStairBlock(Blocks.JUNGLE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_JUNGLE_CARPET_PARTIAL_LIGHT_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIR_JUNGLE_CARPET_PARTIAL_LIGHT_GRAY,
            () -> new CarpetStairBlock(Blocks.JUNGLE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_JUNGLE_CARPET_PARTIAL_LIME = registerBlock(
            Reference.UnlocalizedName.STAIR_JUNGLE_CARPET_PARTIAL_LIME,
            () -> new CarpetStairBlock(Blocks.JUNGLE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_JUNGLE_CARPET_PARTIAL_MAGENTA = registerBlock(
            Reference.UnlocalizedName.STAIR_JUNGLE_CARPET_PARTIAL_MAGENTA,
            () -> new CarpetStairBlock(Blocks.JUNGLE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_JUNGLE_CARPET_PARTIAL_ORANGE = registerBlock(
            Reference.UnlocalizedName.STAIR_JUNGLE_CARPET_PARTIAL_ORANGE,
            () -> new CarpetStairBlock(Blocks.JUNGLE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_JUNGLE_CARPET_PARTIAL_PINK = registerBlock(
            Reference.UnlocalizedName.STAIR_JUNGLE_CARPET_PARTIAL_PINK,
            () -> new CarpetStairBlock(Blocks.JUNGLE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_JUNGLE_CARPET_PARTIAL_PURPLE = registerBlock(
            Reference.UnlocalizedName.STAIR_JUNGLE_CARPET_PARTIAL_PURPLE,
            () -> new CarpetStairBlock(Blocks.JUNGLE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_JUNGLE_CARPET_PARTIAL_RED = registerBlock(
            Reference.UnlocalizedName.STAIR_JUNGLE_CARPET_PARTIAL_RED,
            () -> new CarpetStairBlock(Blocks.JUNGLE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_JUNGLE_CARPET_PARTIAL_WHITE = registerBlock(
            Reference.UnlocalizedName.STAIR_JUNGLE_CARPET_PARTIAL_WHITE,
            () -> new CarpetStairBlock(Blocks.JUNGLE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_JUNGLE_CARPET_PARTIAL_YELLOW = registerBlock(
            Reference.UnlocalizedName.STAIR_JUNGLE_CARPET_PARTIAL_YELLOW,
            () -> new CarpetStairBlock(Blocks.JUNGLE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_JUNGLE_CARPET_PINK = registerBlock(
            Reference.UnlocalizedName.STAIR_JUNGLE_CARPET_PINK,
            () -> new CarpetStairBlock(Blocks.JUNGLE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_JUNGLE_CARPET_PURPLE = registerBlock(
            Reference.UnlocalizedName.STAIR_JUNGLE_CARPET_PURPLE,
            () -> new CarpetStairBlock(Blocks.JUNGLE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_JUNGLE_CARPET_RED = registerBlock(
            Reference.UnlocalizedName.STAIR_JUNGLE_CARPET_RED,
            () -> new CarpetStairBlock(Blocks.JUNGLE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_JUNGLE_CARPET_WHITE = registerBlock(
            Reference.UnlocalizedName.STAIR_JUNGLE_CARPET_WHITE,
            () -> new CarpetStairBlock(Blocks.JUNGLE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_JUNGLE_CARPET_YELLOW = registerBlock(
            Reference.UnlocalizedName.STAIR_JUNGLE_CARPET_YELLOW,
            () -> new CarpetStairBlock(Blocks.JUNGLE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_OAK_CARPET_BLACK = registerBlock(
            Reference.UnlocalizedName.STAIR_OAK_CARPET_BLACK,
            () -> new CarpetStairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_OAK_CARPET_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIR_OAK_CARPET_BLUE,
            () -> new CarpetStairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_OAK_CARPET_BROWN = registerBlock(
            Reference.UnlocalizedName.STAIR_OAK_CARPET_BROWN,
            () -> new CarpetStairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_OAK_CARPET_CYAN = registerBlock(
            Reference.UnlocalizedName.STAIR_OAK_CARPET_CYAN,
            () -> new CarpetStairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_OAK_CARPET_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIR_OAK_CARPET_GRAY,
            () -> new CarpetStairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_OAK_CARPET_GREEN = registerBlock(
            Reference.UnlocalizedName.STAIR_OAK_CARPET_GREEN,
            () -> new CarpetStairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_OAK_CARPET_LIGHT_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIR_OAK_CARPET_LIGHT_BLUE,
            () -> new CarpetStairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_OAK_CARPET_LIGHT_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIR_OAK_CARPET_LIGHT_GRAY,
            () -> new CarpetStairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_OAK_CARPET_LIME = registerBlock(
            Reference.UnlocalizedName.STAIR_OAK_CARPET_LIME,
            () -> new CarpetStairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_OAK_CARPET_MAGENTA = registerBlock(
            Reference.UnlocalizedName.STAIR_OAK_CARPET_MAGENTA,
            () -> new CarpetStairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_OAK_CARPET_ORANGE = registerBlock(
            Reference.UnlocalizedName.STAIR_OAK_CARPET_ORANGE,
            () -> new CarpetStairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_OAK_CARPET_PARTIAL_BLACK = registerBlock(
            Reference.UnlocalizedName.STAIR_OAK_CARPET_PARTIAL_BLACK,
            () -> new CarpetStairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_OAK_CARPET_PARTIAL_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIR_OAK_CARPET_PARTIAL_BLUE,
            () -> new CarpetStairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_OAK_CARPET_PARTIAL_BROWN = registerBlock(
            Reference.UnlocalizedName.STAIR_OAK_CARPET_PARTIAL_BROWN,
            () -> new CarpetStairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_OAK_CARPET_PARTIAL_CYAN = registerBlock(
            Reference.UnlocalizedName.STAIR_OAK_CARPET_PARTIAL_CYAN,
            () -> new CarpetStairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_OAK_CARPET_PARTIAL_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIR_OAK_CARPET_PARTIAL_GRAY,
            () -> new CarpetStairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_OAK_CARPET_PARTIAL_GREEN = registerBlock(
            Reference.UnlocalizedName.STAIR_OAK_CARPET_PARTIAL_GREEN,
            () -> new CarpetStairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_OAK_CARPET_PARTIAL_LIGHT_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIR_OAK_CARPET_PARTIAL_LIGHT_BLUE,
            () -> new CarpetStairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_OAK_CARPET_PARTIAL_LIGHT_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIR_OAK_CARPET_PARTIAL_LIGHT_GRAY,
            () -> new CarpetStairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_OAK_CARPET_PARTIAL_LIME = registerBlock(
            Reference.UnlocalizedName.STAIR_OAK_CARPET_PARTIAL_LIME,
            () -> new CarpetStairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_OAK_CARPET_PARTIAL_MAGENTA = registerBlock(
            Reference.UnlocalizedName.STAIR_OAK_CARPET_PARTIAL_MAGENTA,
            () -> new CarpetStairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_OAK_CARPET_PARTIAL_ORANGE = registerBlock(
            Reference.UnlocalizedName.STAIR_OAK_CARPET_PARTIAL_ORANGE,
            () -> new CarpetStairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_OAK_CARPET_PARTIAL_PINK = registerBlock(
            Reference.UnlocalizedName.STAIR_OAK_CARPET_PARTIAL_PINK,
            () -> new CarpetStairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_OAK_CARPET_PARTIAL_PURPLE = registerBlock(
            Reference.UnlocalizedName.STAIR_OAK_CARPET_PARTIAL_PURPLE,
            () -> new CarpetStairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_OAK_CARPET_PARTIAL_RED = registerBlock(
            Reference.UnlocalizedName.STAIR_OAK_CARPET_PARTIAL_RED,
            () -> new CarpetStairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_OAK_CARPET_PARTIAL_WHITE = registerBlock(
            Reference.UnlocalizedName.STAIR_OAK_CARPET_PARTIAL_WHITE,
            () -> new CarpetStairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_OAK_CARPET_PARTIAL_YELLOW = registerBlock(
            Reference.UnlocalizedName.STAIR_OAK_CARPET_PARTIAL_YELLOW,
            () -> new CarpetStairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_OAK_CARPET_PINK = registerBlock(
            Reference.UnlocalizedName.STAIR_OAK_CARPET_PINK,
            () -> new CarpetStairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_OAK_CARPET_PURPLE = registerBlock(
            Reference.UnlocalizedName.STAIR_OAK_CARPET_PURPLE,
            () -> new CarpetStairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_OAK_CARPET_RED = registerBlock(
            Reference.UnlocalizedName.STAIR_OAK_CARPET_RED,
            () -> new CarpetStairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_OAK_CARPET_WHITE = registerBlock(
            Reference.UnlocalizedName.STAIR_OAK_CARPET_WHITE,
            () -> new CarpetStairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_OAK_CARPET_YELLOW = registerBlock(
            Reference.UnlocalizedName.STAIR_OAK_CARPET_YELLOW,
            () -> new CarpetStairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_SPRUCE_CARPET_BLACK = registerBlock(
            Reference.UnlocalizedName.STAIR_SPRUCE_CARPET_BLACK,
            () -> new CarpetStairBlock(Blocks.SPRUCE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_SPRUCE_CARPET_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIR_SPRUCE_CARPET_BLUE,
            () -> new CarpetStairBlock(Blocks.SPRUCE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_SPRUCE_CARPET_BROWN = registerBlock(
            Reference.UnlocalizedName.STAIR_SPRUCE_CARPET_BROWN,
            () -> new CarpetStairBlock(Blocks.SPRUCE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_SPRUCE_CARPET_CYAN = registerBlock(
            Reference.UnlocalizedName.STAIR_SPRUCE_CARPET_CYAN,
            () -> new CarpetStairBlock(Blocks.SPRUCE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_SPRUCE_CARPET_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIR_SPRUCE_CARPET_GRAY,
            () -> new CarpetStairBlock(Blocks.SPRUCE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_SPRUCE_CARPET_GREEN = registerBlock(
            Reference.UnlocalizedName.STAIR_SPRUCE_CARPET_GREEN,
            () -> new CarpetStairBlock(Blocks.SPRUCE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_SPRUCE_CARPET_LIGHT_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIR_SPRUCE_CARPET_LIGHT_BLUE,
            () -> new CarpetStairBlock(Blocks.SPRUCE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_SPRUCE_CARPET_LIGHT_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIR_SPRUCE_CARPET_LIGHT_GRAY,
            () -> new CarpetStairBlock(Blocks.SPRUCE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_SPRUCE_CARPET_LIME = registerBlock(
            Reference.UnlocalizedName.STAIR_SPRUCE_CARPET_LIME,
            () -> new CarpetStairBlock(Blocks.SPRUCE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_SPRUCE_CARPET_MAGENTA = registerBlock(
            Reference.UnlocalizedName.STAIR_SPRUCE_CARPET_MAGENTA,
            () -> new CarpetStairBlock(Blocks.SPRUCE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_SPRUCE_CARPET_ORANGE = registerBlock(
            Reference.UnlocalizedName.STAIR_SPRUCE_CARPET_ORANGE,
            () -> new CarpetStairBlock(Blocks.SPRUCE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_SPRUCE_CARPET_PARTIAL_BLACK = registerBlock(
            Reference.UnlocalizedName.STAIR_SPRUCE_CARPET_PARTIAL_BLACK,
            () -> new CarpetStairBlock(Blocks.SPRUCE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_SPRUCE_CARPET_PARTIAL_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIR_SPRUCE_CARPET_PARTIAL_BLUE,
            () -> new CarpetStairBlock(Blocks.SPRUCE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_SPRUCE_CARPET_PARTIAL_BROWN = registerBlock(
            Reference.UnlocalizedName.STAIR_SPRUCE_CARPET_PARTIAL_BROWN,
            () -> new CarpetStairBlock(Blocks.SPRUCE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_SPRUCE_CARPET_PARTIAL_CYAN = registerBlock(
            Reference.UnlocalizedName.STAIR_SPRUCE_CARPET_PARTIAL_CYAN,
            () -> new CarpetStairBlock(Blocks.SPRUCE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_SPRUCE_CARPET_PARTIAL_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIR_SPRUCE_CARPET_PARTIAL_GRAY,
            () -> new CarpetStairBlock(Blocks.SPRUCE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_SPRUCE_CARPET_PARTIAL_GREEN = registerBlock(
            Reference.UnlocalizedName.STAIR_SPRUCE_CARPET_PARTIAL_GREEN,
            () -> new CarpetStairBlock(Blocks.SPRUCE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_SPRUCE_CARPET_PARTIAL_LIGHT_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIR_SPRUCE_CARPET_PARTIAL_LIGHT_BLUE,
            () -> new CarpetStairBlock(Blocks.SPRUCE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_SPRUCE_CARPET_PARTIAL_LIGHT_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIR_SPRUCE_CARPET_PARTIAL_LIGHT_GRAY,
            () -> new CarpetStairBlock(Blocks.SPRUCE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_SPRUCE_CARPET_PARTIAL_LIME = registerBlock(
            Reference.UnlocalizedName.STAIR_SPRUCE_CARPET_PARTIAL_LIME,
            () -> new CarpetStairBlock(Blocks.SPRUCE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_SPRUCE_CARPET_PARTIAL_MAGENTA = registerBlock(
            Reference.UnlocalizedName.STAIR_SPRUCE_CARPET_PARTIAL_MAGENTA,
            () -> new CarpetStairBlock(Blocks.SPRUCE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_SPRUCE_CARPET_PARTIAL_ORANGE = registerBlock(
            Reference.UnlocalizedName.STAIR_SPRUCE_CARPET_PARTIAL_ORANGE,
            () -> new CarpetStairBlock(Blocks.SPRUCE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_SPRUCE_CARPET_PARTIAL_PINK = registerBlock(
            Reference.UnlocalizedName.STAIR_SPRUCE_CARPET_PARTIAL_PINK,
            () -> new CarpetStairBlock(Blocks.SPRUCE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_SPRUCE_CARPET_PARTIAL_PURPLE = registerBlock(
            Reference.UnlocalizedName.STAIR_SPRUCE_CARPET_PARTIAL_PURPLE,
            () -> new CarpetStairBlock(Blocks.SPRUCE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_SPRUCE_CARPET_PARTIAL_RED = registerBlock(
            Reference.UnlocalizedName.STAIR_SPRUCE_CARPET_PARTIAL_RED,
            () -> new CarpetStairBlock(Blocks.SPRUCE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_SPRUCE_CARPET_PARTIAL_WHITE = registerBlock(
            Reference.UnlocalizedName.STAIR_SPRUCE_CARPET_PARTIAL_WHITE,
            () -> new CarpetStairBlock(Blocks.SPRUCE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_SPRUCE_CARPET_PARTIAL_YELLOW = registerBlock(
            Reference.UnlocalizedName.STAIR_SPRUCE_CARPET_PARTIAL_YELLOW,
            () -> new CarpetStairBlock(Blocks.SPRUCE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_SPRUCE_CARPET_PINK = registerBlock(
            Reference.UnlocalizedName.STAIR_SPRUCE_CARPET_PINK,
            () -> new CarpetStairBlock(Blocks.SPRUCE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_SPRUCE_CARPET_PURPLE = registerBlock(
            Reference.UnlocalizedName.STAIR_SPRUCE_CARPET_PURPLE,
            () -> new CarpetStairBlock(Blocks.SPRUCE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_SPRUCE_CARPET_RED = registerBlock(
            Reference.UnlocalizedName.STAIR_SPRUCE_CARPET_RED,
            () -> new CarpetStairBlock(Blocks.SPRUCE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_SPRUCE_CARPET_WHITE = registerBlock(
            Reference.UnlocalizedName.STAIR_SPRUCE_CARPET_WHITE,
            () -> new CarpetStairBlock(Blocks.SPRUCE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_SPRUCE_CARPET_YELLOW = registerBlock(
            Reference.UnlocalizedName.STAIR_SPRUCE_CARPET_YELLOW,
            () -> new CarpetStairBlock(Blocks.SPRUCE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_WARPED_CARPET_BLACK = registerBlock(
            Reference.UnlocalizedName.STAIR_WARPED_CARPET_BLACK,
            () -> new CarpetStairBlock(Blocks.WARPED_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_WARPED_CARPET_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIR_WARPED_CARPET_BLUE,
            () -> new CarpetStairBlock(Blocks.WARPED_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_WARPED_CARPET_BROWN = registerBlock(
            Reference.UnlocalizedName.STAIR_WARPED_CARPET_BROWN,
            () -> new CarpetStairBlock(Blocks.WARPED_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_WARPED_CARPET_CYAN = registerBlock(
            Reference.UnlocalizedName.STAIR_WARPED_CARPET_CYAN,
            () -> new CarpetStairBlock(Blocks.WARPED_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_WARPED_CARPET_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIR_WARPED_CARPET_GRAY,
            () -> new CarpetStairBlock(Blocks.WARPED_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_WARPED_CARPET_GREEN = registerBlock(
            Reference.UnlocalizedName.STAIR_WARPED_CARPET_GREEN,
            () -> new CarpetStairBlock(Blocks.WARPED_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_WARPED_CARPET_LIGHT_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIR_WARPED_CARPET_LIGHT_BLUE,
            () -> new CarpetStairBlock(Blocks.WARPED_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_WARPED_CARPET_LIGHT_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIR_WARPED_CARPET_LIGHT_GRAY,
            () -> new CarpetStairBlock(Blocks.WARPED_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_WARPED_CARPET_LIME = registerBlock(
            Reference.UnlocalizedName.STAIR_WARPED_CARPET_LIME,
            () -> new CarpetStairBlock(Blocks.WARPED_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_WARPED_CARPET_MAGENTA = registerBlock(
            Reference.UnlocalizedName.STAIR_WARPED_CARPET_MAGENTA,
            () -> new CarpetStairBlock(Blocks.WARPED_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_WARPED_CARPET_ORANGE = registerBlock(
            Reference.UnlocalizedName.STAIR_WARPED_CARPET_ORANGE,
            () -> new CarpetStairBlock(Blocks.WARPED_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_WARPED_CARPET_PARTIAL_BLACK = registerBlock(
            Reference.UnlocalizedName.STAIR_WARPED_CARPET_PARTIAL_BLACK,
            () -> new CarpetStairBlock(Blocks.WARPED_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_WARPED_CARPET_PARTIAL_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIR_WARPED_CARPET_PARTIAL_BLUE,
            () -> new CarpetStairBlock(Blocks.WARPED_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_WARPED_CARPET_PARTIAL_BROWN = registerBlock(
            Reference.UnlocalizedName.STAIR_WARPED_CARPET_PARTIAL_BROWN,
            () -> new CarpetStairBlock(Blocks.WARPED_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_WARPED_CARPET_PARTIAL_CYAN = registerBlock(
            Reference.UnlocalizedName.STAIR_WARPED_CARPET_PARTIAL_CYAN,
            () -> new CarpetStairBlock(Blocks.WARPED_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_WARPED_CARPET_PARTIAL_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIR_WARPED_CARPET_PARTIAL_GRAY,
            () -> new CarpetStairBlock(Blocks.WARPED_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_WARPED_CARPET_PARTIAL_GREEN = registerBlock(
            Reference.UnlocalizedName.STAIR_WARPED_CARPET_PARTIAL_GREEN,
            () -> new CarpetStairBlock(Blocks.WARPED_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_WARPED_CARPET_PARTIAL_LIGHT_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIR_WARPED_CARPET_PARTIAL_LIGHT_BLUE,
            () -> new CarpetStairBlock(Blocks.WARPED_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_WARPED_CARPET_PARTIAL_LIGHT_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIR_WARPED_CARPET_PARTIAL_LIGHT_GRAY,
            () -> new CarpetStairBlock(Blocks.WARPED_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_WARPED_CARPET_PARTIAL_LIME = registerBlock(
            Reference.UnlocalizedName.STAIR_WARPED_CARPET_PARTIAL_LIME,
            () -> new CarpetStairBlock(Blocks.WARPED_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_WARPED_CARPET_PARTIAL_MAGENTA = registerBlock(
            Reference.UnlocalizedName.STAIR_WARPED_CARPET_PARTIAL_MAGENTA,
            () -> new CarpetStairBlock(Blocks.WARPED_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_WARPED_CARPET_PARTIAL_ORANGE = registerBlock(
            Reference.UnlocalizedName.STAIR_WARPED_CARPET_PARTIAL_ORANGE,
            () -> new CarpetStairBlock(Blocks.WARPED_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_WARPED_CARPET_PARTIAL_PINK = registerBlock(
            Reference.UnlocalizedName.STAIR_WARPED_CARPET_PARTIAL_PINK,
            () -> new CarpetStairBlock(Blocks.WARPED_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_WARPED_CARPET_PARTIAL_PURPLE = registerBlock(
            Reference.UnlocalizedName.STAIR_WARPED_CARPET_PARTIAL_PURPLE,
            () -> new CarpetStairBlock(Blocks.WARPED_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_WARPED_CARPET_PARTIAL_RED = registerBlock(
            Reference.UnlocalizedName.STAIR_WARPED_CARPET_PARTIAL_RED,
            () -> new CarpetStairBlock(Blocks.WARPED_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_WARPED_CARPET_PARTIAL_WHITE = registerBlock(
            Reference.UnlocalizedName.STAIR_WARPED_CARPET_PARTIAL_WHITE,
            () -> new CarpetStairBlock(Blocks.WARPED_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_WARPED_CARPET_PARTIAL_YELLOW = registerBlock(
            Reference.UnlocalizedName.STAIR_WARPED_CARPET_PARTIAL_YELLOW,
            () -> new CarpetStairBlock(Blocks.WARPED_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_WARPED_CARPET_PINK = registerBlock(
            Reference.UnlocalizedName.STAIR_WARPED_CARPET_PINK,
            () -> new CarpetStairBlock(Blocks.WARPED_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_WARPED_CARPET_PURPLE = registerBlock(
            Reference.UnlocalizedName.STAIR_WARPED_CARPET_PURPLE,
            () -> new CarpetStairBlock(Blocks.WARPED_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_WARPED_CARPET_RED = registerBlock(
            Reference.UnlocalizedName.STAIR_WARPED_CARPET_RED,
            () -> new CarpetStairBlock(Blocks.WARPED_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_WARPED_CARPET_WHITE = registerBlock(
            Reference.UnlocalizedName.STAIR_WARPED_CARPET_WHITE,
            () -> new CarpetStairBlock(Blocks.WARPED_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS))
    );
    public static final DeferredBlock<Block> STAIR_WARPED_CARPET_YELLOW = registerBlock(
            Reference.UnlocalizedName.STAIR_WARPED_CARPET_YELLOW,
            () -> new CarpetStairBlock(Blocks.WARPED_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS))
    );

    public static final DeferredBlock<Block> STAIRS_TERRACOTTA_BLACK = registerBlock(
            Reference.UnlocalizedName.STAIRS_TERRACOTTA_BLACK,
            TerracottaStairBlock::new
    );
    public static final DeferredBlock<Block> STAIRS_TERRACOTTA_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIRS_TERRACOTTA_BLUE,
            TerracottaStairBlock::new
    );
    public static final DeferredBlock<Block> STAIRS_TERRACOTTA_BROWN = registerBlock(
            Reference.UnlocalizedName.STAIRS_TERRACOTTA_BROWN,
            TerracottaStairBlock::new
    );
    public static final DeferredBlock<Block> STAIRS_TERRACOTTA_CYAN = registerBlock(
            Reference.UnlocalizedName.STAIRS_TERRACOTTA_CYAN,
            TerracottaStairBlock::new
    );
    public static final DeferredBlock<Block> STAIRS_TERRACOTTA_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIRS_TERRACOTTA_GRAY,
            TerracottaStairBlock::new
    );
    public static final DeferredBlock<Block> STAIRS_TERRACOTTA_GREEN = registerBlock(
            Reference.UnlocalizedName.STAIRS_TERRACOTTA_GREEN,
            TerracottaStairBlock::new
    );
    public static final DeferredBlock<Block> STAIRS_TERRACOTTA_LIGHT_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIRS_TERRACOTTA_LIGHT_BLUE,
            TerracottaStairBlock::new
    );
    public static final DeferredBlock<Block> STAIRS_TERRACOTTA_LIGHT_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIRS_TERRACOTTA_LIGHT_GRAY,
            TerracottaStairBlock::new
    );
    public static final DeferredBlock<Block> STAIRS_TERRACOTTA_LIME = registerBlock(
            Reference.UnlocalizedName.STAIRS_TERRACOTTA_LIME,
            TerracottaStairBlock::new
    );
    public static final DeferredBlock<Block> STAIRS_TERRACOTTA_MAGENTA = registerBlock(
            Reference.UnlocalizedName.STAIRS_TERRACOTTA_MAGENTA,
            TerracottaStairBlock::new
    );
    public static final DeferredBlock<Block> STAIRS_TERRACOTTA_ORANGE = registerBlock(
            Reference.UnlocalizedName.STAIRS_TERRACOTTA_ORANGE,
            TerracottaStairBlock::new
    );
    public static final DeferredBlock<Block> STAIRS_TERRACOTTA_PINK = registerBlock(
            Reference.UnlocalizedName.STAIRS_TERRACOTTA_PINK,
            TerracottaStairBlock::new
    );
    public static final DeferredBlock<Block> STAIRS_TERRACOTTA_PURPLE = registerBlock(
            Reference.UnlocalizedName.STAIRS_TERRACOTTA_PURPLE,
            TerracottaStairBlock::new
    );
    public static final DeferredBlock<Block> STAIRS_TERRACOTTA_RED = registerBlock(
            Reference.UnlocalizedName.STAIRS_TERRACOTTA_RED,
            TerracottaStairBlock::new
    );
    public static final DeferredBlock<Block> STAIRS_TERRACOTTA_WHITE = registerBlock(
            Reference.UnlocalizedName.STAIRS_TERRACOTTA_WHITE,
            TerracottaStairBlock::new
    );
    public static final DeferredBlock<Block> STAIRS_TERRACOTTA_YELLOW = registerBlock(
            Reference.UnlocalizedName.STAIRS_TERRACOTTA_YELLOW,
            TerracottaStairBlock::new
    );
    public static final DeferredBlock<Block> STAIR_WOOL_BLACK = registerBlock(
            Reference.UnlocalizedName.STAIRS_WOOL_BLACK,
            WoolStairBlock::new
    );
    public static final DeferredBlock<Block> STAIR_WOOL_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIRS_WOOL_BLUE,
            WoolStairBlock::new
    );
    public static final DeferredBlock<Block> STAIR_WOOL_BROWN = registerBlock(
            Reference.UnlocalizedName.STAIRS_WOOL_BROWN,
            WoolStairBlock::new
    );
    public static final DeferredBlock<Block> STAIR_WOOL_CYAN = registerBlock(
            Reference.UnlocalizedName.STAIRS_WOOL_CYAN,
            WoolStairBlock::new
    );
    public static final DeferredBlock<Block> STAIR_WOOL_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIRS_WOOL_GRAY,
            WoolStairBlock::new
    );
    public static final DeferredBlock<Block> STAIR_WOOL_GREEN = registerBlock(
            Reference.UnlocalizedName.STAIRS_WOOL_GREEN,
            WoolStairBlock::new
    );
    public static final DeferredBlock<Block> STAIR_WOOL_LIGHT_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIRS_WOOL_LIGHT_BLUE,
            WoolStairBlock::new
    );
    public static final DeferredBlock<Block> STAIR_WOOL_LIGHT_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIRS_WOOL_LIGHT_GRAY,
            WoolStairBlock::new
    );
    public static final DeferredBlock<Block> STAIR_WOOL_LIME = registerBlock(
            Reference.UnlocalizedName.STAIRS_WOOL_LIME,
            WoolStairBlock::new
    );
    public static final DeferredBlock<Block> STAIR_WOOL_MAGENTA = registerBlock(
            Reference.UnlocalizedName.STAIRS_WOOL_MAGENTA,
            WoolStairBlock::new
    );
    public static final DeferredBlock<Block> STAIR_WOOL_ORANGE = registerBlock(
            Reference.UnlocalizedName.STAIRS_WOOL_ORANGE,
            WoolStairBlock::new
    );
    public static final DeferredBlock<Block> STAIR_WOOL_PINK = registerBlock(
            Reference.UnlocalizedName.STAIRS_WOOL_PINK,
            WoolStairBlock::new
    );
    public static final DeferredBlock<Block> STAIR_WOOL_PURPLE = registerBlock(
            Reference.UnlocalizedName.STAIRS_WOOL_PURPLE,
            WoolStairBlock::new
    );
    public static final DeferredBlock<Block> STAIR_WOOL_RED = registerBlock(
            Reference.UnlocalizedName.STAIRS_WOOL_RED,
            WoolStairBlock::new
    );
    public static final DeferredBlock<Block> STAIR_WOOL_WHITE = registerBlock(
            Reference.UnlocalizedName.STAIRS_WOOL_WHITE,
            WoolStairBlock::new
    );
    public static final DeferredBlock<Block> STAIR_WOOL_YELLOW = registerBlock(
            Reference.UnlocalizedName.STAIRS_WOOL_YELLOW,
            WoolStairBlock::new
    );

    /*
      Glowing Variants of Vanilla Stairs
     */
    static {
        registerCarpetStairVariant(Reference.UnlocalizedName.STAIRS_TUFF_CARPET,
                Blocks.TUFF_STAIRS, Reference.ToolTypeNames.PICKAXE,
                ResourceLocation.fromNamespaceAndPath("minecraft", "block/tuff")
        );

        registerCarpetStairVariant(Reference.UnlocalizedName.STAIRS_POLISHED_TUFF_CARPET,
                Blocks.POLISHED_TUFF_STAIRS, Reference.ToolTypeNames.PICKAXE,
                ResourceLocation.fromNamespaceAndPath("minecraft", "block/polished_tuff")
        );

        registerCarpetStairVariant(Reference.UnlocalizedName.STAIRS_TUFF_BRICK_CARPET,
                Blocks.TUFF_BRICK_STAIRS, Reference.ToolTypeNames.PICKAXE,
                ResourceLocation.fromNamespaceAndPath("minecraft", "block/tuff_bricks")
        );

        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_WAXED_CUT_COPPER_GLOWING,
                Blocks.WAXED_CUT_COPPER_STAIRS, Reference.ToolTypeNames.PICKAXE,
                ResourceLocation.fromNamespaceAndPath("minecraft", "block/cut_copper")
        );

        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_WAXED_EXPOSED_CUT_COPPER_GLOWING,
                Blocks.WAXED_EXPOSED_CUT_COPPER_STAIRS, Reference.ToolTypeNames.PICKAXE,
                ResourceLocation.fromNamespaceAndPath("minecraft", "block/exposed_cut_copper")
        );

        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_WAXED_WEATHERED_CUT_COPPER_GLOWING,
                Blocks.WAXED_WEATHERED_CUT_COPPER_STAIRS, Reference.ToolTypeNames.PICKAXE,
                ResourceLocation.fromNamespaceAndPath("minecraft", "block/weathered_cut_copper")
        );

        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_WAXED_OXIDIZED_CUT_COPPER_GLOWING,
                Blocks.WAXED_OXIDIZED_CUT_COPPER_STAIRS, Reference.ToolTypeNames.PICKAXE,
                ResourceLocation.fromNamespaceAndPath("minecraft", "block/oxidized_cut_copper")
        );

        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_WEATHERED_CUT_COPPER_GLOWING,
                Blocks.WEATHERED_CUT_COPPER_STAIRS, Reference.ToolTypeNames.PICKAXE,
                ResourceLocation.fromNamespaceAndPath("minecraft", "block/weathered_cut_copper")
        );

        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_ACACIA_GLOWING,
                Blocks.ACACIA_STAIRS, Reference.ToolTypeNames.AXE,
                ResourceLocation.fromNamespaceAndPath("minecraft", "block/acacia_planks")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_ANDESITE_GLOWING,
                Blocks.ANDESITE_STAIRS, Reference.ToolTypeNames.PICKAXE,
                ResourceLocation.fromNamespaceAndPath("minecraft", "block/andesite")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_BAMBOO_MOSAIC_GLOWING,
                Blocks.BAMBOO_MOSAIC_STAIRS, Reference.ToolTypeNames.AXE,
                ResourceLocation.fromNamespaceAndPath("minecraft", "block/bamboo_mosaic")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_BAMBOO_GLOWING,
                Blocks.BAMBOO_STAIRS, Reference.ToolTypeNames.AXE,
                ResourceLocation.fromNamespaceAndPath("minecraft", "block/bamboo_planks")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_BIRCH_GLOWING,
                Blocks.BIRCH_STAIRS, Reference.ToolTypeNames.AXE,
                ResourceLocation.fromNamespaceAndPath("minecraft", "block/birch_planks")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_BLACKSTONE_GLOWING,
                Blocks.BLACKSTONE_STAIRS, Reference.ToolTypeNames.PICKAXE,
                ResourceLocation.fromNamespaceAndPath("minecraft", "block/blackstone")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_BRICK_GLOWING,
                Blocks.BRICK_STAIRS, Reference.ToolTypeNames.PICKAXE,
                ResourceLocation.fromNamespaceAndPath("minecraft", "block/bricks")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_CHERRY_GLOWING,
                Blocks.CHERRY_STAIRS, Reference.ToolTypeNames.AXE,
                ResourceLocation.fromNamespaceAndPath("minecraft", "block/cherry_planks")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_COBBLED_DEEPSLATE_GLOWING,
                Blocks.COBBLED_DEEPSLATE_STAIRS, Reference.ToolTypeNames.PICKAXE,
                ResourceLocation.fromNamespaceAndPath("minecraft", "block/cobbled_deepslate")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_COBBLESTONE_GLOWING,
                Blocks.COBBLESTONE_STAIRS, Reference.ToolTypeNames.PICKAXE,
                ResourceLocation.fromNamespaceAndPath("minecraft", "block/cobblestone")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_CRIMSON_GLOWING,
                Blocks.CRIMSON_STAIRS, Reference.ToolTypeNames.AXE,
                ResourceLocation.fromNamespaceAndPath("minecraft", "block/crimson_planks")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_CUT_COPPER_GLOWING,
                Blocks.CUT_COPPER_STAIRS, Reference.ToolTypeNames.PICKAXE,
                ResourceLocation.fromNamespaceAndPath("minecraft", "block/cut_copper")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_DARK_OAK_GLOWING,
                Blocks.DARK_OAK_STAIRS, Reference.ToolTypeNames.AXE,
                ResourceLocation.fromNamespaceAndPath("minecraft", "block/dark_oak_planks")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_DARK_PRISMARINE_GLOWING,
                Blocks.DARK_PRISMARINE_STAIRS, Reference.ToolTypeNames.PICKAXE,
                ResourceLocation.fromNamespaceAndPath("minecraft", "block/dark_prismarine")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_DEEPSLATE_BRICK_GLOWING,
                Blocks.DEEPSLATE_BRICK_STAIRS, Reference.ToolTypeNames.PICKAXE,
                ResourceLocation.fromNamespaceAndPath("minecraft", "block/deepslate_bricks")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_DEEPSLATE_TILE_GLOWING,
                Blocks.DEEPSLATE_TILE_STAIRS, Reference.ToolTypeNames.PICKAXE,
                ResourceLocation.fromNamespaceAndPath("minecraft", "block/deepslate_tiles")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_DIORITE_GLOWING,
                Blocks.DIORITE_STAIRS, Reference.ToolTypeNames.PICKAXE,
                ResourceLocation.fromNamespaceAndPath("minecraft", "block/diorite")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_END_STONE_BRICK_GLOWING,
                Blocks.END_STONE_BRICK_STAIRS, Reference.ToolTypeNames.PICKAXE,
                ResourceLocation.fromNamespaceAndPath("minecraft", "block/end_stone_bricks")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_EXPOSED_CUT_COPPER_GLOWING,
                Blocks.EXPOSED_CUT_COPPER_STAIRS, Reference.ToolTypeNames.PICKAXE,
                ResourceLocation.fromNamespaceAndPath("minecraft", "block/exposed_cut_copper")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_GRANITE_GLOWING,
                Blocks.GRANITE_STAIRS, Reference.ToolTypeNames.PICKAXE,
                ResourceLocation.fromNamespaceAndPath("minecraft", "block/granite")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_JUNGLE_GLOWING,
                Blocks.JUNGLE_STAIRS, Reference.ToolTypeNames.AXE,
                ResourceLocation.fromNamespaceAndPath("minecraft", "block/jungle_planks")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_MANGROVE_GLOWING,
                Blocks.MANGROVE_STAIRS, Reference.ToolTypeNames.AXE,
                ResourceLocation.fromNamespaceAndPath("minecraft", "block/mangrove_planks")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_MOSSY_COBBLESTONE_GLOWING,
                Blocks.MOSSY_COBBLESTONE_STAIRS, Reference.ToolTypeNames.PICKAXE,
                ResourceLocation.fromNamespaceAndPath("minecraft", "block/mossy_cobblestone")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_MOSSY_STONE_BRICK_GLOWING,
                Blocks.MOSSY_STONE_BRICK_STAIRS, Reference.ToolTypeNames.PICKAXE,
                ResourceLocation.fromNamespaceAndPath("minecraft", "block/mossy_stone_bricks")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_MUD_BRICK_GLOWING,
                Blocks.MUD_BRICK_STAIRS, Reference.ToolTypeNames.PICKAXE,
                ResourceLocation.fromNamespaceAndPath("minecraft", "block/mud_bricks")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_NETHER_BRICK_GLOWING,
                Blocks.NETHER_BRICK_STAIRS, Reference.ToolTypeNames.PICKAXE,
                ResourceLocation.fromNamespaceAndPath("minecraft", "block/nether_bricks")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_OAK_GLOWING,
                Blocks.OAK_STAIRS, Reference.ToolTypeNames.AXE,
                ResourceLocation.fromNamespaceAndPath("minecraft", "block/oak_planks")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_OXIDIZED_CUT_COPPER_GLOWING,
                Blocks.OXIDIZED_CUT_COPPER_STAIRS, Reference.ToolTypeNames.PICKAXE,
                ResourceLocation.fromNamespaceAndPath("minecraft", "block/oxidized_cut_copper")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_POLISHED_ANDESITE_GLOWING,
                Blocks.POLISHED_ANDESITE_STAIRS, Reference.ToolTypeNames.PICKAXE,
                ResourceLocation.fromNamespaceAndPath("minecraft", "block/polished_andesite")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_POLISHED_BLACKSTONE_BRICK_GLOWING,
                Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS, Reference.ToolTypeNames.PICKAXE,
                ResourceLocation.fromNamespaceAndPath("minecraft", "block/polished_blackstone_bricks")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_POLISHED_BLACKSTONE_GLOWING,
                Blocks.POLISHED_BLACKSTONE_STAIRS, Reference.ToolTypeNames.PICKAXE,
                ResourceLocation.fromNamespaceAndPath("minecraft", "block/polished_blackstone")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_POLISHED_DEEPSLATE_GLOWING,
                Blocks.POLISHED_DEEPSLATE_STAIRS, Reference.ToolTypeNames.PICKAXE,
                ResourceLocation.fromNamespaceAndPath("minecraft", "block/polished_deepslate")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_POLISHED_DIORITE_GLOWING,
                Blocks.POLISHED_DIORITE_STAIRS, Reference.ToolTypeNames.PICKAXE,
                ResourceLocation.fromNamespaceAndPath("minecraft", "block/polished_diorite")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_POLISHED_GRANITE_GLOWING,
                Blocks.POLISHED_GRANITE_STAIRS, Reference.ToolTypeNames.PICKAXE,
                ResourceLocation.fromNamespaceAndPath("minecraft", "block/polished_granite")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_PRISMARINE_BRICK_GLOWING,
                Blocks.PRISMARINE_BRICK_STAIRS, Reference.ToolTypeNames.PICKAXE,
                ResourceLocation.fromNamespaceAndPath("minecraft", "block/prismarine_bricks")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_PRISMARINE_GLOWING,
                Blocks.PRISMARINE_STAIRS, Reference.ToolTypeNames.PICKAXE,
                ResourceLocation.fromNamespaceAndPath("minecraft", "block/prismarine")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_PURPUR_GLOWING,
                Blocks.PURPUR_STAIRS, Reference.ToolTypeNames.PICKAXE,
                ResourceLocation.fromNamespaceAndPath("minecraft", "block/purpur_block")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_QUARTZ_GLOWING,
                Blocks.QUARTZ_STAIRS, Reference.ToolTypeNames.PICKAXE,
                ResourceLocation.fromNamespaceAndPath("minecraft", "block/quartz_block_top")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_RED_NETHER_BRICK_GLOWING,
                Blocks.RED_NETHER_BRICK_STAIRS, Reference.ToolTypeNames.PICKAXE,
                ResourceLocation.fromNamespaceAndPath("minecraft", "block/red_nether_bricks")
        );
        // TODO: Refactor for multi-textured red_sandstone_stairs
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_RED_SANDSTONE_GLOWING,
                Blocks.RED_SANDSTONE_STAIRS, Reference.ToolTypeNames.PICKAXE,
                ResourceLocation.fromNamespaceAndPath("minecraft", "block/red_sandstone_bottom")
        );
        // TODO: Refactor for multi-textured sandstone_stairs
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_SANDSTONE_GLOWING,
                Blocks.SANDSTONE_STAIRS, Reference.ToolTypeNames.PICKAXE,
                ResourceLocation.fromNamespaceAndPath("minecraft", "block/sandstone_bottom")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_SMOOTH_QUARTZ_GLOWING,
                Blocks.SMOOTH_QUARTZ_STAIRS, Reference.ToolTypeNames.PICKAXE,
                ResourceLocation.fromNamespaceAndPath("minecraft", "block/quartz_block_bottom")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_SMOOTH_RED_SANDSTONE_GLOWING,
                Blocks.SMOOTH_RED_SANDSTONE_STAIRS, Reference.ToolTypeNames.PICKAXE,
                ResourceLocation.fromNamespaceAndPath("minecraft", "block/red_sandstone_top")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_SMOOTH_SANDSTONE_GLOWING,
                Blocks.SMOOTH_SANDSTONE_STAIRS, Reference.ToolTypeNames.PICKAXE,
                ResourceLocation.fromNamespaceAndPath("minecraft", "block/sandstone_top")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_SPRUCE_GLOWING,
                Blocks.SPRUCE_STAIRS, Reference.ToolTypeNames.AXE,
                ResourceLocation.fromNamespaceAndPath("minecraft", "block/spruce_planks")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_STONE_BRICK_GLOWING,
                Blocks.STONE_BRICK_STAIRS, Reference.ToolTypeNames.PICKAXE,
                ResourceLocation.fromNamespaceAndPath("minecraft", "block/stone_bricks")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_STONE_GLOWING,
                Blocks.STONE_STAIRS, Reference.ToolTypeNames.PICKAXE,
                ResourceLocation.fromNamespaceAndPath("minecraft", "block/stone")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_WARPED_GLOWING,
                Blocks.WARPED_STAIRS, Reference.ToolTypeNames.AXE,
                ResourceLocation.fromNamespaceAndPath("minecraft", "block/warped_planks")
        );
        //region Growthcraft Deco 1.21.0
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIRS_TUFF_GLOWING,
                Blocks.TUFF_STAIRS, Reference.ToolTypeNames.PICKAXE,
                ResourceLocation.withDefaultNamespace("block/tuff")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIRS_POLISHED_TUFF_GLOWING,
                Blocks.POLISHED_TUFF_STAIRS, Reference.ToolTypeNames.PICKAXE,
                ResourceLocation.withDefaultNamespace("block/polished_tuff")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIRS_TUFF_BRICK_GLOWING,
                Blocks.TUFF_BRICK_STAIRS, Reference.ToolTypeNames.PICKAXE,
                ResourceLocation.withDefaultNamespace("block/tuff_bricks")
        );
        //endregion



    }

    /*
      Glowing Variants of Vanilla Blocks
     */
    static {
        registerVanillaVariant(Reference.UnlocalizedName.ACACIA_PLANKS_GLOWING, Blocks.ACACIA_PLANKS, "axe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/acacia_planks"));
        registerVanillaVariant(Reference.UnlocalizedName.ANDESITE_GLOWING, Blocks.ANDESITE,"pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/andesite"));
        registerVanillaVariant(Reference.UnlocalizedName.AMETHYST_BLOCK_GLOWING, Blocks.AMETHYST_BLOCK, "pickaxe", ResourceLocation.withDefaultNamespace("block/amethyst_block"));
        registerVanillaVariant(Reference.UnlocalizedName.BASALT_GLOWING, Blocks.BASALT, "pickaxe",
                ResourceLocation.withDefaultNamespace("block/basalt"), ResourceLocation.withDefaultNamespace("block/basalt_side"));
        registerVanillaVariant(Reference.UnlocalizedName.DIORITE_GLOWING, Blocks.DIORITE, "pickaxe", ResourceLocation.withDefaultNamespace("block/diorite"));
        registerVanillaVariant(Reference.UnlocalizedName.POLISHED_DIORITE_GLOWING, Blocks.POLISHED_DIORITE, "pickaxe", ResourceLocation.withDefaultNamespace("block/polished_diorite"));
        registerVanillaVariant(Reference.UnlocalizedName.BAMBOO_MOSAIC_GLOWING, Blocks.BAMBOO_MOSAIC, "axe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/bamboo_mosaic"));
        registerVanillaVariant(Reference.UnlocalizedName.BAMBOO_PLANKS_GLOWING, Blocks.BAMBOO_PLANKS, "axe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/bamboo_planks"));
        registerVanillaVariant(Reference.UnlocalizedName.BIRCH_PLANKS_GLOWING, Blocks.BIRCH_PLANKS, "axe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/birch_planks"));
        registerVanillaVariant(Reference.UnlocalizedName.BLACKSTONE_GLOWING, Blocks.BLACKSTONE, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/blackstone"));
        registerVanillaVariant(Reference.UnlocalizedName.BLACK_CONCRETE_GLOWING, Blocks.BLACK_CONCRETE, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/black_concrete"));
        registerVanillaVariant(Reference.UnlocalizedName.BLACK_TERRACOTTA_GLOWING, Blocks.BLACK_TERRACOTTA, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/black_terracotta"));
        registerVanillaVariant(Reference.UnlocalizedName.BLACK_WOOL_GLOWING, Blocks.BLACK_WOOL, "none", ResourceLocation.fromNamespaceAndPath("minecraft", "block/black_wool"));
        registerVanillaVariant(Reference.UnlocalizedName.BLUE_CONCRETE_GLOWING, Blocks.BLUE_CONCRETE, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/blue_concrete"));
        registerVanillaVariant(Reference.UnlocalizedName.BLUE_TERRACOTTA_GLOWING, Blocks.BLUE_TERRACOTTA, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/blue_terracotta"));
        registerVanillaVariant(Reference.UnlocalizedName.BLUE_WOOL_GLOWING, Blocks.BLUE_WOOL, "none", ResourceLocation.fromNamespaceAndPath("minecraft", "block/blue_wool"));
        registerVanillaVariant(Reference.UnlocalizedName.BOOKSHELF_GLOWING, Blocks.BOOKSHELF, "axe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/bookshelf"));
        registerVanillaVariant(Reference.UnlocalizedName.BRICKS_GLOWING, Blocks.BRICKS, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/bricks"));
        registerVanillaVariant(Reference.UnlocalizedName.BROWN_CONCRETE_GLOWING, Blocks.BROWN_CONCRETE, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/brown_concrete"));
        registerVanillaVariant(Reference.UnlocalizedName.BROWN_TERRACOTTA_GLOWING, Blocks.BROWN_TERRACOTTA, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/brown_terracotta"));
        registerVanillaVariant(Reference.UnlocalizedName.BROWN_WOOL_GLOWING, Blocks.BROWN_WOOL, "none", ResourceLocation.fromNamespaceAndPath("minecraft", "block/brown_wool"));
        registerVanillaVariant(Reference.UnlocalizedName.CALCITE_GLOWING, Blocks.CALCITE, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/calcite"));
        registerVanillaVariant(Reference.UnlocalizedName.CHERRY_PLANKS_GLOWING, Blocks.CHERRY_PLANKS, "axe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/cherry_planks"));
        registerVanillaVariant(Reference.UnlocalizedName.CHISELED_DEEPSLATE_GLOWING, Blocks.CHISELED_DEEPSLATE, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/chiseled_deepslate"));
        registerVanillaVariant(Reference.UnlocalizedName.CHISELED_NETHER_BRICKS_GLOWING, Blocks.CHISELED_NETHER_BRICKS, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/chiseled_nether_bricks"));
        registerVanillaVariant(Reference.UnlocalizedName.CHISELED_POLISHED_BLACKSTONE_GLOWING, Blocks.CHISELED_POLISHED_BLACKSTONE, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/chiseled_polished_blackstone"));
        registerVanillaVariant(Reference.UnlocalizedName.CHISELED_QUARTZ_BLOCK_GLOWING, Blocks.CHISELED_QUARTZ_BLOCK, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/chiseled_quartz_block"));
        registerVanillaVariant(Reference.UnlocalizedName.CHISELED_RED_SANDSTONE_GLOWING, Blocks.CHISELED_RED_SANDSTONE, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/chiseled_red_sandstone"));
        registerVanillaVariant(Reference.UnlocalizedName.CHISELED_SANDSTONE_GLOWING, Blocks.CHISELED_SANDSTONE, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/chiseled_sandstone"));
        registerVanillaVariant(Reference.UnlocalizedName.CHISELED_STONE_BRICKS_GLOWING, Blocks.CHISELED_STONE_BRICKS, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/chiseled_stone_bricks"));
        registerVanillaVariant(Reference.UnlocalizedName.CLAY_GLOWING, Blocks.CLAY, "shovel", ResourceLocation.fromNamespaceAndPath("minecraft", "block/clay"));
        registerVanillaVariant(Reference.UnlocalizedName.COAL_BLOCK_GLOWING, Blocks.COAL_BLOCK, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/coal_block"));
        registerVanillaVariant(Reference.UnlocalizedName.COARSE_DIRT_GLOWING, Blocks.COARSE_DIRT, "shovel", ResourceLocation.fromNamespaceAndPath("minecraft", "block/coarse_dirt"));
        registerVanillaVariant(Reference.UnlocalizedName.COBBLED_DEEPSLATE_GLOWING, Blocks.COBBLED_DEEPSLATE, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/cobbled_deepslate"));
        registerVanillaVariant(Reference.UnlocalizedName.COBBLESTONE_GLOWING, Blocks.COBBLESTONE, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/cobblestone"));
        registerVanillaVariant(Reference.UnlocalizedName.COPPER_BLOCK_GLOWING, Blocks.COPPER_BLOCK, "pickaxe", ResourceLocation.withDefaultNamespace("block/copper_block"));
        registerVanillaVariant(Reference.UnlocalizedName.CUT_COPPER_GLOWING, Blocks.CUT_COPPER, "pickaxe", ResourceLocation.withDefaultNamespace("block/cut_copper"));
        registerVanillaVariant(Reference.UnlocalizedName.EXPOSED_COPPER_GLOWING, Blocks.EXPOSED_COPPER, "pickaxe", ResourceLocation.withDefaultNamespace("block/exposed_copper"));
        registerVanillaVariant(Reference.UnlocalizedName.EXPOSED_CUT_COPPER_GLOWING, Blocks.EXPOSED_CUT_COPPER, "pickaxe", ResourceLocation.withDefaultNamespace("block/exposed_cut_copper"));
        registerVanillaVariant(Reference.UnlocalizedName.CRACKED_DEEPSLATE_BRICKS_GLOWING, Blocks.CRACKED_DEEPSLATE_BRICKS, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/cracked_deepslate_bricks"));
        registerVanillaVariant(Reference.UnlocalizedName.CRACKED_DEEPSLATE_TILES_GLOWING, Blocks.CRACKED_DEEPSLATE_TILES, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/cracked_deepslate_tiles"));
        registerVanillaVariant(Reference.UnlocalizedName.CRACKED_NETHER_BRICKS_GLOWING, Blocks.CRACKED_NETHER_BRICKS, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/cracked_nether_bricks"));
        registerVanillaVariant(Reference.UnlocalizedName.CRACKED_POLISHED_BLACKSTONE_BRICKS_GLOWING, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/cracked_polished_blackstone_bricks"));
        registerVanillaVariant(Reference.UnlocalizedName.CRACKED_STONE_BRICKS_GLOWING, Blocks.CRACKED_STONE_BRICKS, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/cracked_stone_bricks"));
        registerVanillaVariant(Reference.UnlocalizedName.CRIMSON_PLANKS_GLOWING, Blocks.CRIMSON_PLANKS, "axe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/crimson_planks"));
        registerVanillaVariant(Reference.UnlocalizedName.CUT_RED_SANDSTONE_GLOWING, Blocks.CUT_RED_SANDSTONE, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/cut_red_sandstone"));
        registerVanillaVariant(Reference.UnlocalizedName.CUT_SANDSTONE_GLOWING, Blocks.CUT_SANDSTONE, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/cut_sandstone"));
        registerVanillaVariant(Reference.UnlocalizedName.CYAN_CONCRETE_GLOWING, Blocks.CYAN_CONCRETE, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/cyan_concrete"));
        registerVanillaVariant(Reference.UnlocalizedName.CYAN_TERRACOTTA_GLOWING, Blocks.CYAN_TERRACOTTA, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/cyan_terracotta"));
        registerVanillaVariant(Reference.UnlocalizedName.CYAN_WOOL_GLOWING, Blocks.CYAN_WOOL, "none", ResourceLocation.fromNamespaceAndPath("minecraft", "block/cyan_wool"));
        registerVanillaVariant(Reference.UnlocalizedName.DARK_OAK_PLANKS_GLOWING, Blocks.DARK_OAK_PLANKS, "axe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/dark_oak_planks"));
        registerVanillaVariant(Reference.UnlocalizedName.DARK_PRISMARINE_GLOWING, Blocks.DARK_PRISMARINE, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/dark_prismarine"));
        registerVanillaVariant(Reference.UnlocalizedName.DEEPSLATE_BRICKS_GLOWING, Blocks.DEEPSLATE_BRICKS, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/deepslate_bricks"));
        registerVanillaVariant(Reference.UnlocalizedName.DEEPSLATE_TILES_GLOWING, Blocks.DEEPSLATE_TILES, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/deepslate_tiles"));
        registerVanillaVariant(Reference.UnlocalizedName.DEEPSLATE_GLOWING, Blocks.DEEPSLATE, "pickaxe", ResourceLocation.withDefaultNamespace("block/deepslate"));
        registerVanillaVariant(Reference.UnlocalizedName.DIAMOND_BLOCK_GLOWING, Blocks.DIAMOND_BLOCK, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/diamond_block"));
        registerVanillaVariant(Reference.UnlocalizedName.DIRT_GLOWING, Blocks.DIRT, "shovel", ResourceLocation.fromNamespaceAndPath("minecraft", "block/dirt"));
        registerVanillaVariant(Reference.UnlocalizedName.DRIED_KELP_BLOCK_GLOWING, Blocks.DRIED_KELP_BLOCK, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/dried_kelp_block"), ResourceLocation.fromNamespaceAndPath("minecraft", "block/dried_kelp_side"));
        registerVanillaVariant(Reference.UnlocalizedName.DRIPSTONE_BLOCK_GLOWING, Blocks.DRIPSTONE_BLOCK, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/dripstone_block"));
        registerVanillaVariant(Reference.UnlocalizedName.EMERALD_BLOCK_GLOWING, Blocks.EMERALD_BLOCK, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/emerald_block"));
        registerVanillaVariant(Reference.UnlocalizedName.END_STONE_BRICKS_GLOWING, Blocks.END_STONE_BRICKS, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/end_stone_bricks"));
        registerVanillaVariant(Reference.UnlocalizedName.END_STONE_GLOWING, Blocks.END_STONE, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/end_stone"));
        registerVanillaVariant(Reference.UnlocalizedName.GILDED_BLACKSTONE_GLOWING, Blocks.GILDED_BLACKSTONE, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/gilded_blackstone"));
        registerVanillaVariant(Reference.UnlocalizedName.GOLD_BLOCK_GLOWING, Blocks.GOLD_BLOCK, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/gold_block"));
        registerVanillaVariant(Reference.UnlocalizedName.GRANITE_GLOWING, Blocks.GRANITE,"pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/granite"));
        registerVanillaVariant(Reference.UnlocalizedName.GRAY_CONCRETE_GLOWING, Blocks.GRAY_CONCRETE, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/gray_concrete"));
        registerVanillaVariant(Reference.UnlocalizedName.GRAY_TERRACOTTA_GLOWING, Blocks.GRAY_TERRACOTTA, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/gray_terracotta"));
        registerVanillaVariant(Reference.UnlocalizedName.GRAY_WOOL_GLOWING, Blocks.GRAY_WOOL, "none", ResourceLocation.fromNamespaceAndPath("minecraft", "block/gray_wool"));
        registerVanillaVariant(Reference.UnlocalizedName.GREEN_CONCRETE_GLOWING, Blocks.GREEN_CONCRETE, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/green_concrete"));
        registerVanillaVariant(Reference.UnlocalizedName.GREEN_TERRACOTTA_GLOWING, Blocks.GREEN_TERRACOTTA, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/green_terracotta"));
        registerVanillaVariant(Reference.UnlocalizedName.GREEN_WOOL_GLOWING, Blocks.GREEN_WOOL, "none", ResourceLocation.fromNamespaceAndPath("minecraft", "block/green_wool"));
        registerVanillaVariant(Reference.UnlocalizedName.HONEYCOMB_BLOCK_GLOWING, Blocks.HONEYCOMB_BLOCK, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/honeycomb_block"));
        registerVanillaVariant(Reference.UnlocalizedName.IRON_BLOCK_GLOWING, Blocks.IRON_BLOCK, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block"));
        registerVanillaVariant(Reference.UnlocalizedName.JUNGLE_PLANKS_GLOWING, Blocks.JUNGLE_PLANKS, "axe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/jungle_planks"));
        registerVanillaVariant(Reference.UnlocalizedName.LAPIS_BLOCK_GLOWING, Blocks.LAPIS_BLOCK, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/lapis_block"));
        registerVanillaVariant(Reference.UnlocalizedName.LIGHT_BLUE_CONCRETE_GLOWING, Blocks.LIGHT_BLUE_CONCRETE, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/light_blue_concrete"));
        registerVanillaVariant(Reference.UnlocalizedName.LIGHT_BLUE_TERRACOTTA_GLOWING, Blocks.LIGHT_BLUE_TERRACOTTA, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/light_blue_terracotta"));
        registerVanillaVariant(Reference.UnlocalizedName.LIGHT_BLUE_WOOL_GLOWING, Blocks.LIGHT_BLUE_WOOL, "none", ResourceLocation.fromNamespaceAndPath("minecraft", "block/light_blue_wool"));
        registerVanillaVariant(Reference.UnlocalizedName.LIGHT_GRAY_CONCRETE_GLOWING, Blocks.LIGHT_GRAY_CONCRETE, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/light_gray_concrete"));
        registerVanillaVariant(Reference.UnlocalizedName.LIGHT_GRAY_TERRACOTTA_GLOWING, Blocks.LIGHT_GRAY_TERRACOTTA, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/light_gray_terracotta"));
        registerVanillaVariant(Reference.UnlocalizedName.LIGHT_GRAY_WOOL_GLOWING, Blocks.LIGHT_GRAY_WOOL, "none", ResourceLocation.fromNamespaceAndPath("minecraft", "block/light_gray_wool"));
        registerVanillaVariant(Reference.UnlocalizedName.LIME_CONCRETE_GLOWING, Blocks.LIME_CONCRETE, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/lime_concrete"));
        registerVanillaVariant(Reference.UnlocalizedName.LIME_TERRACOTTA_GLOWING, Blocks.LIME_TERRACOTTA, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/lime_terracotta"));
        registerVanillaVariant(Reference.UnlocalizedName.LIME_WOOL_GLOWING, Blocks.LIME_WOOL, "none", ResourceLocation.fromNamespaceAndPath("minecraft", "block/lime_wool"));
        registerVanillaVariant(Reference.UnlocalizedName.LODESTONE_GLOWING, Blocks.LODESTONE, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/lodestone"), ResourceLocation.fromNamespaceAndPath("minecraft", "block/lodestone_side"));
        registerVanillaVariant(Reference.UnlocalizedName.MAGENTA_CONCRETE_GLOWING, Blocks.MAGENTA_CONCRETE, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/magenta_concrete"));
        registerVanillaVariant(Reference.UnlocalizedName.MAGENTA_TERRACOTTA_GLOWING, Blocks.MAGENTA_TERRACOTTA, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/magenta_terracotta"));
        registerVanillaVariant(Reference.UnlocalizedName.MAGENTA_WOOL_GLOWING, Blocks.MAGENTA_WOOL, "none", ResourceLocation.fromNamespaceAndPath("minecraft", "block/magenta_wool"));
        registerVanillaVariant(Reference.UnlocalizedName.MANGROVE_PLANKS_GLOWING, Blocks.MANGROVE_PLANKS, "axe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/mangrove_planks"));
        registerVanillaVariant(Reference.UnlocalizedName.MOSSY_COBBLESTONE_GLOWING, Blocks.MOSSY_COBBLESTONE, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/mossy_cobblestone"));
        registerVanillaVariant(Reference.UnlocalizedName.MOSSY_STONE_BRICKS_GLOWING, Blocks.MOSSY_STONE_BRICKS, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/mossy_stone_bricks"));
        registerVanillaVariant(Reference.UnlocalizedName.MUD_BRICKS_GLOWING, Blocks.MUD_BRICKS, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/mud_bricks"));
        registerVanillaVariant(Reference.UnlocalizedName.NETHERITE_BLOCK_GLOWING, Blocks.NETHERITE_BLOCK, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/netherite_block"));
        registerVanillaVariant(Reference.UnlocalizedName.NETHERRACK_GLOWING, Blocks.NETHERRACK, "pickaxe", ResourceLocation.withDefaultNamespace("block/netherrack"));
        registerVanillaVariant(Reference.UnlocalizedName.NETHER_BRICKS_GLOWING, Blocks.NETHER_BRICKS, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/nether_bricks"));
        registerVanillaVariant(Reference.UnlocalizedName.NETHER_WART_BLOCK_GLOWING, Blocks.NETHER_WART_BLOCK, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/nether_wart_block"));
        registerVanillaVariant(Reference.UnlocalizedName.OAK_PLANKS_GLOWING, Blocks.OAK_PLANKS, "axe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/oak_planks"));
        registerVanillaVariant(Reference.UnlocalizedName.OBSIDIAN_GLOWING, Blocks.OBSIDIAN, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/obsidian"));
        registerVanillaVariant(Reference.UnlocalizedName.OXIDIZED_COPPER_GLOWING, Blocks.OXIDIZED_COPPER, "pickaxe", ResourceLocation.withDefaultNamespace("block/oxidized_copper"));
        registerVanillaVariant(Reference.UnlocalizedName.OXIDIZED_CUT_COPPER_GLOWING, Blocks.OXIDIZED_CUT_COPPER, "pickaxe", ResourceLocation.withDefaultNamespace("block/oxidized_cut_copper"));
        registerVanillaVariant(Reference.UnlocalizedName.ORANGE_CONCRETE_GLOWING, Blocks.ORANGE_CONCRETE, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/orange_concrete"));
        registerVanillaVariant(Reference.UnlocalizedName.ORANGE_TERRACOTTA_GLOWING, Blocks.ORANGE_TERRACOTTA, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/orange_terracotta"));
        registerVanillaVariant(Reference.UnlocalizedName.ORANGE_WOOL_GLOWING, Blocks.ORANGE_WOOL, "none", ResourceLocation.fromNamespaceAndPath("minecraft", "block/orange_wool"));
        registerVanillaVariant(Reference.UnlocalizedName.PACKED_ICE_GLOWING, Blocks.PACKED_ICE, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/packed_ice"));
        registerVanillaVariant(Reference.UnlocalizedName.PACKED_MUD_GLOWING, Blocks.PACKED_MUD, "shovel", ResourceLocation.fromNamespaceAndPath("minecraft", "block/packed_mud"));
        registerVanillaVariant(Reference.UnlocalizedName.PINK_CONCRETE_GLOWING, Blocks.PINK_CONCRETE, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/pink_concrete"));
        registerVanillaVariant(Reference.UnlocalizedName.PINK_TERRACOTTA_GLOWING, Blocks.PINK_TERRACOTTA, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/pink_terracotta"));
        registerVanillaVariant(Reference.UnlocalizedName.PINK_WOOL_GLOWING, Blocks.PINK_WOOL, "none", ResourceLocation.fromNamespaceAndPath("minecraft", "block/pink_wool"));
        registerVanillaVariant(Reference.UnlocalizedName.POLISHED_ANDESITE_GLOWING, Blocks.POLISHED_ANDESITE, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/polished_andesite"));
        registerVanillaVariant(Reference.UnlocalizedName.POLISHED_BLACKSTONE_BRICKS_GLOWING, Blocks.POLISHED_BLACKSTONE_BRICKS, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/polished_blackstone_bricks"));
        registerVanillaVariant(Reference.UnlocalizedName.POLISHED_BLACKSTONE_GLOWING, Blocks.POLISHED_BLACKSTONE, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/polished_blackstone"));
        registerVanillaVariant(Reference.UnlocalizedName.POLISHED_DEEPSLATE_GLOWING, Blocks.POLISHED_DEEPSLATE, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/polished_deepslate"));
        registerVanillaVariant(Reference.UnlocalizedName.POLISHED_BASALT_GLOWING, Blocks.POLISHED_BASALT, "pickaxe",
                ResourceLocation.withDefaultNamespace("block/polished_basalt"), ResourceLocation.withDefaultNamespace("block/polished_basalt_side"));
        registerVanillaVariant(Reference.UnlocalizedName.POLISHED_GRANITE_GLOWING, Blocks.POLISHED_GRANITE,"pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/polished_granite"));
        registerVanillaVariant(Reference.UnlocalizedName.PRISMARINE_BRICKS_GLOWING, Blocks.PRISMARINE_BRICKS, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/prismarine_bricks"));
        registerVanillaVariant(Reference.UnlocalizedName.PRISMARINE_GLOWING, Blocks.PRISMARINE, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/prismarine"));
        registerVanillaVariant(Reference.UnlocalizedName.PURPLE_CONCRETE_GLOWING, Blocks.PURPLE_CONCRETE, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/purple_concrete"));
        registerVanillaVariant(Reference.UnlocalizedName.PURPLE_TERRACOTTA_GLOWING, Blocks.PURPLE_TERRACOTTA, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/purple_terracotta"));
        registerVanillaVariant(Reference.UnlocalizedName.PURPLE_WOOL_GLOWING, Blocks.PURPLE_WOOL, "none", ResourceLocation.fromNamespaceAndPath("minecraft", "block/purple_wool"));
        registerVanillaVariant(Reference.UnlocalizedName.PURPUR_BLOCK_GLOWING, Blocks.PURPUR_BLOCK, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/purpur_block"));
        registerVanillaVariant(Reference.UnlocalizedName.PURPUR_PILLAR_GLOWING, Blocks.PURPUR_PILLAR, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/purpur_pillar"));
        registerVanillaVariant(Reference.UnlocalizedName.QUARTZ_BLOCK_GLOWING, Blocks.QUARTZ_BLOCK, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/quartz_block"), ResourceLocation.fromNamespaceAndPath("minecraft", "block/quartz_block_side"));
        registerVanillaVariant(Reference.UnlocalizedName.QUARTZ_PILLAR_GLOWING, Blocks.QUARTZ_PILLAR, "pickaxe", ResourceLocation.withDefaultNamespace("block/quartz_pillar"), ResourceLocation.withDefaultNamespace("block/quartz_pillar"));
        registerVanillaVariant(Reference.UnlocalizedName.QUARTZ_BRICKS_GLOWING, Blocks.QUARTZ_BRICKS, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/quartz_bricks"));
        registerVanillaVariant(Reference.UnlocalizedName.RAW_COPPER_BLOCK_GLOWING, Blocks.RAW_COPPER_BLOCK, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/raw_copper_block"));
        registerVanillaVariant(Reference.UnlocalizedName.RAW_GOLD_BLOCK_GLOWING, Blocks.RAW_GOLD_BLOCK, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/raw_gold_block"));
        registerVanillaVariant(Reference.UnlocalizedName.RAW_IRON_BLOCK_GLOWING, Blocks.RAW_IRON_BLOCK, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/raw_iron_block"));
        registerVanillaVariant(Reference.UnlocalizedName.RED_CONCRETE_GLOWING, Blocks.RED_CONCRETE, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/red_concrete"));
        registerVanillaVariant(Reference.UnlocalizedName.RED_NETHER_BRICKS_GLOWING, Blocks.RED_NETHER_BRICKS, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/red_nether_bricks"));
        registerVanillaVariant(Reference.UnlocalizedName.REDSTONE_BLOCK_GLOWING, Blocks.REDSTONE_BLOCK, "pickaxe", ResourceLocation.withDefaultNamespace("block/redstone_block"));
        registerVanillaVariant(Reference.UnlocalizedName.RED_SANDSTONE_GLOWING, Blocks.RED_SANDSTONE, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/red_sandstone"));
        registerVanillaVariant(Reference.UnlocalizedName.RED_TERRACOTTA_GLOWING, Blocks.RED_TERRACOTTA, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/red_terracotta"));
        registerVanillaVariant(Reference.UnlocalizedName.RED_WOOL_GLOWING, Blocks.RED_WOOL, "none", ResourceLocation.fromNamespaceAndPath("minecraft", "block/red_wool"));
        registerVanillaVariant(Reference.UnlocalizedName.REINFORCED_DEEPSLATE_GLOWING, Blocks.REINFORCED_DEEPSLATE, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/reinforced_deepslate"), ResourceLocation.fromNamespaceAndPath("minecraft", "block/reinforced_deepslate_side"));
        registerVanillaVariant(Reference.UnlocalizedName.SANDSTONE_GLOWING, Blocks.SANDSTONE, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/sandstone"));
        registerVanillaVariant(Reference.UnlocalizedName.SMOOTH_BASALT_GLOWING, Blocks.SMOOTH_BASALT, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/smooth_basalt"));
        registerVanillaVariant(Reference.UnlocalizedName.SMOOTH_QUARTZ_GLOWING, Blocks.SMOOTH_QUARTZ, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/smooth_quartz"), ResourceLocation.fromNamespaceAndPath("minecraft", "block/quartz_block_bottom"));
        registerVanillaVariant(Reference.UnlocalizedName.SMOOTH_RED_SANDSTONE_GLOWING, Blocks.SMOOTH_RED_SANDSTONE, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/smooth_red_sandstone"), ResourceLocation.fromNamespaceAndPath("minecraft", "block/red_sandstone_top"));
        registerVanillaVariant(Reference.UnlocalizedName.SMOOTH_SANDSTONE_GLOWING, Blocks.SMOOTH_SANDSTONE, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/smooth_sandstone"), ResourceLocation.fromNamespaceAndPath("minecraft", "block/sandstone_top"));
        registerVanillaVariant(Reference.UnlocalizedName.SMOOTH_STONE_GLOWING, Blocks.SMOOTH_STONE, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/smooth_stone"));
        registerVanillaVariant(Reference.UnlocalizedName.SNOW_BLOCK_GLOWING, Blocks.SNOW_BLOCK, "shovel", ResourceLocation.fromNamespaceAndPath("minecraft", "block/snow_block"), ResourceLocation.fromNamespaceAndPath("minecraft", "block/snow"));
        registerVanillaVariant(Reference.UnlocalizedName.SOUL_SOIL_GLOWING, Blocks.SOUL_SOIL, "shovel", ResourceLocation.fromNamespaceAndPath("minecraft", "block/soul_soil"));
        registerVanillaVariant(Reference.UnlocalizedName.SPRUCE_PLANKS_GLOWING, Blocks.SPRUCE_PLANKS, "axe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/spruce_planks"));
        registerVanillaVariant(Reference.UnlocalizedName.STONE_BRICKS_GLOWING, Blocks.STONE_BRICKS, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/stone_bricks"));
        registerVanillaVariant(Reference.UnlocalizedName.STONE_GLOWING, Blocks.STONE,"pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/stone"));
        registerVanillaVariant(Reference.UnlocalizedName.TERRACOTTA_GLOWING, Blocks.TERRACOTTA, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/terracotta"));
        registerVanillaVariant(Reference.UnlocalizedName.TUFF_GLOWING, Blocks.TUFF, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/tuff"));
        registerVanillaVariant(Reference.UnlocalizedName.WARPED_PLANKS_GLOWING, Blocks.WARPED_PLANKS, "axe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/warped_planks"));
        registerVanillaVariant(Reference.UnlocalizedName.WARPED_WART_BLOCK_GLOWING, Blocks.WARPED_WART_BLOCK, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/warped_wart_block"));
        registerVanillaVariant(Reference.UnlocalizedName.WAXED_COPPER_BLOCK_GLOWING, Blocks.WAXED_COPPER_BLOCK, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/copper_block"));
        registerVanillaVariant(Reference.UnlocalizedName.WAXED_CUT_COPPER_GLOWING, Blocks.WAXED_CUT_COPPER, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/cut_copper"));
        registerVanillaVariant(Reference.UnlocalizedName.WAXED_EXPOSED_COPPER_GLOWING, Blocks.WAXED_EXPOSED_COPPER, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/exposed_copper"));
        registerVanillaVariant(Reference.UnlocalizedName.WAXED_EXPOSED_CUT_COPPER_GLOWING, Blocks.WAXED_EXPOSED_CUT_COPPER, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/exposed_cut_copper"));
        registerVanillaVariant(Reference.UnlocalizedName.WAXED_OXIDIZED_COPPER_GLOWING, Blocks.WAXED_OXIDIZED_COPPER, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/oxidized_copper"));
        registerVanillaVariant(Reference.UnlocalizedName.WAXED_OXIDIZED_CUT_COPPER_GLOWING, Blocks.WAXED_OXIDIZED_CUT_COPPER, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/oxidized_cut_copper"));
        registerVanillaVariant(Reference.UnlocalizedName.WAXED_WEATHERED_COPPER_GLOWING, Blocks.WAXED_WEATHERED_COPPER, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/weathered_copper"));
        registerVanillaVariant(Reference.UnlocalizedName.WAXED_WEATHERED_CUT_COPPER_GLOWING, Blocks.WAXED_WEATHERED_CUT_COPPER, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/weathered_cut_copper"));
        registerVanillaVariant(Reference.UnlocalizedName.WEATHERED_COPPER_GLOWING, Blocks.WEATHERED_COPPER, "pickaxe", ResourceLocation.withDefaultNamespace("block/weathered_copper"));
        registerVanillaVariant(Reference.UnlocalizedName.WEATHERED_CUT_COPPER_GLOWING, Blocks.WEATHERED_CUT_COPPER, "pickaxe", ResourceLocation.withDefaultNamespace("block/weathered_cut_copper"));
        registerVanillaVariant(Reference.UnlocalizedName.WHITE_CONCRETE_GLOWING, Blocks.WHITE_CONCRETE, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/white_concrete"));
        registerVanillaVariant(Reference.UnlocalizedName.WHITE_TERRACOTTA_GLOWING, Blocks.WHITE_TERRACOTTA, "pickaxe", ResourceLocation.fromNamespaceAndPath("minecraft", "block/white_terracotta"));
        registerVanillaVariant(Reference.UnlocalizedName.WHITE_WOOL_GLOWING, Blocks.WHITE_WOOL, Reference.ToolTypeNames.NONE, ResourceLocation.fromNamespaceAndPath("minecraft", "block/white_wool"));
        registerVanillaVariant(Reference.UnlocalizedName.YELLOW_CONCRETE_GLOWING, Blocks.YELLOW_CONCRETE, Reference.ToolTypeNames.PICKAXE, ResourceLocation.fromNamespaceAndPath("minecraft", "block/yellow_concrete"));
        registerVanillaVariant(Reference.UnlocalizedName.YELLOW_TERRACOTTA_GLOWING, Blocks.YELLOW_TERRACOTTA, Reference.ToolTypeNames.PICKAXE, ResourceLocation.fromNamespaceAndPath("minecraft", "block/yellow_terracotta"));
        registerVanillaVariant(Reference.UnlocalizedName.YELLOW_WOOL_GLOWING, Blocks.YELLOW_WOOL, Reference.ToolTypeNames.NONE, ResourceLocation.fromNamespaceAndPath("minecraft", "block/yellow_wool"));

        registerVanillaGlowingGlassVariant(Reference.UnlocalizedName.GLASS_GLOWING, Blocks.GLASS,
                () -> new TransparentBlock(glowingGlassProperties(Blocks.GLASS)), ResourceLocation.withDefaultNamespace("block/glass"));
        registerVanillaGlowingGlassVariant(Reference.UnlocalizedName.TINTED_GLASS_GLOWING, Blocks.TINTED_GLASS,
                () -> new TintedGlassBlock(glowingGlassProperties(Blocks.TINTED_GLASS)), ResourceLocation.withDefaultNamespace("block/tinted_glass"));
        registerVanillaGlowingStainedGlassVariant(Reference.UnlocalizedName.BLACK_STAINED_GLASS_GLOWING, Blocks.BLACK_STAINED_GLASS, DyeColor.BLACK);
        registerVanillaGlowingStainedGlassVariant(Reference.UnlocalizedName.BLUE_STAINED_GLASS_GLOWING, Blocks.BLUE_STAINED_GLASS, DyeColor.BLUE);
        registerVanillaGlowingStainedGlassVariant(Reference.UnlocalizedName.BROWN_STAINED_GLASS_GLOWING, Blocks.BROWN_STAINED_GLASS, DyeColor.BROWN);
        registerVanillaGlowingStainedGlassVariant(Reference.UnlocalizedName.CYAN_STAINED_GLASS_GLOWING, Blocks.CYAN_STAINED_GLASS, DyeColor.CYAN);
        registerVanillaGlowingStainedGlassVariant(Reference.UnlocalizedName.GRAY_STAINED_GLASS_GLOWING, Blocks.GRAY_STAINED_GLASS, DyeColor.GRAY);
        registerVanillaGlowingStainedGlassVariant(Reference.UnlocalizedName.GREEN_STAINED_GLASS_GLOWING, Blocks.GREEN_STAINED_GLASS, DyeColor.GREEN);
        registerVanillaGlowingStainedGlassVariant(Reference.UnlocalizedName.LIGHT_BLUE_STAINED_GLASS_GLOWING, Blocks.LIGHT_BLUE_STAINED_GLASS, DyeColor.LIGHT_BLUE);
        registerVanillaGlowingStainedGlassVariant(Reference.UnlocalizedName.LIGHT_GRAY_STAINED_GLASS_GLOWING, Blocks.LIGHT_GRAY_STAINED_GLASS, DyeColor.LIGHT_GRAY);
        registerVanillaGlowingStainedGlassVariant(Reference.UnlocalizedName.LIME_STAINED_GLASS_GLOWING, Blocks.LIME_STAINED_GLASS, DyeColor.LIME);
        registerVanillaGlowingStainedGlassVariant(Reference.UnlocalizedName.MAGENTA_STAINED_GLASS_GLOWING, Blocks.MAGENTA_STAINED_GLASS, DyeColor.MAGENTA);
        registerVanillaGlowingStainedGlassVariant(Reference.UnlocalizedName.ORANGE_STAINED_GLASS_GLOWING, Blocks.ORANGE_STAINED_GLASS, DyeColor.ORANGE);
        registerVanillaGlowingStainedGlassVariant(Reference.UnlocalizedName.PINK_STAINED_GLASS_GLOWING, Blocks.PINK_STAINED_GLASS, DyeColor.PINK);
        registerVanillaGlowingStainedGlassVariant(Reference.UnlocalizedName.PURPLE_STAINED_GLASS_GLOWING, Blocks.PURPLE_STAINED_GLASS, DyeColor.PURPLE);
        registerVanillaGlowingStainedGlassVariant(Reference.UnlocalizedName.RED_STAINED_GLASS_GLOWING, Blocks.RED_STAINED_GLASS, DyeColor.RED);
        registerVanillaGlowingStainedGlassVariant(Reference.UnlocalizedName.WHITE_STAINED_GLASS_GLOWING, Blocks.WHITE_STAINED_GLASS, DyeColor.WHITE);
        registerVanillaGlowingStainedGlassVariant(Reference.UnlocalizedName.YELLOW_STAINED_GLASS_GLOWING, Blocks.YELLOW_STAINED_GLASS, DyeColor.YELLOW);

        //region Minecraft 1.21
        registerVanillaVariant(Reference.UnlocalizedName.POLISHED_TUFF_GLOWING,
                Blocks.POLISHED_TUFF,
                Reference.ToolTypeNames.PICKAXE,
                ResourceLocation.fromNamespaceAndPath("minecraft", "block/polished_tuff"));
        registerVanillaVariant(Reference.UnlocalizedName.CHISELED_TUFF_GLOWING,
                Blocks.CHISELED_TUFF, Reference.ToolTypeNames.PICKAXE,
                ResourceLocation.withDefaultNamespace("block/chiseled_tuff"));
        registerVanillaVariant(Reference.UnlocalizedName.TUFF_BRICKS_GLOWING,
                Blocks.TUFF_BRICKS, Reference.ToolTypeNames.PICKAXE,
                ResourceLocation.withDefaultNamespace("block/tuff_bricks"));
        registerVanillaVariant(Reference.UnlocalizedName.CHISELED_TUFF_BRICKS_GLOWING,
                Blocks.CHISELED_TUFF_BRICKS, Reference.ToolTypeNames.PICKAXE,
                ResourceLocation.withDefaultNamespace("block/chiseled_tuff_bricks"));
        registerVanillaVariant(Reference.UnlocalizedName.CHISELED_COPPER_GLOWING, Blocks.CHISELED_COPPER,
                Reference.ToolTypeNames.PICKAXE, ResourceLocation.withDefaultNamespace("block/chiseled_copper"));
        registerVanillaVariant(Reference.UnlocalizedName.EXPOSED_CHISELED_COPPER_GLOWING, Blocks.EXPOSED_CHISELED_COPPER,
                Reference.ToolTypeNames.PICKAXE, ResourceLocation.withDefaultNamespace("block/exposed_chiseled_copper"));
        registerVanillaVariant(Reference.UnlocalizedName.WEATHERED_CHISELED_COPPER_GLOWING, Blocks.WEATHERED_CHISELED_COPPER,
                Reference.ToolTypeNames.PICKAXE, ResourceLocation.withDefaultNamespace("block/weathered_chiseled_copper"));
        registerVanillaVariant(Reference.UnlocalizedName.OXIDIZED_CHISELED_COPPER_GLOWING, Blocks.OXIDIZED_CHISELED_COPPER,
                Reference.ToolTypeNames.PICKAXE, ResourceLocation.withDefaultNamespace("block/oxidized_chiseled_copper"));
        registerVanillaVariant(Reference.UnlocalizedName.WAXED_CHISELED_COPPER_GLOWING, Blocks.WAXED_CHISELED_COPPER,
                Reference.ToolTypeNames.PICKAXE, ResourceLocation.withDefaultNamespace("block/chiseled_copper"));
        registerVanillaVariant(Reference.UnlocalizedName.WAXED_EXPOSED_CHISELED_COPPER_GLOWING, Blocks.WAXED_EXPOSED_CHISELED_COPPER,
                Reference.ToolTypeNames.PICKAXE, ResourceLocation.withDefaultNamespace("block/exposed_chiseled_copper"));
        registerVanillaVariant(Reference.UnlocalizedName.WAXED_WEATHERED_CHISELED_COPPER_GLOWING, Blocks.WAXED_WEATHERED_CHISELED_COPPER,
                Reference.ToolTypeNames.PICKAXE, ResourceLocation.withDefaultNamespace("block/weathered_chiseled_copper"));
        registerVanillaVariant(Reference.UnlocalizedName.WAXED_OXIDIZED_CHISELED_COPPER_GLOWING, Blocks.WAXED_OXIDIZED_CHISELED_COPPER,
                Reference.ToolTypeNames.PICKAXE, ResourceLocation.withDefaultNamespace("block/oxidized_chiseled_copper"));

        registerVanillaGlowingSlabVariant(Reference.UnlocalizedName.SLAB_DIORITE_GLOWING, Blocks.DIORITE_SLAB,
                Reference.ToolTypeNames.PICKAXE, ResourceLocation.withDefaultNamespace("block/diorite"));
        registerVanillaGlowingSlabVariant(Reference.UnlocalizedName.SLAB_POLISHED_DIORITE_GLOWING, Blocks.POLISHED_DIORITE_SLAB,
                Reference.ToolTypeNames.PICKAXE, ResourceLocation.withDefaultNamespace("block/polished_diorite"));
        registerVanillaGlowingSlabVariant(Reference.UnlocalizedName.SLAB_TUFF_GLOWING, Blocks.TUFF_SLAB,
                Reference.ToolTypeNames.PICKAXE, ResourceLocation.withDefaultNamespace("block/tuff"));
        registerVanillaGlowingSlabVariant(Reference.UnlocalizedName.SLAB_POLISHED_TUFF_GLOWING, Blocks.POLISHED_TUFF_SLAB,
                Reference.ToolTypeNames.PICKAXE, ResourceLocation.withDefaultNamespace("block/polished_tuff"));
        registerVanillaGlowingSlabVariant(Reference.UnlocalizedName.SLAB_TUFF_BRICK_GLOWING, Blocks.TUFF_BRICK_SLAB,
                Reference.ToolTypeNames.PICKAXE, ResourceLocation.withDefaultNamespace("block/tuff_bricks"));
        registerTransparentVariant(Reference.UnlocalizedName.COPPER_GRATE_GLOWING,
                Blocks.COPPER_GRATE,
                Reference.ToolTypeNames.PICKAXE,
                ResourceLocation.fromNamespaceAndPath("minecraft", "block/copper_grate"));
        registerTransparentVariant(Reference.UnlocalizedName.EXPOSED_COPPER_GRATE_GLOWING,
                Blocks.EXPOSED_COPPER_GRATE,
                Reference.ToolTypeNames.PICKAXE,
                ResourceLocation.fromNamespaceAndPath("minecraft", "block/exposed_copper_grate"));
        registerTransparentVariant(Reference.UnlocalizedName.WEATHERED_COPPER_GRATE_GLOWING,
                Blocks.WEATHERED_COPPER_GRATE,
                Reference.ToolTypeNames.PICKAXE,
                ResourceLocation.fromNamespaceAndPath("minecraft", "block/weathered_copper_grate"));
        registerTransparentVariant(Reference.UnlocalizedName.OXIDIZED_COPPER_GRATE_GLOWING,
                Blocks.OXIDIZED_COPPER_GRATE,
                Reference.ToolTypeNames.PICKAXE,
                ResourceLocation.fromNamespaceAndPath("minecraft", "block/oxidized_copper_grate"));
        registerTransparentVariant(Reference.UnlocalizedName.WAXED_COPPER_GRATE_GLOWING,
                Blocks.WAXED_COPPER_GRATE,
                Reference.ToolTypeNames.PICKAXE,
                ResourceLocation.fromNamespaceAndPath("minecraft", "block/copper_grate"));
        registerTransparentVariant(Reference.UnlocalizedName.WAXED_EXPOSED_COPPER_GRATE_GLOWING,
                Blocks.WAXED_EXPOSED_COPPER_GRATE,
                Reference.ToolTypeNames.PICKAXE,
                ResourceLocation.fromNamespaceAndPath("minecraft", "block/exposed_copper_grate"));
        registerTransparentVariant(Reference.UnlocalizedName.WAXED_WEATHERED_COPPER_GRATE_GLOWING,
                Blocks.WAXED_WEATHERED_COPPER_GRATE,
                Reference.ToolTypeNames.PICKAXE,
                ResourceLocation.fromNamespaceAndPath("minecraft", "block/weathered_copper_grate"));
        registerTransparentVariant(Reference.UnlocalizedName.WAXED_OXIDIZED_COPPER_GRATE_GLOWING,
                Blocks.WAXED_OXIDIZED_COPPER_GRATE,
                Reference.ToolTypeNames.PICKAXE,
                ResourceLocation.fromNamespaceAndPath("minecraft", "block/oxidized_copper_grate"));
        //endregion

    }


    private static void registerVanillaVariant(String name, Block block, String toolType, ResourceLocation modelLocation, ResourceLocation customDoorTexture) {
        registerVanillaGlowingBlockVariant(name, block, toolType, modelLocation);
        registerVanillaDoorBlockVariant(name.replaceAll("glowing", "door"), block, toolType, customDoorTexture);
    }

    private static void registerVanillaVariant(String name, Block block, Reference.ToolTypeNames toolType, ResourceLocation modelLocation) {
        registerVanillaVariant(name, block, toolType.toString(), modelLocation);
    }

    private static void registerVanillaVariant(String name, Block block, String toolType, ResourceLocation modelLocation) {
        registerVanillaGlowingBlockVariant(name, block, toolType, modelLocation);
        registerVanillaDoorBlockVariant(name.replaceAll("glowing", "door"), block, toolType, modelLocation);
    }

    private static void registerTransparentVariant(String name, Block block, Reference.ToolTypeNames toolType, ResourceLocation modelLocation) {
        registerTransparentGlowingBlockVariant(name, block, toolType.toString(), modelLocation);
        registerVanillaDoorBlockVariant(name.replaceAll("glowing", "door"), block, toolType.toString(), modelLocation);
    }

    private static BlockBehaviour.Properties glowingGlassProperties(Block block) {
        return BlockBehaviour.Properties.ofFullCopy(block).lightLevel(state -> 15);
    }

    private static void registerVanillaGlowingStainedGlassVariant(String name, Block block, DyeColor color) {
        registerVanillaGlowingGlassVariant(name, block,
                () -> new StainedGlassBlock(color, glowingGlassProperties(block)),
                BuiltInRegistries.BLOCK.getKey(block).withPrefix("block/"));
    }

    private static void registerVanillaGlowingGlassVariant(String name, Block block, Supplier<Block> factory,
                                                            ResourceLocation modelLocation) {
        DeferredBlock<Block> glowingGlassBlock = registerBlock(name, factory);
        GLOWING_GLASS_BLOCKS.put(name, glowingGlassBlock);
        GLOWING_GLASS_BLOCKS_RECIPE_MAP.put(glowingGlassBlock, block);
        GLOWING_GLASS_BLOCKS_STATE_MAP.put(glowingGlassBlock, modelLocation);

        Reference.LocalizedNames.GLOWING_BLOCKS_EN_US.put(
                String.format("block.%s", glowingGlassBlock.getId().toString().replace(":", ".")),
                WordUtils.capitalize(name.replace("_", " ").replace("glowing", "(Glowing)"))
        );

        registerVanillaDoorBlockVariant(name.replaceAll("glowing", "door"), block, "none", modelLocation);
    }

    private static void registerCarpetStairVariant(String name, Block block, Reference.ToolTypeNames toolType, ResourceLocation modelLocation) {

        // For each color replicate the name as a new carpet and partial carpet stair block.
        ColorUtils.getColorNames().forEach(color -> {
            String fullCarpetName = name.concat("_").concat(color);
            String partialCarpetName = name.concat("_partial_").concat(color);

            DeferredBlock<Block> STAIR_CARPET_BLOCK = registerBlock(
                    fullCarpetName,
                    () -> new CarpetStairBlock(block.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(block))
            );

            DeferredBlock<Block> STAIR_PARTIAL_CARPET_BLOCK = registerBlock(
                    partialCarpetName,
                    () -> new CarpetStairBlock(block.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(block))
            );

            CARPET_STAIR_BLOCKS.put(fullCarpetName, STAIR_CARPET_BLOCK);
            CARPET_PARTIAL_STAIR_BLOCKS.put(partialCarpetName, STAIR_PARTIAL_CARPET_BLOCK);

            HashMap<String, Block> ingredientMap = new HashMap<>();
            ingredientMap.put("baseBlock", block);
            ingredientMap.put("carpet", ColorUtils.getCarpetBlockByColor(color));

            CARPET_STAIR_BLOCKS_RECIPE_MAP.put(STAIR_CARPET_BLOCK, ingredientMap);
            CARPET_PARTIAL_STAIR_BLOCKS_RECIPE_MAP.put(STAIR_PARTIAL_CARPET_BLOCK, ingredientMap);

            // Add to the respective mineable tag.
            switch(toolType) {
                case AXE -> {
                    BLOCKS_MINEABLE_AXE.put(fullCarpetName, STAIR_CARPET_BLOCK);
                    BLOCKS_MINEABLE_AXE.put(partialCarpetName, STAIR_PARTIAL_CARPET_BLOCK);
                }
                case PICKAXE -> {
                    BLOCKS_MINEABLE_PICKAXE.put(fullCarpetName, STAIR_CARPET_BLOCK);

                    BLOCKS_MINEABLE_PICKAXE.put(partialCarpetName, STAIR_PARTIAL_CARPET_BLOCK);
                }
            }

            CARPET_STAIR_BLOCKS_STATE_MAP.put(STAIR_CARPET_BLOCK, STAIR_CARPET_BLOCK.getId());
            CARPET_PARTIAL_STAIR_BLOCKS_STATE_MAP.put(STAIR_PARTIAL_CARPET_BLOCK, STAIR_PARTIAL_CARPET_BLOCK.getId());

            String baseName = name.replace("stairs_", "")
                    .replace("_", " ")
                    .replace(" carpet", "")
                    .replace(color, "");

            String enCarpetname = String.format("%s Carpet %s Stairs", color, baseName);
            String enPartialCarpetName = String.format("%s Carpet %s Stairs (Partial)", color, baseName);

            // Add to the lang data generation list.
            Reference.LocalizedNames.BLOCKS_EN_US.put(
                    String.format("block.%s", STAIR_CARPET_BLOCK.getId().toString().replace(":", ".")),
                    WordUtils.capitalize(enCarpetname)
            );

            Reference.LocalizedNames.BLOCKS_EN_US.put(
                    String.format("block.%s", STAIR_PARTIAL_CARPET_BLOCK.getId().toString().replace(":", ".")),
                    WordUtils.capitalize(enPartialCarpetName)
            );

        });

    }

    /**
     * Registration of Glowing Variants for Vanilla Stairs. Includes handling of BlockState, Block Model, Item Model, Recipe, and Lang files.
     *
     * @param name String of unlocalized registry name.
     * @param block Block to be cloned as a Glowing Block
     * @param toolType ToolTypeNames of the tool needed to loot.
     * @param modelLocation ResourceLocation of the model to clone from.
     */
    private static void registerVanillaGlowingStairVariant(String name, Block block, Reference.@NotNull ToolTypeNames toolType, ResourceLocation modelLocation) {
        DeferredBlock<Block> GLOWING_STAIR_BLOCK = registerBlock(name,
                () -> new GlowingStairBlock(block.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(block))
        );

        GLOWING_STAIR_BLOCKS.put(name, GLOWING_STAIR_BLOCK);

        GLOWING_STAIR_BLOCKS_RECIPE_MAP.put(GLOWING_STAIR_BLOCK, block);

        // Add to the respective mineable tag.
        switch(toolType) {
            case AXE -> BLOCKS_MINEABLE_AXE.put(name, GLOWING_STAIR_BLOCK);
            case PICKAXE -> BLOCKS_MINEABLE_PICKAXE.put(name, GLOWING_STAIR_BLOCK);
        }

        GLOWING_STAIR_BLOCKS_STATE_MAP.put(GLOWING_STAIR_BLOCK, modelLocation);

        // Add to the lang data generation list.
        Reference.LocalizedNames.GLOWING_BLOCKS_EN_US.put(
                String.format("block.%s", GLOWING_STAIR_BLOCK.getId().toString().replace(":", ".")),
                WordUtils.capitalize(
                        name.replace("stairs_", "")
                                .replace("_", " ")
                                .replace("glowing", "Stairs (Glowing)")
                )
        );

    }

    private static void registerVanillaGlowingSlabVariant(String name, Block block,
                                                           Reference.@NotNull ToolTypeNames toolType,
                                                           ResourceLocation modelLocation) {
        DeferredBlock<Block> glowingSlabBlock = registerBlock(name,
                () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(block).lightLevel(state -> 15))
        );

        GLOWING_SLAB_BLOCKS.put(name, glowingSlabBlock);
        GLOWING_SLAB_BLOCKS_RECIPE_MAP.put(glowingSlabBlock, block);
        GLOWING_SLAB_BLOCKS_STATE_MAP.put(glowingSlabBlock, modelLocation);

        switch (toolType) {
            case AXE -> BLOCKS_MINEABLE_AXE.put(name, glowingSlabBlock);
            case PICKAXE -> BLOCKS_MINEABLE_PICKAXE.put(name, glowingSlabBlock);
        }

        Reference.LocalizedNames.GLOWING_BLOCKS_EN_US.put(
                String.format("block.%s", glowingSlabBlock.getId().toString().replace(":", ".")),
                WordUtils.capitalize(name.replace("slab_", "")
                        .replace("_", " ")
                        .replace("glowing", "Slab (Glowing)"))
        );
    }

    private static void registerVanillaGlowingBlockVariant(String name, Block block, @NotNull String toolType, ResourceLocation modelLocation) {
        // Set block type for the doors based on tool type.
        BlockSetType blockSetType = toolType.equals("axe") ? BlockSetType.OAK : BlockSetType.STONE;

        // Glowing Block Variant Registration
        DeferredBlock<Block> GLOWING_BLOCK = registerBlock(name,
                () -> new Block(BlockBehaviour.Properties.ofFullCopy(block).lightLevel((p_50874_) -> 15))
        );

        GLOWING_BLOCKS.put(name, GLOWING_BLOCK);
        GLOWING_BLOCKS_RECIPE_MAP.put(GLOWING_BLOCK, block);

        if (toolType.equals("axe")) {
            BLOCKS_MINEABLE_AXE.put(name, GLOWING_BLOCK);
        } else if (toolType.equals("pickaxe")) {
            BLOCKS_MINEABLE_PICKAXE.put(name, GLOWING_BLOCK);
        }

        GLOWING_BLOCK_STATE_MAP.put(GLOWING_BLOCK, modelLocation);
        Reference.LocalizedNames.GLOWING_BLOCKS_EN_US.put(
                String.format("block.%s", GLOWING_BLOCK.getId().toString().replace(":", ".")),
                WordUtils.capitalize(
                        name.replace("_", " ")
                                .replace("glowing", "(Glowing)")
                )
        );

    }

    private static void registerTransparentGlowingBlockVariant(String name, Block block, @NotNull String toolType, ResourceLocation modelLocation) {
        // Glowing Transparent Block Variant Registration
        DeferredBlock<Block> GLOWING_TRANSPARENT_BLOCK = registerBlock(name,
                () -> new Block(BlockBehaviour.Properties.ofFullCopy(block).lightLevel((p_50874_) -> 15))
        );

        // Add the block to the loot table data-gen.
        GLOWING_TRANSPARENT_BLOCKS.put(name, GLOWING_TRANSPARENT_BLOCK);
        // Add the block to the recipe data-gen.
        GLOWING_TRANSPARENT_BLOCKS_RECIPE_MAP.put(GLOWING_TRANSPARENT_BLOCK, block);
        // Add the block to the blockstate data-gen.
        GLOWING_TRANSPARENT_BLOCKS_STATE_MAP.put(GLOWING_TRANSPARENT_BLOCK, modelLocation);

        // Used for building the mineable tag list based on tool type.
        if (toolType.equals("axe")) {
            BLOCKS_MINEABLE_AXE.put(name, GLOWING_TRANSPARENT_BLOCK);
        } else if (toolType.equals("pickaxe")) {
            BLOCKS_MINEABLE_PICKAXE.put(name, GLOWING_TRANSPARENT_BLOCK);
        }

        // Add the block to the lang data-gen.
        Reference.LocalizedNames.GLOWING_BLOCKS_EN_US.put(
                String.format("block.%s", GLOWING_TRANSPARENT_BLOCK.getId().toString().replace(":", ".")),
                WordUtils.capitalize(
                        name.replace("_", " ")
                                .replace("glowing", "(Glowing)")
                )
        );

    }

    private static void registerVanillaDoorBlockVariant(String name, Block block, String toolType, ResourceLocation modelLocation) {
        // Set block type for the doors based on tool type.
        BlockSetType blockSetType = toolType.equals("axe") ? BlockSetType.OAK : BlockSetType.STONE;

        // Door Block Variant Registration
        DeferredBlock<Block> DOOR_BLOCK = registerBlock(name,
                () -> new HiddenDoorBlock(blockSetType, BlockBehaviour.Properties.ofFullCopy(block))
        );

        HIDDEN_DOOR_BLOCKS.put(name, DOOR_BLOCK);

        HIDDEN_DOOR_BLOCKS_RECIPE_MAP.put(DOOR_BLOCK, block);

        if (toolType.equals("axe")) {
            BLOCKS_MINEABLE_AXE.put(name, DOOR_BLOCK);
        } else if (toolType.equals("pickaxe")) {
            BLOCKS_MINEABLE_PICKAXE.put(name, DOOR_BLOCK);
        }

        HIDDEN_DOOR_VANILLA_BLOCK_STATE_MAP.put(DOOR_BLOCK, modelLocation);

        Reference.LocalizedNames.DOORS_EN_US.put(
                String.format("block.%s", DOOR_BLOCK.getId().toString().replace(":", ".")),
                WordUtils.capitalize(name.replace("_", " ")));
    }

    private static DeferredBlock<Block> registerBlock(String name, Supplier<Block> block) {
        DeferredBlock<Block> registryObject = BLOCKS.register(name, block);
        if (!excludeBlockItemRegistry(registryObject.getId())) {
            registerBlockItem(name, registryObject);
        }
        return registryObject;
    }

    private static void registerBlockItem(String unlocalizedName, DeferredBlock<Block> blockRegistryObject) {
        GrowthcraftDecoItems.ITEMS.register(unlocalizedName, () -> new BlockItem(blockRegistryObject.get(), getDefaultItemProperties()));
    }

    private static Item.Properties getDefaultItemProperties() {
        return new Item.Properties();
    }

    public static boolean excludeBlockItemRegistry(ResourceLocation registryName) {
        ArrayList<String> excludeBlocks = new ArrayList<>();
        //excludeBlocks.add(Reference.MODID + ":" + Reference.UnlocalizedName.APPLE_TREE_FRUIT);
        return excludeBlocks.contains(registryName.toString());
    }

    private GrowthcraftDecoBlocks() {
        // Prevent instantiation of default public constructor.
    }

}
