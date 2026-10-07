## Verification Report: unify-calendar-deadline-details

| Dimension | Result |
| --- | --- |
| Completeness | 7/7 tasks; 4/4 requirements implemented |
| Correctness | Deadline/range/precision/overflow/article/privacy scenarios covered |
| Coherence | Shared projection, scoped source/cache, dialog, explicit article action follow design |

### Requirement evidence

- Shared entries: `timePrismCalendarEntries.js` with projection, inclusive date matching, full dates/times and status. Its three tests cover all sources, hidden/undated/reversed ranges, precision, day deadlines, overflow, and late Sunday range clipping.
- Complete date details: `CalendarDateDetails.vue` is used by compact and full calendars. The TimePrism window test covers seven items despite a four-item preview, range starts, and empty dates. Native dialog browser checks verify Escape, focus restoration, and a 390px viewport.
- Public/private coexistence: `PublicPostCalendar.vue` shows separate counts and markers. Its three tests and BlogListPage's twelve tests cover task-only details, explicit public article selection, filter clearing, mobile drawer routing, and stale month responses. The browser check exercises the author rail too.
- Account freshness: `useTimePrismCalendar.js` and scoped storage helpers guard requests by sequence and expected user; guest/editor storage events refresh the source and visible focus/interval polls fetch remote changes. Four composable tests cover account-switch races, rejected old cache writes, logout/guest updates, scoped offline fallback, and local-write invalidation.

### Validation

- Targeted Vitest: eight files, 51 tests passed, including existing AuthorPage and BlogListPage regression suites.
- `pnpm build`: passed. Existing bundle-size advisories remain; no compilation errors.
- Edge headless UI check: article/calendar actions, seven-item details, local completion changes, author reuse, Escape/focus, and mobile dialog sizing passed without page errors.
- `openspec validate unify-calendar-deadline-details --type change --strict --no-interactive`: passed.
- `git diff --check`: passed for this change.

No critical issues or functional warnings. Review harnesses were removed and their Vite servers stopped. No new dependency, server migration, deployment, or remote push was performed. Both site and companion use the existing authenticated TimePrism records; the companion currently projects Todos, while the site also projects board tasks and schedules.
