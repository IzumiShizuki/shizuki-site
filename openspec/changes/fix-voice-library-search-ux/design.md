## Context

The catalogue API returns tag facets inferred from the current page. Filter identity is the numeric upstream tag ID, never a localized label. Emit an additive display name from the upstream Chinese translation (when present); retain the raw name for provider queries and make both searchable in the local facet list.

## Design

Preserve search, safe age selection, sort and tag IDs in the catalogue link. Keep restrictive default for fresh direct links; never restore expanded age modes from a shared URL. Retain chosen tag names only in the active catalogue flow, with a clear removal fallback when no display name exists. Local tag name filtering does not send requests. Replace catalogue results with the latest submitted request only, cancel earlier requests and guard all asynchronous updates. Use lazy, asynchronous cover decoding and stable keyed result deduplication. Explicit pagination remains available if automatically loading fails.
