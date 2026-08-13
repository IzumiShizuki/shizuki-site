## Why

The earlier Home workspace introduced useful personal-room entry points and current-task context, but its large glass-card composition conflicts with the newer wallpaper-first time stage. We can retain those useful transitions as quiet secondary actions without restoring dashboard density or duplicating Menu navigation.

## What Changes

- Add a compact Home-only utility cluster for the existing author introduction and companion chat flows.
- Preserve the time stage, exactly three contextual islands, and Menu as the route-navigation surface.
- Reuse the existing authentication and ADMIN gating for companion chat.
- Refine the Focus island copy so a selected Todo reads as the current/next task without adding a task board.
- Do not restore the old welcome/room cards, Home route shortcut grid, Apps entry, or independent theme treatment.

## Capabilities

### New Capabilities

- `home-room-entries`: Lightweight Home-only personal-room actions integrated into the wallpaper-first time stage.

### Modified Capabilities

<!-- No main capability spec exists for the still-active Home changes; the new delta composes the two existing change contracts. -->

## Impact

- Desktop Home composition and tests in `fronted/vue3-merged/src/pages/HomePage.vue` and `HomePage.spec.js`.
- Existing author route, authentication redirect, and AI companion event contracts are reused unchanged.
- No backend, mobile shell, Blog/content-route, Focus lifecycle, or light-app runtime changes.
