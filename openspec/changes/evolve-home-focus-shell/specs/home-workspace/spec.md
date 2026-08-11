## Purpose

Shapes Home into the personal workspace entry point: a calm first screen that shows the current state and offers a small set of high-value transitions into Focus, Music, Blog, and AI.

## ADDED Requirements

### Requirement: Home presents the four core workspace entries

The desktop Home workspace SHALL present Focus, Music, Blog, and AI as its primary destinations, in that order of product priority, while keeping broader administration and app management in the global menu.

#### Scenario: Core entries are visible

- **WHEN** the user opens the desktop Home workspace
- **THEN** the Home surface exposes a clear entry for Focus
- **AND** it exposes entries for Music, Blog, and AI
- **AND** Apps is not presented as a competing primary Home destination

#### Scenario: Open a core entry

- **WHEN** the user activates Music, Blog, or AI from Home
- **THEN** the system opens the corresponding existing workspace without changing unrelated environment state

### Requirement: Home shows a concise current state

The Home workspace SHALL show the current time and SHALL provide a lightweight indication of the current Todo or Focus state when that information is available, without becoming a dense dashboard.

#### Scenario: Current task is available

- **WHEN** an actionable Todo item or active Focus session is available
- **THEN** Home shows a concise current-task or Focus-status summary
- **AND** the user can use that summary to enter or return to Focus

#### Scenario: No current task is available

- **WHEN** no actionable Todo item or active Focus session is available
- **THEN** Home keeps the calm first-screen layout
- **AND** it offers a clear way to begin Focus without requiring a task

### Requirement: Home retains the environmental home feeling

The Home workspace SHALL preserve the existing ambient visual treatment, greeting, time display, and personal-room tone while changing the information hierarchy.

#### Scenario: Home is opened

- **WHEN** the user returns to Home
- **THEN** the existing wallpaper and ambient presentation remain available
- **AND** the Home content emphasizes arrival, current state, and the next useful action rather than a function grid
