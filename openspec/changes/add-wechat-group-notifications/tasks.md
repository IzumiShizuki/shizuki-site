## 1. Binding and preferences

- [x] 1.1 Add additive PostgreSQL/MySQL migrations and shared publication contracts.
- [x] 1.2 Implement authenticated private binding, code expiry/replay prevention, subscription validation, pause/quiet hours and history APIs.

## 2. Delivery pipeline

- [x] 2.1 Capture article and moment publication transactionally, recording moment authors.
- [x] 2.2 Implement durable deduplicated outbox, leases, fresh authorization, retries and bridge authentication.
- [x] 2.3 Provide AstrBot private commands, polling worker, persistent duplicate suppression and configuration.

## 3. Personal center

- [x] 3.1 Add responsive binding and subscription panel with real loading, disabled, pending, bound and failure states.

## 4. Verification and delivery

- [x] 4.1 Test binding security, authorization changes, deduplication, leases and retries against an isolated database.
- [x] 4.2 Test plugin delivery/restart behavior and frontend interactions; run affected tests and production build.
- [x] 4.3 Document installation/configuration, API contract and remaining live connection steps; verify OpenSpec and commit locally.

Live follow-up (operator setup, outside this local implementation): configure and connect the chosen AstrBot WeChat adapter, deploy additive migrations/application, then verify real private binding and proactive sending with consenting test accounts. See docs/development/wechat-notifications.md. No push or production deployment performed.
