## Why

Folia's latest stable release is v0.7.11, published on 2026-09-29 at upstream commit `6fe68d8`. The Shizuki server fork was based on v0.7.7 and needs the intervening fixes and features while retaining its embed bridge, `/music/` asset base, and deployment-specific gateway configuration.

## What Changes

- Review the official v0.7.8–v0.7.11 release notes and source changes against the maintained Folia fork.
- Merge upstream v0.7.11 into the fork's `folia-embed` branch while preserving Shizuki integration and existing work in progress.
- Refresh the public AGPL source snapshot and deployment notes from the resulting merge.
- Validate the merged fork and its embedded-player integration. Do not deploy or push as part of this change.

## Capabilities

### New Capabilities

None.

### Modified Capabilities

None. This is an upstream source synchronization; the existing embedded-player contract remains unchanged.

## Impact

- Folia fork source at `/opt/folia/folia-major-main`, branch `folia-embed`.
- Public AGPL patch/source documentation in `third_party/folia-major/` and deployment notes in `deploy/folia/README.md`.
- Folia dependency and build state; no Shizuki API or database changes.
