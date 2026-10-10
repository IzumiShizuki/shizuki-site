## Why

Production verification-email requests reach the SMTP client but fail during the authentication handshake, producing long timeouts and misleading authentication errors. The deployed configuration does not expose enough JavaMail controls for providers that require an explicit SMTP AUTH mechanism and STARTTLS negotiation.

## What Changes

- Add explicit, environment-overridable JavaMail SMTP AUTH mechanism and TLS negotiation properties.
- Keep connection, read, and write timeouts bounded and consistent across runtime configuration sources.
- Preserve provider credentials in private configuration only; no secrets are added to source control.
- Add configuration regression coverage so future deployments retain the SMTP settings.

## Capabilities

### New Capabilities

- `reliable-email-delivery`: Verification emails use explicit SMTP authentication and TLS settings with bounded timeouts.

### Modified Capabilities

## Impact

- Spring Boot mail configuration in the monolith application.
- Shared monolith YAML configuration used by deployed containers.
- Verification-email delivery behavior and its regression checks.
