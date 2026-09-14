## Why

Two production issues affect the account entry point:

1. Registration is broken on the PostgreSQL runtime. `USR_ACCOUNT.groups_json` and `permissions_json` are `jsonb` columns, but the MyBatis-Plus entity binds them as `varchar` parameters, so `INSERT` fails with `column "groups_json" is of type jsonb but expression is of type character varying` (reproduced live on 2026-09-14 against `111.228.35.186`). MySQL tolerated the implicit cast, so the defect only surfaced after the runtime moved to PostgreSQL.
2. The login page carries a generic dark "Auth Portal" presentation that does not reflect the site's personal, hand-crafted character, and the owner wants to be able to put their own anime images (background and mascot) on the entry screen.

## What Changes

- Register a PostgreSQL-safe JSON type handler on the account entity so inserts and updates of `groups_json` / `permissions_json` bind with `Types.OTHER` and succeed on `jsonb` columns while remaining plain strings on other databases.
- Redesign the desktop and mobile account entry pages in a cute, kawaii personal-site style: pastel gradients, floating heart/star/cloud decorations, a rounded mascot card with a CSS-drawn default mascot, pill tabs and buttons, and rounded inputs.
- Add a self-service customization panel on the login page where the owner can switch between cute pastel theme presets and set their own anime background image and mascot image (by URL or local upload), persisted in the current browser via `localStorage` and honored by both desktop and mobile entry pages.
- Keep the existing login / register / forgot-password / OAuth / captcha flows and their API contract unchanged.

## Capabilities

### New Capabilities

- `cute-auth-entry`: Presents the account entry flows in a cute personal-site style and lets the site owner customize the page background image, mascot image, and theme preset per browser.
- `postgres-register-persistence`: Persists new account rows and account JSON columns on PostgreSQL by binding `jsonb` parameters with the database-correct JDBC type.

### Modified Capabilities

None.

## Impact

- Frontend: `fronted/vue3-merged/src/pages/AuthPage.vue`, `fronted/vue3-merged/src/mobile/pages/MobileAuthPage.vue`.
- Backend: `model/entity/src/main/java/io/github/shizuki/site/user/entity/UserAccountEntity.java` (imports the existing `JsonStringTypeHandler` already used by `USR_PREFERENCE` and weather snapshots).
- No API contract changes; no new database migrations; no credential or security changes.
