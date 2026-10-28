## Purpose

Ensure repository verification installs reviewed dependencies reproducibly and exposes actionable failure evidence while preserving complete test coverage.

## ADDED Requirements

### Requirement: Reviewed dependency installation is deterministic
CI SHALL install the committed frontend dependency graph using the declared package manager and a frozen lockfile, with explicit build-script decisions for known dependencies and strict rejection of unreviewed scripts.

#### Scenario: Known native watcher installation
- **WHEN** CI installs the currently locked frontend dependencies
- **THEN** the reviewed native watcher script does not cause an ignored-build failure
- **AND** dependency versions and lockfile resolution remain unchanged

#### Scenario: New unreviewed build script
- **WHEN** a dependency introduces an install script without a recorded policy
- **THEN** installation fails rather than implicitly allowing all scripts or suppressing policy errors

### Requirement: Entity contract verification reflects the current schema
Backend verification SHALL check the exact persisted moment column mapping, including the author reference introduced by the database migrations.

#### Scenario: Current author column is mapped
- **WHEN** the current moment entity is verified
- **THEN** its author property maps to the migrated author column and the exact mapping assertion succeeds

#### Scenario: Mapping drifts
- **WHEN** a persisted moment column is missing, renamed, or added unexpectedly
- **THEN** entity contract verification fails

### Requirement: Verification failures retain actionable evidence
CI SHALL report backend and frontend stage outcomes and retain available command logs and test reports even when verification fails. Failed required commands MUST keep their job failed.

#### Scenario: Frontend installation fails
- **WHEN** frontend dependency installation fails
- **THEN** frontend tests and build are skipped
- **AND** the job fails, its summary identifies installation as failed, and its installation log is available as an artifact

#### Scenario: Frontend tests fail
- **WHEN** frontend unit tests fail
- **THEN** the production build is skipped and the job remains failed
- **AND** available test output and reports are retained with the failed test stage identified

#### Scenario: Frontend build fails
- **WHEN** the production build fails after passing tests
- **THEN** the job remains failed and retains its build log and stage summary

#### Scenario: Verification succeeds
- **WHEN** installation, all frontend tests, production build, and backend verification succeed
- **THEN** both jobs succeed with stage summaries and the frontend distribution remains available

### Requirement: Preview verification respects current access and caching contracts
Backend preview tests SHALL exercise authorized external wallpaper access and enforce the existing private no-store response contract.

#### Scenario: Authorized preview metadata caching
- **WHEN** a caller with the wallpaper discovery grant fetches an external preview
- **THEN** tests verify upstream metadata caching and trusted-host validation using an isolated authorized identity
- **AND** the identity is cleared after the test

#### Scenario: Private preview HTTP response
- **WHEN** the preview controller serves image bytes
- **THEN** verification requires a private no-store response rather than public caching

### Requirement: Bridge controller wiring is verifiable
The application SHALL construct the existing bridge controller unambiguously with its notification and contact-binding collaborators available.

#### Scenario: Bridge controller created by Spring
- **WHEN** Spring instantiates the bridge controller with all required collaborators
- **THEN** context startup succeeds and contact confirmation uses the injected authentication settings and binding service
