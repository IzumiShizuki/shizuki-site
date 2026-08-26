## Context

See `proposal.md` for motivation and scope. The current frontend already has a wallpaper-driven application shell, semantic day/night tokens, self-hosted typefaces, a blur-based `.liquid-material`, a global player bridge, an author profile API, and mature blog reading/editing features. `BlogListPage.vue` already resembles a three-part layout, while `AuthorPage.vue` and `BlogPage.vue` are large mixed-responsibility SFCs. Public content routes currently use several nested scroll containers, and `App.vue` explicitly gives Blog a fixed-height `overflow: hidden` workspace.

The backend already provides PostgreSQL/MySQL Flyway tracks, MyBatis-Plus content data, Redis, scheduled jobs, OSS direct upload, public/private buckets, signed delivery, media auditing, and logical deletion. It does not yet provide album/moment models, image variants, EXIF-safe display assets, weather/quote providers, or a reliable content lifecycle independent from asset visibility.

There are no archived main specs under `openspec/specs/`. This design therefore introduces new capabilities while recording compatibility with relevant historical change contracts:

- It supersedes only the Home-only `vivid` / `calm` / `off` motion requirements in `refine-home-time-islands`.
- It preserves Focus suppression of `TopMenu` and preservation of environment/player state from `evolve-home-focus-shell`.
- It preserves the quiet Home About entry and the limit on Home contextual islands from `integrate-home-room-entries`; Albums and Moments are not added to Home.
- It consumes the existing global theme/accent/material tokens and does not redesign the wallpaper workspace.
- It projects the existing global player state and does not change music providers, authorization, playback recovery, or caching.

The subject is a personal digital garden and life archive for visitors who want to understand Shizuki and then move naturally into writing, photographs, moments, and music. The page's single job is to make that personal story discoverable without weakening reading focus or turning the site into a generic dashboard.

## Goals / Non-Goals

**Goals:**

- Establish one reusable public-content layout and scroll contract across About, Blog, Albums, and Moments.
- Create durable, testable album, moment, weather, quote, and admin contracts without extending existing monolithic services.
- Make the immersive visual direction distinctive while deriving all color, typography, and accessibility behavior from the existing system.
- Keep original media private by default and make every transition to public delivery explicit, reversible, and auditable.
- Isolate external-provider failure so personal pages and blog reading still render from cached or local content.
- Make implementation deployable in additive phases with feature flags and no fictional production seed data.

**Non-Goals:**

- No Home redesign, new Home content islands, new mobile `/m` product shell, or router-history migration.
- No new music provider, autoplay behavior, player engine rewrite, or duplicated playlist/account state.
- No visitor likes, comments, reactions, uploads, or social feed.
- No full import of the Hitokoto sentence bundle and no automatic IP geolocation.
- No performance/device/battery-based motion-mode selection; unsupported browser features receive capability fallbacks only.
- No rewrite of the existing author data model before the new public composition has proven stable.
- No immediate physical deletion of originals or destructive rollback migration.

## Decisions

### 1. Use a restrained “Memory Lens” visual direction

The signature element is a single refractive lens that appears in the compact menu, the actively manipulated Polaroid, and the transition into a media lightbox. It should feel like the same water-glass object moving through the site, not a different effect on every card.

The design vocabulary maps to existing tokens rather than adding a parallel theme:

| Role | Design name | Reference value | Existing source |
|---|---|---:|---|
| Night foundation | Night Charcoal | `#1A141C` | dark panel endpoint |
| Primary accent | Rose Glass | `#F2B39D` | `--accent-hex` |
| Soft accent | Milk Peach | `#F7D3C3` | `--accent-soft-rgb` |
| Day foundation | Warm Paper | `#FFFCF8` | day panel start |
| Day ink | Cocoa Ink | `#402C2A` | day primary text |
| Muted night text | Dust Linen | `#CDB7A8` | dark tertiary text |

