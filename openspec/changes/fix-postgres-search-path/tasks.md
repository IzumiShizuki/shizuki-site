## 1. Contract and Configuration

- [x] 1.1 Add the PostgreSQL schema-routing requirement and design artifacts.
- [x] 1.2 Update monolith PostgreSQL default datasource URLs to select `shizuki_app`.
- [x] 1.3 Add a focused configuration regression test for the `currentSchema` parameter.

## 2. Production Repair

- [x] 2.1 Back up the remote deployment environment and update `DB_URL` with `currentSchema=shizuki_app`.
- [x] 2.2 Restart the backend and verify API health plus representative schema resolution.
- [x] 2.3 Record sanitized verification evidence and rollback details.

## 3. Quality Checks

- [x] 3.1 Run the focused backend/configuration tests.
- [x] 3.2 Run strict OpenSpec validation and confirm the working tree state.
