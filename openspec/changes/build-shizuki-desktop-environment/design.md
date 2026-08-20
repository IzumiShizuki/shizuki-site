## Context

See `proposal.md` for motivation and the capability specs for observable behavior. The repository already has an Electron 43 desktop package, secure custom-scheme asset/API handling, a loopback control service, renderer command acknowledgements, a Vue Home route, `TopMenu`, `LevitationBall`, light-app windows, and a global player. The current host creates one ordinary `BrowserWindow`; its process token is sufficient for same-user local control but is not a durable paired-client model.

The implementation targets this machine's Windows 11 25H2 environment. Explorer must remain the shell, website and Capacitor rendering must remain unchanged, the existing remote API stays on `111.228.35.186`, and unrelated KJ light-app work is isolated in another worktree.

## Goals / Non-Goals

**Goals:**

- Introduce explicit window roles for desktop surfaces, the reusable main route window, and the global control orb.
- Make Windows shell integration replaceable and independently testable behind a narrow adapter.
- Journal and restore every native mutation owned by this phase.
- Preserve one Vue codebase while selecting a constrained renderer surface at startup.
- Evolve the local protocol toward per-client grants without exposing general-purpose native execution.

**Non-Goals:**

- Replace Explorer, the Windows taskbar, Start menu, or secure sign-in desktop.
- Implement the full theme-package engine, taskbar/cursor/icon/sound mutation set, background music service, or focus automation engine in this change.
- Import or scan local music, build the public theme market, or support arbitrary web/script wallpapers.
- Guarantee Windows 10, macOS, or Linux compatibility in this first native adapter.

## Decisions

### 1. Keep one Electron process with explicit window-role managers

The main process will own `DesktopSurfaceManager`, `MainAppWindow`, and `ControlOrbWindow` roles. Desktop surfaces are created per display and always render Home. The reusable main window renders normal routes. The orb renders a restricted renderer mode selected by a query parameter and never mounts the full site shell.

This keeps authentication, renderer assets, and control state in the existing application while preventing duplicate large-route windows and duplicate player ownership. Separate executables were considered but rejected for the first slice because they add update, authentication, and IPC coordination before the native surface contract is stable.

### 2. Put Windows integration behind a fixed-operation helper adapter

The Electron process will never accept raw shell commands. A `WindowsDesktopAdapter` exposes only typed operations: discover/attach desktop host, read/set icon visibility, inspect foreground full-screen state, and restore recorded values. The initial implementation invokes a packaged PowerShell helper with fixed verb and typed arguments through `execFile`; the helper uses embedded P/Invoke definitions for documented Win32 window operations.

This avoids adding an Electron-ABI-sensitive native Node addon during the architectural transition. A compiled helper is the intended later replacement; keeping the adapter and JSON result contract stable prevents renderer or control-protocol changes when that migration occurs. Arbitrary PowerShell from themes or clients remains forbidden.

### 3. Treat native changes as journaled transactions

Before hiding desktop icons or applying another owned native mutation, the main process atomically records the original value and an unfinished operation in `desktop-recovery.json`. After success it updates the applied state. Full exit restores original values before marking the session clean. Startup reconciles any unfinished journal before applying current preferences.

The journal is intentionally separate from ordinary preferences so corrupted layout settings cannot erase restoration evidence. File writes use sibling temporary files plus replacement. A failed restore enters safe mode and disables further native mutations.

### 4. Use pointer forwarding for the mixed native/web desktop

Desktop-surface windows normally ignore mouse input with forwarded move events. The restricted renderer reports whether the pointer is over a declared desktop-interactive region; the main process then temporarily enables input for that surface. Edit mode enables input across the surface. All interactive regions must carry a single audited marker rather than allowing arbitrary page code to request native capture.

An always-clickable full-screen web window was rejected because it would break Explorer blank-area behavior. A static wallpaper-only window was rejected because the confirmed product requires interactive home components.

### 5. Preserve renderer composition through surface modes

The packaged URL carries a fixed `desktopSurface` mode (`desktop`, `main`, or `orb`). `App.vue` mounts the existing application for `main`, a home-only desktop shell for `desktop`, and a small orb component for `orb`. The preload reports immutable surface metadata and exposes narrowly scoped window requests. Ordinary web and Capacitor builds have no surface metadata and keep their current composition.

### 6. Extend control authorization with pairing credentials and grants

The process manifest remains a short-lived bootstrap/discovery mechanism. Pairing requests are created over loopback, but approval and rejection are available only through private trusted-renderer IPC. Approval generates a random client secret returned once; disk storage retains a salted `scrypt` verifier, client metadata, grants, and timestamps. Authenticated requests carry the client identifier and secret, and dispatch maps every semantic command to a required capability before execution.

Pairing records and a bounded audit use atomic JSON storage in `userData`. This is not a Windows credential-vault integration yet; the secret verifier is sufficient to avoid reusable plaintext at rest while the future compiled native helper and installer identity are still unsettled.

### 7. Keep the first slice compatible with the existing protocol

Existing process-token clients continue to work with protocol `1.0` commands during migration. Pairing and desktop-surface descriptors are advertised as additive capabilities. Meguri can adopt pairing without requiring the old endpoints to disappear in the same release. A later major protocol version can remove bootstrap command access after the paired client is deployed.

## Risks / Trade-offs

- [Risk] Explorer's WorkerW hierarchy is implementation-defined and can be recreated after crashes or shell updates. → Discover by observable class hierarchy, monitor attachment health, retry after Explorer recreation, and retain a normal-window fallback.
- [Risk] The PowerShell helper may be blocked by policy or security software. → Use fixed packaged code, no dynamic input, surface a diagnostic fallback, and keep the adapter ready for a compiled helper.
- [Risk] Pointer forwarding can briefly lose hover transitions at display edges. → Debounce mode changes, keep the global orb in its own window, and add renderer/main contract tests.
- [Risk] Multiple desktop renderers could duplicate network work or player ownership. → Mount a home-only surface, suppress player/audio ownership there, and keep the main process as the shared desktop-state authority.
- [Risk] Hiding icons before recording their original state can strand the desktop. → Journal first, verify the native result, restore on full exit and next startup, and disable mutations in safe mode.
- [Risk] A same-user malicious process can still read the bootstrap manifest. → Limit bootstrap lifetime and command scope during migration, require trusted-renderer approval for durable pairings, and retain semantic allowlists.

## Migration Plan

1. Add state, recovery, native-adapter, and pairing modules with unit tests while preserving the existing ordinary main window.
2. Introduce explicit window roles and desktop-surface renderer modes behind a desktop-environment feature flag.
3. Enable desktop attachment, icon visibility, tray lifetime, and orb behavior in packaged development builds; fall back to the ordinary window when native setup fails.
4. Run full frontend tests, strict OpenSpec validation, and packaged smoke tests covering attach/fallback, full exit restoration, single instance, route reuse, orb levels, and authorization denial.
5. Keep the previous installer available for rollback. Disabling the feature flag returns to the conventional application window without changing website or backend behavior.
