## Why

The Workshop import progress bar currently advances only when the job changes stages, so it stays at a fixed value during a long download and does not tell the user how much content has arrived. Exposing byte counts will make active downloads understandable even when the source does not provide a reliable percentage.

## What Changes

- Count bytes as direct Workshop response bodies are read and expose downloaded bytes plus a total when `Content-Length` is known.
- Track the Workshop item’s on-disk byte growth while SteamCMD runs, since the current CLI workflow does not expose a structured byte total.
- Show downloaded MB in the import UI; use a proportional bar only when a trustworthy total is known and keep the bar indeterminate otherwise.
- Retain the existing resolving, inspecting, persisting, success, and failure stages around the byte-counted download phase.

## Capabilities

### New Capabilities

- `workshop-import-byte-progress`: Report and render the number of bytes received during Workshop wallpaper downloads, including unknown-total downloads.

### Modified Capabilities

None.

## Impact

- `media-module` import-job persistence, service download loops, and status response DTO.
- Database migrations for the supported standalone and monolith database schemas.
- The wallpaper discovery import progress UI and its tests.
