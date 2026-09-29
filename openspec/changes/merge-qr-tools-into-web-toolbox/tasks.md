## 1. QR Core And Panel

- [x] 1.1 Extend the QR core module with pure helpers for QR render-option normalization, decode scaling, a jsQR-backed `decodeQrImageData` that accepts plain image data, and a canvas-free `buildQrBitmap`.
- [x] 1.2 Add `toolbox/qr/QrPanel.vue`: mode-aware panel covering generation options and preview, recognition sources and decoded result, and WiFi composition, with camera and object-URL cleanup on unmount.
- [x] 1.3 Add unit coverage for the helper set, including decoding a rendered QR bitmap back to its payload.

## 2. Web Toolbox Integration

- [x] 2.1 Register `qr-generate`, `qr-scan` and `qr-wifi` in `webToolboxCore.js` and drop the `qr-tools` launcher entry.
- [x] 2.2 Render the QR panel for the three QR tool codes in `WebToolboxWindow.vue`, removing the launcher card and its open-window action.
- [x] 2.3 Wire QR state into tool selection, active-result copy and the shared clear action, and migrate the persisted active tool from the removed code.

## 3. Remove The Standalone Light App

- [x] 3.1 Delete `qr/QrToolsWindow.vue` and its catalog, shared-window-id, window-preset and host-mapping registrations, including spec mocks.
- [x] 3.2 Add the `qr-tools` → `web-toolbox` alias in light-app state migration and cover it with unit tests.

## 4. Verification

- [x] 4.1 Run focused frontend unit tests, the full frontend suite, the frontend production build, and OpenSpec strict validation; fix regressions.
- [x] 4.2 Verify in a real browser that the three QR tools run inside the toolbox, that a generated QR image decodes back to its payload, and that the catalog no longer lists a separate QR app.
- [x] 4.3 Release scan-preview object URLs immediately when leaving recognition mode, invalidate pending camera requests, and cover both cleanup paths with component regression tests.

## Verification Notes

- Production reconnaissance used the deployed site to capture the pre-change behavior: the toolbox QR entry rendered a launcher card, and the detached QR window decoded a real QR fixture. Confirmed the defect was integration, not decoding.
- Post-change verification used Playwright Chromium against a local Vite dev server: catalog/rail assertions, a generate → scan round trip of the same payload, WiFi payload escaping, toolbar copy and PNG/SVG downloads, the shared clear action, and camera start/stop/release on tool switch.
- The camera check required the panel's video element to stay mounted with `v-show`. A `v-if` left the refs null when the stream arrived, which aborted the camera; the browser pass now reports a live stream, a clean stop, and no page errors.
- jsdom lacks canvas and camera APIs, so component-level camera and clipboard behavior is verified in the browser rather than in unit specs.
