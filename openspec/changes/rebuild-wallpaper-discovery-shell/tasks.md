## 1. Preview delivery

- [x] 1.1 Add a bounded, rate-limited discovery preview endpoint for Workshop and Wallhaven items.
- [x] 1.2 Validate preview source hosts/content and preserve the existing upstream proxy configuration when fetching preview bytes.
- [x] 1.3 Add frontend preview URL construction and candidate normalization for same-origin, thumbnail, and full-image fallbacks.

## 2. Wallpaper workspace UI

- [x] 2.1 Rebuild `WallpaperDiscoveryPanel.vue` as a focused Wallpaper-style shell with title bar, source rail, search toolbar, result gallery, pagination, and inspector.
- [x] 2.2 Implement Workshop and Wallhaven source-specific filters while retaining the existing search/import event payloads.
- [x] 2.3 Implement resilient card and inspector preview states: skeleton, candidate fallback, error placeholder, retry, and accessible image labels.
- [x] 2.4 Implement selected-item inspection, Workshop download-channel status, visibility selection, source detail link, and import actions.

## 3. Picker integration

- [x] 3.1 Give the acquisition mode in `BackgroundPickerDialog.vue` the larger dark workspace treatment and keep local package/manual URL import controls reachable.
- [x] 3.2 Preserve library selection, route/global apply scope, import-job status, and owned-wallpaper settings behavior.
- [x] 3.3 Add responsive and keyboard-close behavior without changing the parent-owned side effects in `App.vue`.

## 4. Verification

- [x] 4.1 Update/add frontend component tests for source filters, preview fallback/retry, selection, and import payloads.
- [x] 4.2 Add backend unit coverage for preview source validation and bounded response handling.
- [x] 4.3 Run the targeted frontend tests, backend media tests, frontend build, and a local browser smoke check; fix regressions found by verification.

## 5. User-acceptance regressions

- [x] 5.1 Scope the dark Wallpaper-style mask and enlarged shell to acquisition mode while restoring the original library-selection appearance.
- [x] 5.2 Keep discovery search, item detail, and preview available to guests while leaving upload and import operations authentication-protected.
- [x] 5.3 Add frontend and backend regression coverage for selection styling, guest discovery reads, and disabled guest imports.
