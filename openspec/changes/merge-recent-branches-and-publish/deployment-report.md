# Combined October delivery

Date: 2026-10-07. Authorized Git publication and the earlier personal-site deployment request are complete.

## Publication

Both audited recent branch tips were merged into master. The first normal push advanced origin/master from bf793d5e to b524add8dced0a0ad9cc973b34c66d4c0e936d3c. There were no remaining local/fetched remote commits since 2026-10-01 outside master ancestry. The final handoff commit only updates OpenSpec records and is published separately; no force push or history rewrite is used.

## Runtime

Personal server: 111.228.35.186. Application: /opt/shizuki-site. Both backend and site OCI revision labels and deploy/.deployed-commit equal **b524add8dced0a0ad9cc973b34c66d4c0e936d3c**.

| Artifact | Verified runtime identity |
| --- | --- |
| Backend image | sha256:d8f97e90e104e141f910a659f4afb94f797f0cb9ca5a92e8e0c0a393a9452766 |
| Site image | sha256:be3036e008f3b1ebdc7656145dbd235ebeb7883475fba32887f507270b094577 |
| JAR | 74,813,335 bytes; SHA-256 0481c2327ae7605a39f2fb0f1afe64ee199c791ed8c7f8d969438075c3f0932f |
| Frontend | All 229 manifest files verified by SHA-256, 49,093,869 bytes |
| Source synchronization | 89 changed files uploaded and verified, zero deletions |

Backend health UP; successful site entry. Anonymous daily-art settings remain 401; invalid preview ID remains 400; actual character preview returns 200 image/jpeg. The logged-in Administrator profile displays the same six persisted daily works, 17 artists and 司波深雪 after reload. All seven image elements are complete with nonzero natural dimensions. Earlier live role search returned safe artwork results. Vue 1,624 and backend 148 tests, production Vite build and Maven package passed before publishing.

Private configuration fingerprints match before/after. Only backend and site were recreated with verified local artifacts. Previous hashed assets are retained. Existing Folia and middleware services were not restarted. No new Pixiv credentials were stored or disclosed during this delivery.

## Recovery and evidence

Fresh app/config/database/named-volume snapshot:

`/opt/shizuki-site-backups/snapshot-20261007-185342-bb54b60ced5a`

READY marker, tar listing, pg_restore catalog and all backup checksums verified. Previous backend/site images retain backup-before-dailyart-b524add8dced tags. Runtime switch gates restore those images on failure. The deployment lock has been removed after successful completion.

Local evidence directory: `D:/program/_codex_deploy/recent-merge-release-20261007`, containing manifest.json, backup.json, release.json and production-profile.jpg. The release/prepare scripts contain no credentials. Recovery files are intentionally retained; previously blocked unrelated cleanup is not retried. The primary TopMenu.vue uncommitted edit is not part of Git commits or deployments.
