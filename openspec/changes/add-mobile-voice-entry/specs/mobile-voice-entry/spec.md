## ADDED Requirements

### Requirement: Mobile music discovery entry

The mobile music home SHALL expose a labelled link to the existing voice catalogue without changing access policy or issuing a playback command.

#### Scenario: Browse voice from the mobile music home
- **WHEN** a visitor activates the voice catalogue link
- **THEN** the existing voice catalogue route opens and the link does not start or replace playback

### Requirement: Current track keyboard activation

The current-track card SHALL support keyboard activation consistent with tapping the same card.

#### Scenario: Open the player by keyboard
- **WHEN** the focused current-track card receives Enter or Space
- **THEN** the full player opens
