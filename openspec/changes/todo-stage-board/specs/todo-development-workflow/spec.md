## ADDED Requirements
### Requirement: Owner-scoped stage board
The system SHALL display four ordered stages, roles, status, elapsed time and available artifacts for the authorized owner.

#### Scenario: Research omitted
- **WHEN** the owner enables a task with research skipped
- **THEN** the board identifies research as skipped and design as current.

#### Scenario: Connection restored
- **WHEN** a detail view regains connectivity
- **THEN** it reloads the authorized server snapshot.

### Requirement: Local note association
The system SHALL associate a validated Obsidian vault and relative file with one device, account and Todo.

#### Scenario: Return from a note
- **WHEN** a signed-in owner follows the copied Markdown link
- **THEN** the site opens that task's authorized development detail.

### Requirement: Local stage reports
The terminal worker SHALL use account-authorized Todo events and keep the model's raw output on the local computer.

#### Scenario: Human approval
- **WHEN** a stage requires approval
- **THEN** the worker waits for the existing website approval before processing another stage.
