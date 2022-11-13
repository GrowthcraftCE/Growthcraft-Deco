import shutil

templateBaseString = "oak"

baseStrings = [
  "spruce",
  "birch",
  "jungle",
  "acacia",
  "dark_oak",
  "mangrove",
  "dark_prismarine",
  "prismarine",
  "prismarine_brick",
  "cobblestone",
  "sandstone",
  "red_sandstone",
  "brick",
  "stone_brick",
  "mud_brick",
  "nether_brick",
  "warped",
  "crimson",
  "quartz",
  "purpur",
  "polished_granite",
  "smooth_red_sandstone",
  "mossy_stone_brick",
  "polished_diorite",
  "mossy_cobblestone",
  "end_stone_brick",
  "stone",
  "smooth_sandstone",
  "smooth_quartz",
  "granite",
  "andesite",
  "red_nether_brick",
  "polished_andesite",
  "diorite",
  "blackstone",
  "polished_blackstone_brick",
  "polished_blackstone",
  "cut_copper",
  "exposed_cut_copper",
  "weathered_cut_copper",
  "oxidized_cut_copper",
  "waxed_cut_copper",
  "waxed_exposed_cut_copper",
  "waxed_weathered_cut_copper",
  "waxed_oxidized_cut_copper",
  "cobbled_deepslate",
  "polished_deepslate",
  "deepslate_brick",
  "deepslate_tile"
]

for baseString in baseStrings:
  if baseString == templateBaseString:
    continue
  sourceFiles = [
    "../assets/growthcraft_deco/blockstates/stairs_%s_glowing.json" % templateBaseString,
    "../assets/growthcraft_deco/models/item/stairs_%s_glowing.json" % templateBaseString,
    "../data/growthcraft_deco/loot_tables/blocks/stairs_%s_glowing.json" % templateBaseString,
    "../data/growthcraft_deco/recipes/stairs_%s_glowing.json" % templateBaseString
  ]
  targetFiles = [
    "../assets/growthcraft_deco/blockstates/stairs_%s_glowing.json" % baseString,
    "../assets/growthcraft_deco/models/item/stairs_%s_glowing.json" % baseString,
    "../data/growthcraft_deco/loot_tables/blocks/stairs_%s_glowing.json" % baseString,
    "../data/growthcraft_deco/recipes/stairs_%s_glowing.json" % baseString
  ]
  for x in range(0, len(sourceFiles)):
    shutil.copy(sourceFiles[x], targetFiles[x])
    with open(targetFiles[x], 'r') as file:
      contents = file.read()
      contents = contents.replace(templateBaseString, baseString)
    with open(targetFiles[x], 'w') as file:
      file.write(contents)
