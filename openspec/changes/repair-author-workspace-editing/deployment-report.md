# Author workspace production deployment

Deployed on 2026-10-08 after the user explicitly requested deployment. Destination: personal site server `111.228.35.186`, application `/opt/shizuki-site`, [author homepage](https://site.shizuki.online/#/author?tab=about).

Runtime revision: `090fff454f5ab686cb97afbf39571471e76359fc` (`fix: connect author studios and protect drafts`). Previous runtime revision: `f951682af2dec589ae5bdb945585cb2ff1582aa8`. The release was built from an isolated archive of the committed revision using the existing local toolchain and dependencies. Uncommitted `TopMenu.vue` changes were excluded. The pinned revision also contains the already committed calendar changes since the previous production release.

## Validation and live behavior

- Isolated release build passed with `VITE_GATEWAY_BASE_URL=/`. The existing large-chunk warning remains.
- Release-source frontend tests passed: 264 files, 1665 tests, 62.13 seconds.
- All 233 expected static files matched their SHA-256 manifests inside the running frontend container. Previous hashed assets and the existing nginx configuration were retained.
- Incremental source synchronization uploaded and verified 45 committed files; zero source deletions. The source paths are recorded in local release.json.
- API health reported UP and the site entry returned a successful response.
- The actual authenticated Microsoft Edge session showed the shared author navigation and Content Studio button. One-click entry to the album studio and return to the author homepage passed. The About Website editor loaded the current profile and enabled Save after initialization; it was closed without editing or saving production data.
- Only the frontend container was recreated. Backend and all other running service container identities, images and start times were unchanged, as were private configuration fingerprints. Backend image remains `sha256:d8f97e90e104e141f910a659f4afb94f797f0cb9ca5a92e8e0c0a393a9452766`.
- Frontend image: `sha256:0571626fff6d013944c2e16fd48af200490d61d3c2b50adc759fe06cd6aaa017`, tag `shizuki-site/site:author-workspace-090fff454f5a`. The deployment marker was updated after all release gates passed, and the release lock was removed.

## Recovery and retained evidence

Verified source/configuration checkpoint: `/opt/shizuki-site-backups/author-workspace-20261008-090fff454f5a`.

The archive `source-config-before.tar.gz` contains the previous versions of changed existing sources, private configuration and deployment marker. Archive listing and SHA-256 validation passed; its SHA-256 is `db44651847cafe7d947f60f7e0f4d7983c0a2bb3616d8760d24c8dd385b8fa04`. A READY marker records checkpoint verification. Private configuration remains on the server.

The previous frontend image is retained as `shizuki-site/site:backup-before-author-workspace-090fff454f5a`, identity `sha256:acb220dd574aeac780317b88d178b116c96b840b0ac785c825db9dd68c024842`. The release executor restores the previous sources, deployment marker and image if publication gates fail. For a later rollback, restore the checkpoint's existing source paths and old marker, handle the added source paths listed in release.json, retag the retained image as `shizuki-site/site:latest`, recreate only the compose `site` service, and recheck API/site health. No rollback was needed for this release.

Local evidence directory: `D:/program/_codex_deploy/author-workspace-release-20261008`. It retains immutable source archives, source.json, build.log, tests.log, the credential-free release.py executor, manifest.json, release.json, browser-acceptance.json and production-author.jpg. Remote staging is retained at `/opt/shizuki-site/.author-workspace-staging/090fff454f5a`. These release and recovery artifacts are intentionally retained.

No Git push, backend/database deployment, production content write or OpenSpec archive was performed. The local follow-up commit records this deployment; application runtime remains pinned to `090fff454f5ab686cb97afbf39571471e76359fc`. The earlier cleanup block for implementation verification files remains documented under task 4.4 and is unrelated to release success.
