## Purpose

Give the existing writing, music, album, moment and author administration surfaces a cohesive and content-led presentation, preserving real actions and data while making editing state, primary actions and media easier to understand across themes and screen sizes.

## ADDED Requirements

### Requirement: Cohesive content surfaces
Writing, music, albums, moments and the author workspace SHALL present a clear page identity, a dominant content or editing area and a distinguishable primary action using the site's existing theme tokens and genuine content.

#### Scenario: Content and theme changes
- **WHEN** a visitor changes the site theme or opens a content surface with long real titles and media
- **THEN** text, controls and media remain legible without changing functionality or inventing activity, counts or content

### Requirement: Writing and author workflow clarity
The writing and author workspace surfaces SHALL clearly distinguish editing, saving, saved, publishing and failed states wherever these actions exist, and preserve drafts, access control, uploads and existing editor capabilities.

#### Scenario: Editing and saving
- **WHEN** an author edits and saves an article
- **THEN** existing save actions remain reachable and the current state is visible without replacing the editor or losing its content

#### Scenario: Content management
- **WHEN** an author manages albums, moments or articles
- **THEN** navigation, selection, editing and publish controls remain usable in the improved workspace and reflect real data

### Requirement: Useful loading and recovery states
Content surfaces SHALL provide proportionate loading, empty and error states, with an existing recovery or creation action where available, and SHALL respect keyboard focus and reduced-motion preferences for new effects.

#### Scenario: No content or failed request
- **WHEN** a content list is empty or a request fails
- **THEN** the surface explains the state and exposes a meaningful available action without fake cards or fabricated metrics
