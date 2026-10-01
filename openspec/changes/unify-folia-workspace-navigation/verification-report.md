# Folia workspace verification, 2026-10-02

The accepted rule is **Folia 播放**: P1 -> P2 replaces the full queue and plays P2's first song. A song selection retains its actual slot; explicit current-song immersion preserves playback position. Escape stays in Folia and restores the current native playlist or shared queue wall. Root diagnosed/reviewed and Luna implemented the repair.

## OpenSpec assessment

| Dimension | Result |
| --- | --- |
| Completeness | 20/20 tasks, all 9 requirements implemented and mapped below. |
| Correctness | Local behavioral tests/type/build/strict validation and the reproduced continuous live failure chain pass. |
| Coherence | Host owns audio/queue/source; fork owns bounded embedded navigation. Stable projection, isolated presence and ordinary queue fallback follow design.md. |

| Requirement | Implementation and scenario evidence |
| --- | --- |
| Folia playlist entry is playback | `musicFoliaWorkspaceCoordinator.js`, mounted MusicLibraryPage source-sync tests; full replace/first song, native equal-song source replacement and empty/failed entries. Live P1 -> purple starts song 1 of 83. |
| Correct interactive song surface | Explicit immersion, wall selection, shortcut reuse/insert and exact duplicate slots. Native B wall stays wall; toolbar C/D requests player and displays it. Mounted engine/controller/entry identity regressions distinguish slots/providers. |
| Escape/current Folia playlist | Host lets Escape reach native active handlers; bounded fork navigation, poster/top-layer and missing-collection tests. Live repeated B/C/D returns P2 once; native player returns actual purple collection. |
| Preserve host routing | Embedded memory navigation never reads/writes host history/hash/popstate; standalone tests retain native history. Live internal navigation preserves the host route. Parked handlers reject input. |
| Latest entry wins | Host-lifetime monotonic IDs and coordinator/queue generations; mounted delayed playlist/song and cold-load/unmount completion tests reject stale activation. |
| Consistent playback/queue controls | Sole shared audio engine, continuous clock and exact-entry intents. Mounted clock/pause/seek/next/random regressions; live play/pause, keyboard control and real held-pointer paused seek pass. Folia audio remains empty/paused. |
| Ordinary source return | Genuine site code maps to the ordinary playlist; native-only source goes to `/music-library/queue` without fabricating a backend code. Live purple/83/D/01:34 ordinary return and reentry, plus native B shared-queue return pass. |
| Lifecycle/failure interaction | Actual hashed entry loader, retry and canceled cold-load regressions; real Framer interrupted/repeated exit tests, no timer fallback. Live continuing clicks/keys and full visuals work after repeated exits. |
| Coherent data/preferences | Existing account sync/prefetch tests retained; live signed-in playlists populated both surfaces. Color provider/shader/reset regressions and actual blue glyph/reset acceptance pass. Compact dock retains pause/seek and does not take over Folia clicks. |

No unresolved critical implementation issue or known spec/design divergence was found; no verification dimension was skipped. The change remains unarchived.

## Diagnosed defects and tests

[diagnosis.md](diagnosis.md) separates original routing/Escape/full-queue failures from three rendered defects found during acceptance: transparent outgoing wall intercepting input (`311b98d5`), mismatched queueEntryId consumers preventing lyrics/focus (`9ed6ab22`), and a third-cycle poster-wave exit never completing (`7069103b`). The last test mounts real Lattice/presence/App gate and 400 virtualized posters; old code fails `completed=2/3`, repaired code passes. Poster removal has its own non-propagating presence, without a timer fallback. A discarded act-scheduling false positive is not counted as evidence.

Final local site run: **249 files / 1,505 tests passed**, production build passed (2,844 modules). Clean release checkout independently passed the same complete suite/build. After final public snapshot synchronization, the applicable source-sync, Folia switch/lyrics, coordinator and entry-loader suites passed **5 files / 56 tests**. The obsolete unconditional source-string assertion was corrected to require fingerprint-gated replacement; runtime application assets did not change for that test update.

