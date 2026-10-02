## Context

See `proposal.md` for motivation. The Publisher plugin already owns the configured site origin, sign-in modal, and a token client that refreshes its access token from Obsidian SecretStorage. The site exposes authenticated list/create/full-update endpoints for ordinary light-app Todos. Meguri-Pet's client confirms the Todo response fields and the full payload required by `PUT`.

## Goals / Non-Goals

**Goals:**
- Add a Todo panel beside the existing publishing workflow and share its authenticated site session.
- Keep the API record authoritative across Obsidian, Meguri-Pet, and the site.
- Make completion toggles safe for Todos carrying reminder and scheduling settings.
- Allow a plugin-only update of the user's installed Publisher without touching other vault plugin or appearance settings.

**Non-Goals:**
- Synchronize Markdown checkboxes, create a local offline task database, delete Todos, or add recurring-rule management.
- Change shizuki.site APIs or modify Meguri-Pet.

## Decisions

1. **Register a separate Obsidian ItemView for Todos.** This keeps the existing publishing panel focused and lets users open Todo management independently through a ribbon icon and command. The view reuses the plugin's existing sign-in modal and `ShizukiApiClient`.
2. **Add Todo-specific normalizers and payload mapping.** API responses may use snake_case or camelCase. Normalize both forms, and construct the full update body from the current record before changing `done`; the backend's PUT operation is a full upsert. Keep the mapper pure and cover it with unit tests.
3. **Use server-confirmed refresh after writes.** Do not optimistically commit a checkbox state. On successful create or update, fetch the list again; on failure, report the error and retain or reload confirmed data.
4. **Provide a scoped deployment option.** The existing deploy script also mutates theme, plugin, and drawing-tool settings. Add a plugin-only mode that builds and copies Publisher-owned files and ensures the Publisher ID is enabled while preserving every other plugin ID and vault setting.

## Risks / Trade-offs

- **[The API update is a full upsert]** → Normalize and round-trip every supported Todo field; test fields likely to be lost, especially reminder and range timing values.
- **[The installed vault has unrelated user configuration]** → The plugin-only deployment path must not run appearance or drawing-tool setup and must preserve the community plugin list except for adding the Publisher ID if absent.
- **[Another client may change Todos while the panel is open]** → Provide manual refresh and reload after every successful write; no local cache is authoritative.

## Migration Plan

Build and test the updated plugin from the repository, then deploy only Publisher-owned plugin files to the configured vault. Preserve the existing Publisher settings, SecretStorage session, Notional installation, and all unrelated vault settings. Rollback consists of restoring the previous plugin-owned files; no server data migration is needed.
