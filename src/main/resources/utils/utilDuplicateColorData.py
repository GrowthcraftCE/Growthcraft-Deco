import shutil

templateBaseDye = "black"

dyes = [
  "black",
  "blue",
  "brown",
  "clear",
  "cyan",
  "gray",
  "green",
  "light_blue",
  "light_gray",
  "lime",
  "magenta",
  "orange",
  "pink",
  "purple",
  "red",
  "white",
  "yellow"
]

for dye in dyes:
  if dye == templateBaseDye:
    continue
  sourceFiles = [
    "../data/growthcraft_deco/loot_tables/blocks/glass_stained_%s_pane_glowing.json" % templateBaseDye,
    "../data/growthcraft_deco/recipes/glass_stained_%s_pane_glowing.json" % templateBaseDye,
    "../assets/growthcraft_deco/blockstates/glass_stained_%s_pane_glowing.json" % templateBaseDye,
    "../assets/growthcraft_deco/models/block/panes/%s_stained_glass_pane_noside.json" % templateBaseDye,
    "../assets/growthcraft_deco/models/block/panes/%s_stained_glass_pane_noside_alt.json" % templateBaseDye,
    "../assets/growthcraft_deco/models/block/panes/%s_stained_glass_pane_post.json" % templateBaseDye,
    "../assets/growthcraft_deco/models/block/panes/%s_stained_glass_pane_side.json" % templateBaseDye,
    "../assets/growthcraft_deco/models/block/panes/%s_stained_glass_pane_side_alt.json" % templateBaseDye,
    "../assets/growthcraft_deco/models/item/glass_stained_%s_pane_glowing.json" % templateBaseDye



  ]
  targetFiles = [
    "../data/growthcraft_deco/loot_tables/blocks/glass_stained_%s_pane_glowing.json" % dye,
    "../data/growthcraft_deco/recipes/glass_stained_%s_pane_glowing.json" % dye,
    "../assets/growthcraft_deco/blockstates/glass_stained_%s_pane_glowing.json" % dye,
    "../assets/growthcraft_deco/models/block/panes/%s_stained_glass_pane_noside.json" % dye,
    "../assets/growthcraft_deco/models/block/panes/%s_stained_glass_pane_noside_alt.json" % dye,
    "../assets/growthcraft_deco/models/block/panes/%s_stained_glass_pane_post.json" % dye,
    "../assets/growthcraft_deco/models/block/panes/%s_stained_glass_pane_side.json" % dye,
    "../assets/growthcraft_deco/models/block/panes/%s_stained_glass_pane_side_alt.json" % dye,
    "../assets/growthcraft_deco/models/item/glass_stained_%s_pane_glowing.json" % dye
  ]
  for x in range(0, len(sourceFiles)):
    shutil.copy(sourceFiles[x], targetFiles[x])
    with open(targetFiles[x], 'r') as file:
      contents = file.read()
      contents = contents.replace(templateBaseDye, dye)
    with open(targetFiles[x], 'w') as file:
      file.write(contents)
