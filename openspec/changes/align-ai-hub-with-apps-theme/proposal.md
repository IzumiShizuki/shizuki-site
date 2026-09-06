## Why

AI Hub currently adds a strong accent-colored wash to its largest workspace panels and keeps a separate navy map surface, so it feels disconnected from the Apps workspace even though both belong to the same site shell. The AI area should inherit the same background-derived panel hierarchy as Apps while reserving accent color for interactive state.

## What Changes

- Map AI Hub canvas, elevated, soft, hover, and input roles to the shared semantic theme surfaces used by Apps.
- Replace the independent navy town-map palette with a subtle theme-derived map surface and accent-tinted wayfinding details.
- Keep active modes, selected map nodes, focus indicators, and primary actions visibly accented without tinting whole work areas.
- Apply the same surface family to town, normal conversation, tavern, and companion workspaces in both day and night themes.
- Preserve AI Hub layout, data loading, interaction behavior, conversation modes, and responsive breakpoints.

## Capabilities

### New Capabilities

- `ai-hub-apps-theme-alignment`: Defines the cross-theme surface hierarchy and accent-color roles that make AI Hub visually consistent with the Apps workspace.

### Modified Capabilities

None.

## Impact

- AI Hub theme aliases and component styling in `fronted/vue3-merged/src/pages/AiHubPage.vue`.
- Shared day-theme AI map overrides in `fronted/vue3-merged/src/styles/global.css`.
- AI theme contract and page regression tests.
- No backend API, route, data model, or dependency changes.
