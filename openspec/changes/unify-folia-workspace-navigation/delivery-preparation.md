# Delivery preparation

## Baseline and restore assets

Personal server is `111.228.35.186`. Before this change its site implementation is `8c31033c`, with source-document tip `23945b4e`; Folia source is `822bcc5c`. Running Folia image is healthy:

`sha256:1fd5aad4a99c51cc8cc3e26f18cc8b1a1448ae3587b28891c8b0e0c228889890`

Existing site restore point `snapshot-20261001-144905-8c31033c15b8` is retained (804 MiB). Existing Folia tagged rollback images are retained. The remote source checkout is clean; production gateway has no mount into that checkout.

## Deployment capacity

The initial server filesystem had about 200 MiB free. Identified and removed only regenerable build material:

- BuildKit source-context record `r5089jy4bfp5qaco90vgv2lac`, reclaimable/private/mutable, 1.312 GB, last used about four hours earlier. Pruning was scoped to this exact ID. The combined `shared=false` filter initially reclaimed zero bytes; ID-only deletion then reclaimed the named record.
- Ignored generated `/opt/folia/folia-major-main/node_modules` (about 1.1 GiB). Verified its canonical absolute path, that it was not a symlink, Git-ignore status, and that the running gateway had no source-checkout mount before removing it.

Available space increased to about **2.5 GiB**. Gateway remains healthy at the unchanged baseline image, and Git status stays clean. No rollback image, site restore point, Docker volume or private configuration was removed.

