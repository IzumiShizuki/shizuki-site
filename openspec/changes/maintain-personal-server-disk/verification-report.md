# Verification Report: maintain-personal-server-disk

Date: 2026-10-15, Asia/Shanghai. Target: personal server `111.228.35.186` only.

## Result

| Measurement | Initial | First pass | Current |
|---|---:|---:|---:|
| Root filesystem utilization (`df -h`) | 97% | 80% | 67% |
| Available root space (`df -h`) | 3.6 GiB | 20 GiB | 32 GiB |
| Deployment backup directory (`du -sh`) | 25 GiB | 14 GiB | 8.4 GiB |
| System journals | 2.6 GiB | 497.4 MiB | 500.5 MiB |
| Docker build cache (`docker system df`, decimal units) | 9.081 GB | 4.919 GB | 2.099 GB |

The final filesystem had 34,077,028,352 available bytes, compared with 20,900,585,472 after the first pass: another 12.3 GiB became available. Compared with the rounded initial reading, approximately 28 GiB became available in total. Docker reclaim estimates share layers and must not be added to measured filesystem recovery.

## Actions and authorization

- Removed aged unused Docker build cache and aged dangling images. All 62 existing containers, all 29 volumes, and protected rollback images were retained.
- Following the user's request to continue cleanup, removed 20 unused generated website images older than seven days and five explicitly inventoried obsolete downloadable images (old AstrBot, Node, Nginx, Temurin, and Maven). All 25 image IDs were confirmed absent afterward. The pull digests for downloaded images were saved for retrieval.
- Rotated system journals and removed archived journals subject to a 512 MiB budget and 14-day maximum retention.
- The user initially approved removing 22 previewed snapshots older than 14 days. After inspecting the remaining backup contents, the user requested a shorter retention period. The current rule keeps every snapshot within seven days and at least the newest three complete snapshots.
- Verified gzip integrity and PostgreSQL dump inventories for the protected snapshots before deletion. This is archive validation, not a full restore rehearsal.
- Removed the initial 22 directories containing 12,020,685,239 bytes, then five additional snapshots containing 5,048,723,420 bytes under the shortened seven-day policy. Confirmed all candidate paths were absent and all protected snapshot directories remained present.
- Preserved custom backup directories and the incomplete recognized snapshot. A subsequent retention preview reported zero candidates.

Server-side inventories:

`/var/log/shizuki-disk-maintenance/snapshot-retention-20261015T155340799160Z.json`

`/var/log/shizuki-disk-maintenance/image-retention-20261015T160655633052Z.json`

`/var/log/shizuki-disk-maintenance/downloaded-images-preview.json`

`/var/log/shizuki-disk-maintenance/snapshot-retention-20261015T161322102777Z.json`

A representative complete snapshot contains 716,605,019 bytes of Steam Workshop volume archives, 541,477,982 bytes of program/configuration archive, and a 1,186,473-byte PostgreSQL dump, plus small supporting files. Repeated deployment backups duplicate these large archives; the directory size is not the database size. The program archive is currently a full copy of the app directory, as implemented in `deploy/server_deploy.py:create_remote_backup`.

Protected complete snapshots:

- `snapshot-20261011-235835-e4ac5b60445e`
- `snapshot-20261010-083918-6002d872627e`
- `snapshot-20261010-000641-bec2ad37d37b`

## Installed prevention

- Daily systemd timer, 04:30–04:45 Asia/Shanghai, enabled and active. The next run is on 2026-10-16; the exact randomized minute can vary.
- Maintenance lock contention was exercised with an externally held flock. The second invocation printed `Another maintenance run is active; skipping.` and exited without performing cleanup.
- `/etc/default/shizuki-disk-maintenance` has `PRUNE_SNAPSHOTS=1` and `PRUNE_IMAGES=1` following the user's cleanup requests. Fresh installations default both flags to `0`.
- Generated-image retention manages only `shizuki-site/backend` and `shizuki-site/site`; it protects all container references, each repository's newest three image versions, backup-record hash references, and aliases outside the allowlist. Removal never uses force. All explicit `previous-images.json` rollback references were verified present afterward.
- Build-cache maintenance keeps six-hour recent cache, reserves 1 GB, and targets 2 GB. The snapshot window is seven days with a minimum of three complete snapshots.
- Effective journald settings: `SystemMaxUse=512M`, `SystemKeepFree=2G`, `RuntimeMaxUse=128M`, `MaxRetentionSec=14day`.
- Both the initial run and the tightened-policy service run finished successfully with `Result=success` and `ExecMainStatus=0`.

## Verification evidence

| Check | Result |
|---|---|
| Linux snapshot/image safety suites | 20 tests passed, no skips |
| Shell syntax | Both shell scripts passed `bash -n` |
| systemd unit validation | New service and timer passed `systemd-analyze verify` |
| Container preservation | All 62 IDs/images unchanged; previously running applications retained their start timestamps |
| Frontend | HTTP 200 at `127.0.0.1:5173` before and after |
| Backend | `{"status":"UP"}` at `127.0.0.1:8080/actuator/health` before and after |
| Retention idempotence | Final installed snapshot and image previews: zero candidates |
| OpenSpec | Strict change validation passed |

The preliminary Windows test run passed its available cases, with symlink creation unavailable on that host. All symlink safety scenarios subsequently passed on Linux. No application source changed, so Java/frontend builds were not applicable.

## Completeness, correctness, and coherence

All four added requirements are implemented. The maintenance shell script and live container/HTTP comparison cover preservation; the installed timer, lock test, and effective journal settings cover recurring maintenance; the two Python helpers, 20 safety tests, protected archive checks, and server inventories cover snapshot and generated-image retention. The implementation follows the design with no critical issues or requirement divergences. The seven-day cutoff boundary, new image references during cleanup, changed tags, malformed backup metadata, and non-forced removal are tested.

## Existing issues and practical limits

`infra-kafka` was already failing and restarting before cleanup; this maintenance does not repair it. systemd validation also reported pre-existing `StartLimitIntervalSec` placement warnings in the unrelated 1Panel service units. New maintenance units had no validation errors.

Backups still occupy about 8.4 GiB. Protected tagged images, stopped containers, databases, uploads, and named volumes remain preserved. Docker reports 28.18 GB of total images and 20.65 GB of estimated reclaimable images; those values include shared-layer accounting and do not override the protection rules. Cache age constraints and shared layers can keep usage above the 2 GB target. The seven-day backup window can still grow during frequent deployments; separating program and large-file backup frequencies would require a corresponding restore-flow change and remains outside this cleanup.

Maintenance scripts and configuration are versioned under `deploy/maintenance/`; runtime audit data remains on the server. Disable the timer and remove the journald drop-in as documented to stop the policy. Deleted historical logs and snapshots cannot be restored. This change remains unarchived.

Local temporary diagnostics remain at `C:\Users\IzumiShizuki\AppData\Local\Temp\shizuki-disk-maintenance-20261015` (the original 14 small files plus follow-up diagnostics). During the first pass, automatic approval rejected cleanup commands, including a second attempt limited to the individually inspected files, with `blocked by policy` and no detailed reason. This does not affect server cleanup, installed retention, or application health.
