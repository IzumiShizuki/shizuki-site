## 1. Audit and immediate relief

- [x] 1.1 Record filesystem, Docker, journal, backup, and service-health baselines; reclaim safe old cache and journals.
- [x] 1.2 Preview snapshot retention and obtain the user's decision before removing historical recovery points.

## 2. Recurring maintenance

- [x] 2.1 Implement conservative preview/apply snapshot retention and meaningful safety tests.
- [x] 2.2 Add daily non-overlapping Docker cache maintenance, journal limits, systemd units, and operational instructions.
- [x] 2.3 Validate and install maintenance on 111.228.35.186; verify protected backups and apply the approved retention rule.

## 3. Verification and handoff

- [x] 3.1 Check measured disk recovery, unchanged application container identities, HTTP health, timer status, and retention idempotence.
- [x] 3.2 Write the operational verification report, pass strict OpenSpec validation, and commit only this change locally.

## 4. Requested deeper cleanup

- [x] 4.1 Inventory remaining disk usage and select obsolete images with explicit protection for containers and backup references.
- [x] 4.2 Add opt-in generated-image retention with safety tests, and tighten the recurring build-cache budget.
- [x] 4.3 Apply the second cleanup pass, verify actual recovery and unchanged service state, update the report, and commit locally.

## Follow-up outside this change

`infra-kafka` was already continuously restarting before maintenance (Docker reported the failure as two months old). Diagnose that service separately. Protected rollback images and all stopped containers remain preserved; the seven-day backup window and retained Docker artifacts are not hard capacity quotas.

Local temporary diagnostics remain in `C:\Users\IzumiShizuki\AppData\Local\Temp\shizuki-disk-maintenance-20261015`: during the first pass, automatic approval rejected both recursive and individually validated file cleanup commands with `blocked by policy`, without a more specific reason. The original 14 files and follow-up diagnostics do not affect the completed server maintenance.

The remaining 8.4 GiB of backups include repeated full program and Steam Workshop data archives. Separating these backup frequencies would require updating the corresponding restore process; current retention is seven days with at least three complete snapshots, as agreed in the follow-up conversation.
