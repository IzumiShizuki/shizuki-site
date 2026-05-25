# `modules/` - domain modules of the modular monolith

The four Maven modules here (`user-module`, `content-module`, `media-module`,
`ai-module`) are assembled into a single jar by `apps/monolith-app`. See the
top-level [`CLAUDE.md`](../CLAUDE.md) for the architecture overview.

## Flyway migration scripts

Each module ships a `src/main/resources/db/migration/` directory, **but
these are not loaded by the active PG deployment**. The active Flyway
location is configured in `apps/monolith-app/src/main/resources/application.yml`
as `classpath:monolith/db/migration-pg` - see
[`monolith/db/migration-pg/README.md`](../apps/monolith-app/src/main/resources/monolith/db/migration-pg/README.md)
for details.

The module-level scripts are reserved for a possible future microservice
split: when a domain extracts into its own deployable, that microservice
will ship its own Flyway with its own `db/migration/` location and migrate
the relevant tables there.

## Cross-module boundary rule

Per spec `backend-refactor-review` (boundary refactor):

- `modules/<x>-module` modules **must not** declare compile-time dependencies
  on each other. Any cross-domain access goes through a port interface
  declared in `libs/common-integration` (e.g. `UserServicePort`).
- `modules/user-module` provides the implementation through
  `UserServicePortAdapter`. In monolith mode this is a zero-overhead pass-
  through; in a future microservice split it can be swapped for an HTTP /
  gRPC client without touching call sites.
