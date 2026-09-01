## Context

See `proposal.md` for the production symptom. All authentication service calls currently share a five-second deadline through the frontend authentication API wrapper. The lower-level HTTP client already implements abortable timeouts and a stable `TIMEOUT` error contract, while the login page already prevents overlapping submits.

## Goals / Non-Goals

**Goals:**

- Preserve the existing abort and error semantics while allowing normal production network tail latency.
- Cover both token issuance and the current-user request that completes session bootstrap.
- Add a deterministic regression at the authentication API seam that would fail with the former five-second deadline.

**Non-Goals:**

- Changing token lifetimes, credentials, password hashing, server authentication, or retrying non-idempotent token issuance automatically.
- Hiding sustained backend or network failures behind an unbounded wait.
- Modifying unrelated in-progress theme and atmosphere work in the shared worktree.

## Decisions

### Use a fifteen-second authentication request deadline

All calls routed through the authentication API wrapper will receive a fifteen-second deadline. This is long enough to accept the observed tail-latency case and a six-second regression fixture, but still short enough to return control to an interactive login form.

Alternative considered: retry token issuance automatically. Rejected because a response can be lost after the server has already issued rotating credentials; automatic retries can create duplicate successful issuances and make session state harder to reason about.

Alternative considered: remove the timeout. Rejected because an unavailable network must not leave login and account forms pending forever.

### Keep timeout enforcement in the shared HTTP client

The authentication wrapper will only select the authentication-specific budget. Abort signaling, error normalization, and cleanup remain in the existing HTTP client so there is one timeout implementation.

### Test delayed success and bounded failure through the real wrapper

The regression test will drive the authentication API with an abort-aware delayed fetch fixture. A response after six seconds must succeed, while a request beyond fifteen seconds must still return the existing `TIMEOUT` error. This exercises the production call path without requiring a real account or recording credentials.

## Risks / Trade-offs

- [Users wait longer before a genuine outage is reported] → Keep the deadline at fifteen seconds and preserve explicit timeout feedback.
- [All authentication-wrapper operations inherit the larger budget] → This is intentional for session bootstrap and OAuth/account actions; each remains bounded and single-submit controls already prevent duplicate UI actions.
- [A transient client route can still lose a server-success response] → Avoid automatic token retries and retain server audit evidence; the longer deadline materially reduces the observed false timeout window.

## Migration Plan

1. Add the regression test and confirm it fails under the five-second budget.
2. Raise the authentication wrapper deadline to fifteen seconds and run focused frontend tests plus the production build.
3. Deploy only the frontend service and verify public authentication latency and site health.
4. Roll back by restoring the previous frontend image/commit; no database or server configuration migration is required.
