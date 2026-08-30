## Purpose

Provide Meguri Pet with a discoverable, authenticated, and versioned local contract for observing and controlling safe Shizuki application capabilities.

## ADDED Requirements

### Requirement: Local clients can discover a running control endpoint
The desktop application SHALL write a current-user integration manifest containing the API version, loopback endpoint, process identity, and bearer credential needed by a trusted local client.

#### Scenario: Desktop host becomes ready
- **WHEN** the desktop host starts its control service successfully
- **THEN** it atomically publishes a manifest in its per-user application-data directory and reports the service as ready

#### Scenario: Desktop host exits
- **WHEN** the owning desktop process shuts down normally
- **THEN** its integration manifest is removed so clients do not treat a stale endpoint as available

### Requirement: Control traffic remains local and authenticated
The control service MUST bind only to a loopback address, MUST reject protected requests without the exact bearer credential, and MUST NOT provide an option to execute arbitrary JavaScript, shell commands, or filesystem operations.

#### Scenario: Unauthenticated client sends a command
- **WHEN** a request to a protected control endpoint omits or supplies an invalid bearer credential
- **THEN** the service returns an authentication error without dispatching the command

#### Scenario: Client connects through a non-loopback interface
- **WHEN** a remote network peer attempts to connect to the control service
- **THEN** no listener is available on that interface

#### Scenario: Client submits an unknown command
- **WHEN** an authenticated client submits a command name outside the advertised allowlist
- **THEN** the service returns a structured unsupported-command error and performs no renderer or native action

### Requirement: Clients can inspect versioned capabilities and state
The control service SHALL expose health, protocol version, supported command descriptors, and the latest application state using JSON responses with stable error codes.

#### Scenario: Meguri Pet checks compatibility
- **WHEN** an authenticated client requests the capability document
- **THEN** the response identifies the protocol version and each supported command with its payload contract

#### Scenario: Renderer has not reported state yet
- **WHEN** a client requests application state before the Vue renderer is ready
- **THEN** the response identifies the host as running and the renderer as not ready without inventing route or playback state

### Requirement: Clients can invoke safe semantic commands
The control service SHALL accept uniquely identified semantic commands for supported application navigation, window lifecycle, and music playback actions and SHALL return a correlated success or structured failure result.

#### Scenario: Client navigates to an allowlisted route
- **WHEN** an authenticated client submits a valid navigation command for an advertised Shizuki destination
- **THEN** the desktop renderer navigates to that destination and the correlated result reports success

#### Scenario: Client controls the desktop window
- **WHEN** an authenticated client submits a supported show, hide, focus, minimize, or toggle-visibility command
- **THEN** the desktop host performs the native action and returns the resulting window state

#### Scenario: Renderer command times out
- **WHEN** a semantic command requires the renderer and no correlated result arrives within the bounded timeout
- **THEN** the service returns a structured renderer-timeout error and remains available for later commands

### Requirement: Clients can observe state and command outcomes
The control service SHALL provide a resumable server-sent event stream for renderer readiness, application state changes, and command outcomes, with monotonically increasing event identifiers within a desktop process lifetime.

#### Scenario: Application route changes
- **WHEN** the Vue renderer reports a different current route
- **THEN** connected clients receive a state event containing the new route and a higher event identifier

#### Scenario: Client reconnects after interruption
- **WHEN** a client reconnects with the last accepted event identifier and buffered newer events still exist
- **THEN** the service replays the newer events in order before sending live updates
