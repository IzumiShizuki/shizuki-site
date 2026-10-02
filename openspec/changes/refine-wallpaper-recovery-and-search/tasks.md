## 1. Regression and measurement baseline

- [x] 1.1 Luna records deterministic failing regressions for selected wallpaper restoration across library failure and for thumbnail detail request fan-out; captures invocation and failure evidence.
- [x] 1.2 Luna records comparable search/preview request-count and repeat-load measurements before implementation, separating simulated timing from real upstream latency.

## 2. Wallpaper recovery

- [x] 2.1 Connect scoped/account-aware wallpaper display snapshots and bounded image bytes to application/startup restoration, including static images and dynamic posters.
- [x] 2.2 Preserve saved route/global IDs during transient failures and authentication initialization; reconcile successful authoritative data and invalidate deleted or revoked profiles.
- [x] 2.3 Verify bounded cache behavior, signed-URL-stable cache keys, object URL generation cleanup and logout/account boundaries with focused regression and browser checks.

## 3. Workshop import recovery

- [x] 3.1 Capture bounded SteamCMD output safely and classify authentication, ownership, timeout, network, execution and content failures without leaking secrets.
- [x] 3.2 Implement bounded retries for evidenced transient errors and tests for recovery, exhausted retries, permanent failures and process cleanup.
- [x] 3.3 Provide selected-item retry and optional local import actions; make channel readiness, failure reason and progress copy truthful; test import event routing.

## 4. Efficient discovery interface

- [x] 4.1 Add bounded parameter-keyed search reuse/deduplication, filter coalescing, refresh bypass and stale request protection with regression coverage.
- [x] 4.2 Reuse search preview metadata and bounded server caches to avoid per-thumbnail detail resolution while retaining trusted-host, image size/type and access checks.
- [x] 4.3 Build the compact filter rail, dense gallery, pagination and inspector using current tokens, with responsive disclosure and reduced blur.

## 5. Luna acceptance and local delivery

- [x] 5.1 Run focused frontend and affected backend tests, applicable full checks/builds, and repeat the original recovery and request-count repros; fix failures.
- [x] 5.2 Perform actual browser acceptance at desktop and narrow viewports; inspect loading/empty/error/selection/import states and save reviewable screenshots.
- [x] 5.3 Produce an OpenSpec verification report mapping requirements to implementation/tests with measurement evidence and explicit production Steam/upstream verification limits.
- [x] 5.4 Update tasks, run strict OpenSpec validation, clean task temporary files and commit all scoped changes locally with the specified author; leave a clean branch without push.

## 6. Master merge and release-candidate acceptance

- [x] 6.1 Merge the frozen wallpaper handoff commit `f66d3ceeeb46a6a42b42a9cc82b4f8ef382148d9` into the clean master worktree; keep all nine unrelated Folia/music conflict files at the pre-merge master versions.
- [x] 6.2 Preserve the wallpaper byte-progress prerequisite and verify the extra `App.vue` changes against the byte-progress commit and startup-recovery implementation.
- [x] 6.3 Run the merged full frontend suite and production build with `VITE_GATEWAY_BASE_URL=/`.
- [x] 6.4 Run the existing Obsidian publisher Node tests, affected backend tests/reactor checks, and Java 17 monolith package build.
- [x] 6.5 Repeat wallpaper recovery and desktop discovery browser acceptance against the merge result; verify master music fixes remain unchanged.
- [x] 6.6 Record merge and artifact evidence in `merge-acceptance-report.md`, run strict OpenSpec validation, and create the local merge commit without pushing or deploying.

## Delivery notes

The local master merge is verified as the requested release preparation. Push and deployment remain for the subsequent release step. A successful production Steam download was not verified; local mock/fake-process acceptance does not establish live account or upstream behavior.
