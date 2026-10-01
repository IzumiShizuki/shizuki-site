## 1. Diagnosis and behavioral baseline

- [x] 1.1 Record the accepted playback-only playlist correction and reproduce continuing input/playlist-return failures at real host/fork boundaries with failing regressions.
- [x] 1.2 Reload current production assets and record live selection, continued pointer/keyboard input and Escape behavior without relying on audio success alone.

## 2. Host workspace coordination

- [x] 2.1 Introduce a focused latest-request coordinator for complete playlist/song entry, source identity, active lifecycle and visual navigation.
- [x] 2.2 Make all Folia playlist entries replace the complete queue and play its first song; rename Folia browse actions and consume complete native collection intents.
- [x] 2.3 Preserve current-song immersive entry, wall selection and shortcut queue policies with correct selected index and stable queue identity.
- [x] 2.4 Restore ordinary playlist/current-queue context and compact the shared dock while preserving recovery, return and playback controls.

## 3. Embedded navigation and interaction

- [x] 3.1 Isolate embedded memory navigation from host history/hash and consume the additive source/navigation contract through one action boundary.
- [x] 3.2 Preserve current collection/queue return, dismiss the top layer once and gate inactive/stale embedded input.
- [x] 3.3 Preserve full native collection handoff and continuous mouse/keyboard operation after selection, clock updates and reentry.

## 4. Integration and validation

- [x] 4.1 Run behavioral host SFC/coordinator and actual fork navigation/bridge regressions, including standalone history and existing clock/color/controls.
- [x] 4.2 Run applicable type checks, builds and full site tests; document any established environment-only test limitation.
- [x] 4.3 Synchronize public fork source snapshots and AGPL patch; verify byte identity and clean patch application.
- [ ] 4.4 Perform strict OpenSpec validation in both repositories and independently validate the clean site release checkout.

## 5. Authorized delivery and acceptance

- [ ] 5.1 Commit and push relevant verified changes to the user's fork and site branches, integrating only this change into the site release branch.
- [ ] 5.2 Deploy both consumers to personal server 111.228.35.186 with clean Folia build context and preserved rollback artifacts.
- [ ] 5.3 Verify fresh production assets and P1→P2→song selection→continued input→Escape→ordinary return, plus pause/seek/color regressions.
- [ ] 5.4 Record evidence and remaining coverage limits, update tasks and commit delivery documentation with clean repository status.
