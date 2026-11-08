# Entry delivery and menu verification

## Reproduction and cause

2026-11-08, ordinary production About URL, fresh desktop browser:

- Main bundle was the approved `index-De-7ZFz8.js` and organic shell was present. The server had the correct artifact, but HTML lacked Cache-Control; an earlier session retained an old document during the preceding release.
- Gzip already worked (main entry transferred 283,391 bytes). It was ruled out as the bottleneck.
- The existing production config already had a no-cache `/index.html`, but its exact `/` location serves that file directly with `try_files /index.html` and does not inherit the index location's headers. The root dispatch also handles DJ and must be preserved when adding the missing root header.
- Navigation DCL 1,550ms / load 16,292ms. Completed requests included Noto CJK 1,912,696 bytes / 11,833ms, WenKai 1,580,076 bytes / 10,666ms and the default PNG 2,006,550 bytes / 10,097ms. These three resources total 5,499,322 bytes.
- Collapsing navigation produced `MENU_NOT_DOCKED` at top=115px. A one-variable CSS probe that removed the hidden bar's flex footprint moved the handle to 0px.
- `node scripts/check-site-entry.mjs` failed against the original deployment with `HTML_REVALIDATION_MISSING`.
- The new background component regression failed with the real legacy `/images/original-bg.png` prop before wiring the efficient source boundary, then passed after the fix.

## Implementation and local checks

- HTML revalidation and immutable compiled assets are isolated Nginx locations; API proxy directives remain unchanged. Asset 404 responses do not receive the immutable success cache header.
- Built-in default uses the existing 80,536-byte WebP, including legacy renderer URLs. Custom URL, blob, signed/query and video/L2D sources are preserved.
- Generated WOFF2 assets are served through 94 disjoint Unicode ranges, retaining all 7,230 Noto and 7,164 WenKai cmap entries. Families, weights, glyph designs, name/license metadata and swap behavior remain intact. Source hashes, generated asset hashes and full served coverage are checked by regressions. Production/CI needs no Python tool or new dependency.
- The compact desktop bar is taken out of normal flow while hidden; the handle settles at y=0px. Expanded navigation, theme switching and phone layout were inspected using real rendering. No document horizontal overflow at 375/768/1024/1440px; focus remains visible. Approved About imagery/typography and real 12/3/4 stats remain.
- `pnpm test:unit --maxWorkers=4 --minWorkers=1`: 286 files / 1,835 tests passed.
- Production build passed; existing Sass and large chunk warnings remain. Impeccable scan of affected components reported no findings. `git diff --check` and strict OpenSpec validation passed.

## Production follow-up

The first live font split reduced bytes but requested 42 CJK shards on About; cold load was 17.3–21.2s, so it did not satisfy the performance objective. Warm document load was 254ms with zero font bytes transferred, confirming the cache policy works but not excusing the cold cost.

The first priority set promoted About/shared-shell bootstrap characters into the common faces (574,492 bytes combined). Its real production cold load measured 10,591ms and warm load 183ms, with 1,139,916 encoded font bytes and 2,022,547 total transferred resource bytes. This improved the baseline, but three rare CJK ranges and a small heading font still started late. The final iteration promotes those ranges into the two common faces (687,584 bytes combined) and preloads the existing Latin heading face. Rare binaries retain their stable groups, while narrower CSS ranges exclude promoted glyphs; the served ranges remain non-overlapping and preserve full coverage. Priority data is stored as Unicode sets, not copied user text.

## Final production verification

Released source `f2b3754f7d645c96405aeda546ae435ee2f369fa` to the existing frontend service on `111.228.35.186`. Both GitHub branch CI runs passed unit tests and build. Final local affected regressions: 4 files / 25 tests passed; previous full local run: 286 files / 1,835 tests passed.

- Ordinary `https://site.shizuki.online/#/author?tab=about` references `/assets/index-BCZGX9I1.js`; its approved organic About is visible in day/night modes. Public statistics are 12 posts, 3 categories and 4 tags. Fresh HTTP probe passes for both `/` and `/index.html`: `no-cache, max-age=0, must-revalidate`; compiled assets use `public, max-age=31536000, immutable`, while API/health and missing assets do not acquire that immutable policy.
- Two independent fresh desktop browser sessions request only the two common CJK faces. All font encoded bytes total **1,124,052**, down from **3,929,240** (71%). Browser-measured resource transfer totals **2,005,584** vs **6,702,104** before (70%); cross-origin resources without Timing-Allow-Origin are opaque to these byte totals. The built-in WebP is 80,536 bytes and no legacy built-in PNG is requested. The server-selected external wallpaper remains unchanged.
- Cold TTFB is 95–98ms, DCL 1.47–1.62s, last font response 4.18–4.62s. Full document load remains variable at **11.39–13.99s**, compared with the original single-run 16.29s. The fix materially reduces bytes; it does not establish a guaranteed cold-load duration or eliminate external image/rendering latency. Warm reload measured **255ms**, DCL 192ms, with zero font bytes transferred.
- Collapsed desktop handle settles at **top=0px / bottom=44px**, versus the failing original top=115px. Keyboard tab focus has a 3px solid outline and Enter restores navigation. Mobile controls open/close and 375px layout has no document overflow. Day/night rendering, actual Chinese text and 12/3/4 statistics remain intact. No browser JS errors were reported.
- Final image: `sha256:d09ae4ae41066195702bc6cbf26e8fe5cbd522aea0695e7540be9e7d82d6fe01`. All **301** release files passed SHA-256 verification, and **1,459** pre-existing non-index static files remain byte-identical. Nginx configuration validation and staged cache/API/404 HTTP probes passed before activation.
- Only `site` was recreated with `--no-build --no-deps`. All 8 other site containers retain IDs, image IDs and start times. Private configuration digests, backend/DJ revision markers and public DJ entry digest remain identical. Health is UP and the release lock is removed. Only `.deployed-frontend-commit` was advanced; backend/DJ deployment metadata was preserved.
- Verified full restore point retained: `/opt/shizuki-site-backups/snapshot-20261108-164016-9e6769e93836`. READY, app gzip integrity and database restore listing pass. Immediate prior frontend is pinned as `shizuki-site/site:before-entry-final-20261108`; guarded release code automatically restores the image/marker on an activation failure.

Raw browser captures, SHA manifests, guarded release scripts/state and screenshots are retained under `D:/program/_codex_deploy/entry-loading-20261108/` (`cold-final.json`, `cold-final-confirm.json`, `warm-final.json`, `production-final-*.png`, `release-state-final.json`). These operational files stay outside the repository and private logs are not published. Existing deployment-helper validation had one unrelated pre-existing example/default page-size mismatch (28 passed / 1 failed); the optional town gate is absent in this revision, so shared assets were checked by hashes instead.

All implementation tasks are complete. Existing already-open stale documents may require one reload to pick up the new HTML policy; future responses revalidate. No claim is made that a server header rewrites an already-cached document in place.
