## 1. Todo API Contract

- [x] 1.1 Add Todo response normalization and full-update payload mapping that preserve all server fields.
- [x] 1.2 Add unit coverage for snake_case/camelCase normalization and reminder/timing field preservation.

## 2. Obsidian Todo Panel

- [x] 2.1 Add authenticated API methods for listing, creating, and updating light-app Todos.
- [x] 2.2 Register a dedicated Todo sidebar, ribbon action, command, shared-session login state, and refresh lifecycle.
- [x] 2.3 Implement Todo list, pending/completed state, title-only create form, safe completion toggle, refresh, and error/loading/empty states.
- [x] 2.4 Add Todo panel styling and update plugin version and README documentation.

## 3. Safe Deployment and Verification

- [x] 3.1 Add a plugin-only deploy path that preserves unrelated vault settings and plugins.
- [x] 3.2 Run plugin unit tests, build, syntax checks, and strict OpenSpec validation.
- [x] 3.3 Deploy only Publisher-owned files to the user's vault, reload the plugin, and confirm the Todo command/view is registered.
