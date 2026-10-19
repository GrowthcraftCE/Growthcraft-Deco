package growthcraft.deco;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ResourceCompatibilityTest {
    private static final List<Path> ROOTS = List.of(
            Path.of("src/main/resources"), Path.of("src/generated/resources"));

    @Test
    void resourcePackTargetsMinecraft26_2() throws IOException {
        JsonObject pack = JsonParser.parseString(Files.readString(
                ROOTS.getFirst().resolve("pack.mcmeta"))).getAsJsonObject().getAsJsonObject("pack");
        assertEquals(88, pack.get("min_format").getAsInt());
        // This shared pack contains resource format 88.0 and data format 107.1.
        assertEquals(107, pack.getAsJsonArray("max_format").get(0).getAsInt());
        assertEquals(1, pack.getAsJsonArray("max_format").get(1).getAsInt());
    }

    @Test
    void blockstatesReferenceExistingDecoModels() throws IOException {
        int count = 0;
        for (Path root : ROOTS) {
            Path states = root.resolve("assets/growthcraft_deco/blockstates");
            try (var files = Files.list(states)) {
                for (Path file : files.filter(path -> path.toString().endsWith(".json")).toList()) {
                    count++;
                    checkModels(JsonParser.parseString(Files.readString(file)), file);
                }
            }
        }
        assertTrue(count >= 1013, "The 26.1.2 baseline contains 1,013 blockstate files; assets were lost");
    }

    private static void checkModels(JsonElement element, Path blockstate) {
        if (element.isJsonArray()) {
            element.getAsJsonArray().forEach(child -> checkModels(child, blockstate));
        } else if (element.isJsonObject()) {
            element.getAsJsonObject().entrySet().forEach(entry -> {
                if (entry.getKey().equals("model") && entry.getValue().isJsonPrimitive()) {
                    String model = entry.getValue().getAsString();
                    if (model.startsWith("growthcraft_deco:")) {
                        String relative = "assets/growthcraft_deco/models/"
                                + model.substring(model.indexOf(':') + 1) + ".json";
                        assertTrue(ROOTS.stream().anyMatch(root -> Files.isRegularFile(root.resolve(relative))),
                                () -> blockstate + " references missing model " + model);
                    }
                } else {
                    checkModels(entry.getValue(), blockstate);
                }
            });
        }
    }

    @ParameterizedTest
    @ValueSource(strings = {"quartz_pillar", "purpur_pillar"})
    void pillarDoorsUseExistingSideTextures(String material) throws IOException {
        Path models = ROOTS.get(1).resolve("assets/growthcraft_deco/models");
        var files = new java.util.ArrayList<Path>();
        try (var blocks = Files.list(models.resolve("block"))) {
            blocks.filter(path -> path.getFileName().toString().startsWith(material + "_door_"))
                    .forEach(files::add);
        }
        assertEquals(8, files.size(), "All open/closed door halves and hinges need models");
        files.add(models.resolve("item/" + material + "_door.json"));
        for (Path file : files) {
            JsonObject textures = JsonParser.parseString(Files.readString(file)).getAsJsonObject()
                    .getAsJsonObject("textures");
            assertTrue(!textures.isEmpty(), "Door model must provide textures: " + file);
            textures.entrySet().forEach(entry -> assertEquals("minecraft:block/" + material + "_side",
                    entry.getValue().getAsString(), "Invalid pillar door texture in " + file));
        }
    }
}
