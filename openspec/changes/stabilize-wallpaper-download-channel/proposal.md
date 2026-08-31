## Why

Production Workshop searches return valid Wallpaper Engine items, but selecting those items repeatedly returns HTTP 404 and the frontend reports that the download-channel check failed. The server's constrained Steam connectivity exposes inconsistent backend paths: discovery has proxy support and search fallback, while item detail and the actual import pipeline either do not fall back or bypass the configured proxy entirely.

## What Changes

- Make Workshop item detail fall back from the Steam API to the public detail page when the API response is unavailable or does not contain a usable item.
- Route Workshop metadata and public-file downloads in the import pipeline through the same configured, authenticated wallpaper outbound client used by discovery.
- Report the actual import channel: public direct download, configured SteamCMD, or unavailable, rather than treating `file_url` as the whole channel check.
- Keep selection usable when metadata enrichment fails and expose a concise actionable unavailable reason instead of a generic check failure.
- Add regression coverage for API-to-scrape fallback, proxy use across discovery/import requests, and channel-state mapping; verify the real production detail and authenticated import paths after deployment.

## Capabilities

### New Capabilities

- `workshop-download-channel`: Reliable Workshop metadata resolution and truthful direct/SteamCMD import-channel reporting under proxied production networking.

### Modified Capabilities

None.

## Impact

- Backend Workshop discovery and wallpaper import services, shared outbound HTTP construction, response model, and tests.
- Frontend Workshop channel status rendering and component tests.
- Production wallpaper proxy and SteamCMD configuration are reused; no database schema or endpoint-path change is required.
