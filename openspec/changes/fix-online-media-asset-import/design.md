## Context

See `proposal.md` for motivation. `MDA_ASSET.home_enabled_flag` is defined as a numeric tiny-integer flag and is materialized as PostgreSQL `smallint` in production. `MediaAssetEntity` currently exposes it as `Boolean`, causing MyBatis to bind `false` as a PostgreSQL boolean during inserts. Asset creation is shared by ambient sound, wallpaper, and generic upload flows.

## Goals / Non-Goals

**Goals:**

- Keep the Java persistence model aligned with the existing numeric schema on both PostgreSQL and MySQL.
- Cover creation, administrative updates, bootstrap writes, response conversion, and home-pool filtering.
- Add a regression test at the service seam that captures the value sent to the mapper.

**Non-Goals:**

- Change the HTTP request or response contract.
- Alter the production table type or rewrite historical rows.
- Redesign the broader asset visibility and audit model.

## Decisions

### Represent the persisted flag as `Integer`

Use `0` and `1` in `MediaAssetEntity` and translate to or from booleans only at API/service boundaries. This matches the existing schema and other numeric code fields. A custom MyBatis boolean type handler was considered, but it adds mapping configuration and can still be bypassed by generated query-wrapper parameters.

### Test the mapper boundary through `MediaServiceImpl`

Exercise the same `createAsset` path used after online uploads and capture the `MediaAssetEntity` passed to `MediaAssetMapper.insert`. The regression assertion requires `homeEnabledFlag == 0`, which fails to compile or fails behaviorally if the field returns to boolean binding.

### Deploy code without a schema migration

Existing rows already contain valid `0`/`1` values and the production column type is correct for the repository's migration contract. Rebuilding the backend is sufficient.

## Risks / Trade-offs

- [Risk] A missed boolean call site could fail compilation or retain an incompatible query value. → Mitigation: update every `homeEnabledFlag` reference and run module plus monolith tests.
- [Risk] The uploaded object from a failed import remains in object storage. → Mitigation: this change restores metadata persistence; orphan cleanup is a separate lifecycle concern and is not expanded here.

## Migration Plan

1. Build and test the media module and monolith application.
2. Deploy a rebuilt backend image to the personal site server.
3. Run a minimal authenticated online import and confirm the asset insert succeeds.
4. Roll back to the previous image if startup or import verification fails; no database rollback is needed.
