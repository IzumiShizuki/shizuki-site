## Context

The preceding release runs site/backend `16517f6e` and Folia `5bf98f77`. Ordinary music already uses encrypted bound credentials, an NCM sidecar, cloud playlist bundles and a shared audio queue. The current podcast screen only offers public recommendations/search and FM. See proposal.md for the requested correction.

## Goals / Non-Goals

**Goals:** Reproduce the precise unlike failure, correct the responsible request seam, and add authenticated podcast sources using verified installed upstream contracts.

**Non-Goals:** Site blog changes, new dependencies, database migrations, unrelated UI edits, or replacing the playback engine.

## Decisions

1. Build a failing test at the real unlike/list-refresh seam before changing behavior. Distinguish failures from local playlist mutation, cloud bundle refresh, or the upstream song-like response; record evidence in diagnosis.md.
2. Keep explicit acknowledged platform writes. On successful unlike, remove matching provider/resource identity from the visible liked list and update its count without replacing the active playback queue. Only refresh through platform-aware bundle/read paths; isolate account and route generations. Failure preserves existing data.
3. Add an authenticated NetEase podcast account API for liked programs, subscribed collections and created collections, backed by the installed NCM modules. Keep personal sources separate from public recommendation results so their errors and empty states are truthful.
4. Preserve both program ID and main song ID in track metadata. Shared playback consumes main song ID; podcast hearts consume program ID and NetEase's voice favourite contract (`djprogram/subscribe`, `unsubscribe`, `subscribed/paged`). The live detail `program.subscribed` flag can disagree with the actual favourite library; derive individual state and bound-account collection row hearts from favourite-library membership. Public resource thumbs-up counts are a separate concept and do not provide the selectable voice library. Label this source “喜欢／收藏的声音”. Keep music-song and podcast like keys separate, including across Folia notifications.
5. Reuse existing source account credentials and body-only upstream Cookie/timestamp requests, with `X-APICACHE-FORCE-FETCH: true`. The installed NCM cache keys by URL and parsed request cookies, ignoring JSON body account, resource, desired state, and pagination. Validate response shapes and pagination; never expose credentials in URLs or logs. The installed created-collection endpoint is unpaged; reject an explicitly truncated response.

## Risks / Trade-offs

- Upstream podcast endpoints may differ from current documentation → inspect the actually installed version, capture non-secret response shapes, and pin contract fixtures.
- NetEase may delay read-after-write consistency → update the acknowledged local read model without overwriting it with an immediate stale full reload.
- Incomplete or stale account reads → use explicit errors, account generations and independent source loading state.

## Migration Plan

Implement and test locally; apply only this change to a clean checkout based on the current production commit. Build with existing production settings, save and verify a recoverable current application/configuration/database/volume point and frozen images within available capacity, then update the backend and site. Folia changes are only included if program identity requires a bridge update. Verify runtime identities, public/authenticated gates and the actual user-facing podcast sources; retain rollback material and do not Git push.
