# Verification: fix-workshop-video-size-rejection

Date: 2026-10-07

## Summary

| Dimension | Result |
| --- | --- |
| Completeness | 8/8 tasks, 2/2 requirements implemented |
| Correctness | 5/5 scenarios covered by passing regressions |
| Coherence | Independent limit, file-backed assets and preserved diagnostics match design |

No critical issues, warnings or suggestions remain within this change's scope. Proposal, design, specs, tasks, implementation and focused diffs were reviewed. No verification dimension was skipped.

## Scenario evidence

| Scenario | Implementation | Regression |
| --- | --- | --- |
| Downloaded video exceeds ordinary upload cap | `WallpaperServiceImpl.java:722` uses Workshop cap; `WallpaperWorkshopProperties.java:20` defaults to 512 MiB | `shouldImportDownloadedVideoAboveOrdinaryUploadLimit`, `shouldKeepProductionSizedWorkshopVideoOnDisk` |
| Runtime visual exceeds Workshop cap | Directory inspection checks size before reading and reports actual/configured size | `shouldEnforceWorkshopAssetLimitWithoutMisclassifyingVideo`, `shouldKeepSizeReasonAfterSuccessfulSteamDownload` |
| Video project includes metadata and preview | `project.json` is not a native marker; presentation previews remain excluded | `shouldKeepProductionSizedWorkshopVideoOnDisk`, `shouldSelectRuntimeMediaInsteadOfWorkshopPreview` |
| Native-only download | `.pkg`/`scene.json` still requires conversion | `shouldKeepInspectionReasonAfterSuccessfulSteamDownload`, existing native-preview regressions |
| Transfer succeeds but inspection fails | Runner returns terminal CONTENT; service retains inspection exception | `shouldKeepInspectionReasonAfterSuccessfulSteamDownload`, `shouldKeepSizeReasonAfterSuccessfulSteamDownload`, `SteamCmdProcessRunnerTest` |

`shouldPersistCachedWorkshopVideoThroughClosedStream` exercises the import task, consumes the real storage input stream, verifies content length and final SUCCEEDED/COMPLETED state, and proves the file stream closes. The production-size fixture has the observed 242,378,122-byte length and keeps `bytes == null`; it is a sparse size fixture, not a codec-playback test.

## Executed checks

All Maven and pnpm commands used the existing environment through `D:\environment\activate-shizuki-site.cmd`.

- Red/green feedback command: `mvn -B -pl modules/media-module -am -Dtest=WallpaperServiceImplTest#shouldImportDownloadedVideoAboveOrdinaryUploadLimit -Dsurefire.failIfNoSpecifiedTests=false test`. Failed twice with the original native-scene exception before the fix; passed after the fix. See `diagnosis.md` for sanitized production evidence and minimization.
- Focused persistence/runner tests: `mvn -B -pl modules/media-module -am -Dtest=WallpaperServiceImplTest,SteamCmdProcessRunnerTest -Dsurefire.failIfNoSpecifiedTests=false test` — 35 passed.
- Broader wallpaper checks: `mvn -B -pl modules/media-module -am -Dtest=*Wallpaper*,*Workshop*,SteamCmdProcessRunnerTest -Dsurefire.failIfNoSpecifiedTests=false test` — 76 passed, no failures, errors or skips; includes discovery/import controller integration checks and naming regressions.
- Frontend checks: `pnpm --dir fronted/vue3-merged test:unit src/components/app/WallpaperDiscoveryPanel.spec.js src/services/wallpaperApi.spec.js src/utils/wallpaperImportPolling.spec.js src/utils/wallpaperSearchCache.spec.js` — 4 files, 24 tests passed.
- Monolith packaging: `D:\environment\build-shizuki-monolith.cmd` — all 10 reactor modules succeeded. The helper skips tests; tests were run separately above.
- Frontend production build: `pnpm --dir fronted/vue3-merged build` — succeeded. Vite reported bundle-size and empty React-chunk warnings; neither is caused by these wallpaper changes.
- `git diff --check` — passed. The frontend has no configured lint script.
- `openspec validate fix-workshop-video-size-rejection --type change --strict --no-interactive` — valid.
- `openspec validate restore-wallhaven-source-names --type change --strict --no-interactive` — valid.

## Delivery and remaining operational scope

The configuration is mapped through monolith YAML, server Compose and the example environment file; the operations guide documents the separate cap and diagnostics. Ordinary uploads, direct downloads and archive extraction retain their existing limits.

Local implementation and builds are complete. No production service was restarted or deployed, no production library row was modified, and no Git push was performed. After deploying the rebuilt backend, retry item `3813102939` through the existing import action. Actual native scene packages still require conversion. HEVC playback on the user's browser was not verified; it is separate from the confirmed import-size failure.
