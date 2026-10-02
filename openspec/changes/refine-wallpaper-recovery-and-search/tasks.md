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

## Delivery notes

User authorization covers local implementation and acceptance by Luna. A successful authenticated download on the production server requires a separately established environment and must not be asserted from mocks. Record any external follow-up here and in verification-report.md; it does not replace local regression acceptance.
