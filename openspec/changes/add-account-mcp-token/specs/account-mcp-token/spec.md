## ADDED Requirements

### Requirement: One dedicated MCP token per account
The system SHALL let a signed-in website user generate or rotate one active MCP token for their own account, show the plaintext only once, and revoke it without affecting their website login.

#### Scenario: Rotation invalidates the previous credential
- **WHEN** a signed-in website user rotates a previously issued token
- **THEN** only the newly issued token can authorize a later MCP request

#### Scenario: Token is not a website session
- **WHEN** an MCP client presents an account token to an account management or manual Todo approval endpoint
- **THEN** access is denied

### Requirement: Explicit Todo project grant
The system SHALL restrict Todo development requests to the user's one explicitly selected, owned and unarchived project. Other modules SHALL deny access until explicitly integrated.

#### Scenario: No Todo authorization by default
- **WHEN** a client presents a valid account token without an eligible Todo project grant
- **THEN** the system rejects the operation without reading or updating Todos
