## ADDED Requirements

### Requirement: Opt-in development workflow
The site SHALL store development workflow separately and retain legacy Todo behavior.

#### Scenario: Enable development workflow
- **WHEN** the logged-in owner enables a Todo with a valid repository
- **THEN** it starts in the selected initial stage without changing its reminder or completion status

### Requirement: Resume development with scoped MCP
The service SHALL provide scoped context and idempotent versioned updates for opted-in Todos.

#### Scenario: Resume after reopening an Agent session
- **WHEN** a configured Agent reads a matching Todo after another session reported progress
- **THEN** it receives its repository, stage, Skill hints, summary and next step

#### Scenario: Reject unrelated project
- **WHEN** the Agent credential is used against a task in another project
- **THEN** the service does not disclose or modify the task

#### Scenario: Submit a stage requiring approval
- **WHEN** the Agent submits required evidence for a human-reviewed stage
- **THEN** the stage remains pending until the authenticated owner approves it

#### Scenario: Concurrent updates
- **WHEN** a stale update arrives or an already accepted request ID is retried
- **THEN** stale changes are rejected and matching retries are not appended again
