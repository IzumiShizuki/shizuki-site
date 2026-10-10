## Context

The production SMTP provider is reachable and accepts the configured account from the server host, while the JavaMail client times out while reading the authentication response. The current configuration only enables generic SMTP auth and STARTTLS, leaving mechanism selection and required TLS negotiation to provider-dependent defaults.

## Goals

- Make SMTP AUTH negotiation deterministic for providers that expose `LOGIN`.
- Allow operators to override the mechanism, TLS requirement, and protocol through environment variables.
- Keep failure latency bounded by existing connection, read, and write timeouts.
- Avoid moving or duplicating SMTP credentials into tracked files.

## Non-Goals

- Changing the email provider or account.
- Changing the verification-code API contract.
- Modifying database schema or unrelated deployment services.

## Design

Add the same mail properties to both tracked runtime configuration sources:

- `mail.smtp.auth.mechanisms` defaults to `LOGIN`.
- `mail.smtp.auth.login.disable` defaults to `false`.
- `mail.smtp.auth.plain.disable` defaults to `true`.
- `mail.smtp.starttls.required` defaults to `false` and can be enabled for providers that require STARTTLS.
- SMTP connection/read/write timeout and TLS protocol defaults remain explicit and environment-overridable.

The private deployment configuration remains the source of the username and provider authorization code. Operators must rotate any exposed authorization code and update only that private configuration before validating production delivery.

## Testing

- Parse/inspect the tracked YAML configuration in a focused regression test.
- Run the affected Maven module tests and the monolith build.
- Validate the OpenSpec change strictly before deployment.
