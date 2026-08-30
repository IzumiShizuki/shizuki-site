## Context

See `proposal.md` for motivation. `TopMenu.vue` currently combines a binary theme selector and Home-only appearance preferences in one popover. Theme persistence and DOM application already live in `useUiPreferences`; the menu only needs to emit the destination mode.

## Goals / Non-Goals

**Goals:**

- Keep the theme control as a single deterministic binary action.
- Preserve existing Home clock, color, and motion controls without making them part of the theme click path.
- Maintain keyboard and screen-reader clarity for both actions.

**Non-Goals:**

- Change theme persistence, default theme, or visual tokens.
- Redesign Profile appearance settings.
- Add a third automatic/system theme state.

## Decisions

1. The primary theme item emits the opposite normalized mode directly. This reuses the established `set-theme-mode` event and avoids adding state or persistence logic to the menu.
2. The existing appearance popover becomes Home-only and is opened by a small dedicated settings button within the same menu item footprint. A separate action is clearer than long-press, right-click, or a hidden keyboard modifier.
3. The day/night segmented control is removed from the popover. It would duplicate the immediate primary action and recreate the unnecessary choice the change removes.
4. The settings trigger uses a native button with its own accessible label and expanded state. The outer theme action remains a keyboard-operable native button so nested interactive roles are avoided.

## Risks / Trade-offs

- [Risk] The extra settings affordance could visually compete with the theme icon. → Keep it compact, Home-only, and subordinate through size and opacity.
- [Risk] Clicking the settings affordance could also trigger theme switching. → Use sibling controls and stop propagation on the settings button.
- [Risk] Removing the content-route popover changes an existing interaction. → Content routes previously exposed only the redundant day/night selector, so direct switching preserves the useful capability with fewer steps.
