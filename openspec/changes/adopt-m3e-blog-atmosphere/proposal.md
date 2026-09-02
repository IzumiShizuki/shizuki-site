## Why

The blog already has capable reading, writing, and discovery workflows, but its visual hierarchy still relies on a small set of hand-mixed accent variables and repeated glass styles. Referencing Shirone and Google's Material 3 Expressive guidance creates an opportunity to turn the existing background-color preference into a coherent, accessible theme system that gives the blog more personality without replacing Shizuki's warm visual identity.

## What Changes

- Add a Material 3 Expressive-inspired dynamic palette layer derived from the existing solid or gradient accent selection, including named semantic roles for primary, secondary, tertiary, surfaces, outlines, state layers, and readable foregrounds.
- Add selectable palette personalities that change how the existing seed colors are expressed while preserving day/night mode, current custom colors, and persisted preferences.
- Refine the blog list and reader surfaces to consume semantic tokens, use clearer tonal elevation and shape contrast, and provide deliberate hover, focus, pressed, and reduced-motion behavior.
- Add a restrained ambient color field behind blog routes so the current background selection feels alive; the effect remains decorative, non-interactive, static under reduced motion, and does not interfere with wallpaper or article readability.
- Reuse the same color preference state in a compact “色彩” shortcut inside the existing atmosphere panel, including live preview, palette-personality selection, day/night control, and a path to the full appearance controls.
- Extend unit and visual/browser coverage for persistence, contrast-sensitive variables, atmosphere-panel access, responsive blog layouts, and reduced-motion behavior.

## Capabilities

### New Capabilities
- `m3e-blog-theme`: Dynamic semantic palette generation and Material 3 Expressive-inspired blog list/reader presentation built on the site's existing appearance preferences.
- `atmosphere-color-studio`: A shared, persisted color-personality control surfaced as a quick entry in the atmosphere panel and synchronized with the existing appearance settings.

### Modified Capabilities

None.

## Impact

- Frontend appearance state and token generation in `fronted/vue3-merged/src/composables/useUiPreferences.js`.
- Blog list/reader pages and shared blog workspace styling under `fronted/vue3-merged/src/pages` and `fronted/vue3-merged/src/components/blog`.
- Atmosphere-panel navigation and appearance controls in `fronted/vue3-merged/src/components/AtmospherePanel.vue` and the shared appearance-control component.
- Global theme/background styles and application shell wiring.
- Frontend unit tests and browser-level visual verification.
- A small frontend color-utility dependency may be added if needed to derive HCT-compatible roles; no backend or public API changes are expected.
