## Purpose

Allow supported videos and other runtime media downloaded from Workshop to become usable website wallpapers within a dedicated import limit, while reporting size and native-format restrictions accurately.

## ADDED Requirements

### Requirement: Downloaded Workshop media has an independent import limit
The system SHALL accept supported runtime media in a completed SteamCMD download up to the configured Workshop import limit, defaulting to 512 MiB. A file SHALL NOT be rejected solely because it exceeds the ordinary local-upload limit. Selected media SHALL be transferred to object storage without loading the complete media file into a byte array.

#### Scenario: Downloaded video exceeds the ordinary upload cap
- **WHEN** a completed Workshop project contains a supported MP4 larger than the ordinary upload cap and within the Workshop import limit
- **THEN** the system imports that MP4 as a dynamic wallpaper

#### Scenario: Runtime media exceeds the Workshop import limit
- **WHEN** the only usable runtime visual exceeds the configured Workshop import limit
- **THEN** the system reports the size restriction and the configured limit instead of a native-scene error

### Requirement: Workshop inspection preserves the actual failure reason
The system SHALL distinguish actual native scene resources from ordinary project metadata. A `project.json` file alone SHALL NOT cause a supported video to be classified as a native scene. SteamCMD import failures SHALL preserve the specific directory-inspection reason when the transfer completed but the downloaded media could not be imported.

#### Scenario: Video project includes project metadata
- **WHEN** a project contains `project.json`, a presentation preview and a supported runtime video
- **THEN** the runtime video is selected and the presentation preview is excluded

#### Scenario: Download contains only native scene resources
- **WHEN** a successful transfer contains native scene resources and no supported runtime visual
- **THEN** the import reports that native scene conversion is required

#### Scenario: Successful transfer fails media inspection
- **WHEN** SteamCMD finishes downloading and subsequent media inspection rejects the package
- **THEN** the import task retains the specific media-inspection diagnostic
