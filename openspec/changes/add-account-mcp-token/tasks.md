## 1. Account token and permissions
- [x] Implement one-time issue/rotation, status, revocation and hashed storage.
- [x] Enforce an explicit current Todo project grant and exclude account-management and manual approval routes.
- [x] Test lifecycle, malformed credentials and account/project boundaries.
- [ ] Verify native integration and shared Flyway ledger separately before any production release.
## Release context
- Integrated backend candidate: focused Java 30 passed, MCP stdio 5 passed and embedded PostgreSQL account/scope smoke passed. Forward frontend from the deployed source line: 1,851 tests and Vite production build passed.
- This branch is a scoped forward change off main. The live backend and frontend were previously built from different source lines. Do not build a wholesale production replacement from this branch: stage backend additions against the pinned backend image and preserve its existing DJ overlay and Flyway history. Stage the main frontend assets against the pinned frontend image, retaining the DJ entry and static downloads.
- The shared production database was read-only verified through V1106 before staging. Production rollouts must pin the existing images, verify provenance and migration checksums, use an isolated rehearsal, and exercise both the site and DJ following activation. No merge to main is part of this work.
