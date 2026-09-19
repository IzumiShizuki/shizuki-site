## Why

Workshop imports can download a complete Wallpaper Engine item through SteamCMD, then incorrectly persist its `preview.gif` or `preview.jpg` as the wallpaper visual. This reports a successful dynamic import while the application displays only the item's cover instead of a real playable resource.

## What Changes

- Inspect the downloaded Workshop project before choosing a visual asset and exclude preview/thumbnail files from runtime-media selection.
- Prefer real browser-playable media embedded in the Workshop directory, preserving the existing dynamic-media preference.
- Detect native Wallpaper Engine projects that contain only engine-specific resources and stop the import with a concise conversion-required fallback instead of importing a cover image.
- Add deterministic coverage for preview-only native projects and for projects that contain both a preview and a real playable visual resource.

## Capabilities

### New Capabilities

- `workshop-native-resource-import`: Faithful Workshop resource selection that never promotes a preview asset to an installed wallpaper.

### Modified Capabilities

None.

## Impact

- `WallpaperServiceImpl` Workshop directory detection and asynchronous import status.
- Wallpaper import-service regression tests and user-facing fallback messaging.
- No endpoint, database-schema, credential, or frontend-contract change is required.
