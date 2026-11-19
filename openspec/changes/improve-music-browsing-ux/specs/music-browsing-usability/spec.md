## ADDED Requirements

### Requirement: Music search exploration
The music interface SHALL expose actionable search and navigation states while preserving current playback until a user requests playback.

#### Scenario: Open a search playlist
- **WHEN** a mobile listener opens a playlist from search
- **THEN** tracks can be inspected without auto-playing and the listener can return to the submitted results

#### Scenario: Search and retry with a keyboard
- **WHEN** a desktop listener navigates and submits search with a keyboard
- **THEN** loading, failure and success are distinct and results support keyboard playback and retry without relying on hover

#### Scenario: Newer mobile search replaces a pending query
- **WHEN** a pending mobile search is cleared or replaced with a new query
- **THEN** stale responses do not update visible results
