## Purpose

Ensure the Obsidian publishing bridge reaches the active production site and sends requests in the same wire format as the site's maintained web client.

## ADDED Requirements

### Requirement: Canonical production origin
The plugin SHALL default to `https://site.shizuki.online` and SHALL migrate an existing untouched `https://shizuki.site` setting while preserving any other explicit custom origin.

#### Scenario: Existing obsolete default
- **WHEN** the plugin loads settings whose site URL is exactly the obsolete `https://shizuki.site` origin
- **THEN** it replaces and persists that value as `https://site.shizuki.online`

#### Scenario: Explicit custom origin
- **WHEN** the plugin loads a valid site URL other than the obsolete default
- **THEN** it preserves that configured origin

### Requirement: Production JSON wire format
The plugin SHALL recursively serialize JSON object keys using the production API's snake_case convention for authentication, post, asset, and other JSON requests.

#### Scenario: Email and password login
- **WHEN** the plugin submits an email/password token request
- **THEN** the request contains `grant_type`, `email`, and `password` JSON fields accepted by the production API

#### Scenario: Refresh token rotation
- **WHEN** the plugin refreshes or revokes a session
- **THEN** the JSON request contains the API's `grant_type` and `refresh_token` fields as applicable

#### Scenario: Nested publishing payload
- **WHEN** a JSON publishing or asset payload contains camelCase keys or nested objects
- **THEN** all object keys are recursively converted to snake_case while values and arrays are preserved

#### Scenario: Non-JSON body
- **WHEN** a request body is binary, multipart, or an already serialized string
- **THEN** the plugin sends the body without JSON key conversion

### Requirement: Actionable transport failure
The plugin SHALL translate a low-level network exception into an error that identifies the configured site origin and distinguishes transport failure from an HTTP application response.

#### Scenario: DNS or TLS connection failure
- **WHEN** the request layer throws before receiving an HTTP status
- **THEN** the user receives an error naming the site origin and directing them to check the address or network

#### Scenario: Server returns an HTTP error
- **WHEN** the server responds with a non-success HTTP status and problem details
- **THEN** the plugin preserves the server's status and human-readable problem message

### Requirement: Non-destructive production verification
Deployment verification SHALL confirm that the configured production origin resolves and returns an HTTP response without submitting real credentials or publishing content.

#### Scenario: Verify deployed endpoint
- **WHEN** the deployment verification runs
- **THEN** it checks the installed origin and performs a non-authenticated reachability request without user data
