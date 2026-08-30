## Purpose

Defines a quiet Focus-mode entry that changes the workspace state without launching tools on the user's behalf, while keeping manual light-app access available.

## ADDED Requirements

### Requirement: Focus entry does not launch light apps
When a user starts a Focus session, the system SHALL enter the Focus workspace without automatically opening any light-app window.

#### Scenario: Start Focus from the Home island
- **WHEN** the user activates the Home Focus island while Focus is inactive
- **THEN** the Focus session becomes active
- **AND** no Todo, Pomodoro, or other light-app window is opened as a side effect

### Requirement: Manual light-app access remains available
While Focus is active, the system SHALL retain the floating light-app launcher and SHALL allow the user to open Focus-permitted light apps manually.

#### Scenario: Manually open a permitted tool during Focus
- **WHEN** the user opens Todo or Pomodoro from the floating light-app launcher during an active Focus session
- **THEN** the selected light-app window is shown in the Focus workspace
- **AND** no additional light-app window is opened automatically

### Requirement: Existing Focus window filtering is preserved
The system SHALL continue to suppress light-app windows that are not permitted by the active Focus preset.

#### Scenario: Enter Focus with mixed existing windows
- **WHEN** Focus starts while both permitted and non-permitted light-app windows already exist
- **THEN** permitted Focus windows remain eligible for display
- **AND** non-permitted windows are hidden from the Focus workspace