Final fork affected run: **39 files / 247 tests passed**, TypeScript, `/music/` production build, strict OpenSpec and source whitespace checks passed. The previous complete fork run had 4,385 passed/2 skipped and one Windows upstream modSignature symlink EPERM, also reproduced on clean upstream. No new complete-fork pass is claimed and no test was weakened. Existing build warnings remain. No backend/provider endpoint change is part of this release.

## Public source and delivery identity

Deployed fork implementation `7069103b4ce862f0e1f8befde5c48dbe778777f4`; final fork source/document tip `d9f516f526007e4be4e6c2399d1d0fdceb505dd1`. **40 TS/TSX snapshots** match the implementation byte for byte. Complete upstream `6fe68d89..d9f516f526007e4be4e6c2399d1d0fdceb505dd1` patch: **265,646 bytes; SHA-256 `5c0cd18f4d234ec414278d2dd1a6f676b7de6f171bde4ba8a5a487829d66ca87`; `57` changed files**. `git apply --check` and actual application to a temporary clean upstream worktree passed; every resulting changed-file Git blob matches the fork tip. The temporary worktree was removed.

Site release runtime `5f08281c28c6742f69d60c1c1ea9d1070e29c513` was deployed to personal server `111.228.35.186`; working branch unrelated wallpaper history is excluded from release. Final documentation/public-source commits are pushed separately and need no runtime redeploy. Folia running image `sha256:1d74dd2d4bee41abd9832a6698f7a4144efc814ca46057740e792b71b1c2b529` has OCI revision `7069103b4ce862f0e1f8befde5c48dbe778777f4`; clean source, verified bundle, exact archive build and build status 0 are verified. Real assets are **`index-Bvvt1XEq.js` / `main-rROf5Ust.js`**. Site/API entry checks and gateway health pass.

Rollback images (including `backup-before-posters-20261002-9ed6ab22`), original source stash and site snapshots remain retained. The exact cache/context cleanup (**731 MiB** then) and later read-only health check (**818 MiB**, unchanged healthy runtimes) are in [delivery-preparation.md](delivery-preparation.md). Each npm/pnpm dependency install actually ran; no cache-hit claim is made.

## Final real-browser acceptance

Fresh signed-in Edge:

1. Ordinary P1 A plays; immersion preserves its position. Toolbar P2 purple installs 83 songs and starts its first song.
2. B wall Play advances; Pause holds 00:46. Real blue primary glyphs and separately colored translation appear. Actual held-pointer seek moves paused B **00:46 -> 03:09**.
3. B player/Escape/wall -> second B player/Escape -> toolbar C displays full player and lyrics; keyboard pause works. C Escape -> toolbar D displays full player and real blue glyphs; D Escape returns P2 once. This is the previously failing continuous chain, not independent fresh loads.
4. Reset removes custom lyric color. Ordinary return shows **purple/83/D/paused 01:34**; immersive reentry preserves that state and theme color.
5. Actual Folia native purple B selection installs all 83 tracks at its selected slot. Pause and explicit player work; **Escape restores native purple collection**. Ordinary return shows **purple/83/B paused** through `/music-library/queue`.

Local screenshots `.codex-tmp/folia-workspace-wall-acceptance.jpg` and `folia-workspace-acceptance.jpg` record the final actual canvas; signed-in account screenshots are not published in Git. The acceptance tab is left available, paused with default color restored.

## Coverage limits

Live acceptance covers the reproduced signed-in Edge/desktop/provider chain, not every device, arbitrary stream or preference. Duplicate slots, stale async work, failure/empty playlists, hidden input, resize and standalone history are covered at mounted boundaries rather than all forced on the live account. The initially reported total freeze was not reproducible in every baseline run; observed route/return and rendered defects have separate evidence. Optional host render acknowledgement is unchanged; dispatch alone is not accepted as proof of visuals. No remaining requested implementation work is recorded.
