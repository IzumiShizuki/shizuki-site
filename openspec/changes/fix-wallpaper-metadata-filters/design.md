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

**Non-Goals:**

- Do not scrape every Workshop detail page per search result.
- Do not invent semantic titles that Wallhaven does not provide; use a localized category plus source ID label.
- Do not expose Wallhaven NSFW controls without an API-key/capability contract.
- Do not redesign the picker, import lifecycle, or persistence model.

## Decisions

### Parse the first card image as a modern fallback

Continue finding unique item IDs and slicing bounded card blocks as today. Within each block, prefer legacy title/preview selectors for compatibility, then inspect the first image tag following the item link and read quoted `src` and `alt` attributes. Attribute extraction accepts either quote style, strips tags, and decodes named and numeric HTML entities. A generic first-image fallback is safe because each block starts at the item's detail link and ends before the next unique item.

Adding a full HTML parser dependency was rejected because the page data needed here is small, bounded, and already guarded by item-ID validation; a new dependency would not remove the upstream-markup compatibility requirement.

### Use an allowlisted comma-separated Workshop tag parameter

The public endpoint accepts an optional `tags` query value. The frontend builds it from three single-select controls: type, genre, and resolution. The backend splits, trims, deduplicates, and allowlists values before mapping them to `requiredtags[index]` for the Steam API and `requiredtags[]` for the browse fallback. This keeps the API additive and avoids allowing callers to inject arbitrary Steam query options.

Separate backend parameters for every filter group were considered, but one normalized tag list maps more directly to both upstream paths and remains extensible without changing the controller signature again.

### Preserve Wallhaven's non-NSFW guest capabilities

Add `order` to the existing Wallhaven service boundary and retain the existing category, purity, minimum-resolution, and ratios inputs. When no API key exists, clear only the third NSFW purity bit; do not replace the entire purity value with `100`. This follows Wallhaven's documented rule that only NSFW requires a valid API key.

The UI exposes SFW and SFW+sketchy modes, landscape/ultrawide/portrait/square ratio presets, and ascending/descending order. It does not expose NSFW because the backend cannot advertise key availability today.

### Enrich the existing Wallhaven result record

Add optional popularity, creation, color, and source fields to the response record and normalize both camelCase and snake_case in the frontend. Existing JSON consumers remain compatible because fields are additive. Cards show only a concise line; the inspector can show more detail without increasing explanatory prose.

## Risks / Trade-offs

- [Steam changes its markup again] → Keep legacy and modern fixtures, deterministic fallback labels, and same-origin detail/preview fallback behavior.
- [Required-tag labels drift upstream] → Restrict values to observed Wallpaper Engine filter labels and cover query encoding in tests.
- [More filters make the toolbar crowded] → Use a compact secondary filter row that wraps on narrow screens without changing the overall shell.
- [Wallhaven optional fields are missing] → Treat every enrichment field as optional and retain ID-based labels.

## Migration Plan

1. Deploy additive backend query parameters and response fields first.
2. Deploy the frontend controls and enriched normalization against the compatible endpoints.
3. Verify Workshop titles/previews and Wallhaven filtered searches through production public endpoints.
4. Roll back by restoring the previous backend/frontend image; no stored data requires migration.
