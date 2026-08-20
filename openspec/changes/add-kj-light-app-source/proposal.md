## Why

The light-app center currently exposes only bundled applications and user-defined URL links, so users cannot discover or run community tools published by KJ OS. KJ's public application-community API is usable only from its own origin, which requires a bounded server-side integration rather than a direct browser request.

## What Changes

- Add a bundled `KJ Tool Source` light app that browses, searches, filters, and refreshes the public application catalog behind `https://kj.sgguo.com/`.
- Add guest-accessible, read-only backend endpoints that fetch the KJ catalog and a selected tool detail from the fixed KJ application-community API.
- Normalize upstream records and identify which KJ application types can run in Shizuki without exposing an arbitrary URL proxy.
- Let users acquire and open compatible KJ code, widget, or website tools inside an isolated sandboxed frame, with a clear third-party-content warning and an external-open fallback for website tools.
- Preserve existing bundled light apps when the KJ source is disabled, unreachable, malformed, or returns an unsupported tool type.

## Capabilities

### New Capabilities

- `kj-light-app-source`: Discover compatible community tools from the KJ application source and open a selected tool inside the Shizuki light-app shell with bounded proxying and browser isolation.

### Modified Capabilities

None.

## Impact

- Frontend light-app catalog, page/window component routing, the new KJ source component, API client normalization, and Vitest coverage.
- Content-module controller, fixed-upstream integration service, configuration, response contracts, and JUnit coverage.
- Monolith guest-path and KJ-source runtime configuration.
- No database migration and no new third-party dependency are required; the feature remains read-only toward KJ and can be disabled independently.
