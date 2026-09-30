## Context

See `proposal.md` for motivation. The current Shizuki integration keeps Folia as a separate AGPL-3.0 source tree; the website repository carries the bridge and a small patch mirror. The server fork is recorded at `/opt/folia/folia-major-main` on `folia-embed`, but this workstation currently cannot authenticate to that host. The official v0.7.8 source is available locally at `D:\program\_codex_deploy\folia-major-v0.7.8-upstream`.

The preliminary upstream comparison shows v0.7.8 changes `src/App.tsx`, `src/bootstrap.tsx`, and the playback store. The Shizuki subpath setting in `vite.config.ts`, bridge mount point in `src/index.tsx`, and wrapped-lyrics patch target are unchanged from v0.7.7. These observations do not replace checking the actual fork diff.

## Goals / Non-Goals

**Goals:**

- Preserve the fork's existing history and Shizuki patches while incorporating the stable v0.7.8 tag.
- Keep the embedded player contract, single audio owner, and `/music/` asset base working.
- Keep the public AGPL patch record aligned with the resulting fork.

**Non-Goals:**

- Deploying or restarting the production Folia gateway.
- Pushing the fork or creating a public release.
- Enabling the QQ, Kugou, or AI services that the current deployment does not run.

## Decisions

- **Merge the stable `v0.7.8` tag, not `main` or a nightly.** The release is pinned at commit `9cf8220`; a release tag gives a reviewable, reproducible boundary.
- **Merge through Git history instead of replacing the source tree with the archive.** First confirm the fork worktree is clean and create a local recovery ref. This preserves fork-only commits and makes conflicts visible.
- **Review integration seams explicitly.** Check `vite.config.ts`, `src/index.tsx`, embed-specific changes in bootstrap/app shell, the playback store and lyric clock used by `shizukiExternalBridge.ts`, and the Cadenza wrapped-lyric patch. The upstream store still exposes the setters used by the bridge, but the actual fork may have additional local changes.
- **Keep deployment-specific gateway configuration outside upstream source changes.** Reconcile the Vite `/music/` base and gateway image version in the fork/docs, but do not rebuild or restart production.
- **Refresh the AGPL patch mirror only from the verified merged fork diff.** This avoids documenting an inferred patch set that may not match the server fork.

## Risks / Trade-offs

- **Upstream refactors overlap with fork-only bootstrap or playback code** → resolve against the complete fork diff and preserve the external bridge's behavior; do not drop fork commits to obtain a clean merge.
- **The archived patch notes may be incomplete or stale** → compare the actual branch against its upstream base before updating the mirror.
- **New upstream features rely on services not deployed here** → retain current service scope and call out any feature that requires a newer service image.
- **No production check is possible from a source merge alone** → run static/build and relevant integration checks locally; leave deployment verification for a separately requested rollout.

## Migration Plan

1. Access the existing fork, record branch, upstream URL, base commit, and worktree status; create a recovery branch/ref.
2. Fetch upstream `v0.7.8`, review the fork diff, then merge the tag into `folia-embed` and resolve conflicts at the integration seams.
3. Run the fork's typecheck, focused tests, and production build; inspect the final diff for bridge and deployment config retention.
4. Update `third_party/folia-major/` and `deploy/folia/README.md` from the verified result. Validate OpenSpec and local Git status.
5. Roll back by returning to the recorded recovery ref. Do not deploy or push in this change.
