# Verification: Folia controls and ordinary list return, 2026-10-02

## Result

All **9/9 tasks**, three requirements and eight specification scenarios are implemented and verified within the evidence below. No critical or warning-level implementation issue remains. OpenSpec changes remain unarchived.

| Dimension | Evidence |
| --- | --- |
| Completeness | Live primary color/reset, one native Folia transport, authoritative ordinary playlist/queue with exact current-entry reveal, and cancelled mount waits are covered. Public fork snapshots and canonical patch are refreshed and independently applied to clean upstream. |
| Correctness | Independent mounted RED reproduced input-only preference loss, duplicate host dock, duplicate active queue rows and missing late entry. Independent clean-release suite passes 251 files / 1513 tests with exit 0. Actual signed-in acceptance confirms real glyph colors, native pause/seek/Esc and both large known-playlist and native replacement returns. |
| Coherence | Shared audio/queue ownership remains; native Folia controls are the active transport. Color subscription is discrete; subtitle/background themes stay separate. Current-row reveal is driven by return/identity/list activation, with no playback-clock scrolling. Only follow-up commits were cherry-picked to release; unrelated wallpaper work is excluded. |

## Validation

- Host: root independently passed 4 affected mounted files / 29 tests and 3 navigation/lyrics/coordinator files / 34 tests. After a teardown leak was found, corrected clean release independently passed **251 files / 1513 tests**, no unhandled error. A previous 1512-assertion run with an unhandled poll error was rejected as a gate.
- Final centering refinement: independently passed playlist/dock regressions **2 files / 4 tests** in both root and clean release; rebuilt the precise final release commit. The full 1513-test run preceded this one-line centering change; no claim of a second full run is made.
- Fork: root independently passed **100 affected files / 1056 tests / 1 skipped**. Background follow-up passed **9 files / 130 tests**, plus TypeScript. Mounted real bridge/model, Cadenza word/sweep colors, Diorama palette separation and GeometricBackground isolation are covered.
- Both changes pass strict OpenSpec validation. Source whitespace checks pass; canonical unified patch context whitespace is excluded only for the patch file. Exact committed production builds pass. Existing chunk-size, empty React chunk and ineffective dynamic-import warnings remain.

## Signed-in live acceptance

| Scenario | Observed result |
| --- | --- |
| Color input before commitment | Mounted native input regression applies validated color immediately and deduplicates subsequent change. Native OS picker dragging itself was not automated. |
| Real custom glyphs | Full-player word body computes rgb(228,59,87) for #e43b57. Lattice primary shader glyphs visibly become blue for #3388ff; translated text keeps its own color. Original cover/background remain. |
| Mode/reentry/reset | Wall to full-player and ordinary to Folia preserve blue actual word color rgb(51,136,255). Reset removes the custom root property and returns the actual word to rgb(244,244,245), retaining paused 42.4s. Reset persists after reentry. |
| One transport | Folia compact host dock count is zero while active. Folia's native transport remains; ordinary transport reappears after return. |
| Native pause/seek/Esc | Keyboard Space pauses. Pointer drag on the actual native range seeks to 42.4s and updates lyrics while paused. Esc returns to the current Lattice playlist with entry 450 selected; opening the full player works again. |
| Late known playlist | Ordinary first song → Folia entry 450 夏がくれた贈り物 → ordinary: correct liked playlist, exact one active row, 650 mounted rows including 450. Final centering puts the row at y=661.7..705.7; hit-testing reaches the row rather than the fixed dock. |
| Native replacement | Opened Folia native purple playlist and played こころに響く恋ほたる. Ordinary return uses /music-library/queue, profile purple and complete ordered 83-entry list, one active unobscured row. |
| Ordinary queue overlay | Opens with all 1000 entries; exact entry 450 is the only active row, visible at y=1114..1170.3 and hit-tested as the active queue item. |
| Manual browsing/cancellation | Mounted regressions verify clock updates do not trigger repeated reveal, duplicate entry identity is preserved, and a cancelled cold mount cannot continue polling after unmount. |

Screenshots retained locally: `.codex-tmp/folia-color-full-acceptance.jpg`, `folia-color-wall-acceptance.jpg`, `folia-color-list-acceptance.jpg`, `folia-color-native-list-acceptance.jpg`. Baseline missing-row screenshot and RED/GREEN/build/deployment logs are retained separately.

## Exact production delivery

Personal server **111.228.35.186** only. Frontend runtime artifacts were built from clean committed local checkouts with the existing production Vite arguments; sensitive arguments were never printed. Each served file was compared to a SHA-256 manifest, and image OCI revisions match the built source.

| Component | Deployed source | Runtime image | Served identity |
| --- | --- | --- | --- |
| Folia | 1fca2ef15922c55b8655873bbd4d6a4415db828b | sha256:91b1df73ec35c4372e48750e89859bd9d69f547b385c359a4089ad3098170620 | 193 files verified; main-pG2vG0Xv.js |
| Site | 7abce02172af0bd5b459f3b7147f25a928a3ffc3 | sha256:98d79c569450d83ad2d6573cd9013c10a911575b2dddd1b872f877bf7cecf745 | 229 files verified; index-Cd9jeifr.js |

Site deployment marker is 7abce021; Folia remote source is clean at 1fca2ef1. Folia gateway is healthy; site container runs and actual site entry/HTTP plus API UP gates pass. The site's frontend service has no Docker HEALTHCHECK, so no Docker-health claim is made for it. Final documentation commits are newer than these runtime commits and do not require rebuilding unchanged application code.

The first site delivery created full READY restore point `/opt/shizuki-site-backups/snapshot-20261002-025814-d0f7263ed2ef`, retaining app/private config, database and three volume archives. The final frontend-only centering refinement verified that restore point, prior runtime image/marker and a four-file frontend/documentation delta before reusing it. Backend, private configuration and volumes were unchanged. Only the site service was restarted for that refinement.

Rollback tags retained: `folia-local/gateway:backup-before-color-20261002-7069103b`, `shizuki-site/site:backup-before-color-20261002-5f08281c`, and intermediate site `shizuki-site/site:backup-before-color-20261002-d0f7263e`. Previous source stash and earlier restore points are retained. Verified temporary artifact contexts were removed; only exact fresh private reclaimable cache records were pruned. Server available disk after cleanup is approximately **340 MiB**; future larger deployment needs separate capacity work. No broad image/volume/backup pruning was performed.

Owner fork and host feature branch are pushed; clean site master receives only this follow-up and its final documentation/public-source refresh. Public patch identity and clean-apply results are recorded in `third_party/folia-major/README.md`.

## Limits and handoff

Representative full-player DOM and Lattice shader glyphs were visually accepted, with mounted derived-color coverage for non-DOM modes; this does not claim pixel acceptance for every renderer. The earlier complete fork run's Windows modSignature symlink EPERM reproduces on clean upstream; affected suites pass without weakening that test. No application work remains for this follow-up. OpenSpec archival is left for an explicit close request.
