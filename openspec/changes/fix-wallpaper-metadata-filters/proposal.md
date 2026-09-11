## Why

Steam Workshop changed its browse-card markup, so production search still finds item IDs but returns blank titles and preview URLs; every result is rendered as an unnamed wallpaper. The discovery workspace also omits useful source filters that its backend already accepts, leaving users with too little control over Wallhaven and Workshop results.

## What Changes

- Parse both legacy and current Steam Workshop browse cards, including titles stored in image alternative text and previews without legacy CSS classes.
- Keep Workshop item-detail title and preview fallback behavior usable when no Steam Web API key is configured.
- Return and display useful available metadata instead of generic unnamed labels, while keeping source IDs visible as secondary identifiers.
- Add Workshop type, genre, and resolution filters and pass them to both the Steam API and browse-scrape paths.
- Add Wallhaven purity, aspect-ratio, and order filters alongside the existing category and minimum-resolution controls.
- Present Wallhaven age ratings as explicit checkboxes, and keep every native select option readable in both day and night themes.
- Tint the persistent top menu surface from the configured or wallpaper-derived accent instead of leaving the bar on a neutral-only surface.
- Show an accessible, automatically refreshed stage indicator while a discovered wallpaper is queued, downloaded, parsed, and added to the library.
- Preserve current public discovery access, preview proxying, imports, visual style, pagination, and source switching.

## Capabilities

### New Capabilities

- `wallpaper-discovery-catalog`: Reliable wallpaper result metadata and source-specific filtering for Workshop and Wallhaven discovery.
- `theme-aware-navigation`: Top navigation surfaces that visibly respond to the active accent while retaining contrast-safe content.
- `wallpaper-import-progress`: Observable discovery-import progress that advances from submission through terminal completion or failure.

### Modified Capabilities

None.

## Impact

- Backend wallpaper discovery controller, service contract, Workshop HTML parser, response metadata, and regression tests.
- Frontend wallpaper discovery API parameter mapping, filter state, result normalization, metadata display, and component tests.
- Top-menu surface tokens, wallpaper form-control contrast, import status polling, and accessible progress presentation.
- Existing endpoint paths remain stable; added query parameters and response fields are backward compatible.
- No database schema or new runtime dependency is required.
