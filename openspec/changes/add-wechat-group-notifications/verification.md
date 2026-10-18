# Verification — add-wechat-group-notifications

Date: 2026-10-18. Schema: spec-driven. All 9 implementation tasks completed; local commit is the delivery boundary. Change remains unarchived.

## Completeness

All five requirements have implementation and regression coverage. PostgreSQL V1018 and MySQL V436 are additive. Shared publication contracts, user APIs/outbox, monolith publication integration, profile panel, AstrBot plugin and runbook are present. The upload ZIP is reproducible with build_plugin.py and excludes runtime state/tests/secrets.

## Correctness

| Requirement | Evidence |
| --- | --- |
| Verified private binding | WechatNotificationServiceTest covers hashed, expiring/replayed codes, conflict/concurrent binding and masking; WechatNotificationControllerTest covers login/secret/snake_case/no-store; plugin command tests reject group origins and stop downstream processing before network awaits. |
| Explicit group subscriptions and controls | Service tests verify live membership, account/group revocation, pause/quiet hours, unbinding and cancellation. Frontend tests exercise explicit type/group save, unsaved changes, inline unbind confirmation and unbinding while disabled. |
| Authorized publication reminders | ContentServiceImplVisibilityTest verifies publication transition event; MomentServiceTest verifies creator identity and legacy exclusion. WebsiteNotificationIntegrationTest uses anonymous public reading contracts and excludes withdrawn/unlisted/deleted/unknown-owner moments. Transaction rollback, recipient dedup and author/self exclusion are tested against the isolated database. |
| Authenticated recoverable bridge | Lease expiry, invalid tokens, retry exhaustion/backoff, idempotent acknowledgment and per-user spacing are covered. Plugin worker tests provider False/exception/cancellation and restart after a lost acknowledgment using real temporary SQLite. |
| Personal-center setup | Nine panel tests cover unavailable, loading failure/retry, pending/expiry/bound, account switch, controls and cleanup; existing ProfilePage/profileUiState tests pass. Browser fixtures verified dark/day at desktop and 390px, with page scroll width equal to viewport and controls at least 44px high. |

Final targeted suites: **57 Java tests**, **27 frontend tests**, **14 Python tests**, all passed. Production Vite build passed (existing Sass deprecation and large chunk warnings). Monolith reactor compile passed. Impeccable mechanical detector returned no findings for the new panel. Browser session and temporary preview server/files were closed/removed.

## Coherence

No content-to-user module dependency was introduced. BEFORE_COMMIT listener joins the publication transaction; the shared resolver is implemented by the monolith. Notification SQL state transitions hold the same database mutex, and durable unique receipts prevent repeated source/recipient fanout. UI inherits profile tokens and keeps subscription state scoped to the current account. Feature defaults to disabled; independent bridge secret is validated on every bridge endpoint.

## Findings and external verification limits

- No critical implementation/spec gaps found in the local review.
- Database execution tests use H2 PostgreSQL/MySQL compatibility modes, not production engines. No remote database was modified.
- AstrBot handlers use SDK-shaped test substitutes and verified official 4.x API sources. Real adapter login, private session format and proactive delivery are pending the user's AstrBot setup; this is documented and the default configuration sends nothing.
- Best-effort deduplication cannot eliminate the send-to-ledger crash window or recall an already authorized provider request. The personal-site mutex and single plugin process per platform are explicit scope limits.
- No Git push, deployment or real WeChat messages were performed. Unrelated existing untracked files were preserved.
