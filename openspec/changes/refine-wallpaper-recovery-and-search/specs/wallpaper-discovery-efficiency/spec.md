## Purpose

Provide a dense and responsive wallpaper discovery workspace that reflects the supplied Wallpaper Engine composition and avoids redundant upstream work.

## ADDED Requirements

### Requirement: Compact three-region discovery workspace
Desktop discovery SHALL arrange a narrow filter rail, dense thumbnail gallery with pagination, and selected-item inspector. Existing source search, sorting, supported filters, source links and authenticated import actions SHALL remain usable. The interface SHALL adapt to smaller screens with accessible filter disclosure and readable controls.

#### Scenario: Browse Workshop on desktop
- **WHEN** the Workshop tab is opened at a common desktop viewport
- **THEN** supported filters are shown in a left rail, results use compact image-led tiles, and selecting a tile updates the right inspector

#### Scenario: Use a narrow viewport
- **WHEN** the workspace is viewed on a narrow screen
- **THEN** filters remain reachable and the gallery and inspector remain usable without horizontal overflow

### Requirement: Repeated searches reuse bounded results and stale work cannot overwrite current state
The discovery workspace SHALL reuse bounded cached results for identical normalized source, query, filter and page parameters. Rapid filter changes SHALL coalesce requests, and an older search or detail response SHALL NOT overwrite the current selection or source. Explicit refresh SHALL allow fresh retrieval.

#### Scenario: Return to a cached result page
- **WHEN** the user revisits a successfully loaded parameter combination within its cache lifetime
- **THEN** results appear without repeating the same upstream search

#### Scenario: Rapidly change filters or sources
- **WHEN** the user changes filters or sources while an earlier request is pending
- **THEN** the final state corresponds to the latest input and redundant queued filter searches are coalesced

### Requirement: Thumbnail browsing avoids redundant detail resolution
The system SHALL reuse preview metadata already available in search results and bounded preview or metadata caches. Displaying each grid thumbnail SHALL NOT require a fresh independent detail lookup when that metadata is already known. Preview loading SHALL remain lazy, bounded and recoverable.

#### Scenario: First page contains known preview URLs
- **WHEN** search returns a page with valid thumbnail metadata
- **THEN** displaying that page avoids a second detail lookup for every item and reserves tile geometry while images load

#### Scenario: Primary preview fails
- **WHEN** a result thumbnail fails to load
- **THEN** a supported fallback or explicit retry state appears without continuously retrying or collapsing tile geometry
