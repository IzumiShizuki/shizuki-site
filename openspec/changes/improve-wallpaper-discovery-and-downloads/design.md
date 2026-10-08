## Context

See proposal.md. Wallhaven search returns 24 items per upstream page and normally omits tags. Steam public file details can provide resolution tags, but those are author declarations. Existing SteamCMD execution waits for exit even after observing a download success marker. Recent successful job 24 took about 629 seconds; historical phase telemetry is insufficient to attribute all that time to one cause.

## Goals / Non-Goals

**Goals:** Eliminate avoidable post-download waiting, preserve verified content, expose declared quality before import, improve wide-screen browsing. After the user's deployment request, publish the committed backend and frontend to the personal-site server with rollback checkpoints and production verification.

**Non-Goals:** Network routing changes, transcoding/upscaling, changing existing library titles without source evidence.

## Decisions

- Complete SteamCMD when a marker matching the requested item appears and content validation succeeds; terminate and drain the lingering process. Reject incomplete content immediately and retain permanent-error precedence. Check at subsecond intervals without changing retry policy.
- Add optional resolution fields with backward-compatible constructors. Parse only explicit Steam resolution tags / detail-page resolution metadata. Show unknown/dynamic values explicitly and a source-declared label. Detail selection refreshes the selected card information.
- Steam browse currently caps source pages at 30 (verified live). Aggregate by absolute item offset so logical batches of 72 preserve partial source-page remainders. Fetch source resolutions in one published-file-details batch and retain metadata for ten minutes to reuse on selection/import.
- Retain permanent per-job phase durations for metadata, download/inspection and persistence; include no credentials or signed URLs. Clean up downloader descendants as well as the launcher.
- Default discovery page size to 72, capped at 96. Aggregate consecutive Wallhaven pages into one logical page and carry random seed across its upstream pages. Source page errors fail the whole batch rather than silently skip images. Keep existing filters/order.
- Add a cached Wallhaven detail endpoint. Lists show known source titles immediately; frontend enriches unresolved names progressively with at most three concurrent requests and cancels stale updates on search/unmount. Use a bounded six-hour detail cache and limit automatic detail misses per minute; throttled enrichment retries later. Unknown names remain explicitly unnamed rather than manufactured ID titles. Actual title/source slug wins, followed by meaningful source tags.
- Reuse thumbnail URLs from both search sources so thumbnail fallback does not trigger one extra detail API request per card.

## Risks / Trade-offs

- [Upstream bandwidth remains slow] → No guaranteed throughput claim; document measured behavior and the specific wait removed.
- [Declared resolution may differ from file] → Label it as author supplied, preserve unknown states and do not infer from preview dimensions.
- [Wallhaven details consume quota] → Progressive bounded concurrency, server cache/request budget and delayed retry without blocking the list.
- [Batch size increases thumbnails] → Retain lazy image loading and cap the configured batch.

## Migration Plan

Build backend and frontend together. Set existing WALLPAPER_DISCOVERY_PAGE_SIZE to 72 when deploying; updated defaults apply to fresh configurations. Roll back binaries/config defaults together. No database migration.
