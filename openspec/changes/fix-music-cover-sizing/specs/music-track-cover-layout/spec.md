## Purpose

Keep song artwork visually consistent within each music list so that long titles, constrained layouts, missing artwork, and source image proportions do not change the size or alignment of adjacent song covers.

## ADDED Requirements

### Requirement: Consistent square song covers
The music interface SHALL render song thumbnails at the same square size within each list, including search, recommendations, playlists, the playback queue, and radio song lists. Song text SHALL yield available space before compressing the artwork.

#### Scenario: Long titles in constrained lists
- **WHEN** a list contains both short and long song titles at desktop or narrow viewport widths
- **THEN** all song covers in that list retain the same width and height
- **AND** long titles remain constrained to their text region

#### Scenario: Homepage thumbnails render inside their frame
- **WHEN** search results or recommended songs include cover artwork
- **THEN** the visible artwork fills its square thumbnail frame
- **AND** the playback hover overlay remains aligned with that frame

#### Scenario: Placeholder and source image dimensions
- **WHEN** a list contains portrait, landscape, square, or existing placeholder artwork
- **THEN** all rendered thumbnails retain their list's square dimensions
- **AND** source artwork is cropped centrally without distortion
