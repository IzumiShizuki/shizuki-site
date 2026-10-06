## Purpose

Allow Obsidian users to work with the same shizuki.site light-app Todo records used by other clients, so task changes remain available across devices and applications.

## ADDED Requirements

### Requirement: Browse shared Todos
The Obsidian plugin SHALL provide a dedicated panel that loads and displays Todos from the authenticated shizuki.site light-app Todo API. The panel SHALL provide a manual refresh action and SHALL show an actionable login state when no reusable website session is available.

#### Scenario: Load the shared list
- **WHEN** an authenticated user opens or refreshes the Todo panel
- **THEN** the plugin requests the current Todo list from shizuki.site and displays the returned records

#### Scenario: Open without a website session
- **WHEN** the user opens the Todo panel without a reusable website session
- **THEN** the panel explains that login is required and offers the existing website sign-in flow

#### Scenario: Load fails
- **WHEN** the Todo API request fails
- **THEN** the panel displays the failure and allows the user to retry without losing the current local view state

### Requirement: Create shared Todos
The Obsidian plugin SHALL let the user create a Todo in the shizuki.site light-app list with a required title and the API's default Todo values. It SHALL validate the title before sending the request and SHALL refresh the panel from the shared API after creation.

#### Scenario: Create a Todo
- **WHEN** the user submits a non-empty title within the API's 200-character limit
- **THEN** the plugin creates one shared Todo and shows the refreshed list

#### Scenario: Reject an invalid title
- **WHEN** the user submits an empty title or a title longer than 200 characters
- **THEN** the plugin keeps the input available and explains the valid title limit without sending a request

### Requirement: Change Todo completion state safely
The Obsidian plugin SHALL let the user mark a shared Todo complete or reopen it. Because the API update endpoint replaces the full Todo, the plugin SHALL preserve all existing fields, including project, timing, calendar, reminder, priority, detail, and ordering values. After a successful update, it SHALL refresh the shared list.

#### Scenario: Complete a Todo with reminders
- **WHEN** the user completes a Todo that has timing or reminder settings
- **THEN** the plugin updates its completion state while preserving those settings and displays the refreshed record

#### Scenario: Reopen a completed Todo
- **WHEN** the user reopens a completed Todo
- **THEN** the plugin updates its completion state to incomplete while preserving the rest of the Todo and displays the refreshed record

#### Scenario: Update fails
- **WHEN** the Todo update fails
- **THEN** the panel reports the failure and refreshes or retains the server-confirmed state instead of showing an unconfirmed completion change

### Requirement: Keep shizuki.site as the source of truth
The Obsidian Todo panel SHALL read and write the shizuki.site light-app Todo API as its source of truth and SHALL NOT mirror those tasks into Markdown checkboxes or maintain an independent local task store.

#### Scenario: Refresh after another client changes a Todo
- **WHEN** a Todo is changed by another shizuki.site client and the user refreshes the Obsidian panel
- **THEN** Obsidian displays the state returned by shizuki.site
