## Context

See proposal.md. The Vue player owns audio and Folia runs in the same document. Host entry handlers independently select a track, install queues, mount the embed and send `shizuki:set-view`; the fork handles that message by writing a view store directly. Native Folia navigation uses the same `window.history` as Vue's hash router. The existing follow session carries complete queue and playlist metadata, but the fork does not consume playlist metadata for return context.

These are inspected boundaries, not proof that either explains the entire reported input freeze. A regression must exercise continued real interaction after selection as well as playlist return.

## Goals / Non-Goals

**Goals:** A focused coordinator for complete entry/return transitions, isolated embedded navigation and a testable compatibility contract. All agreed scene groups A/B/R/N/C/U/D/S are considered, with A08/A09/B05/B06 corrected to playback-only playlist selection.

**Non-Goals:** Replacing the audio engine/provider adapters, introducing cross-tab playback takeover, changing account permissions, fixing the separate standalone lyric-proxy deployment, or unrelated wallpaper UI changes.

## Decisions

1. **Single host entry coordinator.** Move competing async playlist/song/view work out of the giant page into an injected coordinator. One generation guards full queue/source/view completion and is invalidated on exit. Merely changing a boolean or adding another timing delay cannot preserve context.
2. **Embedded memory navigation.** In embedded mode only, navigation actions operate on bounded context and never write/read host history/hash/popstate. Standalone keeps native browser history. Return resolves to the native collection snapshot where available or the authoritative queue wall; repeated song changes replace the player layer rather than growing a history stack.
3. **Additive compatibility contract.** Host sends `shizuki:navigate` with `protocolVersion:1`, monotonic `requestId`, `view:'lattice'|'player'|'home'`, `active`, `sourceContext` and optional `returnTarget`. An optional `shizuki:navigate-result` acknowledges request/view readiness. Legacy `set-view` uses the same navigation action, not a raw store write. The existing follow session gains `sourceContext` without breaking clock/lyric messages.
4. **Complete collection selection.** Existing outbound `shizuki:playback-intent` retains old `track/positionMs/playing` and adds `selection:{kind:'track'|'collection'|'shortcut',queuePolicy:'replace'|'preserve-or-insert',sourceContext,selectedIndex?,tracks?}`. Collection intents carry the full ordered host-resolvable queue. Collection playback starts at 0; a specific selected song inside a collection uses its actual index. Wall song changes preserve shared queue entry identities. `sourceContext` uses `{kind:'collection'|'queue'|'single',collection?:{source,providerId?,type,id,name?},sitePlaylistCode?}`; native IDs remain opaque and never become fabricated backend codes.
5. **Separate preparation from audible state.** The coordinator exposes pending/error entry state without freezing the whole region. Only accepted latest work commits queue/source/navigation. Unmount/parking invalidates pending navigation. All overlays, pointer capture and focus scopes must release on success, cancel and failure.
6. **Active-surface input.** Top layers consume Escape once, song-player return stays in Folia's current playlist, and root wall return cannot fall through to initial home. Hidden embedded key handlers are gated by active lifecycle. Continuous clocks remain MotionValue/ref paths; queue arrays and navigation context remain stable across clock corrections.
7. **Ordinary return and dock.** Source context maps genuine site codes to an ordinary playlist; native-only sources fall back to current queue. Source/filter/scroll restoration and a compact dock are presentation changes that do not restart the session.
8. **Verification at actual boundaries.** Use real Vue SFC event integration, real bridge/navigation hooks and mounted wall/keyboard behavior. Source-string assertions and mocked message receipts alone cannot prove continuing interaction. Follow with live production selection → another click/keyboard → Escape → same playlist tests, and previous color/clock/control regression checks.
9. **Whole-wall exit ownership.** App's outer Lattice presence owns the wall-to-player fade and completion gate. An independent, non-propagating presence inside `PosterWall` owns virtualized poster removal; its staggered poster exits must not delay mounting the requested player. Verify multiple complete exits with the actual Lattice queue/focus/camera subtree.

The host's existing playlist code is carried as `{kind:'queue',sitePlaylistCode}` with display name supplied separately. It does not fabricate a Folia online collection descriptor from the backend code. Native collection context is retained only when the actual Folia collection snapshot matches source/provider/type/opaque ID; otherwise return uses the shared queue wall.

Protocol request IDs come from a module-scoped sequence that survives Vue page remount. Local asynchronous generations reject stale work independently of the parked React root's retained acceptance state. Explicit wall selection forwards the actual selected index/queue entry and preserves the current queue, even when that queue originated from a native collection.

Ordinary fallback is a dedicated `/music-library/queue` surface using the current engine queue and source metadata. It does not query a backend playlist with a native collection ID, show recommendations in place of the queue, or rebuild the queue when a row is selected. It reuses the playlist presentation with exact queue-entry/index selection. Reentry carries the existing opaque source context. A shortcut reuses a provider-and-track match without replacing its queue-entry identity; matching only numeric IDs is insufficient across providers.

## Risks / Trade-offs

- [Different site/fork versions] → Additive old-message adapter, joint release and observed asset/version verification.
- [Native source lacks a site playlist code] → Provider-aware opaque source plus shared queue fallback, no invalid backend lookup.
- [Snapshot churn destroys wall focus/interaction] → Compare queue/source identity and retain stable arrays; never create queue state on every clock tick.
- [A narrow test passes while the full region is blocked] → Browser input/hit-testing and mounted component regression in addition to state tests.

## Migration Plan

Root records artifacts and diagnoses; Luna owns implementation in the two repositories. Verify affected regressions, type checks, builds, full site suite and public patch application. Integrate only relevant changes into the site release branch. Under the user's existing push/deploy authorization, publish to owner-controlled repositories and personal server `111.228.35.186`, preserving site snapshots and previous Folia images. Build Folia from a clean Git archive. Deploy both consumers, verify fresh assets and original live flows, then record remaining environment-only limitations honestly.
