## Context

See proposal.md for motivation. App owns the persisted lyricOffset and uses fixed positioning with a translate offset. AppsPage adds body.apps-rail-mode and overrides the subtitle bottom distance on desktop from 96px to 20px. Browser reproduction at 1440×900 confirms a 76px vertical jump. App also has an independent 44-bar DOM visualizer with linear frequency sampling. MusicVisualizerLayer already provides logarithmic processing, fast attack/slow release, peak hold/gravity and Canvas painters through audioAnalyserBus.

## Goals / Non-Goals

**Goals:** Keep one subtitle positioning owner; reuse shared visualization processing without adding an audio graph or a parallel animation loop; preserve stored visual preferences and drag offsets.

**Non-Goals:** Change music APIs, replace subtitle content, redesign Home, or alter Folia rendering.

## Decisions

1. Remove AppsPage's global subtitle bottom override. App's existing responsive positioning remains authoritative. A route-specific compensating offset would hide the symptom while retaining cross-page coupling.
2. Mount MusicVisualizerLayer as an App child with bars/ring wrappers and the existing selected style. Remove App's obsolete DOM level arrays, frequency sampler and visualizer RAF; retain its AudioContext/EQ/analyser provider, which the child can inject directly.
3. Expand Home bars to a roughly 140px desktop stage and center the wrapper explicitly. The shared painter supplies brighter columns, baseline glow and held falling peak caps; existing styles stay selectable. Detail's current bars-crystal variant must resolve to its named painter when no explicit styleKey is supplied, rather than accidentally using the default neon painter.
4. Pass runtime/page guards from App and leave pause decay to MusicVisualizerLayer. Test rendering and cleanup using mocked analyser/Canvas/RAF seams, and measure subtitle coordinates using the real browser.

## Risks / Trade-offs

- [Larger spectrum could overlap subtitles] → Keep it below the subtitle layer and pointer-transparent; visually check desktop and narrow layouts.
- [Removing App's loop could stop analyser initialization] → Keep the audio graph initialization path and verify bus.ensure() from the shared descendant.
- [Animation regressions] → Exercise peak hold/fall, pause decay, style changes, page visibility and unmount cleanup at existing shared seams.

## Migration Plan

No persisted data migration or new dependency. Existing visualizer preferences and lyric offsets remain valid. Rollback consists of reverting this frontend change.
