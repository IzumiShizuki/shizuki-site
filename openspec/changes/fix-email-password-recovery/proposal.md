## Why

Signed-out users receive `Login required` when submitting a password reset. Account settings also present an editable email field for password changes even though the server accepts only the current account's bound address.

## What Changes

- Allow signed-out users to submit the existing email-code password reset.
- Use the current account's bound email for password changes and direct accounts without an email to bind one in account settings.

## Capabilities

### New Capabilities

- `email-password-recovery` covers email-code password reset and password changes on an existing account.

### Modified Capabilities

## Impact

- Monolith gateway configuration, account settings, and authentication regression checks.
