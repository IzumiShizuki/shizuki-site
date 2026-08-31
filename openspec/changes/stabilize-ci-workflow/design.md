## Context

See `proposal.md` for motivation and `specs/continuous-integration/spec.md` for the observable contract. The current workflow predates the July cleanup that removed `scripts/check_sql_conventions.sh`, while the frontend now declares pnpm 11.8.0 and carries a pnpm lockfile. GitHub's current first-party actions use Node.js 24-based majors.

## Goals / Non-Goals

**Goals:**

- Make a green run free of known failure annotations and runtime deprecation warnings.
- Keep backend compile and test failures independently diagnosable.
- Make local and hosted frontend verification execute the same locked dependency graph, tests, and build.
- Add a fast regression signal for future workflow drift.

**Non-Goals:**

- Reintroduce the removed MySQL-oriented SQL convention checker.
- Change Java, Maven, application runtime, deployment, or production infrastructure behavior.
- Add release or deployment stages to CI.

## Decisions

### Remove the obsolete SQL stage instead of restoring its script

The SQL checker was deliberately deleted and its last implementation produced invalid PostgreSQL findings. Retaining an advisory step that always fails creates a red annotation without protecting the codebase. Restoring or rewriting SQL linting is a separate capability and is not required to make current CI truthful.

### Use the frontend's declared pnpm 11 toolchain

The frontend `package.json` is authoritative for pnpm versioning and `pnpm-lock.yaml` is the frozen dependency graph. `pnpm/setup@v1` installs both pnpm 11 and Node.js 24 in one supported action. Overrides move to `pnpm-workspace.yaml`, which pnpm 11 reads without the deprecation warning emitted for `package.json#pnpm.overrides`. This avoids dependence on Corepack availability and removes the split npm/pnpm lockfile behavior. The alternative of retaining npm was rejected because it contradicts `packageManager` and local verification commands.

### Upgrade hosted actions by supported major

Use `actions/checkout@v7`, `actions/setup-java@v6`, and `actions/upload-artifact@v7`. These are the current supported majors documented by their maintainers and remove the Node.js 20 warning emitted by artifact v4. Java remains version 17; the action upgrade changes CI plumbing, not the application toolchain.

### Preserve staged backend diagnostics

Compile and test commands continue to capture logs and run with `continue-on-error`, followed by a final assertion step that determines the job result. Removing only the deleted SQL outcome keeps artifacts available even when an earlier backend stage fails.

### Compare migration schemas by semantic type

The cross-dialect test already normalizes vendor aliases such as `SMALLINT`/`TINYINT`, `DECIMAL`/`NUMERIC`, and `JSON`/`JSONB`. Extend the same boundary to `VARCHAR`/`CHARACTER VARYING`, which PostgreSQL documents and exposes as equivalent names. Changing either migration SQL was rejected because the discrepancy exists only in metadata spelling; column nullability and unique constraints remain separately compared.

### Lock the workflow contract with a fast Vitest test

A dependency-free test reads `.github/workflows/ci.yml`, verifies supported action/toolchain markers, and checks that every explicitly invoked repository shell script exists. The test is fast enough for local use and runs automatically inside the frontend CI suite. A full YAML parser was rejected because it would add a dependency for a narrow static contract.

## Risks / Trade-offs

- [Risk] Running the full frontend unit suite increases CI duration. → Mitigation: the suite is deterministic and currently completes in under one minute locally; concurrency already cancels superseded runs.
- [Risk] Text-based workflow assertions can require updates when equivalent YAML is reformatted. → Mitigation: assert stable semantic markers rather than complete snapshots.
- [Risk] A new action major could change hosted behavior. → Mitigation: use documented stable majors and validate the first pushed run before declaring completion.
- [Risk] Type normalization could hide a meaningful difference. → Mitigation: normalize only the confirmed alias pair and keep every other type, nullable flag, and unique scope in the snapshot comparison.

## Migration Plan

1. Update the workflow and add the contract regression test.
2. Migrate pnpm overrides and confirm frozen installation does not alter the lockfile.
3. Run the contract test, full frontend suite/build, and Maven tests locally.
4. Validate OpenSpec strictly, commit, and push `master`.
5. Observe the triggered GitHub Actions run through completion and inspect annotations.
6. If the hosted workflow regresses, revert the CI stabilization commit; the preceding public-content commit remains independently recoverable.
