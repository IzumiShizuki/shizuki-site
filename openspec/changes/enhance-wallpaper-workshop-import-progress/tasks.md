## 1. Durable Import Progress

- [x] 1.1 Add additive import-job stage and percentage columns to the monolith MySQL/PostgreSQL migrations and the dormant media-module migration.
- [x] 1.2 Extend the import-job entity and status response with bounded progress values while retaining the existing response fields.
- [x] 1.3 Update the asynchronous Workshop workflow to persist monotonic queued, resolving, downloading, inspecting, persisting, and terminal transitions.

## 2. Runtime Resource Selection

- [x] 2.1 Retain and verify exclusion of preview, thumbnail, and cover assets before browser-playable resource selection.
- [x] 2.2 Retain and verify conversion-required fallback behavior for native-only Wallpaper Engine projects.

## 3. Progress Interface

- [x] 3.1 Render the server-provided stage and percentage in the Workshop import progress bar, with safe fallback behavior for older responses.
- [x] 3.2 Extend the import polling and panel tests for active, terminal, and fallback outcomes.

## 4. Verification

- [x] 4.1 Run focused backend and frontend tests for Workshop selection, job responses, polling, and progress presentation.
- [x] 4.2 Run applicable module/frontend checks and strict OpenSpec validation.
