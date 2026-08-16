package growthcraft.deco.datagen;

import growthcraft.deco.datagen.providers.*;
import growthcraft.deco.shared.Reference;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
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
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(true, new GrowthcraftDecoRecipeProvider(packOutput, lookupProvider));

        generator.addProvider(
                event.includeServer(),
                new LootTableProvider(
                        packOutput,
                        Collections.emptySet(),
                        List.of(new LootTableProvider.SubProviderEntry(GrowthcraftDecoLootTableProvider::new, LootContextParamSets.BLOCK)),
                        lookupProvider
                )
        );

        generator.addProvider(true, new GrowthcraftDecoBlockModelProvider(packOutput, existingFileHelper));
        generator.addProvider(true, new GrowthcraftDecoBlockStateProvider(packOutput, existingFileHelper));
        generator.addProvider(
                  true,
                new GrowthcraftDecoItemModelProvider(packOutput, existingFileHelper)
        );
        generator.addProvider(true, new GrowthcraftDecoBlockTagsProvider(packOutput, Registries.BLOCK, lookupProvider, "minecraft", existingFileHelper));
        generator.addProvider(true, new GrowthcraftDecoLangProvider(packOutput));
    }
}
