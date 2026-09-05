## Context

See `proposal.md` for motivation and `specs/background-derived-workspace-surfaces/spec.md` for the observable contract. The shared theme stylesheet already exposes background-responsive semantic tokens for panels, elevated surfaces, soft fills, text, borders, shadows, inputs, floating controls, and accent states. The Music Library currently shadows several of those shared `--theme-*` properties at its route root with a fixed blue-gray palette, while its child rails and dock are already structured to consume the semantic properties. The Apps rail editor instead declares fixed neutral RGBA values throughout the component and duplicates a partial day-mode palette.

The implementation must preserve the existing component layout, responsive behavior, wallpaper sampling, route behavior, and provider brand colors. It must also keep nested controls legible rather than flattening every surface to the exact same fill.

## Goals / Non-Goals

**Goals:**

- Make the affected perimeter surfaces inherit the shared day/night and background-derived theme without component-specific neutral palettes.
- Preserve visual hierarchy through the existing panel, elevated, soft, input, border, shadow, and accent roles.
- Give Music Library children a stable set of music-specific aliases that resolve exclusively to shared semantic tokens.
- Keep theme behavior testable with focused source-contract regressions and browser verification.

**Non-Goals:**

- Redesigning the Music Library layout, playback behavior, data loading, or provider integrations.
- Recoloring intentional provider brand colors, error/status colors, album artwork, or content imagery.
- Restyling the Apps catalog cards outside the rail editor.
- Changing the shared global theme palette or its wallpaper-derived color calculation.

## Decisions

### Use shared theme tokens as the single neutral-color source

The Music Library route will stop redefining shared `--theme-*` variables. It will instead define `--music-soft-*`, active, text, border, and shadow aliases from the global semantic variables. The existing left rail, right rail, dock, and center controls can then consume the active wallpaper-derived palette consistently in both modes.

This is preferred to copying the current warm RGBA values into the page because copied values would drift from background customization and recreate the same divergence under a different hue.

### Assign semantic elevation roles instead of one uniform fill

Outer rails and docks will use `--theme-panel-surface`; nested groups will use `--theme-panel-surface-elevated` or `--theme-surface-soft`; inputs will use `--theme-input-surface`; interactive hover states will use `--theme-floating-surface-hover`; borders and shadows will use their matching semantic roles. Enabled or selected content will use `--accent-mode-*` roles.

This is preferred to assigning `--theme-panel-surface` everywhere because a single fill would remove the visual separation between the workspace shell, nested cards, and interactive items.

### Remove mode-specific component palette branches

The Music Library and Apps rail editor will not maintain separate hard-coded day-mode overrides for neutral surfaces. Day and night differences will flow from the root theme tokens, so a live mode or wallpaper change updates all affected descendants through CSS custom property resolution.

This is preferred to keeping parallel selectors because duplicated mode branches are easy to update inconsistently and obscure which layer owns the palette.

### Keep intentional semantic and brand colors unchanged

Provider identities and destructive, warning, success, or fatal-error states are not neutral workspace surfaces. They retain their dedicated semantic or brand colors unless they currently use a fixed neutral background inside the affected shell.

This boundary avoids weakening meaning in status and provider UI while removing the unrelated dark gray neutral palette requested by the user.

## Risks / Trade-offs

- [Risk] Background-derived gradients may make adjacent surfaces appear too similar on some wallpapers. → Mitigation: map outer, elevated, soft, and input layers to distinct semantic roles and visually check both day and night modes.
- [Risk] Removing route-level theme shadowing can reveal child components that relied on a fixed fallback. → Mitigation: define complete music aliases at the route boundary and make perimeter component defaults resolve to shared semantic tokens.
- [Risk] Source-contract tests can confirm token ownership but cannot prove perceived contrast. → Mitigation: pair focused tests with computed-style and screenshot checks in the running local app.

## Migration Plan

1. Add regression tests that reject fixed route/rail neutral palettes and require semantic token consumption.
2. Replace the Music Library route overrides and Apps rail editor neutral colors with semantic mappings.
3. Run focused tests, the frontend test/build suite, and day/night browser verification on both routes.
4. Roll back by reverting the frontend and test commit; no data or server migration is required.
