package growthcraft.deco;

import growthcraft.deco.init.GrowthcraftDecoBlocks;
import growthcraft.deco.init.GrowthcraftDecoCreativeTabs;
import growthcraft.deco.init.GrowthcraftDecoItems;
import growthcraft.deco.init.client.GrowthcraftDecoBlockRenderers;
import growthcraft.deco.shared.Reference;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Reference.MODID)
public class GrowthcraftDeco {

    public static final Logger LOGGER = LogManager.getLogger(Reference.MODID);

    public GrowthcraftDeco(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::clientSetupEvent);

        GrowthcraftDecoBlocks.BLOCKS.register(modEventBus);
        GrowthcraftDecoItems.ITEMS.register(modEventBus);
        GrowthcraftDecoCreativeTabs.CREATIVE_MODE_TABS.register(modEventBus);

        NeoForge.EVENT_BUS.addListener(this::onServerStarting);

    }

    private void clientSetupEvent(final FMLClientSetupEvent event) {
        GrowthcraftDecoBlockRenderers.registerBlockRenders();
    }

    public void onServerStarting(ServerStartingEvent event) {
        // do something when the server starts
        LOGGER.info("Growthcraft-Deco is starting ...");
    }

}
