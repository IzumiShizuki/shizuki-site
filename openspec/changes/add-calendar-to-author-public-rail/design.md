## Context

See `proposal.md` for the user problem and scope. The blog list already renders `PublicPostCalendar`, which loads public publication counts and emits day selections. `AuthorPage` renders `AuthorProfileRail` both in the desktop shell and auxiliary drawer. The blog route currently keeps panel state in the query string but does not restore a selected day from the URL.

## Goals / Non-Goals

**Goals:**

- Reuse the existing calendar, date aggregation, and theme styling.
- Make date selection from either author rail navigate to a shareable filtered blog route.
- Keep the selected date and month in sync when the blog route is opened from that link.

**Non-Goals:**

- Add a second calendar implementation or change the publication aggregation API.
- Add date filtering to other profile pages or admin workspace rails.

## Decisions

### Render the shared calendar only in the public content rail

Use the existing compact-public-profile state to show the calendar after the author navigation and public paths. Both desktop and auxiliary drawer instances use the same component, matching the existing rail behavior. Keep its existing density and semantic theme tokens so it visually matches the Blog page.

Alternative considered: build a separate author calendar. Rejected because it would duplicate date loading, accessible labels, and error handling.

### Carry the selected date through the blog route query

The author rail forwards selected dates to `AuthorPage`, which navigates to `/blog?date=YYYY-MM-DD`. `BlogListPage` validates that value, initializes its day range before the first list request, and removes it when the date filter is cleared or replaced with a month archive. `PublicPostCalendar` aligns its visible month with a valid selected date.

Alternative considered: keep the selection only in in-memory state. Rejected because navigating from the author route would lose the filter before the blog page loads and would not provide a linkable state.

## Risks / Trade-offs

- A stale or malformed query value could hide posts → Validate the exact `YYYY-MM-DD` shape and ignore invalid values.
- The auxiliary drawer remains open during navigation → Close it as part of the author's date-selection handler.

## Migration Plan

No data or server migration is required. Deploy the frontend change with the existing calendar API; rollback consists of reverting the frontend change.
