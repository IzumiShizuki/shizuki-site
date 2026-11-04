## Purpose

Let existing users recover or update their password through an email verification code.

## ADDED Requirements

### Requirement: Signed-out password reset

The system SHALL accept password reset submissions without an authenticated session and SHALL require a valid password reset code for the account's email before updating its password.

#### Scenario: Existing account with a valid code

- **WHEN** a signed-out user submits the account email, its valid reset code and matching new passwords
- **THEN** the existing account can log in with the new password

#### Scenario: Missing or invalid code

- **WHEN** a signed-out user submits a reset with a missing, expired or invalid code
- **THEN** the system rejects the request through validation without updating any password

### Requirement: Password changes in account settings

The system SHALL require an authenticated session for account settings password changes. The password form SHALL use the current account email and SHALL guide users without an email to the binding section in the same account.

#### Scenario: Existing account with an email

- **WHEN** a signed-in user opens the password form
- **THEN** the form displays the bound address and uses it for both code delivery and submission

#### Scenario: Existing account without an email

- **WHEN** a signed-in user without an email opens the password panel
- **THEN** the panel offers a shortcut to bind an email to the current account

#### Scenario: Anonymous account settings request

- **WHEN** a signed-out user calls the account settings password endpoint
- **THEN** the request is rejected with an authentication error
