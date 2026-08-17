## Why

The production Freesound provider is configured and the upstream search returns matching audio, but the site maps the response to an empty result list. Users therefore cannot discover or add online ambient sounds even though the provider is available.

## What Changes

- Reproduce the production Freesound search payload in a backend regression test.
- Correct the server-side mapping so allowed Freesound results with an MP3 preview are returned to the atmosphere panel.
- Verify the deployed public search endpoint returns at least one usable result after the backend rollout.

## Capabilities

### New Capabilities

- `online-ambient-search-results`: Return usable Freesound search results to the website when the configured provider supplies allowed ambient audio.

### Modified Capabilities

None.

## Impact

- `FreesoundProvider` search-result normalization and its backend tests.
- The public ambient-library search endpoint and the atmosphere panel's online result list.
- Production backend deployment verification; no client credential or API contract change.
