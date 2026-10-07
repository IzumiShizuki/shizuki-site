## Why

The unified author page hides its management destinations in the public rail, leaving the content studio disconnected from the author view. Editing also needs reliable loading, draft preservation and empty-value round trips so administrators can safely maintain the page and life content.

## What Changes

- Expose authorized studio and site-setting destinations in the same author navigation on desktop and compact screens.
- Preserve unsaved author drafts, initialize site settings from administrator data, prevent overlapping save/upload actions and avoid stale public refreshes overwriting edits.
- Preserve deliberately cleared optional text, images and collections instead of restoring sample content.
- Protect album and moment edits during photo operations, preview, publishing, refresh and navigation.
- Add behavioral regression coverage and verify the frontend build and OpenSpec contract.

## Capabilities

### New Capabilities

- `author-workspace-editing`: Connected permission-aware author navigation and reliable draft handling for author, site, album and moment editors.

### Modified Capabilities

None.

## Impact

Vue author page, author profile normalization, content studio components and frontend tests. Existing API contracts and administrator permission boundaries remain in use; no new dependencies are required.
