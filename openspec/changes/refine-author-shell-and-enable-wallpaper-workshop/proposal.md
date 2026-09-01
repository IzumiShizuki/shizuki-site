## Why

The unified author workspace is structurally correct, but its desktop canvas is too constrained: the build-history timeline is nearly hidden, and collapsing the global menu leaves unnecessary empty space above the workspace. The Home-only appearance control is also visually ambiguous, while the production wallpaper service reports SteamCMD as unavailable because its runtime credentials and optional discovery keys have not been audited and enabled.

## What Changes

- Increase the desktop author workspace width and usable height while preserving fixed side rails and center-only scrolling.
- Let the author workspace move upward when the global menu is fully collapsed, without overlapping the standalone Menu control.
- Replace the ambiguous Home appearance-control badge with a clear, accessible indicator whose visual state and effect are perceptible.
- Keep the Home-only scope explicit instead of implying that the control changes every route.
- Audit and enable the production SteamCMD wallpaper channel with private server-side configuration, preserving truthful unavailable states when an account, ownership, executable, proxy, or third-party key is genuinely missing.
- Verify direct discovery, optional Steam Web API/Wallhaven integrations, SteamCMD readiness, and wallpaper import without committing or logging credentials.

## Capabilities

### New Capabilities

- `author-shell-viewport`: Desktop author workspace sizing, menu-collapse offset, fixed rails, center scrolling, and build-history visibility.
- `home-appearance-control`: Clear Home-only appearance-control identity, accessible state, and perceptible behavior.
- `wallpaper-runtime-configuration`: Private production configuration and readiness verification for SteamCMD and wallpaper discovery providers.

### Modified Capabilities


## Impact

- Frontend author workspace, global menu, Home appearance controls, styles, and component tests.
- Production `deploy/.env.server` and SteamCMD runtime under `/opt`; no secrets enter Git.
- Wallpaper discovery/import backend runtime and its existing public status contract; no public API compatibility break is intended.
