## Purpose

Ensure Workshop wallpaper selection and import remain reliable when production must use an authenticated outbound proxy and individual Steam metadata endpoints are unavailable or inconsistent.

## ADDED Requirements

### Requirement: Workshop metadata resolution falls back safely
The system SHALL resolve a valid Workshop item through the Steam metadata API when possible and SHALL fall back to its public detail page when the API request fails, returns a non-success item result, or omits usable item metadata. A valid item with extractable page metadata MUST remain selectable instead of being reported as not found.

#### Scenario: Steam API returns a non-success item result
- **WHEN** a Workshop item appears in search and the Steam detail API returns an item result other than success
- **THEN** the system fetches the item's public detail page and returns HTTP 200 with the recovered title, preview, and item identifier

#### Scenario: Both metadata sources fail
- **WHEN** neither the Steam detail API nor the public detail page yields usable metadata for the requested item
- **THEN** the system returns a concise upstream-unavailable error without exposing credentials or internal proxy details

### Requirement: Workshop requests share the configured outbound path
The system SHALL apply the configured wallpaper outbound proxy and authentication to Workshop search, item detail, import metadata, preview, and public-file download requests. When no proxy is configured, those requests SHALL retain direct-connect behavior. Proxy credentials MUST NOT appear in API responses, application logs, or committed configuration.

#### Scenario: Production uses an authenticated proxy
- **WHEN** wallpaper proxy host and credentials are configured
- **THEN** metadata resolution and public-file import requests both authenticate through that proxy

#### Scenario: Local development has no proxy
- **WHEN** wallpaper proxy configuration is absent
- **THEN** Workshop discovery and import requests connect directly without requiring proxy credentials

### Requirement: Download-channel status reflects import capability
The Workshop item response SHALL distinguish a public direct-download channel, a configured and executable SteamCMD channel, and an unavailable channel. The existing direct-download flag MUST remain compatible, while the response also identifies whether any import channel is available and supplies a concise reason when none is available.

#### Scenario: Public file URL is available
- **WHEN** resolved Workshop metadata contains a supported public file URL
- **THEN** the response reports the direct channel as available and preserves the direct-download compatibility flag

#### Scenario: Wallpaper Engine item requires SteamCMD
- **WHEN** no public file URL exists and the server has an enabled executable SteamCMD configuration with account credentials
- **THEN** the response reports the SteamCMD channel as available

#### Scenario: No download channel is configured
- **WHEN** no public file URL exists and SteamCMD is disabled, missing, non-executable, or lacks required account configuration
- **THEN** the response reports the channel as unavailable with an actionable configuration reason

### Requirement: Workshop import uses the reported channel
The system SHALL resolve import metadata through the resilient metadata path, attempt a supported public direct download first, and otherwise use SteamCMD only when that channel is available. Import failures SHALL preserve the asynchronous job contract and return an actionable fallback reason.

#### Scenario: API metadata fails but SteamCMD import is available
- **WHEN** the Steam metadata API fails, the public detail page resolves the item, and SteamCMD is available
- **THEN** the import job proceeds through SteamCMD instead of failing during metadata lookup

#### Scenario: Direct download fails and SteamCMD is available
- **WHEN** a public file URL fails to download and SteamCMD is available
- **THEN** the import job attempts SteamCMD before requiring local package upload

### Requirement: Frontend channel feedback is concise and accurate
The discovery inspector SHALL show checking, direct, SteamCMD, unavailable, and transient-check states from the backend channel response. It MUST NOT label an API-to-page metadata recovery as a failed channel check.

#### Scenario: Detail-page fallback succeeds
- **WHEN** the backend returns recovered metadata and a SteamCMD channel
- **THEN** the inspector shows that SteamCMD import is available without displaying the generic channel-check failure

#### Scenario: Detail request is temporarily unavailable
- **WHEN** the detail request itself cannot complete
- **THEN** the inspector keeps the selected item visible and shows a short retry-oriented status
