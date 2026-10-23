# Verification: add-playable-town-map-editor

Date: 2026-10-23 (Asia/Shanghai)

## Scope and result

The existing AIHub now mounts a playable, editable 38 × 28 tile town above its scene and AI panels. The starter includes a church and bell tower, bakery, library, home, general store/finance entrance, garden, pond, residents and a four-stop exploration objective. Kenney Tiny Town 1.1 is bundled locally with its CC0 notice.

| Dimension | Evidence |
| --- | --- |
| Completeness | All five capability requirements implemented; nine implementation/delivery tasks tracked in tasks.md |
| Correctness | 54 tests across six relevant suites pass; production build passes |
| Coherence | Shared map model for editor/play, bounded JSON validation, no backend or permission changes, inherited AIHub theme |

## Automated checks

From `fronted/vue3-merged`:

```text
pnpm test:unit -- src/components/town src/pages/AiHubPage.spec.js src/styles/AiHubTheme.spec.js src/router/index.ai-hub.spec.js src/utils/aiAuthorizationState.spec.js
6 files passed; 54 tests passed

pnpm build
Production build succeeded
```

The build retains existing Sass deprecation and large-chunk notices. There is no configured frontend lint script. `git diff --check` is clean for this change.

Map tests cover reachability of every starter interaction, water/building/resident collision, explicit overrides, bounded pathfinding, invalid versions/dimensions/layers/ids/events, duplicate events, blocked spawns and invalid/oversized JSON. Component tests cover keyboard/touch/button dialogue, editing, stroke interpolation, undo/redo, local save/reload, storage errors, safe text rendering, reset confirmation, navigation protection, fullscreen exit before destination navigation, and valid JSON export payloads.

Existing AIHub tests continue to cover remote failure/recovery, late response suppression, finance destinations, administrator imports and authorization restrictions.

## Browser evidence

Local Vite preview: `http://127.0.0.1:5176/#/ai-hub`.

- Desktop 1440 × 1000: play/editor, fit and 2× views, church silhouette, palette and inspector inspected.
- Mobile 390 × 844: play/editor layouts inspected, no document horizontal overflow; canvas width and mobile zoom improved; interaction prompt and view controls separated.
- Blocked all `**/api/**` requests: initial town remained playable, keyboard movement succeeded and the remote error remained separate.
- Clicked all four landmarks and walked their routes in the actual browser: bakery → church → gardener → pond; HUD reached `散步 4 / 4` and displayed the completion message.
- Renamed and saved the town, reloaded, and observed the saved name restored.
- Generated a portable starter JSON artifact and uploaded it through the actual file input; the UI reported successful import.
- Entered native fullscreen (canvas became 1440 × 1000) and exited successfully.
- Scoped axe check found zero violations. Contrast checks on inherited translucent/gradient surfaces remain manual/incomplete rather than a full accessibility certification.
- Impeccable detector ran once. Its only advisory identified an obsolete decorative map grid, which was removed. A separate finish reviewer identified click-handler event injection, missing fullscreen exit, skipped brush cells and weak player identification; all four were fixed.

## Verification limit

The Windows agent-browser download helper canceled file downloads and reported a malformed extended Windows download path. The download's on-disk completion could not be confirmed in that automation environment. The export payload, MIME type and download anchor are covered by a component test; the generated starter file is valid and its browser import was confirmed. Export UI therefore says to confirm the download in the browser's download list rather than asserting completion.

## Artifacts and handoff

User-facing artifacts are under `C:/Users/IzumiShizuki/.codex/visualizations/2026/10/23/01a16634-d6c8-7b12-9a4d-acceb48733d9/`:

- `qingchuan-starter-town.json`
- `town-play-desktop.png`, `town-editor-desktop.png`
- `town-mobile.png`, `town-editor-mobile.png`

Save is scoped to the current browser/origin; export/import transfers maps between devices. The native town does not execute arbitrary RPGMaker projects. The separate administrator importer still inspects their metadata. No server deployment, push, shared-map publication or automatic OpenSpec archive was performed.

Other concurrent working-tree changes in menus, theme, companion files, OAuth and tools were outside this delivery and are excluded from its commit. The local development server is left available on port 5176 for the user.

Temporary downloaded/extracted asset files were retained: automatic approval review rejected the recursive cleanup command. The project assets and user-facing artifacts are already saved in their final locations.
