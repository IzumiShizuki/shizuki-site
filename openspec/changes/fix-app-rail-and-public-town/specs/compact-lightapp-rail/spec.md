## Purpose

Make the light application rail easy to scan and operate at different page heights while preserving its current theme, eight slots, drag and drop behavior, and collection management controls.

## ADDED Requirements

### Requirement: Compact content-aligned rail
The rail SHALL place its heading, eight slots and collection section consecutively from the top without stretching their contents to fill the page height. Occupied rows SHALL reserve separate space for their names and removal buttons.

#### Scenario: Tall desktop workspace
- **WHEN** the application page occupies a tall desktop viewport
- **THEN** its rail heading remains at the top and its slots and folder headings retain compact content-driven heights
- **AND** row labels do not overlap removal controls

#### Scenario: Narrow viewport and long labels
- **WHEN** the rail moves below the catalog in a narrow viewport or contains long names
- **THEN** it fits the available width and truncates long labels while exposing their full names through accessible labels or titles

### Requirement: Preserved collection and slot operations
The rail SHALL preserve opening and removing slots, dropping items into slots or collections, expanding collections, and renaming collections with keyboard-accessible controls.

#### Scenario: Collection expansion
- **WHEN** a visitor expands an empty or populated collection
- **THEN** the collection exposes its expanded state and shows its contents immediately below its heading
- **AND** rename and removal actions remain independently reachable
