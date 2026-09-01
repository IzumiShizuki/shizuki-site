## Why

The production authentication API can complete successfully while a browser abandons the request at the frontend's fixed five-second deadline, leaving the user on the login form with a misleading timeout. Production evidence on 2026-09-02 showed two successful token issuances with no subsequent `/api/v1/me` request, so the client needs a deadline that tolerates ordinary network tail latency without masking genuine failures indefinitely.

## What Changes

- Give interactive authentication and session-bootstrap requests a bounded but more tolerant timeout budget.
- Keep timeout failures explicit and preserve the existing single-submit UI guard so users do not accidentally issue overlapping login attempts.
- Add regression coverage that distinguishes the authentication timeout budget from the lower-level HTTP timeout mechanism.

## Capabilities

### New Capabilities

- `resilient-auth-client`: Defines bounded authentication request behavior that tolerates normal production network tail latency and still reports genuine timeouts.

### Modified Capabilities

None.

## Impact

- Frontend authentication service configuration and tests under `fronted/vue3-merged/src/services`.
- Email login, refresh-token recovery, current-user bootstrap, OAuth initiation/exchange, and other requests sharing the authentication client timeout.
- No API contract, database, credential, or server-side authentication changes.
