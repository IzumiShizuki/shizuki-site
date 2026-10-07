# Carousel frontend delivery

Personal site 111.228.35.186, application /opt/shizuki-site. Site runtime revision **f951682af2dec589ae5bdb945585cb2ff1582aa8**. The final master handoff commit adds only OpenSpec records; application source matches the deployed revision.

- Site image: `sha256:acb220dd574aeac780317b88d178b116c96b840b0ac785c825db9dd68c024842`.
- All **229** expected frontend files verified by SHA-256 inside the running container; previous hashed assets retained.
- Source synchronization: 12 files uploaded and checked, zero deletions. Scope only profile components and OpenSpec records.
- Backend image remains `sha256:d8f97e90e104e141f910a659f4afb94f797f0cb9ca5a92e8e0c0a393a9452766`; backend/runtime middleware were not recreated. Private configuration fingerprints are unchanged. No database or Pixiv association changes.
- Health UP and site entry succeeds. Reloaded Administrator personal page displays one large image, six selectors, next/previous controls, the existing 17 artists and daily character 司波深雪. Both visible images load completely. Actual bounds and phone checks are recorded in verification.md.

## Recovery and evidence

Fresh private source/config checkpoint:

`/opt/shizuki-site-backups/profile-carousel-20261007-f951682af2de`

Archive listing and SHA-256 verification passed. Previous site image is retained as `shizuki-site/site:backup-before-carousel-f951682af2de`, identity `sha256:be3036e008f3b1ebdc7656145dbd235ebeb7883475fba32887f507270b094577`. Frontend switch failures restore that image. The prior full application/database/volume snapshot remains available at `/opt/shizuki-site-backups/snapshot-20261007-185342-bb54b60ced5a`. The release lock was removed after completion.

Local release directory: `D:/program/_codex_deploy/profile-carousel-release-20261007`, with manifest.json, release.json, generic credential-free executor and production-carousel-desktop.jpg / production-carousel-mobile.jpg. Build log: `D:/program/_codex_deploy/profile-carousel-build.log`. Evidence and rollback artifacts are intentionally retained; the preview server, browser tab and fixture files were cleaned.
