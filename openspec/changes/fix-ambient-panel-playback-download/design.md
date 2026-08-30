## Context

The panel currently combines hard-coded component colors, bundled default sounds, saved asset tracks, a standalone online-search tab, and an import service that downloads a provider preview. The mixer state already models an array of independently enabled tracks and can resolve signed asset URLs. See `proposal.md` and `specs/ambient-panel-experience/spec.md` for the required behavior.

## Goals / Non-Goals

**Goals:**

- Establish semantic panel colors that are complete for light and dark themes.
- Make saved online assets the single source of truth for the main ambient catalog.
- Preserve the existing multi-track mixer and expose its concurrent behavior clearly in the panel.
- Diagnose the real import failure at the provider-download boundary and lock the fix with a regression test.
- Keep provider credentials and unrestricted remote URLs on the server.

**Non-Goals:**

- Add another audio provider or a public asset marketplace.
- Synchronize playback position between devices.
- Remove a user's already saved ambient assets.
- Add offline caching of all search results before a user selects them.

## Decisions

### 1. Use component-scoped semantic color tokens

Define panel foreground, muted foreground, surface, elevated surface, border, hover, selected, input, warning, and disabled tokens at the panel root, then override those tokens under the application's dark-theme selector. Existing selectors consume tokens rather than embedding light-theme RGB values. This is preferred over a global color rewrite because the reported regression is isolated to the atmosphere workspace and can be verified without changing unrelated pages.

### 2. Treat imported asset tracks as the default ambient catalog

The ambient tab renders persisted `asset` tracks and an online-search call to action when empty. Bundled tracks are no longer offered as selectable defaults. The online tab remains the discovery surface, while a successful import updates the same track collection used by the ambient tab and mixer. This avoids maintaining two overlapping catalogs.

### 3. Preserve array-based mixing instead of introducing a selected-track model

Each imported track retains its own `enabled` and `volume` values. Playback orchestration creates or updates one audio node per enabled track and only disposes nodes for removed or disabled tracks. This matches the existing state shape and avoids a migration to a single-current-track abstraction that would conflict with simultaneous playback.

### 4. Test the provider download boundary with production-shaped responses

First establish red-capable frontend assertions for theme token coverage, catalog contents, and multi-track events, plus a backend test that drives the same HTTP redirect/content path as an import. Repair only the failing boundary identified by those tests. Provider URLs remain server-selected and host-allowlisted; browser input never controls the download target.

## Risks / Trade-offs

- **[Users relied on bundled sounds]** → Existing persisted imported sounds remain; the empty state links directly to online discovery.
- **[Remote preview URLs expire or redirect]** → Resolve provider details during each import, validate every redirect target, and keep failures retryable.
- **[Many concurrent sounds increase CPU/network usage]** → Reuse one audio element per track, pause disabled nodes, and retain the existing practical track-count/state limits.
- **[Signed asset URLs expire during long sessions]** → Continue using the existing asset URL resolver and refresh path rather than storing signed URLs as durable state.

## Migration Plan

1. Add failing regression tests for the three reported symptoms.
2. Deploy the backend import fix before or with the frontend so newly saved sounds return valid private asset references.
3. Deploy the frontend panel and verify dark-mode readability, empty-library discovery, import, and two concurrent sounds against the production API.
4. Roll back the frontend bundle and backend image together if import or mixer verification fails; persisted user assets remain compatible.
