## Purpose

Ensure the normal music workspace and embedded Folia expose a consistent playback session, responsive controls, and access to the same authorized NetEase library.

## ADDED Requirements

### Requirement: Embedded playback state matches audible playback
Both music modes SHALL display the position, duration, and play/pause state of the single site-owned audio session. Embedded controls SHALL appear available when the authoritative session can accept their actions, without requiring a Folia-owned audio source.

#### Scenario: Audible song has advancing progress
- **WHEN** the site audio advances while Folia is visible
- **THEN** Folia's time display and range advance from the site's clock instead of remaining zero
- **AND THEN** Folia does not resolve or start an independent audio stream

#### Scenario: Pause and seek are intentional controls
- **WHEN** the visitor pauses or drags a progress control immediately after a session correction
- **THEN** the site audio and Folia display accept the action without discarding it as a synchronization echo
- **AND THEN** resuming continues from the selected position

#### Scenario: Rapidly choose two songs
- **WHEN** the visitor chooses a second track before the first selection has resolved
- **THEN** only the latest selection can become the audible track and displayed session

### Requirement: Preparation is independent of visible mode
The shared music player SHALL perform bounded next-track preparation for the active playback ordering in either mode. Preparation failures SHALL NOT interrupt current playback, replace current lyrics, consume foreground playback quota, or automatically skip the next track.

#### Scenario: Normal playback prepares the next track
- **WHEN** an online track plays with another track next in the active queue
- **THEN** the normal workspace prepares that next track's playback data using the same source and authorization as foreground playback
- **AND THEN** changing to Folia does not create a second preparation pipeline

#### Scenario: Queue changes during preparation
- **WHEN** the queue or account changes while preparation is pending
- **THEN** obsolete preparation does not overwrite current track state or authorize the new account with an old account's data

### Requirement: Authorized NetEase playlists appear in either workspace
The music workspace SHALL detect an existing same-origin Folia NetEase authorization when opening either mode and make the user's authorized NetEase playlists available through the normal library. Repeated entry and unchanged credentials SHALL avoid duplicate imports and overlapping synchronization.

#### Scenario: Open normal mode after Folia login
- **WHEN** a signed-in site user opens normal mode with a valid stored Folia NetEase session
- **THEN** the account authorization is synchronized and the user's NetEase playlists appear without entering Folia first

#### Scenario: Login changes or expires
- **WHEN** the available NetEase session changes or synchronization fails
- **THEN** the library refreshes for the new valid session or shows a recoverable synchronization error
- **AND THEN** credentials are never exposed in diagnostic output

### Requirement: Diagnostics separate deployment and source failures
The investigation SHALL record reproducible evidence, affected paths, and deployment version differences for each reported symptom. Authorization failures from optional lyric sources SHALL be identified separately from audio playback and control failures.

#### Scenario: Optional lyric provider returns unauthorized
- **WHEN** the supplied trace or a read-only probe reports a lyric proxy 401
- **THEN** the report identifies the proxy's routing/authorization boundary and does not claim the provider returned no lyrics
- **AND THEN** source verification is reported separately from production acceptance
