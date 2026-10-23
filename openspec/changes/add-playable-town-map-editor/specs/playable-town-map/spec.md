## Purpose

Provide an immediately playable everyday pixel town inside AIHub, with bundled scenery, walking, collision and approachable local interactions even when the remote AI service is unavailable.

## ADDED Requirements

### Requirement: Bundled playable town
The system SHALL render an initial tile town containing a church, shops, homes, paths, greenery, residents and a valid player spawn without requiring uploads or AI connectivity.

#### Scenario: First visit without a server
- **WHEN** a visitor opens town mode and scene APIs fail
- **THEN** the bundled town remains visible and playable and the remote failure is explained separately

### Requirement: Movement and collision
The system SHALL support arrow/WASD movement, click-to-walk and touch direction controls, reject movement outside the map or into blocked terrain, and provide a way to return to spawn.

#### Scenario: Obstacle on the route
- **WHEN** a player walks toward a building, water or a blocked tile
- **THEN** the player remains on walkable terrain and click navigation routes around reachable obstacles

### Requirement: Local interactions and existing destinations
The system SHALL show nearby resident or landmark interactions via keyboard and a visible button, include a small completable exploration objective, and retain access to existing scene and finance destinations. Special AI conversations SHALL retain existing administrator authorization.

#### Scenario: Resident interaction without AI
- **WHEN** a guest interacts with a nearby resident
- **THEN** authored local dialogue opens without an authenticated AI request

#### Scenario: Existing destination
- **WHEN** an interaction offers an existing AIHub scene or finance entrance
- **THEN** the existing scene handler opens that destination without granting additional permissions
