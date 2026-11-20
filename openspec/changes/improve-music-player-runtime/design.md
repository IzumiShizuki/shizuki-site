## Context

The current song engine creates one playback Audio element and then creates one additional temporary Audio element per catalogue item without an existing duration label. Independent stream probes compete with the first meaningful action. The selected track is also attached on automatic playlist load even though no user requested playback.

## Decisions

Keep the selected track, catalogue duration label, and any already-provided inline lyrics available without allocating or attaching media. Attach on explicit playback by routing the no-active-source case through existing selection, source resolution, and generation guards. Preserve explicit track/queue selection behavior and resume a paused attached source using the existing path. Skip duplicate queue replacements when repeated media readiness events yield already-published duration metadata.

Keep route-specific lyric overlay behaviors by changing only an inactivity predicate; use separate native mobile buttons to avoid nested keyboard events.

## Next audio handoff

Use one detached native metadata preload for the next resolved same-origin music gateway source only. Promote the exact element only if playback data is ready and the preparation is still valid for this queue entry and login context. Keep the original direct playback fallback, signed URLs and private no-store HTTP policy. Do not treat the browser preload hint as a strict byte limit; disable speculative audio on metered/slow connections and discard unfinished work after a short window. Both audio slots feed the same EQ path when graph-compatible.
