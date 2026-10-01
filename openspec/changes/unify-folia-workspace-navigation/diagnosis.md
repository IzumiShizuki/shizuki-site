# Workspace navigation diagnosis

## Accepted correction

The user's A09 correction governs playlist entry: P1 → P2 immediately replaces the complete authoritative queue with P2 and plays its first track. Folia has playback entry, not a separate playlist browsing operation. Specific songs in P2 still use their actual index. Escape stays in Folia and returns to P2; song changes do not become page-history entries.

## Live baseline, 2026-10-01

Freshly reloaded the existing signed-in Edge music tab. Verified host entry `index-Du78sF3P.js`, embedded `main-B74nnEfk.js` and Lattice `Lattice-CN5Pi4PV.js`.

1. Began at a real ordinary playlist route. The ordinary `Folia 浏览` action installed its queue and mounted the wall. Mounting erased the site's `#/music-library/playlist/...` route to `/`.
2. Selected playlist `purple` from the Folia toolbar. Its complete queue and first song became visible/audible after asynchronous resolution. This confirms the intended playlist-playback behavior; the misleading label remains a separate defect.
3. Clicked native wall card `繋がるココロ`, then its native Play. Host/Folia displayed B and an advancing clock. Native Pause worked. This attempt did **not** reproduce failure of every native pointer control.
4. Clicked native `打开播放器`. The correct full player appeared, but the host URL changed to `#player`.
5. Pressed Escape while the native return button had focus: no return. Clicked native `返回主页`: the subsequent stable DOM remained the player. This provides a reproducible input/return failure independent of audio success.

An earlier console entry referenced old `Lattice-CQ5xwAlp.js` and had an earlier timestamp. The current module completed loading. Do not attribute the fresh reproduction to that historical dynamic-import failure or claim a cache diagnosis from it.

## Runnable regression baseline

Site: direct installed Node/Vitest invocation of `src/pages/MusicLibraryPage.sourceSync.integration.spec.js`. The initial shallow Escape fixture failed to mount a host, so that failure was not evidence. Luna corrected it to a real mounted SFC: bubbling Escape from `.folia-embed-host` reaches zero window observers. Native collection intent produces zero `replaceQueueWithTracks` calls despite a complete ordered collection payload. Existing account synchronization tests continue to pass.

Fork: direct installed Node/Vitest invocation of `test/unit/shizukiEmbeddedWorkspaceNavigation.integration.test.ts` and `test/unit/shizukiEmbeddedPlayback.test.ts`: **3 failed / 5 passed**, independently reproduced by root before repair.

- A canonical navigation message leaves the real mounted navigation hook/store at `home` rather than `lattice`.
- Legacy lattice return mutates the host URL/history to `#collection/online/playlist/p2` instead of preserving the site's history.
- Real `sendEmbeddedTrackIntent` drops the supplied complete collection `selection` payload.

The new coordinator's initial missing-module import was scaffold red, not evidence of an existing defect. Behavioral SFC/hook tests and live interaction are the actual regression seams.

## Ranked, falsifiable explanations

1. **Shared browser history plus direct view mutation loses navigation context.** Prediction: route all embedded actions through bounded memory navigation, then the same mounted return and live immersive-return steps preserve host route and restore P2. Existing history regression already exposes the coupling.
2. **The host consumes Escape before Folia's active handlers.** Prediction: allow embedded key propagation and gate inactive Folia handlers, then the mounted observer and real Escape return work; top-layer dismissal remains single-action. The mounted SFC exposes the swallowing behavior.
3. **Competing asynchronous entry results and queue/context churn disturb wall state.** Prediction: delayed P1/P2 and leave-during-selection tests reject stale results; equivalent follow snapshots preserve queue references and continuing click/keyboard interaction. This is an implementation risk to test, not a proven cause of the reported total freeze.

## Acceptance coverage

| Boundary | Required outcome |
| --- | --- |
| P1 → P2 from ordinary, toolbar or native collection | Full P2 queue, first song, valid source and interactive wall |
| Specific wall song B/C/D | Actual selected index, stable queue, correct card, another click/key still works |
| Explicit current-song immersive entry | Same audible/paused state and position; full player |
| Escape/back from player | Current native collection or shared queue wall inside Folia |
| Expanded poster/menu/dialog | One top layer dismissed; current playlist retained |
| Native source → ordinary | Genuine site-code mapping or explicit current-queue fallback, opaque IDs retained |
| Hidden/reentered Folia and delayed loads | No hidden key consumption or stale reopening; recoverable loading/errors |
| Previous linkage regressions | Shared pause/seek/lyrics/color, no independent Folia audio, account sync/prefetch retained |

Record final test counts, fresh assets and live continuing-input outcomes in verification-report.md. The original report of *all* Folia pointer/keyboard operations failing has not yet been reproduced in this baseline pass; do not claim that all such failures have been diagnosed solely from the navigation evidence.
