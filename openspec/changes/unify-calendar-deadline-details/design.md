## Context

See proposal.md for motivation. PublicPostCalendar is reused by BlogListPage and AuthorProfileRail. TimePrismCalendarWindow fetches projects/Todos/tasks/schedules independently and only renders truncated labels. Existing editors persist their snapshots via lightAppsDataStore. Its legacy remote cache is global and cannot safely supply private data on public pages. The native desktop repo already reads the same Todo API through an authenticated IPC bridge.

## Goals / Non-Goals

**Goals:** Reuse entry projection and one accessible date-detail component across site calendars; keep account isolation and in-place updates reliable.

**Non-Goals:** Public author Todo publication, backend migrations, new reminders, editing tasks from the detail sheet, or deployment.

## Decisions

- Extract TimePrism entry projection and date matching into pure utilities. Preserve range inclusion, all-day precision, source identity, and existing six-week layout; full detail matching never uses the grid's four-item cap. This avoids divergent date semantics across compact and full calendars.
- Use a shared composable implementation per mounted calendar consumer, backed by existing authenticated API helpers. Scope its private cache by user ID, pass expectedUserId to requests, invalidate responses on account changes, and ignore legacy global cache for reads. Keep the existing global cache for current editor compatibility and emit a data-change notification when editors persist snapshots. Calendar responses use a separate account-scoped cache and do not emit editor events. This bounds the change without migrating every light app.
- On data changes read the newly persisted guest snapshot or refresh the authenticated source; on focus/visibility and a visible-page interval refresh from the server. Writes start a new sequence so older in-flight refreshes cannot overwrite them; periodic/focus refresh skips an ongoing request. Keep loading failures independent from public article loads.
- Render an accessible dialog via Teleport with Escape, focus management, backdrop dismissal, scrollable complete item cards, and explicit article browsing action. This avoids overflowing narrow author/blog rails and accidental navigation for task-only days.
- Add separate article and personal-item markers; opening a date only opens details. Preserve the `select` and `clear` event contract through explicit controls.

## Risks / Trade-offs

- [Account switch races] → Derive scope from reactive authenticated user, clear before loading, and guard all response/cache writes by request sequence and captured scope.
- [Concurrent editor writes] → React to persistence events without a request loop, preserve source snapshots, and ignore in-flight refreshes older than local persistence.
- [Separate desktop checkout has existing work] → Track its own change and commit only calendar files and artifacts. It reuses TodoPanel's current bridge; no credential or IPC contract changes.

## Migration Plan

Deploy frontend artifacts normally when authorized. No data migration is required. Old caches remain compatible for editors but are never used for new calendar private reads. Rollback reverts the scoped calendar integration. Native companion updates are built separately under its own change.
