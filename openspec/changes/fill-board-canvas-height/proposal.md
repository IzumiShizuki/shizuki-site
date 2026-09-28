## Why

The Board Canvas window sizes its draw.io canvas from the viewport instead of the space available inside the light-app window, leaving unused space below the whiteboard. The canvas should expand with its window so the working area reaches the bottom while remaining usable in smaller windows.

## What Changes

- Make the Board Canvas whiteboard fill the remaining height of its light-app window.
- Preserve a minimum canvas height and responsive behavior when the window is small.

## Capabilities

### New Capabilities
- `board-canvas-layout`: Defines how the Board Canvas editor fills its light-app workspace.

### Modified Capabilities

## Impact

- `fronted/vue3-merged/src/components/lightapps/board/BoardCanvasWindow.vue` styles.
- No API, persistence, or dependency changes.
