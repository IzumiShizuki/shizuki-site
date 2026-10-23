## Context

See proposal.md. The existing runtime uses a 16 px logical grid, fixed Kenney atlas IDs, two editable layers and a v1 browser save. The downloaded LPC Victorian Town Preview is a complete 128 × 128 map with 32 px art, three terrain and four building layers. Its README licenses the art under CC BY-SA 4.0 and Tiled data under CC0, with all accompanying credit files required.

## Goals / Non-Goals

**Goals:** Preserve the author's full layout and cell artwork, keep the current runtime/editor and offline behavior, provide deterministic conversion and a traceable source/credit chain, and preserve legacy saves.

**Non-Goals:** Generate a replacement town, execute scripts from imported projects, implement arbitrary external tileset URLs, or publish maps to the server.

## Decisions

- Use the downloaded `victorian-preview.tmx` and its supplied TSX/PNG files. A reproducible Python conversion script merges the three terrain layers and four building layers at each original 32 px cell into a compact atlas, deduplicating identical cells without repainting or changing the layout. Keep the original TMX/TSX, all credits, source URL, archive hash and license text.
- Add a whitelisted tileset registry. Legacy maps continue using the existing schema and IDs; LPC maps specify a known tileset ID with fixed atlas dimensions and legal ID ranges. Allow up to 128 × 128 cells for the bundled LPC scene, retain input size/event/string limits, and reject arbitrary resource URLs or unknown tilesets.
- Keep a fixed 16 px logical world grid while sampling 32 px source cells, so existing camera and controls remain valid. Draw the new art with nearest-neighbor scaling; palette thumbnails use the scene's source size and atlas columns.
- Derive collision from the supplied building layers, treating transparent shadow-only cells separately. Add reachable landmarks and dialogue as explicit application annotations; do not represent these added roles/dialogue as source content. Tests verify spawn, connected streets and every interaction.
- Supply a scene selector and per-scene save slots. Preserve the old save key and custom legacy maps, default new/unchanged-starter visitors to the imported town, and confirm an unsaved scene replacement. Export includes the known tileset ID; original v1 JSON remains accepted.
- Add an eyedropper and paginate the imported scenery palette so thousands of cells do not flood the editor. Source and full attribution remain linked directly from the scene footer.

## Risks / Trade-offs

- Composite cells expose two editing layers rather than all seven source layers → preserve original Tiled files, state that conversion merges layers, and retain reversible tile edits.
- The source is an art demonstration rather than a game map → add and test a deliberate walkable region, spawn, landmark approaches and gameplay annotations.
- Attribution spans many original contributors → distribute every source `CREDITS-*.txt`, aggregate them in an accessible credits document and state the art adaptation license.
- Existing browser saves may still contain the earlier starter → preserve their slot, detect customized saves, and avoid overwriting during default selection.
