## 1. Regression Contract

- [x] 1.1 Add a fast workflow contract test that reproduces the stale script and toolchain mismatch failures.
- [x] 1.2 Confirm the contract test fails against the current workflow for the expected reasons.

## 2. Workflow Stabilization

- [x] 2.1 Remove the deleted SQL convention stage and its obsolete summary/assertion handling.
- [x] 2.2 Upgrade checkout, Java setup, and artifact upload actions to supported majors.
- [x] 2.3 Switch frontend dependency setup to pnpm 11 with Node.js 24 and frozen-lockfile installation.
- [x] 2.4 Migrate deprecated pnpm overrides to workspace configuration without changing dependency resolution.
- [x] 2.5 Run frontend unit tests before the production build while preserving build artifacts.

## 3. Verification and Delivery

- [ ] 3.1 Run the focused contract test, full frontend test suite, frontend production build, and backend Maven tests.
- [x] 3.2 Validate the OpenSpec change strictly and record verification evidence.
- [ ] 3.3 Commit the CI stabilization, push `master`, and confirm the triggered GitHub Actions run completes successfully without the known annotations.
