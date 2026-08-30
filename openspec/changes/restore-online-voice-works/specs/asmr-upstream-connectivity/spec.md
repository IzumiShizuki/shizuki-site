## Purpose

Ensure the production voice library can reach ASMR metadata and media endpoints through a secure, configurable outbound path while retaining direct connectivity in environments that do not need a proxy.

## ADDED Requirements

### Requirement: ASMR requests support an optional outbound proxy
The system SHALL route every ASMR upstream HTTP request through the configured proxy when a valid proxy host and port are present, including work search, work detail, track trees, stream resolution, and lyric retrieval. The system SHALL continue to connect directly when proxy configuration is absent.

#### Scenario: Proxy-enabled production request
- **WHEN** an ASMR proxy host and port are configured
- **THEN** all ASMR upstream requests use that proxy and the voice-work API returns upstream works when the proxy can reach them

#### Scenario: Direct development request
- **WHEN** no ASMR proxy host or port is configured
- **THEN** ASMR upstream requests use the existing direct connection behavior

### Requirement: Authenticated proxy credentials remain private
The system SHALL support proxy authentication without returning or logging proxy credentials and SHALL source production credentials from private deployment configuration rather than committed files.

#### Scenario: Authenticated CONNECT proxy
- **WHEN** proxy username and password are configured with the proxy endpoint
- **THEN** the ASMR HTTP clients authenticate to the proxy and no credential value appears in application logs or API responses

### Requirement: Upstream failover remains available
The system SHALL apply the selected outbound path consistently to every configured ASMR upstream candidate and SHALL retain the existing retry and preferred-source behavior.

#### Scenario: Primary ASMR source is unavailable
- **WHEN** the preferred ASMR source fails with a retryable connection or HTTP error
- **THEN** the system retries the remaining configured sources through the same direct or proxied outbound path

### Requirement: Friend accounts retain voice-library access
The PostgreSQL runtime migration chain SHALL grant `music.asmr.access` to both FRIEND and ADMIN groups so existing and newly provisioned environments enforce the documented voice-library access policy.

#### Scenario: Existing PostgreSQL deployment is upgraded
- **WHEN** the new migration runs against a database that grants ASMR access only to ADMIN
- **THEN** the FRIEND permission mapping is added without duplicating or invalidating the ADMIN mapping
