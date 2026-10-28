## Purpose

Provide authenticated users with a deliberate account closure flow that removes login identities and private bindings, revokes sessions, and preserves anonymous historical references without affecting other users.

## ADDED Requirements

### Requirement: Authenticated self-service closure
The system SHALL accept account closure only for the authenticated user with the exact confirmation text `注销账号`, and SHALL reject closure of the last active administrator.

#### Scenario: Confirmed closure
- **WHEN** a logged-in user submits the correct confirmation
- **THEN** their account identity is anonymized and becomes unavailable for login, and all access and refresh sessions are revoked

#### Scenario: Missing login or incorrect confirmation
- **WHEN** a request has no login identity or has incorrect confirmation
- **THEN** the request is rejected without changing account data

#### Scenario: Last administrator
- **WHEN** the last active administrator requests closure
- **THEN** closure is rejected and the account remains available

### Requirement: Private account data cleanup
The system SHALL remove account credentials, email, avatar, OAuth bindings and transactions, preferences, music provider secrets and contact bindings, while retaining an anonymous user ID for historical records.

#### Scenario: Cleanup succeeds
- **WHEN** the account is closed
- **THEN** private account data is removed and former identifiers can be registered again, without deleting another user's data

#### Scenario: Session revocation fails
- **WHEN** revoking sessions fails during closure
- **THEN** account database changes are rolled back and the request reports failure

### Requirement: Deliberate closure UI
The system SHALL expose closure on desktop and mobile profile screens, explain irreversible identity removal and retained history, require typed confirmation, prevent duplicate submission and clear local authentication only after server success.

#### Scenario: Failure and retry
- **WHEN** closure fails
- **THEN** an actionable error appears and local authentication is preserved for retry

#### Scenario: Success
- **WHEN** closure succeeds
- **THEN** local authentication is cleared and the user returns to a guest or login screen

### Requirement: Explicitly requested account cleanup
The operation SHALL identify the unique navidias account on the personal-site server before deleting its identity, and SHALL verify both identity removal and session invalidation without disclosing secrets.

#### Scenario: Unique matching account
- **WHEN** exactly one active account matches the requested identity
- **THEN** only that account is closed and the result is recorded
