# Verification

## Independent review and automated checks

Root reviewed all changed production boundaries, the real fork consumer/bootstrap/navigation, API request conversion, backend account resolution/cache and signed Range streaming. diagnosis.md records confirmed failures and distinguishes live observations from deferred tests. Deployed acceptance exposed canceled-selection alerts, empty-source native recovery and degraded source metadata; each was reproduced and corrected before the final checks below. All 10 tasks are complete; no unresolved implementation finding remains in the audited music boundaries.

| Requirement / scenario | Evidence |
| --- | --- |
| Cold stable selection before bootstrap | Real mounted MusicLibraryPage, opaque paused entry and 3-song queue seeded before mount; follow-playback precedes navigation. Original root RED: 1 failed / 24 passed. |
| Pending audio/lyrics entry | Real engine publishes selected identity before deferred URL; mounted host uses expected duration; session is sent without later state changes. |
| Parked unchanged paused reentry | Mounted page posts a fresh versioned complete session on each activation; late old status is ignored. Live pre-fix screenshot shows host/Folia song disagreement. |
| Exit during mount/preparation | Actual coordinator and mounted cancellation regressions prevent deferred activation and preserve existing queue. |
| Legitimate empty startup | Mounted page preserves browse fullPath/query, restores player-detail from context or falls back to music home; nonempty queues still return to their source list/current queue. Original RED returned default_public instead of browse path. |
| Deferred/failed lyrics | Real engine selection resolves and audio starts while lyric URL is still held. Foreground resolve sends resolveLyric:false; later fallback/enhancement updates only the current authorized entry. |
| Inline lyrics | Real engine immediately renders usable inline lyrics without requesting the provided slow lyric URL. |
| In-flight preparation | Real engine selects an entry already being prepared with one foreground-compatible request; existing account/quality/queue invalidation checks pass. |
| Rapid A then B / duplicate IDs | Deferred A URL/body/lyrics cannot replace B. Exact queueEntryId distinguishes repeated provider/track identities; current duration/removal use exact entry. |
| Initialization/browse/account race | Deferred default engine load and old page route success/failure cannot overwrite newer queue/list. Authorization switch and disposal invalidate loads. Matched source queue survives a failed forced browse refresh with total count preserved. |
| Bounded optional work / controls | Optional AMLL shares in-flight work, keeps 128 LRU entries and retries misses after 30s. Pending toggle cancels autoplay. Disposed media error/ended events do not request recovery. Account switch while lyric body is held cannot write old lyrics. |
| Native empty-source reset | Real engine emits a native-style error while the new URL is deferred; no forced recovery is requested. Browser source reset removes the src attribute and calls load; genuine stream recovery remains covered. |
| Canceled ordinary selection | Mounted page verifies repeated same-song selections with different queue entries and account-switch cancellation produce no alert. A genuine failure of the current selection still reports its error. Request ownership also guards late browse growth and unmount. |
| Source profile and total | Mounted RED reproduced a loaded 2238-song playlist being overwritten by a stale default profile. Same-source return preserves the loaded metadata and exact queue entries; cross-source return uses known source metadata. Four real-engine regressions cover API counts, changed sources, supplied profiles, refreshed snake-case counts and explicit empty presentation fields. Coordinator forwards its already-resolved profile without another request. |
| Measured phases | Before-deploy rapid loop: URL ~0.71s and optional AMLL ~6.49s; host has 1000 entries while Folia is initially empty. Final first entry, Folia song selection and cross-playlist selection resolve audio in 268/304/319ms respectively, with separate lyric requests and 206 stream responses. |

Final automated checks, 2026-10-02:

- Complete frontend: `node node_modules/vitest/vitest.mjs run` — 251 files, **1547 passed**, 0 failed (30.48s, started 17:52:51 Asia/Shanghai). Root independently ran the final frozen sources, including both rounds of deployed-acceptance corrections. Relevant tests use the real composable/mounted page/coordinator with controlled external boundaries; source-contract checks are supplementary.
- Backend: Java 17 / canonical Maven repository, `mvn -B -s .codex-tmp/maven-music-settings.xml -Dmaven.repo.local=D:/environment/maven/repository -pl modules/media-module -am -Dtest=NeteaseCookieProviderTest,MediaServiceImplTest -Dsurefire.failIfNoSpecifiedTests=false test` — **53 passed** (10 provider, 43 service), reactor BUILD SUCCESS. Existing Aliyun TLS failed initially and the offline cache lacked Surefire jars; a task-local Maven Central mirror completed checks without changing repository/global settings.
- Actual unchanged fork: six bridge, navigation, playback controller, keyboard, lattice input and embedded player-flag suites — **19 passed**. Fork production code/runtime remains `1fca2ef15922c55b8655873bbd4d6a4415db828b`; no fork rebuild is required for host-only corrections.
- Frontend production build: existing server VITE parameters, canonical Node 24 and existing dependency runtime — success (33.54s), main asset `index-CKZEWt3K.js`. Existing large-chunk advisory remains; no new build error.
- Clean master after fast-forward integration: five affected suites — **142 passed**, 0 failed (2.34s). Frontend has no configured lint script or linter dependency; production compilation, behavioral tests and diff whitespace checks are the applicable existing checks.
- `git diff --check` and `openspec validate fix-folia-cold-entry-and-selection-latency --type change --strict --no-interactive` — pass.

