## Why

TimePrism currently treats a reminder offset of zero as absent. Users therefore cannot save an explicit reminder for the exact start or deadline time, even though this is a valid and common reminder choice.

## What Changes

- Accept and persist a zero-minute reminder offset when the matching reminder unit is `MINUTE`.
- Preserve that value in TimePrism editing forms and provide a clear “准时” option.
- Treat a persisted zero-minute offset as a due reminder at the target start or deadline time.

## Capabilities

### New Capabilities

- `timeprism-at-time-reminders`: TimePrism supports exact-time start and deadline reminders across saved items and the browser reminder host.

### Modified Capabilities

- None.

## Impact

- `LightAppServiceImpl` reminder normalization and its existing TimePrism service tests.
- TimePrism Todo, Task Board, Schedule and reminder-host frontend components.
- No endpoint paths, authentication rules, migrations, external dependencies, or deployment configuration change.
