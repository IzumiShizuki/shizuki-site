## Context

See proposal.md for the user-visible problem. The Wallhaven search payload provides `source` and `tags` but has no first-class title today; the search response currently omits both as title candidates, and the frontend builds a category-and-ID title. The import endpoint fetches the full Wallhaven detail payload, so it can resolve the same title even when an older frontend submits a placeholder.

## Goals / Non-Goals

**Goals:**
- Resolve titles consistently for search results and imports.
- Prefer a meaningful title or source URL path name, with tags and a provider-ID fallback.
- Keep category and other metadata separate from the title.
- Preserve custom titles entered by the user.

**Non-Goals:**
- Renaming wallpaper records already imported into a user's library.
- Following source links to scrape titles from third-party websites.
- Changing Wallhaven discovery filters or download behavior.

## Decisions

- Resolve the title in the backend from the Wallhaven payload, and add it to the search item response. This keeps frontend display and backend import behavior aligned; duplicating the source parsing in Vue could make the two paths diverge.
- Prefer an explicit title if the provider adds one, then a descriptive final source URL path segment, then available tag names, and finally `Wallhaven #<id>`. Ignore empty or numeric-only URL segments, image filenames, long hash IDs and ArtStation artwork IDs because they do not describe artwork names.
- Keep category labels in the existing metadata line. The frontend consumes the response title and uses the provider-ID fallback only for older responses that do not yet contain the new field.
- During import, keep a non-placeholder request title as the user's override. Treat known category-and-ID labels emitted by the older frontend as missing titles and derive the name from the fetched detail payload.

## Risks / Trade-offs

- A source URL slug may be an artist or collection name rather than the exact artwork title → use tag names when the final segment is empty or numeric, and preserve the editable import title for user correction.
- Tag-derived titles may be less specific than a source title → prefer direct provider title metadata and descriptive source URL segments first.
- Older imported rows keep their existing generated titles → no database migration is performed, avoiding accidental replacement of user-edited names.

## Migration Plan

The search response change is additive. Deploy the backend response and import fallback together with the frontend title consumption. Rollback can revert both code changes; no database schema or record migration is needed.
