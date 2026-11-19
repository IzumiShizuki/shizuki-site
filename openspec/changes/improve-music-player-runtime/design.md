## Context

The current song engine creates one playback Audio element and then creates one additional temporary Audio element per catalogue item without an existing duration label. Independent stream probes compete with the first meaningful action. The selected track is also attached on automatic playlist load even though no user requested playback.

## Decisions

Keep the selected track, catalogue duration label, and any already-provided inline lyrics available without allocating or attaching media. Attach on explicit playback by routing the no-active-source case through existing selection, source resolution, and generation guards. Preserve explicit track/queue selection behavior and resume a paused attached source using the existing path. Skip duplicate queue replacements when repeated media readiness events yield already-published duration metadata.

Keep route-specific lyric overlay behaviors by changing only an inactivity predicate; use separate native mobile buttons to avoid nested keyboard events.
