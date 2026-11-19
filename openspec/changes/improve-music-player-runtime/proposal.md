## Why

Loading a playlist must not start metadata requests for every playable URL before the listener presses Play. The always-mounted player and lyric overlay also surface confusing idle states, and the mobile compact-player keyboard shortcuts overlap.

## What Changes

- Use playlist duration metadata without probing each source, and defer the automatically selected song's media/remote lyric work until explicit playback.
- Keep the global lyric bar off while idle; keep the existing route and focus-mode rules.
- Give expand, play/pause, and next distinct native controls in the mobile compact player.

## Impact

- Affects desktop/mobile player runtime and tests; no backend, schema, provider, voice catalogue, or deployment changes.
