## 1. Upstream Review

- [x] 1.1 Download stable Folia v0.7.8 and confirm release tag `9cf8220`.
- [x] 1.2 Review release notes and compare the bridge, startup, Vite base, playback-store, and Cadenza integration seams against v0.7.7.
- [ ] 1.3 Read the existing fork's exact base commit, branch state, and local diff before integrating.

## 2. Fork Merge

- [ ] 2.1 Create a recovery ref from the clean `folia-embed` branch.
- [ ] 2.2 Merge upstream v0.7.8 into the fork and resolve conflicts while retaining Shizuki embed behavior.
- [ ] 2.3 Confirm the bridge, `/music/` base path, gateway configuration, and Cadenza fix remain present.

## 3. Verification and Records

- [ ] 3.1 Run the fork's typecheck, focused tests, and production build; fix regressions.
- [ ] 3.2 Update the AGPL patch snapshot and deployment version notes from the verified fork diff.
- [ ] 3.3 Run strict OpenSpec validation and record final local Git status. Do not deploy or push.

> Current blocker: SSH authentication from this workstation to `111.228.35.186` is unavailable. Tasks 1.3 onward require the existing fork checkout to be accessible through a loaded SSH key or a local clone path.
