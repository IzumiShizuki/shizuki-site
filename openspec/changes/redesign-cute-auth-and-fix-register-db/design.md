## Context

See `proposal.md` for motivation. The current entry page is a dark glass card in the site-wide "liquid material" style with a two-column hero/form layout. It works, but it looks like a generic admin portal rather than the personal character the rest of the site tries to project. Separately, account registration inserts `groups_json` and `permissions_json` through MyBatis-Plus as plain strings; on PostgreSQL these columns are `jsonb`, and the database rejects the implicit `varchar → jsonb` coercion. The project already ships `JsonStringTypeHandler` (`model/entity/.../common/mybatis/JsonStringTypeHandler.java`) that binds JSON strings with `Types.OTHER` on PostgreSQL, and `UserPreferenceEntity` already uses it, so the account entity fix is a small, consistent change.

## Goals / Non-Goals

**Goals:**

- Registration and any other `USR_ACCOUNT` insert/update succeed on the production PostgreSQL runtime without changing the stored JSON shape.
- The login / register / forgot-password / OAuth / captcha behavior and API contract stay identical.
- The entry page reads as a cute, kawaii personal site page (pastel palette, rounded shapes, floating decorations, a friendly mascot) on both desktop and mobile shells.
- The owner can pick a theme preset and set their own anime background and mascot images; the choice persists across visits in the same browser.

**Non-Goals:**

- Changing the authentication API contract, the verification-code flow, or any database migration.
- Site-wide persistence of the owner's theme for all visitors (no new backend setting/API in this change; customization is per-browser `localStorage`).
- Redesigning the global top menu or other site pages.

## Decisions

### 1. Fix the account JSON columns with the existing shared type handler

`groupsJson` and `permissionsJson` get `@TableField(value = "...", typeHandler = JsonStringTypeHandler.class, jdbcType = JdbcType.OTHER)`, matching `UserPreferenceEntity.preferenceJson`. The handler keeps writing plain strings on non-PostgreSQL databases, so MySQL-compatible paths are unaffected. This fixes every write path through the entity (registration insert, OAuth account creation, account updates) at once instead of patching individual SQL statements.

### 2. Own the page presentation inside the route component

The cute design is implemented entirely in the scoped styles of `AuthPage.vue` and `MobileAuthPage.vue` (plus a small local theme-state block) so no global layout or shell changes are needed. The page keeps its own full-bleed background inside the route content, with a z-indexed card so the existing app background and top menu continue to work underneath.

### 3. CSS-only default mascot, user images on top

Without a configured mascot image the hero shows a small CSS-drawn cat blob (rounded body, ears, closed happy eyes, blush, whiskers, mouth) that bobs gently — zero external assets. When the owner supplies an image, it replaces the blob inside the same rounded frame, so the page looks complete out of the box and personal after customization.

### 4. Per-browser customization with presets plus URL/upload

Theme state is a small JSON object under `shizuki.authTheme.v1` in `localStorage`: `{ preset, bgImage, mascotImage }`. Six pastel presets (strawberry, blueberry, peach, matcha, mint, galaxy) set the page gradient and accent color via CSS custom properties; a `theme-dark` variant switches text colors for the dark galaxy preset. Background and mascot accept a pasted URL or a local file; uploads are downscaled on a canvas (background ≤1600px, mascot ≤640px, JPEG) so they stay inside `localStorage` size limits. Both desktop and mobile entry pages read the same key, so the mascot carries across shells.

## Risks / Trade-offs

- [Uploaded images can exceed localStorage quota] → Downscale on canvas and cap dimensions; on quota failure keep the in-memory theme and skip persistence rather than crashing the page.
- [A busy background image harms contrast] → The image layer sits under a light overlay and the card keeps `backdrop-filter`, preserving text readability in both light and dark presets.
- [Type handler changes generated SQL binding only] → Existing stored rows and the `jsonb` column type are untouched; raw-SQL updates that already use `::jsonb` casts (e.g., group removal) keep working.
- [Customization is per-browser, not site-wide] → Accepted deliberately: no new backend surface; noted in the panel copy and in this change's non-goals.

## Migration Plan

1. Add the type handler annotation to the account entity (done in this change; verified by backend compile and existing registration tests).
2. Rewrite `AuthPage.vue` presentation and add the theme/customization block; restyle `MobileAuthPage.vue` to match.
3. Verify with a production `vite build`, targeted frontend unit tests, backend module compile + registration tests, and a local browser render of `/auth`.
4. Run strict OpenSpec validation and create a scoped local commit.

Rollback is a frontend-only revert for the UI and a one-annotation revert for the entity; no stored data or migration is involved.
