## Why

The blog and site introduction calendars only expose public article dates, while TimePrism already stores personal Todo deadlines and schedule ranges. Users need to open a date and see which items are due, their exact deadlines, and completion state consistently across the site and their desktop companion.

## What Changes

- Add a shared, account-aware TimePrism calendar data source and entry projection for Todos, board tasks, and schedules.
- Show personal deadline markers alongside public article counts in the blog and site introduction calendars. Date details expose item title, source, project, start/deadline, and completion/overdue state.
- Retain public article browsing through an explicit article action in the date details, without applying an article filter when opening a task-only date.
- Make TimePrism calendar dates and range bars open the same complete date details, including entries beyond the compact preview limit.
- Refresh calendar data after local Todo changes and on focus; prevent stale responses or another account's cache from showing personal items.
- Coordinate the desktop companion's Todo calendar in a separate repo-local OpenSpec change in `D:/program/meguri-pet`, using its existing authenticated Shizuki Todo bridge.

## Capabilities

### New Capabilities

- `personal-calendar-deadlines`: Shared private TimePrism calendar entries, date details, refresh behavior, and public-calendar integration.

### Modified Capabilities

None. Existing article endpoints and Todo write contracts remain compatible.

## Impact

Vue frontend calendars, a reusable date-detail component, TimePrism entry utilities/composable, and local data change notifications. No backend API or database migration is required. The companion work is tracked independently in its repository; both clients use existing TimePrism data, with no new dependency or deployment.
