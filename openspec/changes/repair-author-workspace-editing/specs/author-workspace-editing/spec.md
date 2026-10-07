## Purpose

Connect the public author experience with its authorized content studio and preserve administrator intent throughout editing, saving and navigation.

## ADDED Requirements

### Requirement: Connected author navigation
The author page SHALL expose authorized management destinations alongside its public section navigation on desktop and compact screens. It MUST retain administrator and scoped permission filtering.

#### Scenario: Administrator enters a studio from the public page
- **WHEN** an authorized administrator selects the album or moment workspace in the author navigation
- **THEN** that workspace opens within the shared author shell and the public sections remain reachable

#### Scenario: Visitor browses public navigation
- **WHEN** a visitor or administrator without the required scoped permission views the author page
- **THEN** unauthorized studio destinations are absent

### Requirement: Reliable author drafts
The author and site editors SHALL load administrator data before allowing save, preserve edits against background public refreshes, and prevent concurrent save or upload actions. Destructive refresh, reset, close and navigation MUST require confirmation when a draft is dirty.

#### Scenario: Direct entry to site settings
- **WHEN** an administrator opens site settings directly
- **THEN** the form loads administrator values and exposes loading, failure and unsaved-change state

#### Scenario: Background refresh completes during editing
- **WHEN** an earlier public profile request completes after an administrator starts editing
- **THEN** the draft and the newer administrator profile are retained

#### Scenario: Unsaved editor is closed or replaced
- **WHEN** an administrator attempts to discard an unsaved draft and declines confirmation
- **THEN** the editor remains open with the draft intact

#### Scenario: Image upload is in progress
- **WHEN** an image upload or crop operation is active
- **THEN** save and actions which replace the draft are blocked until it completes

### Requirement: Intentional empty values survive saves
The author profile SHALL preserve explicitly empty optional strings and collections across save and reload. Default sample content SHALL be used only for absent or malformed values.

#### Scenario: Administrator clears optional content
- **WHEN** an administrator clears the signature, labels, images, links or journey and saves
- **THEN** reloading the profile keeps those fields empty

### Requirement: Content studio draft integrity
Album and moment editors SHALL retain unsaved text across photo mutations and warn before replacing a draft. Preview and publish SHALL require saved text so the displayed draft and server action agree. Failed mutations MUST preserve drafts and selection for retry.

#### Scenario: Photo operation follows a text edit
- **WHEN** an administrator edits the album title or moment body and performs a photo operation
- **THEN** the text draft survives the server response

#### Scenario: Draft is previewed or published
- **WHEN** a content editor has unsaved text
- **THEN** preview and publish are blocked with a visible instruction to save

#### Scenario: Administrator changes the selected content
- **WHEN** an administrator declines the discard confirmation while selecting another item or refreshing
- **THEN** the current item and edits remain unchanged

### Requirement: Appearance editor conflict protection
Quote and site-component editors SHALL preserve local drafts after version conflicts, protect refresh and navigation, and prevent overlapping saves. Approval and featured changes SHALL require a saved quote; configuration forms MUST load the matching administrator resource before allowing save.

#### Scenario: Quote or appearance save conflicts
- **WHEN** the server rejects a quote, location or login-appearance save with a version conflict
- **THEN** the editor retains local values and shows a conflict message without automatically replacing the draft

#### Scenario: Configuration read fails
- **WHEN** a site's configuration resource fails to load
- **THEN** saving that form is blocked while other successfully loaded configuration forms remain usable
