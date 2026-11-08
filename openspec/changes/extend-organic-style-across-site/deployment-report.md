# Organic frontend production deployment

2026-11-08, Asia/Shanghai. The user explicitly requested deployment after approving and publishing the new style. Target: personal-site server `111.228.35.186`, public entry [About](https://site.shizuki.online/#/author?tab=about) and [Blog](https://site.shizuki.online/#/blog).

## Released artifact and scope

- Approved frontend revision: `cc258c79287daf5dfc693b74a3ec4b1836b12b11` (style implementation `5a8ae638`). Frozen in a clean independent `master` checkout matching fetched `origin/master`.
- Frontend image: `sha256:b1e3a72e15b403be52fa166a882f103f315c9a7bb1ba38533fba470f6dc93844`.
- Image tag: `shizuki-site/site:organic-cc258c79287d`.
- Main index SHA-256: `7941a1d60b6e0b1f48335af252e5f7c77a44d28cb3c04a312ce6d02724b2cb7d`.
- Shared style entry: `assets/index-BSSAMsZw.css`; main script: `assets/index-De-7ZFz8.js`.
- Release runner, build logs, manifests, private guard evidence and screenshots: `D:/program/_codex_deploy/organic-site-20261108`.

The production backend/release tree is based on a separate history (`.deployed-commit` was `2269daa4`), so a whole-repository reconciliation would include unrelated backend/DJ differences. This release reused the established isolated frontend-image procedure and activated only Compose `site` with `up -d --no-build --no-deps site`. No backend build, source-tree synchronization or database migration was performed.

The new runtime image overlays only the main `index.html` and its 209 compiled assets onto the pinned previous image. All **996 pre-existing non-index static files** were verified unchanged after activation, including shared DJ, Folia and public image/map resources. Existing hashed asset collisions were checked before staging. The eight other `shizuki-site-*` containers retained their exact container IDs, image IDs and start times. Private configuration digests, backend/DJ revision markers and the public DJ index digest were also unchanged.

The explicit frontend marker `/opt/shizuki-site/deploy/.deployed-frontend-commit` records `cc258c79287daf5dfc693b74a3ec4b1836b12b11`. The full-tree/backend and DJ markers were deliberately preserved; this deployment does not claim those source trees were reconciled to master.

## Gates and production checks

- Production frontend rebuilt successfully using the existing server's build arguments, reused only in process without printing or storing their values. Existing Sass and large-chunk warnings remain.
- Both GitHub CI runs for the approved revision completed successfully (master and the development branch). Previous frontend validation: 283 files / 1,829 tests passed.
- A complete restore point was created with the existing private backup helper before staging. `READY`, application archive `gzip -t`, and database `pg_restore --list` checks passed; configured volumes were backed up by the helper.
- Uploaded archives and manifests, all **210 released files**, the staged/runtime image and Nginx configuration passed verification. Digest manifests use LF newlines for the Alpine checksum reader.
- Active frontend content matches the release manifest. Public `/` and its cache-busting equivalent return the exact new index digest. The main public CSS digest matches the staged build. API health is HTTP 200 / `status=UP`; site entry and Nginx checks pass.
- Browser inspection on the real HTTPS site confirmed the organic shell, dark About/Blog, light Blog/Music/Apps/Auth, and the AI town map after its atlas finished loading. At 375px, About and Apps remained within the viewport and the heading clears compact navigation.
- About public stats settled to **12 posts / 3 categories / 4 tags** in desktop night and phone day checks. Loading placeholders were allowed to settle before final inspection.
- AI map atlas returned HTTP 200 and the actual 128 x 128 scene rendered. No captured browser JavaScript errors or observed document horizontal overflow in these checks.
- An existing browser session retained an older cached main document. A fresh session at the ordinary public URL loaded the new bundle; versioned entry URLs also load the new document. An already-open old page may need a full refresh.

## Existing checks outside this release

The deployment helper's offline suite currently has **28 passing tests and one pre-existing failure**: the backend wallpaper environment example now contains `WALLPAPER_DISCOVERY_PAGE_SIZE=72`, while its test still expects `24`. This source/example assertion is unrelated to the frontend artifact workflow; it was recorded rather than changing backend configuration or tests during a UI deployment. The remaining 28 helper checks were run separately and pass.

The old optional `check-town-release.mjs` is absent from the approved revision. No success is claimed for that missing gate. Existing static resources were instead hash-verified in the staged/live image, and the actual town atlas/scene was verified in the production browser.

## Recovery

- Verified full restore point: `/opt/shizuki-site-backups/snapshot-20261108-160355-cc258c79287d`.
- Previous frontend image: `sha256:9075ed51816fe5fe632c135311b5811d3b8ae2116ca900c20392272358237d31`.
- Pinned rollback tag: `shizuki-site/site:before-organic-cc258c79287d`.
- Staging/manifests: `/opt/shizuki-site-releases/20261108-organic-cc258c79287d`.

The activation executor was configured to restore the pinned previous frontend image and its prior frontend marker on any activation or verification failure, then recheck health. Activation succeeded without rollback. The release lock was removed. All deployment tasks are complete; the following documentation commit records the release and does not require rebuilding the frontend artifact.
