# Verification Report: refine-wallpaper-recovery-and-search

## Summary

| Dimension | Status |
| --- | --- |
| Completeness | 15/15 implementation and acceptance tasks complete; all three delta specs addressed |
| Correctness | Recovery, import, search-cache, preview request-count and responsive gallery scenarios passed focused tests or browser acceptance |
| Coherence | Implementation follows the change design and existing wallpaper preference, auth, API and theme patterns |

## Requirement evidence

| Requirement | Implementation and verification |
| --- | --- |
| Restore the actually applied wallpaper; import alone does not change selection | `fronted/vue3-merged/src/App.vue` writes scoped selection snapshots only from the apply path and restores saved profiles before the library request completes. `evidence/wallpaper-recovery-after.py` applies a profile through the real picker UI, confirms the application-generated snapshot and cached bytes, blocks the image request, reloads, and asserts the decoded `blob:` image is visible. It also checks a separate global selection remains intact while the route selection restores. |
| Preserve selections on temporary errors; reconcile authoritative removal | `src/utils/wallpaperSessionRecovery.js` and `wallpaperSessionRecovery.spec.js` cover temporary failure, public early restore, private account gating and scope-aware matching. `evidence/wallpaper-recovery-before.py` captures the original startup failure; `wallpaper-recovery-after.py` exercises reload after a 503 and verifies explicit route clearing does not resurrect the snapshot. |
| Bounded optional image storage and private-session cleanup | `src/utils/wallpaperBootCache.js` caps storage at four images and 16 MiB each, keys signed URLs by stable origin/path, and guards late writes by session generation. `wallpaperBootCache.spec.js` covers unavailable storage, write denial, signed-query reuse, oversize rejection, late logout writes, cache reads and clearing mixed private/public bytes at an auth boundary. App session cleanup clears image bytes on logout/account changes and revokes stale object URLs. |
| Safe and recoverable Workshop imports | Backend changes in `modules/media-module/src/main/java/io/github/shizuki/site/media/service/impl/SteamCmdProcessRunner.java`, `WallpaperServiceImpl.java` and `WorkshopDownloadChannelResolver.java` bound output and retries, classify evidenced errors, validate downloaded content, and keep diagnostics free of credentials/raw output. `SteamCmdProcessRunnerTest` and `WorkshopDownloadChannelResolverTest` are part of the backend focused suite. The picker captures the failed item ID before submission; `WallpaperDiscoveryPanel.spec.js` verifies item-matched retry and that a fallback failure never shows 100%. Local package import remains available from the existing add-wallpaper flow. |
| Compact responsive discovery and efficient searches | `WallpaperDiscoveryPanel.vue` provides the narrow desktop filter rail, square image-led gallery, pagination, inspector, mobile accessible filter disclosure and reduced blur. `wallpaperSearchCache.js` plus `wallpaperApi.js` provide bounded 60-second/24-entry query reuse, in-flight dedupe and explicit refresh bypass; the panel debounces filters and protects current results from stale responses. `WallpaperDiscoveryPanel.spec.js` and `wallpaperApi.spec.js` cover debounce, refresh, selected details, retry, and cache reuse. |
| Avoid per-result detail lookup when search already supplied preview metadata | Backend search metadata seeds the bounded trusted-host preview cache. Backend request-count regression evidence records one search + one image request for a known item after the change, versus one extra detail lookup before it; a miss/host-rejection control retains the detail fallback. Browser evidence records one search across dialog close/reopen, zero proxy preview requests for known thumb URLs, and one detail request only for the selected item. |

## Validation results

- Frontend focused suite: 50 tests passed across the six wallpaper cache, session, search, API and UI test files after the final cache-denial tests.
- Full frontend suite: 253 files and 1,526 tests passed. This run preceded the final two additional cache-denial tests; those tests were then included in the passing 50-test focused rerun. No implementation source changed after the full-suite run.
- Frontend production build: `pnpm build` succeeded. Vite emitted the existing large-chunk advisory (largest app entry about 801 kB); no build errors.
- Backend focused suite: 45 related tests passed, including Steam process-runner and search-to-preview behavior. In the initial reactor run, `SpotifyOAuthProviderStrategyTest` failed once during JDK loopback server initialization, so the media-module reactor was run separately. With that class excluded, the media reactor ran 320 tests with zero assertion failures and six loopback initialization errors: five in `AsmrMusicProviderFailoverTest` and one in `MetingMusicProviderTest`. Excluding those two classes then produced a successful media-module reactor with 309 tests. Retrying the loopback cases with IPv4 preference did not resolve the environment errors.
- Desktop and narrow browser acceptance: reran `evidence/wallpaper-discovery-browser.py` against the local Vite app. Desktop at 1980×1120 rendered 30 cards in a nine-column gallery; mobile at 820×1180 rendered two columns, with an accessible expanded filter toggle, no filter/gallery overlap, visible image-title overlays and selected-item inspector content. Both viewports reused one Workshop search after closing/reopening the dialog; known thumbnails made zero proxy preview requests.
- Wallpaper recovery browser acceptance: reran `evidence/wallpaper-recovery-after.py`; the UI-generated route selection and global selection survived a blocked-image reload with a decoded cached image, and clearing the route override left no route snapshot to restore.
- OpenSpec strict validation: `openspec validate refine-wallpaper-recovery-and-search --type change --strict --no-interactive` passed.

## External verification limits

Search latency against live Steam/Wallhaven/CDN was not benchmarked; request counts demonstrate eliminated redundant detail calls, not a measured end-to-end speedup. SteamCMD authenticated downloads were not exercised against production credentials or a live Workshop account, so the result of a real download remains dependent on account authentication, ownership and network state. A read-only SSH diagnostic to the configured personal server could not authenticate (`Permission denied (publickey,password)`); no server was changed. The unrelated JDK loopback test-class initialization errors are recorded above and do not indicate assertion failures in the affected wallpaper code.

## Saved browser evidence

- `evidence/wallpaper-recovery-before.png` and `evidence/wallpaper-recovery-after.png`
- `evidence/wallpaper-discovery-desktop.png` and `evidence/wallpaper-discovery-mobile.png`
- Repro scripts: `evidence/wallpaper-recovery-before.py`, `evidence/wallpaper-recovery-after.py`, and `evidence/wallpaper-discovery-browser.py`

## Final assessment

All change requirements have implementation and acceptance evidence. The remaining limits are external live-service verification and the unrelated Windows JDK loopback initialization failures documented above; neither is represented as a successful production download or live latency measurement.
