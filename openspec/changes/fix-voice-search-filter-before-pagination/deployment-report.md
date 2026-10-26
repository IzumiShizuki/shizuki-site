# Voice search production deployment

Deployed on 2026-10-27 (Asia/Shanghai) after the user requested deployment. Destination: personal website server `111.228.35.186`. Entry: [voice library](https://site.shizuki.online/#/music-library/voice).

## Release identity and scope

The implementation commit is `211da450`. Production already contained newer unrelated features, so a clean managed worktree was created at the running production revision `de66d5553b34a3bb730db6934677444af28e130e`. Only the voice-search fix was cherry-picked onto that revision.

- Deployed backend/source revision: `0f12a2dc925493073874b3967115af905458db8f`.
- Local protection branch: `codex/deploy-voice-search-20261027`.
- Backend image: `sha256:4a16b25a3ae4293f3d2fb448ed879a9ffe3e3d3a7c5869e15753a2ef7ea2d046`.
- Release tag: `shizuki-site/backend:voice-search-0f12a2dc9254`.
- Runtime JAR: 77,998,337 bytes; SHA-256 `0e72199364b5b0f299cb97e5ee723e12d79c8a21c2354ec99391fbff542f5dd3`.

The isolated diff contains exactly ten paths: two production Java files, two test files, and six OpenSpec files from the implementation commit. All previously present affected server files matched the production baseline before synchronization. All ten published files matched the release Git blobs afterward. The staged and running JAR digests matched the verified local artifact.

Only the backend container was recreated. The frontend and the other seven `shizuki-site-*` containers retained their exact container IDs, image IDs, and start times. The frontend remains on production revision `de66d555`. Private `.env.server` and `common-config.yaml` SHA-256 fingerprints were unchanged. No database migration, frontend publication, Git push, or OpenSpec archive was performed. Unrelated primary working-tree edits were excluded.

## Release verification

The isolated release passed Java 17 packaging and 89 focused tests:

- `MediaServiceImplTest`: 47.
- `AsmrMusicProviderSearchTest`: 13.
- `AsmrMusicProviderFailoverTest`: 5.
- `MusicControllerIntegrationTest`: 8.
- `AuthEntryFilterTest`: 16.

The release used the existing activation script and Maven repository. The JVM-only Unix-domain socket workaround from the implementation verification was used for tests; it was not added to production settings. The build command was:

```text
call D:\environment\activate-shizuki-site.cmd
cd /d C:\Users\IzumiShizuki\.codex\worktrees\deploy-voice-search-20261027\shizuki-site
mvn -B -o -Dmaven.repo.local=D:/program/shizuki-site/.mvn/repository -pl apps/monolith-app -am -Dtest=MediaServiceImplTest,AsmrMusicProviderSearchTest,AsmrMusicProviderFailoverTest,MusicControllerIntegrationTest,AuthEntryFilterTest -Dsurefire.failIfNoSpecifiedTests=false -DargLine=-Djdk.net.unixdomain.tmpdir=D:/program/shizuki-site/target/disabled-unix-sockets package
```

OpenSpec strict validation and whitespace checks passed. No source conflict or further implementation change was required when applying the fix to the production baseline.

## Live acceptance

The existing authenticated Edge session was used to open the voice library in a separate verification tab. Response metadata was captured from the actual page's HTTPS requests; no credentials or media were exported.

| Browser request | Before deployment | After deployment |
| --- | --- | --- |
| Default general/R15, page 1 / limit 20 | 1 result, hasMore true | 20 results, all general or R15 |
| Default general/R15, page 3 / limit 10 | 0 results, hasMore true | Covered below using selected tags |
| Default general/R15, page 4 / limit 10 | 0 results, hasMore true | Not needed after the first page filled |
| Healing tag 56, general/R15, page 1 / limit 20 | Not sampled | 20 results, every work contains tag 56 |
| Healing 56 AND ASMR 497, general/R15, page 1 / limit 20 | Not sampled | 20 results, every work contains both tags and matches the age filter |
| Same two tags and ages, after scrolling, page 3 / limit 10 | Not sampled | 10 results, both tags and ages match, zero work IDs overlap the first batch |

The page visibly showed 20 works after initial loading and 30 after the scroll request. This verifies filtering across the upstream collection before pagination through the deployed service and actual frontend, including the existing 20/10 request sequence.

Public HTTPS checks also passed: `/` HTTP 200, `/actuator/health` HTTP 200 with `status=UP`, and an unauthenticated `/api/v1/music/voice/works` request HTTP 401. Loopback API health and site entry gates passed, and `/opt/shizuki-site/deploy/.deployed-commit` was updated atomically only after artifact and health checks succeeded.

## Recovery and retained evidence

Verified complete restore point:

`/opt/shizuki-site-backups/snapshot-20261027-003224-0f12a2dc9254`

It contains the application/private configuration archive, database dump, and all three configured named-volume archives. `READY` exists; application/volume gzip checks and `pg_restore --list` completed successfully before deployment.

- Previous backend image: `sha256:dbf7ad22d48b90390bb925f2e7ca9c818924868e5a2bad7e95595adc8520c27a`.
- Frozen previous-image tag: `shizuki-site/backend:before-voice-search-0f12a2dc9254`.
- Exact affected-source restore archive: `/opt/shizuki-site/.voice-search-staging/0f12a2dc9254/previous-source.tar`.
- Local release manifest, build/test log, and credential-free executor: `D:\program\_codex_deploy\voice-search-20261027`.

The executor retains an explicit rollback operation that restores the frozen backend image, the previous source archive and marker, removes only the explicitly recorded newly added source paths, recreates only the backend, and rechecks health. Automatic rollback was armed around source/image activation; no rollback was needed. The release lock was removed after success.

The release worktree is retained at `C:\Users\IzumiShizuki\.codex\worktrees\deploy-voice-search-20261027\shizuki-site`: Codex identifies it as this chat's primary checkout and does not permit archiving it. The protection branch, a verified copy of `app.jar`, and external release evidence are also retained for reproduction. All eleven implementation/deployment tasks are complete. No unresolved deployment issue remains.
