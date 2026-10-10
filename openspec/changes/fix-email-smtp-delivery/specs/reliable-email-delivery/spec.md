## Requirements

### Requirement: Deterministic SMTP authentication

The deployed application MUST expose an environment-overridable JavaMail authentication mechanism and default it to `LOGIN` when no override is supplied.

#### Scenario: Provider supports LOGIN authentication

- **WHEN** the application sends a verification email with SMTP auth enabled
- **THEN** JavaMail advertises and attempts the configured `LOGIN` mechanism
- **AND** the application does not require credentials in tracked source files

### Requirement: Explicit TLS negotiation controls

The deployed application MUST expose environment-overridable STARTTLS required and TLS protocol settings.

#### Scenario: Provider requires STARTTLS

- **WHEN** `MAIL_SMTP_STARTTLS_ENABLE=true` and `MAIL_SMTP_STARTTLS_REQUIRED=true`
- **THEN** the SMTP session fails fast if STARTTLS cannot be negotiated
- **AND** the TLS protocol list is controlled by `MAIL_SMTP_SSL_PROTOCOLS`

### Requirement: Bounded SMTP failure time

The mail client MUST retain explicit connection, read, and write timeout controls.

#### Scenario: SMTP endpoint is unavailable

- **WHEN** the SMTP endpoint does not respond
- **THEN** the send attempt terminates within the configured timeout bounds
- **AND** the request returns the existing temporary mail-service error contract
