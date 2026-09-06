## Why

The public author area currently fragments “关于网站”, “建站经历”, and “站点文章” across separate route tabs while duplicating journey content inside the About view. Its profile-and-management-heavy rail and blurred hero also obscure the intended reading path, so the public experience needs one coherent page with clear in-page navigation.

## What Changes

- Combine the About introduction, complete site-building journey, and public posts into one continuous public page in that order.
- Replace the public profile/management rail with a concise in-page content rail ordered “关于网站 → 建站经历 → 站点文章”, including scroll-aware active state.
- Canonicalize public navigation on the About route while preserving legacy Journey and Posts links as deep links to the matching section.
- Replace the blurred glass hero artwork with a clear, full-width photograph and a theme-aware wave transition into the introduction content.
- Preserve existing author-management routes, editors, life widgets, public data loading, and responsive drawer access.

## Capabilities

### New Capabilities

- `author-about-single-page`: Defines the unified public author page, same-page content navigation, legacy-route compatibility, and clear photo-to-content hero transition.

### Modified Capabilities

None.

## Impact

- Frontend author routing and scroll synchronization in `fronted/vue3-merged/src/pages/AuthorPage.vue`.
- Public author composition and visual components under `fronted/vue3-merged/src/components/author/`.
- Author page/component unit tests and local browser visual verification.
- No backend API or dependency changes.
