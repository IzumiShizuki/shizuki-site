## Purpose

Ensure foreground music selection promptly presents the requested entry and starts from an available playback URL without waiting on optional lyrics or redundant speculative preparation.

## ADDED Requirements

### Requirement: Foreground selection is independent of optional content
The system SHALL commit the requested queue entry and metadata synchronously and SHALL start and acknowledge playback when its usable audio URL is ready, without waiting for remote lyric fallback or optional word-level enhancement.

#### Scenario: Delayed or failed lyric request
- **WHEN** a valid playback URL is available but the lyric request stalls or fails
- **THEN** audio and Folia session handoff proceed with the correct song and later usable lyric content can update the same session without restarting audio

#### Scenario: Inline lyrics and pending lyric URL
- **WHEN** the selected song already includes usable inline lyrics and a remote lyric URL is slow
- **THEN** inline lyrics display immediately and do not delay playback

### Requirement: Preparation is deduplicated and selection guarded
The system SHALL avoid redundant foreground requests for the same queue entry and authorization context, bound speculative work, and prevent results from older selections or account contexts from modifying the current entry or its queue.

#### Scenario: Foreground selects an entry being prepared
- **WHEN** the requested queue entry has an eligible preparation already in flight or a fresh prepared URL
- **THEN** selection reuses that work without an unnecessary duplicate provider request or waiting on unrelated speculation

#### Scenario: Rapid A then B selection
- **WHEN** the user selects B before A's URL or lyrics resolve
- **THEN** B's selected metadata is immediate and A's later results cannot replace B's audio, lyrics, queue identity or Folia view

#### Scenario: Cache miss and cold network measurement
- **WHEN** the cold selection acceptance is run with measured request phases
- **THEN** the recorded selection-to-audio/session latency excludes optional lyric completion and distinguishes application overhead from external network latency
