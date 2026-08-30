## Purpose

Make online wallpaper discovery return recognizable, previewable catalog entries and expose practical source-specific controls without changing the existing import workflow.

## ADDED Requirements

### Requirement: Workshop results retain usable metadata across markup versions
The system SHALL return a stable item identifier, a nonblank display title, a usable preview URL when one is present, and a source detail URL for Workshop browse results. It MUST support both the legacy Workshop card markup and the current card markup where the title is carried by an image alternative-text attribute. If an upstream item genuinely has no title, the system SHALL return a deterministic source-and-ID fallback rather than an empty title.

#### Scenario: Current Workshop card is parsed
- **WHEN** the Workshop browse response contains a current card with an item link followed by an image whose `src` and `alt` contain the preview and title
- **THEN** the discovery response contains that item ID, decoded title, preview URL, and detail URL

#### Scenario: Legacy Workshop card is parsed
- **WHEN** the Workshop browse response uses the legacy preview-image and title classes
- **THEN** the discovery response preserves the existing title and preview extraction behavior

#### Scenario: Workshop title remains unavailable
- **WHEN** an otherwise valid Workshop item has no extractable title
- **THEN** the result uses `Workshop #<item-id>` as its display title and is not shown as unnamed

### Requirement: Result cards display available source metadata
The system SHALL display a recognizable title and useful source metadata for each result. Workshop metadata MUST retain the source item ID, and Wallhaven metadata MUST include its category, purity, resolution, file size, view count, favorite count, and creation time when supplied by the upstream response. Missing optional metadata MUST NOT remove the result.

#### Scenario: Wallhaven metadata is available
- **WHEN** Wallhaven returns category, purity, dimensions, popularity, and creation fields
- **THEN** the result card and selected-item inspector show a concise subset of those values and retain the remaining values in the normalized item

#### Scenario: Optional metadata is absent
- **WHEN** one or more optional metadata fields are absent
- **THEN** the card still renders with its source ID and available fields without an unnamed label

### Requirement: Workshop discovery supports source tags
The system SHALL allow users to filter Workshop search by wallpaper type, genre, and resolution. Selected nonblank values MUST be validated against supported allowlists and sent as required Workshop tags through both the Steam API and browse-page fallback paths. Search, sort, pagination, and selected tag values MUST remain stable until reset or source change.

#### Scenario: Apply Workshop filters
- **WHEN** the user chooses a type, genre, and resolution and submits a search
- **THEN** the request includes each selected tag once and the returned page reflects the selected tag constraints

#### Scenario: Reject unsupported Workshop tag
- **WHEN** a discovery request contains a tag outside the supported allowlists
- **THEN** the server ignores the unsupported value while preserving valid search inputs and source safety

### Requirement: Wallhaven discovery exposes its supported filters
The system SHALL expose category, purity, minimum resolution, aspect ratio, sorting, and ascending or descending order controls for Wallhaven. Without a Wallhaven API key, the system MUST remove only the NSFW purity bit while preserving requested SFW and sketchy filters; if no allowed purity remains, it MUST fall back to SFW.

#### Scenario: Search Wallhaven with complete filters
- **WHEN** the user submits category, purity, minimum resolution, ratio, sorting, and order values
- **THEN** the backend sends the normalized values to Wallhaven and the UI keeps them visible while paging

#### Scenario: Guest requests sketchy results
- **WHEN** no Wallhaven API key is configured and purity `110` is requested
- **THEN** the backend preserves SFW and sketchy selection as `110`

#### Scenario: Guest request contains NSFW
- **WHEN** no Wallhaven API key is configured and the requested purity includes NSFW
- **THEN** the backend clears the NSFW bit and uses the remaining allowed bits or SFW when none remain

### Requirement: Existing discovery and import behavior remains compatible
The system SHALL keep the current public read endpoints, same-origin preview proxy, pagination behavior, source switching, and authenticated import events compatible with existing callers. Added request parameters and response fields MUST be optional and backward compatible.

#### Scenario: Existing caller omits new filters
- **WHEN** an existing caller submits only query, page, and sort values
- **THEN** the server performs an untagged Workshop search or default-safe Wallhaven search with the existing response envelope
