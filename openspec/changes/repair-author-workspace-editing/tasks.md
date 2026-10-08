## 1. Reproduction

- [x] 1.1 Add and run failing component regressions for missing navigation, direct site-setting loading, draft replacement and empty-value round trips.
- [x] 1.2 Add and run mounted studio regressions for lost text during photo operations and selection/preview/publish behavior.

## 2. Author Editing

- [x] 2.1 Connect authorized workspaces to the shared desktop and compact author rail.
- [x] 2.2 Fix editor readiness, stale requests, dirty tracking, discard guards and save/upload coordination.
- [x] 2.3 Preserve intentional empty profile values and pending tag edits through save/reload.

## 3. Content Studios

- [x] 3.1 Preserve album and moment drafts during photo mutations; protect refresh, item switching and route changes.
- [x] 3.2 Align preview/publish with saved state, retain failed selections and prevent overlapping actions.
- [x] 3.3 Preserve quote, location and login-appearance drafts on version conflicts; protect refresh/navigation and require successful form initialization before saving.

## 4. Verification and Delivery

- [x] 4.1 Run focused and full frontend tests plus production build; check desktop and compact rendering in a browser.
- [x] 4.2 Verify requirements against implementation, run strict OpenSpec validation and record any limitations.
- [x] 4.3 Review the diff and commit only this change locally.
- [ ] 4.4 Remove generated verification logs, browser script and screenshots. Cleanup is blocked by automatic approval review (`blocked by policy`); the test server has been stopped. The retained files are listed in verification.md.

## 5. Authorized Production Deployment

- [x] 5.1 Build a release from commit 090fff45, excluding uncommitted workspace changes, and inspect the personal site's current runtime.
- [x] 5.2 Create a verified frontend/source checkpoint and publish the frontend with an automatic image rollback gate.
- [x] 5.3 Verify runtime checksums, site/API health and deployed author navigation; record the release evidence and commit the deployment report locally.
