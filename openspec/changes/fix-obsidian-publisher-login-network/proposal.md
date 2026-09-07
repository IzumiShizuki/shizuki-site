## Why

The installed Obsidian publisher cannot log in because its default host no longer resolves and its JSON payload casing does not match the production API contract. Correcting both boundaries is required to turn the current network error into a functional login and to prevent the same mismatch during publishing.

## What Changes

- Change the publisher's canonical site and API origin to `https://site.shizuki.online` and migrate the installed default configuration.
- Serialize all JSON request keys recursively to the production API's snake_case convention while preserving binary and multipart bodies.
- Improve transport errors so a future DNS/TLS failure identifies the failing site origin instead of only showing `net error`.
- Add regression coverage for the production origin, email/password and refresh-token bodies, nested publishing payloads, and non-JSON request preservation.
- Extend deployment verification with a non-authenticated production-origin reachability probe.

## Capabilities

### New Capabilities
- `obsidian-publisher-api-compatibility`: Reliable endpoint selection, request serialization, and actionable transport errors for the Obsidian publishing bridge.

### Modified Capabilities

None.

## Impact

- Affects the first-party Obsidian publisher source, bundled runtime, deployment configuration, verification scripts, tests, and documentation.
- Does not change the website backend API, store credentials, or perform a real user login during testing.
