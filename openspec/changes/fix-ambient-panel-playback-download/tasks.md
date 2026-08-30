## 1. Regression Feedback Loops

- [x] 1.1 Add a frontend regression test that detects incomplete dark-theme atmosphere-panel color coverage.
- [x] 1.2 Add frontend tests that reject bundled ambient defaults and prove two imported asset tracks can remain enabled concurrently.
- [x] 1.3 Add a backend regression test that reproduces the online sound download/import failure with a production-shaped provider response.

## 2. Atmosphere Panel Experience

- [x] 2.1 Introduce complete light/dark semantic panel tokens and replace unreadable hard-coded colors.
- [x] 2.2 Render imported online asset tracks as the main ambient catalog, with an online-discovery empty state instead of bundled defaults.
- [x] 2.3 Preserve independent enabled and volume state for multiple concurrent imported tracks and cover mixer orchestration with tests.

## 3. Reliable Online Import

- [x] 3.1 Correct the diagnosed provider download/import boundary while retaining redirect, host, content-type, and size validation.
- [x] 3.2 Keep per-result retry errors actionable and ensure duplicate imports reuse the existing private asset.

## 4. Verification and Delivery

- [x] 4.1 Run focused frontend and backend tests, production builds, and strict OpenSpec validation.
- [ ] 4.2 Verify dark-mode readability plus search, import, download, and two-track playback against the deployed site.
- [x] 4.3 Commit the completed change and merge it into the local main branch without pushing unless explicitly authorized.
