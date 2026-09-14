## 1. Registration Database Fix

- [x] 1.1 Bind `groups_json` and `permissions_json` with `JsonStringTypeHandler` on `UserAccountEntity`.
- [x] 1.2 Confirm no other json/jsonb columns are written without a JSON type handler (production `information_schema` check; outbox uses `CAST(? AS JSON)`).
- [x] 1.3 Compile `site-model` and `user-service` offline and run registration controller/service tests.

## 2. Cute Entry Page (Desktop)

- [x] 2.1 Redesign `AuthPage.vue` with pastel gradient, floating decorations, mascot hero, pill tabs/buttons, and rounded inputs while keeping every form binding and flow intact.
- [x] 2.2 Add the customization panel: theme presets, background image (URL/upload/clear), mascot image (URL/upload/restore), reset, persisted under `shizuki.authTheme.v1`.
- [x] 2.3 Add dark-variant styling for the galaxy preset and responsive single-column layout.

## 3. Cute Entry Page (Mobile)

- [x] 3.1 Restyle `MobileAuthPage.vue` to match the cute presentation and honor the stored mascot image.

## 4. Site-Wide Login Appearance Config

- [x] 4.1 Add PG migration `V1013__login_appearance_config.sql` (table, seed row, ADMIN permission).
- [x] 4.2 Add entity, mapper (versioned update), request/response DTOs, service with optimistic versioning and URL validation.
- [x] 4.3 Add ADMIN controller (`/api/v1/admin/login-appearance`) and public controller (`/api/v1/site/login-appearance`); whitelist the public path.
- [x] 4.4 Add backend service unit tests (6 scenarios) and frontend API service tests (5 scenarios).
- [x] 4.5 Add admin console section in `AdminSiteWidgetsPanel.vue` (preset swatches + URL inputs + preview + save).
- [x] 4.6 Wire the auth entry page and mobile entry page to the public config (site config as default, browser local overrides win).

## 5. Verification and Delivery

- [x] 5.1 Run production frontend build and targeted auth unit tests.
- [x] 5.2 Render `/auth` (login + register modes) in a local browser and confirm the DOM structure of the mascot, tabs, form, and customization markup.
- [x] 5.3 Run strict OpenSpec validation, inspect Git status, and create a scoped local commit.
- [x] 5.4 Deploy backend and frontend to production and verify registration + the public login-appearance endpoint.
