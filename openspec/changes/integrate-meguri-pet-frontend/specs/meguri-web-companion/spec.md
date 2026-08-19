## Purpose

Provide the site owner with a browser-native Meguri companion inside AI Hub that preserves the redesigned desktop character experience while respecting website authorization and browser capability boundaries.

## ADDED Requirements

### Requirement: The owner can enter Meguri companion mode from AI Hub
The AI Hub SHALL expose an “爱莉伴聊” primary mode to authenticated ADMIN users and MUST NOT expose that owner-only mode to other users.

#### Scenario: Administrator opens the companion
- **WHEN** an authenticated ADMIN activates “爱莉伴聊” in AI Hub
- **THEN** the AI Hub displays the Meguri character stage in its main workspace without navigating to a separate application

#### Scenario: Non-administrator visits AI Hub
- **WHEN** a user without the ADMIN group views AI Hub
- **THEN** the “爱莉伴聊” mode and its owner-only gateway interactions are not rendered

### Requirement: The web companion preserves the redesigned character-first composition
The companion SHALL present a central Meguri character, responsive motion/status feedback, a floating control island, and a compact conversation dock that can be shown, hidden, expanded, or collapsed without obscuring all character context.

#### Scenario: User expands conversation history
- **WHEN** the user expands the compact conversation dock
- **THEN** more message history becomes visible while the character stage and companion controls remain available

#### Scenario: Viewport becomes narrow
- **WHEN** the companion is displayed in a narrow browser workspace
- **THEN** the controls and conversation dock remain operable without horizontal overflow or unreachable actions

### Requirement: Character presentation follows canonical Meguri cues
The companion SHALL update its safe sprite, expression label, outfit, motion treatment, and speaking state from canonical Meguri events, and SHALL retain a safe presentation when a cue is incomplete or invalid.

#### Scenario: Canonical cue contains a resolved sprite
- **WHEN** a turn emits a valid expression or sprite cue
- **THEN** the stage transitions to the resolved authenticated sprite and reflects the associated expression, intensity, outfit, and motion

#### Scenario: User changes outfit
- **WHEN** the user selects one of the supported outfit codes
- **THEN** the stage requests the corresponding safe expression sprite while preserving the current expression and intensity

#### Scenario: Reduced motion is preferred
- **WHEN** the operating system requests reduced motion
- **THEN** character, dock, and control transitions are removed or substantially reduced while all state changes remain understandable

### Requirement: Website conversations use the existing owner-only canonical gateway
The companion MUST use the authenticated website gateway to create, stream, cancel, retry, and isolate Meguri turns, and SHALL preserve a valid local session identity across ordinary reloads.

#### Scenario: A reply streams successfully
- **WHEN** the owner sends a non-empty message and canonical events arrive
- **THEN** the companion immediately shows the owner message, incrementally renders the Meguri reply, and marks the reply complete on a terminal event

#### Scenario: A stream is interrupted
- **WHEN** the event stream disconnects before the terminal event
- **THEN** the companion reconnects from the last accepted sequence without duplicating accepted text or one-time presentation effects

#### Scenario: Owner starts a new conversation
- **WHEN** the owner activates the new-conversation control
- **THEN** the companion clears visible history, creates a distinct session identity, and does not mix subsequent events with the prior session

### Requirement: Browser controls reflect browser capabilities
The web companion SHALL expose only actions that the website can execute and MUST NOT present Electron-only operations as working browser controls.

#### Scenario: Companion controls are opened in the website
- **WHEN** the user expands the floating control island
- **THEN** it offers web-capable actions such as outfit selection, chat visibility, history expansion, refresh, and new conversation

#### Scenario: Desktop-only features remain external
- **WHEN** the website companion is rendered
- **THEN** always-on-top, click-through, native window movement, process exit, and local Everything file-search controls are absent
