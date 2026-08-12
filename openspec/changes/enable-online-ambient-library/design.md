## Context

The Freesound search client, backend search proxy, remote-track normalization, and online result UI already exist, but the application shell does not enable the online tab or load provider status. The current result action emits a remote track that points directly at a Freesound preview and therefore does not create a durable user-owned asset. The existing media domain already provides private audio upload, security inspection, quota accounting, and signed download URLs. See `proposal.md` and `specs/online-ambient-library/spec.md` for the intended behavior.

Freesound token authentication can retrieve metadata and MP3 previews. Downloading the original uploaded file requires OAuth2, so this change stores the high-quality MP3 preview and labels it as such. The provider token remains server-side. The deployed application uses PostgreSQL by default, while a MySQL migration set is retained for compatibility.

## Goals / Non-Goals

**Goals:**

- Connect the existing online tab to the application shell and provider availability state.
- Add a bounded, authenticated, idempotent Freesound-preview import pipeline.
- Reuse private media assets, quota checks, object storage, signed playback URLs, and ambient mixer state.
- Preserve provider attribution and expose clear per-result import progress.

**Non-Goals:**

- Download Freesound original-quality files through user OAuth2.
- Mirror or bulk-copy the Freesound catalog.
- Make imported ambient assets public or add a general asset-management screen.
- Delete an underlying private asset when it is removed from the current ambient mix.

## Decisions

### 1. Import by provider identifier, not by URL

The import request contains only the Freesound sound identifier. The backend resolves the sound detail again, accepts only CC0 and CC-BY, chooses the high-quality MP3 preview, validates HTTPS and an exact preview-host allowlist, and performs a bounded download. This prevents the endpoint from becoming a generic server-side URL fetcher and prevents clients from forging attribution.

Alternative considered: send the search result's preview URL and metadata back to the server. It is simpler but creates an SSRF surface and makes license metadata client-controlled.

### 2. Store high-quality preview as a private `AUDIO` asset

The import service stores the downloaded MP3 in the private media bucket and adapts it to the existing asset-creation pipeline. The resulting asset uses private visibility and metadata containing `usage=ambient_sound`, provider, provider sound ID, author, license, source page, duration, preview URL, and preview quality. Playback uses the existing signed asset-download endpoint.

Alternative considered: persist the remote preview URL directly in user preferences. That leaves playback dependent on an expiring or changed third-party resource, does not satisfy download/save semantics, and bypasses existing storage policy.

### 3. Track provider imports in a dedicated relation

A small `MDA_AMBIENT_SOURCE_ASSET` relation records `user_id`, `provider_code`, `source_sound_id`, and `asset_id`, with a unique key on the first three fields. The service checks this relation before downloading and resolves concurrent duplicates through the database uniqueness constraint. A successful repeated request returns the existing asset.

Alternative considered: search `MDA_ASSET.metadata_json`. JSON matching is database-specific, cannot reliably enforce uniqueness, and is vulnerable to races. A deterministic object key alone would still leave ambiguous partial-failure recovery and no explicit source-to-asset relation.

### 4. Keep orchestration in an ambient-library service

The controller remains limited to HTTP validation, rate limiting, audit annotation, and delegation. A dedicated service obtains the login identity, checks idempotency, asks the provider for trusted detail and bounded bytes, calls the existing media service to upload/create the asset, persists the source relation, and obtains the signed URL. Provider HTTP behavior remains in `FreesoundProvider`; generic asset rules remain in `MediaService`.

Alternative considered: implement import steps in the controller. That would combine authentication, HTTP, storage, persistence, and compensation logic in the transport layer and make the behavior harder to test.

### 5. Activate only after durable import succeeds

The panel owns search/preview and per-result progress, while the application shell owns authentication, durable state, signed-URL cache, and mixer synchronization. On success the shell upserts a returned `asset:<id>` track as enabled. Guests receive a sign-in message; no `remote` track is persisted as a substitute.

### 6. Reuse asset quota and inspection rules

The import service writes the bounded preview to the private bucket, then delegates asset creation to the existing media service. Content inspection, object-hash deduplication, audio quota validation, and byte accounting therefore keep the same semantics as an ordinary private audio asset.

## Risks / Trade-offs

- **[Preview quality is lower than the original upload]** → Label the stored file as a Freesound high-quality MP3 preview; adding OAuth2 original downloads remains a separate feature.
- **[Concurrent requests import the same source]** → Reserve the unique user/provider/sound relation before downloading; a losing request re-reads the winning relation and never uploads a duplicate object.
- **[Object upload succeeds but later asset creation fails]** → The import service compensates by deleting the uploaded object; errors remain visible and retryable.
- **[Signed playback URL expires]** → Reuse the existing ambient asset URL resolver and cache, which refreshes signed URLs by asset ID.
- **[Freesound changes preview hosts or API fields]** → Keep the host allowlist and endpoint templates configurable, fail closed, and report provider errors without disturbing existing ambient tracks.
- **[API terms or licenses change]** → Retain source/license metadata and restrict imports to explicitly mapped reusable licenses; deployment owners remain responsible for Freesound API terms.

## Migration Plan

1. Apply MySQL and PostgreSQL migrations for `MDA_AMBIENT_SOURCE_ASSET` before enabling the import endpoint.
2. Deploy the backend with the existing `MUSIC_FREESOUND_API_KEY`; optional endpoint, size, and timeout settings retain safe defaults.
3. Deploy the frontend. It discovers availability dynamically and leaves bundled/uploaded sounds operational when the provider is disabled.
4. Roll back the frontend and backend independently if needed. The new relation and private assets are additive and can remain without affecting old clients.
