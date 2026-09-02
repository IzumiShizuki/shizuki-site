## Purpose

为站点提供每天稳定一致、来源可追溯且不依赖每次访问实时请求的今日一言，同时允许后台维护本地语句并在第三方来源故障时可靠兜底。

## ADDED Requirements

### Requirement: The site commits at most one canonical quote per local day
The system SHALL commit at most one canonical daily quote for each date in the configured site time zone and MUST keep any committed quote stable across visitors, page reloads, process restarts, and cache rebuilds. When no current-date snapshot can be committed, the response MUST remain explicitly stale or unavailable rather than relabeling an earlier quote as the current canonical snapshot.

#### Scenario: Multiple visitors request today's quote
- **WHEN** multiple visitors request the daily quote on the same site-local date and a canonical snapshot exists for that date
- **THEN** they receive the same canonical quote identity, text, provenance, and effective date

#### Scenario: Site date changes
- **WHEN** the configured site time zone advances to a new calendar date
- **THEN** the system attempts to resolve a canonical snapshot for the new date without changing the completed snapshot for the previous date
- **AND** if resolution fails, it applies the explicit stale or unavailable fallback contract without fabricating a current-date snapshot

### Requirement: Hitokoto is the primary daily source
The system SHALL use the official Hitokoto API as the primary external quote source and MUST normalize accepted results into a durable daily snapshot before serving them as canonical content.

#### Scenario: Hitokoto returns an accepted quote
- **WHEN** the daily refresh receives a valid and permitted Hitokoto result
- **THEN** the canonical snapshot stores the text, Hitokoto UUID or identifier, type, work or source, attributed speaker or author when supplied, source destination, and retrieval time

#### Scenario: Hitokoto response is invalid
- **WHEN** Hitokoto times out, returns an error, or omits required quote data
- **THEN** the response is not installed as a canonical quote and the fallback policy is applied

### Requirement: Daily quote retrieval is cached and upstream-bounded
The system MUST serve the persisted daily snapshot or its fresh cache for visitor requests and MUST NOT issue a Hitokoto request for each visitor, page load, or local alternative action.

#### Scenario: Daily snapshot already exists
- **WHEN** the canonical snapshot for the current date already exists
- **THEN** a visitor request returns it without contacting Hitokoto

#### Scenario: Persisted snapshot is reloaded after a cache miss
- **WHEN** the current canonical snapshot is read from the database after a cache miss or process restart
- **THEN** the visitor response preserves its text, author, provider, provider identifier, source destination, effective date, and retrieval time
- **AND** persistence column names do not cause available snapshot fields to be returned as null

#### Scenario: Concurrent refresh is triggered
- **WHEN** multiple application instances detect the same missing daily snapshot
- **THEN** at most one canonical result is committed for that date and all successful responses converge on it

### Requirement: Local quote curation is a first-class fallback
The system SHALL let authorized administrators create, edit, enable, disable, categorize, and review local quotes with provenance, and MUST consider only enabled approved entries for visitor-facing selection.

#### Scenario: Administrator disables a local quote
- **WHEN** an administrator disables a local quote
- **THEN** that quote is excluded from future daily fallback and local alternative selection without rewriting historical daily snapshots

#### Scenario: Administrator curates an external quote
- **WHEN** an administrator saves an externally sourced quote into the local library
- **THEN** the saved entry retains its provider, external identifier when present, work or author attribution, source link, and review state

### Requirement: Changing the displayed quote stays local
The system SHALL offer a local alternative action that does not replace the canonical daily snapshot and MUST NOT contact Hitokoto as a consequence of that action.

#### Scenario: Visitor selects another quote
- **WHEN** a visitor activates the local alternative action and an eligible local quote exists
- **THEN** the card displays an eligible local alternative for that visitor while the canonical daily quote remains unchanged for other visitors and future loads

#### Scenario: No local alternative exists
- **WHEN** a visitor activates the local alternative action but no eligible local alternative is available
- **THEN** the card keeps the canonical daily quote and does not fetch a replacement from Hitokoto

### Requirement: Quote failures use explicit fallback provenance
The system SHALL fall back to an eligible local quote or the last usable canonical snapshot when Hitokoto cannot provide the current daily quote, and MUST identify the fallback state and actual source.

#### Scenario: Hitokoto fails and local content exists
- **WHEN** the current date has no canonical snapshot, Hitokoto fails, and an eligible local quote exists
- **THEN** the system commits a stable local fallback snapshot for the date and marks its source as local fallback

#### Scenario: Only a last-good snapshot exists
- **WHEN** Hitokoto fails and no eligible local quote exists but a prior canonical snapshot is usable
- **THEN** the system returns the prior snapshot marked as stale fallback with its original effective date

#### Scenario: No fallback exists
- **WHEN** Hitokoto fails and neither eligible local content nor a usable prior snapshot exists
- **THEN** the quote module reports an unavailable state and does not fabricate a quotation or attribution

### Requirement: Quote provenance is visible and stable
The system MUST expose provider, work or source, author or speaker when known, and a usable source destination for every externally sourced quote, and SHALL preserve the provenance captured in each historical daily snapshot.

#### Scenario: Visitor expands quote details
- **WHEN** a visitor opens the details of a Hitokoto-derived daily quote
- **THEN** the card displays its available source, attribution, category, and source link using the stored snapshot values

#### Scenario: Curated source metadata is later edited
- **WHEN** an administrator edits the current local library record after it was used for an earlier daily snapshot
- **THEN** the historical snapshot continues to report the provenance that was committed for its date

### Requirement: Quote mutations are administrator-only
The system MUST restrict quote curation, provider enablement, source-mode changes, refresh, and historical snapshot management to authorized administrators. A normal refresh MUST NOT replace an already committed snapshot for the same site-local date.

#### Scenario: Non-administrator attempts quote curation
- **WHEN** an authenticated non-administrator invokes a quote-management mutation
- **THEN** the system returns a real forbidden response and changes no quote, configuration, or daily snapshot

#### Scenario: Administrator refreshes an already completed date
- **WHEN** an administrator requests a normal refresh after the current date has a committed canonical snapshot
- **THEN** the service returns the existing immutable snapshot without replacing its identity, text, or provenance

#### Scenario: Administrator switches to local source mode
- **WHEN** an administrator atomically changes the quote source mode to local
- **THEN** future daily resolution uses only enabled approved local quotes
- **AND** visitor requests and scheduled resolution make no Hitokoto call while the mode remains local
