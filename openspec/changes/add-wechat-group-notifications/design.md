## Context

See proposal.md for motivation. Website groups are account group codes, not WeChat chats. The monolith uses PostgreSQL, shared model contracts and separate user/content modules. Articles have owners; moments currently do not record their creator.

## Goals / Non-Goals

**Goals:** Verified opt-in reminders, transactional publication capture, safe withdrawal, operationally simple AstrBot integration.
**Non-Goals:** Reading WeChat group chats, automatic friend requests, bulk broadcasts, historical backfill, production deployment. Initial reminders include only anonymously readable public content.

## Decisions

- Use a pull bridge authenticated by a separate environment secret. AstrBot needs outbound HTTPS only; do not expose a new bot web server. Disabled by default and require a nonempty platform allowlist.
- Store 128-bit binding codes as SHA-256, expire after ten minutes, rotate with a cooldown, and confirm only from actual private chat event origins. One site account per platform/sender identity. Rebinding invalidates pending destinations.
- Put preferences, subscriptions and durable outbox in user-module. Shared publication events and content-resolver contracts avoid cross-module dependencies. A monolith BEFORE_COMMIT listener captures notifications atomically with publication.
- Add nullable moment creator IDs; legacy moments without an author do not generate group reminders. Never infer original ownership from whoever republishes.
- Serialize short notification state transactions through a database mutex row, suitable for a personal site's volume and portable across PostgreSQL/MySQL. Use unique event/recipient constraints, expiring leases and hashed lease tokens. Retry at most five times with backoff.
- Lease IDs first, authorize content and destination immediately before provider send. Check live group overlap, subscription, pause/quiet hours, binding version, content ownership and public visibility at both enqueue and authorization. Never persist article bodies in the queue.
- The plugin keeps a durable SQLite delivered-ID ledger to acknowledge retries without resending. Delivery is best effort with bounded retries: a crash after provider send but before ledger persistence can duplicate a message; no exactly-once or end-user-read claim.
- Profile account settings show actual configuration/binding state, subscriptions and recent status, using existing visual tokens and mobile layouts.

## Risks / Trade-offs

- [Bridge not configured] → Explicit unavailable UI and setup runbook; no fake successful connection.
- [Provider-specific proactive messaging limits] → Platform allowlist, spacing, bounded retries; owner must select an AstrBot WeChat adapter supporting private proactive sends.
- [Membership/content changes between authorization and send] → Fresh authorization immediately before every send; unbind cancels pending work. A provider request already in flight cannot be recalled.
- [Single mutex limits throughput] → Bounded batches and short database transactions; appropriate for current personal-site scope.
- [Personal data retention] → Mask identity in website responses; purge expired codes and old lease secrets during bridge polling, expose only recent 30-day history. Retain minimal source/recipient/status receipts for deduplication; contact origins remain only in the revocable binding row.

## Migration Plan

Apply additive monolith Flyway migrations with the feature disabled. Configure site origin, secret and permitted AstrBot platform IDs, install/configure plugin, then enable after staging verification. Disable the feature/plugin to roll back behavior; preserve tables for recovery. Never run test migrations against the configured remote database.
