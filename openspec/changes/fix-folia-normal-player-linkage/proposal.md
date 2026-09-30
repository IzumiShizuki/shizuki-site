## Why

Folia and the normal music workspace are intended to share one player, but users observe unreliable track selection, a stuck zero progress display, inconsistent pause/seek controls, and different prefetch/account playlist behavior. The supplied production trace also shows repeated unauthorized lyric proxy requests; a reproducible diagnosis is required before targeted fixes.

## What Changes

- Reproduce and document the playback, progress, control, prefetch, and NetEase account synchronization differences, distinguishing the deployed Folia bundle from the checked-in fork snapshot.
- Make embedded Folia consume the authoritative site playback session and relay controls without independent playback or redundant resolution.
- Synchronize an available Folia NetEase authorization and the user's source playlists when entering either workspace, with deduplication and clear failure state.
- Add bounded next-track preparation to the shared player so preparation does not depend on displaying Folia.
- Restore upgrade regressions only when verified, with behavioral regression tests and local build/strict validation.

## Capabilities

### New Capabilities
- `music-mode-playback-parity`: Shared playback state, deterministic embedded controls, bounded preparation, and mode-independent NetEase account playlist synchronization.

### Modified Capabilities
None. The existing Folia integration contract lives in an unarchived change; this delta adds explicit parity requirements without rewriting that separate change.

## Impact

- Main site: `MusicLibraryPage.vue`, `usePlayerEngine.js`, shared music library/account composables, and regression tests.
- Folia fork: external bridge snapshots and public patch artifacts; preserve its independent source boundary.
- Diagnostics: production public HTTP endpoints and deployed bundle inspection are read-only; production deployment stays outside this change. The user later explicitly authorized pushing the diagnosis branch, and the result is recorded in the verification report.
- Root agent owns diagnosis and verification; implementation is delegated to Luna.
