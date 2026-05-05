# PostgreSQL Cutover Runbook (MySQL -> PostgreSQL 16)

## 0. Preconditions
- Source MySQL and target PostgreSQL are both reachable from the same server.
- PostgreSQL target database (`shizuki_app`) is created and credentials are ready.
- Application version already contains PostgreSQL-compatible code and config.
- Planned maintenance window: 30-90 minutes.

## 1. Freeze and backup
1. Stop write traffic (maintenance mode / API gateway deny write methods).
2. Backup MySQL (hard gate):

```bash
MYSQL_HOST=<host> MYSQL_PORT=3306 MYSQL_DB=shizuki_app MYSQL_USER=<user> MYSQL_PASSWORD=<password> \
PG_HOST=<host> PG_PORT=5432 PG_DB=shizuki_app PG_USER=<user> PG_PASSWORD=<password> \
./scripts/migrate_mysql_to_postgres.sh
```

- This script performs a logical MySQL dump first, then runs pgloader.

## 2. Apply PostgreSQL runtime patch
Start backend with PostgreSQL profile/config so Flyway executes `monolith/db/migration-pg`.

- Default config already points Flyway to `classpath:monolith/db/migration-pg`.
- `application-mysql.yml` is kept as migration-time reference config; this branch runtime is PostgreSQL-first.

## 3. Data consistency verification

```bash
MYSQL_HOST=<host> MYSQL_PORT=3306 MYSQL_DB=shizuki_app MYSQL_USER=<user> MYSQL_PASSWORD=<password> \
PG_HOST=<host> PG_PORT=5432 PG_DB=shizuki_app PG_USER=<user> PG_PASSWORD=<password> \
./scripts/verify_mysql_postgres_consistency.sh
```

Pass criteria:
- All table row counts match.
- Backend smoke checks pass: login, group management, blog list/detail, music core APIs.

## 4. Cutover
1. Update runtime env:
   - `DB_URL=jdbc:postgresql://<pg-host>:5432/shizuki_app`
   - `DB_USERNAME=<pg-user>`
   - `DB_PASSWORD=<pg-password>`
2. Restart backend.
3. Run smoke tests again.

## 5. Rollback rule
- If critical smoke check fails and cannot be fixed within the maintenance window:
  1. restore the previous MySQL-based release package/image,
  2. restore MySQL runtime env (`DB_URL`/`DB_USERNAME`/`DB_PASSWORD`) from pre-cutover backup,
  3. restart backend on the restored release,
  4. keep PostgreSQL state for post-mortem.

## 6. MySQL decommission (as requested)
After cutover passes and acceptance is completed:
1. keep offline backup files,
2. stop MySQL service,
3. disable MySQL startup.
