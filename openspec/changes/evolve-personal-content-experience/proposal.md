## Why

Shizuki Site already has a distinctive wallpaper-driven theme, author profile, blog, music player, and glass material, but its personal story and blog experiences are fragmented and lack durable life-content models. This change turns them into one coherent, responsive personal archive with intentional liquid-glass interaction, while keeping content maintainable, private by default, and resilient to third-party data sources.

## What Changes

- Reshape the author/about experience, blog list, and blog detail into a shared responsive content shell: three columns on desktop, two on tablet, and a focused single-column layout with auxiliary drawers on mobile.
- Add a refractive Site menu for About, Albums, and Moments, plus scroll-aware compact navigation that preserves the current Home and Focus shell contracts.
- **BREAKING** Replace the existing `vivid` / `calm` / `off` motion preference with exactly `immersive` / `soothing`; migrate old values, default to immersive, persist manual choice, and force only the effective soothing behavior when the operating system requests reduced motion.
- Add first-class photo albums and life moments with featured preview rails, standalone routes, admin-only authoring, draft/public/unlisted/private visibility, soft deletion, and intentional empty states instead of production demo content.
- Store original photos privately, expose only authorized optimized derivatives, strip EXIF from display assets, and require explicit publication of location and original-download access.
- Add cached site widgets: Open-Meteo weather with an admin-configured site city and explicit visitor geolocation consent, and Hitokoto daily quotes with provenance, local curation, and last-good/local fallback.
- Reuse the existing global player and recommended playlists for compact music cards without autoplaying, resetting, or duplicating playback state.
- Reorganize the existing admin console into grouped navigation with dedicated album and moment workspaces plus widget configuration and quote curation.
- Harden admin authorization so class-level and method-level admin annotations are both enforced before the new write APIs are exposed.

## Capabilities

### New Capabilities

- `site-material-navigation`: Scroll-aware refractive navigation, the Site content menu, responsive mobile entry points, theme integration, and compatibility with Focus suppression.
- `site-motion-preferences`: The global immersive/soothing preference, legacy-value migration, persistence, effective reduced-motion behavior, and interaction motion policy.
- `personal-content-pages`: Shared three-column content composition and the agreed module hierarchy across About, Blog list, Blog detail, Albums, and Moments.
- `photo-albums`: Album and photo publication, visibility, featured previews, standalone browsing, media privacy, derivatives, EXIF handling, lightbox behavior, administration, and recovery.
- `life-moments`: Moment publication, visibility, featured previews, inline expansion, media lightbox behavior, administration, and recovery.
- `site-weather`: Site-city and consent-based visitor weather, Open-Meteo integration, caching, fallback, attribution, and location privacy.
- `daily-quote`: Hitokoto ingestion, one canonical daily quote, local alternatives, provenance, curation, caching, and fallback behavior.
- `personal-content-studio`: Grouped admin navigation, admin-only content workflows, preview/publish operations, and shared authorization guarantees.

### Modified Capabilities

<!-- No main specifications currently exist under openspec/specs/. This change introduces the first contracts for these behaviors. The design records which unarchived historical change contracts are superseded or preserved. -->

## Impact

- Frontend shell and preferences in `fronted/vue3-merged/src/App.vue`, `src/components/TopMenu.vue`, theme/material styles, and motion utilities.
- Author, blog list, blog detail, routing, new album/moment pages, reusable three-column rails/cards, global player projection, and associated Vue unit tests.
- Existing admin shell plus new content-studio panels and API clients.
- Content-module domain models, mappers, services, public/admin controllers, database migrations, cursor queries, publishing state, and integration tests.
- Media-module upload/authorization paths, optimized derivative generation, metadata stripping, private/public delivery, reference-aware deletion, and security tests.
- Monolith configuration, Redis caching, scheduled provider refresh, last-good snapshots, Hitokoto/Open-Meteo adapters, attribution metadata, and failure isolation.
- Existing production author content is migrated into the new composition; no fictional albums or moments are seeded.
- No change to music-provider resolution, account binding, playback caching, Home contextual-island limits, wallpaper workspace behavior, or Focus environment preservation.
