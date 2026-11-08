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

The final priority set promotes About/shared-shell bootstrap characters into the common faces. The two common binaries total 574,492 bytes. Rare binaries retain their stable groups, while narrower CSS ranges exclude promoted glyphs; the served ranges remain non-overlapping and preserve full coverage. Local About now requests only two CJK assets, about 0.97MB including all fonts. Priority data is stored as Unicode sets, not copied user text.

Pending: stage the priority-font iteration, rerun the original public cold/warm/menu/HTTP probes and record actual production results. Retain the current cache policy, the verified full snapshot and a current-image rollback tag. A local network measurement is not a production speed guarantee.
