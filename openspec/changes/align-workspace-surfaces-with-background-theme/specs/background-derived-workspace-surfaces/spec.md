## Purpose

Keep the Music Library perimeter and Apps rail editor visually connected to the active wallpaper by deriving their neutral surfaces, borders, text, shadows, and interactive states from the current semantic theme.

## ADDED Requirements

### Requirement: Music workspace perimeter follows the active background theme
The Music Library SHALL render its left navigation rail, center workspace chrome, right information rail, and bottom playback dock with background-derived semantic colors instead of a fixed dark gray or blue-gray palette.

#### Scenario: Music workspace renders in night mode
- **WHEN** the user opens the Music Library while night mode is active
- **THEN** the perimeter surfaces, borders, text, and shadows use the night theme values derived from the active background
- **AND** nested surfaces remain visually distinguishable from their parent surfaces

#### Scenario: Music workspace renders in day mode
- **WHEN** the user opens the Music Library while day mode is active
- **THEN** the same perimeter regions use the corresponding day theme values without a component-specific fixed palette

### Requirement: Apps rail editor follows the active background theme
The Apps rail editor SHALL derive the rail container and its nested slots, collection controls, labels, borders, shadows, and neutral interaction states from semantic theme roles.

#### Scenario: Apps rail renders with the current theme
- **WHEN** the user opens the Apps page or changes the active theme
- **THEN** the rail editor and its nested controls update to the current background-derived theme colors without retaining fixed dark gray surfaces

#### Scenario: Enabled and selected rail content remains identifiable
- **WHEN** a rail item is enabled, selected, hovered, or keyboard-focused
- **THEN** the interface uses semantic accent and focus roles to distinguish the state while preserving readable text and borders

### Requirement: Theme-derived hierarchy remains readable
The affected workspace surfaces SHALL preserve readable foreground contrast and a clear elevation hierarchy in both day and night modes.

#### Scenario: Nested workspace content is displayed
- **WHEN** text, icons, buttons, inputs, or nested cards appear on an affected surface
- **THEN** their foreground, border, and surface roles remain distinguishable without introducing unrelated neutral hues
