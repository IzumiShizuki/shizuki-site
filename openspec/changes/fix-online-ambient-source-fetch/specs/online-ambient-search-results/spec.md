## Purpose

Ensure that configured Freesound searches expose eligible online ambient audio to website users instead of returning an empty local list when the upstream response contains usable results.

## ADDED Requirements

### Requirement: Eligible upstream search results are exposed

The system SHALL return each Freesound result that has a supported CC0 or CC-BY license, a valid sound identifier, and an MP3 preview URL from the configured search response.

#### Scenario: Search returns an eligible CC0 sound

- **WHEN** Freesound returns a matching CC0 sound with its identifier, attribution metadata, duration, and MP3 preview
- **THEN** the ambient-library search response includes that sound as a usable result with its preview and source attribution

#### Scenario: Search response contains no eligible sounds

- **WHEN** Freesound returns no sounds that meet the license and preview requirements
- **THEN** the ambient-library search response returns an empty item list without reporting a false provider failure
