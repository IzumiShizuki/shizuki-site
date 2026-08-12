## Why

The atmosphere panel currently exposes only the bundled and uploaded ambient sounds because its existing Freesound search UI is not wired into the application shell, and selecting an online result does not create a durable local asset. Users need a usable online discovery path that can search the agreed Freesound catalog, save a selected sound, and immediately add it to the background mix.

## What Changes

- Connect the atmosphere panel's online-library tab to the backend availability check and allow the shell to retain the `online` tab state.
- Expose Freesound search and preview with clear loading, empty, disabled, and upstream-error states.
- Add an authenticated import operation that downloads a selected Freesound preview through the backend, validates and stores it as a private audio asset, and returns a playable asset reference.
- Add the imported asset to the user's ambient library and current background mix immediately, while preventing duplicate imports and reporting progress or failure per result.
- Tell guests to sign in before a durable import instead of presenting a misleading successful add action.
- Preserve Freesound source, author, page, and license attribution metadata on imported assets.

## Capabilities

### New Capabilities

- `online-ambient-library`: Discover Freesound ambient audio, preview it, import a selected result into private media storage, and activate the resulting background sound.

### Modified Capabilities

None.

## Impact

- Frontend atmosphere shell, online-library API client, ambient state, and component tests.
- Media-module Freesound provider/controller plus a new import service and request/response contract.
- Authentication and rate-limit rules for the import endpoint; existing public status and search endpoints remain compatible.
- Runtime deployment still requires `MUSIC_FREESOUND_API_KEY`; no new third-party dependency is introduced.
