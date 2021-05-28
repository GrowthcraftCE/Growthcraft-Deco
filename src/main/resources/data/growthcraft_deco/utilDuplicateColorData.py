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
    "loot_tables/blocks/slab_glass_%s.json" % templateBaseDye,
    "recipes/slab_glass_%s.json" % templateBaseDye
  ]
  targetFiles = [
        "loot_tables/blocks/slab_glass_%s.json" % dye,
        "recipes/slab_glass_%s.json" % dye
  ]
  for x in range(0, len(sourceFiles)):
    shutil.copy(sourceFiles[x], targetFiles[x])
    with open(targetFiles[x], 'r') as file:
      contents = file.read()
      contents = contents.replace(templateBaseDye, dye)
    with open(targetFiles[x], 'w') as file:
      file.write(contents)