## Why

Shizuki Site already has the main environmental and productivity primitives—wallpaper, ambient audio, music playback, floating light apps, Todo, and AI—but the home experience still presents them as loosely connected features. The first evolution slice should establish the product's intended loop: return home, see the current state, enter Focus, and keep the environment and selected tools stable while working.

## What Changes

- Reorder the desktop Home experience around four destinations: Focus, Music, Blog, and AI.
- Make Focus a site-level App Shell state rather than another router page or only a Pomodoro sub-mode.
- Add an explicit Focus lifecycle with entry, active, and exit behavior.
- Preserve wallpaper, ambient audio/video, clock, player, lyrics, and visualizer while Focus is active.
- Hide normal route navigation and unrelated floating apps during Focus.
- Add Focus presets that choose light apps to open by default without changing the environment theme.
- Surface the current Todo item in Home and Focus, with explicit completion writeback only.
- Keep Apps as a management area and keep the existing Todo, Music, Blog, and AI core implementations intact.

## Capabilities

### New Capabilities

- `focus-session`: Site-level Focus lifecycle, environment preservation, navigation suppression, light-app presets, and Todo context.
- `home-workspace`: Home information hierarchy and entry points for the personal workspace loop.

### Modified Capabilities

<!-- No existing main specs are present; the first behavior contracts are introduced above. -->

## Impact

- Frontend Home and App Shell composition in `fronted/vue3-merged/src/pages/HomePage.vue` and `src/App.vue`.
- Desktop navigation in `src/components/TopMenu.vue`.
- Focus state and visibility policy in `src/composables`, `src/utils`, and light-app runtime components.
- Todo context and reminder-to-focus event handling in the TimePrism light-app components.
- Player and visualizer visibility rules in the global Music components.
- New unit tests for state transitions, visibility policy, Home actions, and Focus/Todo integration.
- No backend API or database migration is required for this first slice; Focus session state and presets remain frontend-local until the behavior is validated.
