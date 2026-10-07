## Context

See proposal.md for the production failure. `detectFromDirectory` reads every file before checking a shared upload limit, skips the actual MP4, and treats any `project.json` as native content. Storage already accepts an input stream with declared length, so cached runtime media can be persisted without materializing it in memory. SteamCMD's validation callback currently collapses inspection exceptions into a generic missing-content error.

## Goals / Non-Goals

**Goals:**
- Support the observed 242,378,122-byte video within a configurable Workshop media cap.
- Filter previews and unsupported files before opening them and stream selected cached assets.
- Preserve size/native diagnostics through successful-transfer validation.

**Non-Goals:**
- Rendering Wallpaper Engine native scenes in a browser.
- Raising the ordinary multipart/local-upload or archive extraction limits.
- Changing production user library records or restarting the deployed service as part of local implementation.

## Decisions

- Add `max-import-asset-bytes` to the existing Workshop configuration, defaulting to 536,870,912 bytes. This targets completed download-cache assets; increasing the shared 50 MiB upload limit would broaden unrelated endpoints and keep the large-file allocation problem.
- Extend detected assets with an optional file source while retaining the existing byte-array constructor for local uploads and validated archives. Persist both forms through a closed input stream and declared content length. Cached SteamCMD files remain in their existing persistent volume.
- Determine eligibility and inspect `Files.size` before opening runtime files. Track rejected runtime visual sizes for a precise limit error; previews and metadata do not become candidate wallpapers. Actual `.pkg` or `scene.json` files identify native scenes, while `project.json` alone does not.
- Retain the most recent validation exception and surface it only when SteamCMD succeeded but returned a content-validation failure. Authentication, ownership, networking and process failures keep their existing safe classifications.
- A success marker followed by rejected media is a terminal content-validation failure, including nonzero process exits. Stop without transient retries so the specific inspection error cannot be replaced by another attempt's diagnostic.
- Use a minimized fixture with a video larger than a reduced ordinary upload limit for the failing feedback loop. Follow it with a sparse file matching the production MP4 length and an import-path test that consumes the storage input stream.

## Risks / Trade-offs

- Large media uses more object-storage capacity and transfer time → use a finite configurable cap and a file stream.
- Download-cache files could change before persistence → open the selected file only after SteamCMD has completed; propagate I/O failures as safe diagnostics.
- Native `.pkg` scenes remain incompatible → preserve the conversion diagnostic and the preview exclusion guard.
- Direct `file_url` downloads and archive extraction retain their existing bound → configured SteamCMD remains the fallback for larger Workshop packages.

## Migration Plan

Add the configuration default and Compose environment mapping. A backend rebuild activates the new cap; no database migration is required. The affected video can then be retried using the existing import action. Rollback restores the prior backend artifact and ignores the new optional configuration field.
