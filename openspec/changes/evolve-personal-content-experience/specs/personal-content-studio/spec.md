## Purpose

为站点管理员提供统一、分组清晰且具备真实服务端权限保护的内容工作台，使相册、动态、天气和一言可以安全预览、发布、排序、回收和维护。

## ADDED Requirements

### Requirement: The existing admin console exposes grouped navigation
The system SHALL organize the existing administration experience into understandable groups while keeping one authenticated administration shell rather than introducing a disconnected second console.

#### Scenario: Administrator opens the administration shell
- **WHEN** an administrator opens the existing administration route
- **THEN** the console visibly groups its eligible tools under System, Content, Site Appearance, and Feedback
- **AND** existing tools remain available under an appropriate group without changing their authorization boundary

#### Scenario: Administrator opens content management
- **WHEN** an administrator opens the content-management group
- **THEN** the console provides entries for existing blog management, photo albums, life moments, and daily quote curation

#### Scenario: Administrator opens site appearance
- **WHEN** an administrator opens the site-appearance group
- **THEN** the console provides entries for existing appearance settings together with site location, homepage module, and recommended-playlist configuration

#### Scenario: Administrator opens a dedicated workspace
- **WHEN** an administrator selects photo albums or life moments
- **THEN** the console opens a dedicated secondary workspace without flattening its upload, ordering, preview, and publication controls into the top-level navigation

#### Scenario: Unrelated administration data is slow or unavailable
- **WHEN** an administrator opens Albums, Moments, Recycle Bin, Daily Quotes, or Site Widgets while an unrelated legacy administration request is still pending or failing
- **THEN** the selected dedicated workspace becomes operable after the shared authorization check without waiting for unrelated administration data
- **AND** its own loading, error, empty, and retry states remain local to that workspace

### Requirement: Every studio surface is administrator-only
The system MUST require an authenticated administrator for every studio page, management read, preview, and mutation, and front-end visibility MUST NOT be treated as an authorization control.

#### Scenario: Unauthenticated caller requests administration
- **WHEN** an unauthenticated caller requests any personal-content administration API
- **THEN** the system returns `401 Unauthorized` and performs no read or mutation

#### Scenario: Authenticated non-administrator requests administration
- **WHEN** an authenticated caller without administrator authority requests any personal-content administration API
- **THEN** the system returns a real `403 Forbidden` response and performs no read or mutation

#### Scenario: Hidden menu is bypassed
- **WHEN** a non-administrator calls a known administration URL directly even though the menu entry is hidden
- **THEN** the server still rejects the request with `403 Forbidden`

### Requirement: Class-level and method-level authorization are equally enforced
The system MUST enforce administrator authorization whether the declared protection is applied to an entire controller or class or to an individual endpoint or method. Constraints from different dimensions, such as group membership and scoped permission, MUST be combined conjunctively; a method declaration MAY replace a class declaration only within the same annotation dimension.

#### Scenario: Non-administrator calls a class-protected endpoint
- **WHEN** an authenticated non-administrator calls an endpoint whose administrator requirement is declared at class scope
- **THEN** the endpoint returns `403 Forbidden` before its business operation executes

#### Scenario: Non-administrator calls a method-protected endpoint
- **WHEN** an authenticated non-administrator calls an endpoint whose administrator requirement is declared at method scope
- **THEN** the endpoint returns `403 Forbidden` before its business operation executes

#### Scenario: Administrator calls either protected form
- **WHEN** an authenticated administrator calls an otherwise valid class-protected or method-protected endpoint
- **THEN** authorization succeeds consistently for both declaration forms

#### Scenario: Method permission is combined with class administrator group
- **WHEN** a controller requires the administrator group at class scope and one method additionally requires a scoped permission
- **THEN** the caller must satisfy the administrator boundary and the effective permission rule
- **AND** a non-administrator cannot enter the method merely by holding that scoped permission

### Requirement: Album and moment workspaces support complete editorial workflows
The system SHALL let an administrator create drafts, edit content, reuse or upload managed photos, choose covers, order media, preview every visibility, publish, unpublish, change visibility, recycle, and restore albums and moments.

