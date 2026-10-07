# Master Merge and Release-Candidate Acceptance

Subsequent delivery: the user authorized a combined wallpaper/music redeployment on 2026-10-07. Exact master merge `bf793d5e` and current production music code `cd69da6a` are ancestors of deployed code `a3f9225d`; see `deployment-report.md` for fresh acceptance and recovery evidence. The remaining sections preserve the original master-merge acceptance record.

## Merge plan and scope

- Target worktree: `D:/program/_codex_deploy/shizuki-site-folia-release-candidate`.
- Pre-merge target: `master` / `origin/master` at `2871ea36a3ca07dcaf41079b89cbe00078292cda`.
- Frozen source handoff: `codex/refine-wallpaper-recovery-and-search` at `f66d3ceeeb46a6a42b42a9cc82b4f8ef382148d9`; `MERGE_HEAD` was checked against this exact SHA before resolution.
- Merge base: `ce7f23324bb2eaed59ffed0d46695fa980d756eb`.
- The source worktree contained later uncommitted work. This merge uses the frozen commit SHA only; that other worktree was not modified.
- Merge strategy: ordinary no-fast-forward merge, resolved in the clean master worktree. Nine conflicts in Folia/music source and its corresponding OpenSpec docs were resolved to the pre-merge master files to preserve the latest master behavior. No conflict files remain.

## Change scope review

The wallpaper recovery/search/import work and its byte-progress prerequisite are present. The 31 additions and one deletion in `App.vue` beyond the wallpaper handoff commit match the `35b18397 feat(media): show wallpaper download bytes` prerequisite; they carry Workshop byte-progress display fields used by the merged import flow. The media model/response files and three migration locations carry that same required byte-progress schema. Third-party Folia product files have no net diff.

The source branch also carries the existing Obsidian publisher ToDo feature and its OpenSpec proposal, plus Folia deployment documentation. These are retained as source-branch history/code; this acceptance runs the publisher's existing Node tests only and does not install or publish the tool.

The nine preserved master files are:

- `fronted/vue3-merged/src/composables/usePlayerEngine.js`
- `fronted/vue3-merged/src/composables/usePlayerEngine.queue.spec.js`
- `fronted/vue3-merged/src/pages/MusicLibraryPage.sourceSync.integration.spec.js`
- `fronted/vue3-merged/src/pages/MusicLibraryPage.vue`
- `fronted/vue3-merged/src/utils/musicFoliaWorkspaceCoordinator.js`
- `fronted/vue3-merged/src/utils/musicFoliaWorkspaceCoordinator.spec.js`
- `openspec/changes/fix-folia-normal-player-linkage/design.md`
- `openspec/changes/fix-folia-normal-player-linkage/diagnosis.md`
- `openspec/changes/fix-folia-normal-player-linkage/proposal.md`

These paths are compared with the pre-merge master commit during final verification. In particular, the master music fixes `44ca6365`, `d8c0d9f9`, and `d42c34bf` must remain intact.

## Acceptance results

The full frontend suite passed: `pnpm exec vitest run --reporter=dot` reported 253 files and 1,562 tests passed. The production frontend build passed with `VITE_GATEWAY_BASE_URL=/`; Vite emitted its existing advisory that the main chunk is about 803 kB. The deployable dist is `fronted/vue3-merged/dist`. `index.html` is 4,490 bytes (SHA-256 `59DFCFC7D60B9AAD65FB5ECD920EE07D04237939748344D8232D1C7E28983F2F`); main bundle `assets/index-D9gQMy5B.js` is 822,640 bytes (SHA-256 `22C562C0225822AA86656D25861A0834E948A4E04CF1E1E5CF05A52112273B11`).

The existing Obsidian publisher Node tests passed: 19 tests. Pnpm printed a registry metadata/update warning, but the test command exited successfully. Generated `node_modules/` and `pnpm-lock.yaml` were removed; the lockfile was not present in the pre-merge master tree.

Java 17 Maven validation used the existing local repository cache at `D:/program/shizuki-site/.mvn/repository` in offline mode after an online attempt failed during Aliyun TLS handshake while resolving the Spring Boot BOM. No Maven settings or remote configuration were changed. The focused wallpaper/SteamCMD suite passed 20 tests. The affected media reactor passed 309 tests after excluding three existing JDK loopback initialization failures: the original reactor run failed once in `SpotifyOAuthProviderStrategyTest`; with that excluded, the media reactor run had six initialization errors (five `AsmrMusicProviderFailoverTest`, one `MetingMusicProviderTest`); excluding those three classes produced the 309-test success. The Java 17 monolith `-DskipTests package` completed successfully with compilation and test compilation enabled. Jar: `apps/monolith-app/target/monolith-app-0.1.0-SNAPSHOT.jar`, 74,763,197 bytes, SHA-256 `81A00FD0CA0DC073C7EEE8427C9916C93BE296CA50AE5E6862A603E743412382`.

Merged-build browser acceptance passed at desktop and mobile sizes. The recovery flow applied a wallpaper through the UI, reloaded with image requests blocked, and verified the cached image decoded at 640 px; clearing the route override did not restore it. Desktop discovery rendered 30 cards in nine columns; mobile rendered 30 cards in two columns with the filter disclosure fully visible and no overlap. Closing and reopening the dialog reused the parameter-keyed search result; known thumbnails caused zero preview-proxy requests, while selecting an item made one detail lookup. Evidence and repeatable scripts are under `openspec/changes/refine-wallpaper-recovery-and-search/evidence/`.

Preflight search observations recorded by the deployment helper were 1,162 ms for a 30-item search and 495 ms for detail lookup on the existing deployment; the older response had no import-channel field. These are environment observations, not a controlled latency comparison. Workshop search/detail and SteamCMD behavior were validated with mocks/fake processes and local backend tests; a successful live Steam download or real upstream latency was not verified.

Final scope checks confirmed all nine conflict paths are byte-for-byte unchanged from pre-merge master, including master music fixes `44ca6365`, `d8c0d9f9`, and `d42c34bf`. The merge uses the frozen source SHA in `MERGE_HEAD`, with no later source-worktree edits included. Strict OpenSpec validation was run before the local merge commit.

## Delivery boundary

The local master merge is verified as the requested release preparation. Push and deployment are left for the next release execution. The Obsidian tool was only test-run; it was not installed or published.
