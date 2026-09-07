## 1. Regression coverage

- [x] 1.1 Add a failing unit test for the canonical production origin and obsolete-default migration
- [x] 1.2 Add a failing API-client test for snake_case login, refresh, nested JSON, and untouched non-JSON bodies
- [x] 1.3 Add a failing test for actionable transport errors that preserve HTTP application errors

## 2. Request compatibility fix

- [x] 2.1 Implement recursive plain-object JSON key conversion at the shared request boundary
- [x] 2.2 Update the default origin and migrate only the obsolete `https://shizuki.site` value
- [x] 2.3 Wrap transport failures with the configured origin while retaining existing API error behavior
- [x] 2.4 Bump the plugin patch version and update usage documentation

## 3. Deployment and verification

- [x] 3.1 Extend deployment verification for the production origin and safe reachability probe
- [x] 3.2 Build, test, deploy, and reload the installed Vault plugin
- [x] 3.3 Re-run the original fake-login reproduction and confirm it reaches an HTTP authentication response
- [x] 3.4 Run strict OpenSpec validation, review scoped diffs, and commit without unrelated changes
