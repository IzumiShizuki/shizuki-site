## Purpose

Defines a reproducible continuous-integration contract that validates the repository with its declared toolchains and reports only actionable failures.

## ADDED Requirements

### Requirement: Backend verification uses valid repository inputs
The CI system SHALL compile and test the Java 17 reactor without invoking files that are absent from the checked-out repository.

#### Scenario: Backend verification on a push
- **WHEN** a commit is pushed to a branch
- **THEN** CI compiles the Maven reactor and runs its unit tests
- **AND** no stage invokes the removed SQL convention script

#### Scenario: Backend stage fails
- **WHEN** backend compilation or unit tests fail
- **THEN** the backend job fails with the responsible stage identified
- **AND** available Maven reports and command logs are retained as artifacts

### Requirement: Frontend verification follows the declared toolchain
The CI system SHALL install frontend dependencies with the pnpm version declared by the frontend package and the committed pnpm lockfile under Node.js 24.

#### Scenario: Reproducible dependency installation
- **WHEN** the frontend job installs dependencies
- **THEN** it uses a frozen pnpm lockfile and does not rewrite dependency resolution

#### Scenario: Frontend verification succeeds
- **WHEN** dependency installation completes
- **THEN** CI runs the complete frontend unit suite before producing the production bundle

#### Scenario: Frontend verification fails
- **WHEN** either frontend tests or the production build fails
- **THEN** the frontend job fails and does not report a successful verification

### Requirement: Workflow dependencies use supported runtimes
The CI system SHALL use supported major versions of GitHub-hosted actions so successful runs do not emit obsolete Node.js runtime warnings.

#### Scenario: Workflow action contract is checked
- **WHEN** the repository-level CI contract test runs
- **THEN** it rejects stale action majors, absent script references, and frontend toolchain drift

#### Scenario: Build artifacts are produced
- **WHEN** backend verification or frontend build output is available
- **THEN** CI uploads the configured artifacts using the supported artifact action
