## Context

`MusicLibraryPage.vue` receives both the current route wallpaper and the Home wallpaper through `HOME_STAGE_CONTEXT_KEY`. The current resolver selects the Home value first, while its watcher and sync function already update the Folia host and bridge when their resolved input changes. The toolbar uses the existing semantic theme tokens, but reserves 140px on the right and styles desktop controls at 26px high with 6px action gaps.

## Goals / Non-Goals

**Goals:**

- Resolve the current music route wallpaper first, with Home as a fallback, and keep the existing reactive update path.
- Preserve preview-based rendering for dynamic wallpaper backgrounds.
- Improve toolbar hierarchy, target size, spacing, and reflow while keeping the current theme, controls, and DOM order.

**Non-Goals:**

- Add a new wallpaper download/import format or render video and Live2D sources as CSS background images.
- Change Folia playback ownership, bridge messages, audio controls, or the underlying wallpaper picker.

## Decisions

### Prefer the route-effective wallpaper

Read the injected `wallpaper` ref before `homeWallpaper`. The route value represents the background already active for the current music page and participates in the existing watcher; Home remains the fallback if route context is absent. Keeping the watcher and bridge protocol avoids remounting Folia or introducing duplicate state.

Continuing to prefer Home would leave route-specific music wallpaper selections invisible in Folia. Duplicating a separate Folia wallpaper setting would make the displayed background disagree with the music page's effective selection.

### Keep dynamic preview handling

Continue resolving dynamic wallpaper backgrounds to their preview image for image-backed layers and preserve the existing dynamic metadata in the bridge payload. Rendering video or Live2D directly as a CSS image would fail and is outside this toolbar/synchronization change.

### Reflow the existing toolbar

Retain the track summary first in DOM order and the playlist/actions after it. Increase desktop control height and spacing, remove the unused fixed right reservation, and let the action group wrap at intermediate widths. On narrow screens, keep the established icon-only presentation while increasing its hit area and retaining its existing accessible names.

## Risks / Trade-offs

- A taller toolbar leaves slightly less vertical space for Folia content → Keep the increase bounded and retain the compact single-row arrangement on wide screens.
- A music route with its own wallpaper may differ from a Home-only override → Folia will match the wallpaper effective for the music route, which is the background context users are changing while on that page.

## Migration Plan

No migration is required. The change only updates frontend wallpaper selection and toolbar layout; rollback consists of reverting the `MusicLibraryPage.vue` change.
