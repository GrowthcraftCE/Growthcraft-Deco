package growthcraft.deco.init;

import growthcraft.deco.block.*;
import growthcraft.deco.shared.Reference;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.function.Supplier;

public class GrowthcraftDecoBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Reference.MODID);

    public static final RegistryObject<Block> CONCRETE_STAIRS_BLACK = registerBlock(
            Reference.UnlocalizedName.STAIRS_CONCRETE_BLACK,
            ConcreteStairBlock::new
    );
    public static final RegistryObject<Block> CONCRETE_STAIRS_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIRS_CONCRETE_BLUE,
            ConcreteStairBlock::new
    );
    public static final RegistryObject<Block> CONCRETE_STAIRS_BROWN = registerBlock(
            Reference.UnlocalizedName.STAIRS_CONCRETE_BROWN,
            ConcreteStairBlock::new
    );
    public static final RegistryObject<Block> CONCRETE_STAIRS_CYAN = registerBlock(
            Reference.UnlocalizedName.STAIRS_CONCRETE_CYAN,
            ConcreteStairBlock::new
    );
    public static final RegistryObject<Block> CONCRETE_STAIRS_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIRS_CONCRETE_GRAY,
            ConcreteStairBlock::new
    );
    public static final RegistryObject<Block> CONCRETE_STAIRS_GREEN = registerBlock(
            Reference.UnlocalizedName.STAIRS_CONCRETE_GREEN,
            ConcreteStairBlock::new
    );
    public static final RegistryObject<Block> CONCRETE_STAIRS_LIGHT_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIRS_CONCRETE_LIGHT_BLUE,
            ConcreteStairBlock::new
    );
    public static final RegistryObject<Block> CONCRETE_STAIRS_LIGHT_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIRS_CONCRETE_LIGHT_GRAY,
            ConcreteStairBlock::new
    );
    public static final RegistryObject<Block> CONCRETE_STAIRS_LIME = registerBlock(
            Reference.UnlocalizedName.STAIRS_CONCRETE_LIME,
            ConcreteStairBlock::new
    );
    public static final RegistryObject<Block> CONCRETE_STAIRS_MAGENTA = registerBlock(
            Reference.UnlocalizedName.STAIRS_CONCRETE_MAGENTA,
            ConcreteStairBlock::new
    );
    public static final RegistryObject<Block> CONCRETE_STAIRS_ORANGE = registerBlock(
            Reference.UnlocalizedName.STAIRS_CONCRETE_ORANGE,
            ConcreteStairBlock::new
    );
    public static final RegistryObject<Block> CONCRETE_STAIRS_PINK = registerBlock(
            Reference.UnlocalizedName.STAIRS_CONCRETE_PINK,
            ConcreteStairBlock::new
    );
    public static final RegistryObject<Block> CONCRETE_STAIRS_PURPLE = registerBlock(
            Reference.UnlocalizedName.STAIRS_CONCRETE_PURPLE,
            ConcreteStairBlock::new
    );
    public static final RegistryObject<Block> CONCRETE_STAIRS_RED = registerBlock(
            Reference.UnlocalizedName.STAIRS_CONCRETE_RED,
            ConcreteStairBlock::new
    );
    public static final RegistryObject<Block> CONCRETE_STAIRS_WHITE = registerBlock(
            Reference.UnlocalizedName.STAIRS_CONCRETE_WHITE,
            ConcreteStairBlock::new
    );
    public static final RegistryObject<Block> CONCRETE_STAIRS_YELLOW = registerBlock(
            Reference.UnlocalizedName.STAIRS_CONCRETE_YELLOW,
            ConcreteStairBlock::new
    );

    public static final RegistryObject<Block> GLASS_PANEL_BLACK = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_BLACK,
            GlassPanel::new
    );
    public static final RegistryObject<Block> GLASS_PANEL_BLACK_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_BLACK_GLOWING,
            () -> new GlassPanel(15)
    );
    public static final RegistryObject<Block> GLASS_PANEL_BLUE = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_BLUE,
            GlassPanel::new
    );
    public static final RegistryObject<Block> GLASS_PANEL_BLUE_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_BLUE_GLOWING,
            () -> new GlassPanel(15)
    );
    public static final RegistryObject<Block> GLASS_PANEL_BROWN = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_BROWN,
            GlassPanel::new
    );
    public static final RegistryObject<Block> GLASS_PANEL_BROWN_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_BROWN_GLOWING,
            () -> new GlassPanel(15)
    );
    public static final RegistryObject<Block> GLASS_PANEL_CLEAR = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_CLEAR,
            GlassPanel::new
    );
    public static final RegistryObject<Block> GLASS_PANEL_CLEAR_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_CLEAR_GLOWING,
            () -> new GlassPanel(15)
    );
    public static final RegistryObject<Block> GLASS_PANEL_CYAN = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_CYAN,
            GlassPanel::new
    );
    public static final RegistryObject<Block> GLASS_PANEL_CYAN_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_CYAN_GLOWING,
            () -> new GlassPanel(15)
    );
    public static final RegistryObject<Block> GLASS_PANEL_GRAY = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_GRAY,
            GlassPanel::new
    );
    public static final RegistryObject<Block> GLASS_PANEL_GRAY_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_GRAY_GLOWING,
            () -> new GlassPanel(15)
    );
    public static final RegistryObject<Block> GLASS_PANEL_GREEN = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_GREEN,
            GlassPanel::new
    );
    public static final RegistryObject<Block> GLASS_PANEL_GREEN_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_GREEN_GLOWING,
            () -> new GlassPanel(15)
    );
    public static final RegistryObject<Block> GLASS_PANEL_LIGHT_BLUE = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_LIGHT_BLUE,
            GlassPanel::new
    );
    public static final RegistryObject<Block> GLASS_PANEL_LIGHT_BLUE_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_LIGHT_BLUE_GLOWING,
            () -> new GlassPanel(15)
    );
    public static final RegistryObject<Block> GLASS_PANEL_LIGHT_GRAY = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_LIGHT_GRAY,
            GlassPanel::new
    );
    public static final RegistryObject<Block> GLASS_PANEL_LIGHT_GRAY_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_LIGHT_GRAY_GLOWING,
            () -> new GlassPanel(15)
    );
    public static final RegistryObject<Block> GLASS_PANEL_LIME = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_LIME,
            GlassPanel::new
    );
    public static final RegistryObject<Block> GLASS_PANEL_LIME_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_LIME_GLOWING,
            () -> new GlassPanel(15)
    );
    public static final RegistryObject<Block> GLASS_PANEL_MAGENTA = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_MAGENTA,
            GlassPanel::new
    );
    public static final RegistryObject<Block> GLASS_PANEL_MAGENTA_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_MAGENTA_GLOWING,
            () -> new GlassPanel(15)
    );
    public static final RegistryObject<Block> GLASS_PANEL_ORANGE = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_ORANGE,
            GlassPanel::new
    );
    public static final RegistryObject<Block> GLASS_PANEL_ORANGE_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_ORANGE_GLOWING,
            () -> new GlassPanel(15)
    );
    public static final RegistryObject<Block> GLASS_PANEL_PINK = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_PINK,
            GlassPanel::new
    );
    public static final RegistryObject<Block> GLASS_PANEL_PINK_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_PINK_GLOWING,
            () -> new GlassPanel(15)
    );
    public static final RegistryObject<Block> GLASS_PANEL_PURPLE = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_PURPLE,
            GlassPanel::new
    );
    public static final RegistryObject<Block> GLASS_PANEL_PURPLE_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_PURPLE_GLOWING,
            () -> new GlassPanel(15)
    );
    public static final RegistryObject<Block> GLASS_PANEL_RED = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_RED,
            GlassPanel::new
    );
    public static final RegistryObject<Block> GLASS_PANEL_RED_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_RED_GLOWING,
            () -> new GlassPanel(15)
    );
    public static final RegistryObject<Block> GLASS_PANEL_WHITE = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_WHITE,
            GlassPanel::new
    );
    public static final RegistryObject<Block> GLASS_PANEL_WHITE_GLOWING = registerBlock(
            Reference.UnlocalizedName.GLASS_PANEL_WHITE_GLOWING,
            () -> new GlassPanel(15)
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
    public static final RegistryObject<Block> TERRACOTTA_STAIRS_BLACK = registerBlock(
            Reference.UnlocalizedName.STAIRS_TERRACOTTA_BLACK,
            TerracottaStairBlock::new
    );
    public static final RegistryObject<Block> TERRACOTTA_STAIRS_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIRS_TERRACOTTA_BLUE,
            TerracottaStairBlock::new
    );
    public static final RegistryObject<Block> TERRACOTTA_STAIRS_BROWN = registerBlock(
            Reference.UnlocalizedName.STAIRS_TERRACOTTA_BROWN,
            TerracottaStairBlock::new
    );
    public static final RegistryObject<Block> TERRACOTTA_STAIRS_CYAN = registerBlock(
            Reference.UnlocalizedName.STAIRS_TERRACOTTA_CYAN,
            TerracottaStairBlock::new
    );
    public static final RegistryObject<Block> TERRACOTTA_STAIRS_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIRS_TERRACOTTA_GRAY,
            TerracottaStairBlock::new
    );
    public static final RegistryObject<Block> TERRACOTTA_STAIRS_GREEN = registerBlock(
            Reference.UnlocalizedName.STAIRS_TERRACOTTA_GREEN,
            TerracottaStairBlock::new
    );
    public static final RegistryObject<Block> TERRACOTTA_STAIRS_LIGHT_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIRS_TERRACOTTA_LIGHT_BLUE,
            TerracottaStairBlock::new
    );
    public static final RegistryObject<Block> TERRACOTTA_STAIRS_LIGHT_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIRS_TERRACOTTA_LIGHT_GRAY,
            TerracottaStairBlock::new
    );
    public static final RegistryObject<Block> TERRACOTTA_STAIRS_LIME = registerBlock(
            Reference.UnlocalizedName.STAIRS_TERRACOTTA_LIME,
            TerracottaStairBlock::new
    );
    public static final RegistryObject<Block> TERRACOTTA_STAIRS_MAGENTA = registerBlock(
            Reference.UnlocalizedName.STAIRS_TERRACOTTA_MAGENTA,
            TerracottaStairBlock::new
    );
    public static final RegistryObject<Block> TERRACOTTA_STAIRS_ORANGE = registerBlock(
            Reference.UnlocalizedName.STAIRS_TERRACOTTA_ORANGE,
            TerracottaStairBlock::new
    );
    public static final RegistryObject<Block> TERRACOTTA_STAIRS_PINK = registerBlock(
            Reference.UnlocalizedName.STAIRS_TERRACOTTA_PINK,
            TerracottaStairBlock::new
    );
    public static final RegistryObject<Block> TERRACOTTA_STAIRS_PURPLE = registerBlock(
            Reference.UnlocalizedName.STAIRS_TERRACOTTA_PURPLE,
            TerracottaStairBlock::new
    );
    public static final RegistryObject<Block> TERRACOTTA_STAIRS_RED = registerBlock(
            Reference.UnlocalizedName.STAIRS_TERRACOTTA_RED,
            TerracottaStairBlock::new
    );
    public static final RegistryObject<Block> TERRACOTTA_STAIRS_WHITE = registerBlock(
            Reference.UnlocalizedName.STAIRS_TERRACOTTA_WHITE,
            TerracottaStairBlock::new
    );
    public static final RegistryObject<Block> TERRACOTTA_STAIRS_YELLOW = registerBlock(
            Reference.UnlocalizedName.STAIRS_TERRACOTTA_YELLOW,
            TerracottaStairBlock::new
    );
    public static final RegistryObject<Block> WOOL_STAIRS_BLACK = registerBlock(
            Reference.UnlocalizedName.STAIRS_WOOL_BLACK,
            WoolStairBlock::new
    );
    public static final RegistryObject<Block> WOOL_STAIRS_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIRS_WOOL_BLUE,
            WoolStairBlock::new
    );
    public static final RegistryObject<Block> WOOL_STAIRS_BROWN = registerBlock(
            Reference.UnlocalizedName.STAIRS_WOOL_BROWN,
            WoolStairBlock::new
    );
    public static final RegistryObject<Block> WOOL_STAIRS_CYAN = registerBlock(
            Reference.UnlocalizedName.STAIRS_WOOL_CYAN,
            WoolStairBlock::new
    );
    public static final RegistryObject<Block> WOOL_STAIRS_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIRS_WOOL_GRAY,
            WoolStairBlock::new
    );
    public static final RegistryObject<Block> WOOL_STAIRS_GREEN = registerBlock(
            Reference.UnlocalizedName.STAIRS_WOOL_GREEN,
            WoolStairBlock::new
    );
    public static final RegistryObject<Block> WOOL_STAIRS_LIGHT_BLUE = registerBlock(
            Reference.UnlocalizedName.STAIRS_WOOL_LIGHT_BLUE,
            WoolStairBlock::new
    );
    public static final RegistryObject<Block> WOOL_STAIRS_LIGHT_GRAY = registerBlock(
            Reference.UnlocalizedName.STAIRS_WOOL_LIGHT_GRAY,
            WoolStairBlock::new
    );
    public static final RegistryObject<Block> WOOL_STAIRS_LIME = registerBlock(
            Reference.UnlocalizedName.STAIRS_WOOL_LIME,
            WoolStairBlock::new
    );
    public static final RegistryObject<Block> WOOL_STAIRS_MAGENTA = registerBlock(
            Reference.UnlocalizedName.STAIRS_WOOL_MAGENTA,
            WoolStairBlock::new
    );
    public static final RegistryObject<Block> WOOL_STAIRS_ORANGE = registerBlock(
            Reference.UnlocalizedName.STAIRS_WOOL_ORANGE,
            WoolStairBlock::new
    );
    public static final RegistryObject<Block> WOOL_STAIRS_PINK = registerBlock(
            Reference.UnlocalizedName.STAIRS_WOOL_PINK,
            WoolStairBlock::new
    );
    public static final RegistryObject<Block> WOOL_STAIRS_PURPLE = registerBlock(
            Reference.UnlocalizedName.STAIRS_WOOL_PURPLE,
            WoolStairBlock::new
    );
    public static final RegistryObject<Block> WOOL_STAIRS_RED = registerBlock(
            Reference.UnlocalizedName.STAIRS_WOOL_RED,
            WoolStairBlock::new
    );
    public static final RegistryObject<Block> WOOL_STAIRS_WHITE = registerBlock(
            Reference.UnlocalizedName.STAIRS_WOOL_WHITE,
            WoolStairBlock::new
    );
    public static final RegistryObject<Block> WOOL_STAIRS_YELLOW = registerBlock(
            Reference.UnlocalizedName.STAIRS_WOOL_YELLOW,
            WoolStairBlock::new
    );

    // GrowthcraftDecoBlocks entry
    // blockstate json
    // block model json
    // item model json
    // loot_table json

    public static final RegistryObject<Block> STAIR_OAK_GLOWING = registerBlock(
            Reference.UnlocalizedName.STAIR_OAK_GLOWING,
            () -> new GlowingStairBlock(Blocks.OAK_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS))
    );

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
        properties.tab(Reference.CREATIVE_TAB);
        return properties;
    }

    private static boolean excludeBlockItemRegistry(ResourceLocation registryName) {
        ArrayList<String> excludeBlocks = new ArrayList<>();
        //excludeBlocks.add(Reference.MODID + ":" + Reference.UnlocalizedName.APPLE_TREE_FRUIT);
        return excludeBlocks.contains(registryName.toString());
    }

}
