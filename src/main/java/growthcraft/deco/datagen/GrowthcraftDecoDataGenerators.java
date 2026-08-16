package growthcraft.deco.datagen;

import growthcraft.deco.datagen.providers.*;
import growthcraft.deco.shared.Reference;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;

/**
 * @credit Kaupenjoe for his DataGenerator tutorials
 */
@EventBusSubscriber(modid = Reference.MODID)
public class GrowthcraftDecoDataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent.Server event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        event.addProvider(new GrowthcraftDecoRecipeProvider.Runner(packOutput, lookupProvider));

        event.addProvider(new LootTableProvider(
                        packOutput,
                        Collections.emptySet(),
                        List.of(new LootTableProvider.SubProviderEntry(GrowthcraftDecoLootTableProvider::new, LootContextParamSets.BLOCK)),
                        lookupProvider
                ));
        event.addProvider(new GrowthcraftDecoBlockTagsProvider(packOutput, lookupProvider));
        event.addProvider(new GrowthcraftDecoLangProvider(packOutput));
        event.addProvider(new GrowthcraftDecoItemDefinitions(packOutput));
    }
}
