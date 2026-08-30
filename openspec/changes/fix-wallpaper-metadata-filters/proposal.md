## Why

Steam Workshop changed its browse-card markup, so production search still finds item IDs but returns blank titles and preview URLs; every result is rendered as an unnamed wallpaper. The discovery workspace also omits useful source filters that its backend already accepts, leaving users with too little control over Wallhaven and Workshop results.

## What Changes

- Parse both legacy and current Steam Workshop browse cards, including titles stored in image alternative text and previews without legacy CSS classes.
- Keep Workshop item-detail title and preview fallback behavior usable when no Steam Web API key is configured.
- Return and display useful available metadata instead of generic unnamed labels, while keeping source IDs visible as secondary identifiers.
- Add Workshop type, genre, and resolution filters and pass them to both the Steam API and browse-scrape paths.
- Add Wallhaven purity, aspect-ratio, and order filters alongside the existing category and minimum-resolution controls.
- Preserve current public discovery access, preview proxying, imports, visual style, pagination, and source switching.

## Capabilities

### New Capabilities

- `wallpaper-discovery-catalog`: Reliable wallpaper result metadata and source-specific filtering for Workshop and Wallhaven discovery.

### Modified Capabilities

None.

## Impact

- Backend wallpaper discovery controller, service contract, Workshop HTML parser, response metadata, and regression tests.
- Frontend wallpaper discovery API parameter mapping, filter state, result normalization, metadata display, and component tests.
- Existing endpoint paths remain stable; added query parameters and response fields are backward compatible.
- No database schema or new runtime dependency is required.
