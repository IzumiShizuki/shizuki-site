## Why

The production PostgreSQL database stores the application tables in the `shizuki_app` schema, while the deployed backend connects without selecting that schema and therefore resolves queries against `public`. This causes widespread `relation does not exist` errors after deployment even though the tables and data are present.

## What Changes

- Make the PostgreSQL application connection select the `shizuki_app` schema explicitly.
- Preserve an operator override through `DB_URL` while ensuring the default connection is safe for the production schema.
- Add deployment and regression checks that verify representative tables resolve from the selected schema.

## Capabilities

### New Capabilities

- `postgres-schema-routing`: The monolith PostgreSQL datasource consistently resolves application tables from the configured application schema.

### Modified Capabilities

None.

## Impact

- `resouces/yaml/monolith.yaml` and the monolith Spring datasource defaults.
- Deployment environment configuration on `111.228.35.186`.
- Backend restart and database connectivity verification; no data migration is required because the existing tables are intact.
