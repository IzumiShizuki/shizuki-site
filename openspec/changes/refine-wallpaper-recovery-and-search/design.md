## Context

See proposal.md for scope and motivation. The existing cache utility has no production callers. App.vue replaces the library with an emergency default on errors, then validates stored selections against that fallback and deletes them. WallpaperDiscoveryPanel uses same-origin previews, whose backend resolves item details again for every image. Existing lazy image decoding is useful, but backend searches and previews have no bounded application cache. SteamCMD output is discarded and timeout/nonzero exit share one generic message.

The supplied screenshots establish the desired composition. Previous changes establish existing parent events, access controls and theme tokens. Luna owns implementation and acceptance on codex/refine-wallpaper-recovery-and-search; the primary agent owns the decisions and this contract.

## Goals / Non-Goals

**Goals:** preserve selected IDs through transient failures; show cached imagery before remote loading; make downloader errors actionable; reduce measured upstream request counts; fit more selectable wallpapers in the same viewport.

**Non-Goals:** caching arbitrary large video or scene archives in browser storage; adding unsupported Wallpaper Engine renderers or filters; bypassing Steam ownership or Steam Guard; redesigning unrelated site surfaces; deploying or pushing changes.

## Decisions

### Restore a scoped display snapshot and reconcile only with authoritative data

Connect the existing browser cache to actual wallpaper application and startup. Extend the snapshot minimally with the profile data, account ownership and scope needed to resolve the saved selection. Record successful image display or applied profile rather than arbitrary search/download activity. At startup, display the route-effective snapshot while restoring authorized library metadata. Restore dynamic profiles normally, using cached posters during initialization rather than claiming full offline scene/video playback.

Temporary errors and provisional guest loading must not clear persisted IDs. Successful authoritative data, explicit deletion and account access changes determine invalidation. Revoke temporary object URLs and keep image storage bounded (existing four-image limit or equivalent explicit byte/item bounds). Clear private state on logout/account change. Preserve existing preference keys and migrate the v1 snapshot when safe.

Alternative: keep only saved IDs and wait for the API. This cannot display a selected wallpaper during slow or failed startup. Caching full downloadable scene packages was excluded because it adds an unrelated offline asset lifecycle.

### Keep downloader execution observable and recover only evidence-backed transient failures

Consume SteamCMD output continuously into a bounded buffer so the pipe cannot deadlock. Map recognized failure evidence into fixed safe user messages; never return raw process output, command credentials or guessed permanent diagnoses. Timeout and I/O failure have explicit classifications. Terminate processes on timeout/interruption and ensure retries do not leak processes or temporary output.

Retry identified temporary download/network failures within a small fixed attempt/time budget; do not retry authentication, Steam Guard, missing ownership or invalid content automatically. Keep download byte progress tied to actual observations. Offer an explicit retry in the selected-item inspector, retaining optional local package import. Rename configured channel copy so it reports readiness rather than guaranteed success. Existing job status and APIs remain compatible; additive fields are allowed only when required.

Alternative: increasing timeouts and replacing the error sentence cannot distinguish authentication failures or prove better downloads. Production account readiness remains separate from code correctness and must be identified in acceptance notes if not tested.

### Avoid repeated upstream work at bounded cache seams

Use normalized source/query/filter/page keys with a short TTL and explicit maximum entries for discovery results, deduplicate in-flight identical requests, and provide refresh bypass. Coalesce rapid filter edits while explicit Enter/search remains immediate; preserve stale-response guards and abort where the existing authorized fetch supports it.

Prefer the result-provided thumbnail if reliable. If the same-origin proxy is needed, seed server-side preview metadata from returned search items and reuse bounded metadata/image caches so grid display does not refetch details per item. Never accept an arbitrary unvalidated proxy URL from the browser. Preserve source host validation, response size/type checks, rate limits and access controls. Bound eviction and concurrent work; do not cache private data in a public/shared discovery cache.

Alternative: only restyle cards leaves the repeated request fan-out untouched. Unbounded prefetch or permanent caches increase memory and bandwidth and are excluded.

### Apply the reference's gallery composition within the site's visual identity

Visitor mode is Operate: people scan images, narrow results, select a candidate and import or apply it. Desktop layout uses a roughly 170-210px filter rail, flexible dense image gallery and roughly 280-330px inspector. Target compact tiles around 150-190px on common desktop sizes, with short title overlays and minimal metadata; tune against both supplied images and real viewports. Keep search/sort above results and pagination below them. Move supported type/style/resolution/tags into the rail, with reset and filter disclosure. Do not invent unavailable Steam capabilities.

Use existing theme/accent variables with more opaque surfaces and substantially less backdrop blur in the gallery. Selection should have one clear border/indicator. Preserve keyboard focus, Chinese labels, source tabs, import events and auth behavior. Collapse the rail into a disclosure on narrow viewports and move details below the grid when needed. Verify loading, empty, failed thumbnail, search failure and import failure states visually.

Alternative: copying Wallpaper Engine's exact blue/black palette would discard site identity; retaining the current spacious two-column layout misses the user's requested density and filter organization.

## Risks / Trade-offs

- [Expired signed media or inaccessible cache] -> Prefer cached bytes for display, refresh authorized profile URLs, and degrade without deleting identity.
- [Private snapshot survives session change] -> Bind restoration to account lifecycle and clear private snapshots and displayed object URLs on logout/change.
- [Search cache becomes stale] -> Use short TTLs, bounded entries, refresh bypass and source/parameter separation.
- [SteamCMD still cannot authenticate on production] -> Report the precise safe reason and external requirement; deterministic tests cannot substitute for an authorized real server download.
- [Dense gallery loses accessibility] -> Preserve semantic buttons, labels, focus visibility and usable touch layout; inspect multiple viewport sizes.

## Migration Plan

No database migration or new dependency is expected. Migrate compatible existing browser snapshots defensively. Deliver locally committed implementation and verification evidence; deployment requires a separate authorized task. Rollback is a code revert with safe reading of existing browser cache versions.

## Authorized release continuation (2026-10-07)

The user explicitly requested redeployment after a read-only audit found the live `cd69da6a` music/podcast release omitted the wallpaper merge. Merge the exact verified master commit `bf793d5e` into that release branch so ancestry and executable contents both retain wallpaper and current cloud-music behavior. The merge also carries the existing wallpaper byte-progress prerequisite and its additive database columns. Preserve unrelated local edits and all existing private production settings; do not push Git or rebuild the unchanged Folia service.

Use fresh backups and frozen current images before switching. The server root disk is constrained, so prepare full snapshots and artifact build contexts in RAM and, if necessary, verify a complete snapshot in the existing private local backup area before discarding its RAM copy. Keep a persistent database/source rollback checkpoint and manifest on the server. A rollback to the current application can retain the additive nullable byte-progress columns; restoring a complete database snapshot is a separate recovery operation. Confirm actual compiled wallpaper classes, frontend artifact hashes, source ancestry and migration state after switching.
