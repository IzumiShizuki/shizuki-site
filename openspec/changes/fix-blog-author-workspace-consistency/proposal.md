## Why

The public blog and author pages currently behave like long documents: scrolling the center content also moves both side rails, while the menu collapse control disappears until the outer page crosses a threshold. The author About page and Posts tab additionally use different shells, and disabled optional content is presented as broken controls, making the public experience feel inconsistent and partially unusable.

## What Changes

- Make the center column the desktop scroll owner for blog list, blog detail, and the public author experience while keeping the left and right rails stationary.
- Keep the menu collapse/expand control reachable on desktop and make manual collapse work independently of the current scroll position.
- Replace the author Posts placeholder with a real public-posts view inside the same three-column visual shell used by About.
- Preserve compact/mobile document flow and accessible keyboard navigation.
- Distinguish administratively disabled optional features from transient failures so disabled albums, moments, weather, and quote sources do not expose dead links or ineffective retry actions.

## Capabilities

### New Capabilities

- `public-content-workspace`: Defines desktop center-owned scrolling, persistent menu controls, a unified author About/Posts experience, and capability-aware optional-content states.

### Modified Capabilities

None.

## Impact

- Frontend application scroll ownership and menu presentation state.
- Blog list/detail workspace layout and tests.
- Public author About/Posts components, public blog API consumption, and tests.
- Optional personal-content/widget error presentation; no public API contract or database schema change.
