## Context

See `proposal.md` for motivation. The author page currently owns one two-column scaffold for most tabs, while `AuthorAboutExperience` creates a second nested three-column shell only for about and posts. `RouteDotRail` also switches menu groups into horizontally scrolling rows through a wide-container rule. Weather and quote cards already call public backend resources, but production-safe feature flags and persisted site-widget configuration determine whether those endpoints return data. The top menu currently replaces the full bar with a compact route dock.

## Goals / Non-Goals

**Goals:**

- Make one author shell own rail placement and scrolling for every tab.
- Keep the current glass material, card components, routes, editor behavior, and responsive auxiliary drawer.
- Use the existing normalized weather and quote APIs, enabling their production configuration rather than adding browser-to-provider calls.
- Reduce menu disclosure to a full bar and one collapsed trigger.

**Non-Goals:**

- Redesign individual author content cards or admin tools.
- Expose visitor coordinates, bypass existing site-widget caching, or invent weather/quote data.
- Replace the top menu's routes, theme controls, or mobile navigation model.

## Decisions

### Make the outer author page the only desktop shell

`AuthorPage` will render the profile route rail, center scroll area, and life-widget rail for all tabs. About and posts will contribute only their center-column content; their nested shell will be removed or reduced to a center-content component. This avoids two competing scroll owners and keeps route changes from remounting the rails. Keeping separate shells per tab was rejected because it reproduces the visible topology and state discontinuity.

### Use fixed rails with a minmax center column

The desktop grid will use a compact fixed/clamped left rail, `minmax(0, 1fr)` center, and fixed/clamped right rail inside the available route height. The shell and rails use `overflow: hidden`; only the center receives primary vertical overflow. The left route list may use contained vertical overflow when necessary. A container query will reflow below the workspace threshold into the existing drawer-based auxiliary experience. Making the entire page scroll was rejected because it moves navigation and life context away from the user.

### Keep route groups vertically stacked at every left-rail width

The menu variant of `RouteDotRail` will no longer turn each group into a horizontal carousel when its container exceeds 200px. Group labels, icons, and labels remain in a stable vertical order; active-item reveal adjusts `scrollTop` only. This directly removes the draggable behavior without changing route data.

### Reuse the backend widget boundary and configure it for production

Weather remains Open-Meteo-backed through `/api/v1/site/weather`; daily quote remains Hitokoto/local-backed through `/api/v1/site/quote/today`. Deployment configuration will explicitly pass the external-widget, weather, quote, and upstream-request flags to the backend. The persisted admin configuration remains authoritative for location, timezone, weather enablement, and quote source. Direct frontend calls to Open-Meteo or Hitokoto were rejected because they bypass caching, attribution normalization, privacy controls, and saved fallbacks.

### Remove the compact desktop dock

When the full top bar is not presented, `TopMenu` will skip the compact route dock and leave only its existing disclosure tab, restyled as a clear collapsed `MENU` button. Existing theme, Home appearance, and atmosphere controls remain available in the full state. Retaining the compact dock was rejected because it creates a third state that the requested interaction explicitly excludes.

## Risks / Trade-offs

- [Some management panels expect app-level scrolling] → Keep the center scroll element stable, retain its existing events, and add route-level regression tests for scroll ownership.
- [The full three-column shell may become cramped at intermediate widths] → Reflow to the existing auxiliary drawer before center content falls below its usable minimum.
- [Enabling external sources can surface upstream outages] → Preserve backend timeouts, snapshots, independent card errors, provenance, and explicit retry controls.
- [Removing the compact dock reduces one-click routes while collapsed] → The single `MENU` trigger restores the complete bar in one action and matches the requested two-state model.

## Migration Plan

1. Ship the frontend shell, route-rail, menu, and tests together.
2. Pass widget feature flags through server Compose and configure a valid site location and quote mode through the existing authenticated admin API.
3. Verify every author tab, center-only scrolling, full/collapsed menu behavior, and live widget responses at desktop and narrow widths.
4. Roll back the application commit and restore the previous environment values if the new shell or provider enablement regresses production.
