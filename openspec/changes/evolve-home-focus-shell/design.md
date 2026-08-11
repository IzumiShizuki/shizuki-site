## Context

The current desktop shell already mounts the background stage, global player, lyric bar, visualizers, floating light-app host, and reminder host around `RouterView`. Home already provides the visual language for arrival, time, and a private-room feeling, while the light-app runtime retains windows outside individual page components. The missing piece is a shared session state that can coordinate those existing layers without creating a new route.

See `proposal.md` for the motivation and user-facing scope. The implementation must remain frontend-local for this slice, preserve existing route URLs, and avoid changing Todo, Blog, Music library, or AI data contracts.

## Goals / Non-Goals

**Goals:**

- Introduce one shared, testable Focus session state for Home, App Shell, the Focus chrome, light-app visibility, and Todo context.
- Make Focus visually obvious while keeping the current route and environmental media stable.
- Make light-app visibility an explicit shell policy with a Focus allow-list.
- Give Home one primary Focus action and a concise current-state summary without turning it into a dashboard.
- Keep the existing global player bridge and light-app window runtime as the underlying infrastructure.

**Non-Goals:**

- No `/focus` router entry, route guard, backend persistence, server-side session history, or multi-device synchronization.
- No redesign of Todo data, Music library navigation, Blog organization, AI Hub, or Meguri's full natural-language behavior.
- No new theme or wallpaper preset system for Focus.
- No desktop/mobile parity work for the first slice; mobile shell behavior remains unchanged.

## Decisions

### 1. Use a singleton frontend Focus session rather than a route

Focus is a mode of the App Shell, so a module-level reactive state exposed through a composable will be shared by Home, App, and the Focus chrome. The state stores `status`, `presetId`, `startedAt`, and an optional normalized current task. This avoids duplicating state through route query parameters and means the current route remains the user's working context.

An explicit state module is preferred over passing props through the whole shell because the player, light-app host, and Todo window are siblings mounted by different layers. A router page was rejected because it would make preserving the current page and route context harder, and because the product definition treats Focus as a temporary state rather than a destination.

### 2. Keep Focus controls in a small persistent chrome component

The App Shell will render a compact `FocusModeBar` only while Focus is active. It will show elapsed time, the current task when available, an explicit exit action, and an explicit task-complete action. The existing page remains underneath so the environment and route do not reset; the normal `TopMenu` is simply not mounted while Focus is active.

The bar is preferred over a full-screen replacement because Focus should preserve the user's environment and selected light apps. Its styling will use the existing translucent material and accent tokens, with a restrained active-state edge rather than a new visual theme.

### 3. Model light-app visibility as a view mode

The existing `getVisibleWindows(state, isHomeRoute)` boolean will be extended compatibly to accept a view-mode object. Normal Home and non-Home behavior remains unchanged. Focus receives an explicit `focusAppCodes` allow-list; only windows whose codes are in that list are rendered. Starting a preset opens missing selected windows through the existing shell store, while exiting Focus leaves the runtime windows intact for normal shell behavior.

The allow-list is preferred over mutating or closing unrelated windows because Focus must preserve the user's environment and avoid destroying work in progress. Pinned status continues to mean normal shell persistence, not Focus membership.

### 4. Start with a local preset catalog

The first slice exposes a small immutable preset catalog in frontend state. The default Home action uses a desk preset that opens Todo and Pomodoro; a quiet preset remains available for tests and future UI selection. Presets contain only light-app codes. A later change can persist user-created presets without changing the session contract.

### 5. Treat Todo as the source of truth for completion

The existing TimePrism focus-item event will continue to select a Todo item, but it will also update the shared Focus task context. The Focus chrome will emit a completion intent through the existing browser-event style bus. `TodoWindow` remains responsible for the actual Todo mutation and clears the shared task only after its existing update path succeeds. Exiting Focus without that event never changes Todo state.

This keeps the new Focus layer from duplicating Todo API logic and ensures guest/local and authenticated/remote Todo flows continue to use their current persistence paths.

### 6. Preserve player and visualizer behavior through policy inputs

The App Shell will treat Home or active Focus as the visualizer-enabled context, and active Focus will override the normal Music-route suppression for the global player. The player engine and bridge remain unchanged; only the shell's visibility props change. This keeps the current Music page presentation intact while making the Focus contract explicit.

## Risks / Trade-offs

- [Risk] The Focus session is lost on a full page refresh because it is intentionally frontend-local. → Keep the current environment preferences and Todo data untouched; add persistence only in a later session-history change.
- [Risk] A preset can open large floating windows on small desktop viewports. → Reuse existing window rect normalization and keep presets limited to the two existing productivity apps.
- [Risk] A completion intent may be emitted while the Todo window is not mounted. → The default preset opens Todo, and the Focus chrome keeps the task pending until Todo confirms the existing update path.
- [Risk] App.vue remains a large composition root after this slice. → Introduce the shared policy and Focus chrome first, then extract environment layers in a follow-up once the behavior is validated.
- [Risk] Existing Home tests and shell tests may depend on the old primary AI action or boolean visibility API. → Preserve compatible function signatures where possible and update tests to cover both legacy normal mode and the new Focus mode.

## Migration Plan

1. Add the OpenSpec contracts and frontend Focus state with unit tests.
2. Add Focus chrome, Home entry/status, and App Shell visibility inputs.
3. Wire the Todo focus-item and completion events without changing Todo API payloads.
4. Run unit tests and build; manually verify Home entry, Focus preservation, preset windows, exit, and task completion.
5. Rollback is file-level: remove the Focus chrome/state imports and revert the Home/App Shell wiring; existing route, player, light-app, and Todo behavior remains available.
