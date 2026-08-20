## Purpose

Provide a safe, read-only path for light-app users to discover community tools from the KJ application source and run compatible selections without granting third-party code access to the Shizuki page context.

## ADDED Requirements

### Requirement: KJ source is available as a light app
The light-app catalog SHALL include a KJ tool-source application that can be enabled, opened in a floating window, and opened in page mode using the existing light-app controls.

#### Scenario: User opens the source from the catalog
- **WHEN** a user selects the KJ tool-source application from the light-app center
- **THEN** the source opens through the same floating-window or page-mode shell used by bundled light apps

### Requirement: Browse and search the remote catalog
The KJ tool source SHALL let guests and signed-in users load, refresh, search, and filter the normalized public KJ application catalog without requiring a KJ account.

#### Scenario: Catalog loads successfully
- **WHEN** the KJ source is enabled and its upstream catalog responds with valid data
- **THEN** the source displays normalized tool name, description, author, category, type, version, download count, and compatibility state

#### Scenario: User searches and filters
- **WHEN** the user enters a search term or chooses a category
- **THEN** the displayed catalog is restricted to matching normalized tools without making the existing bundled light-app catalog unavailable

#### Scenario: Catalog is empty
- **WHEN** the upstream catalog returns no tools matching the active search and category
- **THEN** the source displays an empty-result state and keeps the search and filter controls usable

### Requirement: Fixed read-only upstream access
The backend SHALL expose only read operations for the configured KJ application-community source, SHALL construct upstream requests from known actions, and SHALL reject invalid tool identifiers rather than accepting a client-supplied upstream URL.

#### Scenario: Client lists tools
- **WHEN** a client requests the KJ catalog endpoint
- **THEN** the backend requests the configured KJ `apps` action and returns a bounded normalized response

#### Scenario: Client gets one compatible tool
- **WHEN** a client requests a valid tool identifier
- **THEN** the backend requests the configured KJ `app_detail` action and returns only normalized metadata and the compatible website or document payload

#### Scenario: Client submits an invalid identifier
- **WHEN** a requested tool identifier contains unsupported characters or exceeds the allowed length
- **THEN** the backend rejects the request before contacting the upstream source

### Requirement: Compatible tool acquisition
The source SHALL allow a user to acquire and open KJ website, code, and supported widget tools, and SHALL identify unsupported KJ application types without attempting to execute them.

#### Scenario: User acquires a document tool
- **WHEN** the user chooses a compatible code or widget tool
- **THEN** the source obtains its normalized document payload and opens it in the source preview area

#### Scenario: User acquires a website tool
- **WHEN** the user chooses a compatible website tool with a valid HTTP or HTTPS URL
- **THEN** the source opens the website in the isolated preview area and offers an explicit external-open action

#### Scenario: Tool type is unsupported
- **WHEN** the catalog entry represents a theme, Python plugin, mini program, or another unsupported type
- **THEN** the source disables acquisition for that entry and explains that the type cannot run in Shizuki

### Requirement: Third-party execution isolation
KJ-supplied HTML, CSS, JavaScript, and websites MUST run in a sandboxed frame without same-origin permission, and the interface SHALL identify the content as third-party before or while it runs.

#### Scenario: Document tool executes
- **WHEN** a compatible document payload is opened
- **THEN** it executes inside a sandbox that cannot read the Shizuki DOM, cookies, local storage, authentication state, or JavaScript objects

#### Scenario: Tool attempts top-level access
- **WHEN** third-party code attempts to access or navigate the Shizuki page context
- **THEN** the browser sandbox blocks the attempt while the light-app shell remains usable

### Requirement: Non-destructive failure handling
The KJ source SHALL expose disabled, timeout, malformed-response, not-found, and upstream-error states as retryable source errors without affecting other light apps.

#### Scenario: Source is disabled
- **WHEN** the server configuration disables the KJ source
- **THEN** the source displays an unavailable message and no upstream request is made

#### Scenario: Upstream request fails
- **WHEN** the KJ source times out, rejects the request, or returns malformed data
- **THEN** the source displays a retry action and all bundled light apps continue to open normally

#### Scenario: Selected tool disappears
- **WHEN** a catalog tool is removed before its detail is requested
- **THEN** the source reports that the tool is unavailable and returns the user to the catalog without executing partial content
