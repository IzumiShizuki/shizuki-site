## Why

Opening a large account playlist currently waits for every upstream track page even though the ordinary view initially displays only part of the list. Playback changes also expand and scroll the list automatically, interrupting browsing.

## What Changes

- Load account playlist tracks in bounded pages and show the first page without waiting for the complete playlist or sidebar catalog.
- Keep the existing full-bundle API compatible for playback queue handoff and other callers.
- Add an explicit current-song location button; changing songs keeps the browse position.
- Verify and publish only this change from the remote master baseline, preserving unfinished frontend optimization and backend work.

## Capabilities

### New Capabilities
- `responsive-playlist-browsing`: Progressive account playlist loading and user-controlled current-song location.

### Modified Capabilities

None.

## Impact

Music playlist controller and platform provider, ordinary Vue music workspace, behavioral regression tests and personal-server deployment. No new dependencies or database migrations.
