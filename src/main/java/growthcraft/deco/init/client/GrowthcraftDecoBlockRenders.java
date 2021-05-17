package growthcraft.deco.init.client;

import growthcraft.deco.init.GrowthcraftDecoBlocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;

public class GrowthcraftDecoBlockRenders {

    private GrowthcraftDecoBlockRenders() { /* Prevent default public constructor */ }

    public static void setRenderLayers() {
        RenderTypeLookup.setRenderLayer(GrowthcraftDecoBlocks.slab_glass_clear.get(), RenderType.getCutout());
    }
}
