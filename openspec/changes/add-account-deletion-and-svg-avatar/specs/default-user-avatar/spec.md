## Purpose

Provide a consistent local SVG default user avatar across desktop navigation, profile screens, administrative user lists and mobile screens, while keeping each user's uploaded avatar when it is available.

## ADDED Requirements

### Requirement: Local SVG user avatar
User avatar surfaces SHALL display the bundled SVG human avatar when no custom avatar exists or a custom avatar fails to load, and SHALL retain valid custom avatars.

#### Scenario: Missing avatar
- **WHEN** a user has no avatar URL
- **THEN** all user-avatar surfaces display the local SVG default

#### Scenario: Failed custom avatar
- **WHEN** a custom avatar fails to load
- **THEN** the surface falls back to the SVG without repeated retries

#### Scenario: Custom avatar changes
- **WHEN** a new custom avatar URL is supplied after a failure
- **THEN** the new URL is attempted and displayed on success
