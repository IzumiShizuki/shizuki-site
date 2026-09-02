## Why

Obsidian is becoming the primary writing environment, but the current workflow cannot reliably open draw.io diagrams or publish notes and embedded media to shizuki.site. A first-party bridge removes manual copy/paste, keeps credentials out of plain-text plugin settings, and makes the existing website authoring APIs usable from the vault.

## What Changes

- Add a distributable Obsidian community plugin package for shizuki.site with ribbon and command-palette actions for sign-in, draft upload, and one-click publication.
- Map note frontmatter and Markdown to the existing shizuki.site author post contract, updating an existing post when the note already contains a remote post id.
- Upload local Markdown image embeds through the existing asset APIs and replace them with returned public URLs; render `.drawio.svg` embeds to PNG before upload.
- Store refresh credentials in Obsidian SecretStorage and keep passwords, access tokens, and refresh tokens out of plugin data and Git.
- Configure the Obsidian draw.io integration to use the same `https://embed.diagrams.net/` editor endpoint as shizuki.site, with a dark editor UI and no dependency on the stalled offline-client download.
- Replace the green-heavy vault treatment with a neutral dark appearance and provide an Obsidian command/settings control for choosing a local anime-style background image from a dedicated vault folder.
- Provide a repeatable deployment and verification workflow for installing the plugin into the target vault without modifying migrated raw Notion content.

## Capabilities

### New Capabilities

- `obsidian-publishing-bridge`: Secure Obsidian-to-shizuki.site draft/publication workflow, embedded-asset handling, draw.io interoperability, and vault deployment behavior.

### Modified Capabilities

None.

## Impact

- Adds a maintained plugin package under `tools/obsidian-shizuki-publisher` and OpenSpec artifacts under this change.
- Reuses existing `/api/v1/auth/tokens`, `/api/v1/me`, `/api/v1/me/posts`, post publication, asset policy, relay, asset creation, and download-url APIs; no server API or database migration is required.
- Deploys generated plugin files and configuration to `C:\Users\IzumiShizuki\Documents\Obsidian Vault\.obsidian\plugins` and adjusts the existing draw.io plugin configuration/runtime bundle.
- Adjusts Obsidian appearance, disables the conflicting automatic green wallpaper source, and adds a plugin-owned dark background layer whose selected image path remains local to the vault.
- Requires network access while signing in, publishing, or using the shared diagrams.net editor; existing vault notes remain local until the user invokes a publish command.
