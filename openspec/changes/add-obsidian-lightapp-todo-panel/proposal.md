## Why

Obsidian notes currently have no direct path into the shared shizuki.site Todo list, even though Meguri-Pet already uses that API. A dedicated Obsidian panel will let the same account manage tasks across both clients without maintaining a second Markdown-backed task store.

## What Changes

- Add a Todo sidebar and command to the existing Shizuki Site Publisher plugin.
- Reuse the existing shizuki.site login session to list, create, complete, and reopen light-app Todos.
- Preserve every Todo field when changing completion state, because the API treats updates as full upserts.
- Add a scoped deployment path that updates only this plugin in the configured Obsidian vault.

## Capabilities

### New Capabilities
- `obsidian-lightapp-todo`: Manage the shizuki.site light-app Todo list from an Obsidian panel.

### Modified Capabilities

## Impact

- `tools/obsidian-shizuki-publisher`: API client, sidebar UI, styling, plugin tests, package and manifest versions, and documentation.
- `tools/obsidian-shizuki-publisher/scripts`: add a plugin-only deployment path that leaves other vault settings and plugins unchanged.
- Uses existing authenticated endpoints under `/api/v1/light-apps/todos`; no site backend or Meguri-Pet change is required.
