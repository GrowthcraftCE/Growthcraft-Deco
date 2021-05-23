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
    "blockstates/slab_glass_%s.json" % templateBaseDye,
    "models/block/slab_glass_%s_bottom.json" % templateBaseDye,
    "models/block/slab_glass_%s_double.json" % templateBaseDye,
    "models/block/slab_glass_%s_top.json" % templateBaseDye,
    "models/item/slab_glass_%s.json" % templateBaseDye
  ]
  targetFiles = [
    "blockstates/slab_glass_%s.json" % dye,
    "models/block/slab_glass_%s_bottom.json" % dye,
    "models/block/slab_glass_%s_double.json" % dye,
    "models/block/slab_glass_%s_top.json" % dye,
    "models/item/slab_glass_%s.json" % dye
  ]
  for x in range(0, len(sourceFiles)):
    shutil.copy(sourceFiles[x], targetFiles[x])
    with open(targetFiles[x], 'r') as file:
      contents = file.read()
      contents = contents.replace(templateBaseDye, dye)
    with open(targetFiles[x], 'w') as file:
      file.write(contents)
