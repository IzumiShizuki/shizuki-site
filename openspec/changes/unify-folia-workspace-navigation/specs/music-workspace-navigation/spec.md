## Purpose

Provide an interactive music workspace whose ordinary and Folia surfaces share playback while preserving complete playlist, song-entry and return context across navigation, selection and lifecycle changes.

## ADDED Requirements

### Requirement: Folia playlist entry is playback
The workspace SHALL treat every explicit Folia playlist entry or playlist selection as replacing the full shared playback queue and starting its first song. There SHALL be no separately named Folia browse-only playlist action.

#### Scenario: Select another playlist during ordinary playback
- **WHEN** P1 is playing A and the user opens P2 in Folia
- **THEN** the complete P2 queue replaces P1, its first song plays, and Folia reveals P2
- **AND THEN** next and previous operate on P2 and returning restores P2

#### Scenario: Select a native Folia playlist
- **WHEN** the user explicitly selects native playlist P2 for playback
- **THEN** its ordered full queue and provider-aware source identity become authoritative in both modes

#### Scenario: Empty or failed playlist
- **WHEN** the requested playlist is empty or fails to load
- **THEN** the workspace displays a recoverable result, preserves usable navigation, and does not falsely announce a new audible song

### Requirement: Song entry reveals the correct interactive surface
The workspace SHALL distinguish current-song immersive entry, wall selection and shortcut song playback. Successful audio selection SHALL reveal the requested song with usable controls, pointer input, keyboard input and return navigation.

#### Scenario: Current song immersive entry
- **WHEN** ordinary A is playing or paused and the user opens its Folia immersive view
- **THEN** A's full player appears without restarting A or changing its paused state, position or queue

#### Scenario: Wall song selection
- **WHEN** the user plays B from the current playlist wall
- **THEN** B's poster and playback information appear in that wall
- **AND THEN** the wall and its buttons continue accepting mouse and keyboard operations

#### Scenario: Shortcut selection
- **WHEN** B is launched from search, recommendation or a single-song shortcut
- **THEN** the queue reuses or inserts B without duplicate entries and the matching player is revealed

### Requirement: Escape restores the current Folia playlist
Escape and playback-view back controls SHALL restore the current playlist inside Folia without changing the playback session or exiting Folia. Song changes SHALL NOT add playback-history layers to page return navigation.

#### Scenario: Return after changing playlist and songs
- **WHEN** P1 is replaced by P2, songs B/C/D are selected, and the user leaves D's player with Escape
- **THEN** one return reveals P2 rather than P1, the initial home or earlier songs

#### Scenario: Collapse an expanded wall poster
- **WHEN** the current wall poster is expanded and Escape is pressed
- **THEN** the poster collapses within the same playlist wall and interaction remains usable

#### Scenario: Dismiss the top interaction layer
- **WHEN** a dialog, menu or focused editing layer is above the playback view
- **THEN** Escape dismisses that layer once without also returning the underlying page

#### Scenario: Missing return collection
- **WHEN** a song has no resolvable source collection
- **THEN** return reveals the current shared queue as a Folia playlist surface

### Requirement: Embedded navigation preserves host routing
Embedded Folia SHALL preserve the site's route and browser navigation state while managing its own bounded page-return context. Hidden ordinary/Folia surfaces SHALL NOT consume active-surface input.

#### Scenario: Embedded navigation and browser back
- **WHEN** Folia changes between wall, player and native collection surfaces
- **THEN** it does not overwrite the site's URL/history or route state
- **AND THEN** the site's browser back/forward remains valid without undoing an audible song selection

#### Scenario: Park or leave an embedded view
- **WHEN** Folia is hidden, the user leaves the music route or a request is abandoned
- **THEN** old callbacks and hidden key listeners cannot reopen Folia or change the active page

### Requirement: Latest entry and selection wins
The workspace SHALL reject obsolete playlist, song and navigation results across all entry points, including ordinary buttons, the Folia toolbar and native Folia controls.

#### Scenario: Overlapping playlist loads
- **WHEN** P1's load is delayed and P2 is selected later
- **THEN** only P2 can become the active queue, source and visible surface

#### Scenario: Leave while a song is resolving
- **WHEN** B is resolving and the user leaves Folia or selects C
- **THEN** B's late result cannot force a stale surface or overwrite C

### Requirement: Playback and queue controls remain consistent
Both modes SHALL use the same audible song, complete queue, provider-and-queue-entry identity, clock, lyrics, pause state, volume and ordering. Embedded Folia SHALL produce no independent audio or next-track preparation pipeline.

#### Scenario: Pause and seek across modes
- **WHEN** a paused track is moved to a new position and modes are switched
- **THEN** position and lyrics agree and the track remains paused

#### Scenario: Next track and random ordering
- **WHEN** next/previous or auto-advance occurs in either mode
- **THEN** the common playback ordering and current entry agree without rebuilding random order on a mode change

### Requirement: Ordinary return restores source context
Returning to ordinary mode SHALL retain current playback and restore a valid corresponding playlist or queue surface. Native collection IDs SHALL remain source identities rather than being assumed to be backend playlist codes.

#### Scenario: Return after native P2 playback
- **WHEN** native P2 becomes active and the user returns to ordinary mode
- **THEN** B and the complete P2 queue remain current and the interface shows a mapped playlist or explicit current-queue fallback

#### Scenario: Return without changing playback
- **WHEN** the user only changes display mode
- **THEN** ordinary filters/scroll context is preserved where applicable and current playback is not restarted

### Requirement: Lifecycle and failure preserve interaction
Cold/warm entry, renderer loading/failure, canceled transitions, layout changes and route reentry SHALL leave a usable navigation and playback-control path. Requested songs being prepared SHALL be distinguishable from the song actually sounding.

#### Scenario: Successful audio with pending visuals
- **WHEN** audio is playing but the desired visual surface is not ready
- **THEN** the workspace exposes loading/retry state and keeps return, selection and playback controls operable

#### Scenario: Resize and reentry
- **WHEN** the user changes viewport layout or reenters the music workspace
- **THEN** the correct surface remeasures and accepts input using the latest session

### Requirement: Existing data and preferences remain coherent
Both modes SHALL retain current authorization, playlist synchronization, provider/source identity and existing primary lyric color behavior. Folia SHALL show the ordinary dock compactly while its shared controls remain accessible. Separate tabs SHALL retain independent playback sessions while common account/preferences retain their existing scope.

#### Scenario: Preferences after track and mode changes
- **WHEN** a lyric color or shared playback preference is changed and songs/modes change
- **THEN** the setting remains effective and reset restores its documented default

#### Scenario: Compact dock in Folia
- **WHEN** Folia is active
- **THEN** the ordinary dock presents a concise shared playback bar that can expose its controls without blocking Folia input
