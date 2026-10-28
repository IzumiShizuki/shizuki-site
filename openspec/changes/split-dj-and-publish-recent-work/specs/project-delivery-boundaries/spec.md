## Purpose

Provide separately buildable and versioned DJ and Shizuki projects so changes can be reviewed and delivered independently without losing existing work or exposing private configuration.

## ADDED Requirements

### Requirement: Independent project delivery
DJ and Shizuki SHALL have distinct local repository roots and GitHub remotes. DJ web and native builds MUST not require a sibling Shizuki checkout.

#### Scenario: Build after extraction
- **WHEN** DJ is checked out independently
- **THEN** documented web, native and backend build commands resolve source within that repository

### Requirement: Preserve recent work
Recent source changes SHALL be committed and pushed after applicable checks. Private configuration, credentials and generated build caches MUST remain excluded.

#### Scenario: Publish recent changes
- **WHEN** the authorized publication completes
- **THEN** each repository reports a clean work tree and its delivery branch matches its GitHub tracking branch
