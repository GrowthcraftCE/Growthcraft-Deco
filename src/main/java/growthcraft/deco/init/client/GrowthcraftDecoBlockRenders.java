package growthcraft.deco.init.client;

import growthcraft.deco.init.GrowthcraftDecoBlocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;

public class GrowthcraftDecoBlockRenders {

    private GrowthcraftDecoBlockRenders() { /* Prevent default public constructor */ }

    public static void setRenderLayers() {

        // TODO[7]: Add colors for glass panels
        // TODO[7]; Add loot tables and recipes for glass panels
        RenderTypeLookup.setRenderLayer(GrowthcraftDecoBlocks.panel_glass_black.get(), GrowthcraftDecoBlockRenders::isValidGlassPanelLayer);
        RenderTypeLookup.setRenderLayer(GrowthcraftDecoBlocks.panel_glass_brown.get(), GrowthcraftDecoBlockRenders::isValidGlassPanelLayer);
        RenderTypeLookup.setRenderLayer(GrowthcraftDecoBlocks.panel_glass_blue.get(), GrowthcraftDecoBlockRenders::isValidGlassPanelLayer);
        RenderTypeLookup.setRenderLayer(GrowthcraftDecoBlocks.panel_glass_clear.get(), GrowthcraftDecoBlockRenders::isValidGlassPanelLayer);
        RenderTypeLookup.setRenderLayer(GrowthcraftDecoBlocks.panel_glass_cyan.get(), GrowthcraftDecoBlockRenders::isValidGlassPanelLayer);
        RenderTypeLookup.setRenderLayer(GrowthcraftDecoBlocks.panel_glass_gray.get(), GrowthcraftDecoBlockRenders::isValidGlassPanelLayer);
        RenderTypeLookup.setRenderLayer(GrowthcraftDecoBlocks.panel_glass_green.get(), GrowthcraftDecoBlockRenders::isValidGlassPanelLayer);
        RenderTypeLookup.setRenderLayer(GrowthcraftDecoBlocks.panel_glass_light_blue.get(), GrowthcraftDecoBlockRenders::isValidGlassPanelLayer);
        RenderTypeLookup.setRenderLayer(GrowthcraftDecoBlocks.panel_glass_light_gray.get(), GrowthcraftDecoBlockRenders::isValidGlassPanelLayer);
        RenderTypeLookup.setRenderLayer(GrowthcraftDecoBlocks.panel_glass_lime.get(), GrowthcraftDecoBlockRenders::isValidGlassPanelLayer);
        RenderTypeLookup.setRenderLayer(GrowthcraftDecoBlocks.panel_glass_magenta.get(), GrowthcraftDecoBlockRenders::isValidGlassPanelLayer);
        RenderTypeLookup.setRenderLayer(GrowthcraftDecoBlocks.panel_glass_orange.get(), GrowthcraftDecoBlockRenders::isValidGlassPanelLayer);
        RenderTypeLookup.setRenderLayer(GrowthcraftDecoBlocks.panel_glass_pink.get(), GrowthcraftDecoBlockRenders::isValidGlassPanelLayer);
        RenderTypeLookup.setRenderLayer(GrowthcraftDecoBlocks.panel_glass_purple.get(), GrowthcraftDecoBlockRenders::isValidGlassPanelLayer);
        RenderTypeLookup.setRenderLayer(GrowthcraftDecoBlocks.panel_glass_red.get(), GrowthcraftDecoBlockRenders::isValidGlassPanelLayer);
        RenderTypeLookup.setRenderLayer(GrowthcraftDecoBlocks.panel_glass_white.get(), GrowthcraftDecoBlockRenders::isValidGlassPanelLayer);
        RenderTypeLookup.setRenderLayer(GrowthcraftDecoBlocks.panel_glass_yellow.get(), GrowthcraftDecoBlockRenders::isValidGlassPanelLayer);

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

        // TODO[5]: Add colors for glowing glass slabs
        // TODO[5]: Add loot tables and recipes for glowing glass slabs
        RenderTypeLookup.setRenderLayer(GrowthcraftDecoBlocks.slab_glass_black_glowing.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(GrowthcraftDecoBlocks.slab_glass_brown_glowing.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(GrowthcraftDecoBlocks.slab_glass_blue_glowing.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(GrowthcraftDecoBlocks.slab_glass_clear_glowing.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(GrowthcraftDecoBlocks.slab_glass_cyan_glowing.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(GrowthcraftDecoBlocks.slab_glass_gray_glowing.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(GrowthcraftDecoBlocks.slab_glass_green_glowing.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(GrowthcraftDecoBlocks.slab_glass_light_blue_glowing.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(GrowthcraftDecoBlocks.slab_glass_light_gray_glowing.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(GrowthcraftDecoBlocks.slab_glass_lime_glowing.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(GrowthcraftDecoBlocks.slab_glass_magenta_glowing.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(GrowthcraftDecoBlocks.slab_glass_orange_glowing.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(GrowthcraftDecoBlocks.slab_glass_pink_glowing.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(GrowthcraftDecoBlocks.slab_glass_purple_glowing.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(GrowthcraftDecoBlocks.slab_glass_red_glowing.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(GrowthcraftDecoBlocks.slab_glass_white_glowing.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(GrowthcraftDecoBlocks.slab_glass_yellow_glowing.get(), RenderType.getTranslucent());

    }

    /**
     * Determine rendering for forge: multi-layer models.
     *
     * @param layer RenderType for the given layer
     * @return boolean true of the render type matches
     */
    public static boolean isValidGlassPanelLayer(RenderType layer) {
        return layer == RenderType.getSolid() || layer == RenderType.getTranslucent();
    }
}
