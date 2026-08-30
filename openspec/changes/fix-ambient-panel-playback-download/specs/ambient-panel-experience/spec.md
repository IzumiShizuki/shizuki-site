## Purpose

Provide a readable atmosphere panel that builds its reusable ambient catalog from online sources, imports them reliably, and mixes several saved sounds at the same time.

## ADDED Requirements

### Requirement: Theme-safe atmosphere panel
The atmosphere panel SHALL provide readable foreground, background, border, focus, disabled, and status colors for every supported theme.

#### Scenario: Use the panel in dark mode
- **WHEN** the site is using dark mode and the user opens any atmosphere-panel tab
- **THEN** headings, labels, cards, inputs, buttons, sliders, metadata, warnings, and empty states remain visibly distinguishable from their backgrounds

#### Scenario: Switch themes while the panel is open
- **WHEN** the user changes between light and dark mode while the atmosphere panel is visible
- **THEN** the panel updates its semantic colors without losing the selected tab or active sounds

### Requirement: Online-backed default ambient library
The main ambient-sound view SHALL list saved online ambient assets instead of shipping a separate bundled default-sound catalog.

#### Scenario: Import an online sound
- **WHEN** a signed-in user saves an eligible online result successfully
- **THEN** the sound appears in the main ambient-sound view and becomes available for the current background mix

#### Scenario: No online sounds have been saved
- **WHEN** the user opens the main ambient-sound view without any saved online assets
- **THEN** the panel shows an empty state that directs the user to search the online catalog

### Requirement: Simultaneous ambient playback
The application SHALL allow multiple saved ambient sounds to be enabled concurrently and SHALL preserve an independent volume for each sound.

#### Scenario: Enable several sounds
- **WHEN** the user enables a second or subsequent saved ambient sound
- **THEN** every enabled sound continues playing concurrently through the shared ambient master volume

#### Scenario: Adjust one sound
- **WHEN** the user changes the volume or enabled state of one saved sound
- **THEN** only that sound changes and the remaining active sounds continue uninterrupted

### Requirement: Reliable online sound import
The backend SHALL import an eligible online sound using an allowed provider audio URL, enforce size and content checks, store it as the user's private ambient asset, and return a playable asset reference.

#### Scenario: Import succeeds
- **WHEN** an authenticated user saves an eligible provider sound whose audio response satisfies the configured limits
- **THEN** the system stores or reuses the private asset and returns a signed playback reference suitable for the ambient mixer

#### Scenario: Provider audio cannot be downloaded
- **WHEN** the provider rejects, redirects outside the allowlist, times out, or returns an invalid audio payload
- **THEN** the system reports a retryable per-track failure, removes partial storage or database data, and keeps the current ambient mix unchanged

#### Scenario: Sound was imported previously
- **WHEN** the user saves a provider sound already present in their ambient library
- **THEN** the system reuses the existing asset without downloading or creating a duplicate track
