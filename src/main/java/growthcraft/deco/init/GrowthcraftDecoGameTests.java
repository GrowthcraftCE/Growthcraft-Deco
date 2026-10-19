package growthcraft.deco.init;

import growthcraft.deco.shared.Reference;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;
import net.minecraft.gametest.framework.FunctionGameTestInstance;
import net.minecraft.gametest.framework.GameTestHelper;
import net.minecraft.gametest.framework.TestData;
import net.minecraft.gametest.framework.TestEnvironmentDefinition;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.neoforged.neoforge.event.RegisterGameTestsEvent;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import java.util.HashSet;
import java.util.function.Consumer;

public final class GrowthcraftDecoGameTests {
    public static final DeferredRegister<Consumer<GameTestHelper>> TEST_FUNCTIONS =
            DeferredRegister.create(BuiltInRegistries.TEST_FUNCTION, Reference.MODID);
    private static final DeferredHolder<Consumer<GameTestHelper>, Consumer<GameTestHelper>> CREATIVE_TAB_CONTENTS =
            TEST_FUNCTIONS.register("creative_tab_contents", () -> GrowthcraftDecoGameTests::creativeTabContents);
    private static final DeferredHolder<Consumer<GameTestHelper>, Consumer<GameTestHelper>> SULFUR_CINNABAR =
            TEST_FUNCTIONS.register("sulfur_cinnabar_variants", () -> GrowthcraftDecoGameTests::sulfurCinnabarVariants);

    private GrowthcraftDecoGameTests() {
    }

    public static void registerTests(RegisterGameTestsEvent event) {
        var environment = event.registerEnvironment(Identifier.fromNamespaceAndPath(Reference.MODID, "default"),
                new TestEnvironmentDefinition.AllOf());
        event.registerTest(Identifier.fromNamespaceAndPath(Reference.MODID, "creative_tab_contents"),
                new FunctionGameTestInstance(CREATIVE_TAB_CONTENTS.getKey(),
                        new TestData<>(environment, Identifier.withDefaultNamespace("empty"), 100, 0, true)));
        event.registerTest(Identifier.fromNamespaceAndPath(Reference.MODID, "sulfur_cinnabar_variants"),
                new FunctionGameTestInstance(SULFUR_CINNABAR.getKey(),
                        new TestData<>(environment, Identifier.withDefaultNamespace("empty"), 100, 0, true)));
    }

    private static void sulfurCinnabarVariants(GameTestHelper helper) {
        helper.assertTrue(GrowthcraftDecoBlocks.SULFUR_CINNABAR_VARIANTS.size() == 222, "Expected 222 new variants");
        var level = helper.getLevel();
        BlockPos position = helper.absolutePos(new BlockPos(1, 2, 1));
        GrowthcraftDecoBlocks.SULFUR_CINNABAR_VARIANTS.keySet().forEach(name -> {
            var id = Identifier.fromNamespaceAndPath(Reference.MODID, name);
            helper.assertTrue(BuiltInRegistries.BLOCK.containsKey(id), "Missing registered block: " + id);
            Block block = BuiltInRegistries.BLOCK.getValue(id);
            var state = block.defaultBlockState();
            helper.assertTrue(block.asItem() instanceof BlockItem, "Missing block item: " + id);
            helper.assertTrue(state.is(BlockTags.MINEABLE_WITH_PICKAXE), "Missing pickaxe tag: " + id);
            if (name.endsWith("_glowing")) {
                helper.assertTrue(block.getLightEmission(state, level, position) == 15, "Incorrect light level: " + id);
            }
            var drops = Block.getDrops(state, level, position, null);
            helper.assertTrue(drops.size() == 1 && drops.getFirst().is(block.asItem())
                    && drops.getFirst().getCount() == 1, "Incorrect single-block loot: " + id);
            if (block instanceof SlabBlock) {
                var doubled = state.setValue(SlabBlock.TYPE, SlabType.DOUBLE);
                var doubleDrops = Block.getDrops(doubled, level, position, null);
                helper.assertTrue(doubleDrops.size() == 1 && doubleDrops.getFirst().getCount() == 2,
                        "Double slab must drop two slabs: " + id);
            }
            if (block instanceof DoorBlock) {
                helper.assertTrue(Block.getDrops(state.setValue(DoorBlock.HALF, DoubleBlockHalf.UPPER),
                        level, position, null).isEmpty(), "Upper door must not duplicate loot: " + id);
            }
            if (name.startsWith("potent_sulfur")) {
                helper.assertTrue(!state.hasBlockEntity(), "Decorative Potent Sulfur must not create a geyser block entity");
            }
        });
        helper.succeed();
    }

    private static void creativeTabContents(GameTestHelper helper) {
        var level = helper.getLevel();
        var tab = GrowthcraftDecoCreativeTabs.GROWTHCRAFT_DECO_TAB.get();
        tab.buildContents(new CreativeModeTab.ItemDisplayParameters(
                level.enabledFeatures(), true, level.registryAccess()));
        var actual = new HashSet<Item>();
        tab.getDisplayItems().forEach(stack -> helper.assertTrue(actual.add(stack.getItem()),
                "Duplicate creative-tab item: " + stack));
        var expected = new HashSet<Item>();
        GrowthcraftDecoItems.ITEMS.getEntries().forEach(entry -> {
            Item item = entry.get();
            if (!GrowthcraftDecoItems.excludeItemRegistry(entry.getId())
                    && (!(item instanceof BlockItem)
                    || !GrowthcraftDecoBlocks.excludeBlockItemRegistry(entry.getId()))) {
                expected.add(item);
            }
        });
        helper.assertTrue(!expected.isEmpty(), "Deco must expose registered items to creative and JEI");
        helper.assertTrue(actual.equals(expected), "Creative tab must contain every eligible Deco item once");
        helper.succeed();
    }
}
