## Purpose

Give the Home page a clearly visible music visualization consistent with the music detail experience, including responsive frequency bars and peak markers that linger before falling smoothly.

## ADDED Requirements

### Requirement: Responsive spectrum with falling peaks
The system SHALL render Home frequency bars with the same audio response and peak hold/fall behavior available in music details, with sufficient vertical space for the effect.

#### Scenario: A musical transient fades
- **WHEN** the audio spectrum rises and subsequently falls during playback
- **THEN** bars SHALL respond to the audio and peak markers SHALL remain briefly at the recent maximum before gradually falling without crossing below their bars

### Requirement: Preserve visualization choices
The system SHALL preserve existing bars/ring modes and style choices while rendering their corresponding shared visual effects.

#### Scenario: Select a different style
- **WHEN** the user selects another bars or ring style on Home
- **THEN** the selected visual style SHALL render and the selection SHALL persist

### Requirement: Respect playback and runtime lifecycle
The system SHALL let live visualization settle after playback stops and cease work when the visualization is removed, the page is hidden, or runtime guards disable it.

#### Scenario: Pause playback
- **WHEN** playback is paused
- **THEN** the visualization SHALL decay and stop once it has settled

#### Scenario: Leave Home or hide the page
- **WHEN** the user leaves Home without focus mode, hides the page, or disables visualization through runtime guards
- **THEN** the Home visualization SHALL stop scheduling live frames
