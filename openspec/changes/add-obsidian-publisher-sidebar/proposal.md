## Why

The Shizuki Obsidian publisher is currently driven primarily through the command palette, so publishing status and common actions are hidden while writing. A persistent left sidebar gives the author a faster, visible workflow without changing the site's publishing API or the existing safe draft-first behavior.

## What Changes

- Add an Obsidian left-sidebar publishing view that can be opened from a dedicated ribbon icon and command.
- Show the active note's title, category, visibility, asset count, and last synchronization state in the view.
- Expose sign-in/sign-out, payload preview, draft upload, and confirmed publication actions in one compact panel.
- Refresh the view when the active file, note metadata, authentication state, or synchronization result changes.
- Style the panel for the existing neutral dark and lavender vault theme with accessible focus and disabled states.

## Capabilities

### New Capabilities
- `obsidian-publisher-sidebar`: Persistent, context-aware Obsidian sidebar for operating and observing the Shizuki publishing workflow.

### Modified Capabilities

None.

## Impact

- Affects the first-party Obsidian plugin under `tools/obsidian-shizuki-publisher`, its bundled runtime, tests, deployment verification, and user documentation.
- Uses Obsidian workspace/view APIs and the plugin's existing API client and publishing methods; no shizuki.site backend API changes are required.
- The deployed Vault plugin receives the new view and styles while unrelated Vault content and repository work remain untouched.