Actual components SHALL consume `--theme-*`, `--accent-*`, material, spacing, radius, shadow, and focus tokens so wallpaper-derived accent updates continue to work. Display headings use the existing Zen Maru Gothic/LXGW WenKai stack, body and controls use Roboto/Noto Sans SC, and quotes use the existing restrained handwritten display stack. No font download is added.

The initial idea of applying refraction to every panel was rejected as a generic “glassmorphism everywhere” treatment that would compete with wallpaper, photography, and long-form text. The revised direction spends visual boldness only on navigation and media focus. Reader surfaces use a quieter translucent/matte material with strong text contrast.

### 2. Make the center column dominant and use one public-page scroll root

The shell uses the existing `--app-workspace-content-max-width` baseline, extended only if visual testing proves 1320 px insufficient. Columns are intentionally unequal:

```text
Desktop ≥ 1200 px
┌────────────────────── scroll-aware liquid navigation ──────────────────────┐
│  left rail 240–270  │  story / article  minmax(0, 1fr)  │ right 280–320   │
│  segmented sticky   │  normal document flow + local rails │ sticky cards   │
└─────────────────────────────────────────────────────────────────────────────┘

Tablet 900–1199 px
┌────────────────────── navigation ──────────────────────┐
│ left/context 220–250 │ main content                   │
│                      │ right widgets become in-flow   │
└────────────────────────────────────────────────────────┘

Mobile < 900 px
┌──────────── compact glass dock ────────────┐
│ main content, one vertical document flow   │
│ auxiliary life/context cards in bottom sheet│
└─────────────────────────────────────────────┘
```

`ThreeColumnContentShell` owns layout slots only. `StickyCardStack` owns segmented stickiness. `HorizontalCardRail` owns local horizontal scrolling with touch, keyboard, buttons, and wheel translation; it consumes a vertical wheel only while it can move in that direction and returns scrolling to the page at either edge.

Public About, Blog list, Blog reader, Gallery, Album detail, and Moments use one App-owned route scroll root. The App shell exposes its scroll state to navigation instead of making `TopMenu` listen to `window`. The Blog editor and other desktop workspaces remain fixed-height internal-scroll exceptions. This separation is required before sticky rails, menu condensation, scroll restoration, and view transitions can behave predictably.

### 3. Split composition from domain behavior before reshaping large pages

New shared presentation boundaries are:

```text
PublicContentShell
├─ ThreeColumnContentShell
│  ├─ StickyCardStack
│  ├─ HorizontalCardRail
│  └─ AuxiliaryDrawer (mobile)
├─ LiquidSurface + LiquidGlassFilterDefs
├─ MediaLightbox
└─ useViewTransitionNavigation

AuthorPage
├─ AuthorProfileRail
├─ AuthorStoryColumn
└─ LifeWidgetRail

BlogListPage
├─ BlogTaxonomyRail
├─ BlogArticleStream
└─ BlogDiscoveryRail

BlogPage route composition
├─ BlogReaderView -> public content shell
└─ BlogEditorWorkspace -> existing fixed workspace behavior
```

`AuthorPage.vue` retains route/data orchestration while existing overview, journey, and about sections move into components without changing payloads. `BlogPage.vue` first separates reader and editor behavior; its obsolete list compatibility branch is removed only after route tests prove `/blog` remains owned by `BlogListPage.vue`. Admin panels are lazy-loaded by domain rather than added back into either public SFC.

### 4. Implement liquid navigation as a state machine with semantic controls

The desktop menu has three visual states: top/expanded, scrolled/compact, and Site-menu-open. The compact state is a centered pill driven by route-scroll position; manual expansion and the existing Focus visibility policy remain separate state inputs. Opening the Site control reveals About, Albums, and Moments plus small recent-content previews. It supports focus entry, arrow/tab navigation, Escape, outside-click dismissal, and focus return. Buttons and links replace clickable `div` controls in the changed surface.

Mobile exposes one “Life” item in the existing glass dock and opens the same destinations in an accessible bottom sheet. About, Albums, Album-detail, and Moments routes share one Site-active highlight. Home continues to expose its existing quiet About action and does not gain duplicate Album or Moment cards.

