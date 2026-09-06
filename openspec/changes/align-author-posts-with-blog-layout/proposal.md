## Why

The Author page reserves a cover column for every public-post card even when a post has no cover. In the current production-shaped data set this compresses the title, summary, and reading metadata into roughly one quarter of the available width, making the archive difficult to scan and visually inconsistent with the main Blog feed.

## What Changes

- Give coverless Author-page post cards the full content width instead of leaving an empty media column.
- Align card reading order and metadata treatment with the Blog feed: category and publication context, readable title, summary, tags, and an explicit reading action.
- Use a deliberate split layout only when a real cover image exists, with a single-column responsive fallback at narrow widths.
- Preserve the existing public API query, blog-detail links, loading/error/empty states, theme surfaces, and reduced-motion behavior.
- Add regression coverage for coverless and covered post layouts, then publish the verified commit through the guarded personal-site deployment flow.

## Capabilities

### New Capabilities

- `author-post-card-layout`: Responsive, Blog-aligned presentation rules for public posts embedded in the Author page.

### Modified Capabilities

None.

## Impact

- Frontend component: `fronted/vue3-merged/src/components/author/AuthorPublicPostsColumn.vue`.
- Frontend tests: adjacent Vitest coverage for post-card structure and cover-aware state.
- No backend API, database, dependency, route, or deployment-contract changes.
- Delivery targets only the personal website server `111.228.35.186` after clean-master, test, build, backup, health, and rollback gates pass.
