## 1. Dynamic M3E Palette Foundation

- [x] 1.1 Add the pinned Material color utility dependency and implement a focused HCT palette adapter for the four supported personalities and required semantic roles.
- [x] 1.2 Add unit tests for solid-seed schemes, dual-seed gradient role composition, supported-style normalization, and day/night foreground pairs.
- [x] 1.3 Extend `useUiPreferences` with persisted `paletteStyle`, legacy fallback, a setter, and `--m3-*` plus M3E shape/motion/state/elevation token emission while retaining existing aliases.
- [x] 1.4 Extend preference tests for immediate style application, persistence/restoration, legacy payload compatibility, both gradient endpoints, and semantic variable output.

## 2. Shared Color Studio and Atmosphere Shortcut

- [x] 2.1 Extract a reusable `ThemeColorStudio` with full and compact modes, live semantic preview, native selection semantics, visible focus, and responsive layout.
- [x] 2.2 Refactor `AppearanceSettingsContent` to host full mode without losing custom HEX, color-picker, or gradient editing behavior.
- [x] 2.3 Add a labeled `colors` destination to `AtmospherePanel` and mount compact mode so changes stay synchronized through the shared appearance state.
- [x] 2.4 Add or update component tests for full/compact synchronization, atmosphere-tab discoverability, control selection state, and narrow-layout hooks.

## 3. Expressive Blog Reading Surfaces

- [x] 3.1 Add shared blog M3E route tokens and a pointer-transparent ambient color field that is scoped to blog routes and becomes static under app or system reduced-motion preferences.
- [x] 3.2 Refine the blog list's page, featured article, cards, search, categories, metadata, empty/loading states, and keyboard states to consume semantic roles and preserve responsive behavior.
- [x] 3.3 Refine the blog reader's panels, article surface, table of contents, related content, progress control, metadata, and keyboard states to consume semantic roles without changing author/editor behavior.
- [x] 3.4 Add or update blog tests for route-scoped ambient hooks, semantic-state hooks, reader/list structure, and mobile-safe layout contracts.

## 4. Verification and Delivery

- [x] 4.1 Run focused tests, the full frontend unit suite, and the production build; resolve regressions and record any unrelated pre-existing failures.
- [x] 4.2 Inspect the local app in a browser at desktop and mobile widths across day/night, multiple palette personalities, the atmosphere color shortcut, keyboard focus, and reduced-motion states; correct visual defects.
- [x] 4.3 Run strict OpenSpec validation and final Git status review, update task checkboxes, and leave the change ready for archive after local commit.
