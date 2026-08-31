## Context

See `proposal.md` for motivation and `specs/workshop-download-channel/spec.md` for the behavior contract. Production search currently succeeds through Steam browse-page scraping, while item detail switches exclusively to the Steam API whenever an API key is configured. The same item returned HTTP 404 in five consecutive production detail probes even though the official API returned `result=1` and the public detail page returned HTTP 200 from another network. The import service separately constructs direct JDK clients, so it does not inherit the wallpaper proxy that makes production discovery possible.

Most Wallpaper Engine items intentionally omit `file_url`; they require SteamCMD. The existing `has_direct_download` field therefore describes only one transport and cannot truthfully represent whether import is possible.

## Goals / Non-Goals

**Goals:**

- Use one wallpaper-scoped outbound HTTP implementation for discovery and import.
- Resolve metadata through API-first, page-fallback behavior at one shared seam.
- Report direct, SteamCMD, and unavailable channel states without breaking existing clients.
- Keep proxy secrets private and preserve direct local development.
- Lock the production failure pattern with deterministic HTTP-server tests.

**Non-Goals:**

- Do not replace SteamCMD or bypass Steam ownership and Steam Guard requirements.
- Do not change the asynchronous import-job API or media persistence schema.
- Do not complete the separate wallpaper catalog-filter redesign.
- Do not make the browser contact Steam or its CDN directly.

## Decisions

### Introduce a wallpaper-scoped outbound client

Extract HTTP client construction, proxy parsing, proxy-only authentication, timeouts, and response sending into a Spring component used by discovery, metadata resolution, and direct-download import. The client accepts request-specific body handlers so byte limits and trusted-host validation remain at their existing business boundaries.

Keeping separate clients in each service was rejected because that caused the current production split: discovery was fixed while import silently retained direct networking. JVM-wide proxy properties were rejected because they would route unrelated music, AI, storage, and OAuth integrations.

### Resolve Workshop metadata in one shared provider

Create a provider that first calls `GetPublishedFileDetails`, validates the item result and preview metadata, then falls back to the public detail page for any retryable transport, response, parse, or item-result failure. Both item detail and import consume the same resolved metadata record.

Duplicating fallback logic in both services was rejected because their behavior would drift again. Treating a non-success API item result as definitive NOT_FOUND was rejected because production evidence shows the same public item remains valid through the detail page.

### Add an additive channel enum and availability fields

Extend the item-detail response with `download_channel`, `download_available`, and `channel_message`, while retaining `has_direct_download`. Channel priority is DIRECT, then STEAMCMD, then UNAVAILABLE. SteamCMD readiness requires the feature flag, app ID, command availability, and configured account credentials; this matches the actual command path rather than merely checking a nonblank executable string.

A binary replacement for `has_direct_download` was rejected because it would break existing clients and still could not distinguish SteamCMD from unavailable.

### Keep SteamCMD execution authoritative

The preflight status reports configuration readiness, but the import job remains authoritative because Steam ownership, cached Steam Guard state, CDN reachability, and item size can fail only at execution time. Direct-download failure falls through to SteamCMD when ready. Error responses and logs include the stage and safe reason, never command credentials.

## Risks / Trade-offs

- [The detail-page markup changes again] → Reuse the current bounded parser plus Open Graph fallback and retain deterministic fallback tests.
- [SteamCMD appears configured but Steam rejects login or ownership] → Keep the asynchronous job result authoritative and return a safe actionable reason.
- [Fallback adds latency when the API is unhealthy] → Bound each request with the existing wallpaper timeout and fall back once; do not retry indefinitely.
- [Shared client refactor affects Wallhaven preview/import] → Preserve trusted-host checks and add focused regression tests before the full media suite.

## Migration Plan

1. Deploy additive backend response fields and shared outbound behavior.
2. Deploy the frontend channel-state rendering against the backward-compatible response.
3. Verify a known production Workshop item returns HTTP 200 repeatedly and reports SteamCMD or unavailable rather than 404.
4. Run an authenticated import, poll its job to a terminal state, and confirm metadata lookup no longer fails.
5. Roll back backend and frontend images together if health or import verification fails; no data migration is needed.
