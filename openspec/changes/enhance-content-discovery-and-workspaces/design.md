## Context

See proposal.md and the four capability specs. The application uses Vue Hash history, Spring Boot content APIs, PostgreSQL-backed MyBatis models and separate Nginx frontend delivery. Markdown already exists in CTN_POST_CONTENT.markdown_cache. Public albums/moments already distinguish PUBLIC/UNLISTED and carry noindex flags. Dynamic themes and existing content shells are the visual authority. The user expressly permits delegating frontend and art work to local Claude Code.

## Goals / Non-Goals

**Goals:** Deliver real initial HTML and portable sharing, improve permission-safe body search, refine all five requested content surfaces, and verify complete mobile reading paths.

**Non-Goals:** No switch to Next.js, no search cluster, no production deployment, no push, no RSS/interest/portfolio additions in this change, and no replacement of authentication, media or editor engines.

## Decisions

1. **Add a progressive public reader at `/read/posts/{id}`, `/read/albums/{slug}`, `/read/moments/{publicId}`.** Spring generates content-specific HTML, safe Markdown, theme-aware reader CSS, canonical/OG/Twitter and JSON-LD, with a clear link to the existing interactive hash route. Add `/read/` as a discoverable public index, `/sitemap.xml` and `/robots.txt`. Keep application routing and desktop file-protocol compatibility intact. This avoids coupling Java to changing Vite asset manifests or converting the entire application to SSR. Public HTML is usable itself; do not auto-redirect crawlers or humans. CommonMark Java may be added solely for server Markdown, with raw HTML escaped and executable URLs sanitized.
2. **Canonical origin is explicit configuration.** Use `shizuki.content.public-site-url` (environment override), defaulting to the existing personal-site domain established from tracked deployment files. Never derive canonical URLs from arbitrary Host/Forwarded headers. Reject non-http(s), credentials, query and fragment in configured origins. Proxy reader/robots/sitemap through Nginx and Vite. No private config is copied into artifacts.
3. **Anonymous publication rules are authoritative.** SEO queries use PUBLIC, PUBLISHED and undeleted records regardless of LoginUserContext. Post access includes category policies. Album/moment detail reuses existing public query services, retaining UNLISTED noindex/private-no-store behavior. Sitemap reads published public identifiers and paginates output, rather than calling personalized lists or truncating to the first page. Errors return generic HTML with real HTTP status and noindex.
4. **Extend existing article search without a stale external index.** For nonempty queries, bulk-load Markdown caches for already authorized candidates in bounded batches, normalize readable text, and apply all terms across fields. Return a bounded `searchExcerpt` in the additive PostSummary response field, preserving a compatibility constructor if required by existing tests/callers. Normal cached articles do not fetch object storage; legacy articles without a local cache use storage fallback only when metadata cannot satisfy all terms. This compatibility fallback is proportional to missing-cache candidates, so legacy caches should be backfilled before the collection grows substantially. Mutations write the same cache, so changes are immediately visible.
5. **Preserve incumbent art direction and strengthen hierarchy.** Use existing theme text/surface/accent variables, fonts and genuine media. The signature is a calm content stage: a compact identity and operation band, a clear media/text focus and quiet supporting controls. Writing emphasizes title/content/save status; music emphasizes cover and listening context; albums emphasize photography; moments emphasize readable time and body; the author workspace emphasizes current section and primary action. Avoid fabricated counters and decorative placeholder art. This is refinement of existing surfaces, not a new branding exercise.
6. **Local Claude owns only the agreed frontend presentation files.** The primary agent owns backend/search, SEO, share/metadata utilities, routing/deploy integration, tests and final verification. Claude receives the completed OpenSpec files, file boundaries, existing design tokens and meaningful validation commands. It must not read secrets, touch unrelated files, commit, push or deploy.
7. **Session-scoped reading continuity.** Store blog-list filter/page and scroll position in session storage with validated, bounded fields. Preserve query URL behavior and restore only on the relevant list return after data/layout render. Centralize share URL sanitization and metadata helpers; use text nodes for snippets. Add no global motion reset or permanent overlay.

## Risks / Trade-offs

- Separate public reader and interactive layout can drift → reuse content services and links, document the endpoint, test same titles/identifiers and keep reader functional without JavaScript.
- Body filtering remains in-process at current content scale → batch local cache reads, skip body reads for empty search and document the scale boundary; a measured database index can follow later.
- Existing UI files are large → delegate bounded files, inspect diffs, preserve events and run targeted behavior tests plus build.
- Public media signing and UNLISTED headers → reuse established URL factory/query visibility rules and assert response/cache headers in tests.
- Source unit checks cannot prove search-engine indexing or third-party platform rendering → validate raw HTML and metadata locally; record production crawl/preview checks as post-deployment operational verification rather than claim actual indexing.

## Migration Plan

### Follow-up boundary corrections

- Keep literal ROOT-lowercased search semantics and translate the matching offset back to the original text by code point before slicing; lowercase expansion must not shift substring indices or lose a query containing the expanding character.
- Keep the general robots API exclusion, add a more-specific allowance for owned public image variants and exclude query-bearing media requests. Media authorization remains the access boundary. Prefer DISPLAY_WEBP, then DISPLAY_AVIF, then thumbnails for reader media.
- When both sharing and automatic copying are unavailable, reveal the sanitized stable link in a labelled readonly input and select it for manual copying. Reset feedback when content changes and ignore results belonging to an older share attempt.

1. Ship additive Java/API/frontend changes with no database migration.
2. Supply the tracked canonical origin and proxy routes alongside existing deployment configuration; configure an origin override if needed.
3. Existing links remain valid. New share actions generate `/read/...` on http(s), with the existing configured public origin for desktop contexts.
4. Rollback restores the previous frontend/backend images and proxy config; no data rollback is required.

## References

- https://developers.google.com/search/docs/crawling-indexing/javascript/javascript-seo-basics
- https://ogp.me/
- https://github.com/commonmark/commonmark-java
