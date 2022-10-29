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
  # "clear"
  # "black"
]

for dye in dyes:
  if dye == templateBaseDye:
    continue
  sourceFiles = [
    "blockstates/stairs_oak_carpet_%s.json" % templateBaseDye,
    "models/block/stairs/stairs_oak_carpet_%s.json" % templateBaseDye,
    "models/block/stairs/stairs_oak_carpet_%s_inner.json" % templateBaseDye,
    "models/block/stairs/stairs_oak_carpet_%s_outer.json" % templateBaseDye,
    "models/item/stairs_oak_carpet_%s.json" % templateBaseDye,
    "blockstates/stairs_oak_carpet_partial_%s.json" % templateBaseDye,
    "models/block/stairs/stairs_oak_carpet_partial_%s.json" % templateBaseDye,
    "models/block/stairs/stairs_oak_carpet_partial_%s_inner.json" % templateBaseDye,
    "models/block/stairs/stairs_oak_carpet_partial_%s_outer.json" % templateBaseDye,
    "models/item/stairs_oak_carpet_partial_%s.json" % templateBaseDye
  ]
  targetFiles = [
    "blockstates/stairs_oak_carpet_%s.json" % dye,
    "models/block/stairs/stairs_oak_carpet_%s.json" % dye,
    "models/block/stairs/stairs_oak_carpet_%s_inner.json" % dye,
    "models/block/stairs/stairs_oak_carpet_%s_outer.json" % dye,
    "models/item/stairs_oak_carpet_%s.json" % dye,
    "blockstates/stairs_oak_carpet_partial_%s.json" % dye,
    "models/block/stairs/stairs_oak_carpet_partial_%s.json" % dye,
    "models/block/stairs/stairs_oak_carpet_partial_%s_inner.json" % dye,
    "models/block/stairs/stairs_oak_carpet_partial_%s_outer.json" % dye,
    "models/item/stairs_oak_carpet_partial_%s.json" % dye
  ]
  for x in range(0, len(sourceFiles)):
    shutil.copy(sourceFiles[x], targetFiles[x])
    with open(targetFiles[x], 'r') as file:
      contents = file.read()
      contents = contents.replace(templateBaseDye, dye)
    with open(targetFiles[x], 'w') as file:
      file.write(contents)
