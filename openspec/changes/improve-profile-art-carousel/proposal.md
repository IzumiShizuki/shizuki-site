## Why

The personal daily-art gallery renders small thumbnails in fixed 4:3 frames, leaving conspicuous bands around portrait illustrations. The user requests larger images presented as a carousel, with sizing that respects the artwork.

## What Changes

- Replace the six-image recommendation grid with a large manual carousel, previous/next controls and direct image selection.
- Support keyboard navigation and horizontal touch swipes without interfering with vertical scrolling.
- Show full illustrations at their natural proportions, remove fixed image-frame ratios, and fit the character portrait and search previews to their actual images.
- Keep daily selections, original links, artist attribution, account isolation and all-ages filtering unchanged.
- Verify desktop/mobile visuals and publish this follow-up to the existing personal website under the ongoing delivery request.

## Capabilities

### New Capabilities

- `profile-art-carousel`: Accessible large daily-art browsing and proportionate preview sizing.

### Modified Capabilities

None. The existing daily-art data and safety contracts remain unchanged.

## Impact

Shared Vue profile components used by desktop and mobile personal pages. No API, database, backend, credentials or dependencies change. Publication targets master; deployment only updates the site frontend on 111.228.35.186.
