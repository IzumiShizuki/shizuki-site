## Context

See proposal.md for the visible gap. The Board Canvas editor already consumes the height of its light-app window; the gap comes from the `board-canvas` initial window preset, which currently uses 82% of viewport height and caps at 92%.

## Goals / Non-Goals

**Goals:**
- Make a newly opened Board Canvas window extend close to the viewport's lower edge.
- Keep the existing floating-window actions and user-controlled resize behavior.

**Non-Goals:**
- Change other light-app window presets or alter the draw.io canvas sizing.
- Force an already open window to resize when it is focused again.

## Decisions

- Increase the Board Canvas preset's preferred and maximum height ratios to 98%. Set its initial-frame floor to the shared 220px minimum so a very short viewport can still be clamped inside the screen; the editor's own minimum canvas height and scrolling behavior remain unchanged.
- Leave width, drag, resize, and fullscreen behavior unchanged. This keeps the change focused on the blank area shown below the Board Canvas.
- Add a geometry regression assertion against a tall viewport to ensure the initial bottom gap stays within the edge padding; exercise a compact viewport to preserve clamping behavior.

## Risks / Trade-offs

- A nearly full-height default leaves less of the page visible around Board Canvas. The existing minimize, resize, and fullscreen controls let users choose a smaller or larger workspace.
- Existing windows retain their current bounds when focused; the new size applies when a Board Canvas window is first created.
