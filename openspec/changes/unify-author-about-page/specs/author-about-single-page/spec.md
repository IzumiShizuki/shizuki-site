## Purpose

Provide a coherent public author experience that presents the site introduction, complete building history, and published writing on one accessible, theme-consistent page.

## ADDED Requirements

### Requirement: Unified public content order
The system SHALL present the public author content as one continuous page ordered “关于网站”, “建站经历”, and “站点文章”, without requiring a route change between those sections.

#### Scenario: Visitor opens the About page
- **WHEN** a visitor opens the public author About route
- **THEN** all three sections are present in the document in the required order
- **AND** the journey section contains the complete available journey rather than a preview-only subset

### Requirement: In-page content navigation
The system SHALL show a public content rail ordered “关于网站”, “建站经历”, and “站点文章” that navigates within the unified page and indicates the section currently being read.

#### Scenario: Visitor selects a content destination
- **WHEN** a visitor selects “建站经历” or “站点文章” from the public rail
- **THEN** the page scrolls to that section without replacing the unified page
- **AND** the selected section becomes the active rail item

#### Scenario: Visitor scrolls through the page
- **WHEN** the visible reading position crosses into a different public section
- **THEN** the matching public rail item becomes active

#### Scenario: Public page is shown to an administrator
- **WHEN** an authenticated administrator opens the public author page
- **THEN** the public rail remains a content-only rail without the profile summary or management groups
- **AND** existing management routes remain available when opened directly

### Requirement: Legacy public route compatibility
The system SHALL canonicalize legacy Journey and Posts public routes to the unified About route while retaining the requested section as a deep-link destination.

#### Scenario: Legacy Journey link is opened
- **WHEN** a visitor opens the former Journey route
- **THEN** the URL is replaced with the unified About route and a Journey section destination
- **AND** the unified page moves to the Journey section

#### Scenario: Legacy Posts link is opened
- **WHEN** a visitor opens the former Posts route
- **THEN** the URL is replaced with the unified About route and a Posts section destination
- **AND** the unified page moves to the Posts section

### Requirement: Clear photo hero transition
The system SHALL render the public introduction hero with an unblurred source photograph and a wave-shaped transition into the introduction surface using the active theme colors.

#### Scenario: Hero is rendered in either theme
- **WHEN** the public About page is rendered in day or night mode
- **THEN** the hero photograph is displayed without a blur or glass backdrop treatment
- **AND** a bottom wave visually joins the photograph to a theme-derived introduction surface without an unrelated gray seam

### Requirement: Responsive content access
The system SHALL preserve access to the same in-page destinations when the desktop rail is replaced by the compact author drawer.

#### Scenario: Visitor uses a narrow viewport
- **WHEN** the left rail is hidden by the responsive layout
- **THEN** the author drawer presents the same three content destinations in the same order
- **AND** choosing a destination closes the drawer and moves to the matching section
