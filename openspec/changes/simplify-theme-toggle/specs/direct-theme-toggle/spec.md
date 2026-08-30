## Purpose

Provide a predictable binary day/night control that changes theme immediately while keeping detailed Home appearance preferences available through an explicitly separate action.

## ADDED Requirements

### Requirement: Theme control switches immediately
The primary theme control SHALL switch from day to night or from night to day in a single activation and MUST NOT open a selection popover.

#### Scenario: Switch from day to night
- **WHEN** the current theme is day and the user activates the primary theme control
- **THEN** the system requests night mode immediately and no appearance popover is opened

#### Scenario: Switch from night to day
- **WHEN** the current theme is night and the user activates the primary theme control
- **THEN** the system requests day mode immediately and no appearance popover is opened

### Requirement: Theme action communicates its destination
The primary theme control SHALL expose an accessible label that names the theme mode the next activation will select.

#### Scenario: Screen reader describes the next mode
- **WHEN** the current theme is night
- **THEN** the primary theme control is labeled as switching to day mode

### Requirement: Home appearance controls remain separate
On the Home route, the system SHALL provide a distinct detailed-appearance action for clock, wallpaper color, and motion preferences; that action SHALL be absent from content routes.

#### Scenario: Open detailed Home appearance controls
- **WHEN** the user is on Home and activates the detailed-appearance action
- **THEN** the Home appearance popover opens without presenting a redundant day/night selector

#### Scenario: Content route keeps only direct theme switching
- **WHEN** the user is on a content route
- **THEN** no detailed Home appearance action or Home appearance popover is available from the top menu
