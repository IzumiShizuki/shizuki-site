## Purpose

Provide reliable, bounded browser authentication when ordinary production network tail latency exceeds the previous short request deadline, without hiding genuinely unavailable authentication services.

## ADDED Requirements

### Requirement: Authentication requests tolerate ordinary tail latency
The authentication client SHALL keep an interactive authentication or session-bootstrap request active for a bounded period longer than five seconds, so a valid response delayed by normal network tail latency can still complete the login flow.

#### Scenario: Valid token response arrives after the previous deadline
- **WHEN** a valid authentication response arrives after six seconds but before the configured authentication deadline
- **THEN** the client SHALL accept the response and continue the authenticated session bootstrap instead of reporting a timeout

#### Scenario: Current-user bootstrap follows token issuance
- **WHEN** token issuance succeeds within the authentication deadline
- **THEN** the client SHALL request the current-user profile and complete login using the same bounded authentication request policy

### Requirement: Authentication requests remain bounded
The authentication client MUST abort an authentication request that exceeds its configured deadline and SHALL expose the failure as an explicit timeout rather than leaving the login UI pending indefinitely.

#### Scenario: Authentication service does not respond
- **WHEN** an authentication request has not completed by the configured deadline
- **THEN** the client SHALL abort it with the existing timeout error contract and release the submitting state for another attempt

