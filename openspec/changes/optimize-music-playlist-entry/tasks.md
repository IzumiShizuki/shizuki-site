## 1. Bounded playlist loading

- [x] 1.1 Add provider and API regression coverage for bounded ordered account pages and legacy full bundles.
- [x] 1.2 Implement compatible offset/limit account playlist requests.
- [x] 1.3 Implement first-page browsing, retryable ordered appends, request coalescing and stale-result guards.
- [x] 1.4 Preserve complete ordinary and Folia playback queues for partial browse playlists.

## 2. Explicit current-song location

- [x] 2.1 Add mounted regressions for no automatic scrolling and explicit late duplicate entry location.
- [x] 2.2 Add the location button and remove song/page-driven automatic list expansion and scrolling.

## 3. Verification and delivery

- [x] 3.1 Run applicable backend tests, complete frontend tests, production build and strict OpenSpec validation; record verification evidence. Two pre-existing author-page test groups are documented in verification-report.md; all remaining 1644 tests and affected music/backend checks pass.
- [x] 3.2 Commit and integrate only this change into remote master, preserving unrelated local work and excluding the frontend optimization branch. Implementation dee4f348 fast-forwarded from origin/master; primary checkout preserved as codex/local-master-frontend-20261011.
- [ ] 3.3 Push master, deploy to the personal server through the guarded workflow and verify production health and deployed behavior.
