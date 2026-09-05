## Why

The Music Library shell and the Apps rail editor still use fixed dark gray surfaces that remain visually detached from the active wallpaper and semantic theme. The surrounding workspace should inherit the same background-derived color atmosphere already used by the top navigation and About experience.

## What Changes

- Replace fixed dark gray shell colors around the Music Library left rail, center workspace, right information rail, and bottom dock with semantic theme/background-derived surfaces.
- Update the Apps light-app rail editor and its nested items to use the same semantic surface, border, text, shadow, focus, and accent roles.
- Preserve hierarchy and readability by keeping elevation differences through theme tokens instead of introducing a single flat color.
- Add regression coverage and visually verify both affected routes in day and night themes.

## Capabilities

### New Capabilities

- `background-derived-workspace-surfaces`: Defines background-responsive shell colors for the Music Library perimeter and Apps rail editor while preserving readable hierarchy and interactive states.

### Modified Capabilities

None.

## Impact

- Frontend-only changes in the Vue Music Library and Apps workspace components, shared theme consumption, and related tests.
- No backend API, persisted data, route, dependency, or deployment contract changes.
