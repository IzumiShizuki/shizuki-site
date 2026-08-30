## Context

The deployer runs on Windows, connects to the single personal-site host over Paramiko, creates an external restore point, synchronizes an approved repository projection into `/opt/shizuki-site`, rebuilds Compose services, and applies API/site health gates. Its full synchronizer recursively walks about 1,000 remote directories through SFTP before comparing file size and mtime, so even a one-file update incurs thousands of network round trips. Backend image source changes also invalidate the Maven build layer, whose repository is not currently persisted between invalidated layers.

The server now has a `.deployed-commit` marker written only after all deployment gates pass. Failed deployments restore the previous application archive, which includes the previous marker, so it is a suitable optimization hint when validated against the local Git graph. It is not treated as authorization or as the sole recovery record.

## Goals / Non-Goals

**Goals:**

- Make the common clean-master, linear-history update proportional to the Git delta rather than the repository size.
- Keep full reconciliation as a compatibility and drift-recovery fallback.
- Detect transfer corruption before starting a new image build.
- Reuse Maven downloads across backend source rebuilds.
- Avoid downtime and churn from recreating unchanged Compose services.
- Make remaining deployment cost visible by phase.

**Non-Goals:**

- Removing pre-deployment database, volume, or configuration backups.
- Replacing SSH/known-host verification, changing the production host boundary, or storing credentials.
- Building or publishing images in a new CI registry in this change.
- Automatically trusting arbitrary server-side source edits outside the recorded deployment workflow.
- Optimizing database backup size or changing production feature flags.

## Decisions

### 1. Use the deployed commit as a validated Git delta base

Before synchronization, the local deployer reads the remote marker once. It accepts the incremental path only when the value is a full hexadecimal commit id, resolves as a local commit, and is an ancestor of the already-validated target `master` commit. Git name-status output is parsed into independent upload and deletion sets; renames become an old-path deletion plus a new-path upload.

This avoids the high-latency remote tree walk and remains correct for the normal linear master workflow. A remote manifest was considered, but it can become stale independently of Git and would require a second consistency protocol. `rsync` was considered, but it is not guaranteed to exist on the Windows client or server and would add another executable dependency.

### 2. Keep the current full synchronizer as a fail-closed fallback

Missing markers, non-ancestor history, unknown commits, parsing problems, or unsafe path shapes cause a clearly logged fallback to the existing full reconciliation. Incremental mode never broadens the payload: every old and new path passes the same exclusion/protection predicates used by full synchronization.

The fallback makes the optimization backward compatible with first deployments, manual recovery, history rewrites, and servers created before commit recording existed.

### 3. Verify only the small changed set after transfer

Incremental uploads retain mode/mtime behavior and are re-read through the established SFTP channel to compare SHA-256 with the local file. This adds one extra transfer per changed file but keeps complexity proportional to the delta and avoids assuming a host-side hashing utility. Deletions use exact validated relative paths and recursive removal only at that resolved target.

Uploading a single tar archive was considered. Although it reduces round trips, safe extraction, deletion semantics, Windows permission handling, and protected-path exclusions would make the archive protocol more complex than the expected small Git deltas.

### 4. Persist Maven repository data with a BuildKit cache mount

The backend Dockerfile declares a modern Dockerfile syntax and mounts a named, locked cache at `/root/.m2/repository` for the Maven package step. The build stage starts from a fresh filesystem, so `clean` is removed and `package` remains the build goal. The first build still downloads dependencies; later invalidated source builds reuse them.

A project-local `.m2` directory was rejected because it would enlarge the build context and risk accidental repository pollution. Baking all dependencies into a separate image layer was also rejected because the multi-module POM layout makes that layer brittle and still benefits from the same cache mount.

### 5. Let Compose decide which services need replacement

The remote runner keeps `docker compose build` so every declared image remains buildable and cacheable, but changes `up` from `--force-recreate` to the normal convergent `up -d --no-build`. Compose then recreates services only when their image or configuration changed. Health ordering and final health gates remain unchanged.

Path-to-service build planning was considered but deferred: the current build step becomes comparatively cheap with image/Maven caches, while an incomplete path map could silently omit a required shared-image rebuild.

### 6. Time the existing safety phases

The local update flow records monotonic elapsed time after backup, sync, rebuild polling, and post-deploy verification. Logs include phase names and durations only; private database commands and credentials remain suppressed.

## Risks / Trade-offs

- [The remote marker is correct but files were edited manually afterward] → Incremental mode assumes deployment-managed source; operators can remove the marker to force full reconciliation, and any invalid/missing marker automatically falls back.
- [A force-push makes the old deployment non-ancestral] → The ancestry check rejects incremental mode and performs full reconciliation.
- [Git rename/copy output is parsed incorrectly] → Use a NUL-delimited parser with focused tests for add, modify, delete, rename, copy, and excluded paths.
- [BuildKit cache grows over time] → Use a named Docker builder cache that can be inspected/pruned independently; do not place it in application volumes or backups.
- [Removing force recreation leaves a stale unhealthy service] → Compose still replaces changed images/configuration, and the API/site health gates fail the deployment if the resulting application is unhealthy.

## Migration Plan

1. Add offline tests for marker validation, Git delta parsing, protected-path filtering, transfer verification, runner flags, and Dockerfile cache syntax.
2. Implement incremental sync behind automatic eligibility checks while retaining the existing full function unchanged.
3. Deploy once from a clean master whose server marker is already present; record phase timings and confirm the incremental path is selected.
4. Verify the server marker, API/site health, service states, and a new READY snapshot.
5. To roll back the optimization, restore the previous deployer/Dockerfile/runner commit; removing `.deployed-commit` forces the old full-reconciliation behavior without changing application data.
