## 1. Desktop host foundation

- [x] 1.1 Add Electron and electron-builder dependencies, desktop development/build scripts, and Windows packaging metadata.
- [x] 1.2 Implement the secure `app://shizuki` static-resource handler and remote `/api/` gateway proxy with focused path/proxy tests.
- [x] 1.3 Implement single-instance window lifecycle, safe external-link handling, and validated persisted window bounds.
- [x] 1.4 Add a context-isolated preload bridge with no Node.js exposure in the Vue renderer.

## 2. Local control protocol

- [x] 2.1 Define protocol `1.0` capability descriptors, command validators, stable error payloads, and unit tests.
- [x] 2.2 Implement the loopback-only authenticated HTTP service, atomic per-process discovery manifest, bounded request bodies, and cleanup.
- [x] 2.3 Implement current-state responses and bounded resumable SSE events for readiness, state changes, and command results.
- [x] 2.4 Implement native window command dispatch and correlated renderer command dispatch with timeout handling.

## 3. Renderer integration

- [x] 3.1 Extend native-shell detection for Electron without regressing Capacitor API URL behavior.
- [x] 3.2 Add the Vue desktop control adapter for allowlisted route navigation and music playback commands.
- [x] 3.3 Report normalized renderer readiness, route, and player state through the preload bridge and acknowledge every renderer command.

## 4. Verification and handoff

- [x] 4.1 Add desktop host, preload, protocol, and renderer adapter tests and run the full frontend unit suite.
- [x] 4.2 Build the production frontend and validate the change with strict OpenSpec checks.
- [x] 4.3 Launch the packaged runtime and smoke-test routing, API proxying, single-instance behavior, control authentication, commands, and events.
- [x] 4.4 Produce an unsigned Windows installer and document installation, development, manifest discovery, API examples, security boundaries, and the future Meguri Pet adapter.
