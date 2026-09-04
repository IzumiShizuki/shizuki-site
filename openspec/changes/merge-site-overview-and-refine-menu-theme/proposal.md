## Why

The public-site entry currently inserts an intermediate destination panel before the About page, while the author workspace separately exposes both “网站主页” and “关于网站” with overlapping content. The top menu also rebuilds an expensive liquid surface when it expands or collapses and mixes theme-derived colors with fixed neutral fallbacks, producing visible stutter and color drift.

## What Changes

- Make the desktop Site entry and mobile Life entry navigate directly to the public About view without opening a second-level menu.
- Retire the separate public “网站主页” destination, merge its useful identity and portal content into the About experience, and redirect legacy `tab=overview` links to `tab=about`.
- Keep public Albums and Moments reachable from the About experience instead of the removed top-level destination popover.
- Preserve the full navigation DOM while expanding and collapsing it, and animate only compositor-friendly properties so the menu responds smoothly.
- Replace fixed gray/blue menu and public-About surface colors in the affected components with semantic theme/background tokens so day, night, wallpaper-derived, and manual accent modes remain visually coherent.
- Add regression coverage for direct navigation, legacy redirects, consolidated About content, menu lifecycle stability, reduced-motion behavior, and semantic color usage.

## Capabilities

### New Capabilities

- `direct-site-about-navigation`: Defines a single-step public-site entry, consolidated About content, smooth top-menu disclosure, and background-derived color consistency for the affected surfaces.

### Modified Capabilities

None.

## Impact

- Frontend-only changes in the Vue application shell, author/About workspace, related theme CSS, and component tests.
- The existing `SiteMenuPopover` is removed from top-menu interaction and may be deleted if no other consumer remains.
- Existing `/author?tab=overview` URLs remain compatible through normalization to `/author?tab=about`.
- No backend API, database, dependency, or deployment contract changes.
