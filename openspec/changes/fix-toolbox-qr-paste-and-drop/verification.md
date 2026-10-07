## Verification

Date: 2026-10-02 (Asia/Shanghai).

| Dimension | Result |
| --- | --- |
| Completeness | 5 implementation/delivery tasks completed; 3 requirements implemented |
| Correctness | Direct paste, image drop, invalid input and asynchronous input lifecycle scenarios covered |
| Coherence | Shared local Canvas/jsQR decoder, event-based image input, no new dependencies or backend changes |

### Reproduction and cause

`pnpm exec vitest run src/components/lightapps/toolbox/qr/QrPanel.spec.js` originally failed both paste and drop assertions: the QR result remained empty. The same genuine QR pixel fixture decoded through file selection. The scan panel had no paste/drop event handlers; therefore these gestures never reached image decoding or prevented browser default drop behavior. After event integration both original regressions pass.

### Checks

- Focused toolbox tests: 6 files, 70 tests passed, including 19 mounted QrPanel tests and 14 QR core tests.
- Full frontend suite: `pnpm test:unit`, 254 files and 1551 tests passed. Existing Vue lifecycle warnings were emitted by playbar tests.
- Production: `pnpm build` passed. Existing bundle-size and empty React chunk warnings remain.
- Edge headless, using the running local frontend on port 5173 and a QR image produced by its generation tool:
  - Actual Ctrl+V on the focused image area decoded the expected URL while clipboard.read was deliberately unavailable; no clipboard.read call occurred.
  - Native DataTransfer/DragEvent input with a genuine PNG and an empty MIME type decoded correctly and prevented default drop navigation.
  - Non-image drop displayed actionable feedback.
  - Clear removed the payload and preview; the existing clipboard button decoded correctly after clearing.
  - At a 760px viewport, the QR panel used a single column and had equal client/scroll widths (680px), without horizontal overflow.
  - No page errors occurred; image data remained local. Clipboard contents were restored after the keyboard test.
- OpenSpec strict validation and Git whitespace validation passed.

### Requirement coverage

| Requirement | Implementation and evidence |
| --- | --- |
| Recognition accepts direct image paste | Focusable qr-scan-input plus scan-panel paste event; component paste regression and actual Edge keyboard paste |
| Recognition accepts image drop | Scan-panel drag/drop events, drag depth feedback and first local image selection; component rejection/empty-MIME checks and real PNG browser decoding |
| Image recognition maintains current input state | Shared decoder clears stale results and guards task/session ids; image failure/replacement, clipboard clear/mode-exit/unmount/replacement tests and existing camera cleanup tests |

No critical issues, warnings or skipped requirement checks. No unfinished work remains for this change. Other chats' working-tree changes are outside this commit; this change is kept unarchived and is delivered locally without a push.
