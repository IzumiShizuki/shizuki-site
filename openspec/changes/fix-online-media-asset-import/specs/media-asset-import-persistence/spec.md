## Purpose

Ensure every media import can persist shared asset metadata with flag values that remain compatible across supported PostgreSQL and MySQL deployments.

## ADDED Requirements

### Requirement: Imported asset flags are database-compatible

The system SHALL persist binary media-asset flags using the database schema's numeric `0` and `1` representation, and SHALL interpret those values consistently when reading or filtering assets.

#### Scenario: Ambient sound import persists an asset

- **WHEN** an authenticated user imports an ambient sound whose uploaded object passes validation
- **THEN** the system creates the media asset record without a database type mismatch

#### Scenario: Wallpaper import persists an asset

- **WHEN** an authenticated user imports a wallpaper through a package or online source
- **THEN** the shared media asset record is created with a disabled home flag represented as numeric `0`

#### Scenario: Administrator enables a home asset

- **WHEN** an administrator enables an approved public asset for the home pool
- **THEN** the system persists numeric `1` and includes the asset in home-pool queries
