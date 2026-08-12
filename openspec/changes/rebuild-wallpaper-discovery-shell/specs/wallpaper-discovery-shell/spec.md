## Purpose

Provide a focused Wallpaper-style discovery workspace where users can search supported wallpaper sources, inspect a reliable visual preview, and start an import without leaving the background workflow.

## ADDED Requirements

### Requirement: Users can open a dedicated discovery workspace

The system SHALL present the wallpaper acquisition flow as a focused workspace with its own title bar, source navigation, search area, result gallery, detail inspector, and close action. The workspace MUST remain inside the existing application context and MUST NOT require opening an uncontrolled third-party page to browse results.

#### Scenario: Open the acquisition workspace

- **WHEN** an authenticated user switches to the wallpaper acquisition flow
- **THEN** the system shows the Wallpaper-style discovery workspace and keeps the existing background picker available as the close/return boundary

#### Scenario: Close the acquisition workspace

- **WHEN** the user activates the workspace close control or presses Escape
- **THEN** the system closes the picker without changing the currently applied wallpaper

### Requirement: Users can search and filter supported sources

The system SHALL support source-specific discovery controls for Steam Workshop and Wallhaven. Steam Workshop MUST expose keyword search, sorting, and pagination. Wallhaven MUST expose keyword search, sorting, category/purity controls, minimum resolution, ratios, and pagination. Search MUST be triggerable by Enter and by an explicit search action.

#### Scenario: Search Steam Workshop

- **WHEN** the user enters a keyword, chooses a Workshop sort, and submits the search
- **THEN** the system requests the selected page and sort, displays the returned results, and resets the selected item to the first available result or an empty state

#### Scenario: Search Wallhaven with filters

- **WHEN** the user selects Wallhaven filters and submits the search
- **THEN** the system sends the keyword and selected filters, displays the returned page metadata, and keeps the filter values visible for the next search

#### Scenario: Navigate result pages

- **WHEN** the user activates Next or Previous
- **THEN** the system requests the adjacent valid page, preserves the current source and filter values, and disables navigation while the request is pending or the boundary has been reached

### Requirement: Results provide resilient visual previews

The system SHALL render each result as a visual card with a thumbnail, title, source metadata, and loading state. A preview MUST try a same-origin discovery preview when available and MAY fall back to upstream thumbnail/full-size candidates. If every candidate fails, the system MUST show an explicit unavailable-preview state with a retry action instead of a broken image icon. Preview failure for one card MUST NOT remove the result or block selecting other cards.

#### Scenario: Preview loads successfully

- **WHEN** a result preview candidate returns a usable image
- **THEN** the card and detail inspector display the image with the result title as accessible alternative text

#### Scenario: Preview fails

- **WHEN** all preview candidates for a result fail to load
- **THEN** the system replaces the image with a labeled unavailable-preview placeholder and keeps a retry control on the card or inspector

#### Scenario: Preview request is still loading

- **WHEN** a result is present before its image has loaded
- **THEN** the system displays a stable skeleton or loading placeholder with the same dimensions as the final preview

### Requirement: Users can inspect and import a selected result

The system SHALL provide a persistent detail inspector for the selected result. The inspector MUST show the largest available preview, title, source, resolution or other source metadata when available, a link to the source detail page, visibility selection, and the appropriate import action. Selecting a result MUST update the inspector without navigating away from the workspace.

#### Scenario: Select a Workshop result

- **WHEN** the user selects a Steam Workshop card
- **THEN** the inspector shows the selected preview and metadata, checks the Workshop download channel, and exposes an import action that emits the existing Workshop import payload

#### Scenario: Select a Wallhaven result

- **WHEN** the user selects a Wallhaven card
- **THEN** the inspector shows the selected preview and metadata and exposes a pull/import action that emits the existing Wallhaven import payload

#### Scenario: Import with a chosen visibility

- **WHEN** the user chooses Private or Public and activates the import action
- **THEN** the system emits the selected source identifier, title, and visibility exactly once and disables the action while the parent import task is busy

### Requirement: Existing wallpaper operations remain reachable

The system SHALL preserve access to local package upload, manual Workshop URL import, import-job status checking, library refresh, wallpaper selection, and owned-wallpaper settings. A discovery redesign MUST NOT change the existing apply-to-route versus apply-globally behavior.

#### Scenario: Refresh the library after an import succeeds

- **WHEN** the parent import job reports success
- **THEN** the existing wallpaper library refreshes and the newly available wallpaper can be selected without reloading the page

#### Scenario: Apply a selected wallpaper

- **WHEN** the user selects a library wallpaper and chooses the current route or global default scope
- **THEN** the system uses the existing background selection behavior and closes no unrelated application state
