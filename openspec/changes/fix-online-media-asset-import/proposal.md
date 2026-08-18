## Why

Production media imports fail after object upload because PostgreSQL stores `MDA_ASSET.home_enabled_flag` as a numeric `smallint` while the Java entity binds a boolean value. The shared asset persistence path must use the schema's numeric flag representation so ambient sound and wallpaper imports can complete online.

## What Changes

- Align the media asset home-enabled field with the database's numeric `0`/`1` flag representation.
- Update all media asset creation, administration, bootstrap, and public-home queries to use the numeric representation consistently.
- Add regression coverage for the asset creation path used by online imports.
- Rebuild and deploy the backend, then verify the production import endpoint no longer emits the PostgreSQL type error.

## Capabilities

### New Capabilities

- `media-asset-import-persistence`: Media imports persist asset metadata using database-compatible flag values across PostgreSQL and MySQL deployments.

### Modified Capabilities

None.

## Impact

- Affects `MediaAssetEntity` and services that read or write `home_enabled_flag`.
- Affects ambient sound, wallpaper, and generic media imports because they share `MDA_ASSET` persistence.
- No HTTP API contract or database schema change is required.
