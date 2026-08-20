## 1. State, recovery, and native boundaries

- [x] 1.1 Implement versioned atomic desktop preference storage with invalid-state quarantine and unit tests.
- [x] 1.2 Implement the native-mutation recovery journal, safe-mode reconciliation, and restoration tests.
- [x] 1.3 Add a fixed-operation Windows desktop helper and adapter for desktop-host attachment, icon visibility, and foreground full-screen inspection.
- [x] 1.4 Add adapter contract tests and a no-mutation diagnostic command for validating the current Windows shell hierarchy.

## 2. Desktop window orchestration

- [x] 2.1 Split the Electron host into desktop-surface, reusable main-window, and global-orb window roles behind a desktop-environment feature flag.
- [x] 2.2 Create monitor-aware desktop surfaces, attach them beneath Explorer icons, and fall back to a normal window when attachment fails.
- [x] 2.3 Reconcile display topology and Explorer restarts without duplicating desktop surfaces.
- [x] 2.4 Implement journaled desktop-icon visibility changes and restore the captured original value during full exit.
- [x] 2.5 Add tray-owned lifetime, close-to-tray behavior, explicit full exit, and opt-in launch-at-login state.
- [x] 2.6 Persist the orb position and hide or restore it as unrelated full-screen applications enter or leave.

## 3. Renderer surfaces and navigation

- [x] 3.1 Extend the context-isolated preload API with immutable surface metadata and narrowly scoped desktop window/input requests.
- [x] 3.2 Add renderer surface-mode selection so desktop surfaces mount a Home-only shell, the orb mounts a restricted control UI, and ordinary web/Capacitor rendering remains unchanged.
- [x] 3.3 Implement the compact desktop-only Menu dropdown and route requests to the reusable main application window.
- [x] 3.4 Implement normal/edit pointer forwarding for audited interactive regions and cover the state transitions with tests.
- [x] 3.5 Implement the global orb's collapsed, first-level light-control, and second-level route states with dismissal and navigation tests.

## 4. Paired local clients

- [x] 4.1 Implement atomic paired-client, pending-request, credential-verifier, grant, revocation, and bounded-audit storage with unit tests.
- [x] 4.2 Extend the loopback control service with pairing request/status endpoints and paired-client authentication while preserving protocol 1.0 bootstrap compatibility.
- [x] 4.3 Map semantic commands to required capabilities and reject ungranted commands before dispatch with stable errors and tests.
- [x] 4.4 Add trusted-renderer pairing review, approval, rejection, revocation, and activity APIs plus a minimal in-app approval surface.

## 5. Verification and handoff

- [x] 5.1 Run focused desktop tests and the full frontend unit suite, then fix regressions.
- [x] 5.2 Build the production frontend and run strict OpenSpec validation.
- [x] 5.3 Package and smoke-test desktop attach/fallback, single-instance route reuse, orb levels, pairing denial, close-to-tray, and full-exit restoration.
- [x] 5.4 Update desktop and Meguri integration documentation with feature flags, recovery steps, pairing flow, and known first-slice limits.
