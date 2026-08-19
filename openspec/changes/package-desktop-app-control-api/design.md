## Context

See `proposal.md` for motivation and the two capability specs for observable behavior. The target is the Vue 3/Vite application in `fronted/vue3-merged`; it already uses hash routing, bearer-token APIs, relative `/api/` resources, and a central player owned by `App.vue`. The repository has Node 24 and pnpm available but no Rust toolchain. A separate Electron application exists at `D:\program\meguri-pet`, so cross-process integration cannot rely on Electron IPC shared between the two applications.

The current frontend also ships through Capacitor. Desktop detection therefore must extend, rather than replace, the existing native-shell checks. Remote middleware and API ownership remain on `111.228.35.186`; the desktop build must not silently switch the project to local middleware.

## Goals / Non-Goals

**Goals:**

- Produce a reproducible Windows installer from the existing frontend workspace.
- Keep the renderer least-privileged while supporting native lifecycle behavior.
- Give Meguri Pet a small, versioned contract that can grow without coupling it to Vue component details.
- Make transport, validation, dispatch, and renderer command mapping independently testable.

**Non-Goals:**

- Bundle the Java monolith, PostgreSQL, Redis, Kafka, or Meguri Core into the installer.
- Provide offline application data; only the frontend bundle is local.
- Modify the `meguri-pet` repository in this change.
- Expose arbitrary DOM selectors, JavaScript evaluation, shell execution, unrestricted URLs, or filesystem access.
- Add auto-update or code signing before a signing identity and release channel are chosen.

## Decisions

### 1. Use Electron for the first desktop distribution

The desktop host will live below `fronted/vue3-merged/desktop` and use Electron plus electron-builder. It reuses the installed Node toolchain and the same major desktop technology already used by Meguri Pet. The installer target will be per-user NSIS on Windows, with an unpacked target retained for fast local validation.

Alternative considered: Tauri. Its smaller runtime is attractive, but this machine has no Rust toolchain and adding one would expand the environment and implementation surface before the product contract is proven. The control protocol remains host-neutral so a later Tauri migration need not change Meguri Pet.

### 2. Serve bundled assets and proxy API requests through a privileged custom scheme

The host will register `app://shizuki` as a standard, secure scheme. Static requests resolve only inside the packaged Vite `dist` directory with traversal checks and SPA fallback to `index.html`. Requests under `/api/` are streamed to a configurable HTTPS/HTTP gateway using Electron networking. This preserves relative URLs, streaming responses, and authenticated headers without disabling renderer web security or requiring permissive server CORS.

Alternative considered: `file://` plus an absolute `VITE_GATEWAY_BASE_URL`. Rejected because it creates opaque origins, breaks root-relative assets, and depends on backend CORS behavior. Loading the live website directly was also rejected because the application would cease to be a bundled local frontend.

### 3. Separate native commands from renderer semantic commands

Window commands execute in the main process. Navigation and music commands are sent to the renderer with a generated command identifier, then acknowledged through a private IPC channel. The preload exposes only subscription, acknowledgement, and state-reporting functions. A renderer bridge maps allowlisted protocol commands onto Vue Router and the existing player state.

Alternative considered: expose Electron IPC methods directly as a broad `window` object. Rejected because it couples Meguri to internal channel names and makes privilege review harder. DOM scripting or DevTools protocol control was rejected because it is fragile and violates the semantic-only boundary.

### 4. Use loopback HTTP plus server-sent events for cross-process control

The main process will start an ephemeral-port HTTP server on `127.0.0.1`. JSON endpoints cover health, capabilities, state, and commands; SSE covers state/result events and bounded replay. This transport is dependency-light, easy for TypeScript or Python Meguri components to consume, and handles one-way observation without WebSocket framing complexity.

The initial protocol is `1.0`. Commands include `app.navigate`, `window.show`, `window.hide`, `window.focus`, `window.minimize`, `window.toggleVisibility`, `music.play`, `music.pause`, `music.toggle`, `music.next`, and `music.previous`. Navigation accepts stable destination keys rather than arbitrary external URLs.

Alternative considered: a fixed TCP or WebSocket port. Rejected because fixed ports collide and WebSockets add protocol and dependency surface without a current bidirectional streaming requirement. Named pipes were rejected because they complicate Python/TypeScript interoperability and future non-Windows support.

### 5. Discover through an authenticated per-user manifest

At startup the host generates a 256-bit random bearer token and atomically writes `control-api.json` below Electron's `userData` directory with endpoint, protocol version, PID, token, and creation time. The server binds only to IPv4 loopback. Protected endpoints compare bearer tokens using constant-time comparison and apply request-size and command-timeout limits. The health endpoint reveals only liveness and protocol version.

The token intentionally grants control only for the process lifetime. A same-user process that can read the manifest is considered trusted for this first version; the manifest is removed during normal shutdown and overwritten atomically on the next start.

Alternative considered: a fixed secret in repository configuration. Rejected because it would be shared by every install and risk accidental disclosure. Interactive pairing is deferred until multiple local users or third-party clients require separate revocation.

### 6. Report a minimal merged state snapshot

The main process owns native state and merges it with renderer reports containing readiness, current route, and normalized player metadata. The renderer sends updates after mount and when watched state changes. The SSE event buffer holds only a bounded number of recent non-sensitive snapshots and command outcomes.

Alternative considered: expose full Vue state or authentication tokens. Rejected because clients need stable capabilities, not internal component graphs, and credentials must never enter the control API.

## Risks / Trade-offs

- [Risk] Electron installers are substantially larger than Tauri packages. → Keep the desktop host thin, exclude source/dev files from packaging, and reassess Tauri only after the control contract stabilizes.
- [Risk] The configured remote gateway is unavailable. → Keep the native shell and control health available, surface renderer/gateway readiness separately, and preserve normal web error handling.
- [Risk] A local process running as the same Windows user can read the control token. → Bind only to loopback, use a per-process random token, avoid privileged arbitrary commands, and document this trust model.
- [Risk] Custom-scheme proxy behavior can differ for uploads or SSE. → Add focused protocol tests and smoke-test authentication, media, uploads, and Meguri streaming in the packaged runtime.
- [Risk] App-level player internals may evolve. → Keep all mappings in one renderer adapter and expose normalized state rather than internal refs.
- [Risk] An unsigned installer may trigger Windows reputation warnings. → Label the first artifact as an unsigned local build and defer public distribution until a code-signing certificate is configured.

## Migration Plan

1. Add the desktop host, preload boundary, renderer adapter, protocol modules, and focused tests without changing the ordinary web build.
2. Add development and packaging scripts, then validate the unpacked application against the existing remote gateway.
3. Produce an unsigned per-user Windows installer for local use and document its application-data manifest.
4. Add the Meguri Pet client adapter in its own future change using the published `1.0` contract.

Rollback is removing the desktop-only directory, bridge initialization, build scripts, and desktop dependencies. The web and Capacitor outputs continue to use their existing entry points and require no data migration.
