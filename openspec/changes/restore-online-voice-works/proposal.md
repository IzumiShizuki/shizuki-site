## Why

The production server cannot reach any configured ASMR upstream directly, so authenticated voice-work requests fail and the frontend shows an empty library even though the upstream still contains matching works. The server already has an authenticated outbound proxy that can reach those upstreams and should be usable without exposing its credentials in source control.

## What Changes

- Add optional, ASMR-scoped outbound proxy configuration with authenticated HTTP CONNECT support.
- Route ASMR metadata, track, stream-resolution, and lyric HTTP clients through the configured proxy while preserving direct access when no proxy is configured.
- Keep proxy credentials in private deployment configuration and prevent them from appearing in API responses or logs.
- Ensure the PostgreSQL runtime migration grants `music.asmr.access` to both FRIEND and ADMIN accounts.
- Add regression tests for proxy parsing and client selection, then verify the production voice-work API after deployment.

## Capabilities

### New Capabilities

- `asmr-upstream-connectivity`: Configure secure direct-or-proxied access for all ASMR upstream requests and preserve failover behavior.

### Modified Capabilities

None.

## Impact

- Backend configuration under `shizuki.music.asmr` and the production `.env.server` file.
- `AsmrMusicProvider` HTTP client construction and ASMR-only outbound requests.
- Media-module tests, a PostgreSQL permission-data migration, and the monolith deployment image.
- No public API contract or database schema changes.
