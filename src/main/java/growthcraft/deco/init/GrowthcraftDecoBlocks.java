package growthcraft.deco.init;

import growthcraft.deco.GrowthcraftDeco;
import growthcraft.deco.common.block.*;
import growthcraft.deco.lib.block.CarpetStairBlock;
import growthcraft.deco.shared.Reference;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.RegistryObject;

public class GrowthcraftDecoBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Reference.MODID);

    public static final RegistryObject<ConcreteStairBlock> CONCRETE_STAIRS_BLACK = BLOCKS.register(
            Reference.UnlocalizedName.STAIRS_CONCRETE_BLACK,
            ConcreteStairBlock::new
    );
    public static final RegistryObject<ConcreteStairBlock> CONCRETE_STAIRS_BLUE = BLOCKS.register(
            Reference.UnlocalizedName.STAIRS_CONCRETE_BLUE,
            ConcreteStairBlock::new
    );
    public static final RegistryObject<ConcreteStairBlock> CONCRETE_STAIRS_BROWN = BLOCKS.register(
            Reference.UnlocalizedName.STAIRS_CONCRETE_BROWN,
            ConcreteStairBlock::new
    );
    public static final RegistryObject<ConcreteStairBlock> CONCRETE_STAIRS_CYAN = BLOCKS.register(
            Reference.UnlocalizedName.STAIRS_CONCRETE_CYAN,
            ConcreteStairBlock::new
    );
    public static final RegistryObject<ConcreteStairBlock> CONCRETE_STAIRS_GRAY = BLOCKS.register(
            Reference.UnlocalizedName.STAIRS_CONCRETE_GRAY,
            ConcreteStairBlock::new
    );
    public static final RegistryObject<ConcreteStairBlock> CONCRETE_STAIRS_GREEN = BLOCKS.register(
            Reference.UnlocalizedName.STAIRS_CONCRETE_GREEN,
            ConcreteStairBlock::new
    );
    public static final RegistryObject<ConcreteStairBlock> CONCRETE_STAIRS_LIGHT_BLUE = BLOCKS.register(
            Reference.UnlocalizedName.STAIRS_CONCRETE_LIGHT_BLUE,
            ConcreteStairBlock::new
    );
    public static final RegistryObject<ConcreteStairBlock> CONCRETE_STAIRS_LIGHT_GRAY = BLOCKS.register(
            Reference.UnlocalizedName.STAIRS_CONCRETE_LIGHT_GRAY,
            ConcreteStairBlock::new
    );
    public static final RegistryObject<ConcreteStairBlock> CONCRETE_STAIRS_LIME = BLOCKS.register(
            Reference.UnlocalizedName.STAIRS_CONCRETE_LIME,
            ConcreteStairBlock::new
    );
    public static final RegistryObject<ConcreteStairBlock> CONCRETE_STAIRS_MAGENTA = BLOCKS.register(
            Reference.UnlocalizedName.STAIRS_CONCRETE_MAGENTA,
            ConcreteStairBlock::new
    );
    public static final RegistryObject<ConcreteStairBlock> CONCRETE_STAIRS_ORANGE = BLOCKS.register(
            Reference.UnlocalizedName.STAIRS_CONCRETE_ORANGE,
            ConcreteStairBlock::new
    );
    public static final RegistryObject<ConcreteStairBlock> CONCRETE_STAIRS_PINK = BLOCKS.register(
            Reference.UnlocalizedName.STAIRS_CONCRETE_PINK,
            ConcreteStairBlock::new
    );
    public static final RegistryObject<ConcreteStairBlock> CONCRETE_STAIRS_PURPLE = BLOCKS.register(
            Reference.UnlocalizedName.STAIRS_CONCRETE_PURPLE,
            ConcreteStairBlock::new
    );
    public static final RegistryObject<ConcreteStairBlock> CONCRETE_STAIRS_RED = BLOCKS.register(
            Reference.UnlocalizedName.STAIRS_CONCRETE_RED,
            ConcreteStairBlock::new
    );
    public static final RegistryObject<ConcreteStairBlock> CONCRETE_STAIRS_WHITE = BLOCKS.register(
            Reference.UnlocalizedName.STAIRS_CONCRETE_WHITE,
            ConcreteStairBlock::new
    );
    public static final RegistryObject<ConcreteStairBlock> CONCRETE_STAIRS_YELLOW = BLOCKS.register(
            Reference.UnlocalizedName.STAIRS_CONCRETE_YELLOW,
            ConcreteStairBlock::new
    );

    public static final RegistryObject<GlassPanel> GLASS_PANEL_BLACK = BLOCKS.register(
            Reference.UnlocalizedName.GLASS_PANEL_BLACK,
            GlassPanel::new
    );
    public static final RegistryObject<GlassPanel> GLASS_PANEL_BLACK_GLOWING = BLOCKS.register(
            Reference.UnlocalizedName.GLASS_PANEL_BLACK_GLOWING,
            () -> new GlassPanel(15)
    );
    public static final RegistryObject<GlassPanel> GLASS_PANEL_BLUE = BLOCKS.register(
            Reference.UnlocalizedName.GLASS_PANEL_BLUE,
            GlassPanel::new
    );
    public static final RegistryObject<GlassPanel> GLASS_PANEL_BLUE_GLOWING = BLOCKS.register(
            Reference.UnlocalizedName.GLASS_PANEL_BLUE_GLOWING,
            () -> new GlassPanel(15)
    );
    public static final RegistryObject<GlassPanel> GLASS_PANEL_BROWN = BLOCKS.register(
            Reference.UnlocalizedName.GLASS_PANEL_BROWN,
            GlassPanel::new
    );
    public static final RegistryObject<GlassPanel> GLASS_PANEL_BROWN_GLOWING = BLOCKS.register(
            Reference.UnlocalizedName.GLASS_PANEL_BROWN_GLOWING,
            () -> new GlassPanel(15)
    );
    public static final RegistryObject<GlassPanel> GLASS_PANEL_CYAN = BLOCKS.register(
            Reference.UnlocalizedName.GLASS_PANEL_CYAN,
            GlassPanel::new
    );
    public static final RegistryObject<GlassPanel> GLASS_PANEL_CYAN_GLOWING = BLOCKS.register(
            Reference.UnlocalizedName.GLASS_PANEL_CYAN_GLOWING,
            () -> new GlassPanel(15)
    );
    public static final RegistryObject<GlassPanel> GLASS_PANEL_GRAY = BLOCKS.register(
            Reference.UnlocalizedName.GLASS_PANEL_GRAY,
            GlassPanel::new
    );
    public static final RegistryObject<GlassPanel> GLASS_PANEL_GRAY_GLOWING = BLOCKS.register(
            Reference.UnlocalizedName.GLASS_PANEL_GRAY_GLOWING,
            () -> new GlassPanel(15)
    );
    public static final RegistryObject<GlassPanel> GLASS_PANEL_GREEN = BLOCKS.register(
            Reference.UnlocalizedName.GLASS_PANEL_GREEN,
            GlassPanel::new
    );
    public static final RegistryObject<GlassPanel> GLASS_PANEL_GREEN_GLOWING = BLOCKS.register(
            Reference.UnlocalizedName.GLASS_PANEL_GREEN_GLOWING,
            () -> new GlassPanel(15)
    );
    public static final RegistryObject<GlassPanel> GLASS_PANEL_LIGHT_BLUE = BLOCKS.register(
            Reference.UnlocalizedName.GLASS_PANEL_LIGHT_BLUE,
            GlassPanel::new
    );
    public static final RegistryObject<GlassPanel> GLASS_PANEL_LIGHT_BLUE_GLOWING = BLOCKS.register(
            Reference.UnlocalizedName.GLASS_PANEL_LIGHT_BLUE_GLOWING,
            () -> new GlassPanel(15)
    );
    public static final RegistryObject<GlassPanel> GLASS_PANEL_LIGHT_GRAY = BLOCKS.register(
            Reference.UnlocalizedName.GLASS_PANEL_LIGHT_GRAY,
            GlassPanel::new
    );
    public static final RegistryObject<GlassPanel> GLASS_PANEL_LIGHT_GRAY_GLOWING = BLOCKS.register(
            Reference.UnlocalizedName.GLASS_PANEL_LIGHT_GRAY_GLOWING,
            () -> new GlassPanel(15)
    );
    public static final RegistryObject<GlassPanel> GLASS_PANEL_LIME = BLOCKS.register(
            Reference.UnlocalizedName.GLASS_PANEL_LIME,
            GlassPanel::new
    );
    public static final RegistryObject<GlassPanel> GLASS_PANEL_LIME_GLOWING = BLOCKS.register(
            Reference.UnlocalizedName.GLASS_PANEL_LIME_GLOWING,
            () -> new GlassPanel(15)
    );
    public static final RegistryObject<GlassPanel> GLASS_PANEL_MAGENTA = BLOCKS.register(
            Reference.UnlocalizedName.GLASS_PANEL_MAGENTA,
            GlassPanel::new
    );
    public static final RegistryObject<GlassPanel> GLASS_PANEL_MAGENTA_GLOWING = BLOCKS.register(
            Reference.UnlocalizedName.GLASS_PANEL_MAGENTA_GLOWING,
            () -> new GlassPanel(15)
    );
    public static final RegistryObject<GlassPanel> GLASS_PANEL_ORANGE = BLOCKS.register(
            Reference.UnlocalizedName.GLASS_PANEL_ORANGE,
            GlassPanel::new
    );
    public static final RegistryObject<GlassPanel> GLASS_PANEL_ORANGE_GLOWING = BLOCKS.register(
            Reference.UnlocalizedName.GLASS_PANEL_ORANGE_GLOWING,
            () -> new GlassPanel(15)
    );
    public static final RegistryObject<GlassPanel> GLASS_PANEL_PINK = BLOCKS.register(
            Reference.UnlocalizedName.GLASS_PANEL_PINK,
            GlassPanel::new
    );
    public static final RegistryObject<GlassPanel> GLASS_PANEL_PINK_GLOWING = BLOCKS.register(
            Reference.UnlocalizedName.GLASS_PANEL_PINK_GLOWING,
            () -> new GlassPanel(15)
    );
    public static final RegistryObject<GlassPanel> GLASS_PANEL_PURPLE = BLOCKS.register(
            Reference.UnlocalizedName.GLASS_PANEL_PURPLE,
            GlassPanel::new
    );
    public static final RegistryObject<GlassPanel> GLASS_PANEL_PURPLE_GLOWING = BLOCKS.register(
            Reference.UnlocalizedName.GLASS_PANEL_PURPLE_GLOWING,
            () -> new GlassPanel(15)
    );
    public static final RegistryObject<GlassPanel> GLASS_PANEL_RED = BLOCKS.register(
            Reference.UnlocalizedName.GLASS_PANEL_RED,
            GlassPanel::new
    );
    public static final RegistryObject<GlassPanel> GLASS_PANEL_RED_GLOWING = BLOCKS.register(
            Reference.UnlocalizedName.GLASS_PANEL_RED_GLOWING,
            () -> new GlassPanel(15)
    );
    public static final RegistryObject<GlassPanel> GLASS_PANEL_WHITE = BLOCKS.register(
            Reference.UnlocalizedName.GLASS_PANEL_WHITE,
            GlassPanel::new
    );
    public static final RegistryObject<GlassPanel> GLASS_PANEL_WHITE_GLOWING = BLOCKS.register(
            Reference.UnlocalizedName.GLASS_PANEL_WHITE_GLOWING,
            () -> new GlassPanel(15)
    );
    public static final RegistryObject<GlassPanel> GLASS_PANEL_YELLOW = BLOCKS.register(
            Reference.UnlocalizedName.GLASS_PANEL_YELLOW,
            GlassPanel::new
    );
    public static final RegistryObject<GlassPanel> GLASS_PANEL_YELLOW_GLOWING = BLOCKS.register(
            Reference.UnlocalizedName.GLASS_PANEL_YELLOW_GLOWING,
            () -> new GlassPanel(15)
    );
    public static final RegistryObject<OrganicPanel> PANEL_GLOWSHROOM = BLOCKS.register(
            Reference.UnlocalizedName.PANEL_GLOWSHROOM,
            OrganicPanel::new
    );
    public static final RegistryObject<GlassPanel> PANEL_GLOWSTONE = BLOCKS.register(
            Reference.UnlocalizedName.PANEL_GLOWSTONE,
            GlassPanel::new
    );
    public static final RegistryObject<GlassHalfBlock> SLAB_GLASS_BLACK = BLOCKS.register(
            Reference.UnlocalizedName.SLAB_GLASS_BLACK,
            GlassHalfBlock::new
    );
    public static final RegistryObject<GlassHalfBlock> SLAB_GLASS_BLACK_GLOWING = BLOCKS.register(
            Reference.UnlocalizedName.SLAB_GLASS_BLACK_GLOWING,
            () -> new GlassHalfBlock(15)
    );
    public static final RegistryObject<GlassHalfBlock> SLAB_GLASS_BLUE = BLOCKS.register(
            Reference.UnlocalizedName.SLAB_GLASS_BLUE,
            GlassHalfBlock::new
    );
    public static final RegistryObject<GlassHalfBlock> SLAB_GLASS_BLUE_GLOWING = BLOCKS.register(
            Reference.UnlocalizedName.SLAB_GLASS_BLUE_GLOWING,
            () -> new GlassHalfBlock(15)
    );
    public static final RegistryObject<GlassHalfBlock> SLAB_GLASS_BROWN = BLOCKS.register(
            Reference.UnlocalizedName.SLAB_GLASS_BROWN,
            GlassHalfBlock::new
    );
    public static final RegistryObject<GlassHalfBlock> SLAB_GLASS_BROWN_GLOWING = BLOCKS.register(
            Reference.UnlocalizedName.SLAB_GLASS_BROWN_GLOWING,
            () -> new GlassHalfBlock(15)
    );
    public static final RegistryObject<GlassHalfBlock> SLAB_GLASS_CYAN = BLOCKS.register(
            Reference.UnlocalizedName.SLAB_GLASS_CYAN,
            GlassHalfBlock::new
    );
    public static final RegistryObject<GlassHalfBlock> SLAB_GLASS_CYAN_GLOWING = BLOCKS.register(
            Reference.UnlocalizedName.SLAB_GLASS_CYAN_GLOWING,
            () -> new GlassHalfBlock(15)
    );
    public static final RegistryObject<GlassHalfBlock> SLAB_GLASS_GRAY = BLOCKS.register(
            Reference.UnlocalizedName.SLAB_GLASS_GRAY,
            GlassHalfBlock::new
    );
    public static final RegistryObject<GlassHalfBlock> SLAB_GLASS_GRAY_GLOWING = BLOCKS.register(
            Reference.UnlocalizedName.SLAB_GLASS_GRAY_GLOWING,
            () -> new GlassHalfBlock(15)
    );
    public static final RegistryObject<GlassHalfBlock> SLAB_GLASS_GREEN = BLOCKS.register(
            Reference.UnlocalizedName.SLAB_GLASS_GREEN,
            GlassHalfBlock::new
    );
    public static final RegistryObject<GlassHalfBlock> SLAB_GLASS_GREEN_GLOWING = BLOCKS.register(
            Reference.UnlocalizedName.SLAB_GLASS_GREEN_GLOWING,
            () -> new GlassHalfBlock(15)
    );
    public static final RegistryObject<GlassHalfBlock> SLAB_GLASS_LIGHT_BLUE = BLOCKS.register(
            Reference.UnlocalizedName.SLAB_GLASS_LIGHT_BLUE,
            GlassHalfBlock::new
    );
    public static final RegistryObject<GlassHalfBlock> SLAB_GLASS_LIGHT_BLUE_GLOWING = BLOCKS.register(
            Reference.UnlocalizedName.SLAB_GLASS_LIGHT_BLUE_GLOWING,
            () -> new GlassHalfBlock(15)
    );
    public static final RegistryObject<GlassHalfBlock> SLAB_GLASS_LIGHT_GRAY = BLOCKS.register(
            Reference.UnlocalizedName.SLAB_GLASS_LIGHT_GRAY,
            GlassHalfBlock::new
    );
    public static final RegistryObject<GlassHalfBlock> SLAB_GLASS_LIGHT_GRAY_GLOWING = BLOCKS.register(
            Reference.UnlocalizedName.SLAB_GLASS_LIGHT_GRAY_GLOWING,
            () -> new GlassHalfBlock(15)
    );
    public static final RegistryObject<GlassHalfBlock> SLAB_GLASS_LIME = BLOCKS.register(
            Reference.UnlocalizedName.SLAB_GLASS_LIME,
            GlassHalfBlock::new
    );
    public static final RegistryObject<GlassHalfBlock> SLAB_GLASS_LIME_GLOWING = BLOCKS.register(
            Reference.UnlocalizedName.SLAB_GLASS_LIME_GLOWING,
            () -> new GlassHalfBlock(15)
    );
    public static final RegistryObject<GlassHalfBlock> SLAB_GLASS_MAGENTA = BLOCKS.register(
            Reference.UnlocalizedName.SLAB_GLASS_MAGENTA,
            GlassHalfBlock::new
    );
    public static final RegistryObject<GlassHalfBlock> SLAB_GLASS_MAGENTA_GLOWING = BLOCKS.register(
            Reference.UnlocalizedName.SLAB_GLASS_MAGENTA_GLOWING,
            () -> new GlassHalfBlock(15)
    );
    public static final RegistryObject<GlassHalfBlock> SLAB_GLASS_ORANGE = BLOCKS.register(
            Reference.UnlocalizedName.SLAB_GLASS_ORANGE,
            GlassHalfBlock::new
    );
    public static final RegistryObject<GlassHalfBlock> SLAB_GLASS_ORANGE_GLOWING = BLOCKS.register(
            Reference.UnlocalizedName.SLAB_GLASS_ORANGE_GLOWING,
            () -> new GlassHalfBlock(15)
    );
    public static final RegistryObject<GlassHalfBlock> SLAB_GLASS_PINK = BLOCKS.register(
            Reference.UnlocalizedName.SLAB_GLASS_PINK,
            GlassHalfBlock::new
    );
    public static final RegistryObject<GlassHalfBlock> SLAB_GLASS_PINK_GLOWING = BLOCKS.register(
            Reference.UnlocalizedName.SLAB_GLASS_PINK_GLOWING,
            () -> new GlassHalfBlock(15)
    );
    public static final RegistryObject<GlassHalfBlock> SLAB_GLASS_PURPLE = BLOCKS.register(
            Reference.UnlocalizedName.SLAB_GLASS_PURPLE,
            GlassHalfBlock::new
    );
    public static final RegistryObject<GlassHalfBlock> SLAB_GLASS_PURPLE_GLOWING = BLOCKS.register(
            Reference.UnlocalizedName.SLAB_GLASS_PURPLE_GLOWING,
            () -> new GlassHalfBlock(15)
    );
    public static final RegistryObject<GlassHalfBlock> SLAB_GLASS_RED = BLOCKS.register(
            Reference.UnlocalizedName.SLAB_GLASS_RED,
            GlassHalfBlock::new
    );
    public static final RegistryObject<GlassHalfBlock> SLAB_GLASS_RED_GLOWING = BLOCKS.register(
            Reference.UnlocalizedName.SLAB_GLASS_RED_GLOWING,
            () -> new GlassHalfBlock(15)
    );
    public static final RegistryObject<GlassHalfBlock> SLAB_GLASS_WHITE = BLOCKS.register(
            Reference.UnlocalizedName.SLAB_GLASS_WHITE,
            GlassHalfBlock::new
    );
    public static final RegistryObject<GlassHalfBlock> SLAB_GLASS_WHITE_GLOWING = BLOCKS.register(
            Reference.UnlocalizedName.SLAB_GLASS_WHITE_GLOWING,
            () -> new GlassHalfBlock(15)
    );
    public static final RegistryObject<GlassHalfBlock> SLAB_GLASS_YELLOW = BLOCKS.register(
            Reference.UnlocalizedName.SLAB_GLASS_YELLOW,
            GlassHalfBlock::new
    );
    public static final RegistryObject<GlassHalfBlock> SLAB_GLASS_YELLOW_GLOWING = BLOCKS.register(
            Reference.UnlocalizedName.SLAB_GLASS_YELLOW_GLOWING,
            () -> new GlassHalfBlock(15)
    );
    public static final RegistryObject<GlassHalfBlock> SLAB_GLOWSTONE = BLOCKS.register(
            Reference.UnlocalizedName.SLAB_GLOWSTONE,
            GlassHalfBlock::new
    );
    public static final RegistryObject<TerracottaStairBlock> TERRACOTTA_STAIRS_BLACK = BLOCKS.register(
            Reference.UnlocalizedName.STAIRS_TERRACOTTA_BLACK,
            TerracottaStairBlock::new
    );
    public static final RegistryObject<TerracottaStairBlock> TERRACOTTA_STAIRS_BLUE = BLOCKS.register(
            Reference.UnlocalizedName.STAIRS_TERRACOTTA_BLUE,
            TerracottaStairBlock::new
    );
    public static final RegistryObject<TerracottaStairBlock> TERRACOTTA_STAIRS_BROWN = BLOCKS.register(
            Reference.UnlocalizedName.STAIRS_TERRACOTTA_BROWN,
            TerracottaStairBlock::new
    );
    public static final RegistryObject<TerracottaStairBlock> TERRACOTTA_STAIRS_CYAN = BLOCKS.register(
            Reference.UnlocalizedName.STAIRS_TERRACOTTA_CYAN,
            TerracottaStairBlock::new
    );
    public static final RegistryObject<TerracottaStairBlock> TERRACOTTA_STAIRS_GRAY = BLOCKS.register(
            Reference.UnlocalizedName.STAIRS_TERRACOTTA_GRAY,
            TerracottaStairBlock::new
    );
    public static final RegistryObject<TerracottaStairBlock> TERRACOTTA_STAIRS_GREEN = BLOCKS.register(
            Reference.UnlocalizedName.STAIRS_TERRACOTTA_GREEN,
            TerracottaStairBlock::new
    );
    public static final RegistryObject<TerracottaStairBlock> TERRACOTTA_STAIRS_LIGHT_BLUE = BLOCKS.register(
            Reference.UnlocalizedName.STAIRS_TERRACOTTA_LIGHT_BLUE,
            TerracottaStairBlock::new
    );
    public static final RegistryObject<TerracottaStairBlock> TERRACOTTA_STAIRS_LIGHT_GRAY = BLOCKS.register(
            Reference.UnlocalizedName.STAIRS_TERRACOTTA_LIGHT_GRAY,
            TerracottaStairBlock::new
    );
    public static final RegistryObject<TerracottaStairBlock> TERRACOTTA_STAIRS_LIME = BLOCKS.register(
            Reference.UnlocalizedName.STAIRS_TERRACOTTA_LIME,
            TerracottaStairBlock::new
    );
    public static final RegistryObject<TerracottaStairBlock> TERRACOTTA_STAIRS_MAGENTA = BLOCKS.register(
            Reference.UnlocalizedName.STAIRS_TERRACOTTA_MAGENTA,
            TerracottaStairBlock::new
    );
    public static final RegistryObject<TerracottaStairBlock> TERRACOTTA_STAIRS_ORANGE = BLOCKS.register(
            Reference.UnlocalizedName.STAIRS_TERRACOTTA_ORANGE,
            TerracottaStairBlock::new
    );
    public static final RegistryObject<TerracottaStairBlock> TERRACOTTA_STAIRS_PINK = BLOCKS.register(
            Reference.UnlocalizedName.STAIRS_TERRACOTTA_PINK,
            TerracottaStairBlock::new
    );
    public static final RegistryObject<TerracottaStairBlock> TERRACOTTA_STAIRS_PURPLE = BLOCKS.register(
            Reference.UnlocalizedName.STAIRS_TERRACOTTA_PURPLE,
            TerracottaStairBlock::new
    );
    public static final RegistryObject<TerracottaStairBlock> TERRACOTTA_STAIRS_RED = BLOCKS.register(
            Reference.UnlocalizedName.STAIRS_TERRACOTTA_RED,
            TerracottaStairBlock::new
    );
    public static final RegistryObject<TerracottaStairBlock> TERRACOTTA_STAIRS_WHITE = BLOCKS.register(
            Reference.UnlocalizedName.STAIRS_TERRACOTTA_WHITE,
            TerracottaStairBlock::new
    );
    public static final RegistryObject<TerracottaStairBlock> TERRACOTTA_STAIRS_YELLOW = BLOCKS.register(
            Reference.UnlocalizedName.STAIRS_TERRACOTTA_YELLOW,
            TerracottaStairBlock::new
    );
    public static final RegistryObject<WoolStairBlock> WOOL_STAIRS_BLACK = BLOCKS.register(
            Reference.UnlocalizedName.STAIRS_WOOL_BLACK,
            WoolStairBlock::new
    );
    public static final RegistryObject<WoolStairBlock> WOOL_STAIRS_BLUE = BLOCKS.register(
            Reference.UnlocalizedName.STAIRS_WOOL_BLUE,
            WoolStairBlock::new
    );
    public static final RegistryObject<WoolStairBlock> WOOL_STAIRS_BROWN = BLOCKS.register(
            Reference.UnlocalizedName.STAIRS_WOOL_BROWN,
            WoolStairBlock::new
    );
    public static final RegistryObject<WoolStairBlock> WOOL_STAIRS_CYAN = BLOCKS.register(
            Reference.UnlocalizedName.STAIRS_WOOL_CYAN,
            WoolStairBlock::new
    );
    public static final RegistryObject<WoolStairBlock> WOOL_STAIRS_GRAY = BLOCKS.register(
            Reference.UnlocalizedName.STAIRS_WOOL_GRAY,
            WoolStairBlock::new
    );
    public static final RegistryObject<WoolStairBlock> WOOL_STAIRS_GREEN = BLOCKS.register(
            Reference.UnlocalizedName.STAIRS_WOOL_GREEN,
            WoolStairBlock::new
    );
    public static final RegistryObject<WoolStairBlock> WOOL_STAIRS_LIGHT_BLUE = BLOCKS.register(
            Reference.UnlocalizedName.STAIRS_WOOL_LIGHT_BLUE,
            WoolStairBlock::new
    );
    public static final RegistryObject<WoolStairBlock> WOOL_STAIRS_LIGHT_GRAY = BLOCKS.register(
            Reference.UnlocalizedName.STAIRS_WOOL_LIGHT_GRAY,
            WoolStairBlock::new
    );
    public static final RegistryObject<WoolStairBlock> WOOL_STAIRS_LIME = BLOCKS.register(
            Reference.UnlocalizedName.STAIRS_WOOL_LIME,
            WoolStairBlock::new
    );
    public static final RegistryObject<WoolStairBlock> WOOL_STAIRS_MAGENTA = BLOCKS.register(
            Reference.UnlocalizedName.STAIRS_WOOL_MAGENTA,
            WoolStairBlock::new
    );
    public static final RegistryObject<WoolStairBlock> WOOL_STAIRS_ORANGE = BLOCKS.register(
            Reference.UnlocalizedName.STAIRS_WOOL_ORANGE,
            WoolStairBlock::new
    );
    public static final RegistryObject<WoolStairBlock> WOOL_STAIRS_PINK = BLOCKS.register(
            Reference.UnlocalizedName.STAIRS_WOOL_PINK,
            WoolStairBlock::new
    );
    public static final RegistryObject<WoolStairBlock> WOOL_STAIRS_PURPLE = BLOCKS.register(
            Reference.UnlocalizedName.STAIRS_WOOL_PURPLE,
            WoolStairBlock::new
    );
    public static final RegistryObject<WoolStairBlock> WOOL_STAIRS_RED = BLOCKS.register(
            Reference.UnlocalizedName.STAIRS_WOOL_RED,
            WoolStairBlock::new
    );
    public static final RegistryObject<WoolStairBlock> WOOL_STAIRS_WHITE = BLOCKS.register(
            Reference.UnlocalizedName.STAIRS_WOOL_WHITE,
            WoolStairBlock::new
    );
    public static final RegistryObject<WoolStairBlock> WOOL_STAIRS_YELLOW = BLOCKS.register(
            Reference.UnlocalizedName.STAIRS_WOOL_YELLOW,
            WoolStairBlock::new
    );
    public static final RegistryObject<OrganicHalfBlock> SLAB_GLOWSHROOM = BLOCKS.register(
            Reference.UnlocalizedName.SLAB_GLOWSHROOM,
            () -> new OrganicHalfBlock(15)
    );
    public static final RegistryObject<GlassPanel> GLASS_PANEL_CLEAR = BLOCKS.register(
            Reference.UnlocalizedName.GLASS_PANEL_CLEAR,
            GlassPanel::new
    );
    public static final RegistryObject<GlassPanel> GLASS_PANEL_CLEAR_GLOWING = BLOCKS.register(
            Reference.UnlocalizedName.GLASS_PANEL_CLEAR_GLOWING,
            () -> new GlassPanel(15)
    );
    public static final RegistryObject<GlassHalfBlock> SLAB_GLASS_CLEAR = BLOCKS.register(
            Reference.UnlocalizedName.SLAB_GLASS_CLEAR,
            GlassHalfBlock::new
    );
    public static final RegistryObject<GlassHalfBlock> SLAB_GLASS_CLEAR_GLOWING = BLOCKS.register(
            Reference.UnlocalizedName.SLAB_GLASS_CLEAR_GLOWING,
            () -> new GlassHalfBlock(15)
    );
    public static final RegistryObject<StairBlock> STAIR_ACACIA_CARPET_PARTIAL_BLACK = BLOCKS.register(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_PARTIAL_BLACK,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS))
    );
    public static final RegistryObject<StairBlock> STAIR_ACACIA_CARPET_PARTIAL_BLUE = BLOCKS.register(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_PARTIAL_BLUE,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS))
    );
    public static final RegistryObject<StairBlock> STAIR_ACACIA_CARPET_PARTIAL_BROWN = BLOCKS.register(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_PARTIAL_BROWN,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS))
    );
    public static final RegistryObject<StairBlock> STAIR_ACACIA_CARPET_PARTIAL_CYAN = BLOCKS.register(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_PARTIAL_CYAN,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS))
    );
    public static final RegistryObject<StairBlock> STAIR_ACACIA_CARPET_PARTIAL_GRAY = BLOCKS.register(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_PARTIAL_GRAY,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS))
    );
    public static final RegistryObject<StairBlock> STAIR_ACACIA_CARPET_PARTIAL_GREEN = BLOCKS.register(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_PARTIAL_GREEN,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS))
    );
    public static final RegistryObject<StairBlock> STAIR_ACACIA_CARPET_PARTIAL_LIGHT_BLUE = BLOCKS.register(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_PARTIAL_LIGHT_BLUE,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS))
    );
    public static final RegistryObject<StairBlock> STAIR_ACACIA_CARPET_PARTIAL_LIGHT_GRAY = BLOCKS.register(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_PARTIAL_LIGHT_GRAY,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS))
    );
    public static final RegistryObject<StairBlock> STAIR_ACACIA_CARPET_PARTIAL_LIME = BLOCKS.register(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_PARTIAL_LIME,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS))
    );
    public static final RegistryObject<StairBlock> STAIR_ACACIA_CARPET_PARTIAL_MAGENTA = BLOCKS.register(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_PARTIAL_MAGENTA,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS))
    );
    public static final RegistryObject<StairBlock> STAIR_ACACIA_CARPET_PARTIAL_ORANGE = BLOCKS.register(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_PARTIAL_ORANGE,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS))
    );
    public static final RegistryObject<StairBlock> STAIR_ACACIA_CARPET_PARTIAL_PINK = BLOCKS.register(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_PARTIAL_PINK,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS))
    );
    public static final RegistryObject<StairBlock> STAIR_ACACIA_CARPET_PARTIAL_PURPLE = BLOCKS.register(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_PARTIAL_PURPLE,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS))
    );
    public static final RegistryObject<StairBlock> STAIR_ACACIA_CARPET_PARTIAL_RED = BLOCKS.register(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_PARTIAL_RED,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS))
    );
    public static final RegistryObject<StairBlock> STAIR_ACACIA_CARPET_PARTIAL_WHITE = BLOCKS.register(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_PARTIAL_WHITE,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS))
    );
    public static final RegistryObject<StairBlock> STAIR_ACACIA_CARPET_PARTIAL_YELLOW = BLOCKS.register(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_PARTIAL_YELLOW,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS))
    );
    public static final RegistryObject<StairBlock> STAIR_ACACIA_CARPET_BLACK = BLOCKS.register(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_BLACK,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS))
    );
    public static final RegistryObject<StairBlock> STAIR_ACACIA_CARPET_BLUE = BLOCKS.register(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_BLUE,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS))
    );
    public static final RegistryObject<StairBlock> STAIR_ACACIA_CARPET_BROWN = BLOCKS.register(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_BROWN,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS))
    );
    public static final RegistryObject<StairBlock> STAIR_ACACIA_CARPET_CYAN = BLOCKS.register(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_CYAN,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS))
    );
    public static final RegistryObject<StairBlock> STAIR_ACACIA_CARPET_GRAY = BLOCKS.register(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_GRAY,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS))
    );
    public static final RegistryObject<StairBlock> STAIR_ACACIA_CARPET_GREEN = BLOCKS.register(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_GREEN,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS))
    );
    public static final RegistryObject<StairBlock> STAIR_ACACIA_CARPET_LIGHT_BLUE = BLOCKS.register(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_LIGHT_BLUE,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS))
    );
    public static final RegistryObject<StairBlock> STAIR_ACACIA_CARPET_LIGHT_GRAY = BLOCKS.register(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_LIGHT_GRAY,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS))
    );
    public static final RegistryObject<StairBlock> STAIR_ACACIA_CARPET_LIME = BLOCKS.register(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_LIME,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS))
    );
    public static final RegistryObject<StairBlock> STAIR_ACACIA_CARPET_MAGENTA = BLOCKS.register(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_MAGENTA,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS))
    );
    public static final RegistryObject<StairBlock> STAIR_ACACIA_CARPET_ORANGE = BLOCKS.register(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_ORANGE,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS))
    );
    public static final RegistryObject<StairBlock> STAIR_ACACIA_CARPET_PINK = BLOCKS.register(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_PINK,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS))
    );
    public static final RegistryObject<StairBlock> STAIR_ACACIA_CARPET_PURPLE = BLOCKS.register(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_PURPLE,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS))
    );
    public static final RegistryObject<StairBlock> STAIR_ACACIA_CARPET_RED = BLOCKS.register(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_RED,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS))
    );
    public static final RegistryObject<StairBlock> STAIR_ACACIA_CARPET_WHITE = BLOCKS.register(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_WHITE,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS))
    );
    public static final RegistryObject<StairBlock> STAIR_ACACIA_CARPET_YELLOW = BLOCKS.register(
            Reference.UnlocalizedName.STAIR_ACACIA_CARPET_YELLOW,
            () -> new CarpetStairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS))
    );

    /**
     * Dynamically register Growthcraft Decorations BlockItems.
     *
     * @param itemRegistry IForgeRegistry<Item> reference for registering items.
     * @param properties   Item properties with item group for creative tab.
     */
    public static void registerBlockItems(IForgeRegistry<Item> itemRegistry, Item.Properties properties) {
        GrowthcraftDeco.LOGGER.debug("<Growthcraft-Deco> Registration of itemBlocks started ...");

        BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
            final BlockItem blockItem = new BlockItem(block, properties);
            if (block.getRegistryName() != null) {
                blockItem.setRegistryName(block.getRegistryName());
                itemRegistry.register(blockItem);
            }
        });

        GrowthcraftDeco.LOGGER.debug("<Growthcraft-Deco> Registration of itemBlocks finished.");
    }

}
