package growthcraft.deco.datagen;

import growthcraft.deco.datagen.providers.*;
import growthcraft.deco.shared.Reference;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

/**
 * @credit Kaupenjoe for his DataGenerator tutorials
 */
@Mod.EventBusSubscriber(modid = Reference.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class GrowthcraftDecoDataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(true, new GrowthcraftDecoRecipeProvider(packOutput));
        generator.addProvider(true, GrowthcraftDecoLootTableProvider.create(packOutput));
        generator.addProvider(true, new GrowthcraftDecoBlockStateProvider(packOutput, existingFileHelper));
        generator.addProvider(true, new GrowthcraftDecoItemModelProvider(packOutput, existingFileHelper));
        generator.addProvider(true, new GrowthcraftDecoBlockTagsProvider(packOutput, Registries.BLOCK, lookupProvider, "minecraft", existingFileHelper));
        generator.addProvider(true, new GrowthcraftDecoLangProvider(packOutput));
    }
}
