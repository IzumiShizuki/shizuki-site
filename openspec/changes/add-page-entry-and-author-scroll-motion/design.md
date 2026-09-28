## Context

See proposal.md for motivation. The shared site shell mounts a keyed route view directly inside its scroll container. The public About page already uses one mounted view for About, Journey, and Posts, with a shared scroll helper: rail selections request smooth scrolling while direct section links use immediate positioning.

## Goals / Non-Goals

**Goals:**

- Add one small route-entry motion at the existing route-view boundary.
- Keep each page's own transforms, loading states, and layout ownership intact.
- Respect the operating system's reduced-motion preference for route entry and section scrolling.
- Preserve the current single-page About navigation and immediate deep-link positioning.

**Non-Goals:**

- Changing route loading, data fetching, or perceived network performance.
- Adding a loading overlay, dependency, new navigation, or section content.
- Animating route exits or changing route keys and scroll ownership.

## Decisions

### Animate the keyed route view with CSS

Attach a short opacity and individual `translate` animation to the existing `.route-page-view` boundary. The route key already changes when the active view changes, so its mount naturally starts the animation. Using the individual `translate` property keeps the page's existing `transform` behavior under its current owner. A Vue `<Transition>` wrapper was considered, but it would add a second transform owner and change the direct-child layout assumptions in the workspace shell. When a page has started an existing native view transition, let that transition own the route change instead of stacking another entrance animation.

The entrance lasts 360 ms and moves content upward by 12 px. It has no delay, allowing the mounted page to be used immediately. Existing more-specific page animations remain authoritative where a page already owns its own entrance, and the fill mode does not retain a translate value after the animation finishes.

### Keep About section scrolling on its current root

Keep the existing `scrollToPublicSection` helper and its current scroll-root selection. Rail and drawer navigation remain smooth by default; direct URL navigation remains immediate. When the operating system requests reduced motion, section navigation uses immediate positioning. This avoids introducing a second scroll owner or resetting the unified page when its section query changes.

## Risks / Trade-offs

- [Risk] A route with its own root animation could appear to animate twice. → Keep existing page-owned entrance selectors more specific and apply the shared motion only to the route view boundary.
- [Risk] Smooth scrolling can be uncomfortable for visitors who request reduced motion. → Disable both entrance motion and smooth section scrolling under `prefers-reduced-motion: reduce`.
- [Trade-off] Entrance motion does not shorten network or component loading time. → Start immediately when the view mounts and do not delay route interaction.

## Migration Plan

No data or dependency migration is needed. Roll back by removing the route-view CSS and the reduced-motion check in the About section scroll helper.
