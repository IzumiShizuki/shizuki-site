## Purpose

Ensure that Workshop wallpapers added to the site reference an actual browser-playable resource instead of a presentation image that merely advertises the Workshop item.

## ADDED Requirements

### Requirement: Presentation-only Workshop assets are never installed as wallpaper content
The system SHALL exclude conventional preview, thumbnail, and cover assets from eligible Workshop runtime-resource selection.

#### Scenario: Download contains a preview and playable media
- **WHEN** a downloaded Workshop item contains both a presentation preview and a supported runtime image or video
- **THEN** the installed wallpaper references the supported runtime resource rather than the presentation preview

#### Scenario: Native project contains only a presentation preview
- **WHEN** a downloaded Wallpaper Engine project contains engine-native resources and no eligible browser-playable resource other than a presentation preview
- **THEN** the import finishes with a conversion-required fallback outcome and does not create a wallpaper profile from the preview

### Requirement: Existing browser-playable selection remains compatible
The system SHALL retain the preference for animated browser-playable assets over static browser-playable assets after presentation assets are excluded.

#### Scenario: Multiple eligible runtime assets are present
- **WHEN** a downloaded Workshop item contains both supported static and animated runtime assets
- **THEN** the installed wallpaper selects an eligible animated runtime asset according to the existing priority behavior
