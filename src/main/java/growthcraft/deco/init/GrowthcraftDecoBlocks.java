package growthcraft.deco.init;

import growthcraft.deco.GrowthcraftDeco;
import growthcraft.deco.common.block.ConcreteStairs;
import growthcraft.deco.common.block.GlassSlab;
import growthcraft.deco.common.block.TerracottaStairs;
import growthcraft.deco.common.block.WoolStairs;
import growthcraft.deco.shared.Reference;
import growthcraft.deco.shared.UnlocalizedName;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;

public class GrowthcraftDecoBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Reference.MODID);

    //region Glass Slabs
    public static final RegistryObject<GlassSlab> slab_glass_clear = BLOCKS.register(
            UnlocalizedName.SLAB_GLASS_CLEAR,
            GlassSlab::new
    );
    public static final RegistryObject<GlassSlab> slab_glass_white = BLOCKS.register(
            UnlocalizedName.SLAB_GLASS_WHITE,
            GlassSlab::new
    );
    public static final RegistryObject<GlassSlab> slab_glass_orange = BLOCKS.register(
            UnlocalizedName.SLAB_GLASS_ORANGE,
            GlassSlab::new
    );
    public static final RegistryObject<GlassSlab> slab_glass_magenta = BLOCKS.register(
            UnlocalizedName.SLAB_GLASS_MAGENTA,
            GlassSlab::new
    );
    public static final RegistryObject<GlassSlab> slab_glass_light_blue = BLOCKS.register(
            UnlocalizedName.SLAB_GLASS_LIGHT_BLUE,
            GlassSlab::new
    );
    public static final RegistryObject<GlassSlab> slab_glass_yellow = BLOCKS.register(
            UnlocalizedName.SLAB_GLASS_YELLOW,
            GlassSlab::new
    );
    public static final RegistryObject<GlassSlab> slab_glass_lime = BLOCKS.register(
            UnlocalizedName.SLAB_GLASS_LIME,
            GlassSlab::new
    );
    public static final RegistryObject<GlassSlab> slab_glass_pink = BLOCKS.register(
            UnlocalizedName.SLAB_GLASS_PINK,
            GlassSlab::new
    );
    public static final RegistryObject<GlassSlab> slab_glass_gray = BLOCKS.register(
            UnlocalizedName.SLAB_GLASS_GRAY,
            GlassSlab::new
    );
    public static final RegistryObject<GlassSlab> slab_glass_light_gray = BLOCKS.register(
            UnlocalizedName.SLAB_GLASS_LIGHT_GRAY,
            GlassSlab::new
    );
    public static final RegistryObject<GlassSlab> slab_glass_cyan = BLOCKS.register(
            UnlocalizedName.SLAB_GLASS_CYAN,
            GlassSlab::new
    );
    public static final RegistryObject<GlassSlab> slab_glass_purple = BLOCKS.register(
            UnlocalizedName.SLAB_GLASS_PURPLE,
            GlassSlab::new
    );
    public static final RegistryObject<GlassSlab> slab_glass_blue = BLOCKS.register(
            UnlocalizedName.SLAB_GLASS_BLUE,
            GlassSlab::new
    );
    public static final RegistryObject<GlassSlab> slab_glass_brown = BLOCKS.register(
            UnlocalizedName.SLAB_GLASS_BROWN,
            GlassSlab::new
    );
    public static final RegistryObject<GlassSlab> slab_glass_green = BLOCKS.register(
            UnlocalizedName.SLAB_GLASS_GREEN,
            GlassSlab::new
    );
    public static final RegistryObject<GlassSlab> slab_glass_red = BLOCKS.register(
            UnlocalizedName.SLAB_GLASS_RED,
            GlassSlab::new
    );
    public static final RegistryObject<GlassSlab> slab_glass_black = BLOCKS.register(
            UnlocalizedName.SLAB_GLASS_BLACK,
            GlassSlab::new
    );
    //endregion

    //region Wool Stairs
    public static final RegistryObject<WoolStairs> stairs_wool_white;
    public static final RegistryObject<WoolStairs> stairs_wool_orange;
    public static final RegistryObject<WoolStairs> stairs_wool_magenta;
    public static final RegistryObject<WoolStairs> stairs_wool_light_blue;
    public static final RegistryObject<WoolStairs> stairs_wool_yellow;
    public static final RegistryObject<WoolStairs> stairs_wool_lime;
    public static final RegistryObject<WoolStairs> stairs_wool_pink;
    public static final RegistryObject<WoolStairs> stairs_wool_gray;
    public static final RegistryObject<WoolStairs> stairs_wool_light_gray;
    public static final RegistryObject<WoolStairs> stairs_wool_cyan;
    public static final RegistryObject<WoolStairs> stairs_wool_purple;
    public static final RegistryObject<WoolStairs> stairs_wool_blue;
    public static final RegistryObject<WoolStairs> stairs_wool_brown;
    public static final RegistryObject<WoolStairs> stairs_wool_green;
    public static final RegistryObject<WoolStairs> stairs_wool_red;
    public static final RegistryObject<WoolStairs> stairs_wool_black;
    //endregion

    //region Terracotta Stairs
    public static final RegistryObject<TerracottaStairs> stairs_terracotta_white;
    public static final RegistryObject<TerracottaStairs> stairs_terracotta_orange;
    public static final RegistryObject<TerracottaStairs> stairs_terracotta_magenta;
    public static final RegistryObject<TerracottaStairs> stairs_terracotta_light_blue;
    public static final RegistryObject<TerracottaStairs> stairs_terracotta_yellow;
    public static final RegistryObject<TerracottaStairs> stairs_terracotta_lime;
    public static final RegistryObject<TerracottaStairs> stairs_terracotta_pink;
    public static final RegistryObject<TerracottaStairs> stairs_terracotta_gray;
    public static final RegistryObject<TerracottaStairs> stairs_terracotta_light_gray;
    public static final RegistryObject<TerracottaStairs> stairs_terracotta_cyan;
    public static final RegistryObject<TerracottaStairs> stairs_terracotta_purple;
    public static final RegistryObject<TerracottaStairs> stairs_terracotta_blue;
    public static final RegistryObject<TerracottaStairs> stairs_terracotta_brown;
    public static final RegistryObject<TerracottaStairs> stairs_terracotta_green;
    public static final RegistryObject<TerracottaStairs> stairs_terracotta_red;
    public static final RegistryObject<TerracottaStairs> stairs_terracotta_black;
    //endregion

    //region Concrete Stairs
    public static final RegistryObject<ConcreteStairs> stairs_concrete_white;
    public static final RegistryObject<ConcreteStairs> stairs_concrete_orange;
    public static final RegistryObject<ConcreteStairs> stairs_concrete_magenta;
    public static final RegistryObject<ConcreteStairs> stairs_concrete_light_blue;
    public static final RegistryObject<ConcreteStairs> stairs_concrete_yellow;
    public static final RegistryObject<ConcreteStairs> stairs_concrete_lime;
    public static final RegistryObject<ConcreteStairs> stairs_concrete_pink;
    public static final RegistryObject<ConcreteStairs> stairs_concrete_gray;
    public static final RegistryObject<ConcreteStairs> stairs_concrete_light_gray;
    public static final RegistryObject<ConcreteStairs> stairs_concrete_cyan;
    public static final RegistryObject<ConcreteStairs> stairs_concrete_purple;
    public static final RegistryObject<ConcreteStairs> stairs_concrete_blue;
    public static final RegistryObject<ConcreteStairs> stairs_concrete_brown;
    public static final RegistryObject<ConcreteStairs> stairs_concrete_green;
    public static final RegistryObject<ConcreteStairs> stairs_concrete_red;
    public static final RegistryObject<ConcreteStairs> stairs_concrete_black;
    //endregion

    static {
        stairs_wool_white = BLOCKS.register(UnlocalizedName.STAIRS_WOOL_WHITE, WoolStairs::new);
        stairs_wool_orange = BLOCKS.register(UnlocalizedName.STAIRS_WOOL_ORANGE, WoolStairs::new);
        stairs_wool_magenta = BLOCKS.register(UnlocalizedName.STAIRS_WOOL_MAGENTA, WoolStairs::new);
        stairs_wool_light_blue = BLOCKS.register(UnlocalizedName.STAIRS_WOOL_LIGHT_BLUE, WoolStairs::new);
        stairs_wool_yellow = BLOCKS.register(UnlocalizedName.STAIRS_WOOL_YELLOW, WoolStairs::new);
        stairs_wool_lime = BLOCKS.register(UnlocalizedName.STAIRS_WOOL_LIME, WoolStairs::new);
        stairs_wool_pink = BLOCKS.register(UnlocalizedName.STAIRS_WOOL_PINK, WoolStairs::new);
        stairs_wool_gray = BLOCKS.register(UnlocalizedName.STAIRS_WOOL_GRAY, WoolStairs::new);
        stairs_wool_light_gray = BLOCKS.register(UnlocalizedName.STAIRS_WOOL_LIGHT_GRAY, WoolStairs::new);
        stairs_wool_cyan = BLOCKS.register(UnlocalizedName.STAIRS_WOOL_CYAN, WoolStairs::new);
        stairs_wool_purple = BLOCKS.register(UnlocalizedName.STAIRS_WOOL_PURPLE, WoolStairs::new);
        stairs_wool_blue = BLOCKS.register(UnlocalizedName.STAIRS_WOOL_BLUE, WoolStairs::new);
        stairs_wool_brown = BLOCKS.register(UnlocalizedName.STAIRS_WOOL_BROWN, WoolStairs::new);
        stairs_wool_green = BLOCKS.register(UnlocalizedName.STAIRS_WOOL_GREEN, WoolStairs::new);
        stairs_wool_red = BLOCKS.register(UnlocalizedName.STAIRS_WOOL_RED, WoolStairs::new);
        stairs_wool_black = BLOCKS.register(UnlocalizedName.STAIRS_WOOL_BLACK, WoolStairs::new);

        stairs_terracotta_white = BLOCKS.register(UnlocalizedName.STAIRS_TERRACOTTA_WHITE, TerracottaStairs::new);
        stairs_terracotta_orange = BLOCKS.register(UnlocalizedName.STAIRS_TERRACOTTA_ORANGE, TerracottaStairs::new);
        stairs_terracotta_magenta = BLOCKS.register(UnlocalizedName.STAIRS_TERRACOTTA_MAGENTA, TerracottaStairs::new);
        stairs_terracotta_light_blue = BLOCKS.register(UnlocalizedName.STAIRS_TERRACOTTA_LIGHT_BLUE, TerracottaStairs::new);
        stairs_terracotta_yellow = BLOCKS.register(UnlocalizedName.STAIRS_TERRACOTTA_YELLOW, TerracottaStairs::new);
        stairs_terracotta_lime = BLOCKS.register(UnlocalizedName.STAIRS_TERRACOTTA_LIME, TerracottaStairs::new);
        stairs_terracotta_pink = BLOCKS.register(UnlocalizedName.STAIRS_TERRACOTTA_PINK, TerracottaStairs::new);
        stairs_terracotta_gray = BLOCKS.register(UnlocalizedName.STAIRS_TERRACOTTA_GRAY, TerracottaStairs::new);
        stairs_terracotta_light_gray = BLOCKS.register(UnlocalizedName.STAIRS_TERRACOTTA_LIGHT_GRAY, TerracottaStairs::new);
        stairs_terracotta_cyan = BLOCKS.register(UnlocalizedName.STAIRS_TERRACOTTA_CYAN, TerracottaStairs::new);
        stairs_terracotta_purple = BLOCKS.register(UnlocalizedName.STAIRS_TERRACOTTA_PURPLE, TerracottaStairs::new);
        stairs_terracotta_blue = BLOCKS.register(UnlocalizedName.STAIRS_TERRACOTTA_BLUE, TerracottaStairs::new);
        stairs_terracotta_brown = BLOCKS.register(UnlocalizedName.STAIRS_TERRACOTTA_BROWN, TerracottaStairs::new);
        stairs_terracotta_green = BLOCKS.register(UnlocalizedName.STAIRS_TERRACOTTA_GREEN, TerracottaStairs::new);
        stairs_terracotta_red = BLOCKS.register(UnlocalizedName.STAIRS_TERRACOTTA_RED, TerracottaStairs::new);
        stairs_terracotta_black = BLOCKS.register(UnlocalizedName.STAIRS_TERRACOTTA_BLACK, TerracottaStairs::new);

        stairs_concrete_white = BLOCKS.register(UnlocalizedName.STAIRS_CONCRETE_WHITE, ConcreteStairs::new);
        stairs_concrete_orange = BLOCKS.register(UnlocalizedName.STAIRS_CONCRETE_ORANGE, ConcreteStairs::new);
        stairs_concrete_magenta = BLOCKS.register(UnlocalizedName.STAIRS_CONCRETE_MAGENTA, ConcreteStairs::new);
        stairs_concrete_light_blue = BLOCKS.register(UnlocalizedName.STAIRS_CONCRETE_LIGHT_BLUE, ConcreteStairs::new);
        stairs_concrete_yellow = BLOCKS.register(UnlocalizedName.STAIRS_CONCRETE_YELLOW, ConcreteStairs::new);
        stairs_concrete_lime = BLOCKS.register(UnlocalizedName.STAIRS_CONCRETE_LIME, ConcreteStairs::new);
        stairs_concrete_pink = BLOCKS.register(UnlocalizedName.STAIRS_CONCRETE_PINK, ConcreteStairs::new);
        stairs_concrete_gray = BLOCKS.register(UnlocalizedName.STAIRS_CONCRETE_GRAY, ConcreteStairs::new);
        stairs_concrete_light_gray = BLOCKS.register(UnlocalizedName.STAIRS_CONCRETE_LIGHT_GRAY, ConcreteStairs::new);
        stairs_concrete_cyan = BLOCKS.register(UnlocalizedName.STAIRS_CONCRETE_CYAN, ConcreteStairs::new);
        stairs_concrete_purple = BLOCKS.register(UnlocalizedName.STAIRS_CONCRETE_PURPLE, ConcreteStairs::new);
        stairs_concrete_blue = BLOCKS.register(UnlocalizedName.STAIRS_CONCRETE_BLUE, ConcreteStairs::new);
        stairs_concrete_brown = BLOCKS.register(UnlocalizedName.STAIRS_CONCRETE_BROWN, ConcreteStairs::new);
        stairs_concrete_green = BLOCKS.register(UnlocalizedName.STAIRS_CONCRETE_GREEN, ConcreteStairs::new);
        stairs_concrete_red = BLOCKS.register(UnlocalizedName.STAIRS_CONCRETE_RED, ConcreteStairs::new);
        stairs_concrete_black = BLOCKS.register(UnlocalizedName.STAIRS_CONCRETE_BLACK, ConcreteStairs::new);

    }

    private GrowthcraftDecoBlocks() { /* Disable default public constructor */ }

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