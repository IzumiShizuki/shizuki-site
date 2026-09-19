## Purpose

Ensure a Workshop import installs a genuine browser-playable wallpaper resource and never represents an item's preview asset as its installed visual.

## ADDED Requirements

### Requirement: Workshop import excludes presentation-only preview assets
The system SHALL exclude preview, thumbnail, and cover assets from the set of files eligible to become an installed Workshop wallpaper visual. An import MUST NOT complete successfully when its only eligible visual is an excluded presentation asset.

#### Scenario: Native project contains only a preview GIF
- **WHEN** SteamCMD downloads a Workshop project containing `preview.gif` and no non-preview browser-playable visual resource
- **THEN** the import job reaches `FALLBACK_REQUIRED`
- **THEN** no wallpaper profile or visual asset is created from `preview.gif`

### Requirement: Workshop import selects actual browser-playable media
The system SHALL select a non-preview browser-playable visual resource from the downloaded Workshop directory, preferring animated media over static images when both are available. The stored wallpaper scene type MUST match the selected resource.

#### Scenario: Project contains a cover and an animation
- **WHEN** SteamCMD downloads `preview.gif` alongside a non-preview `.webm`, `.mp4`, animated image, or static image
- **THEN** the import stores the non-preview resource as the visual asset
- **THEN** the job completes successfully with the scene type derived from that resource

### Requirement: Native-only Wallpaper Engine projects fail transparently
The system SHALL identify a Workshop project with Wallpaper Engine-native files but without a browser-playable visual resource and return an actionable fallback message that explains the conversion requirement. The system MUST preserve the existing asynchronous import-job contract.

#### Scenario: Project contains engine scene files but no web-playable media
- **WHEN** a downloaded Workshop directory contains native project files such as `project.json` or `.pkg` but no eligible browser-playable visual resource
- **THEN** the import job reports `FALLBACK_REQUIRED`
- **THEN** the job message states that the native Wallpaper Engine scene requires conversion before it can be used on the website
