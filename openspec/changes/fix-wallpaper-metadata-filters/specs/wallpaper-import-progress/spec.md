## Purpose

Make asynchronous wallpaper imports understandable by showing live task-stage feedback from submission until the wallpaper becomes available or the import stops.

## ADDED Requirements

### Requirement: Discovery imports expose live progress
The application SHALL show an accessible progress indicator for a wallpaper import started from discovery. The indicator MUST distinguish submission, queued, running, succeeded, failed, and fallback-required states, and SHALL refresh non-terminal jobs automatically without requiring the user to press a status button.

#### Scenario: Import is queued and runs
- **WHEN** a Workshop or Wallhaven discovery import returns a non-terminal job
- **THEN** the selected-item inspector shows the current task stage and a visible progress track
- **THEN** the application checks the job again until it reaches a terminal state

#### Scenario: Import completes
- **WHEN** the import job reports success
- **THEN** the progress indicator reaches completion
- **THEN** the wallpaper library refreshes and automatic polling stops

#### Scenario: Import cannot complete
- **WHEN** the import job reports failure or requires a local-package fallback
- **THEN** the progress indicator communicates the terminal state and automatic polling stops

#### Scenario: Motion is reduced
- **WHEN** the operating system reports a reduced-motion preference
- **THEN** indeterminate progress remains understandable without relying on animation
