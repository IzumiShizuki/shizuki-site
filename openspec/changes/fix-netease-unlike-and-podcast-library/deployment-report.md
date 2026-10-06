# Deployment: 2026-10-07

Released to the personal-site server `111.228.35.186` and [site music workspace](https://site.shizuki.online/#/music-library/music).

## Released identity

- Previous release: `16517f6e6dfd024b2c6ca3e5241a899f2a4bf9ff`.
- Deployed code: `cd69da6adc2370174f3479cbc3b1741da1b10db6` on local branch `codex/music-podcast-release-20261007`, built in the attached managed worktree from the current production baseline.
- Backend image: `sha256:51cdcee31d7c263381a392b6fb5d2bd89161621ea5307d9a9b9a5e4b5e39e3e6`.
- Site image: `sha256:e9e8bd9741a4d8d1f4ab9694aba051d80831212e43584b4f47ef638bf7609315`.
- Deployed JAR SHA-256: `16c376304972d834a88776971404ee3a2b8c080a47284558590d0b931219e31a`.
- Folia remains at `5bf98f77dfdc77f670ebf17e5c16973b4d30e6c5`, image `sha256:eb896d63646e3494e8fccdff52428a3271ad7b1fae3712b2b2cf2610e9bddcc2`.

Only this change was applied to the production checkout. Its existing playlist-load generation name required a one-line adaptation, caught by that checkout's integration suite before switching services. The user's unrelated `TopMenu.vue` edit was excluded from both commits and build inputs. No database migration, middleware relocation or Git push was performed.

## Recovery

Before switching, current backend/site images were frozen under `backup-before-podcast-20261007-c2df44c3` and `backup-before-podcast-20261007-1d99545f` tags in their respective repositories.

Private current recovery point: `/opt/shizuki-site-backups/podcast-fix-20261007-16517f6e`, 402,717,748 bytes of initial recovery files, including fresh database and all three configured named-volume archives, current application delta, configuration/data state manifests and restore instructions. Its verified full application baseline is `/opt/shizuki-site-backups/snapshot-20261006-202931-d42c34bf3387`.

The full current application was first archived in RAM. Baseline plus delta was reconstructed in a separate staging directory and all 5,042 application entries were checked against that full current archive. This avoids duplicating unchanged large files on the nearly full root disk. Both persistent recovery manifests were verified again before switching and before temporary-stage cleanup.

`source-before.tar.gz`, frozen images and `ROLLBACK-READY` provide an application-only rollback to the preceding release. `RECOVERY.md`, initial `SHA256-MANIFEST.json`, `DELIVERY-SHA256-MANIFEST.json` and delivery records remain in the private recovery directory. Full database/volume restoration is separate from an application-only rollback.

The temporary RAM deployment directory and unused intermediate image tags were removed after successful verification; the persistent recovery point remains available.

## Acceptance

- Backend actuator health: `UP`; frontend and backend runtime image IDs and revision labels match the release.
- All 229 expected built frontend files match their deployed SHA-256 values; prior hashed assets remain available to existing tabs.
- HTTPS site and entry script match the release artifacts. HTML SHA-256: `921e4623304721ad457811a7a3cc23a8075ac18d1f61b41e6cf74c3cb38da346`; entry-script SHA-256: `c74214dd2613f666ee3600ddccc0dbb67a6ea30797649f1d329b026a88f94b18`.
- Public podcast discovery: HTTP 200, 10 real recommendations. Five anonymous personal reads/writes, including a spoofed user header, returned HTTP 401.
- Actual bound-account platform-service verification: 23 subscribed podcasts, 2 created collections, 0 favourite voices. Normal song unlike and the legacy cloud-liked-playlist route both applied correctly; original song likes were restored and compared. A voice was favourited, observed in the actual library with its separate playable main-song ID, then removed; the original voice library was verified restored.
- The detail `subscribed` flag proved unreliable during acceptance. The final release derives program state and bound collection-row hearts from actual favourite-library membership instead.
- Private site/backend/Folia configuration fingerprints were unchanged. Folia and its source offer at `/music/` and `/music/source/` return HTTP 200.

See `verification-report.md` for test counts and browser/authenticated-HTTP smoke limitations. Detailed private manifests and sanitized live results remain in the ignored local deployment evidence and private server delivery record.
