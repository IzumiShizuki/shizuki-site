## 1. Focus State and Contracts

- [x] 1.1 Add the shared frontend Focus session state, lifecycle actions, local preset catalog, current-task normalization, and test reset helper.
- [x] 1.2 Add unit tests for idle/active/exit transitions, preset resolution, task selection, and explicit completion intent state.

## 2. App Shell Focus Mode

- [x] 2.1 Add the persistent Focus mode chrome with elapsed time, current-task summary, explicit completion action, and exit action.
- [x] 2.2 Wire App Shell visibility to Focus state so TopMenu and unrelated AI shell controls are suppressed while Focus is active.
- [x] 2.3 Preserve global player, lyric, ambient, clock, and visualizer behavior during Focus, including Music-route suppression overrides.

## 3. Light-App Runtime Policy

- [x] 3.1 Extend light-app window visibility resolution with an explicit Focus mode and app-code allow-list while preserving normal Home and non-Home behavior.
- [x] 3.2 Open the selected preset apps through the existing light-app shell store when Focus starts and pass Focus visibility inputs to the window host.
- [x] 3.3 Add runtime and shell-store tests proving that Focus shows selected apps, hides unrelated windows, and leaves normal visibility behavior unchanged.

## 4. Home Workspace and Todo Bridge

- [x] 4.1 Reorder Home actions around Focus, Music, Blog, and AI, remove Apps from the Home quick links, and retain the existing home-room visual language.
- [x] 4.2 Add a concise Focus/current-task status summary on Home and wire the primary action to start the default Focus preset without changing the route.
- [x] 4.3 Extend the TimePrism focus-item event path to update shared Focus task context and add an explicit completion event consumed by TodoWindow.
- [x] 4.4 Add Home and Todo integration tests for Focus entry, current-task display, explicit completion, and exit without completion.

## 5. Verification and Handoff

- [x] 5.1 Run OpenSpec validation and confirm all change artifacts are complete.
- [x] 5.2 Run the frontend unit test suite and production build; fix regressions introduced by the change.
- [x] 5.3 Perform a desktop browser smoke check for Home entry, Focus chrome, preset windows, preserved player/environment, exit, and responsive/reduced-motion behavior.
