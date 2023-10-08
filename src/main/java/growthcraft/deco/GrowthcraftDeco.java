package growthcraft.deco;

import growthcraft.deco.init.GrowthcraftDecoBlocks;
import growthcraft.deco.init.GrowthcraftDecoCreativeTabs;
import growthcraft.deco.init.GrowthcraftDecoItems;
import growthcraft.deco.init.GrowthcraftDecoMissingMappings;
import growthcraft.deco.init.client.GrowthcraftDecoBlockRenderers;
import growthcraft.deco.shared.Reference;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.MissingMappingsEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Reference.MODID)
@Mod.EventBusSubscriber(modid = Reference.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class GrowthcraftDeco {

    public static final Logger LOGGER = LogManager.getLogger(Reference.MODID);

    public GrowthcraftDeco() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::setup);
        modEventBus.addListener(this::clientSetupEvent);

        GrowthcraftDecoBlocks.BLOCKS.register(modEventBus);
        GrowthcraftDecoItems.ITEMS.register(modEventBus);
        GrowthcraftDecoCreativeTabs.CREATIVE_MODE_TABS.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);

        MinecraftForge.EVENT_BUS.addListener(this::onMissingMappingsEvent);

    }

    private void setup(final FMLCommonSetupEvent event) {
        // Do nothing for now ...
    }

    private void clientSetupEvent(final FMLClientSetupEvent event) {
        GrowthcraftDecoBlockRenderers.registerBlockRenders();
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // do something when the server starts
        LOGGER.info("Growthcraft-Deco is starting ...");
    }

    @SubscribeEvent
    public void onMissingMappingsEvent(MissingMappingsEvent event) {
        GrowthcraftDecoMissingMappings.missingMappingEventHandler(event);
    }


}
