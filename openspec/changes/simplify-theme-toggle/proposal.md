## Why

The current two-state day/night control opens a selection popover before the user can change theme, adding an unnecessary step for a binary action. The primary theme control should respond immediately while the previously agreed Home appearance controls remain available without competing with the toggle.

## What Changes

- Make the primary theme item switch directly between day and night on click.
- Stop opening the appearance popover from the day/night control.
- Preserve Home-only clock, wallpaper color, and motion controls behind a separate, explicitly labeled appearance-settings trigger.
- Keep the detailed appearance trigger out of content routes, where the theme toggle remains a single direct action.
- Update component tests for immediate switching, popover containment, and accessible state labels.

## Capabilities

### New Capabilities

- `direct-theme-toggle`: Defines the immediate day/night toggle and the separate Home appearance-settings affordance.

### Modified Capabilities

None.

## Impact

- `fronted/vue3-merged/src/components/TopMenu.vue`
- `fronted/vue3-merged/src/components/TopMenu.spec.js`
- No API, persistence schema, or dependency changes.
