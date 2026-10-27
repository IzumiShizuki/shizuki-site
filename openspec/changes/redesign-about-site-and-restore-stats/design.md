## Context

See proposal.md for motivation. About currently reads nonexistent profile counters and imperatively animates text once after mount. Public blog endpoints already expose a paginated total and complete visible category/tag catalogs. The working tree contains unrelated account changes that must remain separate.

## Goals / Non-Goals

Keep data ownership separate from the presentational overview, reuse anonymous public requests, and preserve the existing author workspace. No new backend metrics, dependencies, fabricated traffic totals, global theme changes or deployment are required.

## Decisions

- Use a small `usePublicSiteStats` composable in the shared experience. Request `listPosts({pageNo:1,pageSize:1})` and `getPostSidebar()` without an authorized fetch. This provides the true total rather than the current page length or sums that omit uncategorized posts.
- Load sources independently and retain successful metrics if another source fails. Missing/invalid data stays null; explicit zero remains zero. Deduplicate nonempty category/tag codes, accepting the API's snake_case and camelCase forms. Categories include configured visible categories, including empty ones.
- Render counters through Vue interpolation. Eliminate mount-only global selectors and animation timers, which race asynchronous data and target other component instances. Show pending and unavailable states plus a retry action.
- Visual concept: a personal observatory of the site's writing and interests. Asymmetric text/arched photograph composition, static elliptical orbits, a starburst and circular avatar provide geometry without enclosing every fragment in a rectangle. A quieter data band, wrapping skill constellation and open destination rows establish rhythm. Use the current display/body fonts and theme/accent tokens; indicative existing palette: peach #f2b39d, rose #efa0a8, warm purple #221825, night ink #161016, warm light #fff2e9. The existing day theme and selected accent remain authoritative.
- Extend the same curved motif into the story image, a circular direction marker, an asymmetric interest panel and open external-link rows. Preserve content and every edit/link event. Use one short entrance motion; no pointer tracking or continuous particle loops. Default content is visible; respect reduced motion.

## Risks / Trade-offs

- Public requests can fail independently → retain successful counts, identify unavailable values and offer retry without clearing usable data.
- Narrow center column inside shared rails → use container queries and verify both the full workspace and narrow viewports.
- Theme surfaces can contain gradients → use `background` for surface tokens and solid accent/text tokens for geometry colors.
- Removing unsupported project/view counters changes labels → replace with explicitly sourced article/category/tag counts and disclose that these are public-content statistics.

## Migration Plan

Ship as a frontend-only update after regression tests, production build, browser checks and strict spec validation. Roll back the scoped commit if required. No server migration is needed.
