## Why

Choosing the soothing motion mode currently affects the global motion runtime and can leave the entire interface unrendered. The Home-only appearance controls also add an extra top-menu item only on the Home route, so the menu changes shape while navigating.

## What Changes

- Scope the immersive/soothing choice to the Home experience instead of the application-wide motion runtime.
- Keep the top-menu item set and icon count stable across Home and content routes.
- Expose Home appearance settings through the existing Home navigation item rather than a separate settings item.
- Add regression coverage for Home motion switching, route rendering continuity, and cross-route menu consistency.

## Capabilities

### New Capabilities

- `home-appearance-navigation`: Defines Home-scoped appearance preferences and a route-stable top navigation surface.

### Modified Capabilities

None.

## Impact

- Frontend application shell and global motion ownership.
- Home appearance preference state and Home rendering.
- Top-menu interaction, popover anchoring, and component tests.
- No backend API, database, or deployment contract changes.