`LiquidGlassFilterDefs` injects one hidden SVG definition at the App shell. `LiquidSurface` uses SVG displacement/refraction only for the effective immersive mode; soothing uses the current blur/saturate material. CSS `@supports` and feature detection may fall back to base glass when the browser cannot render a referenced backdrop filter. This is a compatibility fallback, not an inferred user-performance mode. Strong refraction is limited to the compact menu, active media, and lightbox transition.

### 5. Replace fragmented animation controls with one stored and one effective motion mode

`useMotionPreference` is the single site-level source of truth:

- Stored mode: exactly `immersive` or `soothing`, default `immersive`.
- Legacy migration: `vivid -> immersive`; `calm -> soothing`; `off -> soothing`; unknown/missing -> `immersive`.
- Effective mode: stored mode unless `prefers-reduced-motion: reduce`, in which case effective behavior is soothing while the stored choice remains unchanged.
- Root attributes expose both stored and effective values so CSS, Motion Vue, pointer effects, Author reveal logic, Blog transitions, and material filters use the same decision.

Immersive enables refraction, Polaroid lift/tilt, pointer highlight, restrained parallax, elastic press feedback, and shared-element transitions. Soothing keeps focus/selection feedback, opacity transitions, short translations, and base glass but removes parallax, elastic overshoot, card tilt, and displacement animation. No code inspects CPU, GPU, screen size, network, power state, or frame rate to change the mode automatically.

Existing AOS/reveal, ripple, press wobble, and Motion Vue effects receive an ownership rule: one component node has one transition owner. New components opt out of global reveal when they use view transitions or local motion.

### 6. Assign modules by reading priority rather than duplicating every widget

- About: left profile/statistics; center existing personal story plus featured Album and Moment rails; right full weather, daily quote, and now-playing/recommended-playlist cards.
- Blog list: left taxonomy/archive; center article stream with selected life-content rails; right compact weather, quote, recent/featured content, and current playback status.
- Blog reader: left table of contents/context; center article; right only collapsible quote and now-playing cards. The editor does not mount life widgets.
- Albums index: left album filters/context; center album grid/rail; right selected album metadata or featured Moments.
- Album detail: left album metadata; center photo composition; right navigation/download policy. Opening a photo transitions to the common dark lightbox.
- Moments: left time/tag context; center chronological cards; right calendar/featured context. A card expands in place; only its images open the lightbox.

Widget/provider failure is contained to the card. Empty Albums/Moments show an intentional invitation such as “内容正在整理” and no wallpaper/avatar placeholders. All public images require meaningful alt text or an explicit decorative designation.

### 7. Keep life domains in content-module and media transformation in media-module

Do not add these responsibilities to the existing multi-thousand-line `ContentServiceImpl` or `MediaServiceImpl`. Introduce focused services (`AlbumService`, `MomentService`, `SiteWidgetService`, `ImageDerivativeService`) behind existing module boundaries.

The additive relational model is:

```text
CTN_PHOTO
  id, original_asset_id, title, alt_text, captured_at_draft,
  published_location_label, processing_status,
  recycle_time, purge_after, audit/version fields

CTN_ALBUM
  id, public_slug, title, summary, cover_photo_id,
  lifecycle_status, visibility_status, featured_flag, sort_num,
  publish_time, restore_lifecycle_status, recycle_time, purge_after,
  audit/version fields

CTN_ALBUM_PHOTO
  album_id, photo_id, media_ref_id, sort_num, caption, download_mode, version

CTN_MOMENT
  id, public_id, body, lifecycle_status, visibility_status,
  featured_flag, pinned_flag, publish_time, restore_lifecycle_status,
  recycle_time, purge_after,
  audit/version fields

CTN_MOMENT_PHOTO
  moment_id, photo_id, media_ref_id, sort_num, version

MDA_ASSET_VARIANT
  source_asset_id, variant_asset_id, variant_code,
  delivery_scope, width, height, processor_version, process_status,
  retry_count, last_error, audit/version fields

CTN_SITE_LOCATION
  id, display_name, latitude, longitude, timezone, enabled_flag

CTN_SITE_WIDGET_CONFIG
  singleton_key, active_location_id, weather_enabled,
  weather_max_stale_minutes, quote_source_mode, hitokoto_enabled,
  audit/version fields

CTN_QUOTE
  text, author, source_title, category, provider,
  provider_uuid, source_url, approval_status, enabled_flag

CTN_DAILY_QUOTE_SNAPSHOT
  quote_date, rendered quote/provenance snapshot, stale_flag, fetched_at

CTN_WEATHER_SNAPSHOT
  site_location_id, normalized provider payload, observed_at, fetched_at
```

