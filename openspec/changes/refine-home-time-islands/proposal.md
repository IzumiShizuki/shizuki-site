## Why

The current desktop Home already provides wallpaper, Focus, and light-app entry points, but its two large glass cards obscure the wallpaper and make the page feel like a dashboard rather than a calm arrival space. The confirmed prototype shows a clearer product identity: time is the visual center, contextual actions stay compact, and the existing Menu and floating-app system remain available without changing content routes.

## What Changes

- Replace the desktop Home card composition with a borderless centered time stage over the active wallpaper.
- Add a responsive row of up to three contextual islands for music, Focus/Todo, and a time-aware reminder; islands expose concise state and direct actions.
- Keep the existing collapsed Menu interaction and existing routes; Home styling and ambient motion do not propagate to Blog or other content pages.
- Add Home appearance preferences for clock visibility and three motion intensities, persisted locally and adjustable from a Home-specific secondary panel opened from the Menu theme area.
- Reuse the existing Focus session and light-app runtime so Focus retains the Todo and Pomodoro windows plus the levitation ball while suppressing normal Home chrome.
- Refine the levitation ball's desktop default placement and edge-snap persistence without replacing its current app launcher behavior.
- Preserve the existing day/night theme system and wallpaper-derived accent colors; no additional theme mode is introduced.
- Exclude prototype-only state inspectors, variant controls, and Blog-detail visual changes from production.

## Capabilities

### New Capabilities

- `home-time-stage`: Desktop Home time-centered composition, contextual islands, Home-only clock and motion preferences, and route containment rules.

### Modified Capabilities

<!-- No main capability specs currently exist; Focus and light-app contracts remain unchanged and are reused by this change. -->

## Impact

- Frontend Home composition and tests in `fronted/vue3-merged/src/pages/HomePage.vue` and related Home components/state modules.
- Desktop App Shell and Menu wiring only where required to expose Home-specific appearance controls.
- Existing levitation-ball positioning and persistence behavior on desktop.
- No backend API, database, mobile-shell, Blog-route, or other content-route behavior changes.
