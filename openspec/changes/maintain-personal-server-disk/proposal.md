## Why

The personal website server at `111.228.35.186` has a 99 GiB root filesystem at 97% utilization. Deployment snapshots, Docker build artifacts, and system journals accumulate without a coordinated retention policy.

## What Changes

- Audit usage and reclaim unused build cache, old dangling images, and archived system journals without restarting application containers.
- Install a daily maintenance timer and bounded journal retention.
- Preview snapshot retention and make snapshot deletion explicitly opt-in: keep every snapshot from the last seven days and at least the three newest complete snapshots. This replaces the initial 14-day window following the user's request to shorten retention.
- Record before/after disk capacity and service health, preserving databases, uploads, named volumes, and stopped containers.
- Following the user's request for deeper cleanup, reclaim unused generated website images older than seven days while preserving container references, the newest three versions per repository, and all image IDs referenced by retained backup records. Remove explicitly inventoried obsolete downloadable images once, and tighten the build-cache budget.

## Capabilities

### New Capabilities

- `personal-server-disk-maintenance`: Safe, repeatable cache/log maintenance and opt-in retention of deployment snapshots on the personal server.

### Modified Capabilities

None.

## Impact

Operational scripts and systemd configuration under `deploy/`, the personal server's Docker cache and system journal, and optionally `/opt/shizuki-site-backups/snapshot-*`. No application API or database schema changes. The server at `111.228.52.91` is outside scope.
