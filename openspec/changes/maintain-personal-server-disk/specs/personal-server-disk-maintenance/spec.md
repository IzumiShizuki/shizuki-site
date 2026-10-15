## Purpose

Keep the personal website server usable by reclaiming reproducible disk artifacts and applying explicit, conservative retention to operational logs and deployment snapshots.

## ADDED Requirements

### Requirement: Preserve application state during disk cleanup
Maintenance SHALL preserve application containers, named volumes, databases, uploads, and tagged rollback images. Cleanup SHALL report before/after filesystem capacity and service health.

#### Scenario: Routine cache and log cleanup
- **WHEN** maintenance executes on the personal server
- **THEN** only aged unused build cache, aged dangling images, and archived system journals are reclaimed, with application containers left running

### Requirement: Bound recurring cache and journal growth
The server SHALL run non-overlapping daily maintenance and retain recent build cache. Persistent system journals SHALL have a 512 MiB budget and a maximum retention of 14 days.

#### Scenario: Scheduled maintenance
- **WHEN** the daily maintenance timer runs
- **THEN** it applies the configured cache and journal retention and records the result in the service journal

### Requirement: Make deployment snapshot retention explicit and conservative
Snapshot deletion SHALL default to disabled and preview SHALL make no changes. When explicitly enabled, retention SHALL keep all snapshots from the last 14 days and at least the three newest complete snapshots. Deletion SHALL be limited to recognized complete snapshots directly beneath the canonical backup root, reject symlinks, preserve incomplete/custom backups, and verify protected backups before deleting candidates.

#### Scenario: Retention preview
- **WHEN** an operator previews retention
- **THEN** the tool reports candidate paths and byte counts without deleting files

#### Scenario: Approved retention
- **WHEN** deletion is explicitly enabled and protected backups pass verification
- **THEN** only complete recognized snapshots older than 14 days outside the three newest protected snapshots are deleted and an inventory is recorded first

#### Scenario: Unsafe backup or failed verification
- **WHEN** the root or snapshot contains a symlink, fewer than three complete snapshots exist, or a protected archive fails validation
- **THEN** no snapshots are deleted