## Delivery and deployed acceptance

Initial application correction `44ca6365bb06ca621d64cd3ecec71f18e2cad5c0` was pushed to the owner feature branch and clean master and deployed to 111.228.35.186. All 229 frontend artifact files and 230 runtime files matched; API and unchanged Folia remained healthy. Its actual browser acceptance exposed the two additional faults described above, so it is not the final accepted release.

Follow-up `d8c0d9f9bc0e04bb48d6553e398763d7f6183011` was pushed and deployed with all 230 runtime files verified, API UP and unchanged Folia healthy. Its fresh-page cold selection resolved audio in 333ms, and the 206 audio stream first response took 613ms. Lyrics were requested separately; no active or recorded alert appeared in that captured cold phase. Color rendering changed to the chosen RGB value, native seeking worked, parked paused reentry retained 03:00 and Esc showed the current 1000-song lattice. Ordinary return highlighted the Folia-selected song but exposed source metadata degradation, so this release also remained provisional.

Final application revision **`d42c34bf338738a78a3bde3a4c7f62b3fd4a64c4`** is pushed to `codex/fix-folia-cold-entry-and-latency` and the default release branch `master`. Deployed image is **`sha256:e58246067cd96ce2f445e0256be76a1d154f7d40d6c617986a0f05edf18c09c3`**. All **229 frontend artifact files, 230 runtime files and 11 changed source files** matched exactly; the public browser loaded `index-CKZEWt3K.js`. API was UP and unchanged Folia stayed healthy. Available space after deployment was 1186529280 bytes.

Rollback retains `shizuki-site/site:backup-before-cold-20261002-d42c34bf3387`, `/opt/shizuki-site-deploy-artifacts/cold-d42c34bf3387/rollback-source.tar.gz` and the READY snapshot `/opt/shizuki-site-backups/snapshot-20261002-025814-d0f7263ed2ef`. The final acceptance documentation is a later docs-only commit; it does not change the deployed application revision or require rebuilding its image.

Final real-browser acceptance on that asset:

| Actual action | Verified result |
| --- | --- |
| New ordinary page, select リバーシブル!, immediately open Folia | Current song, 1000-song queue, lyrics and progressing native clock appear; no alert. The fresh page had prewarmed empty Folia DOM before selection, so this is not claimed as a deliberately blocked bootstrap experiment; deferred bootstrap is covered by mounted regressions. |
| Pause, leave, reopen unchanged song | Paused state is retained. Earlier parked reentry retained 03:00; final native seek/pause and return retained 02:22 for the selected Folia song. |
| Folia selects ひだまりデイズ(シルフィンver.) | Resolve targets the new track and starts its 206 stream while its separate lyric request is still pending. Subsequent native and host clocks/lyrics agree. |
| Native progress click, keyboard Space and Esc | Seek reaches 02:22/04:44; Space pauses; Esc opens the current lattice with that selected song and the retained 1000-song queue. Native click pause also works in the later cross-playlist case. |
| Select #ff5070 | Foreground lyric DOM renders `rgb(255, 80, 112)`. The theme color preference is restored after the check. Screenshot inspection shows the single native Folia control bar. |
| Return to ordinary source playlist | `IzumiShizuki喜欢的音乐` remains 100 loaded/displayed initially, 1000 loaded and 2238 total, with the Folia-selected third song highlighted and paused at 02:22. |
| Rapid A→B plus repeated B click | Four requested foreground selections yield four foreground resolves; no dialog is recorded or active, and B remains current. Their force_refresh flags are legitimate existing-source freshness checks, not additional empty-source recovery requests. |
| Folia chooses another playlist ルクル | Its first song ending plays directly with a 33-song queue. Exit reaches its own source route and ordinary mode shows 33/33/33, correct title/cover and current first-song highlight; native pause is preserved at 00:41/03:06. |

Final captured request phases (browser request-to-loadingFinished for resolve, request-to-response for stream):

| Selection | Foreground resolve | Stream first response | Lyric work |
| --- | --- | --- | --- |
| Ordinary first song → Folia | 268ms | 168ms, HTTP 206 | Separate true request starts at +310ms; 917ms completion. |
| Folia third song | 304ms | 77ms, HTTP 206 | Separate true request was still pending when audio was ready. |
| Different Folia playlist, first song | 319ms | 141ms, HTTP 206 | Separate true request; 251ms completion. |

Captured phases have no event truncation. These are concrete samples, not a universal CDN/network latency bound. Optional lyrics no longer delay the foreground selection. Sanitized records, manifests, logs and the settled cross-playlist screenshot are retained locally under `C:/Users/IzumiShizuki/.codex/visualizations/2026/09/30/01a0f279-da07-7c43-85a7-062ab466ce6b/folia-verification-20261002-d42c34bf/`; signed stream paths and authentication headers are excluded from the browser record. Initial screenshots captured during pane animation are not used as acceptance proof.

Application correctness is covered by deferred real-boundary tests; third-party URL/CDN latency remains measurable external work. Optional lyric request duration is not treated as selection-to-audio duration. The user's exact original empty-exit failure has not been claimed from an unrelated live tab; the confirmed stale writes and empty-startup route failure were reproduced at their real code boundaries.
