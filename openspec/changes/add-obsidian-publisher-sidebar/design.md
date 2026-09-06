## Context

See `proposal.md` for motivation. The current first-party Obsidian plugin exposes publishing through commands and one draft-upload ribbon icon. Its API client, note mapping, asset upload, confirmation modal, and background styling already provide the required domain behavior. The new surface must reuse those paths, run inside Obsidian's desktop workspace, and coexist with user-controlled workspace layout and unrelated repository changes.

## Goals / Non-Goals

**Goals:**

- Add one reusable left workspace view with a compact overview of the active note and account state.
- Keep all mutations routed through the existing plugin methods so command and sidebar behavior cannot drift.
- Refresh cheaply from Obsidian workspace and metadata events while handling closed or detached views safely.
- Preserve the current dark graphite and lavender visual language with clear accessibility states.

**Non-Goals:**

- Building a full Markdown editor or remote post-management dashboard inside the sidebar.
- Adding site APIs, changing authentication persistence, or publishing without confirmation.
- Automatically opening the sidebar on every startup or changing the user's saved pane layout without an explicit action.

## Decisions

### Register a leaf view owned by the plugin

Implement the sidebar with Obsidian's workspace view lifecycle and a stable view type. The open operation first reveals an existing leaf and otherwise requests a left leaf. This follows native pane behavior and avoids persistent DOM outside Obsidian's cleanup lifecycle. A modal-only launcher was rejected because it would not remain visible while writing.

### Render from a snapshot of existing domain state

The view asks the plugin for a small sidebar model derived from the active file, metadata cache, API session, and existing post mapping. The view does not call the site directly or maintain a second publishing state machine. This keeps the existing command methods as the single mutation seam and makes rendering testable through pure HTML/state helpers where practical.

### Refresh through explicit plugin notifications plus workspace events

The view subscribes to active-leaf and metadata changes and the plugin requests a refresh after sign-in, sign-out, settings changes, and successful or failed publishing. Refresh requests are serialized with a generation counter so a slow file read cannot overwrite a newer active-note snapshot. Continuous polling was rejected due to unnecessary work and poor plugin etiquette.

### Use a compact “publishing card” hierarchy

The panel uses a quiet header, one lavender connection indicator, a note summary card, metadata rows, and a fixed action stack. The distinctive element is a slim vertical synchronization rail whose color reflects local, draft, published, or error state. All other decoration remains restrained, uses Obsidian theme variables with dark fallbacks, and avoids the green palette the user rejected.

### Keep risky actions visually and behaviorally distinct

Preview is a neutral secondary control, draft upload is the primary lavender action, and public publishing is separated and retains the existing confirmation modal. Buttons disable while busy or when no eligible note exists. Sign-out remains secondary and cannot be confused with publication.

## Risks / Trade-offs

- [Metadata events can fire frequently while editing] → Filter updates to the active file and debounce/serialize rendering.
- [A stored refresh token does not prove the remote session is still valid] → Label it as a reusable session, and let the first authenticated request refresh or surface the existing login error.
- [A narrow left pane can truncate long titles or category names] → Use wrapping for the title and ellipsis plus tooltips for compact metadata values.
- [Obsidian APIs can differ across supported releases] → Use the plugin's declared minimum version, documented workspace primitives, defensive leaf checks, and runtime verification after deployment.

## Migration Plan

1. Add and test the registered view, render helpers, refresh hooks, command, and ribbon opener in the source package.
2. Rebuild the single-file runtime and deploy only plugin-owned files into the Vault.
3. Reload the installed plugin, open the sidebar, and verify eligible, protected, signed-out, and busy states in Obsidian.
4. Roll back by restoring the previous plugin commit/runtime; the view stores no note or account data of its own.
