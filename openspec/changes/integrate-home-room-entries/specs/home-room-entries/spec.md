## Purpose

Defines lightweight personal-room transitions on the desktop Home time stage without reintroducing a dashboard card or duplicating global route navigation.

## ADDED Requirements

### Requirement: Home exposes quiet personal-room actions
The desktop Home SHALL expose secondary actions for the existing site introduction and companion chat while keeping the centered time and contextual islands visually primary.

#### Scenario: Open the site introduction
- **WHEN** the user activates the Home introduction action
- **THEN** the existing author route opens
- **AND** no unrelated environment state changes

#### Scenario: Open companion chat as an eligible user
- **WHEN** an authenticated ADMIN activates the Home companion action
- **THEN** the existing AI chat shell opens in companion mode
- **AND** the Home route remains active behind the shell

#### Scenario: Guest activates companion chat
- **WHEN** an unauthenticated user activates the Home companion action
- **THEN** the existing authentication flow opens with Home as the return destination

#### Scenario: Ineligible authenticated user views companion chat
- **WHEN** an authenticated non-ADMIN opens Home
- **THEN** the companion action communicates that access is unavailable
- **AND** activating it does not open another chat mode

### Requirement: Personal-room actions preserve the time-stage hierarchy
The Home personal-room actions SHALL remain outside the three contextual islands and SHALL NOT add another large card or duplicate Menu route shortcuts.

#### Scenario: Open desktop Home
- **WHEN** the user opens Home outside Focus
- **THEN** the centered time remains the dominant element
- **AND** Home still renders no more than three contextual islands
- **AND** Blog, Music, Apps, and AI route navigation remains available through Menu

#### Scenario: Focus becomes active
- **WHEN** the user starts Focus from Home
- **THEN** the personal-room actions are suppressed with the normal Home chrome

### Requirement: Focus island reflects selected Todo context
The Home Focus island SHALL show the selected Todo title when current-task context is available without rendering a task list or board.

#### Scenario: Selected task is available
- **WHEN** Home has a selected Todo item for Focus
- **THEN** the Focus island shows that item title and a concise next-task label
- **AND** Home retains exactly the existing contextual island set
