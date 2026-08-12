## Why

The current wallpaper acquisition flow is a compact settings-panel section. It exposes the upstream sources, but it does not give users a dependable visual preview or the browsing controls they expect from a Wallpaper-style workshop. As a result, users cannot confidently inspect a wallpaper before importing it, and the acquisition experience feels disconnected from the rest of the product.

## What Changes

- Add a dedicated Wallpaper-style discovery workspace that can be opened from the existing background picker.
- Rebuild the discovery layout around a source rail, search/filter toolbar, result gallery, and persistent detail/preview inspector.
- Support source-specific search controls for Steam Workshop and Wallhaven, including sorting, categories, resolution, purity, ratios, pagination, and refresh states.
- Make previews resilient: normalize usable thumbnail URLs, show loading/error placeholders, allow retry, and preserve selection when a thumbnail fails.
- Keep existing local package import, Workshop import, Wallhaven pull, import-job status, and background-application actions available from the new workspace.
- Preserve the existing wallpaper library selection and per-wallpaper settings flow.

## Capabilities

### New Capabilities

- `wallpaper-discovery-shell`: A Wallpaper-style browsing workspace for searching, previewing, inspecting, and importing wallpapers from supported sources.

### Modified Capabilities

None.

## Impact

- Frontend: the background picker and discovery components under `fronted/vue3-merged/src/components/app/`, plus wallpaper discovery API normalization/tests.
- Backend: only if required to make upstream preview metadata usable; existing discovery endpoints remain the source of truth.
- User-visible behavior: “获取壁纸” opens a larger focused workspace instead of relying on the current compact panel; import and library behavior remain compatible.
- No new runtime dependency is expected.
