## Why

Production Workshop job 23 downloaded item 3813102939 successfully, but its 242,378,122-byte MP4 was skipped because directory inspection reused the ordinary 50 MiB upload cap. The presence of `project.json` then caused an incorrect native-scene error, making a supported video appear impossible to import.

## What Changes

- Give downloaded Workshop runtime media a separate configurable import limit, defaulting to 512 MiB.
- Inspect eligible files by size before opening them and stream selected cached media to storage.
- Distinguish oversized media from actual native Wallpaper Engine resources and preserve precise inspection errors through the SteamCMD path.
- Reproduce the actual video-project structure and verify supported large videos, oversize failures, native packages, and streamed persistence.

## Capabilities

### New Capabilities

- `workshop-large-media-import`: Import supported media from downloaded Workshop projects with an independent size cap and accurate diagnostics.

### Modified Capabilities

## Impact

- Workshop import configuration, directory inspection and asset persistence in the media module.
- Monolith/Compose configuration and the Workshop operations guide.
- Focused media regression tests; no database migration or change to direct local-upload limits.
