package growthcraft.deco.init;

import growthcraft.deco.block.*;
import growthcraft.deco.shared.Reference;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.apache.commons.lang3.text.WordUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Supplier;

public class GrowthcraftDecoBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Reference.MODID);

    public static HashMap<String, RegistryObject<Block>>  GLOWING_STAIR_BLOCKS = new HashMap<>();
    public static HashMap<String, RegistryObject<Block>> CARPET_STAIRS_BLOCKS = new HashMap<>();
    public static HashMap<String, RegistryObject<Block>> GLOWING_VANILLA_BLOCKS = new HashMap<>();
    public static HashMap<String, RegistryObject<Block>> HIDDEN_DOOR_BLOCKS = new HashMap<>();


    public static HashMap<RegistryObject<Block>, Block> GLOWING_STAIR_BLOCKS_RECIPE_MAP = new HashMap<>();
    public static HashMap<RegistryObject<Block>, Block> GLOWING_BLOCKS_RECIPE_MAP = new HashMap<>();
    public static HashMap<RegistryObject<Block>, Block> HIDDEN_DOOR_BLOCKS_RECIPE_MAP = new HashMap<>();


    public static HashMap<RegistryObject<Block>, ResourceLocation> GLOWING_STAIR_BLOCKS_STATE_MAP = new HashMap<>();
    public static HashMap<RegistryObject<Block>, ResourceLocation> GLOWING_VANILLA_BLOCK_STATE_MAP = new HashMap<>();
    public static HashMap<RegistryObject<Block>, ResourceLocation> HIDDEN_DOOR_VANILLA_BLOCK_STATE_MAP = new HashMap<>();

    /**
     * ToolType Mineable Tag Data Generation.
     */
    public static HashMap<String, RegistryObject<Block>> BLOCKS_MINEABLE_AXE = new HashMap<>();
    public static HashMap<String, RegistryObject<Block>> BLOCKS_MINEABLE_PICKAXE = new HashMap<>();

    public static final RegistryObject<Block> STAIRS_CONCRETE_BLACK = registerBlock(
            Reference.UnlocalizedName.STAIRS_CONCRETE_BLACK,
            ConcreteStairBlock::new
    );
    public static final RegistryObject<Block> STAIRS_CONCRETE_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIRS_CONCRETE_BLUE,
            ConcreteStairBlock::new
    );
    public static final RegistryObject<Block> STAIRS_CONCRETE_BROWN = registerBlock(
            Reference.UnlocalizedName.STAIRS_CONCRETE_BROWN,
            ConcreteStairBlock::new
    );
    public static final RegistryObject<Block> STAIRS_CONCRETE_CYAN = registerBlock(
            Reference.UnlocalizedName.STAIRS_CONCRETE_CYAN,
            ConcreteStairBlock::new
    );
    public static final RegistryObject<Block> STAIRS_CONCRETE_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIRS_CONCRETE_GRAY,
            ConcreteStairBlock::new
    );
    public static final RegistryObject<Block> STAIRS_CONCRETE_GREEN = registerBlock(
            Reference.UnlocalizedName.STAIRS_CONCRETE_GREEN,
            ConcreteStairBlock::new
    );
    public static final RegistryObject<Block> STAIRS_CONCRETE_LIGHT_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIRS_CONCRETE_LIGHT_BLUE,
            ConcreteStairBlock::new
    );
    public static final RegistryObject<Block> STAIRS_CONCRETE_LIGHT_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIRS_CONCRETE_LIGHT_GRAY,
            ConcreteStairBlock::new
    );
    public static final RegistryObject<Block> STAIRS_CONCRETE_LIME = registerBlock(
            Reference.UnlocalizedName.STAIRS_CONCRETE_LIME,
            ConcreteStairBlock::new
    );
    public static final RegistryObject<Block> STAIRS_CONCRETE_MAGENTA = registerBlock(
            Reference.UnlocalizedName.STAIRS_CONCRETE_MAGENTA,
            ConcreteStairBlock::new
    );
    public static final RegistryObject<Block> STAIRS_CONCRETE_ORANGE = registerBlock(
            Reference.UnlocalizedName.STAIRS_CONCRETE_ORANGE,
            ConcreteStairBlock::new
    );
    public static final RegistryObject<Block> STAIRS_CONCRETE_PINK = registerBlock(
            Reference.UnlocalizedName.STAIRS_CONCRETE_PINK,
            ConcreteStairBlock::new
    );
    public static final RegistryObject<Block> STAIRS_CONCRETE_PURPLE = registerBlock(
            Reference.UnlocalizedName.STAIRS_CONCRETE_PURPLE,
            ConcreteStairBlock::new
    );
    public static final RegistryObject<Block> STAIRS_CONCRETE_RED = registerBlock(
            Reference.UnlocalizedName.STAIRS_CONCRETE_RED,
            ConcreteStairBlock::new
    );
    public static final RegistryObject<Block> STAIRS_CONCRETE_WHITE = registerBlock(
            Reference.UnlocalizedName.STAIRS_CONCRETE_WHITE,
            ConcreteStairBlock::new
    );
    public static final RegistryObject<Block> STAIRS_CONCRETE_YELLOW = registerBlock(
            Reference.UnlocalizedName.STAIRS_CONCRETE_YELLOW,
            ConcreteStairBlock::new
    );

    public static final RegistryObject<Block> GLASS_STAINED_BLACK_PANE_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANE_BLACK_GLOWING,
            () -> new GlassPane(DyeColor.BLACK)
    );

    public static final RegistryObject<Block> GLASS_PANEL_BLACK = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_BLACK,
            GlassPanel::new
    );

    public static final RegistryObject<Block> GLASS_PANEL_BLACK_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_BLACK_GLOWING,
            () -> new GlassPanel(15)
    );

    public static final RegistryObject<Block> GLASS_STAINED_BLUE_PANE_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANE_BLUE_GLOWING,
            () -> new GlassPane(DyeColor.BLUE)
    );

    public static final RegistryObject<Block> GLASS_PANEL_BLUE = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_BLUE,
            GlassPanel::new
    );
    public static final RegistryObject<Block> GLASS_PANEL_BLUE_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_BLUE_GLOWING,
            () -> new GlassPanel(15)
    );
    public static final RegistryObject<Block> GLASS_STAINED_BROWN_PANE_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANE_BROWN_GLOWING,
            () -> new GlassPane(DyeColor.BROWN)
    );
    public static final RegistryObject<Block> GLASS_PANEL_BROWN = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_BROWN,
            GlassPanel::new
    );
    public static final RegistryObject<Block> GLASS_PANEL_BROWN_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_BROWN_GLOWING,
            () -> new GlassPanel(15)
    );
    public static final RegistryObject<Block> GLASS_STAINED_CLEAR_PANE_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANE_CLEAR_GLOWING,
            () -> new GlassPane(DyeColor.WHITE)
    );
    public static final RegistryObject<Block> GLASS_PANEL_CLEAR = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_CLEAR,
            GlassPanel::new
    );
    public static final RegistryObject<Block> GLASS_PANEL_CLEAR_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_CLEAR_GLOWING,
            () -> new GlassPanel(15)
    );
    public static final RegistryObject<Block> GLASS_STAINED_CYAN_PANE_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANE_CYAN_GLOWING,
            () -> new GlassPane(DyeColor.CYAN)
    );
    public static final RegistryObject<Block> GLASS_PANEL_CYAN = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_CYAN,
            GlassPanel::new
    );
    public static final RegistryObject<Block> GLASS_PANEL_CYAN_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_CYAN_GLOWING,
            () -> new GlassPanel(15)
    );
    public static final RegistryObject<Block> GLASS_STAINED_GRAY_PANE_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANE_GRAY_GLOWING,
            () -> new GlassPane(DyeColor.GRAY)
    );
    public static final RegistryObject<Block> GLASS_PANEL_GRAY = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_GRAY,
            GlassPanel::new
    );
    public static final RegistryObject<Block> GLASS_PANEL_GRAY_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_GRAY_GLOWING,
            () -> new GlassPanel(15)
    );
    public static final RegistryObject<Block> GLASS_STAINED_GREEN_PANE_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANE_GREEN_GLOWING,
            () -> new GlassPane(DyeColor.GREEN)
    );
    public static final RegistryObject<Block> GLASS_PANEL_GREEN = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_GREEN,
            GlassPanel::new
    );
    public static final RegistryObject<Block> GLASS_PANEL_GREEN_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_GREEN_GLOWING,
            () -> new GlassPanel(15)
    );
    public static final RegistryObject<Block> GLASS_STAINED_LIGHT_BLUE_PANE_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANE_LIGHT_BLUE_GLOWING,
            () -> new GlassPane(DyeColor.LIGHT_BLUE)
    );
    public static final RegistryObject<Block> GLASS_PANEL_LIGHT_BLUE = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_LIGHT_BLUE,
            GlassPanel::new
    );
    public static final RegistryObject<Block> GLASS_PANEL_LIGHT_BLUE_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_LIGHT_BLUE_GLOWING,
            () -> new GlassPanel(15)
    );
    public static final RegistryObject<Block> GLASS_STAINED_LIGHT_GRAY_PANE_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANE_LIGHT_GRAY_GLOWING,
            () -> new GlassPane(DyeColor.LIGHT_GRAY)
    );
    public static final RegistryObject<Block> GLASS_PANEL_LIGHT_GRAY = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_LIGHT_GRAY,
            GlassPanel::new
    );
    public static final RegistryObject<Block> GLASS_PANEL_LIGHT_GRAY_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_LIGHT_GRAY_GLOWING,
            () -> new GlassPanel(15)
    );
    public static final RegistryObject<Block> GLASS_STAINED_LIME_PANE_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANE_LIME_GLOWING,
            () -> new GlassPane(DyeColor.LIME)
    );
    public static final RegistryObject<Block> GLASS_PANEL_LIME = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_LIME,
            GlassPanel::new
    );
    public static final RegistryObject<Block> GLASS_PANEL_LIME_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_LIME_GLOWING,
            () -> new GlassPanel(15)
    );
    public static final RegistryObject<Block> GLASS_STAINED_MAGENTA_PANE_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANE_MAGENTA_GLOWING,
            () -> new GlassPane(DyeColor.MAGENTA)
    );
    public static final RegistryObject<Block> GLASS_PANEL_MAGENTA = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_MAGENTA,
            GlassPanel::new
    );
    public static final RegistryObject<Block> GLASS_PANEL_MAGENTA_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_MAGENTA_GLOWING,
            () -> new GlassPanel(15)
    );
    public static final RegistryObject<Block> GLASS_STAINED_ORANGE_PANE_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANE_ORANGE_GLOWING,
            () -> new GlassPane(DyeColor.ORANGE)
    );
    public static final RegistryObject<Block> GLASS_PANEL_ORANGE = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_ORANGE,
            GlassPanel::new
    );
    public static final RegistryObject<Block> GLASS_PANEL_ORANGE_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_ORANGE_GLOWING,
            () -> new GlassPanel(15)
    );
    public static final RegistryObject<Block> GLASS_STAINED_PINK_PANE_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANE_PINK_GLOWING,
            () -> new GlassPane(DyeColor.PINK)
    );
    public static final RegistryObject<Block> GLASS_PANEL_PINK = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_PINK,
            GlassPanel::new
    );
    public static final RegistryObject<Block> GLASS_PANEL_PINK_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_PINK_GLOWING,
            () -> new GlassPanel(15)
    );
    public static final RegistryObject<Block> GLASS_STAINED_PURPLE_PANE_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANE_PURPLE_GLOWING,
            () -> new GlassPane(DyeColor.PURPLE)
    );
    public static final RegistryObject<Block> GLASS_PANEL_PURPLE = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_PURPLE,
            GlassPanel::new
    );
    public static final RegistryObject<Block> GLASS_PANEL_PURPLE_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_PURPLE_GLOWING,
            () -> new GlassPanel(15)
    );
    public static final RegistryObject<Block> GLASS_STAINED_RED_PANE_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANE_RED_GLOWING,
            () -> new GlassPane(DyeColor.RED)
    );
    public static final RegistryObject<Block> GLASS_PANEL_RED = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_RED,
            GlassPanel::new
    );
    public static final RegistryObject<Block> GLASS_PANEL_RED_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_RED_GLOWING,
            () -> new GlassPanel(15)
    );
    public static final RegistryObject<Block> GLASS_STAINED_WHITE_PANE_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANE_WHITE_GLOWING,
            () -> new GlassPane(DyeColor.WHITE)
    );
    public static final RegistryObject<Block> GLASS_PANEL_WHITE = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_WHITE,
            GlassPanel::new
    );
    public static final RegistryObject<Block> GLASS_PANEL_WHITE_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_WHITE_GLOWING,
            () -> new GlassPanel(15)
    );
    public static final RegistryObject<Block> GLASS_STAINED_YELLOW_PANE_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANE_YELLOW_GLOWING,
            () -> new GlassPane(DyeColor.YELLOW)
    );
    public static final RegistryObject<Block> GLASS_PANEL_YELLOW = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_YELLOW,
            GlassPanel::new
    );
    public static final RegistryObject<Block> GLASS_PANEL_YELLOW_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_YELLOW_GLOWING,
            () -> new GlassPanel(15)
    );
    public static final RegistryObject<Block> PANEL_GLOWSHROOM = registerBlock(
            Reference.UnlocalizedName.PANEL_GLOWSHROOM,
            OrganicPanel::new
    );
    public static final RegistryObject<Block> PANEL_GLOWSTONE = registerBlock(
            Reference.UnlocalizedName.PANEL_GLOWSTONE,
            GlassPanel::new
    );
    public static final RegistryObject<Block> SLAB_GLASS_BLACK = registerBlock(
            Reference.UnlocalizedName.SLAB_GLASS_BLACK,
            GlassHalfBlock::new
    );
    public static final RegistryObject<Block> SLAB_GLASS_BLACK_GLOWING = registerBlock(
            Reference.UnlocalizedName.SLAB_GLASS_BLACK_GLOWING,
            () -> new GlassHalfBlock(15)
    );
    public static final RegistryObject<Block> SLAB_GLASS_BLUE = registerBlock(
            Reference.UnlocalizedName.SLAB_GLASS_BLUE,
            GlassHalfBlock::new
    );
    public static final RegistryObject<Block> SLAB_GLASS_BLUE_GLOWING = registerBlock(
            Reference.UnlocalizedName.SLAB_GLASS_BLUE_GLOWING,
            () -> new GlassHalfBlock(15)
    );
    public static final RegistryObject<Block> SLAB_GLASS_BROWN = registerBlock(
            Reference.UnlocalizedName.SLAB_GLASS_BROWN,
            GlassHalfBlock::new
    );
    public static final RegistryObject<Block> SLAB_GLASS_BROWN_GLOWING = registerBlock(
            Reference.UnlocalizedName.SLAB_GLASS_BROWN_GLOWING,
            () -> new GlassHalfBlock(15)
    );
    public static final RegistryObject<Block> SLAB_GLASS_CLEAR = registerBlock(
            Reference.UnlocalizedName.SLAB_GLASS_CLEAR,
            GlassHalfBlock::new
    );
    public static final RegistryObject<Block> SLAB_GLASS_CLEAR_GLOWING = registerBlock(
            Reference.UnlocalizedName.SLAB_GLASS_CLEAR_GLOWING,
            () -> new GlassHalfBlock(15)
    );
    public static final RegistryObject<Block> SLAB_GLASS_CYAN = registerBlock(
            Reference.UnlocalizedName.SLAB_GLASS_CYAN,
            GlassHalfBlock::new
    );
    public static final RegistryObject<Block> SLAB_GLASS_CYAN_GLOWING = registerBlock(
            Reference.UnlocalizedName.SLAB_GLASS_CYAN_GLOWING,
            () -> new GlassHalfBlock(15)
    );
    public static final RegistryObject<Block> SLAB_GLASS_GRAY = registerBlock(
            Reference.UnlocalizedName.SLAB_GLASS_GRAY,
            GlassHalfBlock::new
    );
    public static final RegistryObject<Block> SLAB_GLASS_GRAY_GLOWING = registerBlock(
            Reference.UnlocalizedName.SLAB_GLASS_GRAY_GLOWING,
            () -> new GlassHalfBlock(15)
    );
    public static final RegistryObject<Block> SLAB_GLASS_GREEN = registerBlock(
            Reference.UnlocalizedName.SLAB_GLASS_GREEN,
            GlassHalfBlock::new
    );
    public static final RegistryObject<Block> SLAB_GLASS_GREEN_GLOWING = registerBlock(
            Reference.UnlocalizedName.SLAB_GLASS_GREEN_GLOWING,
            () -> new GlassHalfBlock(15)
    );
    public static final RegistryObject<Block> SLAB_GLASS_LIGHT_BLUE = registerBlock(
            Reference.UnlocalizedName.SLAB_GLASS_LIGHT_BLUE,
            GlassHalfBlock::new
    );
    public static final RegistryObject<Block> SLAB_GLASS_LIGHT_BLUE_GLOWING = registerBlock(
            Reference.UnlocalizedName.SLAB_GLASS_LIGHT_BLUE_GLOWING,
            () -> new GlassHalfBlock(15)
    );
    public static final RegistryObject<Block> SLAB_GLASS_LIGHT_GRAY = registerBlock(
            Reference.UnlocalizedName.SLAB_GLASS_LIGHT_GRAY,
            GlassHalfBlock::new
    );
    public static final RegistryObject<Block> SLAB_GLASS_LIGHT_GRAY_GLOWING = registerBlock(
            Reference.UnlocalizedName.SLAB_GLASS_LIGHT_GRAY_GLOWING,
            () -> new GlassHalfBlock(15)
    );
    public static final RegistryObject<Block> SLAB_GLASS_LIME = registerBlock(
            Reference.UnlocalizedName.SLAB_GLASS_LIME,
            GlassHalfBlock::new
    );
    public static final RegistryObject<Block> SLAB_GLASS_LIME_GLOWING = registerBlock(
            Reference.UnlocalizedName.SLAB_GLASS_LIME_GLOWING,
            () -> new GlassHalfBlock(15)
    );
    public static final RegistryObject<Block> SLAB_GLASS_MAGENTA = registerBlock(
            Reference.UnlocalizedName.SLAB_GLASS_MAGENTA,
            GlassHalfBlock::new
    );
    public static final RegistryObject<Block> SLAB_GLASS_MAGENTA_GLOWING = registerBlock(
            Reference.UnlocalizedName.SLAB_GLASS_MAGENTA_GLOWING,
            () -> new GlassHalfBlock(15)
    );
    public static final RegistryObject<Block> SLAB_GLASS_ORANGE = registerBlock(
            Reference.UnlocalizedName.SLAB_GLASS_ORANGE,
            GlassHalfBlock::new
    );
    public static final RegistryObject<Block> SLAB_GLASS_ORANGE_GLOWING = registerBlock(
            Reference.UnlocalizedName.SLAB_GLASS_ORANGE_GLOWING,
            () -> new GlassHalfBlock(15)
    );
    public static final RegistryObject<Block> SLAB_GLASS_PINK = registerBlock(
            Reference.UnlocalizedName.SLAB_GLASS_PINK,
            GlassHalfBlock::new
    );
    public static final RegistryObject<Block> SLAB_GLASS_PINK_GLOWING = registerBlock(
            Reference.UnlocalizedName.SLAB_GLASS_PINK_GLOWING,
            () -> new GlassHalfBlock(15)
    );
    public static final RegistryObject<Block> SLAB_GLASS_PURPLE = registerBlock(
            Reference.UnlocalizedName.SLAB_GLASS_PURPLE,
            GlassHalfBlock::new
    );
    public static final RegistryObject<Block> SLAB_GLASS_PURPLE_GLOWING = registerBlock(
            Reference.UnlocalizedName.SLAB_GLASS_PURPLE_GLOWING,
            () -> new GlassHalfBlock(15)
    );
    public static final RegistryObject<Block> SLAB_GLASS_RED = registerBlock(
            Reference.UnlocalizedName.SLAB_GLASS_RED,
            GlassHalfBlock::new
    );
    public static final RegistryObject<Block> SLAB_GLASS_RED_GLOWING = registerBlock(
            Reference.UnlocalizedName.SLAB_GLASS_RED_GLOWING,
            () -> new GlassHalfBlock(15)
    );
    public static final RegistryObject<Block> SLAB_GLASS_WHITE = registerBlock(
            Reference.UnlocalizedName.SLAB_GLASS_WHITE,
            GlassHalfBlock::new
    );
    public static final RegistryObject<Block> SLAB_GLASS_WHITE_GLOWING = registerBlock(
            Reference.UnlocalizedName.SLAB_GLASS_WHITE_GLOWING,
            () -> new GlassHalfBlock(15)
    );
    public static final RegistryObject<Block> SLAB_GLASS_YELLOW = registerBlock(
            Reference.UnlocalizedName.SLAB_GLASS_YELLOW,
            GlassHalfBlock::new
    );
    public static final RegistryObject<Block> SLAB_GLASS_YELLOW_GLOWING = registerBlock(
            Reference.UnlocalizedName.SLAB_GLASS_YELLOW_GLOWING,
            () -> new GlassHalfBlock(15)
    );
    public static final RegistryObject<Block> SLAB_GLOWSHROOM = registerBlock(
            Reference.UnlocalizedName.SLAB_GLOWSHROOM,
            () -> new OrganicHalfBlock(15)
    );
    public static final RegistryObject<Block> SLAB_GLOWSTONE = registerBlock(
            Reference.UnlocalizedName.SLAB_GLOWSTONE,
            GlassHalfBlock::new
    );
    public static final RegistryObject<Block> STAIR_ACACIA_CARPET_BLACK = registerBlock(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_BLACK,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_ACACIA_CARPET_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_BLUE,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_ACACIA_CARPET_BROWN = registerBlock(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_BROWN,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_ACACIA_CARPET_CYAN = registerBlock(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_CYAN,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_ACACIA_CARPET_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_GRAY,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_ACACIA_CARPET_GREEN = registerBlock(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_GREEN,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_ACACIA_CARPET_LIGHT_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_LIGHT_BLUE,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_ACACIA_CARPET_LIGHT_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_LIGHT_GRAY,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_ACACIA_CARPET_LIME = registerBlock(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_LIME,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_ACACIA_CARPET_MAGENTA = registerBlock(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_MAGENTA,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_ACACIA_CARPET_ORANGE = registerBlock(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_ORANGE,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_ACACIA_CARPET_PARTIAL_BLACK = registerBlock(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_PARTIAL_BLACK,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_ACACIA_CARPET_PARTIAL_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_PARTIAL_BLUE,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_ACACIA_CARPET_PARTIAL_BROWN = registerBlock(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_PARTIAL_BROWN,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_ACACIA_CARPET_PARTIAL_CYAN = registerBlock(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_PARTIAL_CYAN,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_ACACIA_CARPET_PARTIAL_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_PARTIAL_GRAY,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_ACACIA_CARPET_PARTIAL_GREEN = registerBlock(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_PARTIAL_GREEN,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_ACACIA_CARPET_PARTIAL_LIGHT_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_PARTIAL_LIGHT_BLUE,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_ACACIA_CARPET_PARTIAL_LIGHT_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_PARTIAL_LIGHT_GRAY,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_ACACIA_CARPET_PARTIAL_LIME = registerBlock(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_PARTIAL_LIME,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_ACACIA_CARPET_PARTIAL_MAGENTA = registerBlock(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_PARTIAL_MAGENTA,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_ACACIA_CARPET_PARTIAL_ORANGE = registerBlock(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_PARTIAL_ORANGE,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_ACACIA_CARPET_PARTIAL_PINK = registerBlock(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_PARTIAL_PINK,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_ACACIA_CARPET_PARTIAL_PURPLE = registerBlock(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_PARTIAL_PURPLE,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_ACACIA_CARPET_PARTIAL_RED = registerBlock(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_PARTIAL_RED,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_ACACIA_CARPET_PARTIAL_WHITE = registerBlock(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_PARTIAL_WHITE,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_ACACIA_CARPET_PARTIAL_YELLOW = registerBlock(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_PARTIAL_YELLOW,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_ACACIA_CARPET_PINK = registerBlock(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_PINK,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_ACACIA_CARPET_PURPLE = registerBlock(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_PURPLE,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_ACACIA_CARPET_RED = registerBlock(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_RED,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_ACACIA_CARPET_WHITE = registerBlock(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_WHITE,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_ACACIA_CARPET_YELLOW = registerBlock(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_YELLOW,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_BIRCH_CARPET_BLACK = registerBlock(
            Reference.UnlocalizedName.STAIR_BIRCH_CARPET_BLACK,
            () -> new CarpetStairBlock(Blocks.BIRCH_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_BIRCH_CARPET_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIR_BIRCH_CARPET_BLUE,
            () -> new CarpetStairBlock(Blocks.BIRCH_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_BIRCH_CARPET_BROWN = registerBlock(
            Reference.UnlocalizedName.STAIR_BIRCH_CARPET_BROWN,
            () -> new CarpetStairBlock(Blocks.BIRCH_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_BIRCH_CARPET_CYAN = registerBlock(
            Reference.UnlocalizedName.STAIR_BIRCH_CARPET_CYAN,
            () -> new CarpetStairBlock(Blocks.BIRCH_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_BIRCH_CARPET_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIR_BIRCH_CARPET_GRAY,
            () -> new CarpetStairBlock(Blocks.BIRCH_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_BIRCH_CARPET_GREEN = registerBlock(
            Reference.UnlocalizedName.STAIR_BIRCH_CARPET_GREEN,
            () -> new CarpetStairBlock(Blocks.BIRCH_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_BIRCH_CARPET_LIGHT_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIR_BIRCH_CARPET_LIGHT_BLUE,
            () -> new CarpetStairBlock(Blocks.BIRCH_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_BIRCH_CARPET_LIGHT_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIR_BIRCH_CARPET_LIGHT_GRAY,
            () -> new CarpetStairBlock(Blocks.BIRCH_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_BIRCH_CARPET_LIME = registerBlock(
            Reference.UnlocalizedName.STAIR_BIRCH_CARPET_LIME,
            () -> new CarpetStairBlock(Blocks.BIRCH_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_BIRCH_CARPET_MAGENTA = registerBlock(
            Reference.UnlocalizedName.STAIR_BIRCH_CARPET_MAGENTA,
            () -> new CarpetStairBlock(Blocks.BIRCH_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_BIRCH_CARPET_ORANGE = registerBlock(
            Reference.UnlocalizedName.STAIR_BIRCH_CARPET_ORANGE,
            () -> new CarpetStairBlock(Blocks.BIRCH_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_BIRCH_CARPET_PARTIAL_BLACK = registerBlock(
            Reference.UnlocalizedName.STAIR_BIRCH_CARPET_PARTIAL_BLACK,
            () -> new CarpetStairBlock(Blocks.BIRCH_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_BIRCH_CARPET_PARTIAL_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIR_BIRCH_CARPET_PARTIAL_BLUE,
            () -> new CarpetStairBlock(Blocks.BIRCH_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_BIRCH_CARPET_PARTIAL_BROWN = registerBlock(
            Reference.UnlocalizedName.STAIR_BIRCH_CARPET_PARTIAL_BROWN,
            () -> new CarpetStairBlock(Blocks.BIRCH_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_BIRCH_CARPET_PARTIAL_CYAN = registerBlock(
            Reference.UnlocalizedName.STAIR_BIRCH_CARPET_PARTIAL_CYAN,
            () -> new CarpetStairBlock(Blocks.BIRCH_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_BIRCH_CARPET_PARTIAL_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIR_BIRCH_CARPET_PARTIAL_GRAY,
            () -> new CarpetStairBlock(Blocks.BIRCH_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_BIRCH_CARPET_PARTIAL_GREEN = registerBlock(
            Reference.UnlocalizedName.STAIR_BIRCH_CARPET_PARTIAL_GREEN,
            () -> new CarpetStairBlock(Blocks.BIRCH_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_BIRCH_CARPET_PARTIAL_LIGHT_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIR_BIRCH_CARPET_PARTIAL_LIGHT_BLUE,
            () -> new CarpetStairBlock(Blocks.BIRCH_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_BIRCH_CARPET_PARTIAL_LIGHT_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIR_BIRCH_CARPET_PARTIAL_LIGHT_GRAY,
            () -> new CarpetStairBlock(Blocks.BIRCH_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_BIRCH_CARPET_PARTIAL_LIME = registerBlock(
            Reference.UnlocalizedName.STAIR_BIRCH_CARPET_PARTIAL_LIME,
            () -> new CarpetStairBlock(Blocks.BIRCH_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_BIRCH_CARPET_PARTIAL_MAGENTA = registerBlock(
            Reference.UnlocalizedName.STAIR_BIRCH_CARPET_PARTIAL_MAGENTA,
            () -> new CarpetStairBlock(Blocks.BIRCH_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_BIRCH_CARPET_PARTIAL_ORANGE = registerBlock(
            Reference.UnlocalizedName.STAIR_BIRCH_CARPET_PARTIAL_ORANGE,
            () -> new CarpetStairBlock(Blocks.BIRCH_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_BIRCH_CARPET_PARTIAL_PINK = registerBlock(
            Reference.UnlocalizedName.STAIR_BIRCH_CARPET_PARTIAL_PINK,
            () -> new CarpetStairBlock(Blocks.BIRCH_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_BIRCH_CARPET_PARTIAL_PURPLE = registerBlock(
            Reference.UnlocalizedName.STAIR_BIRCH_CARPET_PARTIAL_PURPLE,
            () -> new CarpetStairBlock(Blocks.BIRCH_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_BIRCH_CARPET_PARTIAL_RED = registerBlock(
            Reference.UnlocalizedName.STAIR_BIRCH_CARPET_PARTIAL_RED,
            () -> new CarpetStairBlock(Blocks.BIRCH_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_BIRCH_CARPET_PARTIAL_WHITE = registerBlock(
            Reference.UnlocalizedName.STAIR_BIRCH_CARPET_PARTIAL_WHITE,
            () -> new CarpetStairBlock(Blocks.BIRCH_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_BIRCH_CARPET_PARTIAL_YELLOW = registerBlock(
            Reference.UnlocalizedName.STAIR_BIRCH_CARPET_PARTIAL_YELLOW,
            () -> new CarpetStairBlock(Blocks.BIRCH_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_BIRCH_CARPET_PINK = registerBlock(
            Reference.UnlocalizedName.STAIR_BIRCH_CARPET_PINK,
            () -> new CarpetStairBlock(Blocks.BIRCH_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_BIRCH_CARPET_PURPLE = registerBlock(
            Reference.UnlocalizedName.STAIR_BIRCH_CARPET_PURPLE,
            () -> new CarpetStairBlock(Blocks.BIRCH_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_BIRCH_CARPET_RED = registerBlock(
            Reference.UnlocalizedName.STAIR_BIRCH_CARPET_RED,
            () -> new CarpetStairBlock(Blocks.BIRCH_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_BIRCH_CARPET_WHITE = registerBlock(
            Reference.UnlocalizedName.STAIR_BIRCH_CARPET_WHITE,
            () -> new CarpetStairBlock(Blocks.BIRCH_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_BIRCH_CARPET_YELLOW = registerBlock(
            Reference.UnlocalizedName.STAIR_BIRCH_CARPET_YELLOW,
            () -> new CarpetStairBlock(Blocks.BIRCH_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_CRIMSON_CARPET_BLACK = registerBlock(
            Reference.UnlocalizedName.STAIR_CRIMSON_CARPET_BLACK,
            () -> new CarpetStairBlock(Blocks.CRIMSON_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_CRIMSON_CARPET_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIR_CRIMSON_CARPET_BLUE,
            () -> new CarpetStairBlock(Blocks.CRIMSON_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_CRIMSON_CARPET_BROWN = registerBlock(
            Reference.UnlocalizedName.STAIR_CRIMSON_CARPET_BROWN,
            () -> new CarpetStairBlock(Blocks.CRIMSON_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_CRIMSON_CARPET_CYAN = registerBlock(
            Reference.UnlocalizedName.STAIR_CRIMSON_CARPET_CYAN,
            () -> new CarpetStairBlock(Blocks.CRIMSON_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_CRIMSON_CARPET_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIR_CRIMSON_CARPET_GRAY,
            () -> new CarpetStairBlock(Blocks.CRIMSON_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_CRIMSON_CARPET_GREEN = registerBlock(
            Reference.UnlocalizedName.STAIR_CRIMSON_CARPET_GREEN,
            () -> new CarpetStairBlock(Blocks.CRIMSON_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_CRIMSON_CARPET_LIGHT_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIR_CRIMSON_CARPET_LIGHT_BLUE,
            () -> new CarpetStairBlock(Blocks.CRIMSON_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_CRIMSON_CARPET_LIGHT_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIR_CRIMSON_CARPET_LIGHT_GRAY,
            () -> new CarpetStairBlock(Blocks.CRIMSON_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_CRIMSON_CARPET_LIME = registerBlock(
            Reference.UnlocalizedName.STAIR_CRIMSON_CARPET_LIME,
            () -> new CarpetStairBlock(Blocks.CRIMSON_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_CRIMSON_CARPET_MAGENTA = registerBlock(
            Reference.UnlocalizedName.STAIR_CRIMSON_CARPET_MAGENTA,
            () -> new CarpetStairBlock(Blocks.CRIMSON_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_CRIMSON_CARPET_ORANGE = registerBlock(
            Reference.UnlocalizedName.STAIR_CRIMSON_CARPET_ORANGE,
            () -> new CarpetStairBlock(Blocks.CRIMSON_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_CRIMSON_CARPET_PARTIAL_BLACK = registerBlock(
            Reference.UnlocalizedName.STAIR_CRIMSON_CARPET_PARTIAL_BLACK,
            () -> new CarpetStairBlock(Blocks.CRIMSON_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_CRIMSON_CARPET_PARTIAL_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIR_CRIMSON_CARPET_PARTIAL_BLUE,
            () -> new CarpetStairBlock(Blocks.CRIMSON_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_CRIMSON_CARPET_PARTIAL_BROWN = registerBlock(
            Reference.UnlocalizedName.STAIR_CRIMSON_CARPET_PARTIAL_BROWN,
            () -> new CarpetStairBlock(Blocks.CRIMSON_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_CRIMSON_CARPET_PARTIAL_CYAN = registerBlock(
            Reference.UnlocalizedName.STAIR_CRIMSON_CARPET_PARTIAL_CYAN,
            () -> new CarpetStairBlock(Blocks.CRIMSON_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_CRIMSON_CARPET_PARTIAL_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIR_CRIMSON_CARPET_PARTIAL_GRAY,
            () -> new CarpetStairBlock(Blocks.CRIMSON_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_CRIMSON_CARPET_PARTIAL_GREEN = registerBlock(
            Reference.UnlocalizedName.STAIR_CRIMSON_CARPET_PARTIAL_GREEN,
            () -> new CarpetStairBlock(Blocks.CRIMSON_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_CRIMSON_CARPET_PARTIAL_LIGHT_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIR_CRIMSON_CARPET_PARTIAL_LIGHT_BLUE,
            () -> new CarpetStairBlock(Blocks.CRIMSON_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_CRIMSON_CARPET_PARTIAL_LIGHT_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIR_CRIMSON_CARPET_PARTIAL_LIGHT_GRAY,
            () -> new CarpetStairBlock(Blocks.CRIMSON_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_CRIMSON_CARPET_PARTIAL_LIME = registerBlock(
            Reference.UnlocalizedName.STAIR_CRIMSON_CARPET_PARTIAL_LIME,
            () -> new CarpetStairBlock(Blocks.CRIMSON_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_CRIMSON_CARPET_PARTIAL_MAGENTA = registerBlock(
            Reference.UnlocalizedName.STAIR_CRIMSON_CARPET_PARTIAL_MAGENTA,
            () -> new CarpetStairBlock(Blocks.CRIMSON_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_CRIMSON_CARPET_PARTIAL_ORANGE = registerBlock(
            Reference.UnlocalizedName.STAIR_CRIMSON_CARPET_PARTIAL_ORANGE,
            () -> new CarpetStairBlock(Blocks.CRIMSON_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_CRIMSON_CARPET_PARTIAL_PINK = registerBlock(
            Reference.UnlocalizedName.STAIR_CRIMSON_CARPET_PARTIAL_PINK,
            () -> new CarpetStairBlock(Blocks.CRIMSON_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_CRIMSON_CARPET_PARTIAL_PURPLE = registerBlock(
            Reference.UnlocalizedName.STAIR_CRIMSON_CARPET_PARTIAL_PURPLE,
            () -> new CarpetStairBlock(Blocks.CRIMSON_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_CRIMSON_CARPET_PARTIAL_RED = registerBlock(
            Reference.UnlocalizedName.STAIR_CRIMSON_CARPET_PARTIAL_RED,
            () -> new CarpetStairBlock(Blocks.CRIMSON_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_CRIMSON_CARPET_PARTIAL_WHITE = registerBlock(
            Reference.UnlocalizedName.STAIR_CRIMSON_CARPET_PARTIAL_WHITE,
            () -> new CarpetStairBlock(Blocks.CRIMSON_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_CRIMSON_CARPET_PARTIAL_YELLOW = registerBlock(
            Reference.UnlocalizedName.STAIR_CRIMSON_CARPET_PARTIAL_YELLOW,
            () -> new CarpetStairBlock(Blocks.CRIMSON_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_CRIMSON_CARPET_PINK = registerBlock(
            Reference.UnlocalizedName.STAIR_CRIMSON_CARPET_PINK,
            () -> new CarpetStairBlock(Blocks.CRIMSON_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_CRIMSON_CARPET_PURPLE = registerBlock(
            Reference.UnlocalizedName.STAIR_CRIMSON_CARPET_PURPLE,
            () -> new CarpetStairBlock(Blocks.CRIMSON_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_CRIMSON_CARPET_RED = registerBlock(
            Reference.UnlocalizedName.STAIR_CRIMSON_CARPET_RED,
            () -> new CarpetStairBlock(Blocks.CRIMSON_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_CRIMSON_CARPET_WHITE = registerBlock(
            Reference.UnlocalizedName.STAIR_CRIMSON_CARPET_WHITE,
            () -> new CarpetStairBlock(Blocks.CRIMSON_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_CRIMSON_CARPET_YELLOW = registerBlock(
            Reference.UnlocalizedName.STAIR_CRIMSON_CARPET_YELLOW,
            () -> new CarpetStairBlock(Blocks.CRIMSON_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_DARK_OAK_CARPET_BLACK = registerBlock(
            Reference.UnlocalizedName.STAIR_DARK_OAK_CARPET_BLACK,
            () -> new CarpetStairBlock(Blocks.DARK_OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_DARK_OAK_CARPET_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIR_DARK_OAK_CARPET_BLUE,
            () -> new CarpetStairBlock(Blocks.DARK_OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_DARK_OAK_CARPET_BROWN = registerBlock(
            Reference.UnlocalizedName.STAIR_DARK_OAK_CARPET_BROWN,
            () -> new CarpetStairBlock(Blocks.DARK_OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_DARK_OAK_CARPET_CYAN = registerBlock(
            Reference.UnlocalizedName.STAIR_DARK_OAK_CARPET_CYAN,
            () -> new CarpetStairBlock(Blocks.DARK_OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_DARK_OAK_CARPET_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIR_DARK_OAK_CARPET_GRAY,
            () -> new CarpetStairBlock(Blocks.DARK_OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_DARK_OAK_CARPET_GREEN = registerBlock(
            Reference.UnlocalizedName.STAIR_DARK_OAK_CARPET_GREEN,
            () -> new CarpetStairBlock(Blocks.DARK_OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_DARK_OAK_CARPET_LIGHT_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIR_DARK_OAK_CARPET_LIGHT_BLUE,
            () -> new CarpetStairBlock(Blocks.DARK_OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_DARK_OAK_CARPET_LIGHT_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIR_DARK_OAK_CARPET_LIGHT_GRAY,
            () -> new CarpetStairBlock(Blocks.DARK_OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_DARK_OAK_CARPET_LIME = registerBlock(
            Reference.UnlocalizedName.STAIR_DARK_OAK_CARPET_LIME,
            () -> new CarpetStairBlock(Blocks.DARK_OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_DARK_OAK_CARPET_MAGENTA = registerBlock(
            Reference.UnlocalizedName.STAIR_DARK_OAK_CARPET_MAGENTA,
            () -> new CarpetStairBlock(Blocks.DARK_OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_DARK_OAK_CARPET_ORANGE = registerBlock(
            Reference.UnlocalizedName.STAIR_DARK_OAK_CARPET_ORANGE,
            () -> new CarpetStairBlock(Blocks.DARK_OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_DARK_OAK_CARPET_PARTIAL_BLACK = registerBlock(
            Reference.UnlocalizedName.STAIR_DARK_OAK_CARPET_PARTIAL_BLACK,
            () -> new CarpetStairBlock(Blocks.DARK_OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_DARK_OAK_CARPET_PARTIAL_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIR_DARK_OAK_CARPET_PARTIAL_BLUE,
            () -> new CarpetStairBlock(Blocks.DARK_OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_DARK_OAK_CARPET_PARTIAL_BROWN = registerBlock(
            Reference.UnlocalizedName.STAIR_DARK_OAK_CARPET_PARTIAL_BROWN,
            () -> new CarpetStairBlock(Blocks.DARK_OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_DARK_OAK_CARPET_PARTIAL_CYAN = registerBlock(
            Reference.UnlocalizedName.STAIR_DARK_OAK_CARPET_PARTIAL_CYAN,
            () -> new CarpetStairBlock(Blocks.DARK_OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_DARK_OAK_CARPET_PARTIAL_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIR_DARK_OAK_CARPET_PARTIAL_GRAY,
            () -> new CarpetStairBlock(Blocks.DARK_OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_DARK_OAK_CARPET_PARTIAL_GREEN = registerBlock(
            Reference.UnlocalizedName.STAIR_DARK_OAK_CARPET_PARTIAL_GREEN,
            () -> new CarpetStairBlock(Blocks.DARK_OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_DARK_OAK_CARPET_PARTIAL_LIGHT_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIR_DARK_OAK_CARPET_PARTIAL_LIGHT_BLUE,
            () -> new CarpetStairBlock(Blocks.DARK_OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_DARK_OAK_CARPET_PARTIAL_LIGHT_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIR_DARK_OAK_CARPET_PARTIAL_LIGHT_GRAY,
            () -> new CarpetStairBlock(Blocks.DARK_OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_DARK_OAK_CARPET_PARTIAL_LIME = registerBlock(
            Reference.UnlocalizedName.STAIR_DARK_OAK_CARPET_PARTIAL_LIME,
            () -> new CarpetStairBlock(Blocks.DARK_OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_DARK_OAK_CARPET_PARTIAL_MAGENTA = registerBlock(
            Reference.UnlocalizedName.STAIR_DARK_OAK_CARPET_PARTIAL_MAGENTA,
            () -> new CarpetStairBlock(Blocks.DARK_OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_DARK_OAK_CARPET_PARTIAL_ORANGE = registerBlock(
            Reference.UnlocalizedName.STAIR_DARK_OAK_CARPET_PARTIAL_ORANGE,
            () -> new CarpetStairBlock(Blocks.DARK_OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_DARK_OAK_CARPET_PARTIAL_PINK = registerBlock(
            Reference.UnlocalizedName.STAIR_DARK_OAK_CARPET_PARTIAL_PINK,
            () -> new CarpetStairBlock(Blocks.DARK_OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_DARK_OAK_CARPET_PARTIAL_PURPLE = registerBlock(
            Reference.UnlocalizedName.STAIR_DARK_OAK_CARPET_PARTIAL_PURPLE,
            () -> new CarpetStairBlock(Blocks.DARK_OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_DARK_OAK_CARPET_PARTIAL_RED = registerBlock(
            Reference.UnlocalizedName.STAIR_DARK_OAK_CARPET_PARTIAL_RED,
            () -> new CarpetStairBlock(Blocks.DARK_OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_DARK_OAK_CARPET_PARTIAL_WHITE = registerBlock(
            Reference.UnlocalizedName.STAIR_DARK_OAK_CARPET_PARTIAL_WHITE,
            () -> new CarpetStairBlock(Blocks.DARK_OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_DARK_OAK_CARPET_PARTIAL_YELLOW = registerBlock(
            Reference.UnlocalizedName.STAIR_DARK_OAK_CARPET_PARTIAL_YELLOW,
            () -> new CarpetStairBlock(Blocks.DARK_OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_DARK_OAK_CARPET_PINK = registerBlock(
            Reference.UnlocalizedName.STAIR_DARK_OAK_CARPET_PINK,
            () -> new CarpetStairBlock(Blocks.DARK_OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_DARK_OAK_CARPET_PURPLE = registerBlock(
            Reference.UnlocalizedName.STAIR_DARK_OAK_CARPET_PURPLE,
            () -> new CarpetStairBlock(Blocks.DARK_OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_DARK_OAK_CARPET_RED = registerBlock(
            Reference.UnlocalizedName.STAIR_DARK_OAK_CARPET_RED,
            () -> new CarpetStairBlock(Blocks.DARK_OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_DARK_OAK_CARPET_WHITE = registerBlock(
            Reference.UnlocalizedName.STAIR_DARK_OAK_CARPET_WHITE,
            () -> new CarpetStairBlock(Blocks.DARK_OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_DARK_OAK_CARPET_YELLOW = registerBlock(
            Reference.UnlocalizedName.STAIR_DARK_OAK_CARPET_YELLOW,
            () -> new CarpetStairBlock(Blocks.DARK_OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_JUNGLE_CARPET_BLACK = registerBlock(
            Reference.UnlocalizedName.STAIR_JUNGLE_CARPET_BLACK,
            () -> new CarpetStairBlock(Blocks.JUNGLE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_JUNGLE_CARPET_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIR_JUNGLE_CARPET_BLUE,
            () -> new CarpetStairBlock(Blocks.JUNGLE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_JUNGLE_CARPET_BROWN = registerBlock(
            Reference.UnlocalizedName.STAIR_JUNGLE_CARPET_BROWN,
            () -> new CarpetStairBlock(Blocks.JUNGLE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_JUNGLE_CARPET_CYAN = registerBlock(
            Reference.UnlocalizedName.STAIR_JUNGLE_CARPET_CYAN,
            () -> new CarpetStairBlock(Blocks.JUNGLE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_JUNGLE_CARPET_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIR_JUNGLE_CARPET_GRAY,
            () -> new CarpetStairBlock(Blocks.JUNGLE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_JUNGLE_CARPET_GREEN = registerBlock(
            Reference.UnlocalizedName.STAIR_JUNGLE_CARPET_GREEN,
            () -> new CarpetStairBlock(Blocks.JUNGLE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_JUNGLE_CARPET_LIGHT_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIR_JUNGLE_CARPET_LIGHT_BLUE,
            () -> new CarpetStairBlock(Blocks.JUNGLE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_JUNGLE_CARPET_LIGHT_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIR_JUNGLE_CARPET_LIGHT_GRAY,
            () -> new CarpetStairBlock(Blocks.JUNGLE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_JUNGLE_CARPET_LIME = registerBlock(
            Reference.UnlocalizedName.STAIR_JUNGLE_CARPET_LIME,
            () -> new CarpetStairBlock(Blocks.JUNGLE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_JUNGLE_CARPET_MAGENTA = registerBlock(
            Reference.UnlocalizedName.STAIR_JUNGLE_CARPET_MAGENTA,
            () -> new CarpetStairBlock(Blocks.JUNGLE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_JUNGLE_CARPET_ORANGE = registerBlock(
            Reference.UnlocalizedName.STAIR_JUNGLE_CARPET_ORANGE,
            () -> new CarpetStairBlock(Blocks.JUNGLE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_JUNGLE_CARPET_PARTIAL_BLACK = registerBlock(
            Reference.UnlocalizedName.STAIR_JUNGLE_CARPET_PARTIAL_BLACK,
            () -> new CarpetStairBlock(Blocks.JUNGLE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_JUNGLE_CARPET_PARTIAL_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIR_JUNGLE_CARPET_PARTIAL_BLUE,
            () -> new CarpetStairBlock(Blocks.JUNGLE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_JUNGLE_CARPET_PARTIAL_BROWN = registerBlock(
            Reference.UnlocalizedName.STAIR_JUNGLE_CARPET_PARTIAL_BROWN,
            () -> new CarpetStairBlock(Blocks.JUNGLE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_JUNGLE_CARPET_PARTIAL_CYAN = registerBlock(
            Reference.UnlocalizedName.STAIR_JUNGLE_CARPET_PARTIAL_CYAN,
            () -> new CarpetStairBlock(Blocks.JUNGLE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_JUNGLE_CARPET_PARTIAL_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIR_JUNGLE_CARPET_PARTIAL_GRAY,
            () -> new CarpetStairBlock(Blocks.JUNGLE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_JUNGLE_CARPET_PARTIAL_GREEN = registerBlock(
            Reference.UnlocalizedName.STAIR_JUNGLE_CARPET_PARTIAL_GREEN,
            () -> new CarpetStairBlock(Blocks.JUNGLE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_JUNGLE_CARPET_PARTIAL_LIGHT_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIR_JUNGLE_CARPET_PARTIAL_LIGHT_BLUE,
            () -> new CarpetStairBlock(Blocks.JUNGLE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_JUNGLE_CARPET_PARTIAL_LIGHT_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIR_JUNGLE_CARPET_PARTIAL_LIGHT_GRAY,
            () -> new CarpetStairBlock(Blocks.JUNGLE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_JUNGLE_CARPET_PARTIAL_LIME = registerBlock(
            Reference.UnlocalizedName.STAIR_JUNGLE_CARPET_PARTIAL_LIME,
            () -> new CarpetStairBlock(Blocks.JUNGLE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_JUNGLE_CARPET_PARTIAL_MAGENTA = registerBlock(
            Reference.UnlocalizedName.STAIR_JUNGLE_CARPET_PARTIAL_MAGENTA,
            () -> new CarpetStairBlock(Blocks.JUNGLE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_JUNGLE_CARPET_PARTIAL_ORANGE = registerBlock(
            Reference.UnlocalizedName.STAIR_JUNGLE_CARPET_PARTIAL_ORANGE,
            () -> new CarpetStairBlock(Blocks.JUNGLE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_JUNGLE_CARPET_PARTIAL_PINK = registerBlock(
            Reference.UnlocalizedName.STAIR_JUNGLE_CARPET_PARTIAL_PINK,
            () -> new CarpetStairBlock(Blocks.JUNGLE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_JUNGLE_CARPET_PARTIAL_PURPLE = registerBlock(
            Reference.UnlocalizedName.STAIR_JUNGLE_CARPET_PARTIAL_PURPLE,
            () -> new CarpetStairBlock(Blocks.JUNGLE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_JUNGLE_CARPET_PARTIAL_RED = registerBlock(
            Reference.UnlocalizedName.STAIR_JUNGLE_CARPET_PARTIAL_RED,
            () -> new CarpetStairBlock(Blocks.JUNGLE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_JUNGLE_CARPET_PARTIAL_WHITE = registerBlock(
            Reference.UnlocalizedName.STAIR_JUNGLE_CARPET_PARTIAL_WHITE,
            () -> new CarpetStairBlock(Blocks.JUNGLE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_JUNGLE_CARPET_PARTIAL_YELLOW = registerBlock(
            Reference.UnlocalizedName.STAIR_JUNGLE_CARPET_PARTIAL_YELLOW,
            () -> new CarpetStairBlock(Blocks.JUNGLE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_JUNGLE_CARPET_PINK = registerBlock(
            Reference.UnlocalizedName.STAIR_JUNGLE_CARPET_PINK,
            () -> new CarpetStairBlock(Blocks.JUNGLE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_JUNGLE_CARPET_PURPLE = registerBlock(
            Reference.UnlocalizedName.STAIR_JUNGLE_CARPET_PURPLE,
            () -> new CarpetStairBlock(Blocks.JUNGLE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_JUNGLE_CARPET_RED = registerBlock(
            Reference.UnlocalizedName.STAIR_JUNGLE_CARPET_RED,
            () -> new CarpetStairBlock(Blocks.JUNGLE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_JUNGLE_CARPET_WHITE = registerBlock(
            Reference.UnlocalizedName.STAIR_JUNGLE_CARPET_WHITE,
            () -> new CarpetStairBlock(Blocks.JUNGLE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_JUNGLE_CARPET_YELLOW = registerBlock(
            Reference.UnlocalizedName.STAIR_JUNGLE_CARPET_YELLOW,
            () -> new CarpetStairBlock(Blocks.JUNGLE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_OAK_CARPET_BLACK = registerBlock(
            Reference.UnlocalizedName.STAIR_OAK_CARPET_BLACK,
            () -> new CarpetStairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_OAK_CARPET_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIR_OAK_CARPET_BLUE,
            () -> new CarpetStairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_OAK_CARPET_BROWN = registerBlock(
            Reference.UnlocalizedName.STAIR_OAK_CARPET_BROWN,
            () -> new CarpetStairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_OAK_CARPET_CYAN = registerBlock(
            Reference.UnlocalizedName.STAIR_OAK_CARPET_CYAN,
            () -> new CarpetStairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_OAK_CARPET_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIR_OAK_CARPET_GRAY,
            () -> new CarpetStairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_OAK_CARPET_GREEN = registerBlock(
            Reference.UnlocalizedName.STAIR_OAK_CARPET_GREEN,
            () -> new CarpetStairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_OAK_CARPET_LIGHT_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIR_OAK_CARPET_LIGHT_BLUE,
            () -> new CarpetStairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_OAK_CARPET_LIGHT_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIR_OAK_CARPET_LIGHT_GRAY,
            () -> new CarpetStairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_OAK_CARPET_LIME = registerBlock(
            Reference.UnlocalizedName.STAIR_OAK_CARPET_LIME,
            () -> new CarpetStairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_OAK_CARPET_MAGENTA = registerBlock(
            Reference.UnlocalizedName.STAIR_OAK_CARPET_MAGENTA,
            () -> new CarpetStairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_OAK_CARPET_ORANGE = registerBlock(
            Reference.UnlocalizedName.STAIR_OAK_CARPET_ORANGE,
            () -> new CarpetStairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_OAK_CARPET_PARTIAL_BLACK = registerBlock(
            Reference.UnlocalizedName.STAIR_OAK_CARPET_PARTIAL_BLACK,
            () -> new CarpetStairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_OAK_CARPET_PARTIAL_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIR_OAK_CARPET_PARTIAL_BLUE,
            () -> new CarpetStairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_OAK_CARPET_PARTIAL_BROWN = registerBlock(
            Reference.UnlocalizedName.STAIR_OAK_CARPET_PARTIAL_BROWN,
            () -> new CarpetStairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_OAK_CARPET_PARTIAL_CYAN = registerBlock(
            Reference.UnlocalizedName.STAIR_OAK_CARPET_PARTIAL_CYAN,
            () -> new CarpetStairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_OAK_CARPET_PARTIAL_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIR_OAK_CARPET_PARTIAL_GRAY,
            () -> new CarpetStairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_OAK_CARPET_PARTIAL_GREEN = registerBlock(
            Reference.UnlocalizedName.STAIR_OAK_CARPET_PARTIAL_GREEN,
            () -> new CarpetStairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_OAK_CARPET_PARTIAL_LIGHT_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIR_OAK_CARPET_PARTIAL_LIGHT_BLUE,
            () -> new CarpetStairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_OAK_CARPET_PARTIAL_LIGHT_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIR_OAK_CARPET_PARTIAL_LIGHT_GRAY,
            () -> new CarpetStairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_OAK_CARPET_PARTIAL_LIME = registerBlock(
            Reference.UnlocalizedName.STAIR_OAK_CARPET_PARTIAL_LIME,
            () -> new CarpetStairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_OAK_CARPET_PARTIAL_MAGENTA = registerBlock(
            Reference.UnlocalizedName.STAIR_OAK_CARPET_PARTIAL_MAGENTA,
            () -> new CarpetStairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_OAK_CARPET_PARTIAL_ORANGE = registerBlock(
            Reference.UnlocalizedName.STAIR_OAK_CARPET_PARTIAL_ORANGE,
            () -> new CarpetStairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_OAK_CARPET_PARTIAL_PINK = registerBlock(
            Reference.UnlocalizedName.STAIR_OAK_CARPET_PARTIAL_PINK,
            () -> new CarpetStairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_OAK_CARPET_PARTIAL_PURPLE = registerBlock(
            Reference.UnlocalizedName.STAIR_OAK_CARPET_PARTIAL_PURPLE,
            () -> new CarpetStairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_OAK_CARPET_PARTIAL_RED = registerBlock(
            Reference.UnlocalizedName.STAIR_OAK_CARPET_PARTIAL_RED,
            () -> new CarpetStairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_OAK_CARPET_PARTIAL_WHITE = registerBlock(
            Reference.UnlocalizedName.STAIR_OAK_CARPET_PARTIAL_WHITE,
            () -> new CarpetStairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_OAK_CARPET_PARTIAL_YELLOW = registerBlock(
            Reference.UnlocalizedName.STAIR_OAK_CARPET_PARTIAL_YELLOW,
            () -> new CarpetStairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_OAK_CARPET_PINK = registerBlock(
            Reference.UnlocalizedName.STAIR_OAK_CARPET_PINK,
            () -> new CarpetStairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_OAK_CARPET_PURPLE = registerBlock(
            Reference.UnlocalizedName.STAIR_OAK_CARPET_PURPLE,
            () -> new CarpetStairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_OAK_CARPET_RED = registerBlock(
            Reference.UnlocalizedName.STAIR_OAK_CARPET_RED,
            () -> new CarpetStairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_OAK_CARPET_WHITE = registerBlock(
            Reference.UnlocalizedName.STAIR_OAK_CARPET_WHITE,
            () -> new CarpetStairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_OAK_CARPET_YELLOW = registerBlock(
            Reference.UnlocalizedName.STAIR_OAK_CARPET_YELLOW,
            () -> new CarpetStairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_SPRUCE_CARPET_BLACK = registerBlock(
            Reference.UnlocalizedName.STAIR_SPRUCE_CARPET_BLACK,
            () -> new CarpetStairBlock(Blocks.SPRUCE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_SPRUCE_CARPET_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIR_SPRUCE_CARPET_BLUE,
            () -> new CarpetStairBlock(Blocks.SPRUCE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_SPRUCE_CARPET_BROWN = registerBlock(
            Reference.UnlocalizedName.STAIR_SPRUCE_CARPET_BROWN,
            () -> new CarpetStairBlock(Blocks.SPRUCE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_SPRUCE_CARPET_CYAN = registerBlock(
            Reference.UnlocalizedName.STAIR_SPRUCE_CARPET_CYAN,
            () -> new CarpetStairBlock(Blocks.SPRUCE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_SPRUCE_CARPET_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIR_SPRUCE_CARPET_GRAY,
            () -> new CarpetStairBlock(Blocks.SPRUCE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_SPRUCE_CARPET_GREEN = registerBlock(
            Reference.UnlocalizedName.STAIR_SPRUCE_CARPET_GREEN,
            () -> new CarpetStairBlock(Blocks.SPRUCE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_SPRUCE_CARPET_LIGHT_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIR_SPRUCE_CARPET_LIGHT_BLUE,
            () -> new CarpetStairBlock(Blocks.SPRUCE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_SPRUCE_CARPET_LIGHT_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIR_SPRUCE_CARPET_LIGHT_GRAY,
            () -> new CarpetStairBlock(Blocks.SPRUCE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_SPRUCE_CARPET_LIME = registerBlock(
            Reference.UnlocalizedName.STAIR_SPRUCE_CARPET_LIME,
            () -> new CarpetStairBlock(Blocks.SPRUCE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_SPRUCE_CARPET_MAGENTA = registerBlock(
            Reference.UnlocalizedName.STAIR_SPRUCE_CARPET_MAGENTA,
            () -> new CarpetStairBlock(Blocks.SPRUCE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_SPRUCE_CARPET_ORANGE = registerBlock(
            Reference.UnlocalizedName.STAIR_SPRUCE_CARPET_ORANGE,
            () -> new CarpetStairBlock(Blocks.SPRUCE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_SPRUCE_CARPET_PARTIAL_BLACK = registerBlock(
            Reference.UnlocalizedName.STAIR_SPRUCE_CARPET_PARTIAL_BLACK,
            () -> new CarpetStairBlock(Blocks.SPRUCE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_SPRUCE_CARPET_PARTIAL_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIR_SPRUCE_CARPET_PARTIAL_BLUE,
            () -> new CarpetStairBlock(Blocks.SPRUCE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_SPRUCE_CARPET_PARTIAL_BROWN = registerBlock(
            Reference.UnlocalizedName.STAIR_SPRUCE_CARPET_PARTIAL_BROWN,
            () -> new CarpetStairBlock(Blocks.SPRUCE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_SPRUCE_CARPET_PARTIAL_CYAN = registerBlock(
            Reference.UnlocalizedName.STAIR_SPRUCE_CARPET_PARTIAL_CYAN,
            () -> new CarpetStairBlock(Blocks.SPRUCE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_SPRUCE_CARPET_PARTIAL_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIR_SPRUCE_CARPET_PARTIAL_GRAY,
            () -> new CarpetStairBlock(Blocks.SPRUCE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_SPRUCE_CARPET_PARTIAL_GREEN = registerBlock(
            Reference.UnlocalizedName.STAIR_SPRUCE_CARPET_PARTIAL_GREEN,
            () -> new CarpetStairBlock(Blocks.SPRUCE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_SPRUCE_CARPET_PARTIAL_LIGHT_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIR_SPRUCE_CARPET_PARTIAL_LIGHT_BLUE,
            () -> new CarpetStairBlock(Blocks.SPRUCE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_SPRUCE_CARPET_PARTIAL_LIGHT_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIR_SPRUCE_CARPET_PARTIAL_LIGHT_GRAY,
            () -> new CarpetStairBlock(Blocks.SPRUCE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_SPRUCE_CARPET_PARTIAL_LIME = registerBlock(
            Reference.UnlocalizedName.STAIR_SPRUCE_CARPET_PARTIAL_LIME,
            () -> new CarpetStairBlock(Blocks.SPRUCE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_SPRUCE_CARPET_PARTIAL_MAGENTA = registerBlock(
            Reference.UnlocalizedName.STAIR_SPRUCE_CARPET_PARTIAL_MAGENTA,
            () -> new CarpetStairBlock(Blocks.SPRUCE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_SPRUCE_CARPET_PARTIAL_ORANGE = registerBlock(
            Reference.UnlocalizedName.STAIR_SPRUCE_CARPET_PARTIAL_ORANGE,
            () -> new CarpetStairBlock(Blocks.SPRUCE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_SPRUCE_CARPET_PARTIAL_PINK = registerBlock(
            Reference.UnlocalizedName.STAIR_SPRUCE_CARPET_PARTIAL_PINK,
            () -> new CarpetStairBlock(Blocks.SPRUCE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_SPRUCE_CARPET_PARTIAL_PURPLE = registerBlock(
            Reference.UnlocalizedName.STAIR_SPRUCE_CARPET_PARTIAL_PURPLE,
            () -> new CarpetStairBlock(Blocks.SPRUCE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_SPRUCE_CARPET_PARTIAL_RED = registerBlock(
            Reference.UnlocalizedName.STAIR_SPRUCE_CARPET_PARTIAL_RED,
            () -> new CarpetStairBlock(Blocks.SPRUCE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_SPRUCE_CARPET_PARTIAL_WHITE = registerBlock(
            Reference.UnlocalizedName.STAIR_SPRUCE_CARPET_PARTIAL_WHITE,
            () -> new CarpetStairBlock(Blocks.SPRUCE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_SPRUCE_CARPET_PARTIAL_YELLOW = registerBlock(
            Reference.UnlocalizedName.STAIR_SPRUCE_CARPET_PARTIAL_YELLOW,
            () -> new CarpetStairBlock(Blocks.SPRUCE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_SPRUCE_CARPET_PINK = registerBlock(
            Reference.UnlocalizedName.STAIR_SPRUCE_CARPET_PINK,
            () -> new CarpetStairBlock(Blocks.SPRUCE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_SPRUCE_CARPET_PURPLE = registerBlock(
            Reference.UnlocalizedName.STAIR_SPRUCE_CARPET_PURPLE,
            () -> new CarpetStairBlock(Blocks.SPRUCE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_SPRUCE_CARPET_RED = registerBlock(
            Reference.UnlocalizedName.STAIR_SPRUCE_CARPET_RED,
            () -> new CarpetStairBlock(Blocks.SPRUCE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_SPRUCE_CARPET_WHITE = registerBlock(
            Reference.UnlocalizedName.STAIR_SPRUCE_CARPET_WHITE,
            () -> new CarpetStairBlock(Blocks.SPRUCE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_SPRUCE_CARPET_YELLOW = registerBlock(
            Reference.UnlocalizedName.STAIR_SPRUCE_CARPET_YELLOW,
            () -> new CarpetStairBlock(Blocks.SPRUCE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_WARPED_CARPET_BLACK = registerBlock(
            Reference.UnlocalizedName.STAIR_WARPED_CARPET_BLACK,
            () -> new CarpetStairBlock(Blocks.WARPED_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_WARPED_CARPET_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIR_WARPED_CARPET_BLUE,
            () -> new CarpetStairBlock(Blocks.WARPED_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_WARPED_CARPET_BROWN = registerBlock(
            Reference.UnlocalizedName.STAIR_WARPED_CARPET_BROWN,
            () -> new CarpetStairBlock(Blocks.WARPED_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_WARPED_CARPET_CYAN = registerBlock(
            Reference.UnlocalizedName.STAIR_WARPED_CARPET_CYAN,
            () -> new CarpetStairBlock(Blocks.WARPED_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_WARPED_CARPET_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIR_WARPED_CARPET_GRAY,
            () -> new CarpetStairBlock(Blocks.WARPED_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_WARPED_CARPET_GREEN = registerBlock(
            Reference.UnlocalizedName.STAIR_WARPED_CARPET_GREEN,
            () -> new CarpetStairBlock(Blocks.WARPED_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_WARPED_CARPET_LIGHT_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIR_WARPED_CARPET_LIGHT_BLUE,
            () -> new CarpetStairBlock(Blocks.WARPED_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_WARPED_CARPET_LIGHT_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIR_WARPED_CARPET_LIGHT_GRAY,
            () -> new CarpetStairBlock(Blocks.WARPED_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_WARPED_CARPET_LIME = registerBlock(
            Reference.UnlocalizedName.STAIR_WARPED_CARPET_LIME,
            () -> new CarpetStairBlock(Blocks.WARPED_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_WARPED_CARPET_MAGENTA = registerBlock(
            Reference.UnlocalizedName.STAIR_WARPED_CARPET_MAGENTA,
            () -> new CarpetStairBlock(Blocks.WARPED_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_WARPED_CARPET_ORANGE = registerBlock(
            Reference.UnlocalizedName.STAIR_WARPED_CARPET_ORANGE,
            () -> new CarpetStairBlock(Blocks.WARPED_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_WARPED_CARPET_PARTIAL_BLACK = registerBlock(
            Reference.UnlocalizedName.STAIR_WARPED_CARPET_PARTIAL_BLACK,
            () -> new CarpetStairBlock(Blocks.WARPED_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_WARPED_CARPET_PARTIAL_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIR_WARPED_CARPET_PARTIAL_BLUE,
            () -> new CarpetStairBlock(Blocks.WARPED_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_WARPED_CARPET_PARTIAL_BROWN = registerBlock(
            Reference.UnlocalizedName.STAIR_WARPED_CARPET_PARTIAL_BROWN,
            () -> new CarpetStairBlock(Blocks.WARPED_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_WARPED_CARPET_PARTIAL_CYAN = registerBlock(
            Reference.UnlocalizedName.STAIR_WARPED_CARPET_PARTIAL_CYAN,
            () -> new CarpetStairBlock(Blocks.WARPED_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_WARPED_CARPET_PARTIAL_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIR_WARPED_CARPET_PARTIAL_GRAY,
            () -> new CarpetStairBlock(Blocks.WARPED_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_WARPED_CARPET_PARTIAL_GREEN = registerBlock(
            Reference.UnlocalizedName.STAIR_WARPED_CARPET_PARTIAL_GREEN,
            () -> new CarpetStairBlock(Blocks.WARPED_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_WARPED_CARPET_PARTIAL_LIGHT_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIR_WARPED_CARPET_PARTIAL_LIGHT_BLUE,
            () -> new CarpetStairBlock(Blocks.WARPED_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_WARPED_CARPET_PARTIAL_LIGHT_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIR_WARPED_CARPET_PARTIAL_LIGHT_GRAY,
            () -> new CarpetStairBlock(Blocks.WARPED_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_WARPED_CARPET_PARTIAL_LIME = registerBlock(
            Reference.UnlocalizedName.STAIR_WARPED_CARPET_PARTIAL_LIME,
            () -> new CarpetStairBlock(Blocks.WARPED_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_WARPED_CARPET_PARTIAL_MAGENTA = registerBlock(
            Reference.UnlocalizedName.STAIR_WARPED_CARPET_PARTIAL_MAGENTA,
            () -> new CarpetStairBlock(Blocks.WARPED_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_WARPED_CARPET_PARTIAL_ORANGE = registerBlock(
            Reference.UnlocalizedName.STAIR_WARPED_CARPET_PARTIAL_ORANGE,
            () -> new CarpetStairBlock(Blocks.WARPED_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_WARPED_CARPET_PARTIAL_PINK = registerBlock(
            Reference.UnlocalizedName.STAIR_WARPED_CARPET_PARTIAL_PINK,
            () -> new CarpetStairBlock(Blocks.WARPED_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_WARPED_CARPET_PARTIAL_PURPLE = registerBlock(
            Reference.UnlocalizedName.STAIR_WARPED_CARPET_PARTIAL_PURPLE,
            () -> new CarpetStairBlock(Blocks.WARPED_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_WARPED_CARPET_PARTIAL_RED = registerBlock(
            Reference.UnlocalizedName.STAIR_WARPED_CARPET_PARTIAL_RED,
            () -> new CarpetStairBlock(Blocks.WARPED_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_WARPED_CARPET_PARTIAL_WHITE = registerBlock(
            Reference.UnlocalizedName.STAIR_WARPED_CARPET_PARTIAL_WHITE,
            () -> new CarpetStairBlock(Blocks.WARPED_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_WARPED_CARPET_PARTIAL_YELLOW = registerBlock(
            Reference.UnlocalizedName.STAIR_WARPED_CARPET_PARTIAL_YELLOW,
            () -> new CarpetStairBlock(Blocks.WARPED_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_WARPED_CARPET_PINK = registerBlock(
            Reference.UnlocalizedName.STAIR_WARPED_CARPET_PINK,
            () -> new CarpetStairBlock(Blocks.WARPED_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_WARPED_CARPET_PURPLE = registerBlock(
            Reference.UnlocalizedName.STAIR_WARPED_CARPET_PURPLE,
            () -> new CarpetStairBlock(Blocks.WARPED_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_WARPED_CARPET_RED = registerBlock(
            Reference.UnlocalizedName.STAIR_WARPED_CARPET_RED,
            () -> new CarpetStairBlock(Blocks.WARPED_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_WARPED_CARPET_WHITE = registerBlock(
            Reference.UnlocalizedName.STAIR_WARPED_CARPET_WHITE,
            () -> new CarpetStairBlock(Blocks.WARPED_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS))
    );
    public static final RegistryObject<Block> STAIR_WARPED_CARPET_YELLOW = registerBlock(
            Reference.UnlocalizedName.STAIR_WARPED_CARPET_YELLOW,
            () -> new CarpetStairBlock(Blocks.WARPED_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS))
    );
    public static final RegistryObject<Block> STAIRS_TERRACOTTA_BLACK = registerBlock(
            Reference.UnlocalizedName.STAIRS_TERRACOTTA_BLACK,
            TerracottaStairBlock::new
    );
    public static final RegistryObject<Block> STAIRS_TERRACOTTA_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIRS_TERRACOTTA_BLUE,
            TerracottaStairBlock::new
    );
    public static final RegistryObject<Block> STAIRS_TERRACOTTA_BROWN = registerBlock(
            Reference.UnlocalizedName.STAIRS_TERRACOTTA_BROWN,
            TerracottaStairBlock::new
    );
    public static final RegistryObject<Block> STAIRS_TERRACOTTA_CYAN = registerBlock(
            Reference.UnlocalizedName.STAIRS_TERRACOTTA_CYAN,
            TerracottaStairBlock::new
    );
    public static final RegistryObject<Block> STAIRS_TERRACOTTA_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIRS_TERRACOTTA_GRAY,
            TerracottaStairBlock::new
    );
    public static final RegistryObject<Block> STAIRS_TERRACOTTA_GREEN = registerBlock(
            Reference.UnlocalizedName.STAIRS_TERRACOTTA_GREEN,
            TerracottaStairBlock::new
    );
    public static final RegistryObject<Block> STAIRS_TERRACOTTA_LIGHT_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIRS_TERRACOTTA_LIGHT_BLUE,
            TerracottaStairBlock::new
    );
    public static final RegistryObject<Block> STAIRS_TERRACOTTA_LIGHT_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIRS_TERRACOTTA_LIGHT_GRAY,
            TerracottaStairBlock::new
    );
    public static final RegistryObject<Block> STAIRS_TERRACOTTA_LIME = registerBlock(
            Reference.UnlocalizedName.STAIRS_TERRACOTTA_LIME,
            TerracottaStairBlock::new
    );
    public static final RegistryObject<Block> STAIRS_TERRACOTTA_MAGENTA = registerBlock(
            Reference.UnlocalizedName.STAIRS_TERRACOTTA_MAGENTA,
            TerracottaStairBlock::new
    );
    public static final RegistryObject<Block> STAIRS_TERRACOTTA_ORANGE = registerBlock(
            Reference.UnlocalizedName.STAIRS_TERRACOTTA_ORANGE,
            TerracottaStairBlock::new
    );
    public static final RegistryObject<Block> STAIRS_TERRACOTTA_PINK = registerBlock(
            Reference.UnlocalizedName.STAIRS_TERRACOTTA_PINK,
            TerracottaStairBlock::new
    );
    public static final RegistryObject<Block> STAIRS_TERRACOTTA_PURPLE = registerBlock(
            Reference.UnlocalizedName.STAIRS_TERRACOTTA_PURPLE,
            TerracottaStairBlock::new
    );
    public static final RegistryObject<Block> STAIRS_TERRACOTTA_RED = registerBlock(
            Reference.UnlocalizedName.STAIRS_TERRACOTTA_RED,
            TerracottaStairBlock::new
    );
    public static final RegistryObject<Block> STAIRS_TERRACOTTA_WHITE = registerBlock(
            Reference.UnlocalizedName.STAIRS_TERRACOTTA_WHITE,
            TerracottaStairBlock::new
    );
    public static final RegistryObject<Block> STAIRS_TERRACOTTA_YELLOW = registerBlock(
            Reference.UnlocalizedName.STAIRS_TERRACOTTA_YELLOW,
            TerracottaStairBlock::new
    );
    public static final RegistryObject<Block> STAIR_WOOL_BLACK = registerBlock(
            Reference.UnlocalizedName.STAIRS_WOOL_BLACK,
            WoolStairBlock::new
    );
    public static final RegistryObject<Block> STAIR_WOOL_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIRS_WOOL_BLUE,
            WoolStairBlock::new
    );
    public static final RegistryObject<Block> STAIR_WOOL_BROWN = registerBlock(
            Reference.UnlocalizedName.STAIRS_WOOL_BROWN,
            WoolStairBlock::new
    );
    public static final RegistryObject<Block> STAIR_WOOL_CYAN = registerBlock(
            Reference.UnlocalizedName.STAIRS_WOOL_CYAN,
            WoolStairBlock::new
    );
    public static final RegistryObject<Block> STAIR_WOOL_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIRS_WOOL_GRAY,
            WoolStairBlock::new
    );
    public static final RegistryObject<Block> STAIR_WOOL_GREEN = registerBlock(
            Reference.UnlocalizedName.STAIRS_WOOL_GREEN,
            WoolStairBlock::new
    );
    public static final RegistryObject<Block> STAIR_WOOL_LIGHT_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIRS_WOOL_LIGHT_BLUE,
            WoolStairBlock::new
    );
    public static final RegistryObject<Block> STAIR_WOOL_LIGHT_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIRS_WOOL_LIGHT_GRAY,
            WoolStairBlock::new
    );
    public static final RegistryObject<Block> STAIR_WOOL_LIME = registerBlock(
            Reference.UnlocalizedName.STAIRS_WOOL_LIME,
            WoolStairBlock::new
    );
    public static final RegistryObject<Block> STAIR_WOOL_MAGENTA = registerBlock(
            Reference.UnlocalizedName.STAIRS_WOOL_MAGENTA,
            WoolStairBlock::new
    );
    public static final RegistryObject<Block> STAIR_WOOL_ORANGE = registerBlock(
            Reference.UnlocalizedName.STAIRS_WOOL_ORANGE,
            WoolStairBlock::new
    );
    public static final RegistryObject<Block> STAIR_WOOL_PINK = registerBlock(
            Reference.UnlocalizedName.STAIRS_WOOL_PINK,
            WoolStairBlock::new
    );
    public static final RegistryObject<Block> STAIR_WOOL_PURPLE = registerBlock(
            Reference.UnlocalizedName.STAIRS_WOOL_PURPLE,
            WoolStairBlock::new
    );
    public static final RegistryObject<Block> STAIR_WOOL_RED = registerBlock(
            Reference.UnlocalizedName.STAIRS_WOOL_RED,
            WoolStairBlock::new
    );
    public static final RegistryObject<Block> STAIR_WOOL_WHITE = registerBlock(
            Reference.UnlocalizedName.STAIRS_WOOL_WHITE,
            WoolStairBlock::new
    );
    public static final RegistryObject<Block> STAIR_WOOL_YELLOW = registerBlock(
            Reference.UnlocalizedName.STAIRS_WOOL_YELLOW,
            WoolStairBlock::new
    );

    public static final RegistryObject<Block> STAIR_WAXED_CUT_COPPER_GLOWING = registerBlock(
            Reference.UnlocalizedName.STAIR_WAXED_CUT_COPPER_GLOWING,
            () -> new GlowingStairBlock(Blocks.WAXED_CUT_COPPER_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.WAXED_CUT_COPPER_STAIRS))
    );

    public static final RegistryObject<Block> STAIR_WAXED_EXPOSED_CUT_COPPER_GLOWING = registerBlock(
            Reference.UnlocalizedName.STAIR_WAXED_EXPOSED_CUT_COPPER_GLOWING,
            () -> new GlowingStairBlock(Blocks.WAXED_EXPOSED_CUT_COPPER_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.WAXED_EXPOSED_CUT_COPPER_STAIRS))
    );

    public static final RegistryObject<Block> STAIR_WAXED_WEATHERED_CUT_COPPER_GLOWING = registerBlock(
            Reference.UnlocalizedName.STAIR_WAXED_WEATHERED_CUT_COPPER_GLOWING,
            () -> new GlowingStairBlock(Blocks.WAXED_WEATHERED_CUT_COPPER_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.WAXED_WEATHERED_CUT_COPPER_STAIRS))
    );

    public static final RegistryObject<Block> STAIR_WAXED_OXIDIZED_CUT_COPPER_GLOWING = registerBlock(
            Reference.UnlocalizedName.STAIR_WAXED_OXIDIZED_CUT_COPPER_GLOWING,
            () -> new GlowingStairBlock(Blocks.WAXED_OXIDIZED_CUT_COPPER_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.WAXED_OXIDIZED_CUT_COPPER_STAIRS))
    );

    public static final RegistryObject<Block> STAIR_WEATHERED_CUT_COPPER_GLOWING = registerBlock(
            Reference.UnlocalizedName.STAIR_WEATHERED_CUT_COPPER_GLOWING,
            () -> new GlowingStairBlock(Blocks.WEATHERED_CUT_COPPER_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.WEATHERED_CUT_COPPER_STAIRS))
    );

    /*
      Glowing Variants of Vanilla Stairs
     */
    static {
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_ACACIA_GLOWING,
                Blocks.ACACIA_STAIRS, Reference.ToolTypeNames.AXE,
                new ResourceLocation("minecraft", "block/acacia_planks")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_ANDESITE_GLOWING,
                Blocks.ANDESITE_STAIRS, Reference.ToolTypeNames.PICKAXE,
                new ResourceLocation("minecraft", "block/andesite")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_BAMBOO_MOSAIC_GLOWING,
                Blocks.BAMBOO_MOSAIC_STAIRS, Reference.ToolTypeNames.AXE,
                new ResourceLocation("minecraft", "block/bamboo_mosaic")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_BAMBOO_GLOWING,
                Blocks.BAMBOO_STAIRS, Reference.ToolTypeNames.AXE,
                new ResourceLocation("minecraft", "block/bamboo_planks")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_BIRCH_GLOWING,
                Blocks.BIRCH_STAIRS, Reference.ToolTypeNames.AXE,
                new ResourceLocation("minecraft", "block/birch_planks")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_BLACKSTONE_GLOWING,
                Blocks.BLACKSTONE_STAIRS, Reference.ToolTypeNames.PICKAXE,
                new ResourceLocation("minecraft", "block/blackstone")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_BRICK_GLOWING,
                Blocks.BRICK_STAIRS, Reference.ToolTypeNames.PICKAXE,
                new ResourceLocation("minecraft", "block/bricks")
        );
        // TODO: Refactor cherry_stairs
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_COBBLED_DEEPSLATE_GLOWING,
                Blocks.COBBLED_DEEPSLATE_STAIRS, Reference.ToolTypeNames.PICKAXE,
                new ResourceLocation("minecraft", "block/cobbled_deepslate")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_COBBLESTONE_GLOWING,
                Blocks.COBBLESTONE_STAIRS, Reference.ToolTypeNames.PICKAXE,
                new ResourceLocation("minecraft", "block/cobblestone")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_CRIMSON_GLOWING,
                Blocks.CRIMSON_STAIRS, Reference.ToolTypeNames.AXE,
                new ResourceLocation("minecraft", "block/crimson_planks")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_CUT_COPPER_GLOWING,
                Blocks.CUT_COPPER_STAIRS, Reference.ToolTypeNames.AXE,
                new ResourceLocation("minecraft", "block/cut_copper")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_DARK_OAK_GLOWING,
                Blocks.DARK_OAK_STAIRS, Reference.ToolTypeNames.AXE,
                new ResourceLocation("minecraft", "block/dark_oak_planks")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_DARK_PRISMARINE_GLOWING,
                Blocks.DARK_PRISMARINE_STAIRS, Reference.ToolTypeNames.PICKAXE,
                new ResourceLocation("minecraft", "block/dark_prismarine")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_DEEPSLATE_BRICK_GLOWING,
                Blocks.DEEPSLATE_BRICK_STAIRS, Reference.ToolTypeNames.PICKAXE,
                new ResourceLocation("minecraft", "block/deepslate_bricks")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_DEEPSLATE_TILE_GLOWING,
                Blocks.DEEPSLATE_TILE_STAIRS, Reference.ToolTypeNames.PICKAXE,
                new ResourceLocation("minecraft", "block/deepslate_tiles")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_DIORITE_GLOWING,
                Blocks.DIORITE_STAIRS, Reference.ToolTypeNames.PICKAXE,
                new ResourceLocation("minecraft", "block/diorite")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_END_STONE_BRICK_GLOWING,
                Blocks.END_STONE_BRICK_STAIRS, Reference.ToolTypeNames.PICKAXE,
                new ResourceLocation("minecraft", "block/end_stone_bricks")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_EXPOSED_CUT_COPPER_GLOWING,
                Blocks.EXPOSED_CUT_COPPER_STAIRS, Reference.ToolTypeNames.PICKAXE,
                new ResourceLocation("minecraft", "block/exposed_cut_copper")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_GRANITE_GLOWING,
                Blocks.GRANITE_STAIRS, Reference.ToolTypeNames.PICKAXE,
                new ResourceLocation("minecraft", "block/granite")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_JUNGLE_GLOWING,
                Blocks.JUNGLE_STAIRS, Reference.ToolTypeNames.AXE,
                new ResourceLocation("minecraft", "block/jungle_planks")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_MANGROVE_GLOWING,
                Blocks.MANGROVE_STAIRS, Reference.ToolTypeNames.AXE,
                new ResourceLocation("minecraft", "block/mangrove_planks")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_MOSSY_COBBLESTONE_GLOWING,
                Blocks.MOSSY_COBBLESTONE_STAIRS, Reference.ToolTypeNames.PICKAXE,
                new ResourceLocation("minecraft", "block/mossy_cobblestone")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_MOSSY_STONE_BRICK_GLOWING,
                Blocks.MOSSY_STONE_BRICK_STAIRS, Reference.ToolTypeNames.PICKAXE,
                new ResourceLocation("minecraft", "block/mossy_stone_bricks")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_MUD_BRICK_GLOWING,
                Blocks.MUD_BRICK_STAIRS, Reference.ToolTypeNames.PICKAXE,
                new ResourceLocation("minecraft", "block/mossy_stone_bricks")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_NETHER_BRICK_GLOWING,
                Blocks.NETHER_BRICK_STAIRS, Reference.ToolTypeNames.PICKAXE,
                new ResourceLocation("minecraft", "block/nether_bricks")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_OAK_GLOWING,
                Blocks.OAK_STAIRS, Reference.ToolTypeNames.AXE,
                new ResourceLocation("minecraft", "block/oak_planks")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_OXIDIZED_CUT_COPPER_GLOWING,
                Blocks.OXIDIZED_CUT_COPPER_STAIRS, Reference.ToolTypeNames.PICKAXE,
                new ResourceLocation("minecraft", "block/oxidized_cut_copper")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_POLISHED_ANDESITE_GLOWING,
                Blocks.POLISHED_ANDESITE_STAIRS, Reference.ToolTypeNames.PICKAXE,
                new ResourceLocation("minecraft", "block/polished_andesite")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_POLISHED_BLACKSTONE_BRICK_GLOWING,
                Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS, Reference.ToolTypeNames.PICKAXE,
                new ResourceLocation("minecraft", "block/polished_blackstone_bricks")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_POLISHED_BLACKSTONE_GLOWING,
                Blocks.POLISHED_BLACKSTONE_STAIRS, Reference.ToolTypeNames.PICKAXE,
                new ResourceLocation("minecraft", "block/polished_blackstone")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_POLISHED_DEEPSLATE_GLOWING,
                Blocks.POLISHED_DEEPSLATE_STAIRS, Reference.ToolTypeNames.PICKAXE,
                new ResourceLocation("minecraft", "block/polished_deepslate")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_POLISHED_DIORITE_GLOWING,
                Blocks.POLISHED_DIORITE_STAIRS, Reference.ToolTypeNames.PICKAXE,
                new ResourceLocation("minecraft", "block/polished_diorite")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_POLISHED_GRANITE_GLOWING,
                Blocks.POLISHED_GRANITE_STAIRS, Reference.ToolTypeNames.PICKAXE,
                new ResourceLocation("minecraft", "block/polished_granite")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_PRISMARINE_BRICK_GLOWING,
                Blocks.PRISMARINE_BRICK_STAIRS, Reference.ToolTypeNames.PICKAXE,
                new ResourceLocation("minecraft", "block/prismarine_bricks")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_PRISMARINE_GLOWING,
                Blocks.PRISMARINE_STAIRS, Reference.ToolTypeNames.PICKAXE,
                new ResourceLocation("minecraft", "block/prismarine")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_PURPUR_GLOWING,
                Blocks.PURPUR_STAIRS, Reference.ToolTypeNames.PICKAXE,
                new ResourceLocation("minecraft", "block/purpur_block")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_QUARTZ_GLOWING,
                Blocks.QUARTZ_STAIRS, Reference.ToolTypeNames.PICKAXE,
                new ResourceLocation("minecraft", "block/quartz_block_top")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_RED_NETHER_BRICK_GLOWING,
                Blocks.RED_NETHER_BRICK_STAIRS, Reference.ToolTypeNames.PICKAXE,
                new ResourceLocation("minecraft", "block/red_nether_bricks")
        );
        // TODO: Refactor for multi-textured red_sandstone_stairs
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_RED_SANDSTONE_GLOWING,
                Blocks.RED_SANDSTONE_STAIRS, Reference.ToolTypeNames.PICKAXE,
                new ResourceLocation("minecraft", "block/red_sandstone_bottom")
        );
        // TODO: Refactor for multi-textured sandstone_stairs
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_SANDSTONE_GLOWING,
                Blocks.SANDSTONE_STAIRS, Reference.ToolTypeNames.PICKAXE,
                new ResourceLocation("minecraft", "block/sandstone_bottom")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_SMOOTH_QUARTZ_GLOWING,
                Blocks.SMOOTH_QUARTZ_STAIRS, Reference.ToolTypeNames.PICKAXE,
                new ResourceLocation("minecraft", "block/quartz_block_bottom")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_SMOOTH_RED_SANDSTONE_GLOWING,
                Blocks.SMOOTH_RED_SANDSTONE_STAIRS, Reference.ToolTypeNames.PICKAXE,
                new ResourceLocation("minecraft", "block/red_sandstone_top")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_SMOOTH_SANDSTONE_GLOWING,
                Blocks.SMOOTH_SANDSTONE_STAIRS, Reference.ToolTypeNames.PICKAXE,
                new ResourceLocation("minecraft", "block/sandstone_top")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_SPRUCE_GLOWING,
                Blocks.SPRUCE_STAIRS, Reference.ToolTypeNames.AXE,
                new ResourceLocation("minecraft", "block/spruce_planks")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_STONE_BRICK_GLOWING,
                Blocks.STONE_BRICK_STAIRS, Reference.ToolTypeNames.PICKAXE,
                new ResourceLocation("minecraft", "block/stone_bricks")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_STONE_GLOWING,
                Blocks.STONE_STAIRS, Reference.ToolTypeNames.PICKAXE,
                new ResourceLocation("minecraft", "block/stone")
        );
        registerVanillaGlowingStairVariant(Reference.UnlocalizedName.STAIR_WARPED_GLOWING,
                Blocks.WARPED_STAIRS, Reference.ToolTypeNames.AXE,
                new ResourceLocation("minecraft", "block/warped_planks")
        );

    }

    /*
      Glowing Variants of Vanilla Blocks
     */
    static {
        registerVanillaVariant(Reference.UnlocalizedName.ACACIA_PLANKS_GLOWING, Blocks.ACACIA_PLANKS, "axe", new ResourceLocation("minecraft", "block/acacia_planks"));
        registerVanillaVariant(Reference.UnlocalizedName.ANDESITE_GLOWING, Blocks.ANDESITE,"pickaxe", new ResourceLocation("minecraft", "block/andesite"));
        registerVanillaVariant(Reference.UnlocalizedName.BAMBOO_MOSAIC_GLOWING, Blocks.BAMBOO_MOSAIC, "axe", new ResourceLocation("minecraft", "block/bamboo_mosaic"));
        registerVanillaVariant(Reference.UnlocalizedName.BAMBOO_PLANKS_GLOWING, Blocks.BAMBOO_PLANKS, "axe", new ResourceLocation("minecraft", "block/bamboo_planks"));
        registerVanillaVariant(Reference.UnlocalizedName.BIRCH_PLANKS_GLOWING, Blocks.BIRCH_PLANKS, "axe", new ResourceLocation("minecraft", "block/birch_planks"));
        registerVanillaVariant(Reference.UnlocalizedName.BLACKSTONE_GLOWING, Blocks.BLACKSTONE, "pickaxe", new ResourceLocation("minecraft", "block/blackstone"));
        registerVanillaVariant(Reference.UnlocalizedName.BLACK_CONCRETE_GLOWING, Blocks.BLACK_CONCRETE, "pickaxe", new ResourceLocation("minecraft", "block/black_concrete"));
        registerVanillaVariant(Reference.UnlocalizedName.BLACK_TERRACOTTA_GLOWING, Blocks.BLACK_TERRACOTTA, "pickaxe", new ResourceLocation("minecraft", "block/black_terracotta"));
        registerVanillaVariant(Reference.UnlocalizedName.BLACK_WOOL_GLOWING, Blocks.BLACK_WOOL, "none", new ResourceLocation("minecraft", "block/black_wool"));
        registerVanillaVariant(Reference.UnlocalizedName.BLUE_CONCRETE_GLOWING, Blocks.BLUE_CONCRETE, "pickaxe", new ResourceLocation("minecraft", "block/blue_concrete"));
        registerVanillaVariant(Reference.UnlocalizedName.BLUE_TERRACOTTA_GLOWING, Blocks.BLUE_TERRACOTTA, "pickaxe", new ResourceLocation("minecraft", "block/blue_terracotta"));
        registerVanillaVariant(Reference.UnlocalizedName.BLUE_WOOL_GLOWING, Blocks.BLUE_WOOL, "none", new ResourceLocation("minecraft", "block/blue_wool"));
        registerVanillaVariant(Reference.UnlocalizedName.BOOKSHELF_GLOWING, Blocks.BOOKSHELF, "axe", new ResourceLocation("minecraft", "block/bookshelf"));
        registerVanillaVariant(Reference.UnlocalizedName.BRICKS_GLOWING, Blocks.BRICKS, "pickaxe", new ResourceLocation("minecraft", "block/bricks"));
        registerVanillaVariant(Reference.UnlocalizedName.BROWN_CONCRETE_GLOWING, Blocks.BROWN_CONCRETE, "pickaxe", new ResourceLocation("minecraft", "block/brown_concrete"));
        registerVanillaVariant(Reference.UnlocalizedName.BROWN_TERRACOTTA_GLOWING, Blocks.BROWN_TERRACOTTA, "pickaxe", new ResourceLocation("minecraft", "block/brown_terracotta"));
        registerVanillaVariant(Reference.UnlocalizedName.BROWN_WOOL_GLOWING, Blocks.BROWN_WOOL, "none", new ResourceLocation("minecraft", "block/brown_wool"));
        registerVanillaVariant(Reference.UnlocalizedName.CALCITE_GLOWING, Blocks.CALCITE, "pickaxe", new ResourceLocation("minecraft", "block/calcite"));
        registerVanillaVariant(Reference.UnlocalizedName.CHERRY_PLANKS_GLOWING, Blocks.CHERRY_PLANKS, "axe", new ResourceLocation("minecraft", "block/cherry_planks"));
        registerVanillaVariant(Reference.UnlocalizedName.CHISELED_DEEPSLATE_GLOWING, Blocks.CHISELED_DEEPSLATE, "pickaxe", new ResourceLocation("minecraft", "block/chiseled_deepslate"));
        registerVanillaVariant(Reference.UnlocalizedName.CHISELED_NETHER_BRICKS_GLOWING, Blocks.CHISELED_NETHER_BRICKS, "pickaxe", new ResourceLocation("minecraft", "block/chiseled_nether_bricks"));
        registerVanillaVariant(Reference.UnlocalizedName.CHISELED_POLISHED_BLACKSTONE_GLOWING, Blocks.CHISELED_POLISHED_BLACKSTONE, "pickaxe", new ResourceLocation("minecraft", "block/chiseled_polished_blackstone"));
        registerVanillaVariant(Reference.UnlocalizedName.CHISELED_QUARTZ_BLOCK_GLOWING, Blocks.CHISELED_QUARTZ_BLOCK, "pickaxe", new ResourceLocation("minecraft", "block/chiseled_quartz_block"));
        registerVanillaVariant(Reference.UnlocalizedName.CHISELED_RED_SANDSTONE_GLOWING, Blocks.CHISELED_RED_SANDSTONE, "pickaxe", new ResourceLocation("minecraft", "block/chiseled_red_sandstone"));
        registerVanillaVariant(Reference.UnlocalizedName.CHISELED_SANDSTONE_GLOWING, Blocks.CHISELED_SANDSTONE, "pickaxe", new ResourceLocation("minecraft", "block/chiseled_sandstone"));
        registerVanillaVariant(Reference.UnlocalizedName.CHISELED_STONE_BRICKS_GLOWING, Blocks.CHISELED_STONE_BRICKS, "pickaxe", new ResourceLocation("minecraft", "block/chiseled_stone_bricks"));
        registerVanillaVariant(Reference.UnlocalizedName.CLAY_GLOWING, Blocks.CLAY, "shovel", new ResourceLocation("minecraft", "block/clay"));
        registerVanillaVariant(Reference.UnlocalizedName.COAL_BLOCK_GLOWING, Blocks.COAL_BLOCK, "pickaxe", new ResourceLocation("minecraft", "block/coal_block"));
        registerVanillaVariant(Reference.UnlocalizedName.COARSE_DIRT_GLOWING, Blocks.COARSE_DIRT, "shovel", new ResourceLocation("minecraft", "block/coarse_dirt"));
        registerVanillaVariant(Reference.UnlocalizedName.COBBLED_DEEPSLATE_GLOWING, Blocks.COBBLED_DEEPSLATE, "pickaxe", new ResourceLocation("minecraft", "block/cobbled_deepslate"));
        registerVanillaVariant(Reference.UnlocalizedName.COBBLESTONE_GLOWING, Blocks.COBBLESTONE, "pickaxe", new ResourceLocation("minecraft", "block/cobblestone"));
        registerVanillaVariant(Reference.UnlocalizedName.CRACKED_DEEPSLATE_BRICKS_GLOWING, Blocks.CRACKED_DEEPSLATE_BRICKS, "pickaxe", new ResourceLocation("minecraft", "block/cracked_deepslate_bricks"));
        registerVanillaVariant(Reference.UnlocalizedName.CRACKED_DEEPSLATE_TILES_GLOWING, Blocks.CRACKED_DEEPSLATE_TILES, "pickaxe", new ResourceLocation("minecraft", "block/cracked_deepslate_tiles"));
        registerVanillaVariant(Reference.UnlocalizedName.CRACKED_NETHER_BRICKS_GLOWING, Blocks.CRACKED_NETHER_BRICKS, "pickaxe", new ResourceLocation("minecraft", "block/cracked_nether_bricks"));
        registerVanillaVariant(Reference.UnlocalizedName.CRACKED_POLISHED_BLACKSTONE_BRICKS_GLOWING, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS, "pickaxe", new ResourceLocation("minecraft", "block/cracked_polished_blackstone_bricks"));
        registerVanillaVariant(Reference.UnlocalizedName.CRACKED_STONE_BRICKS_GLOWING, Blocks.CRACKED_STONE_BRICKS, "pickaxe", new ResourceLocation("minecraft", "block/cracked_stone_bricks"));
        registerVanillaVariant(Reference.UnlocalizedName.CRIMSON_PLANKS_GLOWING, Blocks.CRIMSON_PLANKS, "axe", new ResourceLocation("minecraft", "block/crimson_planks"));
        registerVanillaVariant(Reference.UnlocalizedName.CUT_RED_SANDSTONE_GLOWING, Blocks.CUT_RED_SANDSTONE, "pickaxe", new ResourceLocation("minecraft", "block/cut_red_sandstone"));
        registerVanillaVariant(Reference.UnlocalizedName.CUT_SANDSTONE_GLOWING, Blocks.CUT_SANDSTONE, "pickaxe", new ResourceLocation("minecraft", "block/cut_sandstone"));
        registerVanillaVariant(Reference.UnlocalizedName.CYAN_CONCRETE_GLOWING, Blocks.CYAN_CONCRETE, "pickaxe", new ResourceLocation("minecraft", "block/cyan_concrete"));
        registerVanillaVariant(Reference.UnlocalizedName.CYAN_TERRACOTTA_GLOWING, Blocks.CYAN_TERRACOTTA, "pickaxe", new ResourceLocation("minecraft", "block/cyan_terracotta"));
        registerVanillaVariant(Reference.UnlocalizedName.CYAN_WOOL_GLOWING, Blocks.CYAN_WOOL, "none", new ResourceLocation("minecraft", "block/cyan_wool"));
        registerVanillaVariant(Reference.UnlocalizedName.DARK_OAK_PLANKS_GLOWING, Blocks.DARK_OAK_PLANKS, "axe", new ResourceLocation("minecraft", "block/dark_oak_planks"));
        registerVanillaVariant(Reference.UnlocalizedName.DARK_PRISMARINE_GLOWING, Blocks.DARK_PRISMARINE, "pickaxe", new ResourceLocation("minecraft", "block/dark_prismarine"));
        registerVanillaVariant(Reference.UnlocalizedName.DEEPSLATE_BRICKS_GLOWING, Blocks.DEEPSLATE_BRICKS, "pickaxe", new ResourceLocation("minecraft", "block/deepslate_bricks"));
        registerVanillaVariant(Reference.UnlocalizedName.DEEPSLATE_TILES_GLOWING, Blocks.DEEPSLATE_TILES, "pickaxe", new ResourceLocation("minecraft", "block/deepslate_tiles"));
        registerVanillaVariant(Reference.UnlocalizedName.DIAMOND_BLOCK_GLOWING, Blocks.DIAMOND_BLOCK, "pickaxe", new ResourceLocation("minecraft", "block/diamond_block"));
        registerVanillaVariant(Reference.UnlocalizedName.DIRT_GLOWING, Blocks.DIRT, "shovel", new ResourceLocation("minecraft", "block/dirt"));
        registerVanillaVariant(Reference.UnlocalizedName.DRIED_KELP_BLOCK_GLOWING, Blocks.DRIED_KELP_BLOCK, "pickaxe", new ResourceLocation("minecraft", "block/dried_kelp_block"), new ResourceLocation("minecraft", "block/dried_kelp_side"));
        registerVanillaVariant(Reference.UnlocalizedName.DRIPSTONE_BLOCK_GLOWING, Blocks.DRIPSTONE_BLOCK, "pickaxe", new ResourceLocation("minecraft", "block/dripstone_block"));
        registerVanillaVariant(Reference.UnlocalizedName.EMERALD_BLOCK_GLOWING, Blocks.EMERALD_BLOCK, "pickaxe", new ResourceLocation("minecraft", "block/emerald_block"));
        registerVanillaVariant(Reference.UnlocalizedName.END_STONE_BRICKS_GLOWING, Blocks.END_STONE_BRICKS, "pickaxe", new ResourceLocation("minecraft", "block/end_stone_bricks"));
        registerVanillaVariant(Reference.UnlocalizedName.END_STONE_GLOWING, Blocks.END_STONE, "pickaxe", new ResourceLocation("minecraft", "block/end_stone"));
        registerVanillaVariant(Reference.UnlocalizedName.GILDED_BLACKSTONE_GLOWING, Blocks.GILDED_BLACKSTONE, "pickaxe", new ResourceLocation("minecraft", "block/gilded_blackstone"));
        registerVanillaVariant(Reference.UnlocalizedName.GOLD_BLOCK_GLOWING, Blocks.GOLD_BLOCK, "pickaxe", new ResourceLocation("minecraft", "block/gold_block"));
        registerVanillaVariant(Reference.UnlocalizedName.GRANITE_GLOWING, Blocks.GRANITE,"pickaxe", new ResourceLocation("minecraft", "block/granite"));
        registerVanillaVariant(Reference.UnlocalizedName.GRAY_CONCRETE_GLOWING, Blocks.GRAY_CONCRETE, "pickaxe", new ResourceLocation("minecraft", "block/gray_concrete"));
        registerVanillaVariant(Reference.UnlocalizedName.GRAY_TERRACOTTA_GLOWING, Blocks.GRAY_TERRACOTTA, "pickaxe", new ResourceLocation("minecraft", "block/gray_terracotta"));
        registerVanillaVariant(Reference.UnlocalizedName.GRAY_WOOL_GLOWING, Blocks.GRAY_WOOL, "none", new ResourceLocation("minecraft", "block/gray_wool"));
        registerVanillaVariant(Reference.UnlocalizedName.GREEN_CONCRETE_GLOWING, Blocks.GREEN_CONCRETE, "pickaxe", new ResourceLocation("minecraft", "block/green_concrete"));
        registerVanillaVariant(Reference.UnlocalizedName.GREEN_TERRACOTTA_GLOWING, Blocks.GREEN_TERRACOTTA, "pickaxe", new ResourceLocation("minecraft", "block/green_terracotta"));
        registerVanillaVariant(Reference.UnlocalizedName.GREEN_WOOL_GLOWING, Blocks.GREEN_WOOL, "none", new ResourceLocation("minecraft", "block/green_wool"));
        registerVanillaVariant(Reference.UnlocalizedName.HONEYCOMB_BLOCK_GLOWING, Blocks.HONEYCOMB_BLOCK, "pickaxe", new ResourceLocation("minecraft", "block/honeycomb_block"));
        registerVanillaVariant(Reference.UnlocalizedName.IRON_BLOCK_GLOWING, Blocks.IRON_BLOCK, "pickaxe", new ResourceLocation("minecraft", "block/iron_block"));
        registerVanillaVariant(Reference.UnlocalizedName.JUNGLE_PLANKS_GLOWING, Blocks.JUNGLE_PLANKS, "axe", new ResourceLocation("minecraft", "block/jungle_planks"));
        registerVanillaVariant(Reference.UnlocalizedName.LAPIS_BLOCK_GLOWING, Blocks.LAPIS_BLOCK, "pickaxe", new ResourceLocation("minecraft", "block/lapis_block"));
        registerVanillaVariant(Reference.UnlocalizedName.LIGHT_BLUE_CONCRETE_GLOWING, Blocks.LIGHT_BLUE_CONCRETE, "pickaxe", new ResourceLocation("minecraft", "block/light_blue_concrete"));
        registerVanillaVariant(Reference.UnlocalizedName.LIGHT_BLUE_TERRACOTTA_GLOWING, Blocks.LIGHT_BLUE_TERRACOTTA, "pickaxe", new ResourceLocation("minecraft", "block/light_blue_terracotta"));
        registerVanillaVariant(Reference.UnlocalizedName.LIGHT_BLUE_WOOL_GLOWING, Blocks.LIGHT_BLUE_WOOL, "none", new ResourceLocation("minecraft", "block/light_blue_wool"));
        registerVanillaVariant(Reference.UnlocalizedName.LIGHT_GRAY_CONCRETE_GLOWING, Blocks.LIGHT_GRAY_CONCRETE, "pickaxe", new ResourceLocation("minecraft", "block/light_gray_concrete"));
        registerVanillaVariant(Reference.UnlocalizedName.LIGHT_GRAY_TERRACOTTA_GLOWING, Blocks.LIGHT_GRAY_TERRACOTTA, "pickaxe", new ResourceLocation("minecraft", "block/light_gray_terracotta"));
        registerVanillaVariant(Reference.UnlocalizedName.LIGHT_GRAY_WOOL_GLOWING, Blocks.LIGHT_GRAY_WOOL, "none", new ResourceLocation("minecraft", "block/light_gray_wool"));
        registerVanillaVariant(Reference.UnlocalizedName.LIME_CONCRETE_GLOWING, Blocks.LIME_CONCRETE, "pickaxe", new ResourceLocation("minecraft", "block/lime_concrete"));
        registerVanillaVariant(Reference.UnlocalizedName.LIME_TERRACOTTA_GLOWING, Blocks.LIME_TERRACOTTA, "pickaxe", new ResourceLocation("minecraft", "block/lime_terracotta"));
        registerVanillaVariant(Reference.UnlocalizedName.LIME_WOOL_GLOWING, Blocks.LIME_WOOL, "none", new ResourceLocation("minecraft", "block/lime_wool"));
        registerVanillaVariant(Reference.UnlocalizedName.LODESTONE_GLOWING, Blocks.LODESTONE, "pickaxe", new ResourceLocation("minecraft", "block/lodestone"), new ResourceLocation("minecraft", "block/lodestone_side"));
        registerVanillaVariant(Reference.UnlocalizedName.MAGENTA_CONCRETE_GLOWING, Blocks.MAGENTA_CONCRETE, "pickaxe", new ResourceLocation("minecraft", "block/magenta_concrete"));
        registerVanillaVariant(Reference.UnlocalizedName.MAGENTA_TERRACOTTA_GLOWING, Blocks.MAGENTA_TERRACOTTA, "pickaxe", new ResourceLocation("minecraft", "block/magenta_terracotta"));
        registerVanillaVariant(Reference.UnlocalizedName.MAGENTA_WOOL_GLOWING, Blocks.MAGENTA_WOOL, "none", new ResourceLocation("minecraft", "block/magenta_wool"));
        registerVanillaVariant(Reference.UnlocalizedName.MANGROVE_PLANKS_GLOWING, Blocks.MANGROVE_PLANKS, "axe", new ResourceLocation("minecraft", "block/mangrove_planks"));
        registerVanillaVariant(Reference.UnlocalizedName.MOSSY_COBBLESTONE_GLOWING, Blocks.MOSSY_COBBLESTONE, "pickaxe", new ResourceLocation("minecraft", "block/mossy_cobblestone"));
        registerVanillaVariant(Reference.UnlocalizedName.MOSSY_STONE_BRICKS_GLOWING, Blocks.MOSSY_STONE_BRICKS, "pickaxe", new ResourceLocation("minecraft", "block/mossy_stone_bricks"));
        registerVanillaVariant(Reference.UnlocalizedName.MUD_BRICKS_GLOWING, Blocks.MUD_BRICKS, "pickaxe", new ResourceLocation("minecraft", "block/mud_bricks"));
        registerVanillaVariant(Reference.UnlocalizedName.NETHERITE_BLOCK_GLOWING, Blocks.NETHERITE_BLOCK, "pickaxe", new ResourceLocation("minecraft", "block/netherite_block"));
        registerVanillaVariant(Reference.UnlocalizedName.NETHER_BRICKS_GLOWING, Blocks.NETHER_BRICKS, "pickaxe", new ResourceLocation("minecraft", "block/nether_bricks"));
        registerVanillaVariant(Reference.UnlocalizedName.NETHER_WART_BLOCK_GLOWING, Blocks.NETHER_WART_BLOCK, "pickaxe", new ResourceLocation("minecraft", "block/nether_wart_block"));
        registerVanillaVariant(Reference.UnlocalizedName.OAK_PLANKS_GLOWING, Blocks.OAK_PLANKS, "axe", new ResourceLocation("minecraft", "block/oak_planks"));
        registerVanillaVariant(Reference.UnlocalizedName.OBSIDIAN_GLOWING, Blocks.OBSIDIAN, "pickaxe", new ResourceLocation("minecraft", "block/obsidian"));
        registerVanillaVariant(Reference.UnlocalizedName.ORANGE_CONCRETE_GLOWING, Blocks.ORANGE_CONCRETE, "pickaxe", new ResourceLocation("minecraft", "block/orange_concrete"));
        registerVanillaVariant(Reference.UnlocalizedName.ORANGE_TERRACOTTA_GLOWING, Blocks.ORANGE_TERRACOTTA, "pickaxe", new ResourceLocation("minecraft", "block/orange_terracotta"));
        registerVanillaVariant(Reference.UnlocalizedName.ORANGE_WOOL_GLOWING, Blocks.ORANGE_WOOL, "none", new ResourceLocation("minecraft", "block/orange_wool"));
        registerVanillaVariant(Reference.UnlocalizedName.PACKED_ICE_GLOWING, Blocks.PACKED_ICE, "pickaxe", new ResourceLocation("minecraft", "block/packed_ice"));
        registerVanillaVariant(Reference.UnlocalizedName.PACKED_MUD_GLOWING, Blocks.PACKED_MUD, "shovel", new ResourceLocation("minecraft", "block/packed_mud"));
        registerVanillaVariant(Reference.UnlocalizedName.PINK_CONCRETE_GLOWING, Blocks.PINK_CONCRETE, "pickaxe", new ResourceLocation("minecraft", "block/pink_concrete"));
        registerVanillaVariant(Reference.UnlocalizedName.PINK_TERRACOTTA_GLOWING, Blocks.PINK_TERRACOTTA, "pickaxe", new ResourceLocation("minecraft", "block/pink_terracotta"));
        registerVanillaVariant(Reference.UnlocalizedName.PINK_WOOL_GLOWING, Blocks.PINK_WOOL, "none", new ResourceLocation("minecraft", "block/pink_wool"));
        registerVanillaVariant(Reference.UnlocalizedName.POLISHED_ANDESITE_GLOWING, Blocks.POLISHED_ANDESITE, "pickaxe", new ResourceLocation("minecraft", "block/polished_andesite"));
        registerVanillaVariant(Reference.UnlocalizedName.POLISHED_BLACKSTONE_BRICKS_GLOWING, Blocks.POLISHED_BLACKSTONE_BRICKS, "pickaxe", new ResourceLocation("minecraft", "block/polished_blackstone_bricks"));
        registerVanillaVariant(Reference.UnlocalizedName.POLISHED_BLACKSTONE_GLOWING, Blocks.POLISHED_BLACKSTONE, "pickaxe", new ResourceLocation("minecraft", "block/polished_blackstone"));
        registerVanillaVariant(Reference.UnlocalizedName.POLISHED_DEEPSLATE_GLOWING, Blocks.POLISHED_DEEPSLATE, "pickaxe", new ResourceLocation("minecraft", "block/polished_deepslate"));
        registerVanillaVariant(Reference.UnlocalizedName.POLISHED_GRANITE_GLOWING, Blocks.POLISHED_GRANITE,"pickaxe", new ResourceLocation("minecraft", "block/polished_granite"));
        registerVanillaVariant(Reference.UnlocalizedName.PRISMARINE_BRICKS_GLOWING, Blocks.PRISMARINE_BRICKS, "pickaxe", new ResourceLocation("minecraft", "block/prismarine_bricks"));
        registerVanillaVariant(Reference.UnlocalizedName.PRISMARINE_GLOWING, Blocks.PRISMARINE, "pickaxe", new ResourceLocation("minecraft", "block/prismarine"));
        registerVanillaVariant(Reference.UnlocalizedName.PURPLE_CONCRETE_GLOWING, Blocks.PURPLE_CONCRETE, "pickaxe", new ResourceLocation("minecraft", "block/purple_concrete"));
        registerVanillaVariant(Reference.UnlocalizedName.PURPLE_TERRACOTTA_GLOWING, Blocks.PURPLE_TERRACOTTA, "pickaxe", new ResourceLocation("minecraft", "block/purple_terracotta"));
        registerVanillaVariant(Reference.UnlocalizedName.PURPLE_WOOL_GLOWING, Blocks.PURPLE_WOOL, "none", new ResourceLocation("minecraft", "block/purple_wool"));
        registerVanillaVariant(Reference.UnlocalizedName.PURPUR_BLOCK_GLOWING, Blocks.PURPUR_BLOCK, "pickaxe", new ResourceLocation("minecraft", "block/purpur_block"));
        registerVanillaVariant(Reference.UnlocalizedName.PURPUR_PILLAR_GLOWING, Blocks.PURPUR_PILLAR, "pickaxe", new ResourceLocation("minecraft", "block/purpur_pillar"));
        registerVanillaVariant(Reference.UnlocalizedName.QUARTZ_BLOCK_GLOWING, Blocks.QUARTZ_BLOCK, "pickaxe", new ResourceLocation("minecraft", "block/quartz_block"), new ResourceLocation("minecraft", "block/quartz_block_side"));
        registerVanillaVariant(Reference.UnlocalizedName.QUARTZ_BRICKS_GLOWING, Blocks.QUARTZ_BRICKS, "pickaxe", new ResourceLocation("minecraft", "block/quartz_bricks"));
        registerVanillaVariant(Reference.UnlocalizedName.RAW_COPPER_BLOCK_GLOWING, Blocks.RAW_COPPER_BLOCK, "pickaxe", new ResourceLocation("minecraft", "block/raw_copper_block"));
        registerVanillaVariant(Reference.UnlocalizedName.RAW_GOLD_BLOCK_GLOWING, Blocks.RAW_GOLD_BLOCK, "pickaxe", new ResourceLocation("minecraft", "block/raw_gold_block"));
        registerVanillaVariant(Reference.UnlocalizedName.RAW_IRON_BLOCK_GLOWING, Blocks.RAW_IRON_BLOCK, "pickaxe", new ResourceLocation("minecraft", "block/raw_iron_block"));
        registerVanillaVariant(Reference.UnlocalizedName.RED_CONCRETE_GLOWING, Blocks.RED_CONCRETE, "pickaxe", new ResourceLocation("minecraft", "block/red_concrete"));
        registerVanillaVariant(Reference.UnlocalizedName.RED_NETHER_BRICKS_GLOWING, Blocks.RED_NETHER_BRICKS, "pickaxe", new ResourceLocation("minecraft", "block/red_nether_bricks"));
        registerVanillaVariant(Reference.UnlocalizedName.RED_SANDSTONE_GLOWING, Blocks.RED_SANDSTONE, "pickaxe", new ResourceLocation("minecraft", "block/red_sandstone"));
        registerVanillaVariant(Reference.UnlocalizedName.RED_TERRACOTTA_GLOWING, Blocks.RED_TERRACOTTA, "pickaxe", new ResourceLocation("minecraft", "block/red_terracotta"));
        registerVanillaVariant(Reference.UnlocalizedName.RED_WOOL_GLOWING, Blocks.RED_WOOL, "none", new ResourceLocation("minecraft", "block/red_wool"));
        registerVanillaVariant(Reference.UnlocalizedName.REINFORCED_DEEPSLATE_GLOWING, Blocks.REINFORCED_DEEPSLATE, "pickaxe", new ResourceLocation("minecraft", "block/reinforced_deepslate"), new ResourceLocation("minecraft", "block/reinforced_deepslate_side"));
        registerVanillaVariant(Reference.UnlocalizedName.SANDSTONE_GLOWING, Blocks.SANDSTONE, "pickaxe", new ResourceLocation("minecraft", "block/sandstone"));
        registerVanillaVariant(Reference.UnlocalizedName.SMOOTH_BASALT_GLOWING, Blocks.SMOOTH_BASALT, "pickaxe", new ResourceLocation("minecraft", "block/smooth_basalt"));
        registerVanillaVariant(Reference.UnlocalizedName.SMOOTH_QUARTZ_GLOWING, Blocks.SMOOTH_QUARTZ, "pickaxe", new ResourceLocation("minecraft", "block/smooth_quartz"), new ResourceLocation("minecraft", "block/quartz_block_bottom"));
        registerVanillaVariant(Reference.UnlocalizedName.SMOOTH_RED_SANDSTONE_GLOWING, Blocks.SMOOTH_RED_SANDSTONE, "pickaxe", new ResourceLocation("minecraft", "block/smooth_red_sandstone"), new ResourceLocation("minecraft", "block/red_sandstone_top"));
        registerVanillaVariant(Reference.UnlocalizedName.SMOOTH_SANDSTONE_GLOWING, Blocks.SMOOTH_SANDSTONE, "pickaxe", new ResourceLocation("minecraft", "block/smooth_sandstone"), new ResourceLocation("minecraft", "block/sandstone_top"));
        registerVanillaVariant(Reference.UnlocalizedName.SMOOTH_STONE_GLOWING, Blocks.SMOOTH_STONE, "pickaxe", new ResourceLocation("minecraft", "block/smooth_stone"));
        registerVanillaVariant(Reference.UnlocalizedName.SNOW_BLOCK_GLOWING, Blocks.SNOW_BLOCK, "shovel", new ResourceLocation("minecraft", "block/snow_block"), new ResourceLocation("minecraft", "block/snow"));
        registerVanillaVariant(Reference.UnlocalizedName.SOUL_SOIL_GLOWING, Blocks.SOUL_SOIL, "shovel", new ResourceLocation("minecraft", "block/soul_soil"));
        registerVanillaVariant(Reference.UnlocalizedName.SPRUCE_PLANKS_GLOWING, Blocks.SPRUCE_PLANKS, "axe", new ResourceLocation("minecraft", "block/spruce_planks"));
        registerVanillaVariant(Reference.UnlocalizedName.STONE_BRICKS_GLOWING, Blocks.STONE_BRICKS, "pickaxe", new ResourceLocation("minecraft", "block/stone_bricks"));
        registerVanillaVariant(Reference.UnlocalizedName.STONE_GLOWING, Blocks.STONE,"pickaxe", new ResourceLocation("minecraft", "block/stone"));
        registerVanillaVariant(Reference.UnlocalizedName.TERRACOTTA_GLOWING, Blocks.TERRACOTTA, "pickaxe", new ResourceLocation("minecraft", "block/terracotta"));
        registerVanillaVariant(Reference.UnlocalizedName.TUFF_GLOWING, Blocks.TUFF, "pickaxe", new ResourceLocation("minecraft", "block/tuff"));
        registerVanillaVariant(Reference.UnlocalizedName.WARPED_PLANKS_GLOWING, Blocks.WARPED_PLANKS, "axe", new ResourceLocation("minecraft", "block/warped_planks"));
        registerVanillaVariant(Reference.UnlocalizedName.WARPED_WART_BLOCK_GLOWING, Blocks.WARPED_WART_BLOCK, "pickaxe", new ResourceLocation("minecraft", "block/warped_wart_block"));
        registerVanillaVariant(Reference.UnlocalizedName.WAXED_COPPER_BLOCK_GLOWING, Blocks.WAXED_COPPER_BLOCK, "pickaxe", new ResourceLocation("minecraft", "block/copper_block"));
        registerVanillaVariant(Reference.UnlocalizedName.WAXED_CUT_COPPER_GLOWING, Blocks.WAXED_CUT_COPPER, "pickaxe", new ResourceLocation("minecraft", "block/cut_copper"));
        registerVanillaVariant(Reference.UnlocalizedName.WAXED_EXPOSED_COPPER_GLOWING, Blocks.WAXED_EXPOSED_COPPER, "pickaxe", new ResourceLocation("minecraft", "block/exposed_copper"));
        registerVanillaVariant(Reference.UnlocalizedName.WAXED_EXPOSED_CUT_COPPER_GLOWING, Blocks.WAXED_EXPOSED_CUT_COPPER, "pickaxe", new ResourceLocation("minecraft", "block/exposed_cut_copper"));
        registerVanillaVariant(Reference.UnlocalizedName.WAXED_OXIDIZED_COPPER_GLOWING, Blocks.WAXED_OXIDIZED_COPPER, "pickaxe", new ResourceLocation("minecraft", "block/oxidized_copper"));
        registerVanillaVariant(Reference.UnlocalizedName.WAXED_OXIDIZED_CUT_COPPER_GLOWING, Blocks.WAXED_OXIDIZED_CUT_COPPER, "pickaxe", new ResourceLocation("minecraft", "block/oxidized_cut_copper"));
        registerVanillaVariant(Reference.UnlocalizedName.WAXED_WEATHERED_COPPER_GLOWING, Blocks.WAXED_WEATHERED_COPPER, "pickaxe", new ResourceLocation("minecraft", "block/weathered_copper"));
        registerVanillaVariant(Reference.UnlocalizedName.WAXED_WEATHERED_CUT_COPPER_GLOWING, Blocks.WAXED_WEATHERED_CUT_COPPER, "pickaxe", new ResourceLocation("minecraft", "block/weathered_cut_copper"));
        registerVanillaVariant(Reference.UnlocalizedName.WHITE_CONCRETE_GLOWING, Blocks.WHITE_CONCRETE, "pickaxe", new ResourceLocation("minecraft", "block/white_concrete"));
        registerVanillaVariant(Reference.UnlocalizedName.WHITE_TERRACOTTA_GLOWING, Blocks.WHITE_TERRACOTTA, "pickaxe", new ResourceLocation("minecraft", "block/white_terracotta"));
        registerVanillaVariant(Reference.UnlocalizedName.WHITE_WOOL_GLOWING, Blocks.WHITE_WOOL, Reference.ToolTypeNames.NONE, new ResourceLocation("minecraft", "block/white_wool"));
        registerVanillaVariant(Reference.UnlocalizedName.YELLOW_CONCRETE_GLOWING, Blocks.YELLOW_CONCRETE, Reference.ToolTypeNames.PICKAXE, new ResourceLocation("minecraft", "block/yellow_concrete"));
        registerVanillaVariant(Reference.UnlocalizedName.YELLOW_TERRACOTTA_GLOWING, Blocks.YELLOW_TERRACOTTA, Reference.ToolTypeNames.PICKAXE, new ResourceLocation("minecraft", "block/yellow_terracotta"));
        registerVanillaVariant(Reference.UnlocalizedName.YELLOW_WOOL_GLOWING, Blocks.YELLOW_WOOL, Reference.ToolTypeNames.NONE, new ResourceLocation("minecraft", "block/yellow_wool"));
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

    /**
     * Registration of Glowing Variants for Vanilla Stairs. Includes handling of BlockState, Block Model, Item Model, Recipe, and Lang files.
     *
     * @param name String of unlocalized registry name.
     * @param block Block to be cloned as a Glowing Block
     * @param toolType ToolTypeNames of the tool needed to loot.
     * @param modelLocation ResourceLocation of the model to clone from.
     */
    private static void registerVanillaGlowingStairVariant(String name, Block block, Reference.ToolTypeNames toolType, ResourceLocation modelLocation) {
        RegistryObject<Block> GLOWING_STAIR_BLOCK = registerBlock(name,
                () -> new GlowingStairBlock(block.defaultBlockState(), BlockBehaviour.Properties.copy(block))
        );

        GLOWING_STAIR_BLOCKS.put(name, GLOWING_STAIR_BLOCK);

        GLOWING_BLOCKS_RECIPE_MAP.put(GLOWING_STAIR_BLOCK, block);

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

    private static void registerVanillaGlowingBlockVariant(String name, Block block, String toolType, ResourceLocation modelLocation) {
        // Set block type for the doors based on tool type.
        BlockSetType blockSetType = toolType.equals("axe") ? BlockSetType.OAK : BlockSetType.STONE;

        // Glowing Block Variant Registration
        RegistryObject<Block> GLOWING_BLOCK = registerBlock(name,
                () -> new Block(BlockBehaviour.Properties.copy(block).lightLevel((p_50874_) -> 15))
        );

        GLOWING_VANILLA_BLOCKS.put(name, GLOWING_BLOCK);
        GLOWING_BLOCKS_RECIPE_MAP.put(GLOWING_BLOCK, block);

        if (toolType.equals("axe")) {
            BLOCKS_MINEABLE_AXE.put(name, GLOWING_BLOCK);
        } else if (toolType.equals("pickaxe")) {
            BLOCKS_MINEABLE_PICKAXE.put(name, GLOWING_BLOCK);
        }

        GLOWING_VANILLA_BLOCK_STATE_MAP.put(GLOWING_BLOCK, modelLocation);
        Reference.LocalizedNames.GLOWING_BLOCKS_EN_US.put(
                String.format("block.%s", GLOWING_BLOCK.getId().toString().replace(":", ".")),
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
        RegistryObject<Block> DOOR_BLOCK = registerBlock(name,
                () -> new HiddenDoorBlock(BlockBehaviour.Properties.copy(block), blockSetType)
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

    private static RegistryObject<Block> registerBlock(String name, Supplier<Block> block) {
        RegistryObject<Block> registryObject = BLOCKS.register(name, block);
        if (!excludeBlockItemRegistry(registryObject.getId())) {
            registerBlockItem(name, registryObject);
        }
        return registryObject;
    }

    private static void registerBlockItem(String unlocalizedName, RegistryObject<Block> blockRegistryObject) {
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
