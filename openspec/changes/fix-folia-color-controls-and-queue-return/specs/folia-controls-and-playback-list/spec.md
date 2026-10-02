## Purpose

Keep Folia lyric preferences and visible playback controls coherent with ordinary mode, and reveal the authoritative playing entry when returning to large playlists or opening the current queue.

## ADDED Requirements

### Requirement: Live shared primary lyric preference
The system SHALL apply a valid toolbar color to the currently mounted Folia primary lyrics during selection and after commitment, across full-player and wall modes, while preserving subtitle and background preferences.

#### Scenario: Color input without closing the picker
- **WHEN** the native color input emits a valid input value while Folia is active
- **THEN** the displayed primary lyric color updates without requiring a change event or player remount

#### Scenario: Reentry and theme reset
- **WHEN** a custom color is followed by song/mode changes or leaving and reentering Folia
- **THEN** the selected color remains effective until reset restores the current theme color

### Requirement: Single Folia transport surface
The host SHALL retain its shared audio session while presenting Folia's native playback controls without an additional host playback bar or host queue overlay on the active Folia surface.

#### Scenario: Enter and leave Folia
- **WHEN** ordinary playback enters Folia and subsequently returns
- **THEN** Folia shows only its native transport while active and ordinary controls are available after return without restarting playback

#### Scenario: Leave before the root mounts
- **WHEN** an in-progress Folia entry is cancelled or the music library page unmounts
- **THEN** its pending mount wait stops polling and cannot activate a stale entry

### Requirement: Authoritative ordinary playback list
The system SHALL return ordinary mode to the authoritative playing playlist or current queue and reveal the exact current entry, including entries outside the initial rendered window and duplicate songs.

#### Scenario: Large playlist song selection
- **WHEN** Folia selects a song after the first 300 entries and the user returns to ordinary mode
- **THEN** ordinary mode shows the corresponding authoritative list with that entry mounted, highlighted and brought into view without being obscured by the fixed playback dock

#### Scenario: Native queue replacement
- **WHEN** a native Folia playlist replaces the queue and the user returns to ordinary mode
- **THEN** ordinary mode presents that complete queue and profile without looking up an opaque Folia identifier as a site playlist

#### Scenario: Open ordinary queue overlay
- **WHEN** the ordinary queue overlay opens with a playing entry away from its top
- **THEN** it reveals the exact current queue entry without changing playback or queue order

#### Scenario: Manual browsing while playback continues
- **WHEN** the user scrolls an ordinary list while the playback clock advances
- **THEN** clock updates do not repeatedly scroll the list back to the playing entry
