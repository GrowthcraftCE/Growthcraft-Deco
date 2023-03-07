package growthcraft.deco.init;

import growthcraft.deco.shared.Reference;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.FluidTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Fluid;

public class GrowthcraftDecoTags {

    public static void init() {
        Blocks.init();
        Items.init();
        Fluids.init();
        EntityTypes.init();
    }

    public static class Blocks {

        private static void init() {
            // Do nothing, simply instantiate static variables
        }

        public static final TagKey<Block> GLOWING = tag(Reference.UnlocalizedName.TAG_GLOWING);

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(Reference.MODID, name));
        }
    }

    public static class Items {

        private static void init() {
            // Do nothing, simply instantiate static variables
        }

        public static final TagKey<Item> GLOWING = tag(Reference.UnlocalizedName.TAG_GLOWING);

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(Reference.MODID, name));
        }
    }

    public static class Fluids {

        private static void init() {
            // Do nothing, simply instantiate static variables
        }

        private static TagKey<Fluid> tag(String name) {
            return FluidTags.create(new ResourceLocation(Reference.MODID, name));
        }
    }

    public static class EntityTypes {

        private static void init() {
            // Do nothing, simply instantiate static variables
        }

        //public static final TagKey<EntityType<?>> MILKABLE = tag("milkable");

        //private static TagKey<EntityType<?>> tag(String name) {
        //    return TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation(Reference.MODID, name));
        //}
    }

}
