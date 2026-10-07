## 1. Storage and upstream

- [x] 1.1 Add isolated per-user configuration and daily selection persistence with the supported PostgreSQL monolith migration.
- [x] 1.2 Add bounded Pixiv metadata, safe search, authenticated following and trusted image transport with optional proxy.

## 2. Personal daily content

- [x] 2.1 Implement verified encrypted account association, renewal, disconnect and bounded following synchronization.
- [x] 2.2 Implement manual artist management, stable Shanghai-date recommendations and daily sister-type character selection with persisted successful results.
- [x] 2.3 Expose authenticated personal endpoints and narrowly public safe artwork previews with rate limits.

## 3. Interface

- [x] 3.1 Add shared daily gallery, character portrait, account setup, artist management and searchable artwork results with actionable states.
- [x] 3.2 Integrate desktop and mobile personal interfaces and handle login changes, date rollover, request races and image failures.

## 4. Validation and handoff

- [x] 4.1 Add meaningful regressions for ownership, secret handling, stable daily selection, failure recovery, filtering, transport bounds and UI interactions.
- [x] 4.2 Run frontend tests/build, applicable backend tests/build, strict OpenSpec validation and verify implementation against scenarios.
- [x] 4.3 Document operational setup and actual upstream/account validation limitations, update tasks and create a local commit.

## Operational follow-up

真实账号/私密关注同步需要用户在界面填写有效 PHPSESSID；生产 Flyway 迁移随后端部署执行。本次未部署或推送。验证与交接详见 verification.md 和 docs/profile-daily-art.md。
