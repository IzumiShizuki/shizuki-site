# Diagnosis and boundary audit

## Independently observed failures

- Live rapid loop: select liked-playlist song in ordinary mode, open the track details, immediately enter Folia. At 1.31s the host identifies the selected song and has 1000 queue entries, while Folia says its queue is empty. URL request takes about 0.71s; the optional AMLL request takes about 6.49s. AMLL enhancement is already asynchronous, so its duration alone does not establish a playback dependency.
- Live stable paused reentry: the host shows `theme of SSS (Piano Arrange Ver.)`, while Folia retains `リバーシブル!` and the old 01:05 / 04:21 clock. No later selection/lyrics event is required by the requested behavior. Saved screenshot: worktree `.codex-tmp/folia-stable-reentry-stale-before.jpg`.
- Root independently ran `node node_modules/vitest/vitest.mjs run src/composables/usePlayerEngine.queue.spec.js` before engine edits: 5 failed / 34 passed. Requested cold song stays old while its URL is unresolved; usable audio remains paused while a lyric promise is unresolved; usable inline lyrics still cause two remote requests; late default bundle replaces explicit queue; matching in-flight preparation duplicates the provider resolve request. Each uses the real engine with deferred network and FakeAudio boundaries.
- Root independently ran `node node_modules/vitest/vitest.mjs run src/pages/MusicLibraryPage.sourceSync.integration.spec.js` before host edits: 1 failed / 24 passed. The actual mounted page navigates after cold script readiness without any follow-playback session for a stable paused opaque-ID song and complete 3-entry queue.
- Luna additionally reproduced stale ordinary browsing: current-route bundle finishes before old-route bundle, then the old profile/tracks replace the current list. Rejecting an old request also unconditionally clears browse tracks. The engine queue and page browse list are separate states; preserving the engine alone cannot fix an empty displayed list.
- Live exit from two rapid loops retained the liked list. The original user's exact exit failure was not captured in their tab; deferred page/engine tests cover confirmed overwrite paths rather than claim this live symptom was already reproduced.

## Ranked predictions and findings

1. Optional foreground dependencies: removing awaited lyric work should let audio/selection acknowledgement settle while lyrics remain unresolved. Confirmed by real-engine RED. AMLL itself is not awaited; remote lyric/fallback and the backend `resolveLyric:true` request are.
2. Queue/list overwrites: resolving stale initialization/browse promises after explicit selection should replace or clear the newer data. Confirmed separately in engine and mounted page RED cases.
3. Cold mount handoff: entering with an unchanged song should navigate without a session; explicitly delivering a fresh snapshot before navigation should fix both cold and parked entry. Confirmed mounted-page RED and live parked stale-song loop.

## Repository boundary map

| Boundary | Audit result | Verification required |
| --- | --- | --- |
| App player bridge / ordinary callers | Shared engine is the audio owner; desktop/mobile/mini-library and Folia call its queue/selection commands. | All engine callers retain return and queue API behavior; no second audio owner. |
| MusicLibraryPage mode/bootstrap | `syncPlayback:false` skips the fresh snapshot, watchers depend on later state events. Mounted children indicate module completion, not a delivered session. | Real mounted stable song before readiness; session precedes navigation; cancellation and parked reentry. |
| Page session/intent/status | Opaque and repeated queue entries need exact entry identity; pending duration and stale status must not revive the previous song. | Complete source-aware snapshot, duplicate-entry and late-result assertions. |
| Ordinary browse/return | Separate browse refs are overwritten after unguarded route/account awaits; return previously depends on sidebar options and can fall back to an empty queue at startup. | Deferred old success/failure/account switch; source list appears from valid current data; legitimate empty startup returns to browse context. |
| Workspace coordinator | Selection awaits the engine result before navigation; therefore engine acknowledgement must not wait for optional content. | Selection settles while held lyric promises remain pending; rapid deactivate invalidates navigation. |
| Player selection/recovery | Metadata commits after URL; audio starts after remote lyrics/fallback. Recovery also awaits lyrics. | Real engine deferred URL/lyric, A then B, pause/cancel/recovery, queue-entry generation checks. |
| Next preparation / optional requests | Foreground consumes completed payload only, causing duplicate in-flight URL resolution; optional misses/in-flight work need bounded reuse. | Matching in-flight adoption; account/quality/queue invalidation; unrelated speculation does not delay foreground. |
| musicApi / HTTP client | Resolve supports `resolveLyric:false`; request snake-case conversion and scoped auth remain unchanged. | Existing API/HTTP tests plus actual request phase measurements. |
| Folia index/bootstrap/store | External bridge installs before React bootstrap; embed skips standalone library restore (`canRestoreSession:false`). Session application synchronously updates current song, queue, lyrics and clock. | Existing real consumer/navigation/keyboard suites plus deployed cold UI; no fork modification is yet justified. |
| Folia native intents/navigation | Source-aware native selection returns intent to host; active embed suppresses native audio. | Existing real bridge/controller tests; actual UI controls, source queue return and only one native bottom bar. |
| Backend account URL/lyrics | `NeteaseCookieProvider.resolveTrack` sequentially fetches detail, validated authorized URL, then lyric if requested. Existing false flag safely excludes lyric without weakening trial checks. | Foreground sends false; lyrics load independently; preserve authorization failures. Backend code need not change for this correction. |
| Backend cache/AMLL/stream | Cached Meting/ASMR fallback may still resolve optional data; AMLL has a 6s read timeout. Gateway preserves signed capability and Range streaming; external TTFB remains separate. | Measured resolved-source/timing and 206 responses; do not equate optional timeout with playback latency. |

