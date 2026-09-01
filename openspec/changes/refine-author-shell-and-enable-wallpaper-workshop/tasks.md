## 1. Author workspace geometry

- [x] 1.1 Add an author-specific wide desktop workspace class without changing other route widths.
- [x] 1.2 Decouple the full-menu top offset from nested center scroll ownership so collapsed Menu moves the workspace upward.
- [x] 1.3 Adjust author rail sizing and center bottom clearance so the build-history preview remains readable above persistent overlays.
- [x] 1.4 Add or update contract tests for route-scoped width, center-only scrolling, and compact/full menu offsets.

## 2. Home appearance control

- [x] 2.1 Replace the tiny overlaid badge with a clearly labelled Home appearance micro-control while preserving Home-only scope.
- [x] 2.2 Add selected semantics and clear scope copy to the appearance panel, then update component tests.

## 3. Wallpaper runtime configuration

- [x] 3.1 Add Compose passthrough for SteamCMD image build arguments and document every supported wallpaper runtime variable.
- [x] 3.2 Audit the private production environment by set/unset state, back it up, and configure safe no-key discovery and SteamCMD runtime defaults.
- [x] 3.3 Configure only real available Steam/provider credentials without logging or committing their values.
- [x] 3.4 Verify the SteamCMD executable, writable persistent storage, provider connectivity, account ownership, and cached Steam Guard login; leave an actionable truthful state for any unavailable capability.

## 4. Verification and handoff

- [x] 4.1 Run focused frontend tests, full frontend tests, production build, deployment tests, and strict OpenSpec validation.
- [x] 4.2 Perform desktop visual QA for expanded/collapsed Menu and the About build-history viewport.
- [x] 4.3 Record any external credential or owner-interaction blocker and leave the repository in a clean local commit ready for authorized push/deployment.
