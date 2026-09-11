## 1. Regression Coverage

- [x] 1.1 Add a current Steam Workshop card fixture that reproduces blank titles and previews
- [x] 1.2 Add backend tests for Workshop tag normalization and Wallhaven purity/order normalization
- [x] 1.3 Add frontend tests for complete filter transmission and enriched metadata rendering
- [x] 1.4 Add frontend regression tests for age-rating checkboxes, expanded-option contrast, accent-aware menu glass, and import progress states

## 2. Backend Catalog Repair

- [x] 2.1 Parse current and legacy Workshop title/preview markup with deterministic fallback titles
- [x] 2.2 Add allowlisted Workshop tag filters to controller, service, Steam API, and scrape paths
- [x] 2.3 Preserve Wallhaven sketchy purity for guest requests, add order support, and return richer metadata
- [x] 2.4 Keep Workshop detail fallback metadata usable with the current upstream markup

## 3. Frontend Discovery Controls

- [x] 3.1 Add compact Workshop type, genre, and resolution controls while preserving current styling
- [x] 3.2 Add Wallhaven purity, ratio, and order controls and reset behavior
- [x] 3.3 Replace unnamed result presentation with source-aware fallback labels and concise metadata
- [x] 3.4 Replace the Wallhaven purity select with labeled safe/sketchy checkboxes and keep at least one safe rating selected
- [x] 3.5 Give native wallpaper select options an explicit theme surface and make the top menu glass accent-aware
- [x] 3.6 Surface discovery-import progress, automatically poll non-terminal jobs, and stop polling at terminal states

## 4. Verification

- [x] 4.1 Run focused backend and frontend regression tests
- [x] 4.2 Run the media-module test suite and production frontend/backend builds
- [x] 4.3 Start the local application and verify filters, titles, previews, pagination, and import events
- [ ] 4.4 Validate OpenSpec, review for secrets/unrelated files, deploy, and verify production discovery responses
