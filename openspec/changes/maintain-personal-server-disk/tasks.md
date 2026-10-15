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

## Follow-up outside this change

`infra-kafka` was already continuously restarting before maintenance (Docker reported the failure as two months old). Diagnose that service separately. Tagged rollback images and stopped containers remain protected; the 14-day backup window and retained Docker artifacts are not hard capacity quotas.
