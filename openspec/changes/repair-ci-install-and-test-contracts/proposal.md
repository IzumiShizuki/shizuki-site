## Why

GitHub CI #201 and #202 fail before frontend tests because pnpm 11 rejects the undeclared `@parcel/watcher` install script. Backend tests also stop at an outdated moment-entity mapping assertion, leaving later modules unchecked. Frontend failures currently retain no command logs or stage summary.

## What Changes

- Declare the build-script policy for the existing watcher dependency while preserving frozen dependency resolution and strict checks for unreviewed packages.
- Update the exact moment-entity mapping contract to include the author column already used by the entity and migrations.
- Align stale wallpaper preview fixtures with the existing authorized-access and private no-store response contracts.
- Fix an ambiguous Spring controller constructor exposed by full monolith verification, with a real container-wiring regression test.
- Retain frontend installation, test, and build logs on failure, show stage outcomes in GitHub summaries, and preserve failing job conclusions.
- Extend focused CI regression coverage and run complete frontend/backend verification to uncover failures previously hidden behind the early exits.

## Capabilities

### New Capabilities

- `ci-reliability`: Deterministic dependency approval, current entity contracts, and actionable frontend/backend verification reports.

### Modified Capabilities

None.

## Impact

Affected areas are `.github/workflows/ci.yml`, frontend workspace policy and CI contract tests, backend tests found stale by the full reactor, and constructor injection for the existing AstrBot bridge controller. Feature/API contracts, dependency versions, and server configuration remain unchanged. Delivery includes local commits; GitHub verification after publication requires explicit push authorization.
