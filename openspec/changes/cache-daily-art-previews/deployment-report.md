# Daily artwork preview cache deployment

Deployed on 2026-10-08 to the personal website server `111.228.35.186`.

## Source and runtime

- Backend revision: `e50c7c3d66d60cced75f33d8542dd576260e4cdb`, committed and pushed to master. Built in the clean detached release checkout with Java 17 and the existing Maven toolchain.
- Backend image: `sha256:3ec56fe7f10b1d4126c50c485768bc6af05ddc8b569dc0c3bacfb5736155e9b3`; tag `shizuki-site/backend:daily-art-cache-e50c7c3d66d6`. Runtime image label and JAR digest match the verified artifact manifest.
- Runtime JAR SHA-256: `3479ad7731b06c9dcd52ea05fbcc37830b72526261e5668dd53f8e215666af38`, size 74,817,122 bytes.
- Source synchronization: 16 committed paths uploaded and SHA verified; zero deletions. Previous source marker was `090fff454f5ab686cb97afbf39571471e76359fc`, now `e50c7c3d66d60cced75f33d8542dd576260e4cdb`.
- Only the backend was recreated. Frontend remains on `090fff454f5ab686cb97afbf39571471e76359fc`, image `sha256:0571626fff6d013944c2e16fd48af200490d61d3c2b50adc759fe06cd6aaa017`. Other container identities, images and start times were unchanged. Private configuration fingerprints were unchanged.
- The only backend source changes since runtime revision `b524add8dced0a0ad9cc973b34c66d4c0e936d3c` are the six cache/client/controller implementation and test files. No database migrations or dependencies changed.

## Acceptance

Health reported UP; site entry succeeded. Anonymous private settings return 401 and invalid preview ID 0 returns 400.

| Same verified preview, 435,598 bytes | HTTP status | Response image bytes | Total seconds |
| --- | --- | --- | --- |
| Before, request 1 | 200 | 435598 | 4.462877 |
| Before, request 2 | 200 | 435598 | 4.563337 |
| Before, request 3 | 200 | 435598 | 4.993987 |
| After, first cold request | 200 | 435598 | 2.622317 |
| After, warm request 1 | 200 | 435598 | 0.362879 |
| After, warm request 2 | 200 | 435598 | 0.379122 |
| After, conditional server request | 304 | 0 | 0.386017 |
| After, conditional public HTTPS request | 304 | 0 | 0.920031 |

Cold/warm and before/after rows use the same localhost backend path and include current Pixiv metadata verification. The public HTTPS row includes the site's network path and proxy overhead. All successful/conditional responses retain max-age=1800, public and nosniff. The stable ETag represents the unchanged image bytes. No cache entry bypasses the fresh all-ages check; the 25 passing relevant tests include warmed-cache restriction and concurrent download regressions.

## Recovery and handoff

Verified source/configuration checkpoint: `/opt/shizuki-site-backups/daily-art-cache-20261008-e50c7c3d66d6`. Archive `source-config-before.tar.gz` SHA-256: `decbba29d5c8e907d6d5126d3a8e816a79da86ab5b71cce1588077c615544f42`; archive listing/checksum checks passed and READY exists. Private configuration is retained on the server.

Previous backend image is retained as `shizuki-site/backend:backup-before-daily-art-cache-e50c7c3d66d6`, identity `sha256:d8f97e90e104e141f910a659f4afb94f797f0cb9ca5a92e8e0c0a393a9452766`. The executor restores synchronized sources and the previous deployment marker, removes only explicitly listed added source files, and restores the backend image if delivery gates fail. No rollback was needed and the release lock was removed. A later rollback can use the same source archive, explicit source-path lists and retained backend image, then recreate only the backend and verify health. No data restore is required for this cache-only change.

Local release evidence: `D:/program/_codex_deploy/daily-art-cache-release-20261008` with manifest.json, release.json, Dockerfile.backend and the credential-free release executor. Remote staging: `/opt/shizuki-site/.daily-art-cache-staging/e50c7c3d66d6`. Recovery and release evidence are intentionally retained. No temporary debug instrumentation, prototype files or new branches were created.

The image cache is process-local, limited to 64 MiB/64 entries, with a non-sliding 24-hour lifetime. Restart clears server image entries; thirty-minute browser caching remains independent. A new image still requires its initial download and failed current safety verification never falls back to stale cached bytes. Unrelated TopMenu and concurrent wallpaper workspace edits were preserved and excluded from this artifact. All seven OpenSpec tasks are complete; the change is not archived.
