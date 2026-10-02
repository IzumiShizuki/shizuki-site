# Verification

## Independent review and automated checks

Root reviewed all changed production boundaries, the real fork consumer/bootstrap/navigation, API request conversion, backend account resolution/cache and signed Range streaming. diagnosis.md records confirmed failures and distinguishes live observations from deferred tests. The first deployed acceptance exposed canceled-selection alerts and empty-source native recovery; both were reproduced and corrected before the final checks below.

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
| Cold measured phases | Before-deploy rapid loop: URL ~0.71s and optional AMLL ~6.49s; host has 1000 entries while Folia is initially empty. After-deploy measurements remain pending below. |

Final automated checks, 2026-10-02:

- Complete frontend: `node node_modules/vitest/vitest.mjs run` — 251 files, **1547 passed**, 0 failed (30.48s, started 17:52:51 Asia/Shanghai). Root independently ran the final frozen sources, including both rounds of deployed-acceptance corrections. Relevant tests use the real composable/mounted page/coordinator with controlled external boundaries; source-contract checks are supplementary.
- Backend: Java 17 / canonical Maven repository, `mvn -B -s .codex-tmp/maven-music-settings.xml -Dmaven.repo.local=D:/environment/maven/repository -pl modules/media-module -am -Dtest=NeteaseCookieProviderTest,MediaServiceImplTest -Dsurefire.failIfNoSpecifiedTests=false test` — **53 passed** (10 provider, 43 service), reactor BUILD SUCCESS. Existing Aliyun TLS failed initially and the offline cache lacked Surefire jars; a task-local Maven Central mirror completed checks without changing repository/global settings.
- Actual unchanged fork: six bridge, navigation, playback controller, keyboard, lattice input and embedded player-flag suites — **19 passed**. Fork production code/runtime remains `1fca2ef15922c55b8655873bbd4d6a4415db828b`; no fork rebuild is required for host-only corrections.
- Frontend production build: existing server VITE parameters, canonical Node 24 and existing dependency runtime — success (33.54s), main asset `index-CKZEWt3K.js`. Existing large-chunk advisory remains; no new build error.
- `git diff --check` and `openspec validate fix-folia-cold-entry-and-selection-latency --type change --strict --no-interactive` — pass.

## Delivery and deployed acceptance

Initial application correction `44ca6365bb06ca621d64cd3ecec71f18e2cad5c0` was pushed to the owner feature branch and clean master and deployed to 111.228.35.186. All 229 frontend artifact files and 230 runtime files matched; API and unchanged Folia remained healthy. Its actual browser acceptance exposed the two additional faults described above, so it is not the final accepted release.

Follow-up `d8c0d9f9bc0e04bb48d6553e398763d7f6183011` was pushed and deployed with all 230 runtime files verified, API UP and unchanged Folia healthy. Its fresh-page cold selection resolved audio in 333ms, and the 206 audio stream first response took 613ms. Lyrics were requested separately; no active or recorded alert appeared in that captured cold phase. Color rendering changed to the chosen RGB value, native seeking worked, parked paused reentry retained 03:00 and Esc showed the current 1000-song lattice. Ordinary return highlighted the Folia-selected song but exposed source metadata degradation, so this release also remained provisional.

Pending: commit/push and manifest-verified deployment of the source-profile correction, then repeat the original complete browser loops on that exact artifact. Tasks 3.3–3.4 remain unchecked until this evidence is obtained. Delivery retains the READY snapshot and a verified rollback image and source archive for each activation.

Application correctness is covered by deferred real-boundary tests; third-party URL/CDN latency remains measurable external work. Optional lyric request duration is not treated as selection-to-audio duration. The user's exact original empty-exit failure has not been claimed from an unrelated live tab; the confirmed stale writes and empty-startup route failure were reproduced at their real code boundaries.
