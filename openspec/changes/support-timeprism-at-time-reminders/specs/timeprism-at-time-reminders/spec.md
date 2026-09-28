## Purpose

Allow TimePrism users to choose a reminder at the exact start or deadline time and receive the usual in-app browser reminder when that time is reached.

## ADDED Requirements

### Requirement: Exact-time reminder configuration
The system SHALL accept and preserve a TimePrism reminder with `reminderEnabled` set to true, a reminder value of zero, and a matching reminder unit of `MINUTE`. A zero reminder value with any other unit SHALL be rejected as invalid reminder input.

#### Scenario: Save an exact deadline reminder
- **WHEN** an authenticated user creates or updates a TimePrism item with its deadline reminder set to zero minutes
- **THEN** the returned item retains `reminderEnabled: true`, `deadlineRemindValue: 0`, and `deadlineRemindUnit: "MINUTE"`

#### Scenario: Reject an ambiguous zero offset
- **WHEN** an authenticated user creates or updates a TimePrism item with a zero reminder value and a unit other than `MINUTE`
- **THEN** the request is rejected as invalid reminder configuration

### Requirement: Exact-time reminder selection
TimePrism editing interfaces for todos, tasks, and schedules SHALL offer a visible “准时” choice for each supported start or deadline reminder. Selecting it SHALL store a zero-minute reminder and SHALL remain selected when the item is edited again.

#### Scenario: Reopen an item configured for exact time
- **WHEN** a user opens an existing todo, task, or schedule whose supported reminder is zero minutes
- **THEN** its editing interface displays the reminder as “准时” rather than clearing the reminder value

### Requirement: Exact-time browser reminder delivery
The TimePrism browser reminder host SHALL treat a valid zero-minute reminder as due when its associated start or deadline is reached, using the same reminder card behavior as an advance reminder.

#### Scenario: Deadline is reached with a zero-minute reminder
- **WHEN** the reminder host evaluates an incomplete TimePrism item whose deadline reminder is zero minutes and whose deadline falls within the host's due window
- **THEN** the host displays one deadline reminder card for that item

#### Scenario: Start is reached with a zero-minute reminder
- **WHEN** the reminder host evaluates a TimePrism range item whose start reminder is zero minutes and whose start falls within the host's due window
- **THEN** the host displays one start reminder card for that item
