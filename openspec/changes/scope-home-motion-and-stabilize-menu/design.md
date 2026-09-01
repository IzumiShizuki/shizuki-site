## Context

See `proposal.md` for motivation. The current application stores motion intensity in a global composable, binds it to the root `MotionConfig`, and exposes its control through a Home-only utility item. That couples a Home preference to every route and makes the top-navigation composition route-dependent.

## Goals / Non-Goals

**Goals:**

- Make the Home appearance state the sole owner of the immersive/soothing choice.
- Keep the application shell and non-Home routes on a stable immersive rendering path.
- Reuse the existing Home navigation entry as the appearance-control entry point while preserving normal navigation from other routes.
- Preserve valid existing stored choices through a one-way compatibility migration.

**Non-Goals:**

- Redesigning the rest of the top menu or changing its collapse behavior.
- Changing theme, clock, wallpaper-color, or wallpaper-clock semantics.
- Adding a new backend preference API.

## Decisions

### Store motion level with Home appearance

`homeTimeStageState` will own and persist `motionLevel` alongside the existing Home clock and color fields. Its effective value will equal the stored value; no device or operating-system heuristic will override it.

Alternative considered: retain the global preference and mask it outside Home. This leaves root attributes and the global animation provider coupled to the setting, so a future consumer could reproduce the same failure.

### Make the global motion adapter deterministic

Existing non-Home consumers can continue using the shared motion adapter during this focused change, but that adapter will resolve to immersive and will not be driven by the Home control. The root animation provider will receive a fixed non-reduced setting, while Home-owned background and stage elements receive Home's local setting explicitly.

Alternative considered: rewrite every route animation in one pass. That adds broad visual risk without being necessary to restore ownership boundaries.

### Reuse the active Home entry as the settings trigger

Activating Home from another route keeps its normal navigation behavior. Activating the already-active Home entry toggles the Home appearance popover. The popover remains rendered by `TopMenu`, but the separate Home appearance menu stack is removed, so it does not change the icon count.

Alternative considered: add a small gear badge on Home. It would still introduce a second visual control and conflict with the request to avoid another button.

### Lock behavior with component and integration-source tests

Tests will assert identical menu-entry counts on Home and content routes, the absence of a separate appearance trigger, Home-entry popover behavior, Home-local persistence, and the lack of a preference-driven global `MotionConfig` binding.

## Risks / Trade-offs

- [Risk] Existing global soothing storage may be left behind and confuse future migrations. → Migrate a valid value into Home appearance once and stop applying it to root state.
- [Risk] Reusing an active navigation entry for settings is less obvious than a dedicated icon. → Give the active Home entry an accurate accessible label/title and make the opened panel clearly identify itself as Home appearance.
- [Risk] Popover positioning changes when anchored to Home. → Keep the panel in the menu's visible-overflow layer and add layout assertions plus browser-level visual verification.

## Migration Plan

1. Read a valid existing motion preference only when Home appearance does not already contain `motionLevel`.
2. Persist the resolved value inside the Home appearance snapshot.
3. Stop binding the resolved Home value to global root animation state.
4. Deploy the frontend normally; rollback is the previous frontend image and does not require data restoration.
