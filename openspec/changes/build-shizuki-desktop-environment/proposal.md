## Why

The first desktop package runs Shizuki as a conventional Electron application, but the confirmed product is a persistent Windows desktop environment: the Shizuki home surface should live behind Explorer desktop icons, global controls should remain available outside the main window, and every system-facing change must be recoverable. Establishing that host architecture now creates the safe foundation for later theme, music, focus, and Meguri automation capabilities.

## What Changes

- Replace the conventional single-window launch model with a Windows 11 desktop surface hosted beneath Explorer desktop icons while keeping Explorer as the system shell.
- Add reversible desktop-icon visibility control, normal/edit interaction modes, monitor-aware state, and a safe fallback when native desktop attachment is unavailable.
- Turn the desktop Menu into a compact desktop-only dropdown that opens routes in one reusable main application window.
- Move the levitation ball into an independent global window with a two-level interaction model: light applications and immediate controls first, Shizuki routes second.
- Add tray-owned lifetime, close-to-tray behavior, persisted local desktop state, explicit full-exit restoration, and startup/crash recovery markers.
- Introduce paired local-client identities and capability grants so Meguri can evolve beyond possession of a single process token without receiving arbitrary system access.
- Preserve the ordinary website and Capacitor behaviors; Windows desktop behavior is enabled only inside the packaged desktop host.
- Define extension boundaries for later background music, complete theme packs, focus presets, multi-monitor layouts, and Windows appearance helpers without implementing those full product areas in this first slice.

## Capabilities

### New Capabilities

- `windows-desktop-surface`: Hosts the Shizuki home experience as a reversible, Explorer-compatible Windows desktop surface with icon visibility and interaction-mode controls.
- `desktop-navigation-shell`: Provides the desktop-only dropdown Menu, reusable main route window, and independent two-level global control orb.
- `desktop-lifecycle-recovery`: Owns tray lifetime, persisted local state, close/full-exit semantics, startup recovery, and safe restoration of desktop mutations.
- `desktop-client-pairing`: Adds explicit local-client identities, capability grants, revocation, and audit-safe authorization for Meguri and future clients.

### Modified Capabilities

None.

## Impact

- Electron main/preload code in `fronted/vue3-merged/desktop`, including new window orchestration and Windows-native adapter boundaries.
- Vue desktop-mode rendering, Menu behavior, levitation-ball presentation, and desktop bridge state under `fronted/vue3-merged/src`.
- Local application-data formats for desktop state, recovery journals, and paired clients.
- Control protocol capabilities and compatibility documentation for Meguri.
- Windows installer/runtime smoke tests; no backend deployment or remote middleware change is required for this phase.
