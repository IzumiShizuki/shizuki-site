## Context

The current whiteboard uses a viewport-based fixed height inside a resizable light-app window. The window body already provides a bounded content area and scrolling for content that cannot fit.

## Goals / Non-Goals

**Goals:**
- Let the whiteboard use the height left after the toolbar in the Board Canvas component.
- Keep a minimum whiteboard size for compact windows.

**Non-Goals:**
- Change light-app window sizing, fullscreen behavior, or draw.io integration.

## Decisions

- Use the Board Canvas component's column flex layout: give the component a definite full-height box and let the canvas shell flex into the remaining space. This keeps the sizing tied to the resizable window rather than the browser viewport.
- Keep a minimum canvas height; the existing window body's scrolling handles cases where the window cannot fit that minimum.

## Risks / Trade-offs

- Very short windows may scroll because of the minimum canvas height. This preserves the editor's usable area and follows the existing window-body behavior.
