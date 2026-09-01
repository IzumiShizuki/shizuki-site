## Purpose

Defines a stable top-navigation contract and keeps user-selectable motion intensity safely scoped to the Home experience without affecting other routes.

## ADDED Requirements

### Requirement: Motion intensity is a Home-only appearance preference
The site SHALL offer immersive and soothing motion choices as part of Home appearance, SHALL default the choice to immersive, and SHALL apply the selected choice only to Home-owned visuals.

#### Scenario: Select soothing on Home
- **WHEN** a visitor selects the soothing option from Home appearance
- **THEN** Home-owned motion SHALL use the soothing treatment and the Home content SHALL remain rendered and interactive

#### Scenario: Navigate away after selecting soothing
- **WHEN** a visitor with soothing selected navigates from Home to another site route
- **THEN** the destination route SHALL render with the normal site motion behavior and SHALL NOT inherit the Home soothing mode

#### Scenario: No environment-driven override
- **WHEN** the site initializes on any device or operating-system motion preference
- **THEN** the stored Home choice SHALL remain authoritative and a first visit SHALL use immersive mode

### Requirement: Top navigation composition is route-stable
The site SHALL render the same primary and utility menu entries in the expanded top navigation on every ordinary desktop route.

#### Scenario: Navigate between Home and content routes
- **WHEN** a visitor moves between Home, Blog, Music, Apps, AI Hub, or personal-site routes
- **THEN** the expanded top navigation SHALL retain the same number and order of visible menu icon entries

#### Scenario: Open Home appearance
- **WHEN** a visitor activates the already-selected Home entry
- **THEN** the site SHALL open Home appearance controls from that entry without rendering a separate Home-settings icon in the top navigation

#### Scenario: Enter Home from another route
- **WHEN** a visitor activates the Home entry from a non-Home route
- **THEN** the site SHALL navigate to Home and SHALL keep the Home appearance controls available from the same Home entry

### Requirement: Existing motion choices migrate safely
The site SHALL preserve a valid previously stored immersive or soothing choice as the Home preference while preventing that legacy value from controlling the global application shell.

#### Scenario: Existing soothing preference
- **WHEN** a visitor has a valid legacy soothing preference stored before the update
- **THEN** Home SHALL retain soothing mode and all non-Home routes SHALL remain independently rendered

#### Scenario: Damaged preference
- **WHEN** a stored motion value is missing, damaged, or unknown
- **THEN** Home SHALL recover to immersive mode without preventing application rendering
