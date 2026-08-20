## Purpose

Allow Meguri and future trusted local clients to receive explicit, revocable capability grants instead of inheriting unrestricted control from a shared process-discovery credential.

## ADDED Requirements

### Requirement: Local clients pair with an explicit identity
The system SHALL create a pending pairing request containing a client identity and requested capabilities and SHALL require approval from a trusted Shizuki user surface before issuing a durable client credential.

#### Scenario: Meguri requests first pairing
- **WHEN** an unpaired local Meguri client submits its name, instance identity, and requested capabilities through the loopback endpoint
- **THEN** the request remains pending and Shizuki presents the requested grant for approval without executing privileged commands

#### Scenario: User approves pairing
- **WHEN** the user approves a pending request from a trusted Shizuki surface
- **THEN** the client receives a one-time credential bound to a stable client identifier and only the approved capabilities

#### Scenario: User rejects pairing
- **WHEN** the user rejects or ignores a request beyond its expiry
- **THEN** no durable credential is issued and subsequent commands from that request are unauthorized

### Requirement: Commands require granted capabilities
The system MUST authorize each paired-client command against its current capability grants and MUST reject commands outside those grants before dispatch.

#### Scenario: Client invokes a granted music command
- **WHEN** a paired client with music-control permission sends a valid supported music command
- **THEN** the command is dispatched and its result is correlated to that client

#### Scenario: Client invokes an ungranted system command
- **WHEN** a paired client lacks the capability required by a requested command
- **THEN** the service returns a structured insufficient-capability error and performs no native or renderer action

### Requirement: Pairings are revocable and secrets are not stored in plaintext
The system SHALL allow users to inspect and revoke paired clients, SHALL store only a cryptographic verifier for issued credentials, and SHALL remove access immediately after revocation.

#### Scenario: User revokes a paired client
- **WHEN** the user revokes a client from a trusted Shizuki surface
- **THEN** all later requests using that client credential fail authentication while other clients remain unaffected

#### Scenario: Pairing storage is inspected
- **WHEN** the persisted paired-client document is read from disk
- **THEN** it contains client metadata, grants, and credential verifiers but no reusable plaintext client secret

### Requirement: Pairing activity is locally auditable
The system SHALL retain a bounded local audit of pairing approvals, rejections, grant changes, revocations, and denied capability attempts without recording account tokens or command payload secrets.

#### Scenario: User reviews client activity
- **WHEN** the trusted Shizuki surface requests pairing activity
- **THEN** it receives recent timestamped client and decision metadata in newest-first order
