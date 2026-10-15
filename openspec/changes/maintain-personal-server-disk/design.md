## Context

The Ubuntu 24.04 server uses Docker 29 with buildx and systemd. Container logs already rotate at 100 MiB × 3. The initial inventory found 25 GiB in deployment backups, 9.1 GB of build cache, and 2.6 GiB of system journals. Database and application containers must stay running.

## Goals / Non-Goals

**Goals:** Reclaim regenerable artifacts now, bound recurring cache/log growth, and provide a conservative opt-in snapshot retention rule with an audit trail.

**Non-Goals:** Container or volume pruning, removing protected rollback images, database maintenance, Kafka repair, and changing unrelated working-tree files.

## Decisions

- Use a daily systemd timer at 04:30 Asia/Shanghai with a non-overlapping flock. Prune dangling images older than seven days and build cache unused for six hours, with 1 GB reserved and a 2 GB target. Age constraints and shared layers mean the target is not a hard disk quota.
- For the requested deeper cleanup, allow opt-in pruning only of generated `shizuki-site/backend` and `shizuki-site/site` images older than seven days. Protect every container's image, the newest three image versions per repository, and SHA image references extracted from retained backup JSON records. Images with aliases outside the allowlist remain protected. Recheck references before removal, write an inventory, and never force image deletion. Remove the specifically inventoried obsolete downloaded AstrBot/base images once, recording their pull digests; do not broaden the nightly policy to arbitrary repositories.
- Set journald to 512 MiB persistent storage, 128 MiB runtime storage, a 2 GiB free-space reserve, and 14-day maximum retention. Restart only journald to apply the policy.
- Implement snapshot retention in a small Python standard-library helper. Preview is the default; deletion requires an explicit apply flag and the daily job defaults to snapshot deletion disabled. Recognize only the deployment helper's exact snapshot naming format, require READY/app/database/volume inventory, reject symlinks, and keep the newest three complete snapshots plus every snapshot within seven days. The user authorized shortening the initial 14-day window after seeing the repeated program/data archive sizes. Incomplete and custom backup directories remain untouched.
- Before removing any snapshot, verify the newest three protected snapshots' gzip archives and PostgreSQL dump inventories. Confine recursive deletion to direct child directories of the canonical backup root; write an inventory outside that root before deletion.
- Keep application health checks and the pre-existing Kafka restart failure in the operational report. Avoid broad filesystem scans after the initial scan exceeds its timeout; use targeted directory inventories.

## Risks / Trade-offs

- [Backup removal is irreversible] → Require the user's retention choice and explicit opt-in; preserve recent backups and validate protected archives first.
- [Rebuilds may take longer after cache removal] → Preserve six-hour recent cache and a 1 GB cache reserve.
- [Backup frequency may exceed the seven-day window's capacity] → Document the remaining usage; the time window is a retention promise, not a hard quota.
- [Shared Docker layers limit immediate recovery] → Report measured filesystem changes, not the sum of Docker's reclaimable estimates.

## Migration Plan

Upload only maintenance files to the personal server. Validate shell, Python, and systemd syntax; preview snapshot candidates; install the timer and journal drop-in; run maintenance once; compare container identities and HTTP health. Enable snapshot retention only after the user's choice. Roll back by disabling the timer and removing the journal drop-in, then restarting journald. Deleted caches can rebuild; removed historical logs and backups cannot be restored.

For the second cleanup pass, preview the expanded image candidates, enable `PRUNE_IMAGES=1`, and run the image/cache cleanup. Apply the newly authorized seven-day snapshot window after explaining that a representative snapshot holds approximately 717 MB of Steam Workshop data, 541 MB of program/configuration, and 1.2 MB of database dump. Compare filesystem bytes and the original 62 container identities again. Historical unprotected website images can be rebuilt from retained sources, while pulled image digests are recorded for retrieval.
