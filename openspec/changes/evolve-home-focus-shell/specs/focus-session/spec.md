## Purpose

Provides a site-level Focus experience that turns the existing environmental and productivity primitives into a stable work session without introducing a separate Focus route.

## ADDED Requirements

### Requirement: Focus has an explicit lifecycle

The system SHALL support entering Focus from the Home workspace, maintaining an active Focus session, and exiting Focus back to the normal site shell.

#### Scenario: Enter Focus from Home

- **WHEN** the user activates the Home workspace's Focus action
- **THEN** the system enters an active Focus session without navigating to a `/focus` route
- **AND** the current route and existing site context remain available for restoration

#### Scenario: Exit Focus

- **WHEN** the user activates the Focus exit action
- **THEN** the active Focus session ends
- **AND** normal site navigation and shell controls become available again

### Requirement: Focus preserves the active environment

The system SHALL preserve the current wallpaper, ambient audio or video, clock, music playback state, lyrics, and visualizer state while Focus is active.

#### Scenario: Environment is preserved during Focus

- **WHEN** Focus becomes active while an environment or music session is already running
- **THEN** the environment and playback continue without being reset, replaced, or paused by Focus

#### Scenario: Focus starts without active music

- **WHEN** Focus becomes active while no music is playing
- **THEN** Focus remains usable and does not start unrelated playback automatically

### Requirement: Focus suppresses unrelated navigation and windows

The system SHALL hide normal route navigation and unrelated floating light-app windows while Focus is active, while keeping the Focus controls and selected Focus apps available.

#### Scenario: Navigation is suppressed

- **WHEN** Focus is active
- **THEN** the normal desktop menu and route-switching controls are hidden or disabled
- **AND** the user can still access the explicit Focus exit action

#### Scenario: Selected Focus apps remain available

- **WHEN** Focus is active with a configured app preset
- **THEN** the apps selected by that preset remain visible or can be opened
- **AND** unrelated non-pinned apps are not shown merely because they were previously open on another page

### Requirement: Focus presets select light apps only

The system SHALL allow a Focus preset to define which light apps open by default, without storing or changing wallpaper, ambient media, visualizer, or theme settings as part of the preset.

#### Scenario: Start a preset

- **WHEN** the user starts Focus with a preset
- **THEN** the configured light apps are opened or focused according to that preset
- **AND** the current environment remains unchanged

#### Scenario: Start without a preset

- **WHEN** the user starts Focus without selecting a preset
- **THEN** Focus starts with no additional light apps opened automatically

### Requirement: Focus uses Todo as the current-task source

The system SHALL be able to display a selected Todo item as the current Focus task and SHALL only mark that Todo item complete after an explicit user action.

#### Scenario: Start Focus with a Todo item

- **WHEN** the user starts Focus with a selected Todo item
- **THEN** the current task is displayed in the Focus surface
- **AND** the Todo item remains open until the user explicitly completes it

#### Scenario: Complete the current task

- **WHEN** the user explicitly confirms completion of the current Focus task
- **THEN** the system writes the completed state back to the existing Todo system

#### Scenario: Leave Focus without completing the task

- **WHEN** the user exits Focus without confirming completion
- **THEN** the Todo item remains incomplete
