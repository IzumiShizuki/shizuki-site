# Verification Report: import-authored-town-scene

Verification completed 2026-10-24. Planning context: proposal, design, delta spec and tasks in this change. No verification dimensions were skipped.

## Summary

| Dimension | Result |
| --- | --- |
| Completeness | 8/8 tasks; 3/3 requirements implemented |
| Correctness | All 5 spec scenarios covered by code and automated/browser verification |
| Coherence | Original layout, existing renderer/editor, fixed tilesets and independent saves follow the design |

## Requirement and scenario evidence

| Requirement / scenario | Implementation | Verification |
| --- | --- | --- |
| Downloaded authored default / first visit | `townScenes.js` selects the bundled Victorian scene for new visitors; `TownStudio.vue` displays source credits; `public/town/victorian/` contains local art and source documents | `townScenes.spec.js:40`, `TownStudio.spec.js:152`; browser shows the full source-derived scene and source footer |
| Editable playable conversion / explore | `scripts/import-victorian-town.py` preserves all 128 × 128 cell positions; `townMap.js:25` handles collision; scene landmarks use the existing pathfinder | `townScenes.spec.js:6` checks every interaction is reachable; browser walks library, chapel, market and park, reaches 4/4 and opens their dialogue |
| Editable playable conversion / edit | `TownStudio.vue` provides source-aware palettes, eyedropper, paint, undo, save and JSON import/export; `townRenderer.js` samples 32 px cells | `TownStudio.spec.js:46`, `:132`, `:179`; `townScenes.spec.js:18`, `:29`; `townRenderer.spec.js:7`; browser edits, saves and restores the imported scene |
| Existing local map preservation / existing custom map | `townScenes.js` preserves the legacy key, detects a customized legacy save and assigns a separate imported save slot | `townScenes.spec.js:40`; browser switches both scenes and restores the saved imported name while the legacy scene retains its own name |
| Existing local map preservation / unsaved switch | `TownStudio.vue:138` holds the current draft until save-and-switch, discard-and-switch or cancel is chosen | `TownStudio.spec.js:164` exercises the explicit choices and verifies both save slots |

## Source and conversion checks

- Original: [LPC Victorian Town Preview](https://opengameart.org/content/lpc-victorian-town-decorations), by bluecarrot16 and the contributors named in the archive.
- Downloaded the author's complete `lpc-victorian-preview-see-readme.zip`, including `victorian-preview.tmx`, rather than assembling a replacement layout from loose tiles.
- Archive SHA-256: `414af0172c14cfb14da8e9ec228d1782be5ff32d389db0dd2897f9a6ae237d71`.
- Original TMX SHA-256: `69b21f4451337f4a0aa5cb68baf469dfbc9aceb7850459179e4c4bf26dd2222c`; the retained source file matches.
- Retained the original TMX, TSX, README and all nine `CREDITS-*.txt` files. Full credits are also aggregated in `CREDITS.txt`; original vendor text is preserved, including its whitespace.
- Artwork adaptation is identified as CC BY-SA 4.0 with the complete license. Original Tiled XML is CC0 per the archive README. Gameplay collision, spawn, actors, building roles and dialogue are explicitly identified as application additions.
- Conversion combines the three original terrain layers and four building layers at their original cells, deduplicating 4,369 atlas cells without re-arranging the town. The atlas is 1,320,051 bytes. Streets have a connected walkable region of 8,572 cells; spawn and all landmarks connect to it.
- Compared a 4096 × 4096 rendering of the converted cells to the source preview: mean absolute RGB channel error 0.016096/255; 3,268 of 16,777,216 pixels differ by more than three channel levels. The small differences reflect static animation frames/transparency; cell positions are retained.
- Conversion is reproducible with the checked-in Python/Pillow script and the original archive. No generative image or layout model is involved.

## Quality checks

From `fronted/vue3-merged`:

```text
pnpm test:unit -- src/components/town src/pages/AiHubPage.spec.js src/styles/AiHubTheme.spec.js src/router/index.ai-hub.spec.js src/utils/aiAuthorizationState.spec.js
8 test files passed, 62 tests passed

pnpm build
success (18.36 s)
```

Build emits existing Sass deprecation and bundle size warnings. There is no frontend lint script. Scoped `git diff --check` covers authored code and documentation; unmodified third-party source text retains its original whitespace.

```text
openspec validate import-authored-town-scene --type change --strict --no-interactive
valid
```

Browser verification used the isolated `shizuki-authored-town` agent-browser session at `http://127.0.0.1:5176/#/ai-hub`:

- Original town renders at desktop 1440 × 1000 and mobile 390 × 844, with no document horizontal overflow.
- Keyboard/click navigation, all four exploration destinations and actual dialogue work.
- Editor source palettes are paginated at 48 objects, and eyedropper samples without painting during dragging.
- Imported and legacy scene saves are isolated. Saved title changes survive scene switching; the verification title was restored afterwards.
- Source, full attribution, original archive and original Tiled map links are available.
- Desktop and mobile screenshots: `authored-town-play.png`, `authored-town-editor.png`, `authored-town-mobile.png` under this chat's visualization folder.
- Final preview server restart checked: application and local map JSON both return HTTP 200.

Impeccable finish review found no must-fix issues; its mechanical detector returned an empty finding list. The independent review confirmed source persistence, scope, scene switching, save isolation, fixed atlas registration and palette/eyedropper behavior.

## Issues and accepted limits

CRITICAL: none. WARNING: none. SUGGESTION: none.

The runtime edits two composite layers instead of the source's seven layers, and source animations display their initial frame. These trade-offs are documented in the design and resource README. To reopen the retained XML in Tiled, obtain its referenced PNGs from the linked original archive as documented. Building roles such as the chapel are gameplay annotations, not upstream author claims.

All checks passed. No required follow-up work remains. Local commit is the delivery boundary; no remote push or deployment is part of this change. The change remains available for a separately requested archive.
