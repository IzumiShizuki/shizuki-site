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

### Requirement: Keep the current track audible during a user-initiated next track lookup
While an existing track is playing, a manual Next request SHALL keep its audio and current metadata until the latest eligible target returns a playable source. The player SHALL have at most one audible element and SHALL NOT start competing speculative requests during this foreground lookup. Metadata and playback SHALL hand over together when the new source starts loading; buffering after that handover remains possible.

#### Scenario: Several requests arrive before a playable source is found
- **WHEN** Next is pressed again before the previous target is ready
- **THEN** the new request advances from the latest queued target and only the last eligible target can replace the playing source
- **AND** automatic end-of-track handling does not start an extra selection while that request is pending.

#### Scenario: The next source cannot be resolved
- **WHEN** no authorized playable source is returned for the pending target
- **THEN** its failure is exposed for retry or skip without interrupting the current audio
- **AND** withdrawing the request or changing the active queue order or authorization prevents the superseded response from committing.


### Requirement: Reuse playable next track data

Ordinary and Folia playback SHALL use the same eligible next-track preparation. The player SHALL prepare no more than one standby source, skip speculative audio on known metered or slow connections, and reuse only the exact ready media with a current queue entry and authorization context.

#### Scenario: Prepared media starts
- **WHEN** Next selects a ready, still-authorized standby source
- **THEN** the existing buffer starts playback without reloading or resolving that song again, and the previous song stops

#### Scenario: Prepared media is unavailable
- **WHEN** standby failed, expired, was not eligible or changed with playback context
- **THEN** the existing foreground resolution and playback path handles the request without playing an outdated standby
