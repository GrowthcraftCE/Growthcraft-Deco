package growthcraft.deco.init;

import growthcraft.deco.shared.Reference;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.ArrayList;

public class GrowthcraftDecoItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Reference.MODID);

    public static void registerBlockItems() {

    }

    public static boolean excludeItemRegistry(Identifier registryName) {
        ArrayList<String> excludeItems = new ArrayList<>();
        //excludeItems.add(Reference.MODID + ":" + Reference.UnlocalizedName.APPLE_TREE_FRUIT);
        return excludeItems.contains(registryName.toString());
    }
}
