## Context

See proposal.md and the two delta specs for the behavior contract. The asynchronous job currently persists only a coarse status. The frontend infers a synthetic indeterminate bar from that status, so it cannot distinguish metadata lookup, a direct download attempt, SteamCMD download, directory inspection, or persistence. The resource-selection guard introduced by the earlier Workshop fix is already present and must remain intact.

## Goals / Non-Goals

**Goals:**

- Make task progress durable so repeated polling and page refreshes observe the same server-side state.
- Provide a small, monotonic set of meaningful stages and percentages for the whole Workshop import lifecycle.
- Preserve the existing `/imports/{job_id}` endpoint and terminal status contract.
- Keep preview and thumbnail exclusions ahead of normal resource prioritization.

**Non-Goals:**

- Do not claim byte-accurate SteamCMD transfer progress: its CLI invocation has no stable machine-readable per-item byte-progress protocol.
- Do not add a native Wallpaper Engine renderer, execute Workshop content, or convert `scene.pkg` projects.
- Do not change direct file uploads, discovery previews, or existing completed wallpaper records.

## Decisions

### Persist a stage and bounded percentage on the import job

Add `progress_stage` and `progress_percent` columns to the import-job model and expose them in the existing status response. The workflow updates these fields at each durable boundary: queued, metadata resolution, direct or SteamCMD download, resource inspection, persistence, and terminal completion. Dedicated columns make the state queryable, backwards-compatible, and independent of the request payload format; encoding progress in `payload_json` was rejected because that field is request context, would require JSON read-modify-write operations, and makes status inspection less reliable.

### Report honest stage progress rather than fabricated transfer bytes

Progress values represent completed import stages, capped below completion until persistence succeeds. The download stage remains visibly active while SteamCMD runs, then advances after process completion. Parsing SteamCMD console text for percentages was rejected because its output is not a stable protocol and the current process runner does not retain a safe stream of structured transfer events.

### Keep the response contract additive and the UI server-driven

`progressStage` and `progressPercent` are added to the existing response record without replacing status, error, fallback, or wallpaper identifiers. The panel prioritizes those response fields and retains a conservative mapping only for older servers that do not return them. This allows rolling deployment without a blank progress state during mixed frontend/backend versions.

### Use a single helper for state transitions

The import service will use a central transition helper to update status, stage, percentage, timestamps, and terminal diagnostics together. This avoids stale progress after a fallback or exception. Existing preview exclusion and animated-resource preference remain part of directory detection, not the task-state helper.

## Risks / Trade-offs

- [A task dies between stage updates] -> The last persisted stage remains visible and terminal handling still writes a completed result whenever the worker catches an exception.
- [Old frontend calls a newer server] -> Additive response fields do not break clients that ignore them.
- [New frontend calls an older server during a rolling release] -> The panel falls back to its prior status mapping.
- [People expect byte transfer numbers] -> Labels describe import stages rather than presenting the percentage as a network-byte measurement.

## Migration Plan

1. Add additive non-null progress columns with defaults to monolith MySQL and PostgreSQL migration streams, plus the dormant media-module baseline migration.
2. Deploy the backend before or alongside the frontend; older jobs receive default queued progress until their next update.
3. Reimport any affected Workshop item. A native-only Wallpaper Engine project returns the conversion fallback rather than storing `preview.gif`; projects containing eligible web media install that resource.
4. Roll back application binaries if necessary. The added columns are nullable-by-compatibility defaults and are ignored by the previous application version.
