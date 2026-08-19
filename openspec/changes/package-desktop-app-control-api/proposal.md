## Why

Shizuki currently runs as a browser-only Vue application, so it cannot be installed and launched like a native Windows application or safely controlled by a separate local companion. Packaging the existing frontend as a desktop application and defining a narrow local control contract creates a stable integration point for Meguri Pet without granting arbitrary code execution.

## What Changes

- Add an installable Windows desktop distribution that bundles the existing Vue frontend and connects it to the existing remote Shizuki API.
- Add native desktop lifecycle behavior including single-instance startup, persisted window bounds, external-link handling, and a development launch workflow.
- Add a versioned loopback-only control API for health, capabilities, application state, semantic commands, and state/result events.
- Authenticate local control requests with a generated bearer token stored in the current user's application-data directory.
- Add a renderer bridge that maps allowlisted commands to route navigation and music controls while keeping Electron privileges out of the Vue renderer.
- Add packaging, contract tests, operator documentation, and a Meguri Pet integration guide.

## Capabilities

### New Capabilities

- `desktop-application`: Packages and runs Shizuki as an installable Windows desktop application backed by the existing site services.
- `desktop-control-api`: Provides an authenticated, loopback-only semantic control contract intended for Meguri Pet and other trusted local clients.

### Modified Capabilities

None.

## Impact

- Frontend build configuration and runtime detection under `fronted/vue3-merged`.
- New Electron main/preload modules, desktop bridge code, tests, packaging metadata, and documentation.
- New development dependencies for Electron packaging.
- Runtime reads and writes limited to Electron's per-user application-data directory; no backend API or remote deployment changes are required.
