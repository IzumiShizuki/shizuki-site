## Context

See `proposal.md` for motivation. The frontend currently has nine applications in one catalog and a global `LightAppWindowHost` for floating windows. `AppsPage` also owns a second `pageMode` Teleport implementation; it is constrained to a centered panel, exists only while `/apps` is mounted, and assigns a second application instance/window id. The two presentation paths can therefore diverge in state and behavior.

The working repository also contains an inactive legacy task runtime plus workflow documentation that still invokes an unavailable executable. Multiple feature worktrees and branches contain overlapping frontend edits, so integration and deployment must occur only after the working changes are separated, committed, tested, and rebased onto the fetched remote master.

## Goals / Non-Goals

**Goals:**

- Make fullscreen a property of the shared light-application window shell so all catalog applications receive it automatically.
- Keep one mounted application instance while moving between floating and edge-to-edge presentation.
- Isolate the background page for pointer, scroll, and keyboard interaction and restore it exactly on exit.
- Remove the active legacy task workflow/data and visitor-facing legacy stack copy in favor of the existing OpenSpec and Git workflow.
- Produce a clean, testable master commit before pushing and deploying through the personal-site server boundary.

**Non-Goals:**

- Requesting browser/OS native fullscreen permission.
- Changing any light application's business data, iframe sandbox, authentication, or network permissions.
- Deploying any part of this repository to `111.228.52.91`.
- Automatically merging superseded branches whose commits are already contained by a newer branch.

## Decisions

### 1. Fullscreen is exclusive shell state

Add one `fullscreenWindowId` to the shared shell state and expose explicit enter, exit and toggle commands. Entering fullscreen focuses and restores the selected window, but does not rewrite its saved rectangle. Closing that window clears fullscreen; choosing another window transfers exclusive ownership.

This is preferred over adding `isFullscreen` to every application because application-local state would duplicate behavior nine times. It is also preferred over deriving fullscreen from a `100vw` rectangle because the shell needs distinct accessibility, background isolation, drag and resize rules.

### 2. The existing Apps page mode is consolidated into the global host

The Apps card “页面打开” action will open/focus the shared window and immediately request fullscreen. The page-local Teleport, duplicated component map, page-only ids and route-unmount close behavior will be removed after compatibility tests are updated.

This keeps TimePrism sessions, unsaved inputs, Balance/Blog window state and header portals attached to one identity. A temporary adapter may preserve the old exported function name while it forwards to the shared host, but the final runtime has one source of truth.

### 3. The fullscreen surface is an edge-to-edge liquid workbench

The distinctive visual element is one quiet, edge-to-edge workbench: a persistent translucent command strip at the top, with the application's own toolbar flowing beneath the title and the body consuming the remaining viewport.

- Color: reuse the site's existing daytime/night semantic surface, border, text and accent tokens; do not introduce a detached palette.
- Type: keep the current application title/body/utility typography so fullscreen feels like expansion of the same object, not a second product.
- Layout:

```text
┌ title · app tools                         exit · minimize · close ┐
│ application toolbar / tabs                                       │
├───────────────────────────────────────────────────────────────────┤
│                                                                   │
│               existing application instance                      │
│               scrolls inside this viewport                       │
│                                                                   │
└───────────────────────────────────────────────────────────────────┘
```

The shell uses viewport and safe-area insets, removes floating radius/shadow, hides drag/resize affordances, and sits above navigation, player, dialogs owned by the background page, and floating controls. Immersive mode may use one restrained expansion transition; soothing/reduced motion uses opacity only.

### 4. Background isolation and focus are managed by the host

When fullscreen starts, the host records the focused element, locks body scrolling, marks its relevant `.app-shell` siblings inert, exposes the fullscreen article as a named modal surface, and moves focus to its exit action or first usable control. On exit or unmount it restores prior inert/overflow values and returns focus to the initiating control when possible.

Escape exits only when the event is not already handled by an application-owned modal and the target is not an editable escape context. Tab is trapped inside the fullscreen shell. A backdrop supplies pointer isolation even where `inert` is unavailable.

### 5. Active legacy workflow material is removed, history is normalized

Delete the legacy runtime directory and remove its executable commands from `AGENTS.md`, current agent guides, deployment scripts and operations documentation. Replace visitor-facing legacy stack labels in database seed, backend fallback and frontend fallback with the same neutral engineering label.

Historical planning files that act as current documentation will be reworded to describe generic task-state synchronization. Byte fixtures and dependency integrity hashes that coincidentally contain matching character sequences remain untouched.

### 6. Integration uses an explicit branch graph, not “merge everything” literally

Fetch remote refs first. Branches already ancestors of master are skipped. Superseded branches are represented only by their most complete descendant. Divergent old branches are cherry-picked or rebased only when their unique commits still provide behavior absent from the integrated tree; overlapping current work is resolved from the original specifications and tests.

The current dirty personal-content work is committed on its feature branch before integration. Every merge stage gets focused tests, followed by the full available frontend and Java gates. Master is updated only from a clean integration result.

### 7. Deployment credentials and payload are fail-closed

The deployment path must not contain or print hard-coded server credentials. It shall obtain authentication from an existing private environment/secret source or SSH key, reject a dirty/non-master tree, exclude private configuration and build artifacts, record the deployed commit, back up the database/volumes/configuration, and perform post-start health checks.

This safety hardening is required before using the existing sync script because it can delete remote files absent locally and currently has no automatic health rollback.

## Risks / Trade-offs

- [Application-owned Escape handlers conflict with shell exit] → Exit only when the event remains unhandled and add component tests for modal/editor contexts.
- [Inert or scroll lock survives an exception] → Centralize acquisition/release and restore it in watchers plus `onBeforeUnmount`.
- [Large canvases or iframes calculate height before the transition finishes] → Dispatch a resize event after fullscreen settles and on exit.
- [Removing the duplicated Apps page mode changes its window identity] → Adapt existing page-mode callers and test state continuity before deleting compatibility exports.
- [Old branches overlap current uncommitted work] → Commit current work first, inspect unique commits, and resolve against specs rather than accepting whole-file versions.
- [Deployment can remove remote-only material] → Build an explicit payload allow/deny list, dry-run the sync manifest, back up first, then deploy from clean master only.

## Migration Plan

1. Remove active legacy workflow files/references and align the visitor-facing stack label.
2. Add shell fullscreen state and tests, then add host presentation/accessibility behavior.
3. Redirect Apps page-mode entry to the global host and remove duplicated rendering.
4. Run targeted Vitest, full frontend tests/build, Java tests/build, and browser checks at desktop/tablet/narrow viewports.
5. Commit the current feature work in coherent commits, fetch remote refs, and integrate only non-superseded unique branches in dependency order.
6. Harden deployment credential/payload handling, create server backups, push clean master, deploy the recorded commit to `111.228.35.186`, and verify health and key routes.
7. If health checks fail, restore the previous commit/images/configuration and database/volume backup before reopening traffic.
