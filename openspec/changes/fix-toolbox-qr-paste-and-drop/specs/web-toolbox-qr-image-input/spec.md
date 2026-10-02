## Purpose

Provide a focused image input area in Web Toolbox QR recognition so users can paste screenshots or drop local QR images without opening a file picker, with local decoding and predictable feedback and cleanup.

## ADDED Requirements

### Requirement: Recognition accepts direct image paste
The QR recognition panel SHALL provide a keyboard-focusable image input area that accepts clipboard images through the standard paste gesture without requiring clipboard-read permission.

#### Scenario: Paste an image into the input area
- **WHEN** the user focuses the image input area and pastes an image containing a QR code
- **THEN** the image is previewed and its decoded payload is displayed without opening a file picker

#### Scenario: Clipboard contains no image
- **WHEN** the user pastes plain text or unsupported content into the image input area
- **THEN** the panel explains that an image is required and keeps image input available

### Requirement: Recognition accepts image drop
The image input area SHALL accept local image files via drag and drop, prevent default browser file navigation, and provide a visible drag target state.

#### Scenario: Drop an image
- **WHEN** the user drags a local QR image onto the image input area and drops it
- **THEN** the browser remains on the toolbox and the panel previews and decodes the image

#### Scenario: Drop a file without MIME metadata
- **WHEN** the user drops a decodable PNG or JPEG file whose MIME type is empty
- **THEN** the panel accepts it using its image filename extension

#### Scenario: Drop unsupported content
- **WHEN** the user drops a non-image file or content without a local image
- **THEN** the panel reports that an image is required without navigating away or attempting QR decoding

### Requirement: Image recognition maintains current input state
All image input paths SHALL decode locally, clear stale results when a new image is accepted, expose progress and failure feedback, and ignore stale asynchronous work after replacement, clear, mode exit or unmount.

#### Scenario: Image decode fails
- **WHEN** an accepted image cannot be loaded or contains no decodable QR code
- **THEN** the result area shows no stale payload and explains the failure while allowing another image

#### Scenario: Input is replaced during decode
- **WHEN** another image is accepted before the previous decode finishes
- **THEN** only the newest image can update the result and obsolete image previews are released

#### Scenario: Delayed clipboard read after leaving recognition
- **WHEN** clipboard reading finishes after the user clears the tool, switches modes or closes it
- **THEN** it does not restore a preview, restart recognition or emit stale feedback

#### Scenario: Alternative input paths remain available
- **WHEN** the user selects an image file, uses the clipboard button or starts camera scanning
- **THEN** these existing recognition paths remain functional
