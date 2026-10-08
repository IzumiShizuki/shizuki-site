# Verification and handoff

## Summary

| Dimension | Result |
| --- | --- |
| Completeness | All four user requests implemented; local delivery complete after commit |
| Correctness | Resolution, progressive names, batch pagination and downloader completion scenarios covered |
| Coherence | Bounded caches, source labels, lazy thumbnails, unchanged filters and timeout/retry policy |

## Diagnosis evidence

- Recent successful import job 24 took approximately 629 seconds (see the existing quality diagnosis in `fix-workshop-video-size-rejection/quality-diagnosis.md`). No historical phase durations exist to attribute that whole interval to one cause. No production file was downloaded again or modified for this change.
- The deterministic regression `SteamCmdProcessRunnerTest#finishesVerifiedSuccessWithoutWaitingForLingeringProcessTimeout` failed before the change: success was accepted only after the timeout (`timedOut=true`, approximately 1.03 seconds with a one-second test timeout). After the change the same test passed in approximately 32 ms. Production polling is bounded at 200 ms; actual media-transfer throughput remains dependent on Steam/network conditions.
- Read-only requests from the personal server through its existing wallpaper proxy confirmed Wallhaven search has 24 results per page and omits title/tags. Screenshot item `pomle9` detail has no title but contains Japan/Tokyo/architecture and other source tags. Source names are used when present; tag-based names are descriptive fallbacks, not invented original artwork titles.
- The recent Workshop item `3812685876` has the explicit `1920 x 1080` source tag in both the public page and Steam details API. Preview dimensions are excluded from resolution parsing.
- Steam browse requested with `numperpage=72` returned only 30 distinct item anchors. Absolute offsets across source pages now return 72 logical items without losing remainders between batches.

The batch metadata request follows the official [Steam GetPublishedFileDetails contract](https://partner.steamgames.com/doc/webapi/ISteamRemoteStorage#GetPublishedFileDetails); API search includes the documented [return_tags option](https://partner.steamgames.com/doc/webapi/IPublishedFileService#QueryFiles).

## Scenario coverage

| Requirement/scenario | Evidence |
| --- | --- |
| Pixel, dynamic and missing Workshop resolution | `WorkshopResolutionTest`, `WorkshopMetadataProviderTest#batchLoadsResolutionsAndReusesMetadataForSelectionAndImport`, panel resolution test |
| Never infer resolution from thumbnails | `WorkshopResolutionTest#readsExplicitSteamPageFieldAndNeverUsesThumbnailDimensions` |
| Missing Wallhaven titles enriched through cached details | `WallpaperDiscoveryServiceImplTest#enrichesAndCachesWallhavenDetailNames`, panel legacy-title test |
| Throttling, bounded concurrency and stale responses | `WallhavenMetadataCacheTest`, panel deferral and previous-search tests |
| Source titles/custom import titles preserved | Existing discovery source-title and import-title tests |
| Wallhaven pages 1–3, 4–6 and final partial page | `WallpaperDiscoveryServiceImplTest#aggregatesWallhavenBatchesAndHandlesFinalPartialPage` |
| Steam partial source-page remainder preserved | `WallpaperDiscoveryServiceImplTest#aggregatesSteamCappedPagesWithoutSkippingPartialPageRemainders` |
| Prompt completion, invalid content, permanent errors and marker mismatch | `SteamCmdProcessRunnerTest`, including lingering-success tests and existing mismatch tests |
| Guest detail endpoint remains readable | `WallpaperDiscoveryControllerIntegrationTest`, `AuthEntryFilterTest` using actual configured guest paths |

## Quality checks

- Backend: `mvn -pl apps/monolith-app -am -Dtest=*Wallpaper*,*Workshop*,SteamCmdProcessRunnerTest,WallhavenMetadataCacheTest,AuthEntryFilterTest -Dsurefire.failIfNoSpecifiedTests=false test -q` passed: 86 media tests and 14 auth-filter tests.
- Frontend: seven wallpaper-related Vitest files, 55 tests, passed.
- Backend package: `mvn -pl apps/monolith-app -am -DskipTests package -q` passed.
- Frontend production build: `node node_modules/vite/bin/vite.js build` passed. Existing large-chunk warning remains.
- Strict OpenSpec validation and `git diff --check` passed. No temporary probe files or debug-prefix instrumentation remain. Frontend package defines no separate lint command.

## Delivery

- Commit the change locally with the required Izumi author; do not push or deploy without the corresponding authorization.
- Deploy backend and frontend together and explicitly set existing `WALLPAPER_DISCOVERY_PAGE_SIZE=72`; changed defaults alone do not override an already configured value of 24.
- Automatic Wallhaven detail enrichment allows 30 cache misses per minute globally and at most three frontend requests concurrently. Unknown names can take additional minutes to fill while the list remains usable. Requests use a bounded six-hour detail cache; thumbnails reuse search URLs to avoid detail-request multiplication.
- Workshop resolution is author-declared and can differ from actual media. Missing metadata is displayed as unknown. This prevents presenting a preview size as guaranteed source quality.
- `WORKSHOP_IMPORT_PHASE` logs now expose metadata, download/inspection and persistence timings for future slow jobs, without credentials or signed URLs.
- Production end-to-end throughput after deployment has not been measured; the recent 629-second import is not claimed to have been reduced to the regression-test time.
- The pre-existing `TopMenu.vue` changes are excluded from this commit.

No critical verification findings. No code implementation remains; production deployment and real-network throughput measurement are delivery follow-ups.
