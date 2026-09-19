## Context

See proposal.md for motivation and `specs/workshop-native-resource-import/spec.md` for the behavior contract. SteamCMD correctly downloads full Wallpaper Engine Workshop directories, but the current file scan treats every supported image/video extension as a candidate. Native scene projects commonly include `preview.gif` or `preview.jpg` and engine-only files such as `project.json` and `scene.pkg`, so the cover is silently persisted when no browser-renderable runtime media exists.

## Goals / Non-Goals

**Goals:**

- Select actual browser-playable media from a Workshop download without changing direct-file or local-package imports.
- Reject presentation-only previews before persistence and return a precise asynchronous fallback outcome.
- Preserve existing animated-over-static priority for legitimate runtime files.
- Lock the reported production failure pattern with deterministic unit tests.

**Non-Goals:**

- Do not implement a Wallpaper Engine scene renderer, execute untrusted Workshop HTML, or attempt binary conversion on the server.
- Do not change database schema, API paths, SteamCMD configuration, or public discovery behavior.
- Do not retroactively alter existing wallpaper rows; an affected item must be reimported after deployment.

## Decisions

### Classify previews before general visual selection

The directory scanner will normalize relative filenames and exclude well-known presentation names (`preview`, `thumbnail`, `thumb`, and `cover`) before applying existing visual type and priority rules. A basename-based filter is chosen because it is resilient to the file's directory location and directly describes the source of the bug. Relying on sort order was rejected because it makes a preview selection incidental and does not identify the underlying semantic error.

### Make native-only projects a fallback-required outcome

When the scan finds no eligible browser-playable media, it will detect native Wallpaper Engine evidence such as a `project.json` descriptor or `.pkg` resource and throw a dedicated business error. The existing asynchronous handler already maps business errors to `FALLBACK_REQUIRED`, preserving the client contract and avoiding a misleading successful wallpaper profile. Archiving native files without a render path was rejected because the current profile model has no usable source-package role and would still display the cover.

### Keep selection conservative

Only the repository's existing static-image and animated-media allowlists remain renderable. Workshop HTML and engine asset formats remain ineligible, avoiding untrusted page execution and pretending that a browser can render native Wallpaper Engine data.

## Risks / Trade-offs

- [Some valid items only expose a preview plus a native scene] -> Return a clear conversion-required fallback rather than a deceptive imported cover.
- [An author names an actual wallpaper `cover.mp4`] -> Use an intentionally small basename allowlist and favor correctness for conventional Workshop layouts; support can be widened with an explicit manifest parser if real cases demand it.
- [Existing incorrect imports remain usable] -> Leave existing user data untouched and require reimport after deployment; manual removal is available through the existing library controls.

## Migration Plan

1. Deploy the backend selection change and focused tests.
2. Reimport affected Workshop items; preview-only native projects now end as `FALLBACK_REQUIRED` instead of creating a wallpaper.
3. Delete the previously imported cover-only wallpaper through the existing library UI after verifying the new job outcome.
4. Roll back the application image to restore prior behavior if an unexpected valid runtime file is rejected; no data migration is required.
