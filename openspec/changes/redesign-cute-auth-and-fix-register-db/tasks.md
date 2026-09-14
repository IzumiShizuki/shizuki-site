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

## 4. Verification and Delivery

- [x] 4.1 Run production frontend build and targeted auth unit tests.
- [x] 4.2 Render `/auth` (login + register modes) in a local browser and confirm the DOM structure of the mascot, tabs, form, and customization markup.
- [x] 4.3 Run strict OpenSpec validation, inspect Git status, and create a scoped local commit.
