## Why

Folia currently resolves the Home wallpaper before the wallpaper active for the music route, so changing the music page background can leave the embedded player showing a stale image. Its toolbar also packs the track summary and actions into short, tightly spaced controls, making the main controls harder to scan and use.

## What Changes

- Make the Folia embed follow the effective wallpaper for the current music route and update both its ambient surface and embedded wallpaper when that selection changes.
- Preserve still-image previews for dynamic wallpapers in CSS-backed areas while passing the dynamic metadata through the existing Folia bridge.
- Give the Folia toolbar more vertical room, larger controls, clearer spacing, and responsive wrapping while preserving its current theme and actions.

## Capabilities

### New Capabilities

- `folia-music-surface`: Current-route wallpaper synchronization and a responsive, comfortably spaced Folia toolbar in the music workspace.

### Modified Capabilities

None.

## Impact

- Frontend: `fronted/vue3-merged/src/pages/MusicLibraryPage.vue` and its existing Home-stage context input.
- No API, storage, or database changes.
