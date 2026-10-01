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
