## Context

See `proposal.md` for motivation. The website already exposes authenticated post CRUD/publication APIs and a presigned-upload plus relay asset flow. Its board application and tests already standardize on `https://embed.diagrams.net/`. The installed Obsidian draw.io plugin instead serves a missing `webapp` directory on localhost; the reproducible result is HTTP 404, while its bundled downloader stalls before receiving any bytes.

Obsidian 1.13.7 exposes SecretStorage, vault/metadata APIs, commands, frontmatter processing, notices, and request utilities. The plugin is maintained with the site repository but deployed into a separate local vault. `00_Notion_Raw` is an immutable migration source area.

## Goals / Non-Goals

**Goals:**

- Keep the plugin deployable as a small, auditable Obsidian package with no runtime package installation.
- Reuse current website contracts and security semantics.
- Make repeated publishing idempotent per note and make asset failures fail before the post mutation.
- Share draw.io origin/protocol behavior between the site and Obsidian.
- Make installation and verification runnable from the repository.
- Keep the vault dark and readable while allowing a user-selected local background.

**Non-Goals:**

- Add a second blog API, database schema, or long-lived server API key.
- Implement bidirectional blog-to-vault synchronization or conflict merging.
- Publish arbitrary non-image attachments in this change.
- Make diagrams.net available offline.
- Modify migrated Notion raw exports.

## Decisions

### Decision: Keep modular CommonJS source and deploy one bundled runtime

The repository keeps `main.js` and pure `core.js` separate so helper behavior can be tested directly. Before deployment, the repository's already-installed esbuild produces `dist/main.js` with `obsidian` left external; the vault receives that single runtime plus its manifest and styles. This satisfies Obsidian's single-file community-plugin loader without introducing a new download or runtime dependency.

Alternative considered: deploy unbundled CommonJS files. Rejected after the runtime feedback loop proved that Obsidian's plugin loader does not resolve `require('./core')` from the plugin directory. TypeScript remains unnecessary for this bridge and can be adopted later without changing behavior.

### Decision: Reuse email/password token issuance and store refresh tokens in SecretStorage

Sign-in calls the existing `EMAIL_PASSWORD` grant. The password is held only in dialog/request memory. Access tokens remain in memory; refresh tokens use a stable SecretStorage id. If encrypted storage is unavailable, the session remains memory-only. Requests refresh at most once after a 401.

Alternative considered: a static publishing API token. Rejected because it would create a new server authentication path and encourage long-lived secrets in plugin settings. Capturing browser localStorage was rejected because it couples two Electron/browser security contexts.

### Decision: Treat frontmatter as the per-note synchronization record

Documented keys map directly to the existing post payload. `shizuki_post_id` selects update versus create; synchronization status/time are written only after remote success. YAML is stripped from outgoing Markdown so site metadata and body have one source each.

Alternative considered: a central plugin-side note/post map. Rejected because it becomes stale after note moves or vault synchronization and is harder for the user to inspect or repair.

### Decision: Complete asset preparation before post mutation

The publisher resolves all embeds, converts diagrams, uploads assets, and rewrites a payload copy before creating/updating a post. This avoids changing a remote post to partially rewritten Markdown. Local note Markdown is never rewritten. Existing public URLs pass through unchanged.

Direct presigned PUT is preferred. The relay endpoint is used only when direct PUT fails; the plugin constructs the multipart request explicitly so Obsidian's request utility can avoid renderer CORS restrictions.

### Decision: Rasterize `.drawio.svg` for blog delivery

The editable source remains in the vault. At publish time the current SVG is rendered through an image/canvas seam and uploaded as PNG, which the current media policy already accepts. This avoids broadening SVG upload policy and its active-content security surface.

Alternative considered: upload SVG directly. Rejected because the existing blog image contract intentionally allows only PNG/JPEG/WebP/GIF.

### Decision: Patch the installed draw.io adapter to accept a remote editor origin

The adapter's URL resolver will prefer an `editorUrl` setting and fall back to localhost only when it is absent. The deployed configuration sets the same diagrams.net origin used by the site and dark UI. Local server startup becomes conditional on a localhost editor origin. A verifier inspects the effective iframe URL/protocol flags and probes that URL.

Alternative considered: keep retrying the offline package download. Rejected because it is a separate large dependency, already stalls in this environment, and would not satisfy the requested shared editor connection. A standalone competing `.drawio` view was rejected because two plugins registering the same extension create ambiguous ownership.

### Decision: Own the background layer in the bridge plugin

The plugin adds a body class and a CSS custom property derived from a vault resource URL. A fuzzy chooser lists supported files only from `90-Assets/images/Backgrounds`; the persisted setting contains only the vault-relative file path. CSS supplies a neutral dark gradient fallback, a dark image overlay, and translucent-but-readable workspace surfaces. Obsidian's base mode is set to dark during deployment and the conflicting automatic background plugin is disabled.

Alternative considered: continue configuring two overlapping theme/background plugins. Rejected because their time-based theme and bundled forest treatments caused the green cast and made the final source of styles difficult to predict. A raw CSS path setting was rejected because it does not satisfy the requested in-app image choice.

## Risks / Trade-offs

- [Remote diagrams.net requires network availability] → Surface iframe load failures and keep the endpoint configurable for a future self-hosted mirror.
- [Vendor draw.io plugin updates can overwrite the adapter patch] → Keep the patch deterministic in the deploy script and verify the effective URL after every deployment.
- [Uploaded assets can be orphaned if a later post request fails] → Report the failure precisely; a future cleanup job can reconcile unattached assets without weakening the fail-before-post guarantee.
- [Refresh tokens are sensitive even in SecretStorage] → Never log or duplicate them, support explicit sign-out deletion, and fall back to memory-only when encryption is unavailable.
- [Frontmatter write succeeds after remote mutation could fail locally] → Report the remote post id in the error notice so the user can add `shizuki_post_id` manually and avoid duplicate creation.
- [Canvas rasterization can fail for malformed or externally-referencing SVG] → Fail the publication before post mutation and name the diagram that could not be converted.
- [Bright user images can reduce text contrast] → Apply a fixed dark overlay and keep primary editor/popover surfaces sufficiently opaque.

## Migration Plan

1. Run helper and plugin unit tests in the repository.
2. Deploy the plugin-owned package files to the target vault.
3. Apply the deterministic draw.io URL adapter patch and data setting.
4. Enable the new plugin while preserving all existing community-plugin ids.
5. Set the base appearance to dark, create the background folder, and disable only the conflicting automatic background plugin.
6. Reload the affected Obsidian plugins, then run draw.io URL/HTTP and plugin manifest/runtime verification.
7. Perform a local dry-run payload preview with a fixture note; do not publish live content without the user invoking the command.

Rollback restores the draw.io runtime backup, removes the new plugin id from the enabled list, and leaves notes, frontmatter, SecretStorage, and all unrelated plugins untouched. Plugin sign-out removes its SecretStorage entry.
