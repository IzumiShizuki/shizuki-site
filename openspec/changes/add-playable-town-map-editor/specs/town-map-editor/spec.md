## Purpose

Let the user change the same town they can play through a visual tile editor, with reversible edits and portable validated local saves, without depending on a server publishing workflow.

## ADDED Requirements

### Requirement: Direct map editing
The system SHALL expose local editing to all visitors with terrain and object brushes, erase, collision overrides, spawn placement and editable dialogue or destination events. It SHALL support undo and redo and let users test the edited map immediately.

#### Scenario: Edit and play
- **WHEN** a user paints a tile, places an event and switches to play
- **THEN** the visible terrain, movement and interaction reflect the draft and the edit can be undone

### Requirement: Validated persistence and exchange
The system SHALL allow saving a valid draft to the current browser, exporting and importing a versioned JSON map, and explicitly confirming restoration of the starter. Invalid data or unavailable storage SHALL show an actionable error and preserve the current map.

#### Scenario: Reload saved map
- **WHEN** a user saves a valid map and revisits the page
- **THEN** the saved map is restored with its terrain, objects, events and spawn

#### Scenario: Invalid import
- **WHEN** JSON contains unsupported tile ids, excessive dimensions, invalid events or a blocked spawn
- **THEN** the import is rejected before replacing the current map

#### Scenario: Interrupted local edit
- **WHEN** a user leaves town mode or has unsaved changes during navigation
- **THEN** switching AIHub modes retains the draft and leaving the page warns about unsaved changes
