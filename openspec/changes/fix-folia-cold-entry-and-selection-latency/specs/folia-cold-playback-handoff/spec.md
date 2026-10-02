## Purpose

Preserve the selected song, authoritative queue and source playlist across first Folia activation, parked reentry and rapid exit while bootstrap or playback preparation is still pending.

## ADDED Requirements

### Requirement: Every activation has an authoritative playback session
The system SHALL display the current selected song and queue on every Folia activation, even when selection and lyrics finished before activation, while reporting pending loading or a recoverable error instead of silently showing an empty player.

#### Scenario: Stable ordinary song and cold Folia entry
- **WHEN** an ordinary song is fully selected and its state does not change while Folia mounts for the first time
- **THEN** Folia consumes that same current entry and complete queue before navigating to playback and does not require another song or lyric event

#### Scenario: Pending selection and rapid activation
- **WHEN** the user selects a new song and enters Folia before its playback URL or optional lyrics finish
- **THEN** Folia identifies the newly selected song and existing queue promptly and updates readiness without displaying the previous selection as current

#### Scenario: Parked reentry without a state change
- **WHEN** the user exits Folia and reenters on the same paused song
- **THEN** the current entry, queue, playback position and controls are restored without another selection event

### Requirement: Exit preserves queue and source context
The system SHALL retain the authoritative queue and source playlist when exiting or cancelling entry, and SHALL reject stale deferred initialization or selection results that would replace a newer queue.

#### Scenario: Exit while preparing playback or mounting
- **WHEN** the user leaves Folia while its song or bootstrap is pending
- **THEN** ordinary mode returns to the corresponding source list or nonempty current queue and a later pending completion cannot activate Folia or erase that queue

#### Scenario: Empty startup without a selected song
- **WHEN** Folia opens with no selected song or queue
- **THEN** it shows an intentional empty state and exiting restores the user's valid browse context
