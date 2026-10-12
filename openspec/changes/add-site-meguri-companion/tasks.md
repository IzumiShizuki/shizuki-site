## 1. Companion integration

- [x] 1.1 Add the owner-only lazy floating companion with minimize, close, sprite preview, navigation continuity and account isolation.
- [x] 1.2 Wire App, Home and an ADMIN-only AI Hub deep link; prevent duplicate stages and hide during focus/mobile-shell use.

## 2. AI recovery and assessment

- [x] 2.1 Correct bootstrap errors, offline refresh and Chinese IME submission; preserve an unsent draft on request failure.
- [x] 2.2 Record a source-based AI capability inventory and prioritized follow-up work.

## 3. Verification and delivery

- [x] 3.1 Add meaningful regression tests for authorization, lifecycle, entry points and recovery behavior; run frontend tests and build.
- [x] 3.2 Inspect desktop and narrow viewports, perform an independent finish review and strict OpenSpec verification.
- [x] 3.3 Update progress, clean task temporary files and commit only this change locally.

## Follow-up notes

The full frontend run has 1,662 passing and 24 failing tests. All failures are in the unchanged `AuthorPage.spec.js` and `AuthorAboutExperience.spec.js`, where JSDOM lacks `IntersectionObserver`; the 71 affected companion/API/stream tests pass. Track the author test environment separately. Production build and strict OpenSpec validation pass. Remote authenticated Core/model/asset acceptance and deployment are not part of this local delivery; verify those before publishing. See `verification-report.md` and `docs/ai-companion-integration.md`.
