## 1. Incremental synchronization contracts

- [x] 1.1 Add tests for NUL-delimited Git add/modify/delete/rename/copy parsing and approved-path filtering.
- [x] 1.2 Add tests proving a valid ancestor marker selects incremental synchronization while missing, malformed, unknown, and non-ancestor markers select full reconciliation.
- [x] 1.3 Add tests for changed-file hash verification, exact deletions, and protected/excluded path preservation.

## 2. Incremental synchronization implementation

- [x] 2.1 Read and validate the remote deployed-commit marker against the clean target commit and local Git graph.
- [x] 2.2 Implement delta upload/delete application with parent creation, file/dir collision handling, mode/mtime retention, and SHA-256 verification.
- [x] 2.3 Route eligible deployments through the incremental path and retain the existing full synchronizer as the logged fallback.

## 3. Build and service convergence

- [x] 3.1 Add a named locked BuildKit Maven repository cache and remove the redundant backend `clean` goal.
- [x] 3.2 Remove unconditional Compose `--force-recreate` while preserving build, dependency health ordering, and final health gates.
- [x] 3.3 Add sanitized elapsed-time reporting for backup, sync, remote rebuild, and verification phases.

## 4. Verification and delivery

- [x] 4.1 Run all deployment safety tests, Dockerfile/runner contract checks, syntax checks, and strict OpenSpec validation.
- [x] 4.2 Measure tracked project source/test/config/documentation line counts by language and review declared frontend/backend libraries against custom infrastructure code.
- [ ] 4.3 Commit and push the clean master, deploy through the guarded path, confirm incremental selection and phase timings, then verify commit marker, READY snapshot, services, API, site entry, and staged content gates.
