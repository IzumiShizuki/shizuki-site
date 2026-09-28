## Purpose

The Board Canvas workspace provides an editing surface that adapts to the available size of its light-app window, keeping the whiteboard usable without unnecessary empty space below it.

## ADDED Requirements

### Requirement: Whiteboard fills the available window height
The Board Canvas editor SHALL expand its whiteboard area to fill the remaining vertical space in its light-app window.

#### Scenario: Window has spare vertical space
- **WHEN** the Board Canvas window is taller than the toolbar and the minimum whiteboard height
- **THEN** the whiteboard area expands to the bottom of the available content area

#### Scenario: Window is shorter than the minimum whiteboard height
- **WHEN** the available content area is shorter than the minimum whiteboard height
- **THEN** the whiteboard retains its minimum usable height and remains reachable through the window's existing scrolling behavior
