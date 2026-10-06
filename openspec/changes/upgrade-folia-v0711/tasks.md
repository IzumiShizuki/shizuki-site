## 1. Upstream Review

- [x] 1.1 Download the official stable v0.7.11 source bundle and verify tag `6fe68d89`.
- [x] 1.2 Review v0.7.8–v0.7.11 release notes and the fork's full delta against v0.7.11.
- [x] 1.3 Record the fork branch, synthetic base, commits, dirty worktree, and existing backup files.

## 2. Fork Merge

- [x] 2.1 Create recovery branch `backup/folia-embed-pre-v0.7.8` and preserve the pre-existing dirty work in named stashes.
- [x] 2.2 Connect the fork to upstream history, merge v0.7.8 and v0.7.11, and resolve bootstrap and lockfile conflicts while retaining Shizuki behavior.
- [x] 2.3 Confirm the bridge, `/music/` base, gateway configuration, and Cadenza fix are present in the merged tree.

## 3. Verification and Records

- [x] 3.1 Run the fork's typecheck, tests, and production build after dependencies are installed; fix regressions.
- [x] 3.2 Update the AGPL source/patch snapshot and document the merged source version separately from the deployed image version.
- [x] 3.3 Run strict OpenSpec validation and record final local Git status. Do not deploy or push.

> The server worktree contains newer uncommitted edits and backup files. They were left untouched; the original pre-merge snapshots remain in the two named stashes.
>
> Verification: Node 24 typecheck and production build passed. The Windows full test run had 4,376 passed and 2 skipped; its only failure was the symlink-permission case in `modSignature`, which passed on the server Linux checkout (8/8 focused tests).
> Folia's `package.json` defines no lint script.
