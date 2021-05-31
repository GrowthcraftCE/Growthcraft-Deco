import shutil

templateBaseDye = "clear"

dyes = [
  "white",
  "orange",
  "magenta",
  "light_blue",
  "yellow",
  "lime",
  "pink",
  "gray",
  "light_gray",
  "cyan",
  "purple",
  "blue",
  "brown",
  "green",
  "red",
  "black"
]

for dye in dyes:
  if dye == templateBaseDye:
    continue
  sourceFiles = [
    "loot_tables/blocks/panel_glass_%s_glowing.json" % templateBaseDye,
    "loot_tables/blocks/panel_glass_%s.json" % templateBaseDye,
    "recipes/panel_glass_%s.json" % templateBaseDye,
    "recipes/panel_glass_%s_glowing_glowstone.json" % templateBaseDye,
    "recipes/panel_glass_%s_glowing_glowshroom.json" % templateBaseDye
  ]
  targetFiles = [
        "loot_tables/blocks/panel_glass_%s_glowing.json" % dye,
        "loot_tables/blocks/panel_glass_%s.json" % dye,
        "recipes/panel_glass_%s.json" % dye,
        "recipes/panel_glass_%s_glowing_glowstone.json" % dye,
        "recipes/panel_glass_%s_glowing_glowshroom.json" % dye
  ]
  for x in range(0, len(sourceFiles)):
    shutil.copy(sourceFiles[x], targetFiles[x])
    with open(targetFiles[x], 'r') as file:
      contents = file.read()
      contents = contents.replace(templateBaseDye, dye)
    with open(targetFiles[x], 'w') as file:
      file.write(contents)
