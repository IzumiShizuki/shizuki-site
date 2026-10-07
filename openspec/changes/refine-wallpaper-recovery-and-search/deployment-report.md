# Combined wallpaper and music release: 2026-10-07

Released to the personal-site server `111.228.35.186` and [production site](https://site.shizuki.online/). The exact wallpaper merge is now included in both release ancestry and executable artifacts, while the deployed cloud music/podcast repairs remain present.

## Identity and scope

- Deployed code: `a3f9225d367fc7c7e41392cd5f2f433558c8556c`, built in the managed worktree on `codex/music-podcast-release-20261007`.
- Wallpaper ancestor: `bf793d5e76d244ce3cf07bc791ac27f19cd654e8`.
- Previous cloud music/podcast ancestor: `cd69da6adc2370174f3479cbc3b1741da1b10db6`.
- Backend image: `sha256:8f1d2ab3ca150ba89c83cd25a9ec18dfd1ff6da799406de979aaf97831d1552b`.
- Frontend image: `sha256:3343417d5ac9b758495649e29930affadb0e3141b446a3a8d1c4666c97e766ed`.
- Production JAR: 74,777,719 bytes, SHA-256 `3e966c6dd968396a7d9e5c0a4090812d1823b1b2381eba67d36d5efbe607d8d8`.

The ordinary merge had no conflicts. The cloud provider, platform-library controller and service class bytes are identical to the preceding verified production JAR. The wallpaper preview cache, classified SteamCMD downloader, session restoration/discovery UI and byte-progress migration are present in the new artifacts. The unrelated user's main-worktree `TopMenu.vue` edit was excluded from release inputs. No Git push or private configuration change was performed. Folia remains at image `sha256:eb896d63646e3494e8fccdff52428a3271ad7b1fae3712b2b2cf2610e9bddcc2`.

## Recovery and capacity

Fresh complete checkpoint: `/opt/shizuki-site-backups/wallpaper-release-20261007-cd69da6a`, with 1,085,362,836 bytes in eight initial snapshot files. It contains the application/private configuration archive, fresh database dump, all three configured named-volume archives, previous revision and volume list. Every persistent snapshot file was independently checked against the fresh RAM snapshot's SHA-256 value; the database dump was accepted by `pg_restore --list`.

Frozen previous images are retained as `shizuki-site/backend:backup-before-wallpaper-20261007-51cdcee3` and `shizuki-site/site:backup-before-wallpaper-20261007-e9e8bd97`. `source-before.tar.gz`, `ROLLBACK-READY`, `restore-record.json`, `release-record.json`, `delivery-record.json`, two manifests and `RECOVERY.md` provide recovery evidence and instructions. Application-only rollback restores the prior images and source archive while retaining the additive byte-progress columns; full database/volume restoration is a separate operation.

The initial root free space was about 127 MB. Two superseded, unreferenced intermediate music images and unused Docker build cache were cleared after runtime/reference checks. Current, frozen and existing rollback images and persistent backups were retained. The recovered capacity allowed the complete fresh snapshot to remain on the server. The optional local off-host transfer was stopped and marked `INCOMPLETE`; it is not a verified restore point. Its deletion was rejected by automatic approval review with reason `blocked by policy`, so the directory `D:/program/_codex_deploy/private-backups/wallpaper-release-20261007-cd69da6a` remains. Do not retry deletion with another tool.

## Acceptance

- Combined frontend suite: 255 files and 1,585 tests passed. Focused backend: 101 media and 13 monolith auth-filter tests passed. Existing publisher tests: 19 passed. Production Vite build and Java 17 Maven package passed; Vite's existing large-chunk advisory remains.
- Backend actuator status is `UP`. Runtime image IDs/revision labels, JAR SHA-256 and all 229 frontend artifact files match the verified build. Production private configuration fingerprints match the preceding release.
- Flyway migration `1015` succeeded. Both `downloaded_bytes` and `total_bytes` columns are present with PostgreSQL `bigint` type.
- Public HTTPS HTML and entry bundle match artifact SHA-256 values. HTML SHA-256: `26b897a72f74fe7c11a117a47b651ea161f2b22a743be35f68c7bf321642ecf9`; entry `/assets/index-D4_Rmzkd.js` SHA-256: `b81d8ab2e2366ad2be465831ae885e3a2b1563fe8ecdb138059f2dc6024bd00c`. The compiled wallpaper filter disclosure is present.
- Public wallpaper library, real Workshop search and selected-item detail return HTTP 200; search returned 30 items. This demonstrates current availability and does not establish a controlled upstream latency improvement or successful SteamCMD download.
- Public podcast discovery returns HTTP 200 with ten recommendations. Five anonymous personal-account API checks return HTTP 401, including a spoofed user header. Read-only verification of the actual bound NetEase account returns 23 subscribed collections, two created collections and zero favourite voices, with no account mutations.
- Folia and its source offer return HTTP 200. No Folia rebuild, middleware move or website credential change occurred.

Fresh checks verify the combined build, runtime and HTTP behavior. Prior desktop/mobile and recovery browser evidence belongs to the exact wallpaper master merge. A new authenticated production-browser acceptance and a successful real SteamCMD download are not claimed.

The final source/backup recheck and RAM staging cleanup are recorded in the private delivery record. Local document commits made after the deployed code revision do not change runtime artifacts.
