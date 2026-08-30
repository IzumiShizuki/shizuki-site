## Why

Entering Focus currently opens the Todo and Pomodoro light apps automatically, which interrupts users who want a clean focus surface and prefer to choose tools themselves. Focus entry should change the workspace state only and leave light-app launch decisions to the user.

## What Changes

- Stop automatically opening Focus preset light apps when a Focus session starts.
- Keep the existing floating light-app ball available so users can manually open Todo, Pomodoro, or other permitted Focus tools.
- Preserve Focus-mode filtering for already-open and manually opened light-app windows.

## Capabilities

### New Capabilities

- `focus-session-entry`: Defines the side effects of entering Focus mode and the manual light-app launch behavior available during the session.

### Modified Capabilities

None.

## Impact

- Affects the Focus activation watcher in `fronted/vue3-merged/src/App.vue`.
- Requires regression coverage for Focus entry and manual light-app availability.
- No API, backend, storage, or dependency changes.
