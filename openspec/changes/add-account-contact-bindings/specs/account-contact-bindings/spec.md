## ADDED Requirements

### Requirement: Multiple platform identities per account

The system SHALL allow one website account to have multiple active contact bindings, including multiple QQ bindings and multiple WeChat bindings.

#### Scenario: List bindings

- **WHEN** an authenticated user requests `GET /api/v1/me/contact-bindings`
- **THEN** the response contains only that user's active bindings
- **AND** each item contains platform, masked identity, capabilities, binding version, and bound time
- **AND** sender IDs and origin text are not returned

### Requirement: Verified binding challenge

The system SHALL create a single-use, expiring challenge for a selected QQ or WeChat platform.

#### Scenario: Generate challenge

- **WHEN** an authenticated user requests a challenge for an allowed platform
- **THEN** the response contains a private command and expiry timestamp
- **AND** the stored challenge value is not recoverable from the database

#### Scenario: Confirm from private chat

- **WHEN** the bridge submits a valid challenge with a permitted platform and exact private-message origin
- **THEN** one active binding is created for the authenticated account
- **AND** the challenge cannot be reused

#### Scenario: Reject invalid confirmation

- **WHEN** the bridge submits an expired, unknown, cross-platform, group-chat, or already-owned identity
- **THEN** the request is rejected without changing any binding

### Requirement: Binding capabilities

The system SHALL support independent `todo_edit` and `todo_notify` capability switches for every active binding.

#### Scenario: Update capabilities

- **WHEN** an authenticated user updates capabilities for one of their bindings
- **THEN** only that binding is changed
- **AND** later Todo consumers can select identities by capability

### Requirement: Safe unbinding

The system SHALL allow an authenticated user to deactivate one of their bindings.

#### Scenario: Unbind

- **WHEN** the owner deletes a binding
- **THEN** it is no longer returned as active
- **AND** its binding version is invalidated for future consumers

### Requirement: Shared site settings

The main site and DJ site personal settings SHALL use the same account-contact API and display the same binding state.

#### Scenario: Cross-site visibility

- **WHEN** a user creates or changes a binding in either site's personal settings
- **THEN** the other site's personal settings can read the updated state without a second binding flow
