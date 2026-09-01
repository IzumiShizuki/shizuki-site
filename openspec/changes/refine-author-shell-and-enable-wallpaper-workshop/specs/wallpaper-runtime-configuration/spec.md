## Purpose

Make production wallpaper discovery and import readiness truthful, secure, and verifiable across no-key public sources, optional provider keys, and authenticated SteamCMD downloads.

## ADDED Requirements

### Requirement: Production wallpaper runtime uses private configuration
The production deployment SHALL keep Steam account credentials, provider keys, and proxy credentials outside version control and SHALL pass only the required wallpaper configuration into the backend runtime.

#### Scenario: Operator configures wallpaper providers
- **WHEN** Steam, Wallhaven, or proxy credentials are supplied
- **THEN** they are stored only in the private server environment and do not appear in committed files, deployment logs, or public API responses

### Requirement: SteamCMD readiness is verified in stages
The production wallpaper runtime SHALL report SteamCMD import as available only when the channel is enabled, the configured executable exists, the download volume is writable, the Steam account fields are present, and the account can complete authenticated SteamCMD use for app 431960.

#### Scenario: SteamCMD prerequisites are complete
- **WHEN** the server has an enabled executable channel, writable persistent storage, an account that owns Wallpaper Engine, and a valid cached Steam Guard session
- **THEN** Workshop items that require SteamCMD report an available import channel and can start an import job

#### Scenario: A SteamCMD prerequisite is missing
- **WHEN** any required prerequisite is absent or authentication requires interaction
- **THEN** the channel remains unavailable with an actionable reason and no credential value is exposed

### Requirement: Public discovery works without optional keys
The wallpaper runtime SHALL keep ordinary Wallhaven discovery and public Steam metadata paths operational without optional provider keys, while using configured Steam Web API and Wallhaven keys to improve provider coverage where supported.

#### Scenario: Optional keys are absent
- **WHEN** no Steam Web API key or Wallhaven API key is configured
- **THEN** public discovery continues through supported no-key paths and the UI does not claim that a key is mandatory

#### Scenario: Optional keys are configured
- **WHEN** valid provider keys are available in the private server environment
- **THEN** the backend uses them for the supported provider requests without changing the public wallpaper API contract
