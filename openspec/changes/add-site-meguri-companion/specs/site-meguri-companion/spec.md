## Purpose

Give the site owner a consistent Meguri companion while browsing the website, reusing the authenticated character runtime and preserving clear account and browser capability boundaries.

## ADDED Requirements

### Requirement: Owner can use the companion across website pages
The website SHALL provide an ADMIN-only companion launcher on ordinary website pages and SHALL load the character/chat runtime only when the owner opens it. Minimizing SHALL retain the active runtime and show the loaded character when available. Ordinary route navigation SHALL retain the runtime.

#### Scenario: Owner opens and minimizes the companion
- **WHEN** an authenticated ADMIN opens the launcher and then minimizes the panel
- **THEN** the companion remains mounted and can be reopened with its conversation intact

#### Scenario: Owner navigates during a reply
- **WHEN** the owner navigates between ordinary website routes during a reply
- **THEN** the companion remains mounted and the stream continues

#### Scenario: Visitor or account change
- **WHEN** the account is unauthenticated, non-ADMIN, or changes identity
- **THEN** the previous owner's companion is unmounted and no prior character or conversation is shown

### Requirement: Home and AI Hub provide a consistent companion entry
The Home entry SHALL open Meguri. AI Hub SHALL support a companion deep link restricted to ADMIN and SHALL suppress the floating runtime while its own workspace is active to prevent duplicate session followers.

#### Scenario: Home entry
- **WHEN** an ADMIN activates Home's companion entry
- **THEN** the floating Meguri panel opens

#### Scenario: Full workspace handoff
- **WHEN** the owner chooses the full workspace action
- **THEN** AI Hub opens its Meguri mode and the floating runtime is unmounted

#### Scenario: Turn accepted after handoff
- **WHEN** a pending turn creation is accepted after the original stage was unmounted
- **THEN** the unchanged original account checkpoint records the accepted turn and a successor stage can resume it without starting a second turn

#### Scenario: Stream interruption
- **WHEN** the owner retries after a stream connection fails before a terminal event
- **THEN** the companion resumes the accepted turn instead of submitting the message twice

#### Scenario: Non-owner deep link
- **WHEN** a visitor opens AI Hub's Meguri deep link
- **THEN** the private companion does not mount

### Requirement: Connection states are actionable and input is composition safe
The companion SHALL distinguish a failed gateway request from a successfully disabled gateway, SHALL provide retry when Core is offline, and SHALL not send messages when Enter commits an IME composition.

#### Scenario: Gateway request fails
- **WHEN** the bootstrap request fails
- **THEN** the actual failure is visible with a retry action and is not represented as disabled configuration

#### Scenario: Core is offline
- **WHEN** bootstrap reports an enabled gateway with offline Core
- **THEN** sending is unavailable and a refresh action is visible

#### Scenario: Chinese input composition
- **WHEN** Enter is pressed while an input composition is in progress
- **THEN** no chat turn is submitted

### Requirement: Companion supports constrained viewports and focus use
Companion controls SHALL be keyboard accessible and the panel SHALL fit desktop and narrow website viewports. The floating surface SHALL hide during focus mode and on native mobile-shell routes.

#### Scenario: Narrow viewport
- **WHEN** the owner opens the companion on a narrow screen
- **THEN** the panel and close/minimize actions stay within the visible viewport

#### Scenario: Focus mode
- **WHEN** the owner enters focus mode
- **THEN** the companion surface hides without discarding its runtime
