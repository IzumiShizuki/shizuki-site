## Why

AI Hub currently exposes a generic English `Network request failed` message when its local API disappears, even though the page can offer a clear recovery action. Its ordinary-conversation branch already embeds the repository's GPT-style shared chat workbench, but misleading “disabled” copy and hard-coded blue-gray surfaces make that capability look unfinished and visually disconnected from the selected site appearance.

## What Changes

- Keep the local monolith running independently during browser debugging and give AI Town connection failures a clear Chinese recovery message while retaining the existing retry control.
- Make “普通对话模式” explicitly present the existing `AiSessionRail` plus embedded `AiDialog` workbench as the canonical GPT-style conversation experience.
- Replace the incorrect AI Chat disabled status with mode-specific workspace status copy.
- Move AI Hub, shared chat, conversation history, message, composer, and related controls from hard-coded dark gray/blue-gray fills to semantic surfaces derived from the active accent/background setting.
- Add regression coverage for the conversation workbench contract, connection-failure recovery copy, and theme-token usage.

## Capabilities

### New Capabilities

- `ai-hub-conversation-workspace`: Defines the recoverable AI Hub loading experience, canonical ordinary-conversation workbench, and setting-derived surface colors across supported themes.

### Modified Capabilities

None.

## Impact

- Frontend page: `fronted/vue3-merged/src/pages/AiHubPage.vue`
- Shared conversation components: `fronted/vue3-merged/src/components/AiDialog.vue` and `AiSessionRail.vue`
- Theme integration and focused Vitest coverage in `fronted/vue3-merged`
- No backend API contract, database schema, or dependency change
