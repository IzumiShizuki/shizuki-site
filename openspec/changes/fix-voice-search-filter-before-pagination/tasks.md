## 1. Reproduce

- [x] 1.1 Add and run a deterministic service regression with matching tagged works beyond the unfiltered first page.
- [x] 1.2 Verify current upstream tag/age grammar and requested page size behavior with read-only probes.

## 2. Implement

- [x] 2.1 Compose keyword, tag, and age conditions in the provider before upstream pagination; honor pageSize on search and list requests.
- [x] 2.2 Remove service post-pagination filtering and update service regression expectations for filtered pages and hasMore.
- [x] 2.3 Add HTTP boundary tests for combined filters, long generated expressions, unknown tags, age combinations, and the 20/10 page sequence.

## 3. Verify and deliver

- [x] 3.1 Run relevant backend tests, frontend voice tests, and the monolith build.
- [x] 3.2 Verify implementation against the OpenSpec artifacts, run strict validation, document evidence and remaining limitations.
- [x] 3.3 Commit only this change locally with the configured author identity.

## 4. Authorized production deployment

- [x] 4.1 Prepare an isolated release from the current production revision, apply only the voice search fix, and verify its tests/build.
- [x] 4.2 Preserve a verified restore point and previous backend image, publish only the backend, and verify the deployed artifact.
- [x] 4.3 Verify health and live filtered pagination, record deployment evidence, and commit the handoff locally.
