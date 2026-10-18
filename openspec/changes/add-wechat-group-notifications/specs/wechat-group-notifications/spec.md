## Purpose

Provide website members with explicit, revocable WeChat subscriptions for public updates by other members of their current website groups, delivered through an authenticated AstrBot bridge.

## ADDED Requirements

### Requirement: Verified private account binding
The system SHALL bind a logged-in website user through an expiring single-use code confirmed by an allowed AstrBot private-chat sender. It MUST reject expired/replayed codes, duplicate identities and group-chat origins, and MUST mask bound identities in website responses.

#### Scenario: Bind from the actual private sender
- **WHEN** a friend privately sends a valid website-generated code to the configured robot
- **THEN** only that event's platform and private sender are bound and the code cannot be reused

#### Scenario: Invalid or conflicting confirmation
- **WHEN** a code is expired, reused, submitted from a group, or the identity belongs to another account
- **THEN** binding is rejected without replacing another user's binding

### Requirement: Explicit group subscriptions and controls
The system SHALL default to no subscriptions and permit subscription only to the user's current active groups and article/moment types. It SHALL support global pause, Asia/Shanghai quiet hours, and unbinding from the website or bound private chat.

#### Scenario: Revoke delivery
- **WHEN** a user unsubscribes, pauses, leaves a group or unbinds before delivery authorization
- **THEN** queued notifications are withheld or cancelled according to current settings

### Requirement: Authorized publication reminders
The system SHALL capture new public article and moment publications durably, exclude the author, deduplicate by source and recipient, and verify current group overlap and public availability before sending. It MUST exclude drafts, private/unlisted content, deleted content and moments without a known creator.

#### Scenario: Public same-group update
- **WHEN** another member publishes public content in a subscribed group
- **THEN** the recipient receives a short reminder with the canonical reading link

#### Scenario: Withdrawn or restricted update
- **WHEN** queued content is withdrawn or no longer anonymously readable
- **THEN** no content title, summary or link is authorized for delivery

### Requirement: Authenticated recoverable bridge
The bridge SHALL require a configured secret and allowed platforms, operate with bounded expiring leases and retries, persist delivery outcomes, and avoid treating provider failure as successful delivery.

#### Scenario: Restart and retry
- **WHEN** the plugin restarts after recording a delivered message but before acknowledging it
- **THEN** it acknowledges the repeated delivery without sending it again

#### Scenario: Unauthorized bridge request
- **WHEN** the feature is disabled or bridge authentication fails
- **THEN** no binding or delivery operation is performed

### Requirement: Usable personal-center setup
The website SHALL show unavailable, unbound, pending, bound, empty, loading and error states, group/type choices and recent delivery outcomes on mobile and desktop.

#### Scenario: AstrBot has not been connected
- **WHEN** reminder configuration is incomplete
- **THEN** the website explains that reminders are unavailable and does not claim that WeChat is connected
