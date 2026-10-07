## Why

Wallhaven discovery currently replaces every result title with a generated category and ID, so users cannot recognize the work by its source name. Imports also persist that placeholder as the wallpaper title.

## What Changes

- Preserve a descriptive Wallhaven source name in discovery results, preferring a usable title from source metadata and falling back to meaningful tags.
- Use the same derived name when importing, while preserving an intentional user-entered title and replacing legacy generated category-and-ID placeholders.
- Keep the category as metadata instead of including it in the title.

## Capabilities

### New Capabilities

- `wallhaven-source-names`: Wallhaven discovery and imports retain descriptive source names.

### Modified Capabilities

## Impact

- Backend Wallhaven search response and import name selection.
- Frontend Wallhaven discovery title normalization and import request.
- No persistence migration; previously imported wallpaper records are not renamed automatically.
