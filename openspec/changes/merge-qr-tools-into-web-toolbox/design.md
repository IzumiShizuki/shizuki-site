## Context

The Web Toolbox is a single light-app window whose left rail lists tools and whose workspace renders the selected tool inline. Every existing tool follows that contract: selecting it renders a working panel, and `activeResultText` exposes its output to the shared 复制结果 action.

`qr-tools` breaks the contract. `webToolboxCore.js` registers it as a normal tool, but `WebToolboxWindow.vue` renders a `qr-launcher` card whose only action calls `openLightAppWindow('qr-tools')`. The real implementation lives in `qr/QrToolsWindow.vue` as a second light app with its own catalog entry, shared window id (`910007`), window preset and host mapping. The toolbox therefore ships a QR entry that cannot render QR.

Generation, recognition and WiFi composition already work inside `QrToolsWindow.vue`, which imports `qrcode` for rendering and `jsqr` for decoding and supports image files, clipboard images and a camera loop. Production verification confirmed a real QR image decodes to its payload. Nothing about recognition is broken; it is only reachable from the detached window.

See `proposal.md` for motivation and `specs/web-toolbox-qr/spec.md` for required behavior.

## Goals / Non-Goals

**Goals:**

- Make QR generation, recognition and WiFi composition runnable inside the Web Toolbox workspace.
- Keep one entry point for QR instead of two overlapping light apps.
- Preserve the local-only guarantee and the existing decode/render behavior.
- Keep the QR logic testable without mounting a component.
- Leave persisted user state meaningful after the standalone app is deleted.

**Non-Goals:**

- Adding a QR backend, upload, history, or server-side decoding.
- Changing TXT/URL/JSON/other toolbox tools, or the Web Toolbox window shell.
- Making QR a third-party or plugin tool.
- Preserving a `qr-tools` deep link for API compatibility; the code is removed and references migrate instead.

## Decisions

### 1. Three toolbox tools instead of one launcher entry

`webToolboxCore.js` gains `qr-generate`, `qr-scan` and `qr-wifi` in the Web 实用工具 group, replacing the single `qr-tools` entry. Each opens a real panel, so the rail, the overview grid, search, `clearActiveTool` and `activeResultText` all behave like any other tool.

Alternative considered: keep one `qr-tools` entry and render the three modes as tabs inside the panel. That keeps the rail compact but hides recognition behind a second click, which is the discoverability defect being fixed. Three entries make 二维码识别 directly visible in the tool list and searchable by name.

### 2. One shared panel component with an explicit mode prop

The generate, scan and WiFi surfaces share options, feedback and preview state, so they live in one `toolbox/qr/QrPanel.vue` that receives the active mode. The toolbox renders it for all three tool codes. This avoids triplicating the camera lifecycle, clipboard handlers and preview rendering.

Alternative considered: one component per mode. Rejected because the scan mode owns camera and object-URL cleanup on unmount, and duplicating that lifecycle three times invites leaks.

### 3. Deterministic helpers move into the QR core module

`qrToolsUtils.js` is extended with the pure pieces that are worth testing directly: QR render-option normalization, payload kind inference (already present), WhatsApp/WiFi payload escaping (already present), and decode-preview sizing. The `jsqr` call stays in the component because it needs `ImageData`, but it is isolated in a thin function so a spec can exercise it with synthesized pixel data.

Alternative considered: move `jsqr` decoding into the core module. That is done — `decodeQrImageData` takes plain `{data, width, height}` and is unit-testable under jsdom with a generated QR bitmap.

### 4. Delete the light app and migrate references

The catalog entry, `LIGHT_APP_SHARED_WINDOW_IDS` entry, `WINDOW_PRESETS` entry, host mapping, host spec mock and the `QrToolsWindow.vue` file are removed. `lightAppsState.js` gains a legacy code alias mapping `qr-tools` → `web-toolbox`, applied through the existing `normalizeCodeAlias` path, so a persisted enabled code or rail slot resolves to a valid app instead of being dropped.

The persisted toolbox active tool (`shizuki.web-toolbox.active.v1`) may hold `qr-tools` or `qr-generate`; `readInitialTool` maps the removed code to `qr-generate` and otherwise falls back as today.

Alternative considered: keep `qr-tools` as a hidden alias for `web-toolbox`. That keeps a catalog-less code alive forever and complicates `isKnownLightAppCode`; an explicit one-way migration is simpler and leaves no ghost.

## Risks / Trade-offs

- **[Existing users lose the QR rail slot]** → The alias migrates the enabled code and rail slot to `web-toolbox`, which is already an enabled-capable app, so no slot is left empty or dangling.
- **[Camera requires permission and may be unavailable]** → The scan tool keeps the existing capability check and shows a clear message; image and clipboard scanning remain available without a camera.
- **[Three rail entries lengthen the tool list]** → Search matches title, summary and code, and the overview grid groups by category, so the added entries stay discoverable.
- **[Larger toolbox bundle]** → `qrcode` and `jsqr` were already bundled for the removed light app; moving them into the toolbox chunk keeps total application size roughly unchanged.
- **[jsdom lacks canvas and camera APIs]** → Component behavior is covered through the pure helpers plus a real-browser verification pass; unit specs avoid asserting on APIs jsdom does not implement.

## Migration Plan

1. Add the QR core helpers and the shared panel, and register the three toolbox tools.
2. Remove the launcher branch, the standalone component, and the light-app registrations.
3. Add the `qr-tools` → `web-toolbox` state alias and the active-tool migration.
4. Run unit tests, the production build, and a browser check of generate, image scan and the rail entries.
5. Rollback is a revert of the change: no database, API or stored-server data is involved.
