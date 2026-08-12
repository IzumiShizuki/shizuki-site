## Purpose

Defines the desktop Home arrival experience as a wallpaper-first time stage with compact contextual actions and user-controlled motion, while keeping content routes visually independent.

## ADDED Requirements

### Requirement: Home uses time as its visual center
The desktop Home SHALL present a borderless central clock over the active wallpaper, with date and greeting as supporting information rather than enclosing the content in a dashboard card.

#### Scenario: Open desktop Home with clock enabled
- **WHEN** the user opens the desktop Home route and the effective clock preference is enabled
- **THEN** the current hour and minute are the dominant Home element
- **AND** the active wallpaper remains substantially visible around the time stage

#### Scenario: Hide the clock
- **WHEN** the effective clock preference for the active wallpaper is disabled
- **THEN** the central time and its supporting date are not rendered
- **AND** Home retains usable contextual islands and Menu access

### Requirement: Clock visibility supports global behavior and wallpaper overrides
The Home clock SHALL support a global visibility behavior and an optional override for the active wallpaper. Automatic global behavior SHALL show the clock for static wallpapers and hide it for dynamic wallpapers unless the active wallpaper has an explicit override.

#### Scenario: Dynamic wallpaper uses automatic behavior
- **WHEN** the global clock behavior is automatic, the active wallpaper is dynamic, and no wallpaper override exists
- **THEN** the Home clock is hidden

#### Scenario: Wallpaper override takes precedence
- **WHEN** the active wallpaper has an explicit show or hide override
- **THEN** that override determines Home clock visibility regardless of the global behavior

### Requirement: Home presents no more than three contextual islands
The desktop Home SHALL present a responsive row of no more than three compact contextual islands for music, Focus/Todo, and a time-aware reminder or next action.

#### Scenario: Contextual islands are available
- **WHEN** the user opens desktop Home outside an active Focus session
- **THEN** Home shows at most three islands
- **AND** each island exposes concise current state and a direct action

#### Scenario: Start Focus from the Focus island
- **WHEN** the user activates the Focus island while Focus is idle
- **THEN** the existing desk Focus preset starts without route navigation
- **AND** the existing Todo and Pomodoro light apps become the selected Focus windows

#### Scenario: Control active music from the music island
- **WHEN** a current music track exists and the user activates the music island
- **THEN** the existing player toggles playback without navigating away from Home

### Requirement: Home motion has three persisted intensities
Home SHALL offer vivid, calm, and off motion intensities, persist the selected intensity locally, and honor the operating system reduced-motion preference.

#### Scenario: Select calm motion
- **WHEN** the user selects calm motion
- **THEN** Home retains short state transitions while suppressing continuous ambient drift

#### Scenario: Select motion off or request reduced motion
- **WHEN** the user selects motion off or the operating system requests reduced motion
- **THEN** Home suppresses non-essential animation and animated transforms

### Requirement: Home color follows the active wallpaper with a manual override
Home SHALL use a representative color sampled from the active wallpaper as its preferred accent and SHALL allow the user to replace that sampled color with a manual Home accent. Dynamic and L2D wallpapers SHALL use their preview image as the representative frame.

#### Scenario: Automatically sample a static wallpaper
- **WHEN** Home color is automatic and a static wallpaper is active
- **THEN** the Home time stage and contextual islands use a representative color sampled from that wallpaper

#### Scenario: Automatically sample a dynamic wallpaper
- **WHEN** Home color is automatic and a dynamic or L2D wallpaper is active
- **THEN** the preview representative frame is used for Home color sampling

#### Scenario: Use a manual Home color
- **WHEN** the user selects manual color and chooses a valid color
- **THEN** the chosen color replaces automatic sampling on Home
- **AND** content routes retain their existing theme treatment

#### Scenario: Color sampling is unavailable
- **WHEN** the wallpaper image cannot be sampled
- **THEN** Home uses the current theme accent as a fallback
- **AND** the page remains usable without an error surface

### Requirement: Home appearance controls extend the existing Menu theme item
The existing Menu theme item SHALL open a secondary appearance panel containing the existing day/night choice and Home-only clock and motion controls when the current route is Home.

#### Scenario: Open appearance controls on Home
- **WHEN** the user activates the theme item from the expanded Menu on Home
- **THEN** a secondary panel exposes day/night, clock, current-wallpaper override, and three motion choices

#### Scenario: Open appearance controls on another route
- **WHEN** the user activates the theme item from the expanded Menu on a non-Home route
- **THEN** the day/night choice remains available
- **AND** Home-only clock and motion controls are not applied to that route

### Requirement: Home presentation remains route-contained
The centered time stage, contextual islands, and Home ambient motion SHALL apply only to the Home route.

#### Scenario: Navigate to Blog or another content route
- **WHEN** the user selects Blog or another existing route from Menu
- **THEN** navigation uses the existing route
- **AND** the destination retains its current content-first layout without the Home time stage or contextual islands

### Requirement: Focus retains only its selected productivity windows and levitation ball
While Focus is active, the normal Home time stage, contextual islands, and Menu SHALL be suppressed while the existing Focus controls, Focus-selected Todo and Pomodoro windows, and levitation ball remain available.

#### Scenario: Enter Focus from Home
- **WHEN** the user starts the desk Focus preset from Home
- **THEN** normal Home chrome is suppressed
- **AND** Todo, Pomodoro, explicit Focus controls, and the levitation ball remain available over the preserved wallpaper

### Requirement: Levitation ball remembers an edge-snapped desktop position
The desktop levitation ball SHALL start near the upper-middle right edge when no saved position exists, snap to the nearest left or right edge after dragging, and restore its saved edge and vertical position on a later visit.

#### Scenario: First desktop visit
- **WHEN** no saved levitation-ball position exists
- **THEN** the ball appears against the right edge in the upper-middle region

#### Scenario: Drag and release the ball
- **WHEN** the user drags the ball and releases it
- **THEN** the ball animates or moves to the nearest left or right edge
- **AND** the selected edge and vertical position are saved
