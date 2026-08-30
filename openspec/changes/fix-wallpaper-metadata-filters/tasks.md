## 1. Regression Coverage

- [x] 1.1 Add a current Steam Workshop card fixture that reproduces blank titles and previews
- [x] 1.2 Add backend tests for Workshop tag normalization and Wallhaven purity/order normalization
- [x] 1.3 Add frontend tests for complete filter transmission and enriched metadata rendering

## 2. Backend Catalog Repair

- [ ] 2.1 Parse current and legacy Workshop title/preview markup with deterministic fallback titles
- [ ] 2.2 Add allowlisted Workshop tag filters to controller, service, Steam API, and scrape paths
- [ ] 2.3 Preserve Wallhaven sketchy purity for guest requests, add order support, and return richer metadata
- [ ] 2.4 Keep Workshop detail fallback metadata usable with the current upstream markup

## 3. Frontend Discovery Controls

- [ ] 3.1 Add compact Workshop type, genre, and resolution controls while preserving current styling
- [ ] 3.2 Add Wallhaven purity, ratio, and order controls and reset behavior
- [ ] 3.3 Replace unnamed result presentation with source-aware fallback labels and concise metadata

## 4. Verification

- [ ] 4.1 Run focused backend and frontend regression tests
- [ ] 4.2 Run the media-module test suite and production frontend/backend builds
- [ ] 4.3 Start the local application and verify filters, titles, previews, pagination, and import events
- [ ] 4.4 Validate OpenSpec, review for secrets/unrelated files, deploy, and verify production discovery responses
