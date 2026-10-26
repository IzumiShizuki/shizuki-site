## Purpose

Ensure voice work discovery applies keyword, tag, and age conditions to the complete upstream collection before selecting a page, so users can find matching works without traversing unrelated or empty result slices.

## ADDED Requirements

### Requirement: Filter the collection before pagination
The system SHALL apply all selected tag IDs, the selected age categories, and the keyword to the complete voice search scope before paginating. Selected tags MUST use AND semantics and selected age categories MUST use OR semantics.

#### Scenario: Matching tags occur beyond the unfiltered first page
- **WHEN** a user selects a tag whose works occur beyond the first unfiltered page
- **THEN** the first result page contains the first matching works in the requested order without requiring intermediate unfiltered pages

#### Scenario: Combined search conditions
- **WHEN** a user provides a keyword, multiple tags, and multiple age categories
- **THEN** each result matches the keyword, every selected tag, and at least one selected age category

### Requirement: Page the filtered result set consistently
The system SHALL calculate each page and its continuation from the filtered collection using the requested page size. The hasMore flag MUST reflect whether the filtered collection contains a later page.

#### Scenario: Consecutive filtered pages
- **WHEN** a user loads successive pages of filtered works
- **THEN** the pages contain consecutive matching works without omissions or duplicate pagination windows

#### Scenario: No filtered matches remain
- **WHEN** the filtered collection has no works beyond the current page
- **THEN** hasMore is false even if unrelated works exist in the upstream collection

#### Scenario: Initial and appended requests use different sizes
- **WHEN** the initial page requests 20 matches and appended pages request 10 matches
- **THEN** the first appended page begins with matching work 21 and subsequent requests advance by 10 matches

### Requirement: Preserve access and unfiltered browsing
The system SHALL continue enforcing voice access permissions and preserve keyword-free browsing and the public response shape.

#### Scenario: No access grant
- **WHEN** a user without voice access requests a filtered page
- **THEN** access is rejected before any upstream metadata or search request

#### Scenario: No keyword or filters
- **WHEN** a user requests voice works without keyword or filters
- **THEN** the system returns the requested page of the sorted upstream collection
