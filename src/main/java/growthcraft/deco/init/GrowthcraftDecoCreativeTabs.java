package growthcraft.deco.init;

import growthcraft.deco.shared.Reference;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.BlockItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;

public class GrowthcraftDecoCreativeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Reference.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> GROWTHCRAFT_DECO_TAB = CREATIVE_MODE_TABS.register(Reference.UnlocalizedName.CREATIVE_TAB, () -> CreativeModeTab.builder()
            .title(Component.translatable("item_group." + Reference.MODID + ".tab"))
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> GrowthcraftDecoBlocks.SLAB_GLOWSHROOM.get().asItem().getDefaultInstance())
            .displayItems((parameters, output) -> {
                // Block items are already registered in ITEMS; adding BLOCKS as well duplicates them.
                GrowthcraftDecoItems.ITEMS.getEntries().forEach(itemRegistryObject -> {
                    if (!GrowthcraftDecoItems.excludeItemRegistry(itemRegistryObject.getId())
                            && (!(itemRegistryObject.get() instanceof BlockItem)
                            || !GrowthcraftDecoBlocks.excludeBlockItemRegistry(itemRegistryObject.getId()))) {
                        output.accept(new ItemStack(itemRegistryObject.get()));
                    }
                });
            }).build());
}
