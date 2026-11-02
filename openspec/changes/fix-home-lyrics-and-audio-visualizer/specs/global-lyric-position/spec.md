## Purpose

Ensure global subtitles retain the user's chosen viewport position while navigating the site, temporarily hiding for a player route, and returning without resetting the stored drag offset.

## ADDED Requirements

### Requirement: Stable position across routes
The system SHALL anchor global subtitles consistently to the viewport for a given viewport size and subtitle content, independently of the active page.

#### Scenario: Navigate between Home and applications
- **WHEN** the user navigates from Home to applications and then to the blog at the same viewport size
- **THEN** the global subtitle position SHALL remain unchanged

### Requirement: Preserve user drag offsets
The system SHALL retain the user's global subtitle drag offset across route navigation, temporary hiding, and reloads.

#### Scenario: Drag and navigate
- **WHEN** the user drags subtitles and visits another route
- **THEN** subtitles SHALL keep the same viewport anchor and drag offset

#### Scenario: Return from music and reload
- **WHEN** subtitles are hidden on a music route, the user returns to Home, and reloads
- **THEN** subtitles SHALL reappear at the previously chosen position

### Requirement: Account pages remain free of global subtitles
The system SHALL hide global subtitles on `/auth` and its descendants while playback continues, preserve the existing mobile-shell exclusion, and restore subtitles on eligible routes without interrupting audio.

#### Scenario: Navigate through account pages during playback
- **WHEN** a track with lyrics is playing and the user visits login, registration, or OAuth callback routes
- **THEN** global subtitles SHALL be hidden and account controls SHALL remain unobstructed by lyrics

#### Scenario: Return to an eligible route
- **WHEN** the user returns from an account page to an eligible ordinary page while the track continues playing
- **THEN** global subtitles SHALL reappear according to the existing subtitle toggle and player focus rules
