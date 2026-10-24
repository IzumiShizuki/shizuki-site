## Decision

Use the canonical production gateway as the frontend fallback and Docker default. Keep the existing environment variable as the highest-priority configuration so local development and independently hosted deployments remain configurable.

The shared HTTP client, wallpaper client, and native runtime API-base helper must agree on this fallback. OAuth requires no provider protocol change; it automatically benefits because authorization creation and token exchange already use the shared HTTP client.

## Verification

- Assert the generated OAuth request URL uses the canonical gateway when no override is present.
- Run focused frontend authentication/API tests.
- Build the frontend and validate the OpenSpec change.
