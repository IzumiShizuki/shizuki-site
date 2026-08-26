## Purpose

为介绍页和博客辅助区域提供来源明确、可缓存且能在上游故障时诚实降级的天气信息，同时确保访客位置只在明确同意后使用并且不会被隐式推断。

## ADDED Requirements

### Requirement: Site weather defaults to an administrator-configured location
The system SHALL use the enabled site location configured by an authorized administrator as the default weather context for every visitor.

#### Scenario: Visitor opens a weather card
- **WHEN** a visitor has not explicitly requested personal weather
- **THEN** the card displays weather for the configured site location and does not request, infer, or transmit the visitor location

#### Scenario: Administrator changes the site location
- **WHEN** an administrator saves a valid display name, latitude, longitude, and time zone for a new site location
- **THEN** subsequent default weather responses identify the new site location and do not continue presenting a fresh response from the old location as current

#### Scenario: Site location is unavailable
- **WHEN** no valid site location is enabled and no usable last-good site snapshot exists
- **THEN** the weather module reports that weather is unavailable without inventing a city or weather reading

### Requirement: Personal weather requires explicit visitor consent
The system MUST request browser geolocation only after the visitor explicitly chooses the personal-weather action and MUST continue using site weather when permission is denied, dismissed, unsupported, or revoked.

#### Scenario: Visitor grants location permission
- **WHEN** a visitor selects personal weather and grants geolocation permission
- **THEN** the system requests weather for the granted coordinates and clearly labels the result as personal-location weather

#### Scenario: Visitor denies location permission
- **WHEN** a visitor denies or dismisses the geolocation request
- **THEN** no personal coordinates are sent to the weather service and the card remains on the configured site location without repeated automatic prompts

#### Scenario: Visitor never selects personal weather
- **WHEN** a visitor browses any supported page without selecting the personal-weather action
- **THEN** the application never invokes browser geolocation on that visitor's behalf

### Requirement: IP location inference is prohibited
The system MUST NOT derive a visitor weather location from an IP address, account profile, analytics identifier, device fingerprint, or other covert location signal.

#### Scenario: Personal coordinates are absent
- **WHEN** a weather request has no explicitly consented coordinates
- **THEN** the system resolves only the configured site location and performs no visitor-location lookup

### Requirement: Open-Meteo is the primary weather provider
The system SHALL obtain current and forecast weather from Open-Meteo as the primary provider and MUST normalize the provider response into a stable site weather contract.

#### Scenario: Open-Meteo returns a valid response
- **WHEN** a refresh receives a valid Open-Meteo response for the requested location
- **THEN** the weather contract includes the resolved location label, weather values, provider observation time, site fetch time, freshness state, and provider attribution

#### Scenario: Provider response is invalid
- **WHEN** Open-Meteo times out, returns an error, or returns a response that cannot be safely normalized
- **THEN** the system does not expose partial or fabricated values as a fresh observation

### Requirement: Weather responses are cached and freshness-aware
The system MUST reuse a fresh cached snapshot for equivalent location requests and MUST expose enough timing information for the interface to distinguish fresh, stale, and unavailable data.

#### Scenario: Equivalent request is within the freshness window
- **WHEN** another visitor requests weather for an equivalent normalized location while its snapshot is fresh
- **THEN** the system returns the cached snapshot without issuing another upstream refresh for that visitor

#### Scenario: Snapshot is refreshed successfully
- **WHEN** a cached snapshot expires and the next provider refresh succeeds
- **THEN** the new response is marked fresh and reports the new observation and fetch times

### Requirement: Weather failure uses an honest last-good fallback
The system SHALL return the most recent usable snapshot when a refresh fails, MUST mark that response as stale, and MUST report unavailability when no usable snapshot exists. A site snapshot is usable only while it remains within the administrator-configured maximum stale age; the default maximum SHALL be six hours.

#### Scenario: Refresh fails with a last-good snapshot
- **WHEN** Open-Meteo is unavailable and a usable last-good snapshot exists for the requested location
- **THEN** the system returns that snapshot with `stale` status and its original observation and fetch times

#### Scenario: Refresh fails without fallback data
- **WHEN** Open-Meteo is unavailable and no usable snapshot exists
- **THEN** the system returns an explicit unavailable state instead of zero values, guessed conditions, or another location's weather

#### Scenario: Last-good site snapshot exceeds maximum stale age
- **WHEN** the most recent site snapshot is older than the configured maximum stale age
- **THEN** the system reports weather as unavailable and preserves the old snapshot only for administration diagnostics

### Requirement: Visitor location data is minimized
The system MUST NOT durably store or associate a visitor's exact coordinates with identity, account, logs, analytics, or content, and MAY only reuse short-lived anonymously normalized location keys needed to control weather traffic. Nearby weather MUST use bounded abuse controls and MUST NOT be stored in the durable site-weather snapshot table or shared HTTP/CDN caches.

#### Scenario: Personal weather completes
- **WHEN** a consented personal-weather request finishes
- **THEN** no durable visitor-coordinate record or identity association is created

#### Scenario: Invalid coordinates are submitted
- **WHEN** supplied latitude or longitude is missing, non-finite, or outside the valid geographic range
- **THEN** the system rejects the request without contacting Open-Meteo

#### Scenario: Nearby-weather rate or cache bound is exceeded
- **WHEN** a caller or the service exceeds its configured nearby-weather request, upstream, or normalized-key bound
- **THEN** the system rejects or defers the upstream request without storing raw coordinates
- **AND** it does not bypass limits merely because a cache or distributed lock is unavailable

### Requirement: Weather attribution is always visible
The system MUST identify Open-Meteo as the weather data provider and SHALL provide a usable attribution link wherever provider-derived weather is displayed.

#### Scenario: Fresh or stale provider data is shown
- **WHEN** a weather card displays any Open-Meteo-derived snapshot, including a stale fallback
- **THEN** the card exposes the Open-Meteo name and attribution destination without requiring expansion of hidden diagnostic data

### Requirement: Weather details expand without leaving the content page
The weather card SHALL let a visitor reveal a lightweight forecast and freshness detail in place while preserving the current page scroll and other widget state.

#### Scenario: Visitor expands site weather
- **WHEN** a visitor activates the weather detail control
- **THEN** the card reveals the available short forecast, update time, location scope, freshness state, and attribution in place
- **AND** the page does not navigate away or reset the daily quote or global player

#### Scenario: Weather data is unavailable
- **WHEN** the weather card is unavailable and the visitor opens its details
- **THEN** the card explains that no current or fallback data is available and offers a retry or return-to-site-weather action
- **AND** it does not show zeroed or fabricated forecast values
