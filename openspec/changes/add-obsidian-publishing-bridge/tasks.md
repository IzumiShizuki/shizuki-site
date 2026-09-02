## 1. Plugin Package and Pure Helpers

- [x] 1.1 Create the Obsidian plugin manifest, runtime package structure, default settings, and user-facing documentation under `tools/obsidian-shizuki-publisher`.
- [x] 1.2 Implement and test pure helpers for YAML stripping, frontmatter-to-post payload mapping, supported embed discovery, and API response normalization.

## 2. Secure Session and Publishing Workflow

- [x] 2.1 Implement email/password sign-in, current-account verification, SecretStorage refresh-token persistence, one-retry refresh handling, and sign-out.
- [x] 2.2 Implement active-note validation, create-versus-update draft upload, remote metadata frontmatter updates, progress/error notices, and a payload-preview command.
- [x] 2.3 Implement explicit-confirmation publication after successful upload and record publication status/time without publishing during automated tests or deployment.

## 3. Visual Asset and Draw.io Interoperability

- [x] 3.1 Implement local wiki/Markdown image resolution, presigned/relay asset upload, outgoing-only Markdown URL substitution, and fail-before-post behavior.
- [x] 3.2 Implement `.drawio.svg` to PNG rasterization and test the asset rewrite seam with deterministic conversion/upload doubles.
- [x] 3.3 Add and test a deterministic draw.io adapter patch that uses the configured shared diagrams.net origin, dark JSON embed parameters, and conditional local-server startup.

## 4. Dark Appearance and Background Choice

- [x] 4.1 Implement the neutral dark CSS treatment, image overlay, supported background-folder chooser, persisted vault-relative selection, and clear-background action.
- [x] 4.2 Configure the target vault for dark base appearance, create `90-Assets/images/Backgrounds`, and disable only the conflicting automatic background plugin.

## 5. Deployment and Verification

- [x] 5.1 Add deterministic PowerShell deployment and verification scripts that copy only plugin-owned files, preserve enabled plugin ids, protect `00_Notion_Raw`, and verify runtime/configuration state.
- [x] 5.2 Run unit tests, deploy to the target vault, reload the affected plugins, and verify the shared draw.io editor, publisher commands, dark fallback, and background chooser.
- [x] 5.3 Run OpenSpec strict validation, inspect repository/vault diffs for unrelated changes or secrets, and create a scoped local commit.
