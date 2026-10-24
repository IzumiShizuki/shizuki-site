## Why

GitHub login fails on the public site because the frontend uses a same-origin API base by default. The `shizuki.online` alias currently routes that path to an unrelated gateway, while the site's canonical API entry is `site.shizuki.online`.

## What Changes

- Point frontend API requests at the canonical site gateway by default.
- Preserve `VITE_GATEWAY_BASE_URL` as an explicit override for local and alternate deployments.
- Align Docker and environment examples with the canonical production gateway.
- Add regression coverage for the default API base behavior.

## Capabilities

### New Capabilities

- `canonical-site-gateway`: Authentication and other frontend API requests use the canonical site gateway when no build-time override is supplied.

### Modified Capabilities

None.

## Impact

- Frontend HTTP, wallpaper API, and runtime API-base resolution.
- Frontend Docker build defaults and deployment environment documentation.
- GitHub OAuth initiation and callback token exchange, which use the shared HTTP client.