Database constraints, rather than distributed locks alone, protect the final facts: `quote_date` is unique; `(source_asset_id, variant_code, delivery_scope, processor_version)` is unique; each album-photo and moment-photo association has a unique high-entropy `media_ref_id`; and the singleton widget configuration points to at most one active default site location. Redis locks reduce duplicate work but are not the integrity boundary.

Lifecycle (`DRAFT`, `PUBLISHED`, `ARCHIVED`, `RECYCLED`) is independent of audience visibility (`PUBLIC`, `UNLISTED`, `PRIVATE`). Draft, archived, and recycled content is admin-only. Published public content appears in lists and featured rails. Published unlisted content is reachable only through a high-entropy URL, is excluded from listings/search/sitemap, emits `noindex`, and is served with `private, no-store` content/media responses; unlisted is explicitly link-only rather than an authentication boundary. Published private content remains admin-only.

Albums and Moments reference shared `CTN_PHOTO` records, so one upload can appear in more than one composition. Reordering is transactional and uses an explicit request version/ETag because the existing `version_num` column alone is not assumed to provide optimistic locking. `RECYCLED` remains a queryable business state and does not set the framework logical-delete flag; only a completed permanent purge may leave a tombstone. Soft deletion records `purge_after` and a safe restore target: an item recycled from draft returns to `DRAFT`, while one recycled from published or archived content returns to `ARCHIVED`; restore never republishes content automatically. Physical object cleanup occurs only after retention expiry, a reference-count check, and an auditable admin purge/dry-run flow. Purge is an explicit admin command in the first phase, not an automatic deletion scheduler.

### 8. Expose cursor-based public APIs and explicit admin commands

Public contracts use stable cursor ordering by `(publish_time, id)` and existing response envelopes:

- `GET /api/v1/life/featured`
- `GET /api/v1/albums?cursor=&limit=`
- `GET /api/v1/albums/{slug}`
- `GET /api/v1/moments?cursor=&limit=`
- `GET /api/v1/moments/{publicId}`
- `GET /api/v1/site/weather`
- `POST /api/v1/site/weather/nearby`
- `GET /api/v1/site/quote/today`
- `GET /api/v1/site/quote/alternatives?cursor=`
- `GET /api/v1/media/{mediaRef}/variants/{variantCode}`

Admin APIs live under `/api/v1/admin/life/**` and `/api/v1/admin/site-widgets/**`. They provide CRUD plus explicit preview, publish, withdraw/archive, reorder, recycle, restore, and purge commands. Clients submit asset IDs, never arbitrary OSS bucket/key pairs or provider base URLs. Public content endpoints are identity-insensitive and never return draft or private content, including to an authenticated administrator; every draft/private visitor-presentation preview uses a dedicated authorization-checked admin preview endpoint that is excluded from public Redis and HTTP caches.

Public list responses carry ETag/Last-Modified where practical. Album/Moment list caches use short Redis TTLs and write-through invalidation. Delivery responses expose site-owned opaque association URLs, dimensions, format candidates, and a placeholder color, but never asset IDs, bucket names, object keys, or upstream signatures. `mediaRef` resolves to one album-photo or moment-photo association, not merely a shared asset; the gateway therefore evaluates the exact content lifecycle, visibility, variant, and association-level download mode. Public associations use stable high-entropy refs, while unlisted/admin-preview/original requests additionally require a short-lived site capability bound to the association, variant, actor scope, and content version.

### 9. Fix admin authorization before exposing any new write API

