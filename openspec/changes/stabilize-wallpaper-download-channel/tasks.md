## 1. Regression Baseline

- [x] 1.1 Add a deterministic test where the Steam detail API rejects an item but the public Workshop page resolves it
- [x] 1.2 Add coverage proving discovery metadata and import downloads use the configured wallpaper outbound client
- [x] 1.3 Add channel-state tests for direct download, ready SteamCMD, and unavailable SteamCMD configurations

## 2. Shared Backend Transport

- [x] 2.1 Extract proxy parsing, proxy authentication, timeout, and request sending into a wallpaper-scoped outbound client
- [x] 2.2 Implement one Workshop metadata provider with API-first and bounded public-page fallback behavior
- [x] 2.3 Reuse the shared provider and outbound client in discovery, preview, import metadata, and public-file download paths

## 3. Download Channel Contract

- [x] 3.1 Add backward-compatible download channel, availability, and safe message fields to Workshop item detail responses
- [x] 3.2 Validate SteamCMD readiness against the feature flag, app ID, executable command, and account credentials
- [x] 3.3 Make import prefer direct download and fall through to ready SteamCMD while preserving asynchronous job errors

## 4. Frontend Feedback

- [x] 4.1 Normalize the additive channel response fields without breaking older backend responses
- [x] 4.2 Render concise checking, direct, SteamCMD, unavailable, and retry-oriented states while keeping the selected item visible

## 5. Verification and Delivery

- [x] 5.1 Run focused backend and frontend tests, then the applicable media suite and production builds
  - Focused wallpaper tests, all frontend unit tests, and both production builds pass. The full media test run reaches 282 tests; six unrelated loopback-server tests error in this Windows Java runtime.
  - Merge verification also covers the repository-wide Spring bean constructor contract; the production wallpaper outbound constructor is explicitly marked for injection.
- [x] 5.2 Validate the OpenSpec change strictly and inspect the diff for leaked proxy or Steam credentials
- [ ] 5.3 Deploy the verified build to the personal server and repeat the production detail probe plus an authenticated import job
  - Pending: this workstation has no `REMOTE_USER` plus private SSH authentication source configured. The production endpoint is still on the old response contract.
- [x] 5.4 Commit the completed change locally with the repository author identity
