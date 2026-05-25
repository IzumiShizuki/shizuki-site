# `monolith/db/migration/` — MySQL legacy archive

**Loaded only by the `application-mysql.yml` profile.** This directory holds
the historical Flyway scripts from the MySQL era. The current PostgreSQL
deployment uses the sibling `migration-pg/` directory; scripts here are not
loaded by Flyway in the default profile.

## Disposition policy

Per spec `backend-refactor-review` rule R6.4 (**published version numbers
must not be rewritten**), this directory is left **as-is**:

- Existing `V_xxx__*.sql` files are not deleted (history preservation +
  potential MySQL rollback path).
- No new `V_xxx` should be appended here (PG deployments must only append to
  `migration-pg/`).
- Eventual full retirement of the MySQL track should land in a dedicated PR
  that also drops `application-mysql.yml` and the README/CLAUDE.md mentions.

## Relationship to the four module-level migration trees

See [`../migration-pg/README.md`](../migration-pg/README.md) for the
disposition of `modules/<x>-module/src/main/resources/db/migration/`.
