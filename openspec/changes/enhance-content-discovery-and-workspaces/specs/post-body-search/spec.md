## Purpose

Help readers recover published articles from words appearing anywhere in their readable text, while retaining existing category, tag and date exploration and ensuring search never broadens access to restricted content.

## ADDED Requirements

### Requirement: Multi-field body-aware search
Article search SHALL match case-insensitive query terms across title, summary, tags, category and Markdown text. Every whitespace-separated query term SHALL match at least one of these fields, and existing filters, ordering and pagination SHALL remain effective.

#### Scenario: Body-only and multi-term match
- **WHEN** a reader searches for a phrase whose terms appear only in an accessible article's body or across its title and body
- **THEN** the article appears when every term matches, and a different article missing a term does not

#### Scenario: Published access constraints
- **WHEN** a reader searches for a term found in a draft, deleted or inaccessible article
- **THEN** that article and its matching text are excluded from the response

### Requirement: Search context and freshness
Search results SHALL contain a bounded plain-text matching excerpt when applicable. Edits, publication changes and withdrawals SHALL be reflected by subsequent requests without requiring a frontend rebuild.

#### Scenario: Body match excerpt
- **WHEN** an article matches a body query beyond its summary
- **THEN** the result provides a bounded excerpt surrounding a matching term and the UI renders it as text rather than executable HTML

#### Scenario: Update and withdrawal
- **WHEN** the matching text is removed or the article is unpublished
- **THEN** subsequent searches no longer return the outdated match

#### Scenario: Unicode text before a match
- **WHEN** the body contains characters whose lowercase form expands before a later query match
- **THEN** excerpt offsets refer to the original text, retain the matching context and never fail or split a surrogate pair
