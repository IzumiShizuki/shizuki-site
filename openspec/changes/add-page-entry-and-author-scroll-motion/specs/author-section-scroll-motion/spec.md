## Purpose

Make the public About page's long personal story easier to browse by smoothly moving between its existing in-page sections while retaining direct links and reduced-motion support.

## ADDED Requirements

### Requirement: Public About section navigation scrolls smoothly
The system SHALL move the public About page's reading position smoothly when a visitor chooses a section destination from its content navigation.

#### Scenario: Visitor chooses a section destination
- **WHEN** a visitor selects About, Journey, or Posts from the public content navigation
- **THEN** the existing About page scrolls to the selected section without replacing the page
- **AND** the matching destination is shown as active in the content navigation

#### Scenario: Visitor opens a direct section link
- **WHEN** a visitor opens a URL that targets a section of the public About page
- **THEN** the page positions that section immediately after its content is mounted
- **AND** the URL retains the canonical About route and requested section

#### Scenario: Visitor requests reduced motion
- **WHEN** the operating system requests reduced motion and the visitor chooses an in-page destination
- **THEN** the page moves to that section immediately without smooth scrolling
