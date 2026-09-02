## Purpose

Provide a secure, repeatable bridge that lets the vault owner edit in Obsidian, reuse the site's draw.io editor, and send notes plus local visual assets to the existing shizuki.site blog authoring workflow.

## ADDED Requirements

### Requirement: Secure site session
The plugin SHALL authenticate against the configured shizuki.site origin, SHALL keep passwords only for the duration of the sign-in request, and SHALL store reusable refresh credentials only through Obsidian SecretStorage. Access and refresh credentials MUST NOT be written to plugin data, vault notes, logs, or version-controlled files.

#### Scenario: Successful sign-in
- **WHEN** the user submits valid email and password credentials from the plugin sign-in dialog
- **THEN** the plugin verifies the resulting account, stores only the refresh credential in SecretStorage, keeps the access credential in memory, and shows the signed-in account identity

#### Scenario: Secure storage is unavailable
- **WHEN** SecretStorage encryption is unavailable
- **THEN** the plugin keeps credentials in memory for the current Obsidian session only and visibly warns that sign-in will not persist

#### Scenario: Expired access credential
- **WHEN** an authenticated API request receives an unauthorized response and a refresh credential exists
- **THEN** the plugin obtains a replacement access credential once and retries the original request once

### Requirement: Active note to post mapping
The plugin SHALL map the active Markdown note to the existing author post contract. It SHALL derive title, summary, category, slug, cover, visibility, groups, and tags from documented frontmatter keys with safe defaults, and SHALL send the note body as Markdown without its YAML frontmatter.

#### Scenario: Create a new draft
- **WHEN** the user invokes the draft upload command on a Markdown note without `shizuki_post_id`
- **THEN** the plugin creates one remote draft and writes the returned post id and synchronization status back to that note's frontmatter

#### Scenario: Update an existing draft
- **WHEN** the user invokes the draft upload command on a note with a valid `shizuki_post_id`
- **THEN** the plugin updates that remote post instead of creating a duplicate and refreshes the synchronization metadata in frontmatter

#### Scenario: Note is outside supported scope
- **WHEN** the active file is not Markdown or is under `00_Notion_Raw`
- **THEN** the plugin refuses publication without changing the file or sending its content

### Requirement: Explicit publication
The plugin SHALL expose distinct draft-upload and publish commands. The publish command SHALL upload the current note first, SHALL require an explicit confirmation before making it public, and SHALL publish only after the upload succeeds.

#### Scenario: One-command publication
- **WHEN** the user invokes publish, confirms the public action, and the note upload succeeds
- **THEN** the plugin publishes the resolved post and records the published status and time in note frontmatter

#### Scenario: User cancels publication
- **WHEN** the user declines the publication confirmation
- **THEN** the plugin does not call the publication endpoint and does not alter publication metadata

### Requirement: Local visual asset publishing
The plugin SHALL discover local Obsidian image embeds in wiki-link and Markdown syntax, upload supported images through the existing asset workflow, and replace the outgoing Markdown references with returned public URLs while leaving the local note body unchanged. Remote URLs SHALL remain unchanged.

#### Scenario: Standard local image embed
- **WHEN** a note embeds a local PNG, JPEG, WebP, or GIF
- **THEN** the plugin uploads the binary as a public blog inline image and substitutes the public asset URL only in the outgoing Markdown payload

#### Scenario: Draw.io SVG embed
- **WHEN** a note embeds a local `.drawio.svg` diagram
- **THEN** the plugin rasterizes the current diagram to PNG, uploads that PNG, and substitutes the public PNG URL in the outgoing Markdown payload

#### Scenario: Asset upload fails
- **WHEN** any required local visual asset cannot be resolved, converted, or uploaded
- **THEN** the plugin stops before creating or updating the post and reports the failing embed

### Requirement: Shared draw.io editor endpoint
The Obsidian draw.io integration SHALL use the same configurable diagrams.net editor origin as shizuki.site, defaulting to `https://embed.diagrams.net/`, and SHALL request a dark editor UI. Opening the editor MUST NOT depend on a locally downloaded webapp package.

#### Scenario: Open a diagram in Obsidian
- **WHEN** the user opens the draw.io editor or a `.drawio.svg` file
- **THEN** the iframe loads the configured shared editor endpoint with JSON embed protocol and dark UI parameters

#### Scenario: Shared endpoint is unavailable
- **WHEN** the configured editor endpoint cannot load
- **THEN** the integration presents a visible error instead of silently displaying the known local-server 404 state

### Requirement: Repeatable vault deployment
The repository SHALL provide a deterministic verification and deployment workflow that installs the plugin manifest, runtime, and styles in the target vault while preserving user notes and migrated raw Notion content.

#### Scenario: Deploy to the configured vault
- **WHEN** the deployment command is run for the target vault
- **THEN** it installs only the plugin-owned files, enables the plugin without disabling unrelated plugins, and passes an automated manifest/runtime/configuration check

#### Scenario: Protect migrated source content
- **WHEN** deployment and verification complete
- **THEN** no file under `00_Notion_Raw` has been modified

### Requirement: Neutral dark vault background
The deployed vault SHALL use Obsidian's dark base appearance with a neutral, low-saturation surface treatment instead of the existing green-heavy automatic wallpaper. The plugin SHALL let the user select or clear a local PNG, JPEG, WebP, or GIF background from `90-Assets/images/Backgrounds` without editing CSS or JSON manually.

#### Scenario: No custom background is selected
- **WHEN** the plugin loads without a valid selected background image
- **THEN** the vault uses an opaque neutral dark gradient with readable editor, sidebar, modal, and popover surfaces

#### Scenario: User selects a local background
- **WHEN** the user invokes the background chooser and selects a supported image from the background folder
- **THEN** the plugin applies that image behind the workspace with a dark overlay and persists only its vault-relative path

#### Scenario: User clears the background
- **WHEN** the user invokes the clear-background action
- **THEN** the image is removed and the neutral dark fallback is restored without deleting the image file
