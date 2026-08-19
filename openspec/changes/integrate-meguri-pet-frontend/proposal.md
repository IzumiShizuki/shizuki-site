## Why

The website already has an owner-only Meguri gateway and a functional but unmounted `MeguriPage`, while the redesigned `meguri-pet` frontend now provides the intended character-first stage, compact conversation dock, and control-island experience. Integrating that experience into AI Hub gives the redesigned frontend a real website entry point without duplicating the Electron-only host privileges.

## What Changes

- Add an ADMIN-only “爱莉伴聊” primary mode to AI Hub and render the website Meguri experience inside the existing workspace shell.
- Adapt the redesigned `desktop-meguri` visual composition for the browser: character-centered stage, warm glass chat dock, compact control island, status feedback, outfit selection, motion cues, and reduced-motion support.
- Preserve the existing owner-only website gateway, authenticated sprite delivery, canonical turn/SSE protocol, cancellation, reconnection, and persisted session identity.
- Keep Electron-only operations such as always-on-top, click-through, window movement, quitting, and Everything-based local file search in `meguri-pet`; the website only exposes controls it can actually perform.
- Add regression coverage for AI Hub visibility rules, stage controls, conversation behavior, and character presentation mapping.

## Capabilities

### New Capabilities

- `meguri-web-companion`: Provides an owner-only AI Hub entry and a browser-adapted Meguri character stage backed by the existing canonical Meguri gateway.

### Modified Capabilities

None.

## Impact

- Frontend pages and tests under `fronted/vue3-merged/src/pages`.
- Meguri presentation/event utilities under `fronted/vue3-merged/src/utils`.
- No backend API, authorization, dependency, deployment, or remote-service changes.
- The source design remains in `D:\program\meguri-pet\apps\desktop-meguri`; no files in that separate working tree are modified or copied wholesale.
