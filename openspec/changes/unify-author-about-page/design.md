## Context

See `proposal.md` for motivation. The author route currently selects one public component branch from the `tab` query, while the About branch already embeds a shortened journey preview. The same route also reuses an administrator-oriented profile rail, and the hero image receives global wallpaper blur/overlay tokens. The existing three-column shell, life widgets, author content components, public APIs, and responsive auxiliary drawer must continue to work.

The spatial thesis is a linear reading path: a clear site photograph leads into the About introduction, then the complete Journey archive, then Posts. A narrow sticky rail supports that path as an in-page table of contents; the life rail remains secondary. Major sections receive generous vertical separation while cards within a section retain the existing compact rhythm.

## Goals / Non-Goals

**Goals:**

- Keep one mounted public content page while supporting clicks, scrolling, direct section links, and legacy public URLs.
- Reuse the established About, journey data, Posts, albums, moments, and life widgets instead of duplicating their API behavior.
- Preserve semantic theme tokens and responsive navigation parity.
- Keep administrator console routes and editors intact outside the public reading page.

**Non-Goals:**

- Changing public author APIs, stored data, or backend services.
- Redesigning author management forms or the right-side life widgets.
- Generating or replacing the administrator-configured cover asset.

## Decisions

### 1. Canonicalize public content on `tab=about` with an optional section query

`tab=about` remains the canonical public route. `section=journey` and `section=posts` identify deep-link positions; the About destination omits `section`. Legacy `tab=journey` and `tab=posts` URLs are replaced with these canonical equivalents and scrolled after the unified content is mounted.

This avoids three route-mounted page variants and preserves shareable destinations. Separate child routes were considered, but they would retain route-level fragmentation and require more router configuration for no user-visible benefit.

### 2. Derive the public rail independently from administrator navigation

On the public page, both desktop and auxiliary rails receive only the three public destinations, a content-navigation heading, and no profile summary. On an administrator console or site-settings destination, the existing full rail remains unchanged. The active public item is synchronized from either a click/deep link or the scroll position inside the existing content scroll root.

This keeps the public reading surface calm without removing management route support. Mixing content anchors and management actions in one rail was rejected because it recreates the current hierarchy problem.

### 3. Compose all public sections inside the existing experience component

The public experience renders three explicit section anchors in DOM order. The About story suppresses its three-item journey preview; a dedicated archive block renders every journey item, and the existing public Posts column is mounted after it. Albums and moments remain attached to the About section because they are personal context rather than primary destinations.

Reusing the old dedicated Journey page was considered, but it carries page-specific sticky-axis state and an independent layout that conflicts with a continuous document.

### 4. Use a clear image plus SVG wave without backdrop filtering

The hero image uses its source pixels without wallpaper blur, scaling, or backdrop filters. A lightweight gradient controls text-edge contrast, while a non-interactive SVG wave inherits a solid theme-derived introduction color and covers the image’s lower edge. The content surface shares that color so no gray seam appears in either theme.

A clipped CSS polygon was considered, but an SVG path provides a smoother responsive curve and predictable edge coverage without introducing an image dependency.

### 5. Keep responsive DOM order and reuse the auxiliary drawer

Desktop retains the three-column shell with a narrower public left rail. At the existing responsive breakpoint, that rail hides and the current auxiliary drawer exposes the identical destination array. The center document order remains meaningful without either rail, so keyboard and screen-reader reading order matches the visual sequence.

## Risks / Trade-offs

- [Scroll-driven active state can oscillate near section boundaries] → Use one activation line below the scroll-root top and choose the last section crossing it.
- [Route updates can trigger remount or scroll loops] → Keep the public render key stable and compare canonical query values before replacing them.
- [Posts now load whenever the About page opens] → Reuse the existing bounded posts request and empty/error states; no additional request is introduced per scroll.
- [A very short final section may never cross the activation line] → Treat near-bottom scroll position as the last section.
- [Configured covers vary in contrast] → Keep a subtle bottom-only contrast gradient while explicitly avoiding blur and glass filters.

## Migration Plan

1. Add regression tests for unified composition, ordering, legacy-link canonicalization, rail behavior, and hero structure.
2. Switch public routing and rails to canonical About plus section deep links.
3. Replace the branched public composition and blurred hero.
4. Run unit, build, static UI, and browser checks in both desktop and compact layouts.

Rollback is a frontend-only revert: restore the public tab branches and old hero styles. No stored data or API migration is required.
