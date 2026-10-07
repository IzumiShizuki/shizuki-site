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

2026-10-07 用户提供会话并授权填写后，已验证真实公开关注并为线上 UI 确认的网站账号 ID 1 加密保存关联与 17 位公开关注。独立表已用 V1016 中的幂等 SQL 创建，Flyway 历史未改，正式迁移随后端部署执行。应用尚未部署或推送，生产界面提交及私密关注仍未验证。详见 verification.md 和 docs/profile-daily-art.md。

## 5. Account setup and explicit all-ages policy

- [x] 5.1 Reject R-18/R-18G tags, invalid or missing age classifications, and verify listing/search/preview filtering before image transport.
- [x] 5.2 Validate the user-supplied session and save only encrypted association data for the website account confirmed in the logged-in UI; document actual storage and deployment status without credentials.
- [x] 5.3 Explain manual session renewal and implementation provenance, run relevant regressions and strict validation, and commit the scoped changes locally.

## 6. Master integration and production release

- [x] 6.1 Advance local master to the existing deployed baseline and apply the two daily-art commits, preserving already deployed music/wallpaper behavior and excluding the user's uncommitted TopMenu edits.
- [x] 6.2 Validate the merged release, build artifacts using the installed environment and production frontend settings, and create a verified fresh recovery point.
- [x] 6.3 Deploy backend and site artifacts to 111.228.35.186, complete Flyway V1016, verify authenticated daily content and public safe previews, and record runtime/source identity and release evidence.
