## ADDED Requirements

### Requirement: Idle playlist loading avoids media probes

Loading a playlist SHALL use supplied track metadata without fetching audio or remote lyrics for automatically selected entries prior to explicit playback.

#### Scenario: Long playlist is loaded without starting playback
- **WHEN** the listener opens a playlist or the shell loads a playlist as a passive default
- **THEN** the player presents the selected song and any supplied duration without creating stream probes or attaching an audio source

#### Scenario: Listener requests playback of the selected track
- **WHEN** the listener presses Play on the automatically selected song
- **THEN** the player uses its normal resolution and playback path for the selected song and can still pause, resume and advance

### Requirement: Independent playback and lyric controls

The compact player SHALL expose separate native actions for expand, play/pause and next, and the global lyric overlay SHALL only appear for active playback on permitted routes.

#### Scenario: Keyboard invokes playback in the compact player
- **WHEN** the listener presses Enter or Space on the playback button
- **THEN** it triggers only playback without expanding the full player

#### Scenario: Audio is paused outside the music library
- **WHEN** a selected song is not playing
- **THEN** its global lyrics do not cover the unrelated page
