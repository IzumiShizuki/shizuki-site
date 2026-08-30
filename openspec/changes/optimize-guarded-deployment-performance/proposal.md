## Why

The guarded production deployer currently spends most of an update scanning and hashing roughly 2,800 remote files over SFTP, while backend image changes repeatedly rebuild the full Maven reactor without a persistent dependency cache. The safety gates work, but routine updates take long enough to discourage small, low-risk releases and multiply recovery time when a production-only issue needs another build.

## What Changes

- Add a commit-aware incremental synchronization path that uses the server's verified `.deployed-commit` as the diff base and transfers only approved changed files and deletions.
- Preserve the existing full reconciliation path as a fail-closed fallback whenever the remote marker is absent, invalid, unknown locally, non-ancestor, or otherwise untrusted.
- Verify uploaded incremental files against local content hashes and retain every private-path protection, backup, health gate, and automatic rollback behavior.
- Persist Maven artifacts through a BuildKit cache mount and avoid redundant `clean` work inside the already-clean backend image build stage.
- Stop forcing recreation of every Compose service; let Compose replace only services whose image or configuration changed.
- Add offline contract tests and timing/progress output that distinguish backup, synchronization, build, and health-gate costs.

## Capabilities

### New Capabilities

- `guarded-deployment-performance`: Fast, commit-aware production synchronization and incremental container rebuild behavior that retains the existing backup, secret-protection, verification, and rollback guarantees.

### Modified Capabilities

None.

## Impact

- Affects `deploy/server_deploy.py`, its offline safety tests, the remote Compose runner, and the backend Dockerfile.
- Adds no production API or database schema changes and introduces no new runtime service.
- Relies on Git commit ancestry locally and the existing server-side deployed-commit marker; deployments without a trustworthy marker continue using the current full reconciliation algorithm.
