# Minecraft 26.2 vanilla scope review

Baseline: `26.1-neo` at `d30a77cc` (Growthcraft Decorations 26.1.2.1).
Target: Minecraft 26.2, NeoForge 26.2.0.93, Java 25.

The comparison uses the blockstate catalogs in Mojang's official 26.1.2 and
26.2 client JARs, rather than assuming the snapshot catalog is final. There
are 28 additions and no removals. No newly added vanilla block replaces an
existing Deco block. Existing Deco identifiers should remain unchanged.

## Implemented additions

| Vanilla material | Existing Deco families to extend |
| --- | --- |
| Sulfur and cinnabar | Glowing full blocks and hidden doors |
| Polished sulfur and polished cinnabar | Glowing full blocks and hidden doors |
| Sulfur bricks and cinnabar bricks | Glowing full blocks and hidden doors |
| Chiseled sulfur and chiseled cinnabar | Glowing full blocks and hidden doors |
| Potent sulfur | Decorative glowing full block and hidden door |
| Raw, polished, and brick stairs for both materials | Glowing stairs and full/partial carpeted stairs in all 16 colors |
| Raw, polished, and brick slabs for both materials | Glowing slabs |

These extensions total 222 Deco blocks: 18 full-block/door variants, six
glowing stairs, six glowing slabs, and 192 carpeted stairs. Registrations,
models, blockstates, item definitions, recipes, loot, tags, and translations
are included. `GrowthcraftDecoSulfurCinnabarAssets` generates the new client
assets from the established tuff templates; the preservation provider skips
these files so it cannot overwrite newly generated content.

Vanilla already provides all six slab, stair, and wall shapes. Do not add
ordinary duplicates of those shapes. Existing Deco panel families do not
automatically imply adding panels for every stone material.

Potent sulfur variants follow Deco's existing decorative-copy convention:
they retain vanilla texture, sound, and material properties but do not have
the vanilla block entity, gas, or geyser behavior. Sulfur spikes are excluded.

## In-game review

Search JEI for `@growthcraft sulfur` and `@growthcraft cinnabar`.
Check the glowing full blocks, hidden doors, glowing stairs/slabs, and both
carpet styles in several colors. Review stairs upright/upside down and with
inner/outer corners, both door hinges/open states, and top/bottom/double
slabs. Check crafting and pickaxe drops. Potent sulfur has only the glowing
full block and hidden door; water and heat should not activate these copies.

## Compatibility

The upgrade preserves the stable branch's block registrations and identifiers.
Previously existing vanilla equivalents are not grounds for deleting Deco
blocks: existing saves and recipes may reference those identifiers. No block
replacement or world migration is included.

## Repeating the review

Run `scripts/Compare-VanillaBlocks.ps1` with the two official client JARs.
It reports added/removed vanilla blocks and stair types absent from Deco's
Java registrations. A missing reference is a scope candidate, not proof that
every decorative family should support it.

Official release notes:
https://www.minecraft.net/en-us/article/minecraft-java-edition-26-2

Mojang version manifest (client download URLs and SHA-1 hashes):
https://piston-meta.mojang.com/mc/game/version_manifest_v2.json
