## Context

See `proposal.md` for motivation and `specs/direct-site-about-navigation/spec.md` for observable behavior. `TopMenu` currently conditionally mounts the liquid top bar, owns a Site popover with asynchronous preview loading, and uses several `transition: all` declarations. `AuthorPage` treats `overview` as the default public tab even though the newer About composition already owns the public story and life-content rails.

## Goals / Non-Goals

**Goals:**

- Establish one canonical public-site landing state while preserving existing author/profile data and old URLs.
- Reuse the existing About composition and incrementally bring the strongest overview elements into it instead of maintaining two competing public landing layouts.
- Keep menu disclosure work on the compositor path and retain accessible focus behavior.
- Make the touched navigation and About components consume the same semantic theme contract.

**Non-Goals:**

- Redesign the global Home time stage or change the Home appearance popover behavior.
- Remove the standalone Albums or Moments routes.
- Change the author-profile API schema or administrative permissions.
- Perform a site-wide replacement of every historical color literal outside the affected navigation and public About surfaces.

## Decisions

### Navigate Site and Life through the existing author event

`TopMenu` will emit its existing author-navigation intent directly from both Site/Life controls. `App.vue` remains the single router owner and will target `/author?tab=about`. The `SiteMenuPopover` import, state, global pointer listener, focus-return plumbing, and preview fetch path will be removed from the menu.

Alternative considered: keep the popover but make About its only destination. A one-item intermediate layer adds latency and interaction cost without adding choice.

### Canonicalize legacy overview state at the author-tab boundary

`AuthorPage` will treat absent, invalid, edit, and legacy `overview` values as About for public users. The public tab list will drop Overview, while edit helpers that previously targeted overview data will redirect to the About editor until the data model can be consolidated separately.

Alternative considered: add a router redirect only. Component-level normalization is still required for tests, programmatic tab selection, and saved internal links, so the canonicalization belongs at the tab boundary.

### Compose overview highlights inside the About view

The About center column will receive a compact introduction/portal section sourced from the existing hero, identity, skills, and status data before the established About story and life rails. Existing data fields remain unchanged, and the large legacy overview-only template can be removed once parity tests prove the content remains reachable.

Alternative considered: render the entire legacy overview template above the current About story. That would duplicate About text, create an excessively long page, and preserve two visual systems inside one route.

### Keep the liquid top bar mounted

The full top bar will render once and switch between expanded and collapsed accessibility states. Desktop collapse uses opacity and a small translate/scale transform with `visibility`, pointer-event, and focus suppression; compact toggle dimensions will change discretely or outside the transition path. Mobile drawer motion keeps its existing transform-based pattern. Broad `transition: all` rules on menu controls will be narrowed to explicit paint/composite properties.

Alternative considered: cache and remount the top bar after each toggle. Vue still has to recreate the subtree and liquid filters, so caching does not eliminate the main-frame spike at the interaction boundary.

### Treat semantic theme tokens as the color source of truth

Affected component colors will use `--theme-*`, `--accent-*`, and shared shadow tokens. Fixed RGB fallbacks that encode the prior blue-gray palette will be replaced with nested semantic fallbacks; unavoidable transparent and black shadow channels remain structural rather than neutral UI colors. Contrast-safe accent text continues to use `--accent-surface-text` or `--accent-readable-rgb` according to the surface.

Alternative considered: create component-specific gray variables. That would preserve the same drift under a new name and would not react to wallpaper-derived accent changes.

## Risks / Trade-offs

- [Risk] Removing the Site popover reduces the discoverability of Albums and Moments. → Keep both as labeled, keyboard-accessible destinations inside About and retain their standalone routes.
- [Risk] Legacy overview content may be lost while consolidating. → Add component assertions for identity, status, skills, portal destinations, and About story before removing the old public tab.
- [Risk] A mounted but collapsed menu could remain focusable. → Apply `inert` and `aria-hidden` while collapsed and add tests for the state contract.
- [Risk] Persistent backdrop/filter layers may consume idle GPU memory. → Keep the collapsed surface small, non-interactive, and without animated filters; verify runtime behavior in the browser performance panel.
- [Risk] Replacing fixed colors can lower contrast in an uncommon custom accent. → Route accent-filled foregrounds through the contrast-safe token and visually verify both day and night modes.

## Migration Plan

1. Ship frontend tab normalization so old `overview` links immediately land on About.
2. Switch desktop and mobile public-site controls to direct author navigation and remove the popover path.
3. Add the compact overview highlights to About, then remove the redundant public Overview entry/template.
4. Apply the persistent menu disclosure and semantic color cleanup.
5. Roll back by restoring the previous frontend bundle; no stored data requires restoration.
