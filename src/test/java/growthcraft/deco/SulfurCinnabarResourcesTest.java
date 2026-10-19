package growthcraft.deco;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SulfurCinnabarResourcesTest {
    private static final Path ROOT = Path.of("src/generated/resources");
    private static final Path ASSETS = ROOT.resolve("assets/growthcraft_deco");
    private static final Path DATA = ROOT.resolve("data/growthcraft_deco");
    private static final List<String> COLORS = List.of("white", "orange", "magenta", "light_blue", "yellow",
            "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black");

    record Variant(String id, String ingredient, String carpet, int count, int states) { }

    static Stream<Variant> variants() {
        var variants = new ArrayList<Variant>();
        for (String material : List.of("sulfur", "polished_sulfur", "sulfur_bricks", "chiseled_sulfur",
                "potent_sulfur", "cinnabar", "polished_cinnabar", "cinnabar_bricks", "chiseled_cinnabar")) {
            variants.add(new Variant(material + "_glowing", material, null, 8, 1));
            variants.add(new Variant(material + "_door", material, null, 4, 32));
        }
        for (String material : List.of("sulfur", "polished_sulfur", "sulfur_brick",
                "cinnabar", "polished_cinnabar", "cinnabar_brick")) {
            variants.add(new Variant("stairs_" + material + "_glowing", material + "_stairs", null, 8, 40));
            variants.add(new Variant("slab_" + material + "_glowing", material + "_slab", null, 8, 3));
            for (String color : COLORS) {
                variants.add(new Variant("stairs_" + material + "_carpet_" + color,
                        material + "_stairs", color, 6, 40));
                variants.add(new Variant("stairs_" + material + "_carpet_partial_" + color,
                        material + "_stairs", color, 8, 40));
            }
        }
        return variants.stream();
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("variants")
    void completeResourcesAndExpectedRecipe(Variant variant) throws IOException {
        String id = variant.id();
        JsonObject recipe = read(DATA.resolve("recipe/" + id + ".json"));
        assertEquals("growthcraft_deco:" + id, recipe.getAsJsonObject("result").get("id").getAsString());
        assertEquals(variant.count(), recipe.getAsJsonObject("result").get("count").getAsInt());
        JsonObject key = recipe.getAsJsonObject("key");
        assertEquals("minecraft:" + variant.ingredient(), key.get("A").getAsString());
        String secondary = variant.carpet() != null ? "minecraft:" + variant.carpet() + "_carpet"
                : id.endsWith("_door") ? "#minecraft:doors" : "#growthcraft_deco:glowing";
        assertEquals(secondary, key.get("B").getAsString());
        assertEquals(variant.states(), read(ASSETS.resolve("blockstates/" + id + ".json"))
                .getAsJsonObject("variants").size(), "All orientations must have models");
        assertTrue(Files.isRegularFile(ASSETS.resolve("models/item/" + id + ".json")));
        assertTrue(Files.isRegularFile(ASSETS.resolve("items/" + id + ".json")));
        assertTrue(Files.isRegularFile(DATA.resolve("loot_table/blocks/" + id + ".json")));
        assertTrue(read(ASSETS.resolve("lang/en_us.json")).has("block.growthcraft_deco." + id));
        assertTrue(Files.readString(ROOT.resolve("data/minecraft/tags/block/mineable/pickaxe.json"))
                .contains("\"growthcraft_deco:" + id + "\""));
    }

    @Test
    void exactScopeExcludesSpikes() throws IOException {
        assertEquals(222, variants().count());
        try (var files = Files.list(ASSETS.resolve("blockstates"))) {
            var additions = files.map(path -> path.getFileName().toString())
                    .filter(name -> name.contains("sulfur") || name.contains("cinnabar")).toList();
            assertEquals(222, additions.size());
            assertFalse(additions.stream().anyMatch(name -> name.contains("spike")));
        }
    }

    private static JsonObject read(Path path) throws IOException {
        return JsonParser.parseString(Files.readString(path)).getAsJsonObject();
    }
}
