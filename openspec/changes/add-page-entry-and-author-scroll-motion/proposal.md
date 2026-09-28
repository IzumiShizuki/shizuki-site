## Why

Route changes currently appear without a shared entrance cue, while the public About page asks visitors to move through a long personal story. A brief fade-and-rise on route entry and smooth in-page section navigation will make those transitions feel more deliberate without delaying content or changing how the page is structured.

## What Changes

- Add a short fade-and-slide entrance to route content when a route view mounts.
- Keep route entrance motion disabled when the visitor requests reduced motion.
- Preserve smooth navigation between the public About page's sections, while honoring reduced-motion preferences and keeping direct section links immediate.

## Capabilities

### New Capabilities

- `route-page-entry-motion`: Defines the route view's subtle entrance animation and its reduced-motion behavior.
- `author-section-scroll-motion`: Defines smooth in-page navigation between public About sections, with immediate positioning for direct links and reduced-motion preferences.

### Modified Capabilities

None.

## Impact

- `fronted/vue3-merged/src/App.vue` for route entry presentation.
- `fronted/vue3-merged/src/pages/AuthorPage.vue` for public About section scrolling.
- No API, data, dependency, or deployment changes.
