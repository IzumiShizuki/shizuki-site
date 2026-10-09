## MODIFIED Requirements

### Requirement: PostgreSQL datasource selects the application schema

The monolith PostgreSQL datasource MUST resolve unqualified application table names from the configured application schema, whose production value is `shizuki_app`.

#### Scenario: Default production connection

- **WHEN** the backend starts without an explicit `DB_URL`
- **THEN** the datasource connection selects `shizuki_app` as the PostgreSQL schema
- **AND** queries such as `SELECT ... FROM CTN_AUTHOR_PROFILE` resolve to `shizuki_app.ctn_author_profile`.

#### Scenario: Explicit connection override

- **WHEN** an operator supplies `DB_URL`
- **THEN** the application preserves that override
- **AND** the deployment configuration documents that the URL must select the intended application schema.

### Requirement: Schema routing does not mutate stored data

The fix MUST NOT recreate, drop, or copy application tables. Creating or seeding a dedicated Flyway metadata table is allowed because it contains migration bookkeeping only.

#### Scenario: Existing schema remains intact

- **WHEN** the backend restarts with the corrected datasource configuration
- **THEN** existing rows and Flyway history remain unchanged
- **AND** representative tables in `shizuki_app` are queryable.

### Requirement: Flyway metadata is isolated from the legacy migration history

The PostgreSQL runtime MUST use a dedicated Flyway metadata table so the PostgreSQL migration chain is not validated against the legacy 1–426 migration history.

#### Scenario: Existing production database

- **WHEN** the backend starts against the existing `shizuki_app` database
- **THEN** Flyway reads the dedicated PostgreSQL history table
- **AND** the legacy `shizuki_app.flyway_schema_history` rows do not block application startup.

#### Scenario: Fresh PostgreSQL database

- **WHEN** the backend starts against a database without the dedicated history table
- **THEN** Flyway creates that table and applies the PostgreSQL migration chain using the selected application schema.
