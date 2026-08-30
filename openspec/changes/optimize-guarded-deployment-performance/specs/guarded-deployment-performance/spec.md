## Purpose

Reduce routine personal-site deployment time while preserving the existing secret isolation, restore-point, verification, health-gate, and automatic rollback guarantees.

## ADDED Requirements

### Requirement: Commit-aware incremental synchronization
The deployer SHALL transfer only approved paths changed between the server's recorded deployed commit and the clean target commit when the recorded commit is a valid local ancestor of the target.

#### Scenario: Trusted deployed commit has a small delta
- **WHEN** the server records a valid deployed commit that is a local ancestor of the clean target commit
- **THEN** the deployer uploads changed approved files, applies approved deletions, and does not recursively index the full remote application tree

#### Scenario: Target commit has no payload changes
- **WHEN** the trusted commit delta contains no approved deployment payload changes
- **THEN** synchronization completes without recursively indexing or rewriting unchanged application files

### Requirement: Incremental synchronization fails closed
The deployer MUST use full reconciliation instead of the incremental path when the server marker cannot safely prove the synchronization base, and MUST stop before rebuilding when an incremental transfer cannot be verified.

#### Scenario: Marker is missing or untrusted
- **WHEN** the deployed-commit marker is missing, malformed, unknown to the local repository, not an ancestor of the target, or cannot be read
- **THEN** the deployer uses the existing protected full-reconciliation path

#### Scenario: Uploaded content does not match
- **WHEN** a remotely uploaded incremental file does not match the local content hash
- **THEN** deployment stops before the Compose rebuild and the existing restore-point recovery behavior remains available

### Requirement: Protected remote material remains untouched
Both incremental and full synchronization MUST preserve private configuration, generated runtime data, backup material, and every existing protected remote prefix.

#### Scenario: Commit delta names a protected path
- **WHEN** a changed or deleted Git path resolves to a protected or excluded deployment prefix
- **THEN** the deployer neither uploads nor deletes that remote path

#### Scenario: Rename crosses an exclusion boundary
- **WHEN** a Git rename moves a path into or out of an excluded or protected prefix
- **THEN** the deployer independently filters the old deletion and new upload so neither operation can mutate protected material

### Requirement: Repeated backend builds reuse dependencies
The backend container build SHALL persist downloaded Maven artifacts across source-layer invalidation and SHALL avoid redundant workspace cleaning in a fresh build stage.

#### Scenario: Java source changes after a successful build
- **WHEN** a later backend image build changes application source without changing dependency coordinates
- **THEN** Maven reuses its BuildKit-backed repository cache rather than downloading the full dependency set again

### Requirement: Unchanged services are not forcibly recreated
The remote Compose update SHALL recreate services only when Compose detects a changed image or configuration while retaining dependency ordering and health checks.

#### Scenario: Documentation-only deployment
- **WHEN** an update changes no service image or Compose configuration
- **THEN** the runner does not forcibly recreate otherwise unchanged healthy containers

### Requirement: Deployment phase timing is observable
The deployer SHALL report elapsed time for backup, synchronization, remote rebuild, and post-deployment verification without printing credentials or private commands.

#### Scenario: Successful deployment
- **WHEN** all deployment phases complete successfully
- **THEN** operators can identify the elapsed duration of each major phase from sanitized deployment output
