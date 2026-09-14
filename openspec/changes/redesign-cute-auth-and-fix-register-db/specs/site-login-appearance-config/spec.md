## Purpose

Store a singleton site-wide login page appearance configuration — theme preset, background image URL, and mascot image URL — that an ADMIN can edit and every visitor's auth page can read, so the owner's anime images and theme apply site-wide instead of only in one browser.

## ADDED Requirements

### Requirement: Singleton site-wide login appearance configuration
The system SHALL persist one login appearance configuration row (theme preset, background image URL, mascot image URL) and expose an ADMIN write/read API with optimistic versioning so concurrent admin edits are rejected instead of silently overwritten.

#### Scenario: An administrator reads the current configuration
- **WHEN** an ADMIN requests the login appearance configuration
- **THEN** the system SHALL return the stored theme preset, image URLs, and current version

#### Scenario: An administrator saves a configuration
- **WHEN** an ADMIN submits a new login appearance configuration with the current version
- **THEN** the system SHALL persist it, increment the version, and return the saved snapshot

#### Scenario: A stale configuration save is rejected
- **WHEN** an ADMIN submits a configuration whose version no longer matches the stored version
- **THEN** the system SHALL reject the save with a conflict and SHALL NOT overwrite the newer configuration

### Requirement: Public read for the auth page
The auth entry page SHALL be able to read the site-wide login appearance configuration without authentication.

#### Scenario: A visitor opens the auth page with a configured site appearance
- **WHEN** an unauthenticated visitor requests the public login appearance
- **THEN** the system SHALL return the stored preset and image URLs when the owner has configured something meaningful (non-default preset or any image)

#### Scenario: Only the default preset is stored
- **WHEN** the stored configuration contains only the default preset and no images
- **THEN** the public read SHALL report the configuration as absent so the frontend falls back to the browser-local theme

### Requirement: Image source validation
The configuration SHALL accept only safe image sources: absolute `http(s)` URLs, site-relative paths, or `data:image/*` URLs, and SHALL reject anything else (for example `javascript:` or `ftp:`).

#### Scenario: An administrator enters an unsafe image URL
- **WHEN** an ADMIN submits a configuration containing a non-image scheme
- **THEN** the system SHALL reject the save with a validation error
