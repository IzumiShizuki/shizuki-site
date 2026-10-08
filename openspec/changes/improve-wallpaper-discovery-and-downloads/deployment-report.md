# Wallpaper discovery production deployment

## Release

- Date: 2026-10-08, Asia/Shanghai.
- Authorization: user requested deployment after the local wallpaper implementation.
- Destination: personal-site server `111.228.35.186`, application `/opt/shizuki-site`; public entry `https://site.shizuki.online/`.
- Final runtime revision: `0c65bfc63e1c7ab033b7b88dab2919005eed67ab`, built on isolated branch `codex/wallpaper-discovery-release` from the previously committed wallpaper release `1f52118b`.
- Backend and frontend image revision labels, backend JAR hash, frontend's 233 file hashes, and `.deployed-commit` were verified against the pinned artifacts.
- The concurrent frontend redesign work and pre-existing uncommitted `TopMenu.vue` edits were excluded. Frontend sources are identical to committed `1f52118b`; the follow-up changes only backend pagination and its tests/specification.
- No Git push, database migration or new wallpaper import was performed.

## Production checks

| Check | Result |
| --- | --- |
| Backend health | `UP` |
| Public site and current frontend entry | HTTP 200; entry SHA-256 matches release |
| Wallhaven first page | 72 distinct items; logical last page 23 at verification time |
| Wallhaven item `pomle9` | `Japan · ginko · Tokyo`; anonymous detail HTTP 200; two requests about 0.519/0.135 seconds |
| Workshop first/second pages | 70/72 visible items; `page_size=72`; advancing enabled; zero shared IDs |
| Workshop resolution | 62 of 70 first-page items declare resolution; known recent item `3812685876` returns `1920x1080` |
| Private wallpaper library | Anonymous HTTP 401 |
| Existing Daily Art cache | Preview HTTP 200 with public 1800-second cache header |
| Other running containers | Same IDs, images and start times before/after each release |
| Private configuration | YAML hash unchanged; only initial environment change is page size 24 → 72; follow-up changes no environment bytes |

Steam's source pages can render fewer than 30 cards while declaring more pages in hydration metadata. Initial verification found source counts 30/28/30. The extra correction removes the premature last-page judgment and preserves the page-three remainder rather than filling the batch with duplicates. Every discovery batch contains up to 72 visible items.

Workshop resolution is an author declaration. These read-only checks confirm metadata and pagination; actual Steam download throughput has not been measured. The new completion handling and phase timing logs are included in the deployed backend.

## Verification and recovery

- Backend regression suite: 103 tests, zero failures/errors/skips. The tested backend tree is identical to the isolated release tree.
- Frontend regression suite: 55 tests passed during implementation; clean committed frontend production build passed.
- Clean backend package and OpenSpec strict validation passed.
- Initial release: 38 source files synchronized with SHA-256 verification; final correction: 9 files synchronized and verified. No source deletions.
- Scoped deployment reused verified existing runtime images, copied pinned build artifacts, and recreated only `backend` and `site`. Unrelated services were preserved.
- Initial checkpoint: `/opt/shizuki-site-backups/wallpaper-discovery-20261008-1f52118ba8c1`.
- Final checkpoint: `/opt/shizuki-site-backups/wallpaper-discovery-20261008-0c65bfc63e1c`.
- Each checkpoint includes a verified `source-config-before.tar.gz`, `SHA256SUMS`, and `READY`. Backend/site rollback image tags use `shizuki-site/<service>:backup-before-wallpaper-<revision-prefix>`.
- Credential-free local executors, artifact manifests and machine-readable verification evidence are retained at `D:/program/_codex_deploy/wallpaper-discovery-release-20261008` and its `-v2` counterpart. These read credentials from the existing environment and are kept outside Git.
- Future deployments must compare their target against the recorded revision on the isolated release branch; the shared UI-development branch contains an equivalent sparse-page fix but is a different ancestry. Reconcile the release branch into the intended target before using an incremental ancestor comparison.

All deployment tasks are complete. The OpenSpec change remains available for follow-up and has not been archived.
