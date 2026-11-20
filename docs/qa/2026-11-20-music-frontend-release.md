# Scoped frontend rollout

Production source baseline: `f2b3754f`. Local TimePrism styles: `e2211a50` (port of development `440b675f`). Frontend-only music/voice browse patch: `440b675f..a628adcb`, restricted to `fronted/vue3-merged`. Backend and schema remain unchanged; no Todo Workbench or MCP Token UI dependencies are introduced. Existing DJ static and native downloads and Folia assets must be preserved.

Exact candidate: Vite build succeeded, 165 targeted Vitest tests passed, and the same synthetic Edge playback fixture passed on standard desktop, mobile emulation, and the real embedded Folia Next control. Native playing delay on this fixture was 632→38 ms, 620→31 ms, and 628→41 ms respectively. No production timing claims. The local visual scope doesn't fix the older narrow-screen Todo floating window clipping.

The staged artifact should replace only the site entry HTML and add content-hashed assets that were not already present. At activation, compare the existing image and index hash to the manifest base, verify the rollback image is locally present, switch the frontend only, and re-read the public index, added JS/CSS, DJ package checksum, Folia entry and backend health.
