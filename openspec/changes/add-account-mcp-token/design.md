## Context
The Todo development adapter used one global configured credential. Other adapters can retain their own integration credentials until explicitly migrated.

## Goals / Non-Goals
A website user can issue/rotate/revoke one credential and choose one Todo project. This is not a login mechanism or account-wide project grant.

## Decisions
- Generate 256 random bits and keep only the SHA-256 digest; plaintext returned once with no-store.
- Serialize account mutations by locking its active account row. Store one credential row per account and invalidate immediately on new lookups. Already-admitted operations may complete.
- Scope resolution is deny-by-default and checks the currently owned, unarchived project at use time. Never set login-user context for MCP credentials. The new backend never accepts the old static credential; legacy client mode is only for older servers.
- Candidate migration versions V1030 (PostgreSQL) and V439 (MySQL) are for the source branch, not production. Reconcile shared deployment history, including DJ V1104–V1106.

## Risks / Trade-offs
A single token covers every explicitly integrated grant, so revocation invalidates all such access. Unintegrated endpoints cannot reuse it implicitly. A source-only migration guard is not a substitute for checking the deployed ledger.
