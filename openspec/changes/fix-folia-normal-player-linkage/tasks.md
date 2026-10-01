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
- [x] 3.3 Remove temporary diagnostics, update tasks, and commit the verified local changes without deploying.
- [x] 3.4 Preserve concurrent main updates, align the complete Folia fork/public patch, and repeat affected verification after integration.
- [x] 3.5 Push the user-authorized diagnosis branch to the owner-controlled site origin and verify it is synchronized.

## Release follow-up

- The full Folia fix was pushed to the user-owned fork at `https://github.com/IzumiShizuki/folia-major.git`, branch `codex/fix-folia-normal-linkage`, commit `388f3e727e5ea523c3be16313f5a60034b70965b`.
- Site release commit `612250bc1098c9317d5ef358a18cc60d54ffb0de` was pushed to `origin/master` and deployed to the personal production site. The Folia gateway was built from the fork commit and deployed; site and gateway health checks passed.
- Production smoke checks for the site, Folia player entry/assets, and NetEase login-key route passed. A live site bundle contains the playlist-sync UI and failure-retry changes.
- Real signed-in playback, seek/pause, and account playlist import still need acceptance with the user's account and songs. The OpenSpec change remains unarchived until that acceptance is complete. The Windows symlink test limitation and the separate lyric-proxy 401 are documented in `verification-report.md`.