#### Scenario: Administrator previews a draft
- **WHEN** an administrator selects preview for a draft or private item
- **THEN** the preview renders the visitor presentation for that administrator without making the item visitor-accessible

#### Scenario: Administrator publishes valid content
- **WHEN** an administrator publishes a complete item whose required media is ready
- **THEN** the saved lifecycle and visibility become effective together and eligible visitor caches are invalidated

#### Scenario: Administrator publishes incomplete content
- **WHEN** required text, cover, visibility data, or media derivatives are missing or invalid
- **THEN** publication is rejected with actionable field or media errors and the draft remains non-public

### Requirement: Bulk upload and ordering expose truthful progress
The system SHALL show the processing state of every uploaded photo and MUST commit reorder operations atomically or reject them without a partial visible order.

#### Scenario: Batch contains mixed processing results
- **WHEN** some files in a batch finish processing and others fail
- **THEN** the workspace identifies each successful, pending, and failed file and prevents failed media from being silently published

#### Scenario: Concurrent reorder conflicts
- **WHEN** an administrator submits an order based on a stale content version
- **THEN** the system reports a conflict instead of silently overwriting a newer order

### Requirement: Widget configuration is managed in the studio
The system SHALL let administrators maintain the enabled site location, inspect weather freshness, curate local quotes, inspect the canonical daily quote, and request an explicit provider refresh.

#### Scenario: Administrator saves an invalid site location
- **WHEN** latitude, longitude, display name, or time zone is invalid
- **THEN** the studio rejects the configuration and preserves the last valid site location

#### Scenario: Administrator manually refreshes a provider
- **WHEN** an authorized administrator requests a weather or daily-quote refresh
- **THEN** the studio reports success, stale fallback, or failure truthfully without discarding a usable last-good snapshot
- **AND** a daily-quote refresh does not replace an already committed snapshot for the current date

### Requirement: Destructive actions are recoverable and explicit
The system SHALL make ordinary deletion a recoverable recycle operation and MUST require an explicit high-risk confirmation before permanently purging content or unreferenced originals.

#### Scenario: Administrator deletes an item normally
- **WHEN** an administrator uses the ordinary delete action on an album, moment, or photo
- **THEN** the item enters the recycle area and can be restored without re-uploading its retained assets

#### Scenario: Administrator requests permanent purge
- **WHEN** an administrator requests permanent purge without completing the required high-risk confirmation
- **THEN** the system refuses to remove content records or OSS objects

#### Scenario: Administrator requests purge before retention expires
- **WHEN** an administrator completes confirmation but any selected item has not reached its recorded purge-after time
- **THEN** the system refuses the purge and identifies the remaining retention condition

#### Scenario: Purge confirmation is replayed or changed
- **WHEN** a purge request presents an expired, previously used, differently scoped, or version-stale confirmation capability
- **THEN** the system refuses the purge and records the failed attempt without removing content or assets

#### Scenario: Referenced photo is selected for purge
- **WHEN** a confirmed purge includes a photo still referenced by non-purged content
- **THEN** the system retains the photo and identifies the blocking references

### Requirement: Studio mutations are auditable
The system MUST record the acting administrator, action, target, result, and time for publication, visibility, provider refresh, deletion, restoration, and purge mutations.

#### Scenario: Administrative mutation completes
- **WHEN** an administrator completes or attempts an audited studio mutation
- **THEN** an audit record captures the action and success or failure without recording secrets, signed media URLs, exact visitor coordinates, or raw provider credentials

### Requirement: Production starts without fictional life content
The system MUST migrate existing genuine author material where applicable and MUST NOT seed fictional albums, moments, photographs, weather readings, or quotes into production merely to populate the new workspaces.

#### Scenario: Studio opens before first publication
- **WHEN** an administrator has not created any album or moment
- **THEN** the workspaces show intentional onboarding, a concrete draft-creation action, and honest empty states while visitor surfaces remain free of demo life content
