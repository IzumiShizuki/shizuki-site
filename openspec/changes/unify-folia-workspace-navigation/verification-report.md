# Folia workspace verification

## Accepted behavior and local evidence

The accepted playlist operation is **Folia 播放**: P1→P2 replaces the full shared queue and starts P2's first song. A specific song keeps its actual selected slot. Explicit current-song immersive entry preserves the existing paused/play position. Escape/back stays in Folia and restores the current native playlist or shared queue wall without traversing earlier songs.

The baseline failures, red regressions and limits of the whole-region freeze reproduction are in [diagnosis.md](diagnosis.md). This change separates host audio/queue ownership from bounded embedded navigation and gates parked input, rather than treating audio success as UI acceptance.

| Requirement | Implementation / verification |
| --- | --- |
| Playlist playback | `musicFoliaWorkspaceCoordinator.js` owns complete queue/source/navigation requests; real `MusicLibraryPage` integration consumes complete native collection intents. All playlist actions use Folia 播放. |
| Correct song surface and identity | Current song immersive entry, explicit wall view, shortcut insert/reuse and exact duplicate queue slots. Real engine tests prevent same-ID cross-provider replacement and retain reused queueEntryId. |
| Esc/current playlist return | Removed host Escape swallowing. Fork mounted navigation tests cover native P2 return, repeated player entry, safe queue-wall fallback and host-history isolation. Existing top-layer/expanded-poster semantics remain covered. |
| Latest request / inactive surface | Host-lifetime monotonic request IDs, coordinator generations, queue/selection generation checks, and fork active lifecycle. A real deferred cold-load→unmount→completion regression rejects stale activation. |
| Playback / preferences | Common engine remains the only audio owner. Existing clock, lyrics, pause/seek, lyric shader color/reset and account synchronization regressions are retained. Equivalent fork queue/song/context snapshots remain stable. |
| Ordinary return | Known site code returns to its ordinary playlist. Native-only sources return to `/music-library/queue`, which reads the engine locally, makes no native-ID backend playlist lookup, and selects exact existing queue slots. |
| Loading / compact controls | Current HTML selects the actual hashed module; missing module/failure exposes recovery. Successful cold load and retry are mounted-SFC tests. Compact dock retains pause/seek and does not route clicks away from Folia. |

Site final local quality run after Luna handoff: **249 test files / 1,505 tests passed**, production build passed (2,844 modules). Existing empty-react-chunk and chunk-size warnings remain. No backend/provider endpoint changes are part of this delivery.

Folia root affected verification after the final collection-origin refinement: **36 files / 244 tests passed**, TypeScript and `/music/` build passed. Explicit native P2 selection replaces source/queue even when its songs equal P1; unmarked shared-queue picks preserve ordering. Prior full Folia suite's upstream Windows symbolic-link `EPERM` limitation remains documented; no test was weakened or skipped to conceal it.

## Remaining delivery gates

Public source check for fork implementation `9b2346e2779f51805ed754b6b151d944dfec846f`: 32 snapshots match byte for byte. The complete upstream diff is 215,292 bytes, SHA-256 `a38e8aeef743c1769aa01cf51454aa23ffab86580314d3e7ff501eeed70cb151`. It passed `git apply --check`, was actually applied to a temporary clean upstream `6fe68d89` worktree, and all 49 resulting changed-file Git blobs match the target fork commit. That temporary worktree was removed after verification.

Clean release checkout independently passed **249 files / 1,505 tests** and production build. Its first full run after snapshot synchronization found one obsolete source-string assertion demanding unconditional queue replacement; the separate test followup now requires fingerprint-gated replacement, and the full rerun passed. Application code and assets did not change for that assertion update. Strict OpenSpec validation passed in both repositories. Release diff in `App.vue` adds only the shared queue-source binding; the working branch's unrelated wallpaper changes are excluded.

At this record's initial creation, public snapshot/full-patch identity, clean release-checkout validation, push, deployment and fresh real-browser acceptance are pending. Preserve the scope isolation: the main working branch's unrelated wallpaper history is not part of the site release. [delivery-preparation.md](delivery-preparation.md) records rollback assets and server capacity.

Use OpenSpec verification for `unify-folia-workspace-navigation` and fork `embedded-workspace-navigation`. Final completeness/correctness/coherence conclusions require the production acceptance below, beyond mounted local tests.
