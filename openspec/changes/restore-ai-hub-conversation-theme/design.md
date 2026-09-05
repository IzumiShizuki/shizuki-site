## Context

See `proposal.md` for motivation and `specs/ai-hub-conversation-workspace/spec.md` for observable behavior. `AiHubPage.vue` already owns the town/conversation/companion mode switch and already embeds `AiSessionRail.vue` with `AiDialog.vue`; the latter was deliberately styled as a LobeChat-like web conversation surface in earlier work. The defect is therefore integration and theme drift, not a missing chat product. The frontend exposes dynamic `--accent-rgb`, `--accent-strong-rgb`, and semantic theme text/border variables, while several AI styles still hard-code navy, charcoal, and neutral-white fills.

## Goals / Non-Goals

**Goals:**

- Keep the existing conversation state, streaming, session history, permissions, and API contracts intact.
- Make the ordinary-conversation branch read as one coherent GPT-style workbench inside AI Hub.
- Give AI components a small set of page-scoped surface aliases that update with the active appearance setting.
- Preserve actionable loading, guest, error, disabled, hover, focus, and responsive states.

**Non-Goals:**

- Rebuild or fork the chat engine, session protocol, Markdown renderer, or AI backend.
- Change AI quotas, authentication rules, model/provider configuration, town data, or Meguri behavior.
- Redesign the rest of the website or replace the established translucent wallpaper composition.

## Decisions

### 1. Reuse the existing shared chat workbench

`AiHubPage` will continue embedding `AiSessionRail` and `AiDialog` and will make that contract explicit through correct status copy and tests. This preserves streaming, Markdown/code presentation, message actions, session restoration, and role filtering. Importing another standalone chat frontend or copying its state model was rejected because the repository already contains the required behavior and a second implementation would split persistence and authorization paths.

### 2. Introduce AI-scoped semantic surface aliases

`AiHubPage` will define `--ai-hub-surface`, `--ai-hub-surface-elevated`, `--ai-hub-surface-soft`, `--ai-hub-input-surface`, and related ink/border aliases from the live accent and theme variables. `AiDialog` and `AiSessionRail` will consume those aliases with existing theme tokens as fallbacks. This makes accent changes propagate immediately through normal CSS inheritance and limits the change to AI surfaces.

Using the global fixed charcoal panel tokens unchanged was rejected because it reproduces the reported mismatch. Replacing the global theme tokens for the whole site was also rejected because this request is scoped to AI Hub and neighboring routes may rely on their existing material density.

### 3. Keep recovery at the existing request boundary

The existing HTTP error keeps its structured `problemCode`. `AiHubPage` will translate connection-level failures into an actionable Chinese message while keeping non-network server details intact and using the existing “刷新场景” request path as retry. A hidden automatic retry loop was rejected because it can hammer an intentionally stopped local service and obscures whether recovery succeeded.

### 4. Validate behavior and computed styling separately

Component tests will cover mode activation, shared-workbench props, guest/error copy, and recovery. A focused theme source test plus browser-computed-style assertions will cover semantic token use and the absence of the reported dark-gray surface in representative AI elements. This avoids brittle pixel snapshots while still catching accidental hard-coded palette regression.

## Risks / Trade-offs

- [Risk] Accent-derived translucent surfaces can lose contrast over bright wallpapers. → Retain semantic theme text/border tokens, theme-specific alpha levels, and the existing backdrop treatment; verify both day and night modes in the browser.
- [Risk] Broad overrides could recolor code blocks or semantic error states. → Scope the aliases to structural/chat surfaces and keep code, danger, warning, and success tokens unchanged.
- [Risk] Shared components are also used outside AI Hub. → Use inherited AI aliases with current component values as fallbacks so external hosts keep their existing appearance.
- [Risk] A detached local backend can later stop for reasons unrelated to the frontend. → Keep the visible retry path and actionable unavailable-service copy even after the current runtime is restored.

## Migration Plan

1. Add regression tests for the current misleading copy and hard-coded AI surfaces.
2. Apply the page-scoped aliases and component fallbacks, then update the status and network recovery copy.
3. Run focused tests, the full frontend test/build pipeline, the design detector, and live browser checks for town and ordinary-conversation modes.
4. Roll back by reverting the AI-scoped aliases and copy changes; no persisted data or backend migration is involved.
