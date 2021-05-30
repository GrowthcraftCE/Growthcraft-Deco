import shutil

templateBaseDye = "black"

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
  "red"
  # "black"
]

for dye in dyes:
  if dye == templateBaseDye:
    continue
  sourceFiles = [
    # "blockstates/panel_glass_%s.json" % templateBaseDye,
    # "models/block/panel_glass_%s.json" % templateBaseDye,
    # "models/item/panel_glass_%s.json" % templateBaseDye,
    "models/item/slab_glass_%s_glowing.json" % templateBaseDye
  ]
  targetFiles = [
    # "blockstates/panel_glass_%s.json" % dye,
    # "models/block/panel_glass_%s.json" % dye,
    # "models/item/panel_glass_%s.json" % dye,
    "models/item/slab_glass_%s_glowing.json" % dye
  ]
  for x in range(0, len(sourceFiles)):
    shutil.copy(sourceFiles[x], targetFiles[x])
    with open(targetFiles[x], 'r') as file:
      contents = file.read()
      contents = contents.replace(templateBaseDye, dye)
    with open(targetFiles[x], 'w') as file:
      file.write(contents)
