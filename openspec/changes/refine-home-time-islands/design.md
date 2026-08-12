## Context

The desktop shell already owns wallpaper selection, day/night theme variables, the player bridge, Focus state, global light-app windows, and the levitation ball. Home is a route component inside that shell and currently duplicates state presentation inside two large glass cards. See `proposal.md` and `specs/home-time-stage/spec.md` for the desired behavior.

The design direction uses the active wallpaper as the page material, a modern geometric sans time display as the single signature element, and small liquid-material islands as controls. The compact token set is derived from existing theme variables: wallpaper ink (`--theme-text-primary`), translucent material (`--theme-floating-surface`), wallpaper accent (`--accent-rgb`), and softened outline (`--theme-border`). No new palette or typography dependency is introduced.

## Goals / Non-Goals

**Goals:**

- Keep Home state and appearance behavior testable outside the large App composition root.
- Reuse the player, Focus, light-app, theme, and wallpaper systems through narrow inputs.
- Make route containment structural: the time stage is owned by Home rather than global CSS.
- Preserve keyboard focus, reduced-motion behavior, and usable layouts from 1024px desktop widths upward.

**Non-Goals:**

- Rework Blog, Music, Apps, AI, author, profile, or mobile route layouts.
- Replace the existing wallpaper color extraction or theme token pipeline.
- Add backend preference persistence or wallpaper schema fields in this slice.
- Replace light-app window internals, automatically arrange initial windows, or allow more than the existing Focus preset.

## Decisions

### 1. Store Home preferences in a small dedicated module

A module-level reactive store will normalize and persist global clock behavior, per-wallpaper clock overrides, and motion intensity in local storage. Home and TopMenu consume the same singleton state, avoiding prop mutation and avoiding expansion of the already large general UI-preferences schema. Pure resolver functions will cover automatic static/dynamic behavior and make migration-safe defaults testable.

The same module stores whether Home accent color is automatic or manual plus the manual value. Runtime sampling remains ephemeral: App samples the static visual or dynamic/L2D preview, falls back to the existing theme accent on CORS/image failure, and provides the effective Home-only palette through the stage context. CSS variables are scoped to Home so content routes do not inherit the sampled color.

An extension to `useUiPreferences` was considered, but rejected because these options only affect Home and would further couple global theme serialization to an experimental Home surface.

### 2. Provide wallpaper metadata through a narrow Home stage context

App Shell will provide the active wallpaper id and dynamic/static classification to descendants. Home uses it to resolve effective clock visibility, while TopMenu receives the same computed values as explicit props for its appearance panel. This keeps Home free from the wallpaper library and API details.

Routing wallpaper state through URL query parameters was rejected because clock display is presentation state and must not alter shareable routes.

### 3. Use the existing player bridge and Focus singleton

Home will read the provided player bridge for title, artist, playing state, and playback toggle. The Focus island calls the existing desk preset, which already opens Todo and Pomodoro through the App Shell Focus watcher. The reminder island opens Todo through the existing light-app window bus. No new player or productivity state is introduced.

### 4. Keep the signature animation isolated to Home

Home assigns its motion level to the route root and uses scoped selectors to control clock entrance, island entrance, material hover/press, and a restrained ambient halo. Vivid allows the full orchestrated entrance and ambient drift; calm keeps short transitions but stops continuous drift; off removes animation. A reduced-motion media query overrides every level.

Global motion configuration remains unchanged so content pages retain current behavior.

### 5. Turn the Menu theme item into a route-aware appearance popover

The theme item toggles an anchored secondary panel. Day/night controls are always shown; Home-only controls appear only when App marks the current route as Home. Events flow upward to App for global theme changes and to the Home preference store for Home settings. The normal collapsed/expanded Menu and route shortcuts remain intact.

A separate settings route or modal was rejected because these are lightweight visual preferences and the user explicitly selected a secondary Menu interaction.

### 6. Persist the levitation ball as edge plus vertical ratio

The ball saves `side` and a normalized vertical ratio rather than raw x/y coordinates. On mount and viewport resize, the component resolves that state against current dimensions, then clamps it. Drag release selects the nearest edge. Expanded panels open inward based on the saved/current side.

Saving raw pixels was rejected because it restores poorly after viewport or display-size changes.

## Risks / Trade-offs

- [Risk] A bright or detailed wallpaper can reduce time legibility. → Use existing contrast-shadow tokens plus a restrained local scrim only behind small supporting text; keep the clock itself borderless.
- [Risk] Local-only Home preferences do not synchronize across devices. → Use a versioned payload and a dedicated module so account preference sync can be added later without changing components.
- [Risk] Theme popover can overflow near narrow desktop widths. → Anchor it to the theme control, constrain width, and flip/center it in the existing responsive Menu breakpoints.
- [Risk] Existing Home tests target removed card classes. → Update tests around observable time-stage, island, Focus, and preference behavior while preserving route actions through Menu.

## Migration Plan

1. Add the normalized Home preference module and tests.
2. Replace Home composition and update Home interaction tests.
3. Add the route-aware appearance popover and App wallpaper metadata wiring.
4. Add edge-snap persistence to the existing levitation ball.
5. Run focused unit tests, the full frontend build, and desktop browser verification at 1024px and 1440px.
6. Rollback is frontend-local: restore the previous Home and Menu composition and remove the new preference/context wiring; no stored backend data or route contract requires migration.
