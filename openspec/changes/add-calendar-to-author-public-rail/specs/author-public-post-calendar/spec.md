## Purpose

Give visitors on the author's public content page a familiar way to discover published blog posts by date and continue reading them in the blog list.

## ADDED Requirements

### Requirement: Public author navigation provides a publication calendar
The author public content navigation SHALL show the same monthly publication calendar used by the blog list, including month navigation, published-day counts, and loading, empty, error, and retry states. The calendar SHALL be available in both the page rail and its auxiliary navigation drawer.

#### Scenario: Visitor opens the public content navigation
- **WHEN** the public author content view is displayed
- **THEN** the navigation rail shows a monthly calendar of publicly published post dates

#### Scenario: Calendar data is unavailable
- **WHEN** the monthly publication data request fails
- **THEN** the rail keeps its navigation available and the calendar offers a retry action

### Requirement: Selecting a public post date opens the filtered blog list
The author public calendar SHALL allow selection only for dates with public posts. Selecting a date SHALL open the blog list with results limited to that calendar day and SHALL preserve the selected day in the blog calendar and visible filter state.

#### Scenario: Visitor selects a day with posts
- **WHEN** the visitor selects a date marked with public posts from the author rail or drawer
- **THEN** the blog list opens with that date selected and shows posts published on that day

#### Scenario: Visitor opens a blog list with a valid date link
- **WHEN** the blog list receives a valid date query parameter
- **THEN** it filters to that day, shows the corresponding calendar month, and exposes the selected date with an option to clear it

#### Scenario: Visitor opens a blog list with an invalid date link
- **WHEN** the blog list receives a malformed date query parameter
- **THEN** it ignores the parameter and displays the unfiltered blog list
