## Why

The author area currently uses the intended three-column workspace only for site posts and site about, while other destinations collapse into inconsistent single-row layouts and make the left route list horizontally draggable. Weather and daily quote slots also remain empty in production, and the top menu's intermediate compact dock does not match the requested open-or-hidden interaction.

## What Changes

- Apply one coherent three-column author workspace to every public and management destination, while allowing each destination to keep its own content.
- Restore the left side to a fixed vertical route rail and make the center column the only desktop scroll owner; keep the right life-signals rail stationary.
- Connect the right rail to real weather and daily-quote sources with independent loading, configured, fallback, and retry states.
- Reduce the top menu to two explicit states: the full navigation shell or a fully collapsed state exposing only the `MENU` control.
- Preserve the existing glass material, theme modes, motion levels, responsive reflow, keyboard order, and author route URLs.

## Capabilities

### New Capabilities
- `author-workspace-shell`: Consistent author-area column topology, route-rail behavior, center-only scrolling, responsive reflow, and tab content placement.
- `author-life-signals`: Reliable weather and daily-quote loading in the author right rail with independent fallback and retry behavior.
- `site-menu-disclosure`: Two-state full/collapsed top-menu disclosure with an accessible standalone menu trigger.

### Modified Capabilities

None.

## Impact

- Frontend author page shell, profile rail, life-widget rail, weather card, daily quote card, top menu, and their state helpers/tests.
- Existing weather and quote service calls or public backend endpoints may be reused; no route-path or database-schema change is expected.
- Desktop layout and navigation behavior change visibly, while tablet/mobile retain structural reflow rather than fixed three-column scrolling.
