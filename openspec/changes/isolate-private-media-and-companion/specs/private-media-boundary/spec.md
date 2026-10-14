## Purpose

Protect ordinary readers from discovering private voice and unmoderated wallpaper sources, while allowing the owner to explicitly grant access through existing administration and retain curated public media.

## ADDED Requirements

### Requirement: Explicit voice authorization
The system SHALL require `music.asmr.access` for the entire voice zone, playback resolution, virtual voice playlists and provider guidance. It SHALL omit voice provider metadata and voice tracks from responses to unauthorized viewers. Built-in FRIEND, USER and GUEST membership SHALL NOT automatically grant voice access.

#### Scenario: Unauthorized cached playback
- **WHEN** an unauthorized viewer requests ASMR playback whose audio exists in a shared cache
- **THEN** access is denied before reading the cache or contacting the provider

#### Scenario: Public metadata
- **WHEN** an unauthorized viewer reads provider listings, default tracks, public user playlists or the library home
- **THEN** voice providers/tracks and public playlists containing voice tracks are absent or inaccessible

#### Scenario: Explicit custom group
- **WHEN** an administrator grants the voice permission to a custom group and assigns an account to it
- **THEN** that account can access voice content after its authorization context refreshes

#### Scenario: Public audio storage
- **WHEN** voice playback or a queued voice cache upload is processed
- **THEN** no voice audio is uploaded to public site storage and playback does not reuse a historical public object cache

#### Scenario: Unavailable permission lookup
- **WHEN** the frontend cannot establish voice permission
- **THEN** it redirects direct voice routes to ordinary music without rendering voice content

### Requirement: Private wallpaper discovery
The system SHALL require authenticated ADMIN membership or `media.wallpaper.discovery` for external wallpaper search, details, previews and imports. It SHALL hide external discovery controls from unauthorized viewers and SHALL NOT publicly cache previews. Curated approved public wallpaper access SHALL remain available.

#### Scenario: Direct external wallpaper request
- **WHEN** a visitor or ungranted account requests an external search, item, preview or import
- **THEN** access is denied before any upstream request

#### Scenario: Authorized preview
- **WHEN** an authorized viewer fetches a wallpaper preview
- **THEN** the response uses private no-store caching

#### Scenario: Ordinary wallpaper panel
- **WHEN** an ungranted account or visitor opens wallpaper settings
- **THEN** installed/public wallpaper controls are available but external discovery controls and requests are absent

### Requirement: Owner management and audit guidance
The system SHALL expose labelled voice and wallpaper-discovery grants in existing ADMIN group management and document assignment through custom groups. The audit report SHALL distinguish tested local code behavior from uninspected production data and include existing PUBLIC-media review instructions.

#### Scenario: Owner opens permissions
- **WHEN** ADMIN opens group permissions
- **THEN** voice and external wallpaper access grants have understandable labels and can be deliberately assigned