Targeted cache pruning follows the installed CLI and [Docker's exact-ID filter documentation](https://docs.docker.com/reference/cli/docker/buildx/prune/). New Folia builds must use a clean Git archive rather than the old checkout's ignored dependencies/dist. Keep dependency installation cached independently of commit metadata where possible, and verify space before the site backup/build.

Final commit/image/asset identities and acceptance outcomes belong in verification-report.md after delivery.

## Verified build and second capacity check

Folia implementation `9b2346e2` was transferred as a verified incremental Git bundle (SHA-256 `32c1252a5d9942a4a5da76d7fb6af42c7023702c192702f412c39529fa3e9f01`), fast-forwarded into the clean server checkout and built from its exact Git archive. An external `workspace.Dockerfile` keeps release metadata after dependency installation; the actual new revision is both build metadata and OCI revision label. The expected dependency cache was not reused, so npm ci actually ran and succeeded. Build exit status is 0.

After this build only 924 MiB remained, insufficient for the site's retained backup plus build. Inspected the BuildKit parent graph and pruned exactly two old, private, reclaimable presentation-generator cache branches: leaf `rm3dld0dghfel0c7dwbnh8jfj` and parent `0mt3oqxq757birigatlvyjv8b`, then leaf `ytoxfvjt2euuamr60e1ut03kv` and parent `nnzko7rxtwevbox3x6z36uocu` (about 798.9 MB each parent). Parent-only attempts initially reclaimed zero because the leaf referenced them. An exact-ID attempt for old private PHP cache `r5f4cy2culzizsmx4cyga3599` also reclaimed zero; its children/image data were not removed. No broad image/volume/cache prune was performed.

Capacity returned to **2.3 GiB**. Retained all rollback images, volumes, private configurations and site restore points. The new Folia gateway then became healthy with image `sha256:ff9b0f6fbb43919cdff3f5299ec117ee6cc84ca6ef9d820ae5229e21a58a22fb`, revision label `9b2346e2779f51805ed754b6b151d944dfec846f`; `/music/` returned HTTP 200. Additional rollback tag is `folia-local/gateway:backup-before-workspace-20261001-822bcc5c`.

## Site release and final capacity gate

The clean site release `5f08281c28c6742f69d60c1c1ea9d1070e29c513` was deployed with the existing `server_deploy.py update` flow. It retained restore point `snapshot-20261001-191906-5f08281c28c6`, verified all 51 uploaded files (zero deletes), rebuilt only the site frontend, and passed both API health and site-entry gates. Total deployment time was 337.7 seconds; the deployed-commit marker matches the release. Other site consumers remain running.

The frontend dependency layer also missed cache and pnpm installed successfully. During the build, space dropped to 376 MiB. After checking the parent graph and private/reclaimable status, removed only old converter build-cache leaf `zoeorn8x5q19gkkx8r2fq688j` and its parent `qnskhv2azcccfei2rw0psdka9` (992.4 MB; last used about 46–47 hours earlier). The document-converter runtime image/container remained unchanged and healthy. Capacity rose to 1.1 GiB; the post-deployment check reported 935 MiB available. All rollback images, backups, persistent volumes and private configuration remain retained.

Fresh-browser acceptance subsequently exposed an interrupted Lattice exit/reentry rendering defect. Both initial consumers are healthy, but a verified fork followup and repeated visual/input acceptance are required before this delivery is complete.

## Rendered transition followup deployment

Fork implementation `311b98d587b90db82cea0969f19083a28deff4e2` was transferred from the running `9b2346e2` source as a verified bundle (SHA-256 `c1ec4856b24735063f8a7f6872ea5eeeae973a7a8648cfb7c16df60a733a9965`) and fast-forwarded into the clean checkout. It was again built from its exact Git archive. Although dependency metadata stayed fixed after the first build, npm ci again missed cache and ran; no dependency-cache reuse is claimed. Build status is 0.

Available filesystem space reached zero during that build, which still completed successfully. Before replacing the gateway, verified private/reclaimable cache graph entries and pruned only the remaining 47-hour-old converter branch: `mhvlidgyrk8qel07iofp3lp8j` → `re61f58tmjy4ky5mwmcvcwdt7` (737.5 MB) → `0hvm57fqwy9s2fwjuz2fo2470`, plus `mkh54rklxkutygmh1r48mv9zp` → `r2ca3rel3fodvqshw12lqdfq2` (627.5 MB). Then removed two 9–10-day-old private backend build-cache leaf/parent pairs: `xlrm00sq19ezr6oix75aej9x4` → `zew10x7690no3jbbtrirea9hs` and `j8c62nug9obyb4c5qoun5se3q` → `os5xsv6tx1x9dpfeqqy43wqou` (about 288.2 MB per pair). Runtime images and containers were not pruned. Free space rose to 1,006 MiB.

Preserved the initial workspace gateway as `folia-local/gateway:backup-before-transition-20261001-9b2346e2` before activation. New running image is `sha256:2be052ad9e949c6e010bf028616806dac7dd78ecbf926d1ebc5a5f26f975ed46`, with OCI revision `311b98d587b90db82cea0969f19083a28deff4e2`. Compose's health wait passed and the external `/music/` entry returned HTTP 200. Source Git status stayed clean. All earlier rollback tags, source stash, site restore points and persistent data remain retained.

## Queue-entry consumer followup preparation, 2026-10-02

Visual acceptance found the distinct current-entry/lyric-input defect recorded in diagnosis.md. Verified fork followup `9ed6ab2204d8acef0019d36fe726867c9494c089` was pushed and transferred from the server's `311b98d5` using a bundle with SHA-256 `922e8027fafd4a27a88addb63aee19db03fff32e52fc1f79bb41f0f9c0f44f61`. The source checkout fast-forwarded cleanly and the next build again uses an exact Git archive.

Before starting the build, inspected the nine-day-old PHP/Meting build-cache parent chain from leaf `k3jh93aifhpbixirv7hyhl5kj` to `r5f4cy2culzizsmx4cyga3599`. All 20 records were private and reclaimable, with no branching child references. Pruned only those exact IDs in leaf-to-parent order, reclaiming about 590 MB; this time the previously retained PHP descendants were explicitly removed. Free space rose from 860 MiB to 1.4 GiB. Runtime gateway, Meting, document converter, presentation generator and other site consumers remain unchanged and running. Existing images, source stash, backups, volumes and private configurations remain retained. The dependency layer again missed cache and npm ci is actually running; no cache hit is claimed.

The clean archive build completed with status 0. Before activation, verified OCI revision `9ed6ab2204d8acef0019d36fe726867c9494c089`, exact source HEAD and clean source status. Its image is `sha256:44ba465e0f1eea3aeefa9389360473c49d70465fe53783108a101fd095352981`; the served module is `main-DzduPTL9.js`. Preserved the previous gateway image as `folia-local/gateway:backup-before-entry-20261002-311b98d5`, then recreated only `gateway` and passed Compose's health wait and external `/music/` health. Other site consumers were unchanged and remain running.

After the build left only 120 MiB free, checked and pruned four two-day-old private/reclaimable backend build-cache leaf/parent pairs: `vcp8nra6yi0akg5u5yvzduor2` → `184bz7sqbnsbmlmvqkbogikyy`, `i3g31bv1ky62rl98muljp0t80` → `g0bhwxckivre3h2o2p09bzpya`, `nv8dcm4emiwca3syt26hxrfod` → `mw0p4sa7x9m2z5jqza4k807p5`, and `cfqcendfysvv4excm9evb78w8` → `noybx0ietl8nbc2w8k3qrguax` (288.2 MB per pair). Their common dependency/base cache and Maven repository cache were retained. Removed only this task's three completed Git-archive build contexts (`workspace-build-9b2346e2779f`, `workspace-build-311b98d587b9`, `workspace-build-9ed6ab2204d8`) after verifying exact canonical paths, no symlinks, completed builds and no gateway mounts. Source checkout, bundles/build logs, backups and persistent data remain retained. Available space returned to **1.2 GiB**.

## Repeated poster-exit followup, 2026-10-02

The multi-cycle production defect and actual failing mounted Lattice regression are recorded in diagnosis.md. Verified implementation `7069103b4ce862f0e1f8befde5c48dbe778777f4` was pushed to the user fork, then transferred from `9ed6ab22` using the incremental bundle SHA-256 `9a456dda71a4cfeb6191290280915df5131d497598ca7535617de8a8b1807498`. Root independently passed 39 Folia suites / 247 tests, TypeScript and `/music/` production build. The server again built from the exact Git archive and npm ci actually ran; the dependency cache was not reused. Build completed with status 0.

With 104 MiB available during the build, freshly verified and pruned only private, reclaimable old cache records with no remaining child references. A 30-hour-old Vite builder chain was removed in leaf-to-parent order: `ys81zmkm8caq8hahy84i6tv0q` → `9df6565yx0xup23feryxxd7s3` → `ogvmv9ohezr8kmz91yu9qgusy` → `qd381ku6xrn8lpwcdakv8z1x8` → `ytzk3wzp61fxomc458jbeq45s` (about 336 MB). Six 28–48-hour-old site frontend output cache leaves were also removed: `x88sprjmph4xcyne70zct9ws0`, `xcrx49fmjo8plnx3xmo2i3keg`, `sclodvhr3l2sx9eqrl3gje09u`, `pnx1mf5w9dzmxqkvyurgo7pib`, `owt2nrh62ohkvg3ttmgdpvye1`, `i09btpoy1f9a5y4222cqyvob2` (about 87.5 MB each). This prunes BuildKit cache, not runtime images or the retained site restore points.

Preserved the old image as `folia-local/gateway:backup-before-posters-20261002-9ed6ab22`, verified the new image ID and OCI revision, and recreated only `gateway`. Running image is `sha256:1d74dd2d4bee41abd9832a6698f7a4144efc814ca46057740e792b71b1c2b529`, OCI revision `7069103b4ce862f0e1f8befde5c48dbe778777f4`. Gateway health and external `/music/` HTTP 200 passed; site frontend remains running. Fresh browser scripts identify `main-rROf5Ust.js` with the unchanged site `index-Bvvt1XEq.js`.

Final capacity cleanup removed only three old private source-context cache records (`gio7qszyehxg5dasdw3a4ktx5`, `vy9rumaa54fmttpa2a0hbilhp`, `i18w1t1r6x97g6jmxvzr6iygu`) and two 10–12-hour-old frontend output cache leaves (`wa4m3s9ocol5rkr81i2uo6x8b`, `kzz3qw1iqvalkdnu2lg4o26bd`), all freshly verified private/reclaimable and child-free. The completed `/opt/folia/workspace-build-7069103b4ce8` archive directory was removed after canonical-path/no-symlink/no-gateway-mount checks. Free space is **731 MiB**. All runtime images, rollback tags, source checkout/stash, source bundles/build logs, site backups, persistent volumes and private configuration remain retained. Future builds still need a capacity check; no broad prune was performed.

## Post-acceptance health check

After the final fresh-browser chain passed, an independent read-only SSH check confirmed the same healthy gateway image/revision, clean Folia source at `7069103b`, site marker `5f08281c`, running frontend, API status UP and HTTP 200 at site and `/music/`. The completed archive context is absent and the current site restore point still exists. Available capacity at this later check is **818 MiB**. Final public-source/documentation commits do not alter either deployed runtime.
