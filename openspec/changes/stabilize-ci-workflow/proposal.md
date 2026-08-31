## Why

GitHub Actions still invokes a SQL convention script that was intentionally removed during repository cleanup, so every backend run emits an `exit 127` failure annotation even when the overall workflow succeeds. The workflow also trails the repository's declared pnpm toolchain and current GitHub-hosted action runtimes, producing misleading warnings and omitting frontend unit tests.

## What Changes

- Remove the stale SQL convention stage and all outcome handling tied to the deleted script.
- Align frontend CI with the checked-in `pnpm-lock.yaml`, `packageManager` declaration, Node.js 24, and frozen dependency installation.
- Move pnpm 11 workspace overrides out of the deprecated package manifest field so dependency installation is warning-free.
- Run the frontend unit suite before the production build.
- Upgrade first-party checkout, Java setup, and artifact upload actions to their current supported major versions.
- Preserve backend compile/test diagnostics and artifacts while eliminating obsolete cache/runtime warnings.
- Add a repository-runnable workflow contract check so stale paths and toolchain drift fail quickly before a push.

## Capabilities

### New Capabilities

- `continuous-integration`: Defines a reproducible, warning-free CI contract for backend verification and frontend test/build validation.

### Modified Capabilities

None.

## Impact

- Affected workflow: `.github/workflows/ci.yml`.
- Affected validation tooling and package-manager configuration: a small repository-local workflow contract test, frontend `package.json`, and `pnpm-workspace.yaml`.
- External systems: GitHub Actions runners and artifact storage.
- No production API, database, or runtime behavior changes.
