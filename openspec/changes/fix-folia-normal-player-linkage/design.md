## Context

See proposal.md for user symptoms. The Vue player owns audio; Folia React is loaded from `/music/` into the same document and exchanges messages on the shared window. Folia's local audio is deliberately locked, so controls must not infer readiness solely from that element. The checked-in directory is a public fork snapshot/patch, not a complete independently buildable upstream checkout. The deployment runbook states that production still uses a 0.7.7 image despite a 0.7.11 source merge.

## Goals / Non-Goals

**Goals:** Reproduce the exact symptoms with behavioral tests; preserve one audio owner; make entry, authorization, and bounded preparation independent of visible mode. Root performs diagnosis/review while Luna writes implementation.

**Initial diagnosis Non-Goals:** Replacing Folia, enabling additional providers, exposing account secrets, changing remote branch naming, or deploying. The later explicit push/deployment authorization and delivery are recorded in the production follow-up below.

## Decisions

1. **Authoritative bridge state and explicit control relay.** Verify all consumer stores and motion signals receive the site clock. Embedded control availability derives from an authoritative session. Prefer explicit intent relay with scoped echo suppression over timing windows that discard genuine user actions. Keep Folia resolution/prefetch out of embedded selection where it races the site-owned player. Preserve standalone Folia behavior.
2. **Behavioral seam before repair.** Existing source-string assertions already fail after the upgrade but cannot prove audio controls work. Add a mocked playback store/audio/clock harness for the real bridge and player, reproduce red, and use it for green verification. Reconcile existing assertions only against preserved user behavior.
3. **Shared, bounded preparation.** Use the same playback resolution source and auth context as foreground playback, reuse only fresh matching results, and deduplicate the next ordered queue entry. Keep one in-flight request and one prepared result with a 30-second cache lifetime. Allow an initial attempt plus at most one refresh in the final 20 seconds if the first result expired or failed; pausing does not reset the limit. Preparation is optional and must not consume pick quota, affect active lyrics, or apply stale results after queue/account replacement. The existing resolver may update its backend source cache; it does not call the foreground pick operation. Prefer existing resolution APIs over introducing a new backend contract.
4. **Mode-independent account entry.** Read Folia's current cookie key before the legacy alias during music workspace initialization. Persist authorization through existing authenticated APIs and synchronize source playlists through existing idempotent import paths. Refresh library state on success; use an in-flight guard and a page-scoped unchanged-credential/account cache to avoid repeated work during mode switching. Fresh page entry may refresh the idempotently imported library. Preserve newer Folia credentials during backend-to-Folia synchronization. Record a local account owner plus non-plaintext credential fingerprint so a site-account switch cannot silently replay the same browser session under a different account. Account-scoped authorized fetch checks user identity after session readiness/token refresh as well as before projecting responses; failed synchronization remains retryable through the page's existing sync action.
5. **Separate source fixes from deployment acceptance.** Inspect public production routes/bundles read-only. Capture lyric proxy 401 status as an authorization/routing failure, not an empty lyric response. Public fork snapshots and patch must agree; if no complete local upstream exists, record the exact remaining fork/build/deployment work rather than modifying the remote server.

## Risks / Trade-offs

- [A new upstream control path may bypass the bridge] → Verify actual consumers against a complete existing checkout or public bundle, then cover the real intent path.
- [Track resolution can consume pick quota or cache signed URLs past expiry] → Use side-effect-free resolution, bound lifetime, and re-resolve on playback failure.
- [Cookie synchronization races a user/account switch] → Scope in-flight work to the authenticated account and recheck before library projection.
- [Source-string tests provide false confidence] → Require runtime state/control tests; retain useful compatibility assertions without treating them as end-to-end acceptance.
- [Production remains on a different version] → Report source and production findings separately, with deployment left pending.

## Migration Plan

The initial diagnosis phase performs no runtime deployment. Commit verified local changes on the new branch after strict OpenSpec validation and applicable tests/build. A later explicitly authorized release must build Folia from the matching complete fork and deploy Folia and the main frontend together, verify pause/seek/rapid selection/account import, and retain previous images for rollback. That release was subsequently authorized and completed; see verification-report.md for actual source/image revisions and browser acceptance.

## Production regression follow-up (2026-10-01)

The user authorized the prior fork push and production deployment and reports two remaining symptoms: a normal-mode track remains audible after selecting a different track inside Folia, and the toolbar lyric color stays white. Reopen behavioral verification at the actual selection and visualizer seams. Test the normal-to-Folia sequence rather than only isolated relay calls, and assert the rendered primary lyric color rather than only an injected CSS variable. Preserve standalone mode and the single audio owner. Record stale browser bundles separately from fresh deployment behavior; keep public snapshots/patch consistent with the complete user-owned fork. The prior deployment is recorded in verification-report.md; verified follow-up fixes may be pushed and deployed under the existing session authorization with rollback protection.

Build the final Folia image from a clean `git archive` of the verified fork commit. The existing server checkout contains ignored `node_modules` and `dist`, and its external Dockerfile uses `COPY . .`; using that dirty build context can overwrite dependencies installed by `npm ci`. Archive-only context excludes those files and `.git` while preserving tracked source and the lockfile. Retain the previous image and site restore point until health checks and actual browser rendering pass.
