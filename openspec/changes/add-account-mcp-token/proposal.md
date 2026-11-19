## Why
Offer one separately revocable MCP token per website account instead of creating new credentials for each supported module.

## What Changes
- Add an authenticated account settings endpoint for token issuance, rotation and revocation.
- Add explicit project authorization for Todo development and retire the undeployed legacy backend credential.
- Do not grant general website sessions, approval permissions, or access to unintegrated modules.

## Capabilities
### New Capabilities
- `account-mcp-token`: one website account token with explicit module grants.
### Modified Capabilities

## Impact
Adds two monolith database migration variants, account management and scoped gateway logic. No deployment; reconcile the shared Flyway ledger, including the DJ overlay, before release.
