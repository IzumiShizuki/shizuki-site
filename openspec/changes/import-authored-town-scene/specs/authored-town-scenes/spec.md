## Purpose

Allow AIHub users to explore and edit a complete town authored by an external artist, with its original arrangement, verifiable source and complete attribution, while preserving their existing locally edited maps.

## ADDED Requirements

### Requirement: Downloaded authored default scene
The system SHALL offer an externally authored complete town as the default for new users, retain the source map's dimensions and visible layout, bundle its runtime artwork locally, and identify the original work, author, source download and license.

#### Scenario: First visit
- **WHEN** a new user enters town mode
- **THEN** the downloaded complete town is visible and playable without remote asset requests, with a visible source credit

### Requirement: Editable playable conversion
The system SHALL preserve source cell artwork when converting the source map into editable ground and scenery layers. It SHALL provide a walkable spawn, obstacle collision, reachable interactions, palette selection and an eyedropper for the imported art.

#### Scenario: Explore the town
- **WHEN** a player clicks a landmark or walks along its roads
- **THEN** movement stays on the walkable region and authored local interactions are available

#### Scenario: Edit imported artwork
- **WHEN** a user samples an existing tile and paints it elsewhere
- **THEN** the same artwork appears at the target cell and the edit can be undone, saved, exported and reimported

### Requirement: Existing local map preservation
The system SHALL retain support for legacy maps and isolate saves by known scene type. Switching a scene with unsaved edits SHALL require an explicit choice to keep or discard those edits; no existing saved map SHALL be silently overwritten.

#### Scenario: Existing custom map
- **WHEN** a user with a customized legacy save visits after the update
- **THEN** the save remains available and can be loaded and edited with its original tiles

#### Scenario: Unsaved switch
- **WHEN** a user selects another scene while the current map has unsaved changes
- **THEN** the current scene remains intact until the user confirms discarding the draft or saves it
