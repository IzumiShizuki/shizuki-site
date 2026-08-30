## 1. Remove legacy task workflow and content

- [x] 1.1 Delete the tracked legacy runtime/hooks and remove its commands from `AGENTS.md`, `.agent` guidance, Docker/deploy exclusions and operations documentation.
- [x] 1.2 Replace visitor-facing legacy stack labels consistently in the database seed, backend fallback and frontend fallback, and update any maintained generated web assets through the normal build pipeline.
- [x] 1.3 Normalize active/historical workflow references that still instruct readers to run the removed executable, while preserving unrelated byte fixtures and dependency hashes; verify no executable legacy workflow remains.

## 2. Shared fullscreen state

- [x] 2.1 Add failing store tests for exclusive fullscreen ownership, minimized-window restoration, preserved geometry, close cleanup, unknown ids and reset cleanup.
- [x] 2.2 Implement shared fullscreen enter/exit/toggle commands and optional `openLightAppShellWindow(..., { fullscreen: true })` behavior without changing per-application state or sandbox permissions.
- [x] 2.3 Ensure the fullscreen owner remains visible across supported route presentation rules and dispatches a resize notification after entering or leaving fullscreen.

## 3. Fullscreen window shell

- [x] 3.1 Add parameterized host tests proving all nine catalog applications receive labeled enter/exit controls and that fullscreen is a modal edge-to-edge shell with no drag/resize affordance.
- [x] 3.2 Implement the shared full-viewport liquid workbench, including theme tokens, safe areas, header/body sizing, exclusive z-index and immersive/soothing transitions.
- [x] 3.3 Implement body scroll locking, background inert/pointer isolation, Tab containment, Escape handling and deterministic focus restoration with cleanup on close and unmount.

## 4. Consolidate Apps page mode

- [x] 4.1 Update Apps page tests so “页面打开” delegates to the shared global fullscreen shell and preserves the existing application instance across presentation changes.
- [x] 4.2 Remove the duplicate AppsPage Teleport/component map/page-only window identity and retain compatibility adapters only where existing callers still require them.
- [x] 4.3 Verify Home, Blog and AI Hub light-app entry points continue opening the same global window instances and do not reset player or application state.

## 5. Quality and browser verification

- [x] 5.1 Run focused store/host/Apps/entry-point Vitest tests, the available full frontend suite and a production build; distinguish unrelated existing failures rather than rewriting their expectations.
- [x] 5.2 Use browser checks at `1440x900`, `1024x768` and `390x844` where supported to verify all nine applications, themes, motion modes, Escape, focus return, scroll isolation and no page overflow.
- [x] 5.3 Run affected Java tests/build for workflow-label and deployment-script changes, then validate this OpenSpec change strictly.

## 6. Integrate, push, and deploy

- [x] 6.1 Remove hard-coded deployment credentials, require an existing private secret/SSH source, exclude private config and generated desktop artifacts, and add clean-master plus health-gate preflights.
- [x] 6.2 Commit the current personal-content/fullscreen work in coherent conventional commits, fetch/prune remote refs, and record the exact branch graph and deployed commit.
- [x] 6.3 Integrate only non-ancestor, non-superseded unique work from the desktop, music subtitle/HTTPS, wallpaper and Qianji branches, resolving conflicts from their primary specs and running focused tests after each stage.
- [x] 6.4 Run final frontend/backend/OpenSpec gates on a clean integration result, update local master from fetched `origin/master`, merge or fast-forward the validated integration result, and push master.
- [x] 6.5 Back up the personal-site database/volumes/configuration, deploy the recorded master commit to `111.228.35.186`, verify service health and core routes, and roll back on any failed gate.
