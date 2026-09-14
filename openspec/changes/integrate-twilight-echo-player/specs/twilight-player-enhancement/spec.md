## Purpose

Enhance the ordinary (non-immersive) music mode of the Shizuki site by porting high-value renderer capabilities from the Apache-2.0 open-source project Twilight_Echo — a timed lyric engine with word-by-word emphasis, an audio visualizer, and a parametric equalizer — while keeping the playback kernel and NetEase source on the site's existing HTML5 Audio / Web Audio and ncm-api stack. Folia remains the immersive lyric/visual layer.

## ADDED Requirements

### Requirement: Ported timed lyric engine
The ordinary music player SHALL render lyrics with precise line timing, word-by-word emphasis, and a focus-window view, ported from Twilight_Echo's lyric utilities and driven by the site's NetEase LRC data.

#### Scenario: Timed lyric highlight
- **WHEN** a NetEase track with timestamped LRC lyrics is playing
- **THEN** the ordinary player highlights the current line based on the audio position and, where word timing data exists, highlights words in sequence

#### Scenario: Lyric data missing
- **WHEN** a track has no timestamped lyrics
- **THEN** the player falls back to a plain untimed lyric view without breaking playback

### Requirement: Web Audio visualizer
The ordinary music player SHALL provide a frequency visualizer based on Web Audio AnalyserNode data, replacing Twilight_Echo's desktop audio callback source.

#### Scenario: Visualizer follows playback
- **WHEN** a track is playing through the site's HTML5 Audio element
- **THEN** the visualizer renders frequency bars derived from the AnalyserNode and pauses when audio pauses

### Requirement: Web Audio parametric equalizer
The ordinary music player SHALL provide a multi-band equalizer including parametric bands implemented with Web Audio BiquadFilterNode.

#### Scenario: Adjust equalizer band
- **WHEN** a user changes an equalizer band gain
- **THEN** the audio output changes accordingly and the setting persists for the session

### Requirement: Folia immersive integration preserved
The Folia immersive lyric/visual layer SHALL remain available alongside the enhanced ordinary mode, switchable per view.

#### Scenario: Switch between modes
- **WHEN** a user switches from the ordinary lyric view to the immersive Folia view
- **THEN** the currently playing track continues without restart and the immersive view renders Folia's lyric animation
