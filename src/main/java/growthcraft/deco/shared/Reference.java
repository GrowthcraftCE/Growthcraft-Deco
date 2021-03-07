package growthcraft.deco.shared;

import growthcraft.deco.init.GrowthcraftDecoBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class Reference {
    public static final String MODID = "growthcraft_deco";
    public static final String NAME = "Growthcraft Decorations";
    public static final String NAME_SHORT = "deco";

    public static final String VERSION = "5.0.0";

    public static final ItemGroup itemGroup = new ItemGroup(Reference.MODID) {
        @Override
        public ItemStack createIcon() {
            // TODO: Check if Growthcraft core is installed and use the main itemGroup instead.
            return new ItemStack(GrowthcraftDecoBlocks.stairs_wool_orange.get());
        }
    };

    private Reference() { /* Prevent default public constructor */ }

}