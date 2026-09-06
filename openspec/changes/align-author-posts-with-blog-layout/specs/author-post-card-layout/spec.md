## Purpose

Provide a readable, responsive Author-page article archive whose card hierarchy matches the main Blog feed and adapts correctly when public posts do or do not include cover media.

## ADDED Requirements

### Requirement: Cover-aware article width
The Author-page public article list SHALL reserve a media column only for entries that include a valid cover image, and SHALL give coverless article copy the full card width.

#### Scenario: Public article has no cover
- **WHEN** a public article has no cover image URL
- **THEN** its title, metadata, summary, tags, and reading action use the available card width without an empty media column

#### Scenario: Public article has a cover
- **WHEN** a public article includes a cover image URL and the card has sufficient width
- **THEN** the card presents a deliberate text-and-cover split with the cover isolated from the reading column

#### Scenario: Covered article is viewed in a narrow container
- **WHEN** a covered article card reaches the narrow responsive breakpoint
- **THEN** the card stacks into one column while preserving title-first reading order and a usable cover ratio

### Requirement: Blog-aligned reading hierarchy
Each Author-page public article card SHALL present category and publication context, a readable multi-line title, reading metadata, a concise summary, optional tags, and an explicit reading action in a stable top-to-bottom order consistent with the main Blog feed.

#### Scenario: Long title and summary
- **WHEN** an article contains a long title and summary
- **THEN** the title may occupy up to two lines, the summary remains a bounded preview, and the metadata and reading action remain legible without horizontal clipping

#### Scenario: Article has tags
- **WHEN** an article includes one or more tags
- **THEN** up to three tags are displayed as a wrapping metadata group without displacing the reading action

#### Scenario: Article has no summary or tags
- **WHEN** an article omits its summary or tags
- **THEN** the existing honest summary fallback is shown and the remaining hierarchy closes naturally without an empty reserved region

### Requirement: Existing interaction and state continuity
The revised cards MUST preserve blog-detail navigation, keyboard focus visibility, loading/error/empty states, semantic theme colors, and reduced-motion behavior.

#### Scenario: Visitor activates an article
- **WHEN** a visitor activates a public article card by pointer or keyboard
- **THEN** navigation continues to use the existing blog-detail route for that article

#### Scenario: Motion reduction is requested
- **WHEN** the operating system requests reduced motion
- **THEN** article cards do not translate on hover and retain a short non-spatial feedback transition

