## Context

See proposal.md for the motivation and the capability spec for the observable contract. Import jobs currently persist a stage and coarse percentage. Direct Workshop downloads are read from an HTTP body; the SteamCMD path waits on a child process and then inspects its output directory.

## Goals / Non-Goals

**Goals:**
- Persist byte counters on the existing import job and return them from the existing status endpoint.
- Count direct HTTP body bytes while they are read, and sample the target item directory while SteamCMD runs.
- Bound database write frequency and show MB values in the polling UI.

**Non-Goals:**
- Estimate time remaining or invent a total for SteamCMD downloads.
- Replace SteamCMD with a Steamworks SDK integration.
- Change source resolution, package validation, or wallpaper persistence.

## Decisions

1. Add downloaded_bytes and nullable total_bytes to the import-job record and response. Keep existing stage values for queueing, resolving, inspection, persistence, and terminal states. The downloading UI will use byte fields.

2. Count bytes in the direct HTTP body read loop. Use a positive Content-Length as the total; otherwise leave total_bytes null. Publish an initial and final sample, plus intermediate samples when a byte threshold or time interval is reached.

3. Measure SteamCMD output by summing regular-file sizes under the active Workshop item directory at a bounded polling interval. The current CLI flow does not provide a structured byte total. This reports materialized content, not exact network throughput; cached files can contribute to the value. The UI will label it as obtained content and keep the total unknown. Valve documents ISteamUGC::GetItemDownloadInfo for byte progress in a Steamworks client flow, which would require replacing the current CLI integration: https://partner.steamgames.com/doc/features/workshop/implementation

4. Throttle database updates and preserve the last counter. Direct streaming publishes after a minimum byte delta or elapsed interval and once at EOF. SteamCMD publishes when the sampled size changes and once when the process exits. New jobs and migrated rows start at zero.

5. When total_bytes is positive, render downloaded/total MB and clamp bar width to 0–100%. When the total is unknown, render the downloaded MB amount without a percentage and keep the track indeterminate. After the job leaves DOWNLOADING, return to the existing stage or terminal presentation.

6. Add downloaded_bytes BIGINT NOT NULL DEFAULT 0 and nullable total_bytes BIGINT to the media module and monolith MySQL/PostgreSQL migration streams.

## Risks / Trade-offs

- Repeated directory scans may add I/O for large items -> Scan only the active item directory at a bounded interval and persist only changed samples.
- SteamCMD directory size is materialized content, not exact network bytes for this invocation -> Keep the total unknown, describe the value as obtained content, and do not derive percentage or remaining time from it.
- Existing rows receive zero after migration -> Show byte amounts only while downloading and keep existing stage presentation for other phases.

## Migration Plan

1. Apply additive migrations with zero/default and nullable total columns.
2. Deploy backend fields and sampling with the frontend that consumes them in the same release.
3. Verify direct-download byte growth, SteamCMD directory sampling, and existing terminal states.
4. If deployment fails, restore the existing code and database snapshot; the added columns remain compatible with the previous application.
