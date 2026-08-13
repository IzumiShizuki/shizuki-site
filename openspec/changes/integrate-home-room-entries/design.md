## Context

The current desktop Home is owned by `HomePage.vue` and intentionally keeps the wallpaper visible through a centered time stage and three compact contextual islands. The older `bf90a1d3` implementation used large welcome and room cards but also established useful author, authentication, and companion-chat transitions that disappeared when the visual composition was replaced.

## Goals / Non-Goals

**Goals:**

- Reuse the older transitions through the current auth and AI-chat contracts.
- Keep the additions visually subordinate to time and the island row.
- Keep access rules observable and testable at the Home component boundary.

**Non-Goals:**

- Restore the old room/welcome cards or quick-link grid.
- Add a fourth contextual island or change Focus lifecycle behavior.
- Change companion authorization, backend APIs, Menu routes, or content pages.

## Decisions

### 1. Use a small utility cluster rather than another island

The two actions sit near the existing Home footer as compact pill buttons. This preserves the maximum-three-islands contract and distinguishes personal context from the three immediate activity actions. Replacing the reminder island was rejected because Todo is part of the confirmed time-aware Home composition.

### 2. Reuse existing auth and AI-chat entry contracts

Home reads `useAuthSession` to select guest, ineligible, and ADMIN states. The companion action dispatches the existing `openAiChat` companion request for ADMIN users and the existing auth redirect for guests. No new permission state is created.

### 3. Keep route shortcuts in Menu

The older Music/Blog/AI quick-link grid is not restored. Menu already exposes those routes, while the music island provides the only intentional direct route shortcut on Home.

## Risks / Trade-offs

- [Risk] Additional controls can compete with the quiet footer. → Use low-emphasis pills, compact labels, and hide the descriptive footer copy at narrower desktop widths before compromising the main stage.
- [Risk] Companion availability is ADMIN-only and may look like a broken control to other users. → Render an explicit locked state and prevent fallback to quick chat.
- [Risk] Bright wallpapers can reduce small-control contrast. → Reuse the time stage material, border, text-shadow, and wallpaper-derived accent variables.

## Migration Plan

Add the utility cluster and component tests, then verify Home at 1440px and 1024px. Rollback removes only the new cluster and imports; no stored data or route contract changes.
