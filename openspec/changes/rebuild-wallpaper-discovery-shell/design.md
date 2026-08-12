## Context

The current acquisition UI is rendered inside `BackgroundPickerDialog` and delegates source browsing to a small `WallpaperDiscoveryPanel`. The panel already has Workshop and Wallhaven search endpoints, but it exposes them as a compact form/grid and uses upstream image URLs directly. See `proposal.md` and `specs/wallpaper-discovery-shell/spec.md` for the user-facing contract.

The redesign needs to stay compatible with the existing parent event contract (`import-workshop`, `import-wallhaven`, and `select-workshop`) so the import-job and background-library logic in `App.vue` remains the single owner of side effects.

## Goals / Non-Goals

**Goals:**

- Make acquisition feel like a focused Wallpaper client/workshop rather than a settings form.
- Keep source search state, preview state, selected detail state, and pagination local to the discovery component.
- Provide same-origin preview delivery with upstream fallbacks so browser hotlink/referrer restrictions do not make every card look empty.
- Preserve the existing import, visibility, job-status, library, and wallpaper-settings flows.
- Keep the workspace usable on narrow screens, with the inspector moving below the gallery and visible keyboard focus states.

**Non-Goals:**

- Do not build a general Steam client or embed the Steam Workshop page in an iframe.
- Do not change the wallpaper database model, import worker, or background application semantics.
- Do not add a new UI framework or external image/gallery dependency.
- Do not bypass server-side source restrictions, Wallhaven purity rules, or import authorization.

## Decisions

### 1. Use a self-contained discovery workspace inside the existing picker

`WallpaperDiscoveryPanel.vue` will become the visual shell for acquisition while retaining its current public event names. `BackgroundPickerDialog.vue` will give the acquisition state a larger dark treatment and keep local upload/manual import and owned-wallpaper settings below the workspace. This allows the feature to look and behave like a separate app without introducing a new router route or duplicating `App.vue` import logic.

Alternative considered: create a new top-level route. This would require moving auth/import state out of `App.vue`, would complicate closing and preserving route background scope, and would make the workflow feel disconnected from the picker.

### 2. Give the shell an opinionated Wallpaper visual language

The subject is a wallpaper workshop for users choosing visual backgrounds. The shell uses a near-black blue-gray canvas, warm orange selection accents, compact utility typography, and a three-column workshop layout:

```text
┌─────────────────────────────────────────────────────────────────────────────┐
│  WALLPAPER / WORKSHOP                 search…             refresh  close     │
├───────────────┬─────────────────────────────────────────┬───────────────────┤
│ DISCOVER       │ WORKSHOP  /  DISCOVER                   │ SELECTED          │
│ Workshop       │ [query                         ] [sort] │ large preview      │
│ Wallhaven      │ [filters / categories / resolution]    │ title + metadata   │
│ ─────────      │ ┌──────┐ ┌──────┐ ┌──────┐              │ source link        │
│ source notes   │ │ card │ │ card │ │ card │              │ visibility         │
│ import tools   │ └──────┘ └──────┘ └──────┘              │ IMPORT             │
│                │              pagination                │                   │
└───────────────┴─────────────────────────────────────────┴───────────────────┘
```

Token direction:

- Canvas `#10151c`, panel `#171e27`, raised surface `#202a35`.
- Primary accent `#f06a3b`, selected glow `rgba(240, 106, 59, .24)`, success `#6fd3a1`, warning `#e7b35a`.
- Display/brand face uses the existing display font; result metadata uses the existing body/utility stack with uppercase micro-labels.
- Signature element: a thin orange “active source” rule and selected-card edge that visually connects the left source rail to the right inspector.

Alternative considered: keep the existing translucent pink liquid-material treatment. It is visually consistent with the rest of the picker but makes dense search controls and image previews feel like an incidental form, which is the problem this change addresses.

### 3. Treat previews as a candidate pipeline

The frontend will normalize each result into a candidate list. It tries a same-origin preview URL first, then the source thumbnail, then a larger source image when the API provides one. A per-result reactive preview state tracks the active candidate, loaded/error state, and retry count. The UI always reserves the image frame, so failed or slow upstream images do not collapse the grid.

The backend will expose a rate-limited discovery preview endpoint. It resolves the source item through the existing Steam/Wallhaven upstream client, validates the resulting host against the source allowlist, downloads only image content up to a bounded size, and returns cacheable bytes. This keeps the browser from needing to load hotlink-protected CDN URLs directly.

Alternative considered: only add a client-side `onerror` placeholder. That improves the error state but does not restore previews when upstream CDNs reject browser requests.

### 4. Keep side effects in the parent

The discovery component owns browsing and selection, but emits the same source payloads as before. `App.vue` continues to create import jobs, refresh the library on success, persist selection scope, and manage owned-wallpaper settings. This avoids a second source of truth for background state and keeps the change reversible.

## Risks / Trade-offs

- [Upstream CDN changes] → Keep direct thumbnail/full URL candidates after the same-origin proxy and show an explicit retry state instead of silently hiding cards.
- [Preview proxy bandwidth] → Enforce an image-only response and a bounded byte limit, add a public cache header, and retain the existing discovery rate-limit family.
- [Large workspace on small screens] → Collapse the side rail into a horizontal source strip and move the inspector below the result grid at the existing mobile breakpoint.
- [Existing tests assert old panel labels/classes] → Preserve semantic classes and event names where they represent behavior, and update tests only for intentionally changed layout structure.
- [Server is not configured for an upstream source] → Keep the current error copy and allow switching sources or using local package import/manual Workshop URL import.
