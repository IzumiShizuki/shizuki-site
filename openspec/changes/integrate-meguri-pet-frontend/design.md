## Context

See `proposal.md` for motivation and `specs/meguri-web-companion/spec.md` for observable behavior. The target frontend is the existing Vue 3 application in `fronted/vue3-merged`. It already contains `MeguriPage.vue`, authenticated gateway helpers, an SSE reducer, and unit tests, but the page has no router or AI Hub entry and its visual language predates the new `D:\program\meguri-pet\apps\desktop-meguri` design.

The website gateway is intentionally `ADMIN`-only and serves sprites through authenticated requests, so browser images must continue to use cached object URLs. The source desktop frontend additionally depends on Electron preload methods, Pinia stores, a loopback gateway, artifact polling, and Everything-based local resource lookup; those capabilities do not exist in the website contract.

## Goals / Non-Goals

**Goals:**

- Make the existing website Meguri flow reachable from AI Hub without introducing another navigation shell.
- Preserve the tested canonical turn, SSE recovery, cancellation, and session identity behavior.
- Recreate the desktop frontend's recognizable character stage, warm glass dock, and compact control island with web-native state and controls.
- Deepen character presentation so canonical motion cues and user-selected outfits produce safe authenticated sprite requests.
- Keep the implementation responsive, keyboard-operable, and reduced-motion aware.

**Non-Goals:**

- Move the Electron application into this repository or share code across the two repositories in this change.
- Add website endpoints for artifacts, local resource discovery, TTS, skills, desktop settings, or native window control.
- Change the owner-only authorization boundary or the Meguri Core wire contract.
- Add Pinia solely for this page; the website currently uses composition state and does not need a new state layer for one isolated companion.

## Decisions

### 1. Add Meguri as a third AI Hub primary workspace

`AiHubPage` will show an “爱莉伴聊” mode only when the current user belongs to `ADMIN`. Activating it renders `MeguriPage` with its embedded layout and makes the main workspace use the same full-width grid treatment as ordinary conversation.

Alternative considered: add a new top-level route and menu entry. Rejected because Meguri is an AI interaction mode, AI Hub already owns the product-level mode switch, and the existing page is explicitly designed for embedding.

### 2. Adapt the desktop composition while retaining website-owned state

`MeguriPage` will be reshaped into four layers: ambient character stage, status/brand rail, compact control island, and chat dock. The composition and warm amber/cream tokens follow `desktop-meguri`, but all state stays in the page's existing composition functions so the current gateway behavior remains intact.

Alternative considered: copy the desktop Vue components and add Pinia. Rejected because those components are coupled to Electron globals, desktop preferences, artifact stores, and the loopback gateway; copying them would create a misleading and shallow compatibility layer.

### 3. Isolate pure character mapping in a tested utility

A web JavaScript utility will map canonical expression/intensity/outfit/motion data to a safe sprite filename and motion class. The page remains responsible for authenticated fetches and object-URL lifetime. Outfit changes derive a filename from the last valid expression rather than assuming a new backend listing endpoint.

Alternative considered: manipulate the current sprite filename directly in the page. Rejected because cue validation, expression fallback, and motion classification are pure rules that deserve focused tests and can otherwise drift from the desktop implementation.

### 4. Persist only stable web presentation preferences

The existing per-user session record will be extended with supported presentation preferences: chat visibility, history expansion, and outfit code. Transient messages, errors, active animation, and in-progress reply state remain runtime-only, except for the existing active turn identifier used for recovery.

Alternative considered: persist the full conversation history. Rejected because the current website gateway exposes event recovery rather than a website history contract, and persisting rendered messages would create a second source of truth.

### 5. Make retry an explicit replay of the last failed owner message

When turn creation or streaming fails, the failed assistant row retains an error and the dock offers retry. Retry removes the failed assistant placeholder and resubmits the last owner message in the same session with a new idempotency key. A new-conversation action remains the isolation boundary.

Alternative considered: only let the user edit and send again. Rejected because the redesigned desktop dock has an explicit retry state and the capability spec requires it.

### 6. Keep website and desktop capability labels honest

The control island will include outfit selection, chat visibility, history expansion, refresh, and new conversation. Native drag, always-on-top, click-through, hide, quit, TTS, Everything lookup, artifacts, and desktop skills are omitted until matching website contracts exist.

## Risks / Trade-offs

- [Risk] The source desktop frontend may continue evolving after this port. → Treat this as a deliberate Web adaptation with focused visual tokens and behavior tests, not a copied subtree that implies automatic parity.
- [Risk] Switching outfits may request a sprite that is absent from the configured server directory. → Keep the last valid object URL visible and show a non-blocking presentation hint when a derived sprite cannot be loaded.
- [Risk] Mounting an owner-only component could call the gateway for a non-admin during a render regression. → Gate both the tab and component branch on the computed ADMIN membership and test the negative case.
- [Risk] A large expanded dock could obscure the character on short viewports. → Cap dock height, move the character stage boundary with CSS, and add narrow/short viewport rules.
- [Risk] Object URLs can leak across repeated cue changes. → Cache per filename during the mount and revoke every cached URL on unmount.

## Migration Plan

1. Add the pure character-presentation mapping and event motion support with unit tests.
2. Refactor `MeguriPage` to the Web-adapted desktop composition while keeping gateway interactions intact.
3. Mount the page through an ADMIN-only AI Hub mode and update visibility tests.
4. Run focused unit tests, the full frontend suite, production build, strict OpenSpec validation, and browser visual/interaction checks.

Rollback is removing the AI Hub mode branch and reverting `MeguriPage`/presentation utility changes. The gateway and the separate `meguri-pet` working tree are unchanged.
