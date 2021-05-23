package growthcraft.deco.init.client;

import growthcraft.deco.init.GrowthcraftDecoBlocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;

public class GrowthcraftDecoBlockRenders {

    private GrowthcraftDecoBlockRenders() { /* Prevent default public constructor */ }

    public static void setRenderLayers() {
        RenderTypeLookup.setRenderLayer(GrowthcraftDecoBlocks.slab_glass_clear.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(GrowthcraftDecoBlocks.slab_glass_white.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(GrowthcraftDecoBlocks.slab_glass_orange.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(GrowthcraftDecoBlocks.slab_glass_magenta.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(GrowthcraftDecoBlocks.slab_glass_light_blue.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(GrowthcraftDecoBlocks.slab_glass_yellow.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(GrowthcraftDecoBlocks.slab_glass_lime.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(GrowthcraftDecoBlocks.slab_glass_pink.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(GrowthcraftDecoBlocks.slab_glass_gray.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(GrowthcraftDecoBlocks.slab_glass_light_gray.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(GrowthcraftDecoBlocks.slab_glass_cyan.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(GrowthcraftDecoBlocks.slab_glass_purple.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(GrowthcraftDecoBlocks.slab_glass_blue.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(GrowthcraftDecoBlocks.slab_glass_brown.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(GrowthcraftDecoBlocks.slab_glass_green.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(GrowthcraftDecoBlocks.slab_glass_red.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(GrowthcraftDecoBlocks.slab_glass_black.get(), RenderType.getTranslucent());
    }
}
