## Context

See `proposal.md` for motivation. Diagnosis reproduced the exact Obsidian error with a fake login: `https://shizuki.site` has no DNS record and yields `net::ERR_CONNECTION_CLOSED`. Changing only the in-memory origin to `https://site.shizuki.online` reaches the API. A second probe showed camelCase `grantType` is rejected while snake_case `grant_type` reaches credential validation, matching the maintained frontend's `toSnakeCaseDeep` request boundary.

## Goals / Non-Goals

**Goals:**

- Align the plugin with the current production origin and JSON naming contract.
- Migrate only the known obsolete default, preserving intentional self-hosted/custom origins.
- Make future connection errors identify the configured origin.
- Cover the shared serialization boundary so login, refresh, posts, and assets cannot drift independently.

**Non-Goals:**

- Changing the server, DNS zone, TLS configuration, or website frontend.
- Logging in with user credentials or publishing during automated verification.
- Converting multipart field names or arbitrary pre-serialized/binary request bodies.

## Decisions

### Convert plain JSON bodies at the API client boundary

Use the same recursive camelCase-to-snake_case algorithm as the maintained frontend immediately before `JSON.stringify`. This single seam covers authentication and every publisher JSON request. Per-call manual mappings were rejected because they are easy to omit when adding endpoints and had already caused drift.

### Treat only plain objects and arrays as JSON structures

The converter recurses through arrays and plain objects, leaving strings, `ArrayBuffer`, typed arrays, and other values unchanged. Existing multipart and direct-upload code therefore retains its exact wire representation.

### Migrate the obsolete origin during settings load

Update the default constant and replace only a normalized exact match for `https://shizuki.site`. Persist the migrated safe settings immediately so subsequent starts and the installed `data.json` agree. Any other explicit HTTP(S) origin remains user-controlled.

### Wrap request transport exceptions separately from HTTP errors

Catch exceptions thrown by the underlying request call and raise a message that includes the normalized origin. Keep existing `ApiError` handling for returned statuses so validation and authentication errors remain precise.

## Risks / Trade-offs

- [Some future API might intentionally require camelCase] → The site-wide HTTP client already defines snake_case as the production contract; such an endpoint should be treated as an API inconsistency.
- [Network verification could become flaky] → Assert only DNS/transport reachability and acceptance of any HTTP response, with a short timeout and no credentials.
- [A custom installation may use the old hostname intentionally] → Migration is deliberately limited to the known non-resolving exact default; users can set a custom origin again in settings.

## Migration Plan

1. Add a red regression test for request casing and the canonical default.
2. Implement shared serialization, origin migration, and transport error wrapping.
3. Build and deploy version 0.2.1 to the Vault, preserving all unrelated data.
4. Run a fake-credential probe that must receive an HTTP application response rather than a network error.
5. Roll back by restoring the prior plugin commit if production behavior diverges; no user credentials or notes are migrated.
