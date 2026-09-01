## Purpose

Make the desktop author workspace use the available viewport intentionally while keeping navigation, life signals, and long-form author content readable and independently stable.

## ADDED Requirements

### Requirement: Author workspace uses an expanded desktop canvas
At desktop workspace widths, the author area SHALL use a route-specific maximum width larger than the default application canvas and SHALL preserve a center column wide enough for the About narrative and build-history cards.

#### Scenario: Visitor opens the author workspace on a wide display
- **WHEN** the viewport is at least the desktop workspace breakpoint
- **THEN** the three-column author shell occupies the wider author-specific canvas without changing unrelated routes

### Requirement: Collapsed navigation releases reserved vertical space
The author workspace SHALL reserve the full navigation offset only while the complete top navigation is visible. A nested center scroll owner MUST NOT keep the full offset after the visitor explicitly collapses the menu.

#### Scenario: Visitor collapses the menu above the author workspace
- **WHEN** the author center column owns scrolling and the visitor collapses the complete top menu
- **THEN** the author workspace moves to the compact-menu offset while remaining clear of the standalone Menu control

#### Scenario: Visitor expands the menu again
- **WHEN** the visitor restores the complete top navigation
- **THEN** the author workspace returns to the full-navigation offset without losing the center-column scroll position

### Requirement: Build history remains discoverable
The About destination SHALL present a clearly visible build-history preview in the center scroll flow, with sufficient bottom clearance for persistent global overlays and a direct action to open the complete history.

#### Scenario: Visitor reads the About destination on desktop
- **WHEN** the About content is longer than the available center viewport
- **THEN** the center column can scroll through the build-history preview without moving either side rail or hiding its final content behind a persistent overlay
