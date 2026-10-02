## Context

See proposal.md for the observed rapid-entry failure and measured URL/AMLL timing. The host owns audio and queue; Folia consumes versioned sessions and handles discrete navigation. Earlier tests often injected an already-ready fake player/bridge and source-string assertions, leaving stable-selection cold entry and deferred initialization insufficiently exercised.

## Goals / Non-Goals

Goals: preserve an immediate coherent selected entry and queue; make entry/exit independent of optional lyric completion; reject stale selection/bootstrap/library results; measure and reduce foreground request latency.

Non-goals: guarantee third-party CDN latency, replace providers, introduce another audio owner, weaken signed URL/account validation, or change unrelated wallpaper work.

## Decisions

- Reproduce at the real engine and host message/navigation boundaries using deferred URL, lyric and bootstrap results. Explicitly distinguish cold root, parked reentry, ready stable song, pending selection and empty startup. Source-string checks alone cannot validate this lifecycle.
- Use a current authoritative session for every activation, including unchanged already-selected songs, and establish session consumption before navigation. Mounted DOM existence is insufficient proof that playback state has reached the consumer. Preserve entry identity and source context across pending/ready transitions; park/cancel work without erasing the host queue.
- Commit selected metadata/identity promptly, with explicit preparation state where audio is not ready. Start audio from an available URL independently of optional lyrics/enhancement; prefer usable inline lyrics before remote fallback and apply later results under selection/account/queue guards. Avoid a longer timeout masking a foreground dependency.
- Measure request phases before optimizing; deduplicate identical preparation and optional lyric requests, and bound speculative next-track work so it cannot queue ahead of foreground selection. Keep signed URL recovery and authorization-sensitive invalidation intact.
- Audit all relevant source boundaries and record concrete risk/coverage, rather than infer completeness from a test total. Amend the design with confirmed causes before finalizing fixes. Extend the fork only if its real consumer boundary needs changes, with its own OpenSpec artifacts first.

## Confirmed implementation boundaries

The RED cases and source audit in diagnosis.md confirm three independent causes: activation explicitly skipped a fresh session, foreground selection awaited lyric work, and late playlist/browse loads wrote into newer state. The actual fork installs its listener before bootstrap and consumes sessions synchronously; the host now posts activation, the fresh session, then navigation in that order. No fork or backend runtime change is required.

Selection now clears previous media/lyrics and publishes exact queue-entry metadata before resolving audio. Available audio and the selection result proceed while lyric requests remain pending. URL preparation reuses an eligible in-flight promise keyed by entry, playlist, quality and authorization; optional AMLL work shares in-flight requests, retains at most 128 LRU entries and caches misses for 30 seconds. Load/selection/disposal guards protect newer state. An empty queue exits to a valid browse path and keeps its query; a nonempty queue continues to use its source playlist or current queue.

Production has about 134 MiB available. Delivery will compare the new production manifest with the verified running manifest and build an incremental frontend layer on the current immutable image. Unchanged public assets are retained, obsolete compiled assets are removed, and the complete resulting manifest must match. Preserve the current image tag and READY backup before activation.

## Risks / Trade-offs

- Pending UI can accidentally show the previous song/lyrics → clear or tag prior playback state at selection, retain queue-entry identity, and verify stale results and repeated songs.
- Optional lyric work can leak or overwrite a later song → deduplicate, bound and generation/account guard; clean up on disposal.
- Empty startup is legitimate but an existing queue becoming empty is not → test these as separate states and preserve return browse context.
- Production disk is nearly full → inspect exact capacity/runtime before building; reuse existing toolchains and equivalent prebuilt frontend artifacts, retain rollback/READY backups, and avoid broad cleanup.

## Migration Plan

Use a managed worktree from the clean release branch. Capture independent RED tests and browser/network timing, implement only confirmed corrections, then run affected suites, appropriate full checks and strict OpenSpec. Build precise committed artifacts with existing production parameters; push authorized owner branches and deliver through the clean release checkout on 111.228.35.186. Verify served manifests, cold/warm UI and request timings; preserve rollback images/restore points. Do not claim runtime acceptance from mocked or warmed-only results.
