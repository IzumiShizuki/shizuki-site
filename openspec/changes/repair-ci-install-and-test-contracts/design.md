## Context

See proposal.md for the failures in CI #201/#202. The frontend uses pnpm 11.8.0, Node 24, and workspace `allowBuilds`. The native watcher is already locked at 2.6.0; `pnpm ignored-builds` reproduces the missing policy locally. Its installation script only compiles from source when explicitly requested. `MomentEntity.authorUserId` is backed by MySQL V436 and PostgreSQL V1018. The current exact mapping test omits it.

## Goals / Non-Goals

**Goals:** Restore existing install/test contracts, preserve strict dependency decisions and exact field assertions, and expose failures at their original CI stage with retained evidence.

**Non-Goals:** Dependency upgrades, new business behavior or APIs, server deployment, workflow trigger changes, or publishing without authorization.

## Decisions

1. Add `@parcel/watcher: true` to workspace `allowBuilds`. This approves the existing native dependency without globally permitting scripts, disabling strict dependency checks, or changing the lockfile. A clean temporary installation will verify the policy independently of local `node_modules` state.
2. Include `authorUserId -> author_user_id` in the existing exact mapping expectation. Keep exact equality so removing, renaming, or adding unrelated fields still fails. Reverting the production author field would break existing notifications.
3. Keep frontend commands as normal failing steps with `bash` pipefail and `tee` logs. Use `always()` for summaries and report uploads so evidence survives failures. Subsequent required stages retain default success gating. Avoid frontend `continue-on-error` and a redundant final assertion; the original failing step already determines the job result. Preserve the existing backend final outcome assertion.
4. Generate a JUnit report alongside the default Vitest reporter and retain it with frontend logs. Backend/frontend summaries use GitHub job summary tables. Distribution upload remains success-only.
5. Extend the existing CI contract test for the dependency policy and exercise the actual workflow shell commands with fake command executables for install/test/build failures. Run full suites to reveal downstream failures masked by the initial backend exit, correcting stale test contracts only when supported by current code/schema behavior.
6. Full-reactor reproduction uncovered three stale wallpaper assertions: two preview-cache fixtures lack the authorization required by `WallpaperDiscoveryAccess`, and the MVC preview test expects public caching. Match the existing `isolate-private-media-and-companion` spec: grant the fixture only `media.wallpaper.discovery`, clear thread-local identity after each test, and assert `no-store, private` on preview responses. Keep production authorization and caching unchanged.
7. Full monolith verification exposed two public constructors in `AstrBotBridgeController` without an explicit injection constructor. Annotate the complete four-dependency constructor with `@Autowired`, preserving the convenience constructor for existing direct callers. Add a real Spring-context regression that creates the controller and exercises contact confirmation through its injected collaborators; do not exempt the controller from the existing constructor contract.

## Risks / Trade-offs

- [Windows cannot reproduce the hosted Linux runner completely] -> Use a clean frozen local install, workflow shell failure injection, full local suites, and explicitly record that hosted Linux/Testcontainers results require publication.
- [Retained logs increase artifact storage] -> Limit frontend report retention to seven days, matching backend diagnostics.
- [Additional stale backend assertions may surface] -> Reproduce each failure and check current production contracts before making a focused correction.

## Migration Plan

Commit the validated changes locally. After explicit authorization, fetch and integrate the target branch, rerun applicable checks, push, and inspect the new GitHub run. Rollback is a revert of the CI repair commit; no production data migration is needed.
