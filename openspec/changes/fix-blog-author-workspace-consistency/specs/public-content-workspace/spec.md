## Purpose

Provide a coherent public reading workspace in which navigation and context remain stable while the selected content remains usable, responsive, and honest about optional feature availability.

## ADDED Requirements

### Requirement: Desktop center column owns content scrolling
On desktop-sized blog list, blog detail, and public author About/Posts views, the system SHALL scroll the center content independently while the visible left and right rails remain stationary in the viewport.

#### Scenario: Reader scrolls a desktop blog list
- **WHEN** a desktop reader scrolls while the pointer is over the blog feed
- **THEN** only the center feed position changes and both side rails retain their viewport positions

#### Scenario: Reader scrolls a desktop article
- **WHEN** a desktop reader scrolls a long article
- **THEN** the article column scrolls while article navigation and contextual side content remain stationary

#### Scenario: Reader scrolls a public author tab
- **WHEN** a desktop reader scrolls either the About or Posts center column
- **THEN** the author profile rail and life-widget rail retain their viewport positions

#### Scenario: Compact viewport uses document flow
- **WHEN** the viewport enters the compact responsive layout
- **THEN** the content SHALL return to a natural document or drawer flow without trapping the reader in nested desktop scroll regions

### Requirement: Menu visibility is directly controllable
The system SHALL keep a discoverable desktop control for manually collapsing or expanding the menu, regardless of the active content scroll position, and SHALL continue to react to the active center column's scroll state when no manual choice overrides it.

#### Scenario: Collapse menu at the top of a page
- **WHEN** a desktop reader activates the collapse control before scrolling
- **THEN** the menu enters its compact presentation and the control remains available to restore it

#### Scenario: Center content crosses the automatic threshold
- **WHEN** the active center column scrolls beyond the configured menu threshold and the reader has not forced the menu open
- **THEN** the menu enters its compact presentation

#### Scenario: Expand a compact menu
- **WHEN** a desktop reader activates the expand control on a compact menu
- **THEN** the full menu is restored without requiring a page scroll

### Requirement: Author About and Posts share one public experience
The system SHALL present the public author About and Posts tabs in the same three-column shell, with shared typography, surface treatment, rail behavior, and interaction language. The Posts center column SHALL display real public post data rather than a placeholder that only redirects elsewhere.

#### Scenario: Switch from About to Posts
- **WHEN** a visitor selects Posts from the public author experience
- **THEN** the center content changes to the author's public post collection while the shared profile and life-widget rails keep the same structure and styling

#### Scenario: Open a post from the author page
- **WHEN** a visitor activates an available post in the author Posts center column
- **THEN** the system navigates to that post's public reading view

#### Scenario: No public posts exist
- **WHEN** the public post query returns no records
- **THEN** the Posts center column presents a deliberate empty state and retains an accessible route to the main blog

### Requirement: Optional content states match actual capability state
The system SHALL distinguish an administratively disabled optional capability from a transient request failure. A disabled capability MUST NOT offer a retry action or a navigation target that cannot succeed, while a transient failure SHALL retain an actionable retry.

#### Scenario: Personal content feature is disabled
- **WHEN** an album or moment request reports that its public capability is disabled
- **THEN** the interface presents a quiet unavailable state without retry or a dead "view all" action

#### Scenario: Widget source is not configured
- **WHEN** weather or quote data reports that no source is available
- **THEN** the interface labels the source as not configured without implying that repeated retry will repair it

#### Scenario: Optional request fails transiently
- **WHEN** an enabled optional-content request fails because of a recoverable network or server error
- **THEN** the interface identifies the load failure and provides an effective retry action

### Requirement: Workspace interactions remain accessible
All newly introduced scrolling regions and controls SHALL remain keyboard accessible, expose visible focus feedback, and preserve semantic landmarks without duplicate nested main landmarks.

#### Scenario: Keyboard user navigates the workspace
- **WHEN** a reader navigates the public workspace using the keyboard
- **THEN** menu controls, author tabs, post entries, and retry actions receive visible focus in a logical order

#### Scenario: Assistive technology reads the page landmarks
- **WHEN** the public workspace is inspected through accessibility semantics
- **THEN** the page exposes a single primary main landmark and meaningful labels for independent scroll regions
