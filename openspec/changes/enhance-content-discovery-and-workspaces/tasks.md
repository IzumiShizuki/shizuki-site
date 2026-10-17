## 1. Planning and delegation

- [x] 1.1 Create proposal, design and four capability specs; define backend/frontend ownership and compatibility boundaries.
- [x] 1.2 Delegate existing content-surface presentation and mobile UI to local Claude with a concrete brief and validate its resulting diff.

## 2. Public content and search

- [x] 2.1 Implement permission-safe, batched body-aware multi-term search and additive plain-text result excerpts; cover visibility, multi-field terms and update behavior.
- [x] 2.2 Implement canonical-origin configuration and safe HTML/Markdown/JSON-LD public readers for posts, albums and moments, including real error/noindex responses.
- [x] 2.3 Implement public index, sitemap and robots with complete public-only discovery; preserve UNLISTED direct access and headers.
- [x] 2.4 Configure Nginx/Vite and monolith public routes and verify proxy/anonymous-access behavior.
- [x] 2.5 Integrate stable share URLs, article share action, client metadata and search snippets with meaningful behavior tests.

## 3. Frontend content experience

- [x] 3.1 Improve article editing hierarchy and save/publish state presentation while retaining existing editor controls.
- [x] 3.2 Improve music cover/context, album photography and moments timeline presentation using existing data and theme tokens.
- [x] 3.3 Improve author workspace navigation, content-management hierarchy and empty/error/loading states.
- [x] 3.4 Preserve list query/filter/page/scroll context across article round trips; verify narrow reading layout, directory, focus and safe areas.

## 4. Verification and handoff

- [x] 4.1 Run relevant backend behavior tests and frontend unit tests, production build and changed-surface design checks; resolve regressions.
- [x] 4.2 Inspect representative desktop/mobile routes in a browser with controlled fixtures, including search, article round trip, media and author/editor states.
- [x] 4.3 Run OpenSpec verification and strict validation, record deployment/operational verification boundaries and local command evidence.
- [x] 4.4 Clean task temporary artifacts, review git diff/status and locally commit only this change without pushing.

## 5. Follow-up boundary fixes

- [x] 5.1 Prevent Unicode lowercase expansion from corrupting search excerpt offsets; cover real text and literal query terms.
- [x] 5.2 Allow crawler access to public display-image routes without allowing private capability queries, and prefer display-quality reader covers.
- [x] 5.3 Offer a selectable stable share URL when native sharing and clipboard APIs are unavailable, including route-change and async-result handling.
- [x] 5.4 Run relevant regression tests/build, update verification and locally commit the follow-up.
