## Context

The host toolbar sends a discrete lyric preference to embedded Folia. Some DOM lyric bodies consume the root CSS property and Lattice consumes the bridge event; the full renderer model has no universal preference overlay. The host color input listens only for change. The added compact dock duplicates Folia's own transport. Ordinary mode already receives the authoritative queue, but large playlists render only the first 300 rows and do not reveal the current entry.

## Goals / Non-Goals

Goals: live, persistent primary lyric color with theme reset; one visible Folia transport; ordinary playlist/current-queue presentation that reveals the exact playing entry, including late entries and duplicate songs; preserve playback, native Esc and queue identity.

Non-goals: replace the audio engine, change provider APIs, recolor translations/backgrounds, redesign Folia transport, or alter unrelated wallpaper work.

## Decisions

- Handle native input and committed change through the same validated, deduplicated host preference action. Input-only selection must immediately reach the mounted renderer. Keep preference persistence and reset semantics. Waiting for picker dismissal is insufficient feedback.
- Apply the preference at the fork's shared renderer model/theme boundary, with a cleaned-up discrete event subscription. Preserve subtitle/background theme objects and standalone behavior. CSS alone cannot recolor non-DOM modes; per-frame state is unnecessary.
- Remove the active Folia compact host dock and suppress host queue presentation while Folia is active. Keep Folia native controls and the host audio engine mounted. Removing native controls would contradict the user's requested interface.
- On returning to ordinary mode, use engine queue/source context. A known site playlist routes to that playlist; opaque native identifiers route to the current-queue view. Preserve song-only queue order and reveal its new current entry.
- Reveal exact queue-entry identity when a list opens or a discrete current entry changes. Extend the rendered window far enough to mount late entries, then scroll the row into view. Apply equivalent activation behavior to the ordinary queue overlay. Do not scroll on the playback clock or continually override manual browsing; clear a filter only on explicit return when it hides the current song.

## Risks / Trade-offs

- Rendering a late row can increase DOM size; use the existing bounded list window and expand only to the required entry, rather than rendering every library song by default.
- Duplicate provider songs require queueEntryId before provider identity fallback. Regression fixtures must contain duplicates.
- Full-renderer color changes can interact with mode-specific palettes. Verify real primary text and preserve translations/backgrounds, reset, mode switches and standalone themes.
- Removing the duplicate dock invalidates the old regression assertion. Replace it with the user's corrected requirement and preserve ordinary controls coverage.

## Migration Plan

Capture failing mounted tests before implementation. Validate host/fork affected tests, builds and OpenSpec. Refresh public fork snapshots and canonical patch; verify clean upstream application. Push the authorized owner repositories and deploy only this change through the clean site release checkout to personal server 111.228.35.186. Preserve rollback images and snapshot; verify actual signed-in large-list return and real lyric color before recording completion.

The server has limited free disk space. Build from clean committed local checkouts with the exact production Vite arguments (read existing site arguments without printing credentials), package file hashes and commit identity, and verify every served file against the manifest. Build only the equivalent Nginx runtime image on the server, label it with the verified commit, advance the clean Folia source via a verified incremental bundle, and reuse the site's existing private backup/sync/health gates. Preserve previous images, source stash and restore points. Dispose of only this change's verified temporary artifact contexts after deployment; avoid broad image/volume pruning.

## Open Questions

None blocking. Native OS picker interaction may be inaccessible to browser automation; mounted input-event coverage and actual UI committed-color/render checks must distinguish that limitation.
