## Context

See proposal.md for motivation. QrPanel already has file selection, a clipboard-read button, Canvas/jsQR decoding and task identifiers for preview cleanup. Its scan view has no paste/drop handlers. The main specs directory is empty; the earlier web-toolbox-qr change has not been archived.

## Goals / Non-Goals

**Goals:** Bind browser paste/drop events to one local image decoder and cover actual component event paths with generated QR pixel data. Keep async input results scoped to the current scan session.

**Non-Goals:** Remote image fetching, automatic URL navigation, dependency changes and changes to QR generation/WiFi composition.

## Decisions

- Use the scan preview column as a focusable paste/drop area with clear instructions, focus and drag states. Put paste handling on the scan panel so gestures on its result controls also work. Keep file selection and clipboard/camera buttons as alternatives. A global document handler would capture unrelated tool inputs and is unnecessary.
- Extract local image selection into a small helper: prefer image entries in DataTransfer items, then files; accept image MIME types or known extensions only when MIME is empty. Ignore arbitrary HTML and remote URLs to keep image processing local.
- Feed accepted images into the existing Canvas decoder. Clear the previous payload at decode start, move object URL creation into the guarded error path, and expose status while decoding.
- Use a separate input-session generation for pending clipboard reads; invalidate it on replacement, clear, mode exit, camera start and unmount. Keep the existing decode identifier for loaded images. Revoking previews alone cannot stop an already pending clipboard read from recreating one.
- Validate events using mounted Vue components and genuine QR pixels; mock only image loading/Canvas in jsdom. Add a real-browser check if the existing browser runtime supports it. No new dependencies are required.

## Risks / Trade-offs

- Clipboard APIs vary by browser → direct paste reads the user-supplied event; button failures direct users to Ctrl+V / Cmd+V.
- Multiple dragged files → decode the first supported image and ignore remaining files.
- Invalid/corrupt images → catch load and Canvas errors, clear stale results and display retry guidance.
- Async clipboard/image operations outlive the panel → check session/task identifiers before mutating state and revoke previews on teardown.
