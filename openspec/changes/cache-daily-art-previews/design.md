## Context

See proposal.md for motivation. Daily selections are persisted, anonymous artist/search metadata has a ten-minute cache, and artwork details are deliberately fetched afresh before every preview. The controller already permits browser caching for thirty minutes. Image bytes currently have no server cache. Production measurements on 2026-10-08 for the same 435,598-byte preview were 4.463, 4.563 and 4.994 seconds on three consecutive requests.

## Goals / Non-Goals

**Goals:** Remove repeated image downloads, coalesce simultaneous downloads and avoid retransmitting unchanged bytes after browser expiry. Preserve the existing fresh safety check.

**Non-Goals:** Change daily recommendations, Pixiv authentication, image resolution or carousel presentation. Persist private credentials or introduce database migrations.

## Decisions

- Add a process-local image cache keyed by the validated upstream URL. Use access-order eviction bounded to 64 MiB and 64 entries, with a non-sliding 24-hour expiry. The current single backend process can reuse images without adding Redis binary traffic, disk ownership/configuration or a dependency. Restart clears this cache; the browser cache continues independently.
- Keep artwork detail fetch and every existing safety/host check before cache access. Caching metadata would reduce another upstream hop but would weaken the established current-classification guarantee. Do not serve stale bytes when Pixiv validation fails.
- Use a fixed set of sixteen download locks and recheck the cache after acquiring the relevant lock. This merges identical downloads without an unbounded per-key lock/future map; map operations hold only a short cache lock. Different keys sharing a stripe can serialize, bounded by the existing five-second upstream timeout.
- Cache only successful supported images after the existing eight-MiB streaming limit and media-type validation. Evict expired entries on insertion; reject entries larger than the configured cache budget. A clock and small limits can be supplied in package tests for deterministic expiry and eviction checks.
- Add an ETag to successful responses and honor If-None-Match after calling the fully validated preview path. Keep public max-age=1800 and nosniff headers. A conditional match avoids response bytes while still checking current artwork classification.
- Establish a deterministic red regression on two calls to the actual preview path before implementation, then test concurrency, unsafe warmed entries, URL changes, failed retries, expiry/capacity and HTTP conditional responses.

## Risks / Trade-offs

- [Fresh metadata can still be slow or unavailable] → Preserve fail-closed safety; quantify warm-request performance rather than promising zero latency for server requests.
- [Large image cache increases heap use] → Limit both bytes and entries; keep the eight-MiB individual image bound and fixed lock count.
- [Backend restart causes cold downloads] → Accept process-local lifecycle for this release; existing browser caching still reuses images for thirty minutes.

## Migration Plan

Build the committed backend in an isolated clean checkout. Verify the exact artifact, take a fresh source/configuration checkpoint and retain the old backend image. Deploy only the backend to 111.228.35.186; leave the already deployed frontend image in place. Confirm readiness, image/JAR/source identity, repeated safe previews, conditional responses and unchanged private configuration. Roll back the backend image and synchronized sources if release gates fail. No database change is required.
