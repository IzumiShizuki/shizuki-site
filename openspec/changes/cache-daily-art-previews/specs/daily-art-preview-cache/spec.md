## Purpose

Reuse successfully downloaded public daily artwork and character previews so repeated visits avoid redundant upstream image downloads, while retaining current all-ages verification and bounded resource use.

## ADDED Requirements

### Requirement: Reuse verified preview images
The system SHALL reuse previously downloaded image bytes for the same trusted upstream image URL within a finite cache lifetime and capacity. Concurrent requests for the same image SHALL share a successful download. Failed or unsupported downloads MUST NOT become cached successes.

#### Scenario: Repeat preview request
- **WHEN** a verified all-ages artwork is requested twice with an unchanged image URL and an unexpired cached image
- **THEN** the second response contains the same image without another upstream image download

#### Scenario: Concurrent cold requests
- **WHEN** concurrent previews resolve to the same uncached image URL
- **THEN** they share one successful image download

#### Scenario: Image changed or cache entry expired
- **WHEN** current metadata resolves to a different image URL or the image is no longer cached
- **THEN** the system downloads and validates the current image before responding

#### Scenario: Failed image download
- **WHEN** the upstream image download fails or has an unsupported media type
- **THEN** the request fails and a subsequent request can retry the download

### Requirement: Cache cannot bypass current artwork verification
Every preview request SHALL fetch current artwork metadata and verify all-ages classification, visibility, artwork identity and the trusted HTTPS image source before returning cached bytes or a conditional success. Pixiv session credentials MUST NOT be included in image cache keys, entries or preview upstream requests.

#### Scenario: Artwork becomes restricted after caching
- **WHEN** an already cached artwork is reclassified as R-18, R-18G, unavailable or unclassified
- **THEN** the next preview request fails without returning cached image bytes or a 304 success

### Requirement: Conditional preview responses
Successful preview responses SHALL include a content validator and retain the existing bounded browser cache policy. A matching conditional request SHALL return 304 with no image body only after current verification succeeds.

#### Scenario: Browser already has the same image
- **WHEN** a verified preview request includes a matching If-None-Match validator
- **THEN** the server responds with 304 and no image body

#### Scenario: Browser has an outdated image
- **WHEN** a verified preview request has a validator that differs from the current image
- **THEN** the server responds with 200, the current image and its validator
