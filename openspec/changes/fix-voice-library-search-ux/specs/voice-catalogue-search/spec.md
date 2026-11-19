## ADDED Requirements

### Requirement: Usable Search and Tag States

The voice catalogue SHALL show the active keyword and tag selections, including selections no longer present in the current page facets. Filter identity SHALL use upstream tag IDs.

#### Scenario: Narrow a keyword search by tags

- **WHEN** a user submits a keyword while tags are selected
- **THEN** the catalogue SHALL apply the keyword and retained tag filters together and provide individual removal controls

### Requirement: Latest Voice Search Wins

The catalogue SHALL prevent a superseded search response from replacing results for a newer search.

#### Scenario: Older catalogue request completes late

- **WHEN** the user changes a filter and an earlier request completes after the change
- **THEN** the results and error state SHALL reflect only the newer request
