## Purpose

Make QR generation, QR recognition and WiFi card composition first-class Web Toolbox tools that run inside the toolbox workspace, and remove the standalone QR light app that duplicated them.

## ADDED Requirements

### Requirement: QR tools run inside the Web Toolbox

The Web Toolbox SHALL expose QR generation, QR recognition and WiFi card composition as selectable tools that render their working panel inside the toolbox workspace, and SHALL NOT delegate to a separate QR light app.

#### Scenario: User selects QR generation in the toolbox
- **WHEN** the user selects the 二维码生成 tool in the Web Toolbox rail, overview grid or search results
- **THEN** the toolbox workspace renders the QR generation panel with its content input and render options, without opening another light-app window

#### Scenario: User selects QR recognition in the toolbox
- **WHEN** the user selects the 二维码识别 tool
- **THEN** the toolbox workspace renders the recognition panel with its image, clipboard and camera actions and its decoded-result area

#### Scenario: User selects the WiFi QR tool
- **WHEN** the user selects the WiFi 二维码 tool
- **THEN** the toolbox workspace renders the WiFi panel with SSID, encryption, password and hidden-network inputs

#### Scenario: QR tools participate in shared toolbox behavior
- **WHEN** a QR tool is active
- **THEN** the shared clear action resets that tool's input and result, and the shared copy action copies the active QR payload or decoded result

### Requirement: Generation produces downloadable QR output

The generation tool SHALL encode the entered content into a QR code using the selected size, margin, error-correction level and colors, SHALL preview the rendered result, and SHALL let the user download it as PNG or SVG.

#### Scenario: Content is encoded
- **WHEN** the user enters non-empty content
- **THEN** a QR preview is rendered and the payload is offered for copying

#### Scenario: Empty content is not encoded
- **WHEN** the content is empty or whitespace
- **THEN** no QR preview is rendered and no download action is offered

#### Scenario: Rendering fails
- **WHEN** the content cannot be encoded, for example because it exceeds QR capacity
- **THEN** the tool reports a generation error and clears the stale preview

#### Scenario: User downloads the result
- **WHEN** the user downloads the current QR code as PNG or SVG
- **THEN** a file with a normalized name and the chosen extension is saved

### Requirement: Recognition decodes QR content locally

The recognition tool SHALL decode QR content from an imported image file, a clipboard image, or the device camera, and SHALL present the decoded payload with copy and open-link actions.

#### Scenario: User imports an image file
- **WHEN** the user selects a local image containing a QR code
- **THEN** the decoded payload is shown with the source identified as an image

#### Scenario: User pastes a clipboard image
- **WHEN** the clipboard contains an image containing a QR code
- **THEN** the decoded payload is shown with the source identified as the clipboard

#### Scenario: User scans with the camera
- **WHEN** the camera is available and started, and a QR code enters the frame
- **THEN** the frame is decoded, the payload is shown, and the camera stream stops

#### Scenario: No QR code is found
- **WHEN** the supplied image contains no decodable QR code
- **THEN** the tool reports that nothing was detected and keeps the recognition actions available

#### Scenario: Clipboard or camera is unavailable
- **WHEN** the browser does not support clipboard image reading or camera capture
- **THEN** the tool explains the limitation and leaves the remaining recognition paths usable

#### Scenario: Decoded payload is a link
- **WHEN** the decoded payload is an HTTP or HTTPS URL
- **THEN** the tool offers to open it, and otherwise leaves the open-link action unavailable

#### Scenario: Tool is left or the window unmounts
- **WHEN** the user switches away from the recognition tool or the window closes
- **THEN** the camera stream and any preview object URL are released

### Requirement: WiFi QR composition builds a standard payload

The WiFi tool SHALL build a standard `WIFI:` payload from the network name, encryption type, password and hidden-network flag, SHALL escape reserved characters, and SHALL omit the password for open networks.

#### Scenario: Secured network
- **WHEN** the user enters an SSID, a password and a WPA or WEP encryption type
- **THEN** the payload contains the type, SSID and password with reserved characters escaped

#### Scenario: Open network
- **WHEN** the encryption type is set to no password
- **THEN** the payload omits the password field and the password input is disabled

#### Scenario: Hidden network
- **WHEN** the hidden-network option is enabled
- **THEN** the payload marks the network as hidden

#### Scenario: SSID is missing
- **WHEN** no SSID has been entered
- **THEN** no WiFi payload or preview is produced

### Requirement: QR handling stays local

QR generation, recognition and WiFi composition SHALL run entirely in the browser, and no QR payload, imported image or camera frame SHALL be sent to the server.

#### Scenario: Recognition runs offline
- **WHEN** the user decodes an image or camera frame while the page has no network access
- **THEN** recognition still completes because decoding happens locally

### Requirement: The standalone QR light app is removed

The light-app catalog SHALL NOT contain a QR-tools application, and no window id, window preset, host mapping or window component SHALL remain for it.

#### Scenario: Catalog no longer lists QR Tools
- **WHEN** the user opens the light-app center
- **THEN** the catalog lists the Web Toolbox and not a separate QR Tools application

#### Scenario: Removed code cannot open a window
- **WHEN** a QR-tools window open request is dispatched
- **THEN** no window is created and the remaining light apps continue to work

### Requirement: Persisted QR references migrate

Persisted light-app state and toolbox preferences that reference the removed QR application SHALL resolve to the Web Toolbox instead of becoming unusable entries.

#### Scenario: Persisted enabled code references the removed app
- **WHEN** stored light-app state has the removed QR code enabled
- **THEN** the normalized state enables the Web Toolbox and drops the removed code

#### Scenario: Persisted rail slot references the removed app
- **WHEN** a stored rail slot points at the removed QR code
- **THEN** the slot resolves to the Web Toolbox rather than being cleared or left dangling

#### Scenario: Persisted toolbox tool references the removed code
- **WHEN** the stored Web Toolbox active tool is the removed launcher code
- **THEN** the toolbox opens the QR generation tool
