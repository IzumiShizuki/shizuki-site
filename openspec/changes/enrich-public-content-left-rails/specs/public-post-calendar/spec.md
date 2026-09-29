## Purpose

Allow visitors to explore all publicly published blog posts by their true publication date while keeping drafts, private data, and pagination artifacts out of the calendar.

## ADDED Requirements

### Requirement: Public monthly publication date aggregation
The system SHALL provide a public monthly aggregation of publication dates and counts derived only from published, publicly visible posts. The response SHALL represent every matching published post in the requested month and SHALL contain no draft, private, reminder, or schedule data.

#### Scenario: Month contains multiple published posts on one day
- **WHEN** a client requests an eligible month with several public posts on the same date
- **THEN** the response includes that date with its complete post count

#### Scenario: Month contains no published posts
- **WHEN** a client requests a month without public posts
- **THEN** the response succeeds with an empty date collection

### Requirement: Blog calendar filters by selected public publication day
The blog list SHALL display a single navigable month calendar using the public monthly aggregation. Dates with public posts SHALL be selectable; selecting one SHALL filter the list to that complete calendar day, expose the selected date and count in text or accessible naming, and allow the visitor to clear the date filter.

#### Scenario: Visitor selects a published day
- **WHEN** a visitor activates a calendar date with public posts
- **THEN** the list reloads with a range covering that calendar day and starts at its first page

#### Scenario: Visitor selects an empty day
- **WHEN** a calendar day has no public posts
- **THEN** it is not presented as an article-filter action

#### Scenario: Calendar aggregation cannot load
- **WHEN** the monthly aggregation request fails
- **THEN** existing blog navigation remains available and the calendar exposes a concise retry state
