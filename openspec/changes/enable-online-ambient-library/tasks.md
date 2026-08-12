## 1. Regression Baseline

- [x] 1.1 Add a frontend regression test that proves the application shell exposes provider availability, accepts the online tab, and handles an import result.
- [x] 1.2 Add backend tests for Freesound sound resolution, URL/license validation, idempotent import, bounded download, and controller authentication contract.

## 2. Backend Import Pipeline

- [x] 2.1 Add validated import request/response contracts and extend the Freesound provider to resolve current sound metadata by identifier.
- [x] 2.2 Implement an ambient-library service that finds existing source assets, downloads an allowed Freesound MP3 preview within limits, stores a private audio object, persists attribution metadata, and cleans up partial failures.
- [x] 2.3 Add a rate-limited authenticated import endpoint while preserving public status/search routing and structured upstream errors.

## 3. Frontend Online Library

- [x] 3.1 Extend the ambient-library API client with normalized provider status and authenticated import support.
- [x] 3.2 Wire provider status, the online tab, authentication state, import progress, success/error feedback, and imported asset activation through the application shell.
- [x] 3.3 Update the online result UI to keep the entry discoverable when disabled, distinguish preview from durable save, prevent duplicate/pending imports, and prompt guests to sign in.

## 4. Verification and Operations

- [x] 4.1 Run focused frontend and backend tests plus the frontend production build and monolith compile/package checks.
- [x] 4.2 Validate the OpenSpec change strictly and verify implementation coverage against proposal, spec, and design.
- [x] 4.3 Document the required `MUSIC_FREESOUND_API_KEY` deployment setting without committing a credential.
