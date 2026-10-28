## Verification Report: repair-ci-install-and-test-contracts

### Summary

| Dimension | Result |
| --- | --- |
| Completeness | 9/9 tasks completed for local delivery; GitHub publication recorded separately |
| Correctness | 5 requirements and 11 scenarios checked against implementation and regression evidence |
| Coherence | All 7 design decisions followed; feature/API contracts and dependency resolution preserved |

### Failure evidence and fixes

- [CI #202](https://github.com/IzumiShizuki/shizuki-site/actions/runs/40715386684), commit `4ed3761e`, failed frontend installation with `ERR_PNPM_IGNORED_BUILDS` for `@parcel/watcher@2.6.0` and backend mapping verification for `MomentEntity.authorUserId`. CI #201 has the same failures; CI #200 already exhibits the watcher failure.
- The original backend failure was reproduced with `mvn -B -ntp -pl model -am -Dtest=PersonalContentEntityMappingTest -Dsurefire.failIfNoSpecifiedTests=false test`. The author mapping now matches the existing entity and MySQL V436/PostgreSQL V1018 migrations, preserving exact map equality (`PersonalContentEntityMappingTest.java:74`).
- A clean temporary frontend installation using the old workspace policy reproduced the identical watcher error and exit code 1. With the explicit watcher approval at `pnpm-workspace.yaml:27`, `pnpm install --frozen-lockfile --offline` succeeded. The temporary installation skipped Electron's binary download because this check only verifies dependency installation.
- The main workspace also passed `pnpm install --frozen-lockfile` without skipping Electron's download. `pnpm-lock.yaml` has the same Git blob hash as HEAD: `1c55ad039da62ff9fe7b8603ded46d33ca33d807`. No dependency versions changed and strict build decisions were not disabled.
- New CI regressions initially failed 3/8 cases and now pass 8/8 (`ciWorkflowContract.spec.js:67-105`). They cover the missing build policy, retained failure evidence, required command failure propagation, and stage summaries.
- Full backend testing exposed two unauthenticated preview-cache fixtures and an obsolete public cache-header expectation. All three failures were reproduced together before correction; the four focused media tests now pass. Fixtures use the existing discovery grant and clear thread-local state. The controller test now enforces the existing `no-store, private` policy, matching the private-media OpenSpec requirement.
- Full monolith testing exposed ambiguous constructors in `AstrBotBridgeController`. A new real Spring-container test reproduced `No default constructor found` before the fix. Explicit injection on the complete constructor (`AstrBotBridgeController.java:23`) passes both that regression and the existing repository-wide constructor contract.

### Workflow verification

- Backend and frontend required commands capture stdout and stderr with `tee` under Bash pipefail (`ci.yml:39`, `ci.yml:47`, `ci.yml:124-136`).
- Frontend commands remain ordinary failing steps; tests/build have normal success gating. Backend's existing final outcome assertion remains intact.
- GitHub summary tables report original stage outcomes on every run (`ci.yml:49`, `ci.yml:138`). Frontend logs and JUnit output upload with `always()` and seven-day retention (`ci.yml:154`); distribution upload remains success-only.
- YAML parsed successfully with PyYAML. A temporary harness executed the actual YAML shell blocks under Git Bash: 6 command success/failure cases, 4 frontend summary combinations, and 3 backend summary/final-assertion combinations all passed. Command exit code 23 survived `tee`; both stdout/stderr remained in logs. Required-stage gating and unconditional report upload were checked separately.
- Full frontend suite with the exact CI reporters: **282 files, 1808 tests passed**, JUnit reports zero failures/errors.
- `pnpm build`: **passed**, including production bundle generation. Existing large-chunk notices are non-failing.
- Full Java 17 Maven reactor: **10/10 modules passed; 1172 tests reported, 1169 passed, 3 skipped, 0 failures/errors**.
- Backend command on this Windows machine: `mvn -B -ntp test -DargLine=-Djdk.net.unixdomain.tmpdir=D:/program/shizuki-site/.codex-tmp -Dsurefire.printSummary=true -DtrimStackTrace=false`. The local socket-directory override resolves a Windows/JDK loopback failure; it is not added to the Linux workflow.
- OpenSpec strict validation and `git diff --check`: passed.

### Requirement and scenario coverage

| Requirement | Evidence |
| --- | --- |
| Reviewed dependency installation | Clean red/green frozen installs; unchanged lockfile hash; explicit approval regression |
| Current entity mapping | Reproduced mapping failure, exact-map assertion, and successful full model tests |
| Actionable verification failures | 13 executed shell cases; pipeline exit checks; always-upload and stage-summary assertions; successful JUnit output |
| Current preview access and caching | Focused media tests plus complete media suite; permission fixtures cleared after each test; exact no-store header assertion |
| Bridge controller wiring | Real Spring context regression and repository-wide constructor test, both reproduced before and passed after the fix |

### CRITICAL

None in the locally verified implementation.

### WARNING

- Hosted Linux verification is pending explicit publication authorization. Two existing Testcontainers migration tests skipped locally because Docker is unavailable; no cross-database pass is claimed. The workflow retains those tests for GitHub's runner.
- The existing Pixiv live smoke test remains opt-in via `-Dpixiv.live=true` and was skipped by its original condition. Its condition was not changed.

### Operational note

Automatic execution policy rejected recursive deletion of the task's temporary installation directory, including a retry using the verified literal path. `.codex-tmp/ci-clean-install` and the temporary shell-verification harness remain in the existing Git-ignored scratch directory and are excluded from delivery. No toolchain directory was modified or removed.

### Publication handoff

Local checks establish the repair without claiming a successful GitHub run. After explicit push authorization: fetch/prune, integrate the target branch, rerun applicable checks and strict OpenSpec validation, push, then inspect both jobs and hosted migration tests in the newly triggered run. Keep this change open until the user asks to archive it.
