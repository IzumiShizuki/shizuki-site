## Purpose

Define how the embedded Folia player follows the music workspace's effective wallpaper and how its shared controls remain clear and usable across desktop, tablet, and mobile layouts.

## ADDED Requirements

### Requirement: Folia follows the effective music-route wallpaper
The embedded Folia player SHALL use the current music route's effective wallpaper before falling back to the Home wallpaper. When the effective wallpaper changes, the ambient Folia surface and embedded wallpaper SHALL update without reloading or remounting the music workspace.

#### Scenario: Visitor changes the music route wallpaper while Folia is open
- **WHEN** the effective wallpaper for the music route changes while Folia is visible
- **THEN** both the ambient surface and Folia's embedded wallpaper reflect the new selection
- **AND THEN** the Folia player and current playback session remain mounted

#### Scenario: The selected wallpaper is dynamic
- **WHEN** the effective music-route wallpaper is a video or Live2D wallpaper
- **THEN** image-backed background layers use its preview image
- **AND THEN** the Folia bridge retains the dynamic flag and preview metadata

#### Scenario: Music route wallpaper context is unavailable
- **WHEN** the music route has no wallpaper context
- **THEN** Folia falls back to the available Home wallpaper or the existing default background

### Requirement: Folia toolbar controls have clear spacing and usable targets
The Folia toolbar SHALL keep the current track summary visually distinct from its playlist and playback actions. Desktop controls MUST provide at least 36 CSS pixels of height and visible spacing between adjacent actions.

#### Scenario: Visitor uses the toolbar on a wide viewport
- **WHEN** the music workspace has enough horizontal room for one toolbar row
- **THEN** the track summary and action group remain separated and the controls are readable without crowding

#### Scenario: Visitor uses the toolbar on an intermediate or narrow viewport
- **WHEN** the music workspace cannot fit the track summary and all actions on one row
- **THEN** the toolbar reflows or hides the secondary track summary without horizontal overflow or overlap
- **AND THEN** icon-only actions retain accessible names and at least 36 CSS pixels of height
