## Context

See proposal.md. `MeguriPage` already owns authenticated sprite URLs, session checkpoints, canonical turn streams, cancellation and retry. `AiHubPage` hosts it only after clicking its ADMIN tab. Home instead dispatches the generic `companion` chat mode. App owns ordinary, focus and native-mobile surfaces.

## Goals / Non-Goals

**Goals:** Reuse the existing stage and session state, add a small browser companion host, and correct entry/recovery UX without widening the authorization boundary.

**Non-Goals:** Desktop process embedding, Electron APIs, TTS/local files, a new AI provider or protocol migration, automatic deployment, or public access to owner memory.

## Decisions

1. Mount a lazily imported floating host from App on website surfaces. The host owns only open/minimized state and emits no network calls until first open. Its mounted stage survives minimizing and ordinary navigation. A keyed account wrapper and explicit owner gate destroy prior state on logout or identity change. Alternative: route-owned host loses active replies on each navigation.
2. Retain the incumbent Meguri cream/amber character stage and reuse theme tokens for wrapper controls. The panel uses constrained viewport dimensions and the existing embedded stage. The minimized launcher uses a sprite URL reported by its still-mounted stage. Alternative: fetch or copy desktop art independently duplicates credentials and object-URL ownership.
3. AI Hub query `mode=meguri` chooses the owner mode after authentication readiness. Entering AI Hub unmounts the floating stage, leaving existing turn recovery metadata available to AI Hub. Alternative: two independent stages using one checkpoint risk concurrent followers.
4. Use a dedicated companion open event for Home. Keep the ordinary chat bus intact for other modes. This makes Home's owner companion action concrete while preserving the general AI chat surface.
5. Track bootstrap request failure separately from chat errors. Show a refresh action for offline Core and preserve unsent draft text on failed submission. Check IME composition before preventing Enter's default behavior.
   Accepted HTTP replies arriving after unmount update only the original account's unchanged checkpoint and notify a successor stage. Network interruptions retain the active turn until a terminal event; retry follows that turn instead of creating a duplicate request. New sessions and newer active turns take precedence over late responses.
6. Audit website and desktop contracts into `docs/ai-companion-integration.md`. Record runtime-dependent features as unverified and prioritize protocol negotiation/snapshot recovery, server history, memory visibility and optional speech rather than inventing frontend-only capabilities.

## Risks / Trade-offs

- [Risk] A minimized stage continues a reply. → Clearly label minimization; a separate close action unmounts and aborts the follower while preserving its checkpoint.
- [Risk] A sprite URL is revoked after handoff. → Clear host sprite state when its stage unmounts.
- [Risk] Remote Core differs from the latest local Java Core. → Document the legacy website Turn DTO and handshake migration as a follow-up; do not infer remote compatibility from local source alone.
- [Risk] The companion competes with music controls. → Reserve bottom space for the existing player and bound panel width/height with viewport rules.

## Migration Plan

Ship as frontend source only after unit tests, production build, browser inspection and strict OpenSpec validation. Remove the App host and restore Home's old event to roll back. No database or credential migration is required.
