## Purpose

Defines reliable weather and daily-quote signals for the author workspace so visitors receive real sourced content, clear provenance, and useful independent fallback states.

## ADDED Requirements

### Requirement: Weather uses the configured public weather channel
The right rail SHALL request site weather from the public site-weather endpoint, which MUST use the configured site location and enabled upstream weather provider. Available observations SHALL show location, temperature, freshness, and provider attribution without exposing precise visitor coordinates.

#### Scenario: Configured site weather is available
- **WHEN** the author workspace loads and the site weather provider returns a valid observation
- **THEN** the weather card displays the normalized observation, freshness, location label, and provider attribution

#### Scenario: Weather cannot be loaded
- **WHEN** the site location is not configured or the provider request fails without a usable snapshot
- **THEN** the weather card shows a truthful unavailable or failed state and an applicable retry action without fabricated readings

### Requirement: Daily quote uses a configured sourced snapshot
The right rail SHALL request today's quote from the public daily-quote endpoint. The service MUST support the configured Hitokoto or curated-local source, preserve source attribution, and return a last-known or local fallback only when it is identified as such.

#### Scenario: Today's sourced quote is available
- **WHEN** the daily-quote service resolves the current day's snapshot
- **THEN** the quote card displays its text, author or work when present, source provider, and snapshot state

#### Scenario: Today's source is unavailable
- **WHEN** the configured quote source fails but an eligible saved or local fallback exists
- **THEN** the quote card displays that fallback with an explicit historical or local state instead of presenting it as a fresh upstream result

### Requirement: Life signals fail independently
Weather, daily quote, and recommended music SHALL load and render independently. A loading or error state in one signal MUST NOT hide, block, or replace another signal that is available.

#### Scenario: Only one external signal fails
- **WHEN** weather fails while daily quote succeeds, or daily quote fails while weather succeeds
- **THEN** the successful card remains fully usable and only the failed card shows its own retry or fallback state
