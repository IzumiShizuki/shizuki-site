# Verification Report: maintain-personal-server-disk

Date: 2026-10-15, Asia/Shanghai. Target: personal server `111.228.35.186` only.

## Result

| Measurement | Before | After |
|---|---:|---:|
| Root filesystem utilization (`df -h`) | 97% | 80% |
| Available root space (`df -h`) | 3.6 GiB | 20 GiB |
| Deployment backup directory (`du -sh`) | 25 GiB | 14 GiB |
| System journals | 2.6 GiB | 497.4 MiB |
| Docker build cache (`docker system df`, decimal units) | 9.081 GB | 4.919 GB |

The final filesystem had 20,900,585,472 available bytes. Compared with the rounded initial reading, approximately 16 GiB became available. Docker reclaim estimates share layers and must not be added to measured filesystem recovery.

## Actions and authorization

- Removed aged unused Docker build cache and aged dangling images. Tagged images, all 62 existing containers, and all 29 volumes were retained.
- Rotated system journals and removed archived journals subject to a 512 MiB budget and 14-day maximum retention.
- The user explicitly approved removing the 22 previewed snapshots older than 14 days and adopting the continuing rule: preserve every snapshot within 14 days and at least the newest three complete snapshots.
- Verified gzip integrity and PostgreSQL dump inventories for the protected snapshots before deletion. This is archive validation, not a full restore rehearsal.
- Removed exactly the 22 approved directories, containing 12,020,685,239 bytes of files. Confirmed all candidate paths were absent and all protected snapshot directories remained present.
- Preserved custom backup directories and the incomplete recognized snapshot. A subsequent retention preview reported zero candidates.

Server-side deletion inventory:

`/var/log/shizuki-disk-maintenance/snapshot-retention-20261015T155340799160Z.json`

Protected complete snapshots:

- `snapshot-20261011-235835-e4ac5b60445e`
- `snapshot-20261010-083918-6002d872627e`
- `snapshot-20261010-000641-bec2ad37d37b`

## Installed prevention

- Daily systemd timer, 04:30–04:45 Asia/Shanghai, enabled and active. The next run is on 2026-10-16; the exact randomized minute can vary.
- Maintenance lock contention was exercised with an externally held flock. The second invocation printed `Another maintenance run is active; skipping.` and exited without performing cleanup.
- `/etc/default/shizuki-disk-maintenance` has `PRUNE_SNAPSHOTS=1` following the user's explicit approval. Fresh installations default to `0`.
- Effective journald settings: `SystemMaxUse=512M`, `SystemKeepFree=2G`, `RuntimeMaxUse=128M`, `MaxRetentionSec=14day`.
- The first service run finished successfully with `Result=success` and `ExecMainStatus=0`.

## Verification evidence

| Check | Result |
|---|---|
| Linux snapshot safety suite | 11 tests passed, no skips |
| Shell syntax | Both shell scripts passed `bash -n` |
| systemd unit validation | New service and timer passed `systemd-analyze verify` |
| Container preservation | All 62 IDs/images unchanged; previously running applications retained their start timestamps |
| Frontend | HTTP 200 at `127.0.0.1:5173` before and after |
| Backend | `{"status":"UP"}` at `127.0.0.1:8080/actuator/health` before and after |
| Retention idempotence | Final preview: zero candidates |
| OpenSpec | Strict change validation passed |

The preliminary Windows test run passed its available cases, with symlink creation unavailable on that host. All symlink safety scenarios subsequently passed on Linux. No application source changed, so Java/frontend builds were not applicable.

## Completeness, correctness, and coherence

All three added requirements are implemented. The maintenance shell script and live container/HTTP comparison cover preservation; the installed timer, lock test, and effective journal settings cover recurring maintenance; the Python helper, 11 safety tests, protected archive checks, and server audit cover conservative snapshot retention. The implementation follows the design with no critical issues or requirement divergences.

## Existing issues and practical limits

`infra-kafka` was already failing and restarting before cleanup; this maintenance does not repair it. systemd validation also reported pre-existing `StartLimitIntervalSec` placement warnings in the unrelated 1Panel service units. New maintenance units had no validation errors.

Backups still occupy about 14 GiB. Tagged images, stopped containers, databases, uploads, and named volumes remain protected. Docker reports about 19.5 GB of reclaimable images, but those estimates do not justify removing retained rollback artifacts automatically. Cache age constraints and shared layers can keep usage above the 3 GB target. The approved 14-day backup window can still grow during frequent deployments.

Maintenance scripts and configuration are versioned under `deploy/maintenance/`; runtime audit data remains on the server. Disable the timer and remove the journald drop-in as documented to stop the policy. Deleted historical logs and snapshots cannot be restored. This change remains unarchived.
