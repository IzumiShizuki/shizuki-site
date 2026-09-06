## Purpose

Provide a persistent, context-aware workspace surface that lets an Obsidian author inspect and operate the Shizuki publishing workflow without repeatedly opening the command palette.

## ADDED Requirements

### Requirement: Publisher sidebar availability
The plugin SHALL register a dedicated Shizuki publishing view that users can open in the left sidebar from both a ribbon control and a command.

#### Scenario: Open the publisher view
- **WHEN** the user activates the Shizuki publishing ribbon control or the open-sidebar command
- **THEN** the publishing view is revealed in the left sidebar and receives focus

#### Scenario: Reuse an existing publisher view
- **WHEN** the publishing view is already open and the user activates its ribbon control or command again
- **THEN** the existing view is revealed instead of creating duplicate sidebar panes

### Requirement: Context-aware note summary
The sidebar SHALL display the active Markdown note's title, publishing category, visibility, visual asset count, remote post identity when present, and last synchronization state.

#### Scenario: Publishable note is active
- **WHEN** an eligible Markdown note becomes active or its metadata changes
- **THEN** the sidebar displays its current mapped publishing details and enables note actions

#### Scenario: No publishable note is active
- **WHEN** there is no active Markdown note or the active note belongs to `00_Notion_Raw`
- **THEN** the sidebar explains why publishing is unavailable and disables note actions

### Requirement: Publishing actions in one panel
The sidebar SHALL provide controls for payload preview, draft upload, and confirmed publication using the same validation, asset handling, and API workflow as the existing commands.

#### Scenario: Upload a draft from the sidebar
- **WHEN** an authenticated user selects the draft action for an eligible active note
- **THEN** the plugin uploads or updates the note as a draft and refreshes the sidebar synchronization state

#### Scenario: Publish from the sidebar
- **WHEN** an authenticated user selects the publish action for an eligible active note
- **THEN** the plugin requests explicit confirmation before uploading and publishing the latest content

#### Scenario: Action is running
- **WHEN** a sidebar publishing action is in progress
- **THEN** the panel communicates the busy state and prevents duplicate action submission

### Requirement: Session controls and status
The sidebar SHALL show whether a reusable site session is available and provide the appropriate sign-in or sign-out control without exposing credentials.

#### Scenario: User is signed out
- **WHEN** no access or refresh token is available
- **THEN** the sidebar shows a signed-out state and offers the existing secure sign-in flow

#### Scenario: User has a reusable session
- **WHEN** an access token, refresh token, or loaded account is available
- **THEN** the sidebar shows a connected state and offers sign-out

### Requirement: Live sidebar refresh
The sidebar SHALL refresh when the active file changes, relevant note metadata changes, the workspace layout changes, authentication changes, or a publishing operation completes.

#### Scenario: Switch active note
- **WHEN** the user activates a different file
- **THEN** the sidebar updates to represent the newly active file without requiring the view to be reopened

#### Scenario: Edit frontmatter
- **WHEN** publishing-related metadata on the active note changes
- **THEN** the sidebar updates its displayed values and synchronization status

### Requirement: Theme-compatible interaction
The sidebar SHALL remain readable in the configured neutral dark Vault theme and expose visible hover, keyboard-focus, disabled, success, and error states.

#### Scenario: Keyboard navigation
- **WHEN** a keyboard user tabs through the sidebar controls
- **THEN** each actionable control exposes a visible focus indicator and a descriptive accessible label

#### Scenario: Reduced motion preference
- **WHEN** the operating environment requests reduced motion
- **THEN** non-essential sidebar transitions and status animation are disabled
