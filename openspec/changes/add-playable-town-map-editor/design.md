## Context

See proposal.md. The Vue 3 AIHub already manages remote scene details, restricted AI NPC sessions, finance and an administrator asset metadata importer. Its map is currently absolutely positioned buttons. The new feature extends the existing semantic panel theme; the map itself owns its pixel palette.

## Goals / Non-Goals

**Goals:** Use a shared deterministic map model for editor and play, provide an authored everyday town with church and useful local interactions, and keep remote destinations working independently.

**Non-Goals:** Execute arbitrary RPGMaker projects or event scripts, publish shared maps, change backend permissions, add multiplayer or deploy to the server.

## Decisions

- A Vue component owns a canvas viewport and editor controls. A separate pure module owns versioned map validation, starter composition, collisions and breadth-first pathfinding. Canvas avoids hundreds of reactive tile DOM nodes and permits nearest-neighbor sprite rendering.
- Bundle Kenney CC0 tiles with source/license metadata. Compose the initial map and church from tiles and deterministic decorations rather than rely on remote image URLs or copyrighted RPGMaker RTP. Download only the small atlas and license needed by the project.
- Use fixed-size tiles, terrain and object layers, tri-state collision overrides, a spawn, and declarative text/scene events. No imported code execution. Bound map dimensions, event count and strings before allocation/rendering; reject malformed or blocked spawns.
- Draft and play are modes of the same mounted town component. Stroke-level bounded undo/redo, explicit browser save, versioned JSON export/import and a dirty indicator make editing reviewable. Navigation warns on unsaved changes; restored drafts never silently overwrite a save.
- Local edit is available to visitors and explicitly labeled as browser-local. Existing administrator-only import remains in a separate asset panel; no existing admin API is exposed to guests.
- Preserve existing remote scene rail and handlers beneath the game. Nearby destination actions emit scene codes to the parent, while local dialogue and exploration stay offline. Remote errors do not gate the map.

## Risks / Trade-offs

- Browser storage is device/origin-specific → clearly label save scope, provide portable JSON export and show storage errors.
- Tiny sprites can become illegible → integer source pixels, responsive viewport, zoom, labels and touch controls.
- A user can block their spawn or access routes → validate spawn before saving/play, expose collision visualization and return-to-spawn. Exploration reachability is covered by starter tests.
- This is a native small tile runtime rather than RPGMaker compatibility → keep external RPGMaker import clearly described as metadata inspection only.
