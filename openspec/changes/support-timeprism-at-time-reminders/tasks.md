## 1. Reminder data compatibility

- [x] 1.1 Update TimePrism reminder normalization to preserve `0 MINUTE` and reject zero with other units.
- [x] 1.2 Add focused service coverage for saving a zero-minute reminder and rejecting unsupported zero-unit combinations.

## 2. TimePrism editor and delivery behavior

- [x] 2.1 Update Todo, Task Board, and Schedule editors to retain zero values and offer a “准时” action for supported reminders.
- [x] 2.2 Update the browser reminder host so a zero-minute offset creates a due start or deadline event.
- [x] 2.3 Add or update focused frontend coverage for exact-time reminder normalization and due-event behavior.

## 3. Verification

- [x] 3.1 Run the affected backend and frontend test targets.
- [x] 3.2 Validate the OpenSpec change artifacts and reconcile implementation against the requirement scenarios.
