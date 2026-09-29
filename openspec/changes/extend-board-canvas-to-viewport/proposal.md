## Why

Board Canvas currently fills its floating window, but its default window height leaves a visible band of unused viewport below the editor. The canvas is a workspace, so opening it should use nearly the full available screen height while remaining resizable.

## What Changes

- Increase the initial Board Canvas window height so its bottom sits near the viewport edge.
- Keep viewport clamping and interactive resize behavior intact.
- Preserve the existing responsive minimum canvas height for small screens.

## Capabilities

### New Capabilities

None.

### Modified Capabilities

- `board-canvas-layout`: require Board Canvas to open with its editing surface reaching near the viewport bottom.

## Impact

- `fronted/vue3-merged/src/utils/lightAppWindowRuntime.js` initial window preset.
- `fronted/vue3-merged/src/utils/lightAppWindowRuntime.spec.js` geometry regression coverage.
- No API, persistence, or dependency changes.
