# Corrected Folia presentation diagnosis, 2026-10-02

## Actual browser feedback

The signed-in ordinary playlist IzumiShizuki喜欢的音乐 shows 300 rendered / 1000 loaded / 2238 total. The initial current song was entry 869, absent from the rendered window. Through the actual Folia toolbar, selected entry 450 夏がくれた贈り物 · yozuca*, paused at 00:14, returned through 返回音乐库: the ordinary dock has that song, but none of the 300 playlist rows contains it or is active. Saved baseline: `.codex-tmp/folia-color-list-before.jpg`.

The real committed picker fill #e43b57 updates input, bridge-root CSS and the current marked DOM word's computed color to rgb(228, 59, 87). This rules out a universal bridge failure in this renderer. It does not cover live input before confirmation or other full-player renderers.

## Ranked predictions shown before solution testing

1. Missing input handler: input-only changes leave preference unchanged; adding the same validated action to input should update it before commitment.
2. Partial renderer consumption: root CSS updates but the shared full renderer theme remains white; a shared primary theme consumer should change it without changing subtitles/backgrounds.
3. Initial 300-row window: the authoritative current song already reaches the ordinary dock but its row is absent; expanding to the exact entry and revealing it should fix the visible mismatch.
4. Full-queue/source handoff: if it is still faulty, native playlist replacement would retain the old profile/queue on return; mounted full-replacement tests distinguish that from window/scroll presentation.

## Independent mounted RED runs

From fronted/vue3-merged, installed Node invokes `node_modules/vitest/vitest.mjs run src/pages/MusicLibraryPage.sourceSync.integration.spec.js src/pages/music/MusicPlaylistDetailView.queue.spec.js src/components/music/MusicLibraryDock.queue.spec.js --maxWorkers=1 --minWorkers=1`: 3 files failed, 4 tests failed / 21 passed, 5.94s. Failures: active compact dock exists; input-only color storage is null; two duplicate queue rows are active; exact entry 870 is absent. Other source/full-queue handoff checks pass. Log `.codex-tmp/folia-color-host-red.log`.

In the full fork, installed Node invokes `node_modules/vitest/vitest.mjs run -c vitest.config.ts test/unit/embeddedPlayerLyricColor.integration.test.ts --maxWorkers=1`: one failure, 5.32s. Real bridge root has #e43b57; mounted shared renderer model primary remains #ffffff. Log `.codex-tmp/folia-color-fork-red.log`.

The compact-dock assertion from the previous delivery was a mistaken presentation requirement. It is replaced by the user's explicit single-Folia-transport requirement. Playback ownership/navigation remain regression constraints.

## Resolved causes and implementation

The host lacked `input` handling and the full renderer forwarded only the original theme. The host now validates and persists both events through one deduplicated action; the fork consumes the discrete preference at its shared renderer boundary, including primary/accent/keyword-derived lyric colors, with separate original subtitle/background themes. Reset reads the current theme and subscriptions clean up on unmount.

The added host compact dock was an incorrect presentation choice; it is removed from active Folia. The shared host audio session is retained and native controls remain the Folia transport.

The real large site playlist's authoritative queue already changed correctly. Its initial rendered window hid the current song. Ordinary playlist/current-queue views now expand through the current entry and reveal it on return/list activation; overlays use exact queue-entry identity before provider fallback. An explicit return token handles the still-mounted same-route playlist; paging continues forward from the expanded window and playback-clock updates do not force scrolling.

Independent root GREEN: 4 mounted host files / 29 tests and 3 existing navigation/lyrics/coordinator files / 34 tests pass. Luna's final full host run: 251 files / 1512 tests; production build passes. Full renderer follow-up review also checks non-lyric backgrounds before delivery. Deployment and signed-in acceptance remain pending in tasks.md until verified.

The clean release's independent full run passed 1512 assertions but exited 1: a previously loaded entry with an empty embed root left `waitForFoliaMount` polling after unmount, then accessed the torn-down document. Failing only unresolved scripts in fixture cleanup did not cover this state. The scoped mount wait now clears its timer on mode exit/unmount and invalidates older pending requests. A mounted cold-entry regression verifies no further root reads after unmount; Luna's corrected full run passes **251 files / 1513 tests, exit 0**, without an unhandled error. Exact clean-release confirmation is required before deployment.

Independent clean-release confirmation subsequently passed all **251 files / 1513 tests, exit 0**. Both committed production artifacts were built, deployed and verified against their complete served-file manifests. Actual full-player red glyphs, Lattice blue glyphs, a single native transport, keyboard pause, pointer seek and Esc to the current playlist were confirmed. The ordinary queue popup revealed the exact current entry 450 among 1000 entries with one active row.

Live acceptance exposed a final geometry issue: the correct playlist and exact entry 450 were mounted and highlighted, but `scrollIntoView({ block: 'nearest' })` placed the row underneath the fixed ordinary dock; hit-testing the row reached the progress input. Center the row on the existing discrete return/selection trigger. Root independently reran the playlist and dock mounted regressions after Luna's refinement: **2 files / 4 tests passed**. The final deployed centering behavior still requires an unobscured-row screenshot/hit test before completion.
