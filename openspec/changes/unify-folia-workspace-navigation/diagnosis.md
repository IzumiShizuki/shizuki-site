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

## Production acceptance exposed an additional transition defect

After deploying host `5f08281c` (`index-Bvvt1XEq.js`) and fork `9b2346e2` (`main-CZFleggA.js`), fresh Edge acceptance installed P2 `purple` (83 tracks), selected wall B `繋がるココロ`, paused its advancing clock and sought forward/back while paused. Explicit player entry displayed B at the same paused position; one Escape returned the P2 wall and preserved the host playlist URL. However, a subsequent toolbar selection of C `コトダマ紬ぐ未来` updated song and clock but left the actual Folia area showing only its background.

Read-only computed DOM evidence: the outgoing Lattice motion wrapper (`absolute inset-0 z-10 pointer-events-auto`) retained inline/computed `opacity: 0`, `pointer-events: auto` and full pane bounds. Hit-testing still reached its invisible posters; the new player return control was absent. `App.tsx` mounted the new visualizer only after `hasLatticeExited`, while the reusable wrapper had an exit opacity target and no active opacity target. The actual transition lifecycle, including interrupted exit/reentry, is a required regression beyond the navigation-hook tests. A local screenshot is retained at `.codex-tmp/folia-workspace-blank-before.jpg`.

The host queue/source path was separately inspected and still issues the correct monotonic `view: player` request. Returning to ordinary mode landed on the genuine P2 playlist route and displayed its 83 tracks. Final acceptance remains open until the rendered transition is repaired and the entire sequence is repeated on fresh assets.

## Queue-entry identity regression found during the transition followup acceptance

Fresh production fork `311b98d5` (`main-DgayMGhi.js`) repaired repeated B/C/D full-player transitions and Esc return. The outgoing wall no longer remained transparent or blocked the new player; returning produced an active opacity-one wall, and another native poster click/pause worked. Native progress keyboard seek and an actual held-pointer drag moved the paused D track from 01:10 to 02:36 while preserving pause. Ordinary return showed P2 `purple`, all 83 tracks, the same D and 02:36; its real player-detail immersive entry preserved that state.

However, the expanded current D poster still displayed only its white song-title fallback. Its lyric canvas never became ready although the ordinary player had lyrics and time. Source inspection established a distinct identity regression: `buildLatticeTiles` correctly uses `queueEntryId` as tile identity, but the lyric provider, playback focus, active geometry and some transport comparisons still used `getPlaybackSongKey`. A provider song key cannot match a host queue entry such as `netease:33497244:286`; this prevents lyric input and current focus from reaching their consumers. Current identity must use the exact entry with a standalone song-key fallback, and duplicate-song slots must remain distinguishable. This is a production acceptance failure even though shader color unit tests and full-player color work.

Luna is repairing those consumers with mounted Lattice/provider/lyric/focus regressions before the final clean-context deployment and color acceptance. Final verification records must not claim the title-only poster as successful lyric-color evidence.
# Repeated rendered exit acceptance on 2026-10-02

Fresh production `9ed6ab22` / `main-DzduPTL9.js` fixed the current-entry consumers: B's expanded wall displayed actual ready lyrics, blue primary glyphs and white translated text. Its full player also displayed blue lyrics. Native pause, actual held-pointer seek from 00:32 to 03:09, reverse PageDown seek to 02:37 and B's explicit player reentry retained pause/position; Escape returned to P2. Default-color reset removed the custom root variable. Ordinary return subsequently restored `purple`, all 83 tracks, C and its paused 02:35 position.

The continuous sequence still exposes an exit-completion defect: B full player → Escape → B wall → explicit B player → Escape → toolbar C. C becomes audible, but its requested player does not appear. Clicking C's explicit wall player arrow also leaves only the wallpaper. More than 30 seconds later the outgoing Lattice wrapper remains mounted at opacity 0 with pointer-events none; the native return button is absent and two native sliders show C's same advancing position. The previous transparent-input interception is fixed, but visual completion is not. Root saved local evidence in `.codex-tmp/folia-workspace-repeat-exit-before.jpg` and delegated a real repeated-lifecycle regression to Luna.

Read-only host review confirms that toolbar selection requests `surface:'player'`; it must not be accepted as a wall-only selection. The host sends one latest monotonic navigation request, and source/return context does not cause a navigation feedback loop. The host currently clears preparation on successful postMessage dispatch before the optional render acknowledgement; this makes the visual failure less obvious but does not explain the retained outgoing layer. Final delivery acceptance remains pending this correction.

The final regression mounts real `Lattice`, `LatticePresenceLayer`, `useLatticeExitGate`, queue-entry auto-focus and Framer Motion. An 84-slot queue with a large measured viewport mounts the complete virtualized poster wave. Two B exits succeed; after C changes the real world transform, the third exit fails in the original implementation with `completed=2/3; opacity=0; pointerEvents=none; posters=400`. A prior wait inside React `act` was a harness scheduling false positive and was discarded; it is not used as diagnosis evidence.

`7069103b` gives poster removal its own non-propagating `AnimatePresence`. This releases the outer whole-wall exit independently of the individual poster wave, without a fixed-duration fallback. The same multi-cycle mounted regression passes. Root independently passed 39 affected Folia suites / 247 tests, TypeScript, production build, strict OpenSpec validation and source whitespace checks. The exact implementation has been pushed and deployed; final fresh-browser multi-cycle acceptance follows.


## Final fresh-browser acceptance, 2026-10-02

Fresh `7069103b` / `main-rROf5Ust.js` with host `index-Bvvt1XEq.js` passes the previously failing continuous chain: P1 A -> P2 purple/83/first song -> wall B -> B player/Escape -> B player/Escape -> toolbar C player -> Escape -> toolbar D player -> Escape to P2. Actual wall and full-player glyphs render blue, continuing keyboard pause works, and held-pointer paused B seek moves 00:46 to 03:09. D ordinary return and immersive reentry preserve 01:34 paused. Reset removes the custom color variable. Native purple B selection hands off all 83 tracks; its player Escape returns to the real native collection, and ordinary return shows the shared queue at /music-library/queue. The host route remains stable during Folia internal navigation. Local signed-in screenshots are retained outside public Git; verification-report.md records coverage limits.
