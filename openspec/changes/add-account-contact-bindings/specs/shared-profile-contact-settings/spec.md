## ADDED Requirements

### Requirement: Shared contact settings panel

The desktop and mobile personal settings views SHALL expose one shared contact-binding panel for QQ and WeChat.

#### Scenario: Empty state

- **WHEN** the account has no active bindings
- **THEN** the panel explains that QQ or WeChat can be added and provides platform choices

#### Scenario: Bound state

- **WHEN** the account has active bindings
- **THEN** the panel shows one row per platform identity with masked identity, capabilities, and unbind action

#### Scenario: Unavailable bridge

- **WHEN** the server reports that contact binding is not configured
- **THEN** the panel explains that bridge configuration is pending and does not claim that a binding succeeded
