import shutil

templateBaseDye = "black"
templateBaseMaterial = "oak"

targetBaseMaterial = "warped"

dyes = [
    "black",
    "blue",
    "brown",
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
    "yellow",
    "clear"
]

for dye in dyes:

    sourceFiles = [
        "templates/carpet_stairs/loot_tables/stairs_oak_carpet_partial_%s.json" % templateBaseDye,
        "templates/carpet_stairs/loot_tables/stairs_oak_carpet_%s.json" % templateBaseDye,
        "templates/carpet_stairs/recipes/stairs_oak_carpet_%s.json" % templateBaseDye,
        "templates/carpet_stairs/recipes/stairs_oak_carpet_partial_%s.json" % templateBaseDye,
        "templates/carpet_stairs/blockstates/stairs_oak_carpet_%s.json" % templateBaseDye,
        "templates/carpet_stairs/blockstates/stairs_oak_carpet_partial_%s.json" % templateBaseDye,
        "templates/carpet_stairs/model/block/stairs/stairs_oak_carpet_%s.json" % templateBaseDye,
        "templates/carpet_stairs/model/block/stairs/stairs_oak_carpet_%s_inner.json" % templateBaseDye,
        "templates/carpet_stairs/model/block/stairs/stairs_oak_carpet_%s_outer.json" % templateBaseDye,
        "templates/carpet_stairs/model/block/stairs/stairs_oak_carpet_partial_%s.json" % templateBaseDye,
        "templates/carpet_stairs/model/block/stairs/stairs_oak_carpet_partial_%s_inner.json" % templateBaseDye,
        "templates/carpet_stairs/model/block/stairs/stairs_oak_carpet_partial_%s_outer.json" % templateBaseDye,
        "templates/carpet_stairs/model/item/stairs_oak_carpet_%s.json" % templateBaseDye,
        "templates/carpet_stairs/model/item/stairs_oak_carpet_partial_%s.json" % templateBaseDye
    ]
    targetFiles = [
        "../main/resources/data/growthcraft_deco/loot_tables/blocks/stairs_%s_carpet_partial_%s.json" % (
            targetBaseMaterial, dye),
        "../main/resources/data/growthcraft_deco/loot_tables/blocks/stairs_%s_carpet_%s.json" % (
            targetBaseMaterial, dye),
        "../main/resources/data/growthcraft_deco/recipes/stairs_%s_carpet_%s.json" % (targetBaseMaterial, dye),
        "../main/resources/data/growthcraft_deco/recipes/stairs_%s_carpet_partial_%s.json" % (targetBaseMaterial, dye),
        "../main/resources/assets/growthcraft_deco/blockstates/stairs_%s_carpet_%s.json" % (targetBaseMaterial, dye),
        "../main/resources/assets/growthcraft_deco/blockstates/stairs_%s_carpet_partial_%s.json" % (
            targetBaseMaterial, dye),
        "../main/resources/assets/growthcraft_deco/models/block/stairs/stairs_%s_carpet_%s.json" % (
            targetBaseMaterial, dye),
        "../main/resources/assets/growthcraft_deco/models/block/stairs/stairs_%s_carpet_%s_inner.json" % (
            targetBaseMaterial, dye),
        "../main/resources/assets/growthcraft_deco/models/block/stairs/stairs_%s_carpet_%s_outer.json" % (
            targetBaseMaterial, dye),
        "../main/resources/assets/growthcraft_deco/models/block/stairs/stairs_%s_carpet_partial_%s.json" % (
            targetBaseMaterial, dye),
        "../main/resources/assets/growthcraft_deco/models/block/stairs/stairs_%s_carpet_partial_%s_inner.json" % (
            targetBaseMaterial, dye),
        "../main/resources/assets/growthcraft_deco/models/block/stairs/stairs_%s_carpet_partial_%s_outer.json" % (
            targetBaseMaterial, dye),
        "../main/resources/assets/growthcraft_deco/models/item/stairs_%s_carpet_%s.json" % (targetBaseMaterial, dye),
        "../main/resources/assets/growthcraft_deco/models/item/stairs_%s_carpet_partial_%s.json" % (
            targetBaseMaterial, dye)
    ]

    for x in range(0, len(sourceFiles)):
        shutil.copy(sourceFiles[x], targetFiles[x])
        with open(targetFiles[x], 'r') as file:
            contents = file.read()
            contents = contents.replace(templateBaseDye, dye)
            contents = contents.replace(templateBaseMaterial, targetBaseMaterial)
        with open(targetFiles[x], 'w') as file:
            file.write(contents)