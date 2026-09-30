## 1. Diagnosis and reproducible evidence

- [x] 1.1 Capture baseline tests, production route/bundle version, and sanitized lyric proxy failures.
- [x] 1.2 Add and run behavioral red tests for zero progress, immediate pause/seek, selection ordering, next-track preparation, and normal-mode source synchronization at the actual affected seams.
- [x] 1.3 Record ranked hypotheses, confirmed causes, and remaining production-only uncertainty in diagnosis.md.

## 2. Luna implementation

- [x] 2.1 Repair embedded Folia state/control/selection integration and verified upgrade regressions while preserving standalone behavior and a single audio owner.
- [x] 2.2 Implement bounded next-track preparation without foreground quota or lyric effects, with ordering, deduplication, expiry, and stale-work guards.
- [x] 2.3 Synchronize stored Folia NetEase authorization and source playlists when entering normal mode, with account scoping, deduplication, and recoverable failure UI.
- [x] 2.4 Keep public Folia source snapshots/patch and applicable regression tests consistent with the full local fork; document required release steps.

## 3. Verification and handoff

- [x] 3.1 Re-run original behavioral repros, affected tests, and frontend build; fix regressions introduced by this change.
- [x] 3.2 Verify requirements/design against implementation, run strict OpenSpec validation, and document limitations and any pending production acceptance.
- [x] 3.3 Remove temporary diagnostics, update tasks, and commit the verified local changes without pushing or deploying.
- [x] 3.4 Preserve concurrent main updates, align the complete Folia fork/public patch, and repeat affected verification after integration.

## Release follow-up (outside this local change)

Production acceptance and the upstream Windows symlink test limitation are recorded in verification-report.md. No push, deployment, or OpenSpec archive was performed.
