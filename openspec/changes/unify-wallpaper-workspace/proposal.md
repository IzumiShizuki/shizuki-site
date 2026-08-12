## Why

The background picker currently separates the small Shizuki library picker from a visually unrelated dark discovery client, forcing users to switch between two different products. The whole workflow should read as one familiar Wallpaper-style workspace while retaining Shizuki's existing translucent material language and concise copy.

## What Changes

- Replace the two-mode header with one workspace navigation for My Wallpapers, Discover, and Workshop.
- Give every section the same frosted-glass frame, toolbar, gallery rhythm, and persistent right-side detail panel.
- Move library selection, route/global scope, owned-wallpaper properties, online search, preview, and import into that shared workspace.
- Replace long instructional paragraphs and decorative labels with compact controls, state labels, and actionable empty/error states.
- Consolidate local package and manual Workshop URL import into a small add-wallpaper panel instead of two large explanatory cards.
- Preserve all existing parent events, authentication boundaries, preview fallbacks, import jobs, and background application behavior.

## Capabilities

### New Capabilities

- `unified-wallpaper-workspace`: A single Wallpaper-style background workspace for installed wallpapers, online discovery, Workshop browsing, details, settings, and imports using Shizuki's glass visual system.

### Modified Capabilities

None.

## Impact

- Frontend components: `BackgroundPickerDialog.vue`, `WallpaperDiscoveryPanel.vue`, and their component tests.
- No API, database, dependency, or parent-owned background behavior changes.
- The existing `pickerMode` and discovery event contracts remain compatible with `App.vue`.
