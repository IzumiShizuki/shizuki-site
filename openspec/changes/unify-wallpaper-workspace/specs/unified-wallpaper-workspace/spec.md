## Purpose

Provide one coherent Wallpaper-style workspace where users can manage installed backgrounds, browse online sources, inspect details, and import or apply wallpapers without changing visual systems or navigating through explanatory panels.

## ADDED Requirements

### Requirement: Background management uses one workspace

The system SHALL present installed wallpapers, online discovery, and Workshop browsing as peer sections within one persistent background workspace. The workspace MUST keep a shared header, content gallery, detail area, and action region across section changes.

#### Scenario: Open the workspace

- **WHEN** the user opens background settings
- **THEN** the system shows My Wallpapers as the initial section with the installed wallpaper gallery and persistent detail area visible

#### Scenario: Change workspace section

- **WHEN** the user selects My Wallpapers, Discover, or Workshop
- **THEN** the content changes in place without closing the workspace or changing its frame, scale, or visual language

### Requirement: Installed wallpapers use gallery and detail interaction

The system SHALL display installed wallpapers as visual cards and SHALL show the selected wallpaper in a persistent detail area. Route/global application scope, type filters, refresh, owned-wallpaper editing, and deletion MUST remain reachable without a separate settings screen.

#### Scenario: Select an installed wallpaper

- **WHEN** the user chooses an installed wallpaper card
- **THEN** the wallpaper becomes active through the existing selection behavior and its preview, type, source, and available settings appear in the detail area

#### Scenario: Change application scope

- **WHEN** the user switches between current route and global default
- **THEN** the next installed wallpaper selection uses the chosen existing application scope

### Requirement: Online sources share the same browsing surface

The system SHALL render Discover and Workshop using the same gallery and detail composition as My Wallpapers. Discover SHALL browse Wallhaven and Workshop SHALL browse Steam Workshop while preserving source-specific filters, pagination, preview fallback, and import behavior.

#### Scenario: Browse Discover

- **WHEN** the user opens Discover
- **THEN** the system searches Wallhaven and shows results, filters, pagination, and selected detail inside the shared workspace

#### Scenario: Browse Workshop

- **WHEN** the user opens Workshop
- **THEN** the system searches Steam Workshop and shows results, sorting, pagination, and selected detail inside the shared workspace

### Requirement: Workspace copy remains concise

The system SHALL prefer short labels, state messages, and direct actions over instructional paragraphs. Local package upload and manual Workshop URL import MUST remain available in a compact add-wallpaper area, and authentication restrictions MUST be communicated at the affected action.

#### Scenario: Guest browses an online source

- **WHEN** an unauthenticated user browses and selects an online wallpaper
- **THEN** previews remain available and the import action is disabled with a concise sign-in label

#### Scenario: Add a local wallpaper

- **WHEN** an authenticated user opens the add-wallpaper area
- **THEN** the system presents file upload and manual Workshop URL controls without replacing the gallery or showing long explanatory copy

### Requirement: Workspace retains Shizuki material styling

The system SHALL use the current theme and accent tokens for text, controls, selection, borders, and surfaces. The outer frame and internal surfaces MUST retain translucent blurred material treatment in both day and night modes rather than using an unrelated opaque color theme.

#### Scenario: Render against the current background

- **WHEN** the workspace opens over any site wallpaper
- **THEN** the current wallpaper remains perceptible through a readable frosted overlay and all three workspace sections retain the same material treatment
