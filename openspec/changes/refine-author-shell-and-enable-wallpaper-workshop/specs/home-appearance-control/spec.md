## Purpose

Give the Home-only appearance settings an unmistakable identity and make their scope and current effect understandable without presenting them as a global system control.

## ADDED Requirements

### Requirement: Home appearance settings have a clear visible identity
The full top menu on Home SHALL expose the appearance action as a legible control labelled for Home rather than as an unexplained status badge attached to the theme control.

#### Scenario: Visitor views the complete menu on Home
- **WHEN** the Home route is active
- **THEN** the menu shows a distinct Home appearance action with an accessible description of the settings it opens

#### Scenario: Visitor views a content route
- **WHEN** a route other than Home is active
- **THEN** the Home appearance action is absent and the global day/night theme control remains available

### Requirement: Appearance changes communicate observable state
The Home appearance panel SHALL identify its Home-only scope and SHALL expose the selected clock, wallpaper-color, and motion values through visible active states and accessible pressed state.

#### Scenario: Visitor changes a Home appearance option
- **WHEN** the visitor selects an appearance value
- **THEN** the selected value is visibly active, exposes its selected semantics, and updates the corresponding Home presentation setting
