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
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Supplier;

public class GrowthcraftDecoBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Reference.MODID);

    public static HashMap<String, RegistryObject<Block>> GLOWING_VANILLA_BLOCKS = new HashMap<>();
    public static HashMap<String, RegistryObject<Block>> GLOWING_VANILLA_BLOCKS_MINEABLE_PICKAXE = new HashMap<>();
    public static HashMap<String, RegistryObject<Block>> GLOWING_VANILLA_BLOCKS_MINEABLE_AXE = new HashMap<>();

    /**
     * HashMap used for dynamically building the recipe json files using the data generator.
     */
    public static HashMap<RegistryObject<Block>, Block> GLOWING_VANILLA_RECIPE_BLOCK_MAP = new HashMap<>();
    public static HashMap<RegistryObject<Block>, ResourceLocation> GLOWING_VANILLA_BLOCK_STATE_MAP = new HashMap<>();


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

    public static final RegistryObject<Block> STAIR_OAK_GLOWING = registerBlock(
            Reference.UnlocalizedName.STAIR_OAK_GLOWING,
            () -> new GlowingStairBlock(Blocks.OAK_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS))
    );

    public static final RegistryObject<Block> STAIR_SPRUCE_GLOWING = registerBlock(
            Reference.UnlocalizedName.STAIR_SPRUCE_GLOWING,
            () -> new GlowingStairBlock(Blocks.SPRUCE_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SPRUCE_STAIRS))
    );

    public static final RegistryObject<Block> STAIR_BAMBOO_GLOWING = registerBlock(
            Reference.UnlocalizedName.STAIR_BAMBOO_GLOWING,
            () -> new GlowingStairBlock(Blocks.BAMBOO_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BIRCH_STAIRS))
    );

    public static final RegistryObject<Block> STAIR_BAMBOO_MOSAIC_GLOWING = registerBlock(
            Reference.UnlocalizedName.STAIR_BAMBOO_MOSAIC_GLOWING,
            () -> new GlowingStairBlock(Blocks.BAMBOO_MOSAIC_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BIRCH_STAIRS))
    );

    public static final RegistryObject<Block> STAIR_BIRCH_GLOWING = registerBlock(
            Reference.UnlocalizedName.STAIR_BIRCH_GLOWING,
            () -> new GlowingStairBlock(Blocks.BIRCH_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BIRCH_STAIRS))
    );

    public static final RegistryObject<Block> STAIR_JUNGLE_GLOWING = registerBlock(
            Reference.UnlocalizedName.STAIR_JUNGLE_GLOWING,
            () -> new GlowingStairBlock(Blocks.JUNGLE_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.JUNGLE_STAIRS))
    );

    public static final RegistryObject<Block> STAIR_ACACIA_GLOWING = registerBlock(
            Reference.UnlocalizedName.STAIR_ACACIA_GLOWING,
            () -> new GlowingStairBlock(Blocks.ACACIA_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ACACIA_STAIRS))
    );

    public static final RegistryObject<Block> STAIR_DARK_OAK_GLOWING = registerBlock(
            Reference.UnlocalizedName.STAIR_DARK_OAK_GLOWING,
            () -> new GlowingStairBlock(Blocks.DARK_OAK_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DARK_OAK_STAIRS))
    );

    public static final RegistryObject<Block> STAIR_MANGROVE_GLOWING = registerBlock(
            Reference.UnlocalizedName.STAIR_MANGROVE_GLOWING,
            () -> new GlowingStairBlock(Blocks.MANGROVE_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.MANGROVE_STAIRS))
    );

    public static final RegistryObject<Block> STAIR_DARK_PRISMARINE_GLOWING = registerBlock(
            Reference.UnlocalizedName.STAIR_DARK_PRISMARINE_GLOWING,
            () -> new GlowingStairBlock(Blocks.DARK_PRISMARINE_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE_STAIRS))
    );

    public static final RegistryObject<Block> STAIR_PRISMARINE_GLOWING = registerBlock(
            Reference.UnlocalizedName.STAIR_PRISMARINE_GLOWING,
            () -> new GlowingStairBlock(Blocks.PRISMARINE_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.PRISMARINE_STAIRS))
    );

    public static final RegistryObject<Block> STAIR_PRISMARINE_BRICK_GLOWING = registerBlock(
            Reference.UnlocalizedName.STAIR_PRISMARINE_BRICK_GLOWING,
            () -> new GlowingStairBlock(Blocks.PRISMARINE_BRICK_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.PRISMARINE_BRICK_STAIRS))
    );

    public static final RegistryObject<Block> STAIR_COBBLESTONE_GLOWING = registerBlock(
            Reference.UnlocalizedName.STAIR_COBBLESTONE_GLOWING,
            () -> new GlowingStairBlock(Blocks.COBBLESTONE_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.COBBLESTONE_STAIRS))
    );

    public static final RegistryObject<Block> STAIR_SANDSTONE_GLOWING = registerBlock(
            Reference.UnlocalizedName.STAIR_SANDSTONE_GLOWING,
            () -> new GlowingStairBlock(Blocks.SANDSTONE_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SANDSTONE_STAIRS))
    );

    public static final RegistryObject<Block> STAIR_RED_SANDSTONE_GLOWING = registerBlock(
            Reference.UnlocalizedName.STAIR_RED_SANDSTONE_GLOWING,
            () -> new GlowingStairBlock(Blocks.RED_SANDSTONE_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.RED_SANDSTONE_STAIRS))
    );

    public static final RegistryObject<Block> STAIR_BRICK_GLOWING = registerBlock(
            Reference.UnlocalizedName.STAIR_BRICK_GLOWING,
            () -> new GlowingStairBlock(Blocks.BRICK_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS))
    );

    public static final RegistryObject<Block> STAIR_STONE_BRICK_GLOWING = registerBlock(
            Reference.UnlocalizedName.STAIR_STONE_BRICK_GLOWING,
            () -> new GlowingStairBlock(Blocks.STONE_BRICK_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_STAIRS))
    );

    public static final RegistryObject<Block> STAIR_MUD_BRICK_GLOWING = registerBlock(
            Reference.UnlocalizedName.STAIR_MUD_BRICK_GLOWING,
            () -> new GlowingStairBlock(Blocks.MUD_BRICK_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.MUD_BRICK_STAIRS))
    );

    public static final RegistryObject<Block> STAIR_NETHER_BRICK_GLOWING = registerBlock(
            Reference.UnlocalizedName.STAIR_NETHER_BRICK_GLOWING,
            () -> new GlowingStairBlock(Blocks.NETHER_BRICK_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.NETHER_BRICK_STAIRS))
    );

    public static final RegistryObject<Block> STAIR_WARPED_GLOWING = registerBlock(
            Reference.UnlocalizedName.STAIR_WARPED_GLOWING,
            () -> new GlowingStairBlock(Blocks.WARPED_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.WARPED_STAIRS))
    );

    public static final RegistryObject<Block> STAIR_CRIMSON_GLOWING = registerBlock(
            Reference.UnlocalizedName.STAIR_CRIMSON_GLOWING,
            () -> new GlowingStairBlock(Blocks.CRIMSON_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CRIMSON_STAIRS))
    );

    public static final RegistryObject<Block> STAIR_QUARTZ_GLOWING = registerBlock(
            Reference.UnlocalizedName.STAIR_QUARTZ_GLOWING,
            () -> new GlowingStairBlock(Blocks.QUARTZ_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.QUARTZ_STAIRS))
    );

    public static final RegistryObject<Block> STAIR_PURPUR_GLOWING = registerBlock(
            Reference.UnlocalizedName.STAIR_PURPUR_GLOWING,
            () -> new GlowingStairBlock(Blocks.PURPUR_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.PURPUR_STAIRS))
    );

    public static final RegistryObject<Block> STAIR_POLISHED_GRANITE_GLOWING = registerBlock(
            Reference.UnlocalizedName.STAIR_POLISHED_GRANITE_GLOWING,
            () -> new GlowingStairBlock(Blocks.POLISHED_GRANITE_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.POLISHED_GRANITE_STAIRS))
    );

    public static final RegistryObject<Block> STAIR_SMOOTH_RED_SANDSTONE_GLOWING = registerBlock(
            Reference.UnlocalizedName.STAIR_SMOOTH_RED_SANDSTONE_GLOWING,
            () -> new GlowingStairBlock(Blocks.SMOOTH_RED_SANDSTONE_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SMOOTH_RED_SANDSTONE_STAIRS))
    );

    public static final RegistryObject<Block> STAIR_MOSSY_STONE_BRICK_GLOWING = registerBlock(
            Reference.UnlocalizedName.STAIR_MOSSY_STONE_BRICK_GLOWING,
            () -> new GlowingStairBlock(Blocks.MOSSY_STONE_BRICK_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.MOSSY_STONE_BRICK_STAIRS))
    );

    public static final RegistryObject<Block> STAIR_POLISHED_DIORITE_GLOWING = registerBlock(
            Reference.UnlocalizedName.STAIR_POLISHED_DIORITE_GLOWING,
            () -> new GlowingStairBlock(Blocks.POLISHED_DIORITE_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.POLISHED_DIORITE_STAIRS))
    );

    public static final RegistryObject<Block> STAIR_MOSSY_COBBLESTONE_GLOWING = registerBlock(
            Reference.UnlocalizedName.STAIR_MOSSY_COBBLESTONE_GLOWING,
            () -> new GlowingStairBlock(Blocks.MOSSY_COBBLESTONE_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.MOSSY_COBBLESTONE_STAIRS))
    );

    public static final RegistryObject<Block> STAIR_END_STONE_BRICK_GLOWING = registerBlock(
            Reference.UnlocalizedName.STAIR_END_STONE_BRICK_GLOWING,
            () -> new GlowingStairBlock(Blocks.END_STONE_BRICK_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.END_STONE_BRICK_STAIRS))
    );

    public static final RegistryObject<Block> STAIR_STONE_GLOWING = registerBlock(
            Reference.UnlocalizedName.STAIR_STONE_GLOWING,
            () -> new GlowingStairBlock(Blocks.STONE_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS))
    );

    public static final RegistryObject<Block> STAIR_SMOOTH_SANDSTONE_GLOWING = registerBlock(
            Reference.UnlocalizedName.STAIR_SMOOTH_SANDSTONE_GLOWING,
            () -> new GlowingStairBlock(Blocks.SMOOTH_SANDSTONE_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SMOOTH_SANDSTONE_STAIRS))
    );

    public static final RegistryObject<Block> STAIR_SMOOTH_QUARTZ_GLOWING = registerBlock(
            Reference.UnlocalizedName.STAIR_SMOOTH_QUARTZ_GLOWING,
            () -> new GlowingStairBlock(Blocks.SMOOTH_QUARTZ_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SMOOTH_QUARTZ_STAIRS))
    );

    public static final RegistryObject<Block> STAIR_GRANITE_GLOWING = registerBlock(
            Reference.UnlocalizedName.STAIR_GRANITE_GLOWING,
            () -> new GlowingStairBlock(Blocks.GRANITE_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.GRANITE_STAIRS))
    );

    public static final RegistryObject<Block> STAIR_ANDESITE_GLOWING = registerBlock(
            Reference.UnlocalizedName.STAIR_ANDESITE_GLOWING,
            () -> new GlowingStairBlock(Blocks.ANDESITE_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ANDESITE_STAIRS))
    );

    public static final RegistryObject<Block> STAIR_RED_NETHER_BRICK_GLOWING = registerBlock(
            Reference.UnlocalizedName.STAIR_RED_NETHER_BRICK_GLOWING,
            () -> new GlowingStairBlock(Blocks.RED_NETHER_BRICK_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.RED_NETHER_BRICK_STAIRS))
    );

    public static final RegistryObject<Block> STAIR_POLISHED_ANDESITE_GLOWING = registerBlock(
            Reference.UnlocalizedName.STAIR_POLISHED_ANDESITE_GLOWING,
            () -> new GlowingStairBlock(Blocks.POLISHED_ANDESITE_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.POLISHED_ANDESITE_STAIRS))
    );

    public static final RegistryObject<Block> STAIR_DIORITE_GLOWING = registerBlock(
            Reference.UnlocalizedName.STAIR_DIORITE_GLOWING,
            () -> new GlowingStairBlock(Blocks.DIORITE_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DIORITE_STAIRS))
    );

    public static final RegistryObject<Block> STAIR_BLACKSTONE_GLOWING = registerBlock(
            Reference.UnlocalizedName.STAIR_BLACKSTONE_GLOWING,
            () -> new GlowingStairBlock(Blocks.BLACKSTONE_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BLACKSTONE_STAIRS))
    );

    public static final RegistryObject<Block> STAIR_POLISHED_BLACKSTONE_GLOWING = registerBlock(
            Reference.UnlocalizedName.STAIR_POLISHED_BLACKSTONE_GLOWING,
            () -> new GlowingStairBlock(Blocks.POLISHED_BLACKSTONE_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE_STAIRS))
    );

    public static final RegistryObject<Block> STAIR_POLISHED_BLACKSTONE_BRICK_GLOWING = registerBlock(
            Reference.UnlocalizedName.STAIR_POLISHED_BLACKSTONE_BRICK_GLOWING,
            () -> new GlowingStairBlock(Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS))
    );

    public static final RegistryObject<Block> STAIR_CUT_COPPER_GLOWING = registerBlock(
            Reference.UnlocalizedName.STAIR_CUT_COPPER_GLOWING,
            () -> new GlowingStairBlock(Blocks.CUT_COPPER_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CUT_COPPER_STAIRS))
    );

    public static final RegistryObject<Block> STAIR_EXPOSED_CUT_COPPER_GLOWING = registerBlock(
            Reference.UnlocalizedName.STAIR_EXPOSED_CUT_COPPER_GLOWING,
            () -> new GlowingStairBlock(Blocks.EXPOSED_CUT_COPPER_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.EXPOSED_CUT_COPPER_STAIRS))
    );

    public static final RegistryObject<Block> STAIR_WEATHERED_CUT_COPPER_GLOWING = registerBlock(
            Reference.UnlocalizedName.STAIR_WEATHERED_CUT_COPPER_GLOWING,
            () -> new GlowingStairBlock(Blocks.WEATHERED_CUT_COPPER_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.WEATHERED_CUT_COPPER_STAIRS))
    );

    public static final RegistryObject<Block> STAIR_OXIDIZED_CUT_COPPER_GLOWING = registerBlock(
            Reference.UnlocalizedName.STAIR_OXIDIZED_CUT_COPPER_GLOWING,
            () -> new GlowingStairBlock(Blocks.OXIDIZED_CUT_COPPER_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OXIDIZED_CUT_COPPER_STAIRS))
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

    public static final RegistryObject<Block> STAIR_COBBLED_DEEPSLATE_GLOWING = registerBlock(
            Reference.UnlocalizedName.STAIR_COBBLED_DEEPSLATE_GLOWING,
            () -> new GlowingStairBlock(Blocks.COBBLED_DEEPSLATE_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE_STAIRS))
    );

    public static final RegistryObject<Block> STAIR_POLISHED_DEEPSLATE_GLOWING = registerBlock(
            Reference.UnlocalizedName.STAIR_POLISHED_DEEPSLATE_GLOWING,
            () -> new GlowingStairBlock(Blocks.POLISHED_DEEPSLATE_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.POLISHED_DEEPSLATE_STAIRS))
    );

    public static final RegistryObject<Block> STAIR_DEEPSLATE_BRICK_GLOWING = registerBlock(
            Reference.UnlocalizedName.STAIR_DEEPSLATE_BRICK_GLOWING,
            () -> new GlowingStairBlock(Blocks.DEEPSLATE_BRICK_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICK_STAIRS))
    );

    public static final RegistryObject<Block> STAIR_DEEPSLATE_TILE_GLOWING = registerBlock(
            Reference.UnlocalizedName.STAIR_DEEPSLATE_TILE_GLOWING,
            () -> new GlowingStairBlock(Blocks.DEEPSLATE_TILE_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_TILE_STAIRS))
    );

    // TODO: Simple Vanilla Block Clones (Glowing)
    static {
        registerVanillaBlockVariant(Reference.UnlocalizedName.STONE_GLOWING, Blocks.STONE,
                "pickaxe", new ResourceLocation("minecraft", "block/stone"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.GRANITE_GLOWING, Blocks.GRANITE,
                "pickaxe", new ResourceLocation("minecraft", "block/granite"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.POLISHED_GRANITE_GLOWING, Blocks.POLISHED_GRANITE,
                "pickaxe", new ResourceLocation("minecraft", "block/polished_granite"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.ANDESITE_GLOWING, Blocks.ANDESITE,
                "pickaxe", new ResourceLocation("minecraft", "block/andesite"));

        registerVanillaBlockVariant(Reference.UnlocalizedName.POLISHED_ANDESITE_GLOWING, Blocks.POLISHED_ANDESITE, "pickaxe", new ResourceLocation("minecraft", "block/polished_andesite"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.DIRT_GLOWING, Blocks.DIRT, "shovel", new ResourceLocation("minecraft", "block/dirt"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.COARSE_DIRT_GLOWING, Blocks.COARSE_DIRT, "shovel", new ResourceLocation("minecraft", "block/coarse_dirt"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.COBBLESTONE_GLOWING, Blocks.COBBLESTONE, "pickaxe", new ResourceLocation("minecraft", "block/cobblestone"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.OAK_PLANKS_GLOWING, Blocks.OAK_PLANKS, "axe", new ResourceLocation("minecraft", "block/oak_planks"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.SPRUCE_PLANKS_GLOWING, Blocks.SPRUCE_PLANKS, "axe", new ResourceLocation("minecraft", "block/spruce_planks"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.BIRCH_PLANKS_GLOWING, Blocks.BIRCH_PLANKS, "axe", new ResourceLocation("minecraft", "block/birch_planks"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.JUNGLE_PLANKS_GLOWING, Blocks.JUNGLE_PLANKS, "axe", new ResourceLocation("minecraft", "block/jungle_planks"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.ACACIA_PLANKS_GLOWING, Blocks.ACACIA_PLANKS, "axe", new ResourceLocation("minecraft", "block/acacia_planks"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.CHERRY_PLANKS_GLOWING, Blocks.CHERRY_PLANKS, "axe", new ResourceLocation("minecraft", "block/cherry_planks"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.DARK_OAK_PLANKS_GLOWING, Blocks.DARK_OAK_PLANKS, "axe", new ResourceLocation("minecraft", "block/dark_oak_planks"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.MANGROVE_PLANKS_GLOWING, Blocks.MANGROVE_PLANKS, "axe", new ResourceLocation("minecraft", "block/mangrove_planks"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.BAMBOO_PLANKS_GLOWING, Blocks.BAMBOO_PLANKS, "axe", new ResourceLocation("minecraft", "block/bamboo_planks"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.BAMBOO_MOSAIC_GLOWING, Blocks.BAMBOO_MOSAIC, "axe", new ResourceLocation("minecraft", "block/bamboo_mosaic"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.LAPIS_BLOCK_GLOWING, Blocks.LAPIS_BLOCK, "pickaxe", new ResourceLocation("minecraft", "block/lapis_block"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.SANDSTONE_GLOWING, Blocks.SANDSTONE, "pickaxe", new ResourceLocation("minecraft", "block/sandstone"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.CHISELED_SANDSTONE_GLOWING, Blocks.CHISELED_SANDSTONE, "pickaxe", new ResourceLocation("minecraft", "block/chiseled_sandstone"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.CUT_SANDSTONE_GLOWING, Blocks.CUT_SANDSTONE, "pickaxe", new ResourceLocation("minecraft", "block/cut_sandstone"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.WHITE_WOOL_GLOWING, Blocks.WHITE_WOOL, "none", new ResourceLocation("minecraft", "block/white_wool"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.ORANGE_WOOL_GLOWING, Blocks.ORANGE_WOOL, "none", new ResourceLocation("minecraft", "block/orange_wool"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.MAGENTA_WOOL_GLOWING, Blocks.MAGENTA_WOOL, "none", new ResourceLocation("minecraft", "block/magenta_wool"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.LIGHT_BLUE_WOOL_GLOWING, Blocks.LIGHT_BLUE_WOOL, "none", new ResourceLocation("minecraft", "block/light_blue_wool"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.YELLOW_WOOL_GLOWING, Blocks.YELLOW_WOOL, "none", new ResourceLocation("minecraft", "block/yellow_wool"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.LIME_WOOL_GLOWING, Blocks.LIME_WOOL, "none", new ResourceLocation("minecraft", "block/lime_wool"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.PINK_WOOL_GLOWING, Blocks.PINK_WOOL, "none", new ResourceLocation("minecraft", "block/pink_wool"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.GRAY_WOOL_GLOWING, Blocks.GRAY_WOOL, "none", new ResourceLocation("minecraft", "block/gray_wool"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.LIGHT_GRAY_WOOL_GLOWING, Blocks.LIGHT_GRAY_WOOL, "none", new ResourceLocation("minecraft", "block/light_gray_wool"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.CYAN_WOOL_GLOWING, Blocks.CYAN_WOOL, "none", new ResourceLocation("minecraft", "block/cyan_wool"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.PURPLE_WOOL_GLOWING, Blocks.PURPLE_WOOL, "none", new ResourceLocation("minecraft", "block/purple_wool"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.BLUE_WOOL_GLOWING, Blocks.BLUE_WOOL, "none", new ResourceLocation("minecraft", "block/blue_wool"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.BROWN_WOOL_GLOWING, Blocks.BROWN_WOOL, "none", new ResourceLocation("minecraft", "block/brown_wool"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.GREEN_WOOL_GLOWING, Blocks.GREEN_WOOL, "none", new ResourceLocation("minecraft", "block/green_wool"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.RED_WOOL_GLOWING, Blocks.RED_WOOL, "none", new ResourceLocation("minecraft", "block/red_wool"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.BLACK_WOOL_GLOWING, Blocks.BLACK_WOOL, "none", new ResourceLocation("minecraft", "block/black_wool"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.GOLD_BLOCK_GLOWING, Blocks.GOLD_BLOCK, "pickaxe", new ResourceLocation("minecraft", "block/gold_block"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.IRON_BLOCK_GLOWING, Blocks.IRON_BLOCK, "pickaxe", new ResourceLocation("minecraft", "block/iron_block"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.BRICKS_GLOWING, Blocks.BRICKS, "pickaxe", new ResourceLocation("minecraft", "block/bricks"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.BOOKSHELF_GLOWING, Blocks.BOOKSHELF, "axe", new ResourceLocation("minecraft", "block/bookshelf"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.MOSSY_COBBLESTONE_GLOWING, Blocks.MOSSY_COBBLESTONE, "pickaxe", new ResourceLocation("minecraft", "block/mossy_cobblestone"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.OBSIDIAN_GLOWING, Blocks.OBSIDIAN, "pickaxe", new ResourceLocation("minecraft", "block/obsidian"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.DIAMOND_BLOCK_GLOWING, Blocks.DIAMOND_BLOCK, "pickaxe", new ResourceLocation("minecraft", "block/diamond_block"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.SNOW_BLOCK_GLOWING, Blocks.SNOW_BLOCK, "shovel", new ResourceLocation("minecraft", "block/snow_block"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.CLAY_GLOWING, Blocks.CLAY, "shovel", new ResourceLocation("minecraft", "block/clay"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.SOUL_SOIL_GLOWING, Blocks.SOUL_SOIL, "shovel", new ResourceLocation("minecraft", "block/soul_soil"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.STONE_BRICKS_GLOWING, Blocks.STONE_BRICKS, "pickaxe", new ResourceLocation("minecraft", "block/stone_bricks"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.MOSSY_STONE_BRICKS_GLOWING, Blocks.MOSSY_STONE_BRICKS, "pickaxe", new ResourceLocation("minecraft", "block/mossy_stone_bricks"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.CRACKED_STONE_BRICKS_GLOWING, Blocks.CRACKED_STONE_BRICKS, "pickaxe", new ResourceLocation("minecraft", "block/cracked_stone_bricks"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.CHISELED_STONE_BRICKS_GLOWING, Blocks.CHISELED_STONE_BRICKS, "pickaxe", new ResourceLocation("minecraft", "block/chiseled_stone_bricks"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.PACKED_MUD_GLOWING, Blocks.PACKED_MUD, "shovel", new ResourceLocation("minecraft", "block/packed_mud"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.MUD_BRICKS_GLOWING, Blocks.MUD_BRICKS, "pickaxe", new ResourceLocation("minecraft", "block/mud_bricks"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.NETHER_BRICKS_GLOWING, Blocks.NETHER_BRICKS, "pickaxe", new ResourceLocation("minecraft", "block/nether_bricks"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.END_STONE_GLOWING, Blocks.END_STONE, "pickaxe", new ResourceLocation("minecraft", "block/end_stone"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.EMERALD_BLOCK_GLOWING, Blocks.EMERALD_BLOCK, "pickaxe", new ResourceLocation("minecraft", "block/emerald_block"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.QUARTZ_BLOCK_GLOWING, Blocks.QUARTZ_BLOCK, "pickaxe", new ResourceLocation("minecraft", "block/quartz_block"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.CHISELED_QUARTZ_BLOCK_GLOWING, Blocks.CHISELED_QUARTZ_BLOCK, "pickaxe", new ResourceLocation("minecraft", "block/chiseled_quartz_block"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.BLACK_TERRACOTTA_GLOWING, Blocks.BLACK_TERRACOTTA, "pickaxe", new ResourceLocation("minecraft", "block/black_terracotta"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.BLUE_TERRACOTTA_GLOWING, Blocks.BLUE_TERRACOTTA, "pickaxe", new ResourceLocation("minecraft", "block/blue_terracotta"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.BROWN_TERRACOTTA_GLOWING, Blocks.BROWN_TERRACOTTA, "pickaxe", new ResourceLocation("minecraft", "block/brown_terracotta"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.CYAN_TERRACOTTA_GLOWING, Blocks.CYAN_TERRACOTTA, "pickaxe", new ResourceLocation("minecraft", "block/cyan_terracotta"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.GRAY_TERRACOTTA_GLOWING, Blocks.GRAY_TERRACOTTA, "pickaxe", new ResourceLocation("minecraft", "block/gray_terracotta"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.GREEN_TERRACOTTA_GLOWING, Blocks.GREEN_TERRACOTTA, "pickaxe", new ResourceLocation("minecraft", "block/green_terracotta"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.LIGHT_BLUE_TERRACOTTA_GLOWING, Blocks.LIGHT_BLUE_TERRACOTTA, "pickaxe", new ResourceLocation("minecraft", "block/light_blue_terracotta"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.LIGHT_GRAY_TERRACOTTA_GLOWING, Blocks.LIGHT_GRAY_TERRACOTTA, "pickaxe", new ResourceLocation("minecraft", "block/light_gray_terracotta"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.LIME_TERRACOTTA_GLOWING, Blocks.LIME_TERRACOTTA, "pickaxe", new ResourceLocation("minecraft", "block/lime_terracotta"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.MAGENTA_TERRACOTTA_GLOWING, Blocks.MAGENTA_TERRACOTTA, "pickaxe", new ResourceLocation("minecraft", "block/magenta_terracotta"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.ORANGE_TERRACOTTA_GLOWING, Blocks.ORANGE_TERRACOTTA, "pickaxe", new ResourceLocation("minecraft", "block/orange_terracotta"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.PINK_TERRACOTTA_GLOWING, Blocks.PINK_TERRACOTTA, "pickaxe", new ResourceLocation("minecraft", "block/pink_terracotta"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.PURPLE_TERRACOTTA_GLOWING, Blocks.PURPLE_TERRACOTTA, "pickaxe", new ResourceLocation("minecraft", "block/purple_terracotta"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.RED_TERRACOTTA_GLOWING, Blocks.RED_TERRACOTTA, "pickaxe", new ResourceLocation("minecraft", "block/red_terracotta"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.WHITE_TERRACOTTA_GLOWING, Blocks.WHITE_TERRACOTTA, "pickaxe", new ResourceLocation("minecraft", "block/white_terracotta"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.YELLOW_TERRACOTTA_GLOWING, Blocks.YELLOW_TERRACOTTA, "pickaxe", new ResourceLocation("minecraft", "block/yellow_terracotta"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.PRISMARINE_GLOWING, Blocks.PRISMARINE, "pickaxe", new ResourceLocation("minecraft", "block/prismarine"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.PRISMARINE_BRICKS_GLOWING, Blocks.PRISMARINE_BRICKS, "pickaxe", new ResourceLocation("minecraft", "block/prismarine_bricks"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.DARK_PRISMARINE_GLOWING, Blocks.DARK_PRISMARINE, "pickaxe", new ResourceLocation("minecraft", "block/dark_prismarine"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.TERRACOTTA_GLOWING, Blocks.TERRACOTTA, "pickaxe", new ResourceLocation("minecraft", "block/terracotta"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.COAL_BLOCK_GLOWING, Blocks.COAL_BLOCK, "pickaxe", new ResourceLocation("minecraft", "block/coal_block"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.PACKED_ICE_GLOWING, Blocks.PACKED_ICE, "pickaxe", new ResourceLocation("minecraft", "block/packed_ice"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.RED_SANDSTONE_GLOWING, Blocks.RED_SANDSTONE, "pickaxe", new ResourceLocation("minecraft", "block/red_sandstone"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.CHISELED_RED_SANDSTONE_GLOWING, Blocks.CHISELED_RED_SANDSTONE, "pickaxe", new ResourceLocation("minecraft", "block/chiseled_red_sandstone"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.CUT_RED_SANDSTONE_GLOWING, Blocks.CUT_RED_SANDSTONE, "pickaxe", new ResourceLocation("minecraft", "block/cut_red_sandstone"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.SMOOTH_STONE_GLOWING, Blocks.SMOOTH_STONE, "pickaxe", new ResourceLocation("minecraft", "block/smooth_stone"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.SMOOTH_SANDSTONE_GLOWING, Blocks.SMOOTH_SANDSTONE, "pickaxe", new ResourceLocation("minecraft", "block/smooth_sandstone"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.SMOOTH_QUARTZ_GLOWING, Blocks.SMOOTH_QUARTZ, "pickaxe", new ResourceLocation("minecraft", "block/smooth_quartz"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.SMOOTH_RED_SANDSTONE_GLOWING, Blocks.SMOOTH_RED_SANDSTONE, "pickaxe", new ResourceLocation("minecraft", "block/smooth_red_sandstone"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.PURPUR_BLOCK_GLOWING, Blocks.PURPUR_BLOCK, "pickaxe", new ResourceLocation("minecraft", "block/purpur_block"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.PURPUR_PILLAR_GLOWING, Blocks.PURPUR_PILLAR, "pickaxe", new ResourceLocation("minecraft", "block/purpur_pillar"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.END_STONE_BRICKS_GLOWING, Blocks.END_STONE_BRICKS, "pickaxe", new ResourceLocation("minecraft", "block/end_stone_bricks"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.NETHER_WART_BLOCK_GLOWING, Blocks.NETHER_WART_BLOCK, "pickaxe", new ResourceLocation("minecraft", "block/nether_wart_block"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.RED_NETHER_BRICKS_GLOWING, Blocks.RED_NETHER_BRICKS, "pickaxe", new ResourceLocation("minecraft", "block/red_nether_bricks"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.BLACK_CONCRETE_GLOWING, Blocks.BLACK_CONCRETE, "pickaxe", new ResourceLocation("minecraft", "block/black_concrete"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.BLUE_CONCRETE_GLOWING, Blocks.BLUE_CONCRETE, "pickaxe", new ResourceLocation("minecraft", "block/blue_concrete"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.BROWN_CONCRETE_GLOWING, Blocks.BROWN_CONCRETE, "pickaxe", new ResourceLocation("minecraft", "block/brown_concrete"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.CYAN_CONCRETE_GLOWING, Blocks.CYAN_CONCRETE, "pickaxe", new ResourceLocation("minecraft", "block/cyan_concrete"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.GRAY_CONCRETE_GLOWING, Blocks.GRAY_CONCRETE, "pickaxe", new ResourceLocation("minecraft", "block/gray_concrete"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.GREEN_CONCRETE_GLOWING, Blocks.GREEN_CONCRETE, "pickaxe", new ResourceLocation("minecraft", "block/green_concrete"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.LIGHT_BLUE_CONCRETE_GLOWING, Blocks.LIGHT_BLUE_CONCRETE, "pickaxe", new ResourceLocation("minecraft", "block/light_blue_concrete"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.LIGHT_GRAY_CONCRETE_GLOWING, Blocks.LIGHT_GRAY_CONCRETE, "pickaxe", new ResourceLocation("minecraft", "block/light_gray_concrete"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.LIME_CONCRETE_GLOWING, Blocks.LIME_CONCRETE, "pickaxe", new ResourceLocation("minecraft", "block/lime_concrete"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.MAGENTA_CONCRETE_GLOWING, Blocks.MAGENTA_CONCRETE, "pickaxe", new ResourceLocation("minecraft", "block/magenta_concrete"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.ORANGE_CONCRETE_GLOWING, Blocks.ORANGE_CONCRETE, "pickaxe", new ResourceLocation("minecraft", "block/orange_concrete"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.PINK_CONCRETE_GLOWING, Blocks.PINK_CONCRETE, "pickaxe", new ResourceLocation("minecraft", "block/pink_concrete"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.PURPLE_CONCRETE_GLOWING, Blocks.PURPLE_CONCRETE, "pickaxe", new ResourceLocation("minecraft", "block/purple_concrete"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.RED_CONCRETE_GLOWING, Blocks.RED_CONCRETE, "pickaxe", new ResourceLocation("minecraft", "block/red_concrete"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.WHITE_CONCRETE_GLOWING, Blocks.WHITE_CONCRETE, "pickaxe", new ResourceLocation("minecraft", "block/white_concrete"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.YELLOW_CONCRETE_GLOWING, Blocks.YELLOW_CONCRETE, "pickaxe", new ResourceLocation("minecraft", "block/yellow_concrete"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.DRIED_KELP_BLOCK_GLOWING, Blocks.DRIED_KELP_BLOCK, "pickaxe", new ResourceLocation("minecraft", "block/dried_kelp_block"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.WARPED_WART_BLOCK_GLOWING, Blocks.WARPED_WART_BLOCK, "pickaxe", new ResourceLocation("minecraft", "block/warped_wart_block"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.CRIMSON_PLANKS_GLOWING, Blocks.CRIMSON_PLANKS, "axe", new ResourceLocation("minecraft", "block/crimson_planks"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.WARPED_PLANKS_GLOWING, Blocks.WARPED_PLANKS, "axe", new ResourceLocation("minecraft", "block/warped_planks"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.HONEYCOMB_BLOCK_GLOWING, Blocks.HONEYCOMB_BLOCK, "pickaxe", new ResourceLocation("minecraft", "block/honeycomb_block"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.NETHERITE_BLOCK_GLOWING, Blocks.NETHERITE_BLOCK, "pickaxe", new ResourceLocation("minecraft", "block/netherite_block"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.LODESTONE_GLOWING, Blocks.LODESTONE, "pickaxe", new ResourceLocation("minecraft", "block/lodestone"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.BLACKSTONE_GLOWING, Blocks.BLACKSTONE, "pickaxe", new ResourceLocation("minecraft", "block/blackstone"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.POLISHED_BLACKSTONE_GLOWING, Blocks.POLISHED_BLACKSTONE, "pickaxe", new ResourceLocation("minecraft", "block/polished_blackstone"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.POLISHED_BLACKSTONE_BRICKS_GLOWING, Blocks.POLISHED_BLACKSTONE_BRICKS, "pickaxe", new ResourceLocation("minecraft", "block/polished_blackstone_bricks"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.CRACKED_POLISHED_BLACKSTONE_BRICKS_GLOWING, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS, "pickaxe", new ResourceLocation("minecraft", "block/cracked_polished_blackstone_bricks"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.CHISELED_POLISHED_BLACKSTONE_GLOWING, Blocks.CHISELED_POLISHED_BLACKSTONE, "pickaxe", new ResourceLocation("minecraft", "block/chiseled_polished_blackstone"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.GILDED_BLACKSTONE_GLOWING, Blocks.GILDED_BLACKSTONE, "pickaxe", new ResourceLocation("minecraft", "block/gilded_blackstone"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.CHISELED_NETHER_BRICKS_GLOWING, Blocks.CHISELED_NETHER_BRICKS, "pickaxe", new ResourceLocation("minecraft", "block/chiseled_nether_bricks"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.CRACKED_NETHER_BRICKS_GLOWING, Blocks.CRACKED_NETHER_BRICKS, "pickaxe", new ResourceLocation("minecraft", "block/cracked_nether_bricks"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.QUARTZ_BRICKS_GLOWING, Blocks.QUARTZ_BRICKS, "pickaxe", new ResourceLocation("minecraft", "block/quartz_bricks"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.TUFF_GLOWING, Blocks.TUFF, "pickaxe", new ResourceLocation("minecraft", "block/tuff"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.CALCITE_GLOWING, Blocks.CALCITE, "pickaxe", new ResourceLocation("minecraft", "block/calcite"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.WAXED_COPPER_BLOCK_GLOWING, Blocks.WAXED_COPPER_BLOCK, "pickaxe", new ResourceLocation("minecraft", "block/copper_block"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.WAXED_WEATHERED_COPPER_GLOWING, Blocks.WAXED_WEATHERED_COPPER, "pickaxe", new ResourceLocation("minecraft", "block/weathered_copper"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.WAXED_EXPOSED_COPPER_GLOWING, Blocks.WAXED_EXPOSED_COPPER, "pickaxe", new ResourceLocation("minecraft", "block/exposed_copper"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.WAXED_OXIDIZED_COPPER_GLOWING, Blocks.WAXED_OXIDIZED_COPPER, "pickaxe", new ResourceLocation("minecraft", "block/oxidized_copper"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.WAXED_OXIDIZED_CUT_COPPER_GLOWING, Blocks.WAXED_OXIDIZED_CUT_COPPER, "pickaxe", new ResourceLocation("minecraft", "block/oxidized_cut_copper"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.WAXED_WEATHERED_CUT_COPPER_GLOWING, Blocks.WAXED_WEATHERED_CUT_COPPER, "pickaxe", new ResourceLocation("minecraft", "block/weathered_cut_copper"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.WAXED_EXPOSED_CUT_COPPER_GLOWING, Blocks.WAXED_EXPOSED_CUT_COPPER, "pickaxe", new ResourceLocation("minecraft", "block/exposed_cut_copper"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.WAXED_CUT_COPPER_GLOWING, Blocks.WAXED_CUT_COPPER, "pickaxe", new ResourceLocation("minecraft", "block/cut_copper"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.DRIPSTONE_BLOCK_GLOWING, Blocks.DRIPSTONE_BLOCK, "pickaxe", new ResourceLocation("minecraft", "block/dripstone_block"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.COBBLED_DEEPSLATE_GLOWING, Blocks.COBBLED_DEEPSLATE, "pickaxe", new ResourceLocation("minecraft", "block/cobbled_deepslate"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.POLISHED_DEEPSLATE_GLOWING, Blocks.POLISHED_DEEPSLATE, "pickaxe", new ResourceLocation("minecraft", "block/polished_deepslate"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.DEEPSLATE_TILES_GLOWING, Blocks.DEEPSLATE_TILES, "pickaxe", new ResourceLocation("minecraft", "block/deepslate_tiles"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.DEEPSLATE_BRICKS_GLOWING, Blocks.DEEPSLATE_BRICKS, "pickaxe", new ResourceLocation("minecraft", "block/deepslate_bricks"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.CHISELED_DEEPSLATE_GLOWING, Blocks.CHISELED_DEEPSLATE, "pickaxe", new ResourceLocation("minecraft", "block/chiseled_deepslate"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.CRACKED_DEEPSLATE_BRICKS_GLOWING, Blocks.CRACKED_DEEPSLATE_BRICKS, "pickaxe", new ResourceLocation("minecraft", "block/cracked_deepslate_bricks"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.CRACKED_DEEPSLATE_TILES_GLOWING, Blocks.CRACKED_DEEPSLATE_TILES, "pickaxe", new ResourceLocation("minecraft", "block/cracked_deepslate_tiles"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.SMOOTH_BASALT_GLOWING, Blocks.SMOOTH_BASALT, "pickaxe", new ResourceLocation("minecraft", "block/smooth_basalt"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.RAW_IRON_BLOCK_GLOWING, Blocks.RAW_IRON_BLOCK, "pickaxe", new ResourceLocation("minecraft", "block/raw_iron_block"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.RAW_COPPER_BLOCK_GLOWING, Blocks.RAW_COPPER_BLOCK, "pickaxe", new ResourceLocation("minecraft", "block/raw_copper_block"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.RAW_GOLD_BLOCK_GLOWING, Blocks.RAW_GOLD_BLOCK, "pickaxe", new ResourceLocation("minecraft", "block/raw_gold_block"));
        registerVanillaBlockVariant(Reference.UnlocalizedName.REINFORCED_DEEPSLATE_GLOWING, Blocks.REINFORCED_DEEPSLATE, "pickaxe", new ResourceLocation("minecraft", "block/reinforced_deepslate"));

        GLOWING_VANILLA_BLOCKS_MINEABLE_PICKAXE.put(Reference.UnlocalizedName.STAIR_QUARTZ_GLOWING, STAIR_QUARTZ_GLOWING);
        GLOWING_VANILLA_BLOCKS_MINEABLE_PICKAXE.put(Reference.UnlocalizedName.STAIR_SMOOTH_QUARTZ_GLOWING, STAIR_SMOOTH_QUARTZ_GLOWING);

    }


    private static RegistryObject<Block> registerVanillaBlockVariant(String name, Block block, String toolType, ResourceLocation modelLocation) {
        RegistryObject<Block> TEMP_BLOCK = registerBlock(name,
                () -> new Block(BlockBehaviour.Properties.copy(block).lightLevel((p_50874_) -> {
                    return 15;
                }))
        );

        GLOWING_VANILLA_BLOCKS.put(name, TEMP_BLOCK);
        GLOWING_VANILLA_RECIPE_BLOCK_MAP.put(TEMP_BLOCK, block);

        if (toolType.equals("axe")) {
            GLOWING_VANILLA_BLOCKS_MINEABLE_AXE.put(name, TEMP_BLOCK);
        } else if (toolType.equals("pickaxe")) {
            GLOWING_VANILLA_BLOCKS_MINEABLE_PICKAXE.put(name, TEMP_BLOCK);
        }

        GLOWING_VANILLA_BLOCK_STATE_MAP.put(TEMP_BLOCK, modelLocation);

        return TEMP_BLOCK;
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
        Item.Properties properties = new Item.Properties();
        //properties.tab(Reference.CREATIVE_TAB);
        return properties;
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
