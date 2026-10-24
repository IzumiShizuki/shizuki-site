## ADDED Requirements

### Requirement: Canonical API default

The frontend SHALL use `https://site.shizuki.online` as the default API base when `VITE_GATEWAY_BASE_URL` is absent or blank.

#### Scenario: GitHub OAuth initiation from an alias domain

- **WHEN** a user starts GitHub login from a site alias and no API base override was injected at build time
- **THEN** the authorization request SHALL be sent to `https://site.shizuki.online/api/v1/auth/oauth/authorizations`
- **AND** it SHALL NOT be sent to the alias domain's same-origin `/api` route.

#### Scenario: Explicit API override

- **WHEN** `VITE_GATEWAY_BASE_URL` is configured
- **THEN** frontend API requests SHALL continue to use that configured base.