## Acceptance gaps from the earlier release

Source-string checks and ready fake bridge tests cannot establish the stable-song activation invariant. Warmed UI selection can trigger a later session event and hide the defect. The regression checks must hold dependencies unresolved and assert the requested intermediate state, not merely await eventual success or count passing tests.

## Additional deployed acceptance finding

First delivery `44ca6365` passed the complete 1537-test suite and its 229-file production manifest. In a new browser page, rapidly repeated ordinary-row selection nevertheless raised two blocking `该歌曲当前无法播放，请稍后重试` alerts. The canceled older handler interpreted the engine's `false` result as an active failure. All three inspected URL-resolution responses were `OK` with usable audio; the foreground completed in about 2.35–4.01s, but the alert prevented later page/media processing until dismissed. Response-event timestamps observed around a blocking dialog are not a reliable network-duration measurement; request-to-loadingFinished is used instead.

The native-media boundary exposed another hole: assigning an empty `src` during selection reset can emit an error while the new song's URL is still pending, causing an unnecessary forced recovery request. A deferred real-engine regression explicitly emitting this native empty-source error failed with one forced recovery instead of zero. Reset now removes the source attribute and loads the empty element; media errors/end events require an active source. Ordinary handler requests must retain ownership of the exact current entry before showing an error or making post-selection UI changes. A mounted two-selection regression first failed on the stale blocking alert; genuine current-request errors remain visible.

These are application defects found by deployed acceptance, not attributed to unavailable provider audio. Their corrections passed the final delivery and acceptance recorded in verification.md.

## Deployed source metadata regression

Follow-up delivery `d8c0d9f9` passed 1541 frontend tests and exact runtime verification. A fresh browser confirmed correct cold entry, progressing native audio, changed lyric color, paused 03:00 reentry and Esc returning to the current lattice. Exiting to the same source route retained 1000 songs and the current highlighted entry but changed `IzumiShizuki喜欢的音乐` / 2238 total to `默认歌单` / 1000 total. This was stable after loading, not a transient placeholder.

Ordinary selection supplied only sourceCode/type. Engine profile normalization discarded track counts and queue replacement inherited the previous default heading. The page then seeded its browse profile from that incomplete engine profile, overwriting the already-loaded source metadata and taking its early return. A mounted RED reproduced the wrong heading/count; three engine REDs reproduced dropped counts, inherited metadata and ignored supplied profiles. Queue installation now carries the playlist profile, count normalization accepts both field conventions, and same-source browse seeding retains the valid loaded profile. A further RED protects refreshed snake-case totals and explicit empty description/cover. Cross-source return uses known source metadata and keeps the current queue.

## Operational baseline

Initial read-only server inspection found deployed site revision `7abce02172af0bd5b459f3b7147f25a928a3ffc3`, Folia gateway healthy, API UP, and only 133836800 bytes available on the root partition. Each frontend delivery verifies capacity and retains the existing READY restore point/current rollback image. The unrelated wallpaper branch in the primary checkout is excluded by the managed worktree.

During follow-up delivery, the capacity guard found 0 available bytes and stopped before activation. ID-scoped reclaimable-cache requests released no bytes. The unused, single-tag `folia-local/folia-builder:validation` image had no referencing containers and was removed as a regenerable verification artifact; available space recovered to about 1.2 GB. Production and rollback images, source archives, READY snapshots and data volumes were retained. The verified incremental deployment then completed normally.
