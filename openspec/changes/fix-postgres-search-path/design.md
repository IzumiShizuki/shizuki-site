## Context

The production database contains two relevant schemas. The complete application schema is `shizuki_app`, while the backend's JDBC URL omits a PostgreSQL `currentSchema` parameter and therefore uses the default `public` search path. Flyway history and application tables are present in `shizuki_app`; the reported failures are caused by schema resolution, not missing data.

## Goals / Non-Goals

**Goals:**

- Select `shizuki_app` in the default PostgreSQL JDBC URL used by the monolith.
- Keep explicit `DB_URL` overrides possible.
- Verify representative content, light-app, and media tables after restart.

**Non-Goals:**

- No table recreation, data copy, or destructive database repair.
- No changes to mapper SQL or table naming.
- No change to the PostgreSQL migration history.

## Decisions

Use the PostgreSQL JDBC `currentSchema` connection parameter in the shared monolith default URL with `shizuki_app,public` as the ordered search path. This keeps existing unqualified MyBatis SQL valid, prefers the complete application schema, and preserves access to legacy PostgreSQL tables such as `public.usr_daily_art`. Setting `search_path` through an init SQL hook was rejected because it would be easier to bypass in alternate datasource creation paths and would not fix the deployment environment itself. Creating compatibility views in `public` was rejected because it would duplicate schema ownership and obscure future migrations.

Update the remote `.env.server` `DB_URL` to include `?currentSchema=shizuki_app` and restart only the backend. The existing application and database snapshot remains available for rollback.

## Risks / Trade-offs

- [Risk] A custom operator-supplied `DB_URL` may omit `currentSchema` → Keep the application default correct and include the requirement in deployment verification.
- [Risk] A future schema rename would require configuration changes → Use the explicit `currentSchema` value as the single documented production contract.

## Migration Plan

1. Update the repository default PostgreSQL URL.
2. Back up the current remote `.env.server` and update only `DB_URL`.
3. Recreate the backend container without rebuilding unrelated services.
4. Verify Flyway startup, API health, and representative table queries through the backend.
5. Roll back the environment file and restart the backend if any gate fails.
