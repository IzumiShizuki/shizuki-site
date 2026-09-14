## Purpose

Persist account rows and account JSON columns on the PostgreSQL runtime by binding `jsonb` parameters with the database-correct JDBC type, so email registration and account updates succeed instead of failing with a `jsonb`/`character varying` type error.

## ADDED Requirements

### Requirement: Account JSON columns write on PostgreSQL
`USR_ACCOUNT.groups_json` and `USR_ACCOUNT.permissions_json` SHALL be written through a JSON-aware parameter binding that uses `Types.OTHER` on PostgreSQL and plain string binding elsewhere, matching the existing `JsonStringTypeHandler` contract.

#### Scenario: Email registration inserts an account
- **WHEN** a user registers with a valid email verification code
- **THEN** the account SHALL be inserted with its `groups_json` and `permissions_json` values persisted without a PostgreSQL `jsonb` type error, and a token pair SHALL be issued

#### Scenario: Account updates rewrite the same columns
- **WHEN** an account update writes `groups_json` or `permissions_json`
- **THEN** the update SHALL succeed with the same JSON-aware binding on PostgreSQL

### Requirement: Non-PostgreSQL binding stays a plain string
The JSON-aware handler MUST keep writing ordinary string parameters on non-PostgreSQL databases so MySQL-compatible deployments are unaffected.

#### Scenario: The handler binds on a non-PostgreSQL database
- **WHEN** the same account insert runs against a non-PostgreSQL database
- **THEN** the handler SHALL bind the JSON text as a plain string parameter instead of `Types.OTHER`
