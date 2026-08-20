## Purpose

Keep the desktop environment resident through tray-owned lifetime while ensuring every Windows mutation has a persisted recovery path for full exit, restart, and abnormal termination.

## ADDED Requirements

### Requirement: The tray owns desktop lifetime
The system SHALL keep desktop surfaces and background services running when user-facing windows close and SHALL expose explicit show, restore, and full-exit actions from a system tray control.

#### Scenario: User closes all visible Shizuki windows
- **WHEN** the user closes the main window and any lightweight windows
- **THEN** the desktop engine remains available through the tray and global control orb

#### Scenario: User chooses full exit
- **WHEN** the user invokes full exit from an authorized control
- **THEN** the system restores owned Windows mutations, removes transient discovery state, and terminates all Shizuki desktop processes

### Requirement: Desktop state is persisted atomically
The system SHALL atomically persist versioned local state for desktop settings, window placement, interaction mode, launch-at-login preference, and original Windows values needed for restoration.

#### Scenario: State is interrupted while writing
- **WHEN** the process terminates during a state update
- **THEN** the next launch reads either the previous complete state or the new complete state and never treats a partial document as authoritative

#### Scenario: Persisted state is invalid
- **WHEN** the local state document is malformed or from an unsupported future schema
- **THEN** the system preserves it for diagnosis, starts with safe defaults, and does not apply irreversible mutations

### Requirement: Unclean shutdown is recoverable
The system SHALL maintain a recovery journal before applying owned Windows mutations and SHALL reconcile unfinished entries before reapplying the selected desktop state on the next launch.

#### Scenario: Previous session ended uncleanly
- **WHEN** startup finds a journal entry without a clean-shutdown marker
- **THEN** the system restores the recorded original Windows values before creating new desktop surfaces

#### Scenario: Recovery cannot complete
- **WHEN** an original Windows value cannot be restored
- **THEN** the system enters safe mode, leaves further mutations disabled, and presents a diagnostic recovery action

### Requirement: Launch at login remains opt-in
The system SHALL expose an opt-in Windows login-launch setting, SHALL start with it disabled unless the user selected it during installation, and MUST NOT automatically begin audio playback at login.

#### Scenario: User enables launch at login
- **WHEN** the user enables the setting
- **THEN** Shizuki registers a per-user delayed login launch and reports the registered state

#### Scenario: Shizuki starts after login
- **WHEN** Windows launches Shizuki through the login registration
- **THEN** desktop surfaces and controls start without automatically playing music
