## Purpose

Defines a simple two-state global menu that is either fully usable or visually absent except for one clear control that restores the complete navigation shell.

## ADDED Requirements

### Requirement: The top menu has exactly full and collapsed desktop states
The desktop top menu SHALL render either the complete navigation shell or a collapsed state containing only the standalone `MENU` control. It MUST NOT render an intermediate row of compact route shortcuts while collapsed.

#### Scenario: Visitor collapses the full menu
- **WHEN** the visitor activates the menu disclosure control while the complete navigation shell is visible
- **THEN** the navigation shell leaves view and only the `MENU` control remains available

#### Scenario: Visitor restores the menu
- **WHEN** the visitor activates the `MENU` control in the collapsed state
- **THEN** the complete navigation shell returns with the current route and theme state preserved

### Requirement: Menu disclosure remains accessible and predictable
The standalone menu control SHALL expose an accessible label and expanded state, remain keyboard operable, and preserve the existing reduced-motion behavior. Route scrolling MAY collapse the menu, but manual expansion MUST remain authoritative until the visitor collapses it again.

#### Scenario: Keyboard visitor toggles the menu
- **WHEN** a keyboard visitor focuses and activates the standalone menu control
- **THEN** the menu changes state, exposes the correct expanded semantics, and does not move focus into a removed compact dock

### Requirement: Full-state controls remain available
The full menu SHALL preserve the existing theme toggle, Home appearance settings, atmosphere control, background picker, and account destinations while simplifying only the collapsed state.

#### Scenario: Visitor opens the full menu on Home
- **WHEN** the complete navigation shell is visible on Home
- **THEN** the visitor can still reach the Home appearance settings for clock behavior, wallpaper color, and motion level