The current permission aspect matches method annotations only, while several admin controllers place `@RequireGroup("ADMIN")` at class level. The security foundation is changed first so annotations are resolved from both the most-specific method and target class. Group and permission constraints are orthogonal and conjunctive: a class-level `ADMIN` group and a method-level permission both apply, so a non-admin cannot bypass the studio boundary merely by holding a scoped permission. A method declaration may replace a class declaration only for the same annotation dimension. Destructive publish, recycle, and purge services also perform a defense-in-depth permission check.

The new permission seeds are scoped, for example `life.content.manage`, `site.widgets.manage`, and `media.derivative.manage`, while ADMIN retains its existing bypass semantics for permissions after group membership has been authenticated. Integration tests exercise the real aspect with guest -> 401, ordinary authenticated user -> 403, and authorized admin -> success for both class-level and method-level annotations.

### 10. Use a private-original, verified-derivative media pipeline

All originals upload to the personal site's private bucket through the existing signed upload flow. Finalization first rejects an object whose declared size exceeds the hard byte limit, then reads the entire object through a bounded stream so SHA-256 covers every byte while signature, safe decoding, pixel/frame limits, orientation, and capture metadata are verified into an admin-only draft. A damaged image, MIME mismatch, decompression bomb, truncated stream, size overrun, or unsupported animated input fails closed.

Variant work is durable in `MDA_ASSET_VARIANT`; a database-backed worker claims idempotent `(source, variant, delivery_scope, processor_version)` work and retries bounded failures. The first implementation extends the storage integration to use OSS image processing and `sys/saveas` for orientation, resize, quality, WebP, and AVIF materialization. This avoids a fragile native Java AVIF encoder and is supported in the configured Hangzhou region. Required variants are `THUMB_WEBP`, `DISPLAY_WEBP`, and `FULL_SANITIZED`; `DISPLAY_AVIF` is generated when the deployment preflight confirms regional support. The frontend uses `<picture>` and always has WebP fallback.

