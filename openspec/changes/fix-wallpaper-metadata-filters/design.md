## Context

See `proposal.md` for motivation and `specs/wallpaper-discovery-catalog/spec.md` for the behavior contract. Production currently uses the Steam browse-scrape fallback because no Steam API key is configured. Steam's current browse page still renders server-side item links, but its generated class names replaced the legacy `workshopItemTitle` and `workshopItemPreviewImage` classes. The first card image now carries both the preview URL and title (`src` and `alt`).

The Wallhaven search response already supplies category, purity, resolution, ratio, size, views, favorites, creation time, and colors. The backend currently discards several of those fields, while the frontend hard-codes purity and never sends ratios or order.

## Goals / Non-Goals

**Goals:**

- Keep parsing deterministic and fast using bounded card blocks around unique Workshop IDs.
- Preserve old Workshop markup support while extracting metadata from current cards.
- Add constrained, source-native filters without exposing arbitrary upstream parameters.
- Carry useful Wallhaven metadata through the existing API and UI normalization boundary.
- Keep the current glass-edged discovery visual language and compact copy density.
- Make the top navigation glass visibly accent-aware without turning the entire bar into a saturated button surface.
- Expose asynchronous import state inside discovery and refresh it without manual status polling.

**Non-Goals:**

- Do not scrape every Workshop detail page per search result.
- Do not invent semantic titles that Wallhaven does not provide; use a localized category plus source ID label.
- Do not expose Wallhaven NSFW controls without an API-key/capability contract.
- Do not change wallpaper import persistence or claim byte-level download precision that the backend does not expose.

## Decisions

### Parse the first card image as a modern fallback

Continue finding unique item IDs and slicing bounded card blocks as today. Within each block, prefer legacy title/preview selectors for compatibility, then inspect the first image tag following the item link and read quoted `src` and `alt` attributes. Attribute extraction accepts either quote style, strips tags, and decodes named and numeric HTML entities. A generic first-image fallback is safe because each block starts at the item's detail link and ends before the next unique item.

Adding a full HTML parser dependency was rejected because the page data needed here is small, bounded, and already guarded by item-ID validation; a new dependency would not remove the upstream-markup compatibility requirement.

### Use an allowlisted comma-separated Workshop tag parameter

The public endpoint accepts an optional `tags` query value. The frontend builds it from three single-select controls: type, genre, and resolution. The backend splits, trims, deduplicates, and allowlists values before mapping them to `requiredtags[index]` for the Steam API and `requiredtags[]` for the browse fallback. This keeps the API additive and avoids allowing callers to inject arbitrary Steam query options.

Separate backend parameters for every filter group were considered, but one normalized tag list maps more directly to both upstream paths and remains extensible without changing the controller signature again.

### Preserve Wallhaven's non-NSFW guest capabilities

Add `order` to the existing Wallhaven service boundary and retain the existing category, purity, minimum-resolution, and ratios inputs. When no API key exists, clear only the third NSFW purity bit; do not replace the entire purity value with `100`. This follows Wallhaven's documented rule that only NSFW requires a valid API key.

The UI exposes SFW and sketchy as two labeled checkboxes, landscape/ultrawide/portrait/square ratio presets, and ascending/descending order. It does not expose NSFW because the backend cannot advertise key availability today. The purity bit string is derived from those checkboxes, with safe automatically restored if both would otherwise be disabled.

### Give native option popups an explicit surface contract

Native `select` values continue using the existing compact controls, while their `option` elements receive a non-transparent semantic panel surface and semantic foreground. This directly fixes the Windows native-popup case where the select inherited light text but the expanded option list stayed white.

Replacing every select with a custom popover was rejected because it would add focus, keyboard, positioning, and mobile interaction complexity for no product benefit.

### Tint navigation glass at the component token boundary

Build `--menu-glass-bg` from a restrained accent gradient layered over the elevated semantic panel surface. Both desktop and mobile liquid surfaces already consume this token, so one component-local change keeps all navigation modes synchronized with configured and wallpaper-derived accent updates.

Hard-coding a new menu color was rejected because it would drift from the user's selected color and from automatic wallpaper accent sampling.

### Model import progress as server-backed stages

Keep the existing import job status as the source of truth. The client maps submission, pending, running, succeeded, failed, and fallback-required states to an accessible progress model and automatically polls non-terminal jobs on a bounded interval. Running remains visually indeterminate because the backend does not expose total bytes; the UI labels it as download and parsing rather than presenting a false precise percentage.

The progress state is passed into discovery through the existing picker boundary. Polling stops on terminal status, authentication loss, component teardown, or a newer import job.

### Enrich the existing Wallhaven result record

Add optional popularity, creation, color, and source fields to the response record and normalize both camelCase and snake_case in the frontend. Existing JSON consumers remain compatible because fields are additive. Cards show only a concise line; the inspector can show more detail without increasing explanatory prose.

## Risks / Trade-offs

- [Steam changes its markup again] → Keep legacy and modern fixtures, deterministic fallback labels, and same-origin detail/preview fallback behavior.
- [Required-tag labels drift upstream] → Restrict values to observed Wallpaper Engine filter labels and cover query encoding in tests.
- [More filters make the toolbar crowded] → Use a compact secondary filter row that wraps on narrow screens without changing the overall shell.
- [Wallhaven optional fields are missing] → Treat every enrichment field as optional and retain ID-based labels.
- [Native option styling varies by browser] → Use explicit semantic foreground/background plus `color-scheme`; retain native controls for keyboard and mobile behavior.
- [Import polling outlives the dialog] → Keep one timer owned by `App`, clear it on terminal state/unmount, and ignore stale job IDs.

## Migration Plan

1. Deploy additive backend query parameters and response fields first.
2. Deploy the frontend controls and enriched normalization against the compatible endpoints.
3. Verify Workshop titles/previews and Wallhaven filtered searches through production public endpoints.
4. Roll back by restoring the previous backend/frontend image; no stored data requires migration.
