## Why

Workshop imports previously allowed presentation assets such as `preview.gif` to be treated as wallpaper content, causing an installed wallpaper to show only the Workshop cover. Although the interface shows an animated import indicator today, it does not expose meaningful download or processing progress to the person waiting for a SteamCMD import.

## What Changes

- Preserve the rejection of Workshop preview and thumbnail files so an imported wallpaper always points to an eligible browser-playable resource.
- Return the import task's current stage and bounded percentage from the existing job-status endpoint while SteamCMD downloads, the resource is inspected, and the wallpaper is persisted.
- Show that server-provided stage and percentage in the Workshop import UI, with accessible progress semantics and clear terminal success or fallback states.

## Capabilities

### New Capabilities

- `workshop-import-job-progress`: Observable, stage-based progress for asynchronous Workshop wallpaper imports.
- `workshop-runtime-resource-safety`: Safe selection of playable Workshop resources without silently importing presentation-only previews.

### Modified Capabilities

None.

## Impact

- Wallpaper import job persistence, response DTOs, and asynchronous SteamCMD workflow in `media-module`.
- The wallpaper import polling state, progress component, and associated frontend tests.
- A database migration adds non-null, backward-compatible progress fields to the wallpaper import-job table.
