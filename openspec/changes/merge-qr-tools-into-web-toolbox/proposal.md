## Why

The `qr-tools` light app duplicates what the Web Toolbox is for. Its toolbox entry is only a launcher: selecting 二维码工具 inside the toolbox renders a card whose single button opens a *second* window, so the toolbox owns a tool it cannot actually run. Users therefore meet two overlapping entry points for the same feature, and the one they reach from the toolbox never shows recognition.

Recognition itself is not missing from the codebase — the standalone window already bundles `jsqr` and decodes images. The defect is that recognition is only reachable inside the detached window, while the toolbox presents a QR entry that reads as "generate" and dead-ends in a launcher. The outcome users report as "只有编写二维码没有识别二维码" follows from that split.

## What Changes

- Replace the single launcher-style `qr-tools` toolbox entry with three runnable Web Toolbox tools: 二维码生成, 二维码识别 and WiFi 二维码.
- Move the QR generate, scan and WiFi implementations into an embeddable panel that runs inside the toolbox workspace, reusing the existing local-only QR core.
- Keep recognition first-class inside the toolbox: image file, clipboard image and camera scanning, with the decoded payload, copy and open-link actions.
- Remove the standalone `qr-tools` light app: catalog entry, shared window id, window preset, host component mapping and the window component itself.
- Migrate persisted light-app state so an existing `qr-tools` enabled code or rail slot resolves to `web-toolbox` instead of becoming a dead slot, and migrate the persisted toolbox active tool from `qr-tools` to `qr-generate`.
- Preserve the existing local-only guarantee: no QR payload, image or camera frame leaves the browser.

## Capabilities

### New Capabilities

- `web-toolbox-qr`: QR generation, recognition and WiFi card composition as first-class Web Toolbox tools, including the removal of the standalone QR light app and migration of references to the toolbox.

### Modified Capabilities

None.

## Impact

- Frontend Web Toolbox: tool catalog, tool selection, active-result and clear handling, and the new QR panel component.
- Frontend QR core module: gains testable render-option, decode and preview helpers.
- Frontend light-app catalog, window runtime, window host and light-app state migration.
- Removal of `src/components/lightapps/qr/QrToolsWindow.vue`.
- No backend, API, database or new dependency change; `qrcode` and `jsqr` remain the only QR dependencies.
