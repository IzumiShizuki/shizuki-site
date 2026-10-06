## Purpose

Ensure that removing a track from a cloud account's liked music uses the platform account operation and updates the displayed library reliably, without treating cloud playlist identifiers as local playlist identifiers.

## ADDED Requirements

### Requirement: Remove a like from the cloud liked playlist
The music library SHALL apply an explicit unlike to the bound NetEase account and update the displayed liked playlist only after the platform acknowledges success.

#### Scenario: Unlike a displayed liked track
- **WHEN** the user removes the heart from a track displayed in the account's liked music
- **THEN** one explicit platform unlike is sent and the track disappears from that liked list without a playlist-not-found error

#### Scenario: Upstream rejection
- **WHEN** the platform rejects the unlike
- **THEN** the previous heart and list contents remain and the actual platform error is displayed

### Requirement: Preserve the current playback and account identity
The library MUST preserve the active playback queue while updating likes, and stale account or route results MUST NOT replace a different account's or playlist's data.

#### Scenario: Remove the currently playing track's like
- **WHEN** the playing track is unliked from the account liked list
- **THEN** the liked list updates while the current audio and playback queue remain intact

#### Scenario: Account or route changes during the request
- **WHEN** the account or playlist route changes before a like acknowledgement or refresh finishes
- **THEN** the previous operation does not replace the new account's or route's list
