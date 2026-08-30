## Why

The atmosphere panel is difficult to use in dark mode because several surfaces keep dark text or low-contrast controls, while its bundled default sounds compete with the intended online-library workflow. Online sounds also fail during save/download, preventing users from building a reusable multi-sound background mix.

## What Changes

- Make every atmosphere-panel tab, card, input, label, action, slider, and status message readable in both light and dark themes.
- Replace the bundled default ambient catalog with saved online ambient sounds in the main ambient-sound view.
- Allow several saved online ambient sounds to be enabled and played simultaneously with independent volume controls.
- Repair the server-side online sound download/import path and surface actionable per-track failures without disturbing the active mix.
- Preserve provider attribution and reuse already imported assets instead of creating duplicate tracks.

## Capabilities

### New Capabilities
- `ambient-panel-experience`: A theme-safe atmosphere panel whose default ambient library is populated from saved online sources and supports reliable import plus simultaneous playback.

### Modified Capabilities

None.

## Impact

- Frontend atmosphere panel styles, navigation, saved-track presentation, mixer orchestration, and component/state tests.
- Ambient-library API client and authenticated import error handling.
- Backend Freesound download URL handling, object-storage import path, and focused service/provider tests.
- No provider credentials are exposed to the browser or committed to source control.