Processed output is marked ready and eligible for trusted derivative approval only after source ownership, complete decode, configured safety checks, and an independent inspection prove it contains no GPS, device, or other EXIF metadata. A generated variant does not bypass the existing asset audit merely because a worker created it. Variants distinguish private working delivery from public materialization so the same original can safely serve items with different visibility. If provider re-encoding fails metadata verification, publication remains blocked and a server-side sanitized fallback processor may be introduced without changing the domain contract. Official OSS documentation supports server-side WebP/AVIF conversion and private-object processing, but the implementation must still verify metadata removal rather than assume it: [format conversion](https://help.aliyun.com/zh/oss/user-guide/convert-image-formats-2), [processing limits](https://help.aliyun.com/zh/oss/user-guide/overview-17/), and [private processing modes](https://help.aliyun.com/zh/oss/user-guide/img-implementation-modes).

The original always remains private. Every visitor response uses a site-owned opaque media route containing an association ref rather than a shared asset identifier. The backend authorizes the current association, signs any OSS upstream request server-side, and streams or internally reverse-proxies the bytes; it never redirects the browser to OSS or exposes bucket names, object keys, OSS signatures, or durable origin URLs in JSON, headers, browser requests, or logs. Public-scope sanitized variants may receive public cache headers through this gateway; unlisted/private previews and original downloads use short-lived association-scoped gateway grants with `private, no-store`. Moving content away from PUBLIC invalidates its gateway grants/cache keys and removes public-scope variants only after reference checks show no other eligible public Album or Moment requires the photo. Download mode is stored per album-photo association and defaults to `NONE`; `SANITIZED` exposes the full sanitized variant, while `ORIGINAL` requires an explicit admin privacy warning and a separate short-lived grant bound to that album-photo association, so one album can never elevate another association's access.

### 11. Put provider adapters behind cached local facts

`WeatherProvider` and `QuoteProvider` interfaces keep public pages independent from third-party response shapes. Provider URLs and allowed hosts are server configuration, never editable arbitrary URLs. Clients enforce HTTPS, connect/read timeouts, response-size limits, schema validation, and bounded retries.

Open-Meteo is the first weather provider. The site-city endpoint reads the location referenced by singleton widget configuration, caches results for 15–30 minutes, and persists the last successful site snapshot. Site snapshots older than the configured maximum stale age (default six hours) are unavailable rather than useful fallbacks. “My weather” begins only after an explicit browser action and geolocation grant. The client sends coordinates in a POST body; the backend immediately validates and rounds them before cache/upstream use, does not persist them, and excludes them from logs and analytics. Nearby snapshots exist only in a bounded short-TTL Redis/LRU cache, use per-client and global token buckets without durable identity association, and return `private, no-store`; when abuse control or Redis safety state cannot authorize an upstream call, the endpoint fails closed instead of bypassing limits. Denial makes no request and leaves the site city visible. Responses include location scope, update time, stale state, and required “Weather data by Open-Meteo” attribution. Open-Meteo's official terms require attribution and define non-commercial free-tier limits: [official pricing and licence](https://open-meteo.com/en/pricing), [forecast API](https://open-meteo.com/en/docs).

Hitokoto is the first quote provider when `quote_source_mode=HITOKOTO`. A distributed-lock-protected daily job fetches one bounded response, validates text/provenance, and writes at most one immutable snapshot for the site-local date; an upstream result is not inserted into the approved local library unless an administrator later performs an explicit audited curation action. In `LOCAL` mode the job deterministically chooses only an enabled, approved local quote and makes no Hitokoto call. A current-date snapshot, not a live request per visitor, is the canonical “today” fact. If an enabled upstream fails, the service may commit an approved local fallback for that date; if the local library is also empty it returns the last-good snapshot with `stale=true` and its original effective date, or an explicit unavailable state without creating a current-date canonical snapshot. “换一句” only traverses approved local quotes and never triggers Hitokoto. UUID, source, author, type, and attribution URL are retained. The complete AGPL sentence bundle is not mirrored by default: [Hitokoto API](https://developer.hitokoto.cn/sentence/), [official bundle licence](https://github.com/hitokoto-osc/sentences-bundle).

Redis cache misses and scheduled refreshes use a shared distributed lock so multiple monolith instances do not fan out provider calls. Visitor requests never synchronously call Hitokoto. If Redis/locking safety is unavailable, refresh fails closed and reads only database last-good facts (or unavailable) instead of allowing every instance to contact a provider. Provider failure never fails the About or Blog endpoint; widget state degrades independently. Changing the active location, quote source mode, or local quote eligibility performs a versioned transaction and targeted cache invalidation and is captured by the studio audit trail.

### 12. Extend the existing admin console as a grouped content studio

The existing Admin route remains the only administration shell. Its navigation becomes observably grouped into System, Content, Site Appearance, and Feedback without moving existing tools out of their current authority boundary. Albums and Moments open lazy-loaded second-level workspaces. Quote curation and site-city/widget settings use smaller panels in the same shell.

Album workflow: create draft -> batch upload private originals -> inspect/process -> arrange photos and cover -> preview by admin URL -> publish. Moment workflow: create draft -> attach existing/new photos -> arrange -> preview -> publish. Both expose explicit visibility, featured status, archive, recycle, restore, retention timing, and version conflict messages. The author can reuse one processed photo across Album and Moment records.

The studio shows processing failures, stale provider state, missing alt text, privacy warnings, and public-to-private cleanup status in plain language. A normal refresh never replaces an already committed current-date quote; this keeps same-day identity stable. The first phase does not expose a manual same-day override. Empty public content is valid; the UI never creates production demo records to make a layout look complete.

Permanent purge uses a two-step server contract. A dry-run returns blocking references and, only when eligible, a short-lived single-use confirmation capability bound to the administrator, target set, current versions, and expiry. The purge command must present that capability; bypassing the UI, changing a target, or replaying an expired/used capability is rejected and audited.

## Risks / Trade-offs

- [Risk] Current Author and Blog SFCs are large and combine public, edit, and styling responsibilities. -> Extract behavior-preserving components and reader/editor seams before layout changes; keep route-level integration tests green after each extraction.
- [Risk] Changing Blog's nested scroll topology can break sticky behavior, reading progress, and return position. -> Establish and test the App-owned public scroll root first; keep the editor as an explicit exception and add route scroll-restoration tests.
- [Risk] SVG backdrop refraction has uneven browser support or may reduce text clarity. -> Restrict it to three focal surfaces, provide `@supports` base-glass fallback, and run contrast/visual checks in both themes and modes.
- [Risk] Multiple old animation systems can double-animate the same node. -> Assign one transition owner per node, add opt-out markers, and test effective soothing mode with system reduced motion enabled.
- [Risk] Legacy users who selected `off` will receive soothing rather than zero motion. -> Perform the agreed deterministic migration, keep focus feedback essential, and document the breaking preference change.
- [Risk] Class-level admin annotations are currently not reliably intercepted. -> Make permission-aspect correction and real 401/403 tests a release blocker before new write endpoints.
- [Risk] OSS metadata, MIME, AVIF support, and processing limits can differ from assumptions. -> Verify decoded bytes and post-process metadata, preflight the personal bucket/region, require WebP fallback, and block publication when required variants are not ready.
- [Risk] Public-to-private changes can leave cached public derivatives accessible. -> Use a two-phase transition with public object deletion/CDN invalidation before committing the restricted state; add an end-to-end revocation test.
- [Risk] “Unlisted” URLs can be forwarded and are not authentication. -> Use high-entropy identifiers, exclude discovery surfaces, emit `noindex`, and label the limitation in Admin.
- [Risk] Third-party APIs can time out, change schema, or rate-limit. -> Cache local facts, lock refreshes, validate bounded responses, persist last-good snapshots, and isolate failure per widget.
- [Risk] Visitor coordinates could leak through logs or cache keys. -> Accept them only after explicit consent, normalize before use, keep them out of persistence/analytics/logs, and test logging filters.
- [Risk] Variant generation and retained originals increase storage and processing cost. -> Use a small named variant set, record processor versions, expose metrics, and perform reference-aware delayed cleanup.
- [Risk] Paired SQL migration tracks can drift. -> Add equivalent `V431` and PostgreSQL `V1011` migrations plus schema/constraint tests in the monolith integration suite.
- [Risk] The configured fallback private bucket name may not reflect the personal-site boundary. -> Deployment preflight MUST verify effective OSS endpoint/bucket environment values belong to `111.228.35.186`'s personal-site deployment before processing production photos.

## Migration Plan

1. Land the authorization-aspect correction, permission seeds, response contracts, and paired additive migrations. Keep all new public routes behind `site.personal-content.enabled=false`.
2. Add content services and media variant processing. Verify the effective personal OSS buckets, upload privacy, EXIF stripping, AVIF capability, public-to-private revocation, and cleanup dry-run in staging.
3. Add provider adapters, Redis locks, snapshots, attribution, and Admin configuration. Exercise timeout/invalid JSON/last-good behavior without exposing widgets publicly.
4. Add grouped Admin workspaces. Migrate only existing author profile presentation; create no Album or Moment production rows. Let the administrator publish the first real content through the new workflow.
5. Establish the shared public scroll shell and motion-preference migration, then migrate Blog list, Author, and Blog reader separately. Keep the Blog editor on its existing workspace contract.
6. Add Albums/Moments routes and preview rails, then enable the Site menu and compact navigation. Roll out to admins first, then public traffic.
7. Run the complete frontend/backend suites plus the visual/accessibility matrix for desktop, tablet, mobile, day/night, immersive/soothing, reduced motion, empty data, stale data, and provider failure.
8. After a stable observation window, remove only obsolete UI compatibility branches. Retain original author JSON and additive tables for rollback.

Rollback is feature-flag first: disable Site menu previews, life routes, and external widgets while leaving schema and private media intact. Restore the old Author/Blog composition and map the persisted two-mode value only at the UI boundary if required. Database rollback does not drop new tables or originals; public variants created by this feature can be invalidated asynchronously after routes are disabled.
