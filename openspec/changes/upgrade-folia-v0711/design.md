## Context

The maintained Folia source is a separate AGPL-3.0 fork at `/opt/folia/folia-major-main`, branch `folia-embed`. Its synthetic v0.7.7 baseline is `0643947`; the fork also has two Shizuki commits before this synchronization. Upstream release v0.7.11 is pinned at `6fe68d89`.

The upstream releases after v0.7.8 add lyric import/export and local lyric-format priority, the Folium 1.3 mod API, a video layer behind lyrics, Lumiere visualizer and fullscreen controls, smoother grid transitions, and fixes for Lumiere glyph rendering and repeated Ponder onboarding. The v0.7.11 release notes say it is a hotfix over v0.7.10.

The full fork delta against upstream v0.7.11 is recorded in `third_party/folia-major/shizuki-folia-v0.7.11.patch`. The patch applies cleanly to the official v0.7.11 tag. The source mirror contains the bridge, merged bootstrap, modified visualizers, and Cadenza regression test. A follow-up fix commit `69a97532` updates the bridge to the current `Album.coverUrl` type.

## Goals / Non-Goals

**Goals:**

- Keep the fork's Git history and Shizuki patches while merging the stable v0.7.11 tag.
- Preserve the embedded-player contract, single audio owner, `/music/` asset base, and deployment-specific gateway configuration.
- Keep the public AGPL snapshot aligned with the verified merge commit.

**Non-Goals:**

- Deploying or restarting the production Folia gateway.
- Pushing the fork or creating a public release.
- Enabling QQ, Kugou, or AI services that the current deployment does not run.

## Decisions

- **Use stable `v0.7.11`, not `main` or a nightly.** The release tag is pinned at `6fe68d89`.
- **Connect the fork's synthetic v0.7.7 root to upstream history without replacing its tree.** Recovery branch `backup/folia-embed-pre-v0.7.8` preserves the pre-merge commit; two named stashes retain the original dirty changes and backups.
- **Merge upstream in release order.** The branch first links to v0.7.7, then includes v0.7.8 and the latest v0.7.11 history. Merge commit: `fa4b6714`; bridge type-fix commit: `69a97532`.
- **Combine the updated Folium startup with embed-specific startup behavior.** Standalone windows initialize Folium clients and local-cover runtime; embed mode immediately renders the player surface and skips those standalone-only startup tasks.
- **Resolve dependency lock conflicts from v0.7.11 and retain the fork's GitHub proxy.** `package.json` and `package-lock.json` both use the proxy URL so their dependency specifications match.
- **Keep deployment-specific gateway configuration and do not deploy.** The committed source merge retains the `/music/` base and custom gateway routes. The production image remains `folia-local/gateway:0.7.7-music` until a separately requested rollout.
- **Publish only the committed merge snapshot.** Newer uncommitted server edits remain untouched in the worktree; they are not included in the public patch snapshot.

## Risks / Trade-offs

- **Upstream startup changes overlap embed initialization** → preserve the player-only mount and bypass Folium/local-cover startup only in embed mode.
- **The dependency lock conflicts with the fork's proxy override** → use upstream v0.7.11's complete lock graph and keep the proxy URL in both manifest and lockfile.
- **Upstream features rely on services not deployed here** → keep the existing service scope and leave the production image unchanged.
- **The server checkout has concurrent work in progress** → leave it in place and retain pre-merge snapshots in Git stashes.

## Verification

1. Verify official tag `v0.7.11`, review releases v0.7.8–v0.7.11, and compare the complete fork delta.
2. Check that the AGPL patch applies to a clean v0.7.11 checkout.
3. Run the fork's typecheck, tests, and build after its dependency installation completes; report any check that cannot run.
4. Run strict OpenSpec validation and inspect local Git status. Do not deploy or push.
