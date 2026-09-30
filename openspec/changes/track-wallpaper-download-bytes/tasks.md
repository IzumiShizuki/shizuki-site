## 1. Persist Download Byte Progress

- [x] 1.1 Add downloaded and optional total byte fields to the import-job entity and status response.
- [x] 1.2 Add backward-compatible MySQL and PostgreSQL migrations for module and monolith deployments.
- [x] 1.3 Map byte fields through job updates and status serialization while retaining existing stage fields.

## 2. Measure Workshop Downloads

- [x] 2.1 Count direct HTTP response bytes as the body is consumed, use a positive Content-Length as the optional total, and throttle persisted updates.
- [x] 2.2 Sample regular-file sizes under the active SteamCMD item directory while the process runs, and preserve the final observed count.
- [x] 2.3 Ensure download completion and failure paths retain coherent byte counters and existing terminal outcomes.

## 3. Render Byte-Based Progress

- [x] 3.1 Display downloaded MB and total MB when known; use the actual ratio for the bar and an indeterminate bar when the total is unknown.
- [x] 3.2 Keep existing inspection, persistence, success, failure, and fallback stage presentation accessible.

## 4. Validate the Change

- [x] 4.1 Build the affected backend and frontend modules and resolve compile or bundle errors.
- [x] 4.2 Run strict OpenSpec validation and confirm the active import response exposes the byte fields.
