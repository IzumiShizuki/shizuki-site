## Purpose

Provide a reversible Windows 11 desktop surface that presents the Shizuki home experience beneath Explorer desktop icons without replacing the Explorer shell or trapping normal desktop input.

## ADDED Requirements

### Requirement: Shizuki runs as an Explorer-compatible desktop surface
The system SHALL host the Shizuki home experience beneath the Explorer desktop-icon view on every active display and MUST leave Explorer as the registered Windows shell.

#### Scenario: Desktop engine starts normally
- **WHEN** the packaged desktop engine starts and the Windows desktop host is available
- **THEN** each active display receives a Shizuki home surface beneath Explorer desktop icons without opening a taskbar entry for that surface

#### Scenario: Native desktop attachment is unavailable
- **WHEN** the Windows desktop host cannot be located or native attachment fails
- **THEN** the system leaves Explorer unchanged, records the failure, and offers the home surface in a normal recoverable window

#### Scenario: Explorer restarts
- **WHEN** Explorer recreates its desktop host while Shizuki remains running
- **THEN** the system detects the stale attachment and reattaches the desktop surfaces without duplicating them

### Requirement: Desktop icon visibility is reversible
The system SHALL allow users to show or hide Explorer desktop icons, SHALL default to hidden after the desktop experience is enabled, and MUST remember the pre-Shizuki visibility state for restoration.

#### Scenario: User hides desktop icons
- **WHEN** the user enables the Shizuki clean-desktop setting
- **THEN** Explorer desktop icons become hidden while the desktop host and native blank-area behavior remain available

#### Scenario: User requests original desktop
- **WHEN** the user disables the clean-desktop setting or invokes desktop restoration
- **THEN** Explorer desktop icons return to the visibility state captured before Shizuki changed them

### Requirement: Normal and edit interaction modes remain distinct
The system SHALL provide a normal mode in which blank desktop regions pass pointer input to Explorer and an explicit edit mode in which Shizuki captures input for arranging desktop components.

#### Scenario: User clicks a blank region in normal mode
- **WHEN** no Shizuki interactive component is under the pointer and edit mode is inactive
- **THEN** the pointer event reaches the native desktop instead of being consumed by the Shizuki surface

#### Scenario: User enters edit mode
- **WHEN** edit mode is activated from an authorized Shizuki control
- **THEN** the active desktop surface captures pointer input and exposes component-layout controls until edit mode is exited

### Requirement: Display topology changes are handled safely
The system SHALL track active displays by stable local descriptors, SHALL resize or recreate desktop surfaces after topology changes, and SHALL keep controls reachable on an available display.

#### Scenario: A display is connected
- **WHEN** Windows reports a newly active display
- **THEN** the system creates and attaches a desktop surface for it using a safe default layout

#### Scenario: A display is removed
- **WHEN** a display hosting a Shizuki control is disconnected
- **THEN** the system removes its desktop surface and moves global controls to a remaining display
