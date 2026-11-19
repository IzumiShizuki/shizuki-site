## 1. Server
- [x] Add workflow and event storage, dedicated scoped endpoints, guarded transitions and tests.

## 2. Clients
- [x] Add local MCP tools, install guide and Codex entry skill.
- [x] Add opt-in UI, details, events and manual approval.

## 3. Verification
- [x] Validate OpenSpec and run focused tests and builds.
- [ ] Verify cross-session acceptance against an isolated deployment when available.

## Verification record
- Java focused suite: 37 passed; native MySQL/PostgreSQL Testcontainers check skipped (no Docker); PostgreSQL SQL smoke was exercised separately with embedded PostgreSQL/PGlite.
- Frontend: 1844 passed and production build succeeded. MCP: 4 passed including two isolated stdio clients against a loopback HTTP fixture. OpenSpec strict validation passed.
- Pending: isolated site database/API + browser + real Codex end-to-end, native MySQL migration, and production deployment (not performed).
