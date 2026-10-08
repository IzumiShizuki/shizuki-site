## Purpose

Provide useful names, honest source resolution information and enough results for desktop browsing while controlling upstream metadata traffic and keeping discovery responsive.

## ADDED Requirements

### Requirement: Declared Workshop resolution
The system SHALL expose source-declared resolution on Workshop cards and details, distinguish unknown and dynamic resolution, and MUST NOT treat preview dimensions as asset resolution.

#### Scenario: Source includes a pixel resolution tag
- **WHEN** Steam metadata contains a 1920 x 1080 resolution tag
- **THEN** the user sees 1920 × 1080 with an author-declared indication before importing.

#### Scenario: Source omits resolution
- **WHEN** the source provides no resolution
- **THEN** the interface explicitly displays that resolution is not provided.

### Requirement: Wallhaven descriptive names
The system SHALL prefer source titles and descriptive source names, then meaningful detail tags. It SHALL progressively enrich search results with bounded concurrency and cache metadata. Unavailable names SHALL be explicitly unnamed instead of Wallhaven ID titles.

#### Scenario: Search omits tags
- **WHEN** a search item lacks a descriptive title but detail metadata includes meaningful tags
- **THEN** its displayed name is updated from those tags without blocking the search list.

#### Scenario: Detail requests are throttled
- **WHEN** the automatic metadata request budget is exhausted
- **THEN** enrichment waits before retrying and the list remains usable.

### Requirement: Larger consistent discovery pages
The default discovery batch SHALL contain up to 72 items, with correct pagination and unchanged filters. Wallhaven batches SHALL aggregate consecutive source pages without skipped pages.

#### Scenario: First and second Wallhaven batches
- **WHEN** upstream has six or more pages and the batch size is 72
- **THEN** logical pages one and two contain upstream pages 1–3 and 4–6 respectively, with adjusted last-page count.

#### Scenario: Final partial batch
- **WHEN** fewer than three source pages remain
- **THEN** the system returns the remaining pages and disables advancing past the logical last page.
