# Verification: restore-wallhaven-source-names

Date: 2026-10-07

## Summary

| Dimension | Result |
| --- | --- |
| Completeness | 6/6 tasks, 2/2 requirements implemented |
| Correctness | 4/4 scenarios covered by passing backend/frontend regressions |
| Coherence | Backend shared resolver, additive response field and editable override match design |

No critical issues, warnings or suggestions remain within this change's scope. All planning artifacts and the focused code diff were reviewed; no verification dimension was skipped.

## Scenario evidence

| Scenario | Implementation | Regression |
| --- | --- | --- |
| Descriptive source URL | Search response uses `resolveWallhavenTitle` in `WallpaperDiscoveryServiceImpl.java:277`; source resolver strips query/path separators and decodes URI path | `returnsDescriptiveWallhavenSourceTitles` covers Behance slug and encoded path |
| No usable source name | Resolver ignores numeric, image, hash and ArtStation ID segments; meaningful tags precede `Wallhaven #id` fallback | Same test covers ArtStation IDs, duplicate/generic tags, image filename and numeric source |
| Blank or legacy import title | Import resolves current metadata for missing/known category-and-ID titles | `importsSourceNameForMissingOrLegacyTitle` covers null, empty, category/hyphen/dot variants and provider placeholder |
| Custom import title | Non-placeholder request titles remain intact | `preservesCustomWallhavenImportTitle` and discovery component custom-title assertion |

`WallpaperDiscoveryPanel.vue:595` consumes the backend title and keeps category in metadata. `WallpaperDiscoveryPanel.spec.js` verifies the original source name appears, the old category-and-ID label disappears, the default import uses the source title, and a custom title is retained.

## Executed checks

Commands ran after activating the existing `D:\environment\activate-shizuki-site.cmd` environment.

- `mvn -B -pl modules/media-module -am -Dtest=*Wallpaper*,*Workshop*,SteamCmdProcessRunnerTest -Dsurefire.failIfNoSpecifiedTests=false test` — 76 tests passed, including all 18 discovery-service tests.
- `pnpm --dir fronted/vue3-merged test:unit src/components/app/WallpaperDiscoveryPanel.spec.js src/services/wallpaperApi.spec.js src/utils/wallpaperImportPolling.spec.js src/utils/wallpaperSearchCache.spec.js` — 4 files, 24 tests passed.
- `D:\environment\build-shizuki-monolith.cmd` — 10-module monolith package/install succeeded; response constructors compile across the application.
- `pnpm --dir fronted/vue3-merged build` — production build succeeded, with existing bundle-size and empty React-chunk warnings.
- `git diff --check` — passed; no frontend lint script is configured.
- `openspec validate restore-wallhaven-source-names --type change --strict --no-interactive` — valid.

## Delivery scope

Local backend and frontend changes are complete. Deploy both to expose the resolved title in discovery. If Wallhaven provides no artwork title or descriptive source URL, the display uses descriptive tags or the ID fallback; the resolver does not invent an exact original title or fetch unrelated source pages. Existing library records are not renamed automatically. No database migration, production deployment or Git push was performed.
