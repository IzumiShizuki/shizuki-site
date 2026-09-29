## Context

The public blog already accepts an exclusive publication range for list filtering, while its sidebar aggregation provides only monthly totals. The existing public author rail deliberately hides its full profile card on the site-introduction experience. See proposal.md and the two capability specs for user-facing behavior.

## Goals / Non-Goals

**Goals:**
- Add one compact, date-exploration surface to the blog left rail using complete public data.
- Reuse public profile data and existing rails rather than creating a competing discovery sidebar.
- Preserve drawer behavior, focus visibility, and narrow desktop readability.

**Non-Goals:**
- A full-year archive, private schedule integration, extra social content, or duplicating latest posts, categories, tags, weather, music, and quotations.

## Decisions

### A small public date aggregation endpoint

Add a month-scoped public endpoint whose response is date/count pairs. It filters through the same published-post candidate path used by the public list and sidebar, so a paginated list cannot undercount calendar dots. Sending all post data to the browser and aggregating there was rejected because the existing list is paginated and would be unreliable and wasteful.

### Calendar uses the stored publication date's calendar day

The API groups each publicly visible post by the date part of its stored publication timestamp. The browser converts the selected YYYY-MM-DD key into a half-open midnight-to-next-midnight range using the same date fields as the existing archive filter. This matches the list filter's LocalDateTime semantics and avoids selecting an arbitrary post when a date has more than one article. The calendar aggregation always uses guest visibility even when an authenticated visitor requests it.

### Rail composition stays compact

Blog uses a small author card and a calendar with compact cells on narrow desktops. At 980–1199px, the right discovery rail starts collapsed so the article feed remains visible; visitors can reopen it as an overlay. At mobile widths the calendar and author entry move into the existing auxiliary drawer. The author rail gets a compact profile presentation and confirmed route links while preserving same-page navigation. Reusing the existing profile card wholesale was rejected because its statistics consume the constrained rail without helping a visitor choose a path.

### Visual direction

The calendar is the signature element: tiny publication counts sit inside restrained seven-column date cells, with one accent treatment for the selected date and a distinct outline for today. Existing liquid surfaces, typography, spacing, and motion conventions remain the system tokens; reduced-motion users receive no additional transition dependency.

## Risks / Trade-offs

- [Timezone differences at day edges] → Define date selection as a half-open local-day range and keep server aggregation aligned with content's established date representation.
- [Small rail widths] → Use compact cells, keep the calendar in the auxiliary drawer when the left rail is hidden, and retain screen-reader labels.
- [Aggregation failure] → Keep primary navigation and provide an in-place retry without affecting the article list.
- [Profile data is incomplete] → Render only public, non-empty fields and routes.

## Migration Plan

Deploy the backward-compatible endpoint with the frontend. Rolling back the frontend leaves the endpoint unused; rolling back the endpoint leaves the calendar retry state and does not block blog navigation.
