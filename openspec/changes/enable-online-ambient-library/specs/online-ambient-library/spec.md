## Purpose

Provide a usable online ambient-sound workflow that discovers appropriately licensed Freesound audio, saves a chosen sound into the signed-in user's private media library, and activates it in the current background mix.

## ADDED Requirements

### Requirement: Online library availability and navigation
The atmosphere panel SHALL always expose an online ambient-library view, SHALL enable search when the backend reports that the Freesound provider is configured, and SHALL preserve the online view as the active atmosphere tab.

#### Scenario: Configured provider is available
- **WHEN** the application opens the atmosphere panel and the backend reports the Freesound provider as enabled
- **THEN** the user can navigate to an online-library tab and that tab remains selected until the user chooses another atmosphere tab

#### Scenario: Provider is unavailable
- **WHEN** the backend reports that the Freesound provider is disabled or cannot be reached
- **THEN** the panel shows a non-destructive unavailable state and the bundled and previously imported ambient sounds remain usable

### Requirement: Search and preview online ambient sounds
The system SHALL let users search Freesound by keyword, paginate results, filter the allowed license scope, and preview a result without first importing it.

#### Scenario: Search returns matching sounds
- **WHEN** a user submits a non-empty keyword while the provider is enabled
- **THEN** the panel displays the matching title, author, duration, license, source link, and preview control for each result

#### Scenario: Search has no matches
- **WHEN** a valid search returns no matching sounds
- **THEN** the panel displays an empty-result message without changing the current ambient mix

#### Scenario: Search fails upstream
- **WHEN** Freesound rejects, rate-limits, times out, or otherwise fails a search
- **THEN** the panel displays a retryable error and preserves any prior ambient library and active mix

### Requirement: Authenticated durable import
The system SHALL allow a signed-in user to import an allowed Freesound result by sound identifier, download its high-quality MP3 preview through the backend, validate the response, store it as a private audio asset, and return a playable asset reference.

#### Scenario: Import succeeds
- **WHEN** a signed-in user imports an allowed Freesound sound whose preview satisfies the configured type and size limits
- **THEN** the backend stores the preview as a private audio asset and returns its asset identifier, playable signed URL, title, author, license, and source page

#### Scenario: Guest attempts import
- **WHEN** a guest selects the durable import action
- **THEN** the application asks the guest to sign in and does not claim that the sound was saved or add a remote-only track to persistent state

#### Scenario: Import source is invalid
- **WHEN** the requested sound does not exist, has a disallowed license, lacks an approved Freesound preview, exceeds the size limit, or returns non-audio content
- **THEN** the backend rejects the import without creating an asset and the panel reports the failure for that result

### Requirement: Trusted source resolution
The backend SHALL resolve the Freesound metadata and preview URL from the configured provider using only the submitted sound identifier and SHALL NOT fetch a client-supplied download URL or attribution payload.

#### Scenario: Client submits a sound identifier
- **WHEN** the import endpoint receives a valid Freesound sound identifier
- **THEN** the backend re-fetches trusted title, author, license, source page, and preview metadata before downloading the audio

#### Scenario: Preview URL is outside the allowlist
- **WHEN** Freesound metadata resolves to a preview URL whose scheme or host is not approved
- **THEN** the backend rejects the import before making the preview request

### Requirement: Idempotent import
The system SHALL keep at most one active imported asset for each combination of user, provider, and Freesound sound identifier.

#### Scenario: User imports the same sound again
- **WHEN** the same signed-in user imports a Freesound sound that was already imported successfully
- **THEN** the backend returns the existing asset reference without downloading or creating a duplicate asset

#### Scenario: Different users import the same sound
- **WHEN** two different signed-in users import the same Freesound sound
- **THEN** each user receives a private asset owned by that user

### Requirement: Immediate background activation
The application SHALL add a successful import to the user's ambient library as an enabled `asset` track and synchronize it to the current background mix.

#### Scenario: Imported sound becomes active
- **WHEN** the import request succeeds
- **THEN** the panel marks the result as saved, adds the returned asset track to the ambient library, and starts it at the default imported-track volume

#### Scenario: Import is already active
- **WHEN** the returned asset is already present in the user's ambient state
- **THEN** the application reuses that track and does not create a duplicate ambient entry

### Requirement: Attribution preservation
The system SHALL preserve the Freesound provider, sound identifier, author, license, source page, and preview provenance in the imported asset metadata and the ambient state needed to display attribution.

#### Scenario: CC-BY sound is imported
- **WHEN** a user imports a sound licensed for reuse with attribution
- **THEN** the saved asset retains enough metadata for the UI to display and copy the required attribution text

#### Scenario: CC0 sound is imported
- **WHEN** a user imports a CC0 sound
- **THEN** the saved asset still identifies Freesound and the original author without incorrectly claiming that attribution is legally required
