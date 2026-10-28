## 1. Reproduce and lock down the failures

- [x] 1.1 Inspect recent GitHub runs and reproduce the backend mapping failure and missing native dependency approval locally.
- [x] 1.2 Add focused CI regression assertions and observe their failure before the fix.

## 2. Repair CI contracts and diagnostics

- [x] 2.1 Record the watcher build approval and verify a clean frozen installation without changing dependency resolution.
- [x] 2.2 Align exact backend mapping expectations with the current migrated schema and fix any independently reproduced downstream contract failures.
- [x] 2.3 Preserve frontend command failures and retain installation, test, and build logs plus JUnit reports; publish frontend/backend stage summaries.
- [x] 2.4 Fix the independently reproduced ambiguous bridge-controller injection and verify real Spring wiring.

## 3. Verify and deliver locally

- [x] 3.1 Run focused regressions and inject success/failure cases through the workflow shell commands.
- [x] 3.2 Run the full frontend unit suite, production build, and complete backend Maven verification; record any environment-limited tests.
- [x] 3.3 Perform OpenSpec verification and strict validation, record evidence and publication handoff, and commit the scoped changes locally.

## Publication handoff

GitHub execution of the repaired workflow is pending explicit push authorization. After publication, inspect both jobs of the new run, including hosted cross-database tests; do not infer remote success from local checks.
