## Context

The existing TimePrism data contract contains numeric start and deadline reminder offsets with units, but service normalization and editing controls treat zero as an absent value. The browser reminder host then omits an offset of zero while it builds due events. See `proposal.md` for the user-facing motivation.

## Goals / Non-Goals

**Goals:**

- Give zero a single, unambiguous meaning: trigger at the associated timestamp.
- Keep current positive-offset reminder behavior and existing API shapes intact.
- Make the choice available and stable in all TimePrism item editors.

**Non-Goals:**

- Add server-side scheduling, push delivery, desktop notifications, or reminders while the site is closed.
- Change storage schema, endpoint paths, authentication, or reminder behavior for invalid offsets.

## Decisions

### Represent exact time as `0 MINUTE`

The service will allow zero only when the paired unit is `MINUTE`, then preserve it through request normalization and response mapping. This uses the existing persisted fields without a migration and avoids treating `0 DAY` or `0 HOUR` as competing representations. A separate boolean or new enum would require a schema and API expansion without adding user-visible value.

### Keep the reminder host's due-window algorithm

The host will distinguish an invalid/missing offset from numeric zero and create an event for either a non-negative start or deadline offset. Its existing de-duplication and grace window will therefore apply equally to exact-time and advance reminders. Replacing the polling host with a scheduler or push channel is outside this compatibility change.

### Add an explicit form action while accepting zero in validation

Each editor will expose a “准时” action that writes value zero and unit `MINUTE`; numeric inputs will also accept zero and their normalization will retain it. This supports discovery and editing existing data without taking away arbitrary positive offsets. Replacing the numeric control entirely with a fixed list would limit existing reminder choices.

## Risks / Trade-offs

- [Browser background limitations] → The existing host only evaluates reminders while the TimePrism page is active and visible; document this as a limitation rather than claiming system-level delivery.
- [Duplicate reminder events] → Reuse the host's current event identity and acknowledgement storage so polling cannot create duplicate cards during one due window.
- [Older malformed data] → Continue treating negative, missing, and unsupported-unit offsets as absent in the browser; service requests reject invalid newly submitted zero configurations.

## Migration Plan

No data migration is needed because zero is representable in the existing nullable numeric fields. Deploy the backend and frontend together where possible; clients without the frontend update continue to send positive offsets. Rollback consists of reverting the application change; persisted zero-minute values remain stored but older clients will not surface reminder cards for them.
