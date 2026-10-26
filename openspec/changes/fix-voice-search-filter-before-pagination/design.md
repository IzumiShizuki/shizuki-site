## Context

See proposal.md for motivation. `searchVoiceWorks` currently filters one upstream page. `AsmrMusicProvider` also omits `pageSize` in both search and list requests. The frontend intentionally requests 20 works initially and then page 3 onward with size 10; that arithmetic works only when the upstream honors the requested size.

## Goals / Non-Goals

**Goals:** Apply filters to upstream search before pagination, retain tag AND / age OR behavior, and honor the existing pagination contract.

**Non-Goals:** Mirror the whole upstream catalogue locally, scan every unfiltered upstream page, redesign the page, or deploy/push changes.

## Decisions

1. Add a provider search entry point accepting normalized selected tags and ages. Resolve selected tag IDs through the upstream `/api/tags/` catalogue and translate them into separate `$tagw:<name>$` conditions. This includes low-vote tags already present in work metadata, matching the current local membership behavior. Unknown IDs produce an empty result instead of broadening the search. Fetch one catalogue per tagged request; do not introduce a separate cache lifecycle in this fix.
2. Use the upstream age grammar: one category uses `$age:<category>$`; two categories exclude the remaining category with `$-age:<category>$`; all three omit the age condition. `/` is not an age OR operator. Keep the user keyword as part of the same search expression. Preserve the 64-character validation for the user keyword while allowing generated filter expressions to exceed that length.
3. Send `pageSize` for search POST bodies and list query parameters. Remove service-level post-pagination tag/age filtering. Compute `hasMore` from the filtered upstream total and pagination, retaining the current response fields and page tag aggregation.
4. Keep the frontend 20/10 loading sequence; validate it with its existing tests rather than changing already-correct offset arithmetic.
5. Cover the real service path and the provider HTTP boundary with deterministic in-process fixtures. The fake upstream contains matching works after unrelated works and applies the received search conditions before pagination, so the old implementation returns an empty/incomplete first page.

## Risks / Trade-offs

- [Extra catalogue request when tags are selected] → One metadata request regardless of tag count; upstream failures use existing failover/error behavior instead of silently ignoring filters.
- [Upstream search grammar changes] → HTTP contract tests plus read-only live probes against current upstream behavior; document the verified syntax.
- [Generated expressions exceed keyword validation] → Validate user input before composing conditions and avoid applying user-only limits to the generated expression.
- [Changing upstream data between requests] → Retain upstream ordering and existing semantics; this fix does not promise snapshot consistency.

## Migration Plan

No database migration or API shape change. Build and verify locally; deployment is a separate authorized operation. Rollback reverts the provider/service changes.
