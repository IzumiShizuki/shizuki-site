## Context

The light-app shell resolves a static catalog code to a Vue window component and supports the same component in floating and page modes. The existing Web Toolbox already uses guest-accessible `/api/v1/tools/**` endpoints for server-side integrations.

KJ OS loads its application community from `https://oa.sgguo.com/?plugin=kj_appstore`. The public `apps` action returns catalog metadata, while `app_detail` returns the selected application's configuration. Browser access from Shizuki is blocked by an `Access-Control-Allow-Origin: https://kj.sgguo.com` response, so the browser cannot call the source directly. Community payloads may include arbitrary HTML, CSS, JavaScript, or external website URLs and must be treated as untrusted.

See `proposal.md` for motivation and `specs/kj-light-app-source/spec.md` for required behavior.

## Goals / Non-Goals

**Goals:**

- Reuse the current light-app catalog and window/page-mode lifecycle for a source browser.
- Keep all server requests bound to a configured KJ endpoint and known read actions.
- Normalize and bound upstream data before it reaches the browser.
- Run compatible third-party content with browser-enforced origin isolation.
- Keep the source optional and failure-isolated from bundled light apps.

**Non-Goals:**

- Reproduce the full KJ desktop, application installer, account system, or upload/review workflow.
- Execute KJ Python plugins, themes, system plugins, or mini programs.
- Grant KJ tools access to Shizuki authentication, preferences, light-app APIs, or the parent DOM.
- Persist or synchronize acquired third-party tools as first-class Shizuki catalog entries in this iteration.
- Guarantee that every external website permits iframe embedding.

## Decisions

### 1. Add one bundled source app instead of dynamic top-level catalog entries

`kj-tool-source` is a normal static light app whose component owns remote discovery and preview. This keeps the existing enabled-code, rail-slot, shared-window-ID, and component-routing invariants intact while still giving the user a direct acquisition path.

Alternative considered: register every remote KJ item dynamically as a Shizuki light app. That would require versioned persistence, dynamic window metadata, preference synchronization, rail cleanup, and uninstall semantics far beyond the requested source integration.

### 2. Proxy two normalized read endpoints through the content module

The backend exposes a catalog endpoint and a detail endpoint under `/api/v1/tools/kj-source/**`. It accepts only a validated tool identifier and constructs the upstream `plugin=kj_appstore` action itself. The upstream base URL, timeouts, cache TTL, item count, and response byte limit are operator configuration.

Alternative considered: call `oa.sgguo.com` directly. Its CORS policy excludes Shizuki, and a permissive client-side workaround would not provide response limits or stable error normalization.

Alternative considered: expose a generic proxy URL parameter. That would create an SSRF primitive and is explicitly excluded.

### 3. Normalize supported types at the server boundary

The service maps KJ `code`, `plugin-code`, and `widget-custom` payloads to a `document` launch mode, and maps `website` and `widget-url` payloads to a `website` launch mode when their URL is HTTP(S). Other types remain visible but carry `compatible=false` and a reason. Catalog and detail fields are length- and count-bounded; oversized detail payloads fail closed.

Alternative considered: send the full upstream JSON to the browser. It couples the frontend to an undocumented schema and makes it easier to accidentally execute unsupported configuration.

### 4. Use an opaque-origin sandbox for execution

Document tools are assembled into an iframe `srcdoc`; website tools use the iframe `src`. Both use a sandbox allowlist that can permit scripts, forms, modals, and downloads but deliberately omits `allow-same-origin` and top-navigation permissions. The generated document includes a restrictive CSP and a base target that prevents replacing the parent page. The UI always labels the preview as third-party content.

Alternative considered: inject KJ HTML and evaluate scripts in the Vue component. That would give community code the same origin and privileges as Shizuki and is unacceptable.

Alternative considered: add `allow-same-origin` for compatibility. Combined with scripts, that weakens the intended isolation and risks exposing source-specific browser state, so compatibility is traded for safety.

### 5. Cache normalized upstream responses in memory

The backend keeps a short-lived catalog cache and bounded per-tool detail cache. Cache entries are invalidated by TTL and never become durable application data. This reduces load on the external community API and provides consistent refresh behavior; an explicit refresh bypass can be implemented by expiring the catalog entry, while the first implementation may simply revalidate after TTL.

Alternative considered: persist KJ data in PostgreSQL. The source is read-only and externally owned, so a database mirror would add stale-data and migration obligations without helping the requested workflow.

## Risks / Trade-offs

- **[KJ changes an undocumented response schema]** → Validate required nodes, default optional metadata, surface a retryable upstream-format error, and cover representative responses in unit tests.
- **[A community payload is malicious]** → Keep it in an opaque-origin sandbox, omit parent/top permissions, avoid passing tokens or user data, and show a third-party warning.
- **[A website refuses embedding]** → Keep an explicit external-open action for validated HTTP(S) URLs and explain that embedding depends on the publisher.
- **[Public endpoints amplify traffic to KJ]** → Validate IDs, impose response limits and timeouts, cache normalized responses, and expose only two fixed read actions.
- **[Large community applications exhaust memory]** → Enforce catalog count and detail byte limits before returning content; reject oversized tools rather than partially executing them.
- **[No durable install semantics]** → Label the action “获取并打开”; persistence as first-class dynamic light apps remains a separate change.

## Migration Plan

1. Deploy the backend with KJ source defaults and the guest-path rule; verify catalog and detail endpoints while the frontend remains unchanged.
2. Deploy the frontend source component and static catalog entry.
3. Disable `TOOLS_KJ_SOURCE_ENABLED` to roll back the integration without removing or changing any bundled light app.
4. A full rollback can remove the additive endpoint and component; no database or stored-user-data migration is required.
