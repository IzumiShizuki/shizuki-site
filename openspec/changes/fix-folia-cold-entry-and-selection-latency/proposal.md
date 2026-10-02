## Why

The user reports that ordinary song selection followed by Folia entry produces a blank player, exit can show an empty playlist, and obtaining a song takes about eight seconds. Live rapid entry reproduced a host queue with 1000 songs while Folia says its queue is empty; playback URL resolved in about 0.7s while an optional AMLL request took about 6.5s. The previous warmed presentation acceptance did not cover this boundary.

## What Changes

- Establish failing cold/rapid-entry, exit-during-preparation and timed selection regressions at the real session/preparation boundaries.
- Make Folia entry preserve and display the authoritative selected song/queue while optional content and external playback requests are pending; ensure exit retains the source playlist.
- Remove measured avoidable blocking and redundant requests from the foreground selection path, keep speculative work bounded, and prevent stale results from replacing a newer selection.
- Audit the host page/coordinator/player/API, fork bootstrap/bridge/store/navigation and backend playback/lyric/cache/stream paths; record concrete findings and tested boundaries.
- Verify cold and warm actual UI runs, request timing, appropriate tests/builds, and exact authorized personal-server delivery with rollback retained.

## Capabilities

### New Capabilities
- `folia-cold-playback-handoff`: coherent pending/ready playback sessions across cold entry and rapid exit, with authoritative queue preservation.
- `responsive-music-selection`: selected metadata/queue are immediate, optional lyric work is nonblocking, and preparation is deduplicated and bounded.

### Modified Capabilities
None. Earlier changes remain unarchived; this change records the newly uncovered lifecycle/performance requirements.

## Impact

Host MusicLibraryPage, workspace coordinator, shared audio player and playback preparation API; Folia embedded bootstrap/bridge and native queue consumers if the failing boundary requires it; backend music/lyrics/caches inspected for actual latency. Existing installed dependencies and personal server 111.228.35.186 only. No unrelated wallpaper changes, provider replacement or new middleware.
