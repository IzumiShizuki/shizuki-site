## Purpose

Let users browse large account playlists promptly and choose when to move the view to the currently playing song, while retaining complete playlist playback.

## ADDED Requirements

### Requirement: Bounded account playlist browsing
The system SHALL support ordered, bounded track pages for account playlists with the authoritative playlist total. Opening a playlist SHALL request only its first page and SHALL NOT wait for unrelated library requests. Existing full-bundle requests SHALL retain their behavior.

#### Scenario: Large playlist first page
- **WHEN** a user opens an account playlist containing more than one page
- **THEN** the first page and total become visible without loading later pages or waiting for the sidebar

#### Scenario: Continue browsing
- **WHEN** the user requests more tracks
- **THEN** the next page is appended in order with the existing tracks retained, and failed requests remain retryable

#### Scenario: Route changes during loading
- **WHEN** a user changes playlists or accounts before a request completes
- **THEN** the old result does not replace the new playlist

#### Scenario: Complete playlist playback
- **WHEN** the user starts playlist playback or opens the playlist in Folia
- **THEN** the full ordered queue remains available, including songs beyond the browse page

### Requirement: Explicit current-song location
The music list SHALL provide a current-song location button. Song changes and page updates SHALL preserve the user's browse position. Explicit location SHALL reveal and center the exact queue entry, including duplicate songs beyond the initial visible rows.

#### Scenario: Playback changes during browsing
- **WHEN** the current song changes while the user browses the list
- **THEN** the active highlight updates without automatic scrolling or expanding the list

#### Scenario: Locate a late duplicate entry
- **WHEN** the user clicks the location button for a current entry beyond the visible rows
- **THEN** the list reveals and centers that exact entry

#### Scenario: Current song outside the playlist
- **WHEN** the current song is absent from the playlist
- **THEN** the location control is disabled and does not scroll another row
