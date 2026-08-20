## 1. Backend Source Integration

- [x] 1.1 Add configurable KJ source properties, fixed read-only upstream client, response normalization, validation, size bounds, and short-lived caching.
- [x] 1.2 Expose guest catalog and tool-detail endpoints with stable problem responses, and add the monolith guest-path/runtime defaults.
- [x] 1.3 Add JUnit coverage for supported/unsupported normalization, invalid identifiers, disabled mode, malformed responses, cache behavior, and controller contracts.

## 2. Frontend Acquisition Flow

- [x] 2.1 Add the KJ source API client, payload normalization, friendly errors, safe external-URL validation, and sandbox-document composition.
- [x] 2.2 Build the KJ Tool Source window with loading/error/empty states, local search and category filtering, compatibility labels, detail acquisition, sandbox preview, third-party warning, refresh, and external-open fallback.
- [x] 2.3 Register `kj-tool-source` in the light-app catalog, floating-window host, and page-mode component map without changing existing app behavior.
- [x] 2.4 Add Vitest coverage for API normalization, document isolation markup, URL validation, fetching, and light-app registration.

## 3. Verification

- [x] 3.1 Run focused backend and frontend tests, the frontend production build, and OpenSpec strict validation; fix regressions and document any environment-only verification limits.

## Verification Notes

- The public KJ catalog and one compatible detail payload were sampled through a read-only PowerShell request because the `agent-browser` CLI is not available in this environment.
- The repository's `bd` executable is not installed or on `PATH`, so `bd onboard` and `bd sync` could not be run in this session.
