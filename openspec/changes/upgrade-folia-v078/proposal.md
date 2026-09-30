## Why

Folia published stable v0.7.8 on 2026-09-23, while the Shizuki integration records a v0.7.7-based fork. The fork should receive upstream fixes and features without losing its embed bridge, `/music/` base path, or deployment-specific gateway changes.

## What Changes

- Review the v0.7.8 source and release notes against the maintained Folia fork.
- Merge upstream v0.7.8 into the fork's `folia-embed` branch while preserving Shizuki-specific changes.
- Reconcile the published bridge/patch snapshot and deployment version notes with the merged source.
- Validate the resulting fork build and relevant integration behavior. Do not deploy or push as part of this change.

## Capabilities

### New Capabilities

None.

### Modified Capabilities

None. This is an upstream source synchronization; the existing embedded player contract is to remain unchanged.

## Impact

- Folia fork source at `/opt/folia/folia-major-main` on the Shizuki server, branch `folia-embed`.
- Public AGPL patch/bridge documentation in `third_party/folia-major/` and deployment notes in `deploy/folia/README.md`.
- Folia build/dependency state; no Shizuki API or database changes.
