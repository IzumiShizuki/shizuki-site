## Why

Folia can accept a song and produce audio while its embedded region stops responding and fails to reveal the corresponding playback surface. Its Escape/back navigation loses the active playlist because the host and embedded app do not share complete entry and return context.

## What Changes

- Unify music entry, playlist selection, song selection and return transitions around one authoritative playback session and explicit workspace context.
- A Folia playlist action always replaces the full shared queue and plays its first song, including P1 → P2. Rename the ordinary `Folia 浏览` action to `Folia 播放`; there is no separate Folia browse-only playlist operation.
- Keep wall playback in the current playlist wall with the selected poster expanded; explicit immersive entry reveals the full song player.
- Escape/back closes the top interaction layer and returns song playback to the current playlist inside Folia, preserving mode, queue, playback and usable interaction.
- Isolate embedded navigation from the main-site URL/history, retain full native collection selection context, and prevent hidden views/stale asynchronous transitions from changing the active surface.
- Reconcile ordinary return context and present the ordinary dock compactly in Folia while preserving shared controls.
- Add behavioral red/green regressions and production acceptance for continuing mouse/keyboard operation after selection, not only successful audio resolution.

## Capabilities

### New Capabilities
- `music-workspace-navigation`: Complete playlist/song entry, embedded return, interaction availability and lifecycle consistency between ordinary music and Folia.

### Modified Capabilities
None. Earlier unarchived Folia changes remain historical; this change records the newly aligned workspace contract and the explicit playback-only playlist correction.

## Impact

- Main Vue music workspace coordinator, playlist/player entries, shared queue/source identity and dock presentation.
- User-owned Folia fork: external bridge, navigation/controller seams, queue selection context, wall focus and Escape handling; existing standalone navigation remains supported.
- Site snapshots/public AGPL patch and fork-local OpenSpec change `embedded-workspace-navigation`.
- Existing APIs/authorization are reused. No middleware ownership or provider-permission change. Authorized delivery targets are the user's GitHub repositories and personal server `111.228.35.186`.
