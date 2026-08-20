## Purpose

Define the desktop-specific navigation surfaces that keep the Shizuki home visible while opening large routes in one reusable application window and lightweight actions in a global control orb.

## ADDED Requirements

### Requirement: The desktop Menu is a compact dropdown launcher
The system SHALL display a compact Menu trigger only on the Shizuki desktop surface and SHALL reveal the full Shizuki route launcher only after explicit activation.

#### Scenario: User opens Menu on the desktop
- **WHEN** the user activates the desktop Menu trigger outside focus mode
- **THEN** a dropdown presents the available Shizuki routes and desktop controls without navigating the desktop surface away from Home

#### Scenario: Desktop Menu should not remain global
- **WHEN** the user works in another application or enters focus mode
- **THEN** the desktop Menu is not presented as an always-on-top control

### Requirement: Large routes use one reusable main window
The system SHALL keep the desktop surface on Home and SHALL open Blog, Music, Apps, AI Hub, Profile, Admin, and Author destinations in one reusable main application window.

#### Scenario: User selects a route from Menu
- **WHEN** the user selects an available large route
- **THEN** the main application window opens or restores on the active display and navigates to the selected route

#### Scenario: User selects another route
- **WHEN** the main application window is already open and the user selects another route
- **THEN** the existing window navigates and focuses instead of creating a second large route window

#### Scenario: User closes the main application window
- **WHEN** the user closes the reusable main window
- **THEN** that window hides while the desktop surface, global controls, and background services continue running

### Requirement: The global control orb has two explicit levels
The system SHALL provide an independently hosted global control orb whose first activation shows light applications and immediate controls and whose second activation of the orb itself shows Shizuki routes.

#### Scenario: User activates the collapsed orb
- **WHEN** the user clicks the collapsed orb
- **THEN** the first level displays light applications and immediate controls

#### Scenario: User activates the orb from the first level
- **WHEN** the first level is visible and the user clicks the orb body again
- **THEN** the second level replaces it with Shizuki route destinations

#### Scenario: User activates a first-level item
- **WHEN** the user chooses a light application or immediate control from the first level
- **THEN** the selected action executes without first navigating to the second level

#### Scenario: User dismisses the orb
- **WHEN** the user presses Escape or clicks outside the expanded orb
- **THEN** the orb returns to its collapsed state

### Requirement: Global controls respect full-screen work
The control orb SHALL remember its per-display edge position and SHALL automatically hide while an unrelated full-screen application is active unless the user has explicitly locked it visible.

#### Scenario: Full-screen application becomes active
- **WHEN** a non-Shizuki application covers an active display in full-screen mode
- **THEN** the orb on that display hides without terminating its state

#### Scenario: Full-screen application exits
- **WHEN** the display is no longer occupied by the full-screen application
- **THEN** the orb returns to its remembered edge position
