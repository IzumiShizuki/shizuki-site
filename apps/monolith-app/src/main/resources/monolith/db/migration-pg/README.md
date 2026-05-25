# `monolith/db/migration-pg/` - PostgreSQL active assembly migrations

**Currently active for production deployments** via
`spring.flyway.locations: classpath:monolith/db/migration-pg` in
`application.yml`.

## Active vs inactive Flyway paths

| Path | Role | State |
| --- | --- | --- |
| `apps/monolith-app/.../monolith/db/migration-pg/` | PG assembly baseline | **active** - loaded under default profile |
| `apps/monolith-app/.../monolith/db/migration/` | MySQL legacy archive | **inactive** - only `application-mysql.yml` profile |
| `modules/<x>-module/.../db/migration/` | per-domain reserved scripts | **inactive** - not on Flyway location list |

## Why module-level scripts do not collide with PG deployment

`spring.flyway.locations` lists `migration-pg/` only. Spring Boot does not
auto-scan other `db/migration` directories on the classpath, so each module
script tree is **dormant** at runtime - no execution, no collision.

The two HIGH schema findings from spec `backend-refactor-review`:

- `0a954a7447b5` - `aud_event_outbox` / `aud_log` declared via
  `CREATE TABLE IF NOT EXISTS` across all four domain modules.
- `30aadfb0c625` - Flyway dual-track (legacy MySQL `migration/` + active
  PG `migration-pg/` + dormant `modules/*/db/migration/`).

...are **not runtime hazards** under the current PG architecture, because:

1. PG deployment loads `migration-pg/` only.
2. `aud_log` / `aud_event_outbox` have **zero Java references** in this
   codebase - auditing actually flows through `@AuditLog` annotations to
   SLF4J / Kafka, not into a relational table.
3. The `aud_*` DDL in module scripts uses MySQL syntax
   (`AUTO_INCREMENT` / `TINYINT(1)` / `JSON`) and would not run on PG even
   if loaded - corroborating that those scripts are historical reservations.

See spec `backend-refactor-review` `report.md` Appendix G for the full
trace.

## Adding a new V_xxx

- Append only - file name `V<n>__<snake_case_description>.sql`, `n >= 1003`.
- PostgreSQL dialect with idempotent guards (`CREATE TABLE IF NOT EXISTS` /
  `DO $$ BEGIN ... END $$`).
- **Never** rewrite a published `V_xxx`.
- Migrations that supersede DDL from `modules/<x>/db/migration/V_xxx` should
  list, in the file header, which legacy versions they replace.
