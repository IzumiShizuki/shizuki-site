## Why

The user reports that the actual Folia lyric color cannot be changed, the host's added bottom bar duplicates Folia's controls, and returning to ordinary mode does not visibly reveal the playing song/list. The previous small-playlist and renderer acceptance does not cover this real large-queue/picker flow.

## What Changes

- Make toolbar color selection reach the active full-player and wall lyric consumers, update during selection, survive mode changes and reset to the current theme.
- Remove the host playback bar and queue overlay from the active Folia surface while retaining Folia's native transport and the host-owned audio session.
- Return ordinary mode to the authoritative playlist/current queue and reveal/highlight the exact current entry, including entries beyond the first 300 rendered rows and queue-overlay opening.
- Add failing behavioral regressions at those actual boundaries and repeat the signed-in large-playlist flow before delivery.

## Capabilities

### New Capabilities

- `folia-controls-and-playback-list`: Shared lyric preference, one active transport surface and ordinary authoritative-list/current-entry presentation.

### Modified Capabilities

None. This follows the unarchived workspace-navigation implementation and records the user's corrected presentation requirement separately.

## Impact

MusicLibraryPage, host player/list presentation, ordinary playlist/current-queue reveal logic, and the fork's full-player lyric preference consumer if diagnosis requires it. The audio engine and provider APIs retain ownership/contracts. Deliver both consumers to personal server 111.228.35.186 under the existing push/deploy authorization, with public fork patch/snapshot identity and rollback records.
