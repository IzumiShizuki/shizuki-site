## 1. Reproduce and audit the complete boundary

- [x] 1.1 Capture independently runnable RED regressions for stable cold entry, pending selection and delayed lyrics; record measured browser request phases.
- [x] 1.2 Audit host initialization/queue return, Folia bootstrap/session consumer and backend URL/lyric/cache boundaries; document confirmed causes and uncovered risks.

## 2. Correct host and engine behavior

- [x] 2.1 Deliver the authoritative current session on every activation before playback navigation, including parked paused reentry and nonnumeric queue entries.
- [x] 2.2 Preserve source queue and browse context on rapid exit; reject stale initialization or earlier queue-loading results.
- [x] 2.3 Commit selected metadata immediately and start available audio independently of remote lyrics; prefer usable inline lyrics and guard late results by entry/account/generation.
- [x] 2.4 Reuse eligible in-flight/prepared URL work, deduplicate optional requests and prevent speculative work from delaying foreground selection.

## 3. Verify independently and deliver

- [x] 3.1 Run realistic deferred URL/lyric/bootstrap/account/duplicate-entry regressions and review every changed boundary independently. Deployed empty-source errors, canceled-handler alerts and source profile/count degradation were reproduced and corrected; root reviewed ownership, reset and metadata precedence.
- [x] 3.2 Complete appropriate frontend/backend/fork checks and production builds, strict OpenSpec validation and a scenario-mapped verification report. Final frontend 1547 passed, backend 53 passed, actual unchanged fork 19 passed; final production build and strict validation passed.
- [x] 3.3 Commit and push authorized owner branches; integrate only verified music changes into the clean release branch and deploy exact artifacts to 111.228.35.186 with capacity and rollback checks. Application d42c34bf, all 230 runtime files verified; rollback image/source and READY snapshot retained.
- [x] 3.4 Repeat the original cold/rapid entry and return browser loops on deployed artifacts, measure before/after latency and record exact manifests and remaining external limits. Final asset verified in a fresh page; song/queue/color/seek/pause/Esc, same-source 2238 total and cross-source 33-song return pass; request phases and warm/bootstrap distinction recorded in verification.md.
- Delivery housekeeping: automatic approval rejected both the inspected recursive cleanup and the safer explicit nonrecursive deletion of the 34 task-owned temporary files, returning only `blocked by policy`. `.codex-tmp/` is retained and ignored; the final sanitized evidence has also been copied to the persistent visualization directory. No implementation or deployed-acceptance task remains open.
