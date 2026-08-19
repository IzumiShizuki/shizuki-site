## Purpose

Provide a locally installable Windows edition of Shizuki that preserves the existing website experience while adding safe native application lifecycle behavior.

## ADDED Requirements

### Requirement: Users can install and launch Shizuki as a desktop application
The system SHALL produce a Windows installer that installs and launches Shizuki without requiring the user to install Node.js or run development commands.

#### Scenario: User launches the installed application
- **WHEN** the user starts Shizuki from the installed shortcut
- **THEN** a desktop window opens the bundled Shizuki frontend and connects application data requests to the configured Shizuki gateway

#### Scenario: User starts a second instance
- **WHEN** Shizuki is already running and the user launches it again
- **THEN** the existing window is restored and focused instead of creating an independent second process

### Requirement: The desktop application preserves compatible web behavior
The desktop edition SHALL retain the website's routes, authentication flow, persisted browser data, media playback, and API-relative resource loading unless a native security boundary requires different handling.

#### Scenario: API returns a relative resource URL
- **WHEN** the bundled frontend requests an API or media resource using a relative `/api/` URL
- **THEN** the desktop host forwards the request to the configured remote gateway without exposing cross-origin restrictions to the renderer

#### Scenario: User follows an external link
- **WHEN** the bundled frontend opens a URL outside the Shizuki application origin
- **THEN** the URL opens in the user's default browser and does not replace the trusted desktop renderer

### Requirement: Desktop window preferences survive ordinary restarts
The desktop application SHALL persist valid window size, position, and maximized state in the current user's application-data directory and SHALL recover safely when saved bounds are no longer visible.

#### Scenario: User restarts after moving the window
- **WHEN** the user closes and later reopens Shizuki on a compatible display layout
- **THEN** the application restores the last usable window bounds and maximized state

#### Scenario: Saved display is unavailable
- **WHEN** persisted bounds do not intersect any active display
- **THEN** the application starts with centered default bounds on an available display

### Requirement: The renderer has no direct Node.js privileges
The desktop host MUST run the Vue renderer with context isolation enabled, Node integration disabled, and a narrowly scoped preload bridge.

#### Scenario: Frontend code accesses native features
- **WHEN** the bundled frontend needs desktop metadata or control-bridge functions
- **THEN** it can access only the explicitly exposed immutable preload API and cannot import Node.js or Electron modules

