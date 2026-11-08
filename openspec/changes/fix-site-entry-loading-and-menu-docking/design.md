## Context

Production revision cc258c79 is served at the plain URL, but HTML has no explicit cache policy. Gzip already works and is not the bottleneck. A cold desktop capture measured DCL 1.55s, load 16.29s, Noto CJK 1.91MB, WenKai 1.58MB and the built-in background PNG 2.01MB. The selected default image already has an equivalent 80KB WebP in the repository. The collapsed menu hides the full bar with opacity/visibility while that bar still occupies flex layout space.

## Goals / Non-Goals

Reduce measured startup bytes and cache ambiguity; repair actual menu geometry. Preserve approved fonts/palette, user wallpapers, route semantics and shared production assets. Do not replace typography, remove glyphs, install new dependencies, change API/backend/DJ behavior or rewrite the app shell.

## Decisions

- Add explicit no-cache/revalidation to main HTML locations and immutable caching only to compiled assets. Keep API proxy locations and external/shared resources unchanged. Deploy the actual Nginx config with the runtime image, rather than only overlaying static assets as in the prior release.
- Reuse the existing default WebP and map legacy built-in PNG references at the rendering/resource boundary. Custom image/video/L2D URLs remain unchanged. This retains the same wallpaper and avoids a 2MB request; do not invent new art or change user preferences.
- Generate disjoint Unicode font shards from the two existing licensed fonts using installed FontTools/Brotli. Commit generated WOFF2 assets and CSS so CI/build needs no Python dependency. Keep the same families, weights, font-display and complete original Unicode coverage. Separate a common UI/Latin/kana shard from bounded rare-character shards. Record source hashes and a coverage manifest; generated fonts are referenced from CSS as build-hashed assets.
- Promote About/shared-shell bootstrap characters and the three rare ranges observed during public cold loading into the common faces (687,584 bytes combined, capped at 750KiB). Preload the existing 41KB Latin heading face so it starts with the document rather than after component rendering. Keep the original range groups stable for other pages, while removing fully promoted shards from generated output.
- Anchor compact desktop navigation to the top and remove its hidden full bar from normal flow. Keep small-screen navigation behavior and expanded toggle placement; verify actual rectangles rather than a CSS source-string assertion.
- HTTP probes and rendered geometry are red-capable feedback loops; font coverage/bytes, legacy-background mapping and Nginx cache policy receive focused regression checks. Full functional suite, build and cold/warm production measurements complete verification.

## Risks / Trade-offs

- Font sharding can increase request count or lose glyphs → disjoint full-cmap coverage, a bounded common shard and budget checks; inspect the real About and reading view.
- Existing cached documents cannot be rewritten in-place by a server header → validate fresh ordinary-URL loading and revalidation responses, retain old hashed resources for open pages and clearly state cache limits.
- Desktop docking rules can leak into mobile drawers → scope desktop positioning to the existing desktop breakpoint and test keyboard/mobile/scroll states.
- Production retains a distinct backend/DJ history → use the preceding isolated frontend release, image/snapshot/config/container guards and automatic frontend rollback. Update only frontend revision metadata.

## Migration Plan

Freeze verified source, build with existing production arguments, stage hash-checked assets plus the approved Nginx config on the pinned runtime image, verify with Nginx and HTTP/browser probes, then activate only site. Preserve all existing public/DJ/Folia resources. On failure restore the previous site image and frontend marker without touching backend services.
