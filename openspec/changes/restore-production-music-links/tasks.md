## 1. Reproduction and operations guidance

- [x] 1.1 Add a deterministic, red-capable production music smoke check that verifies a representative track can resolve and serve media without exposing full URLs or credentials.
- [x] 1.2 Run the smoke check against `site.shizuki.online` and record the exact failing stage before any server mutation.
- [x] 1.3 Write the detailed music operations runbook covering topology, symptoms, layered checks, safe fixes, rollback, security, and acceptance criteria.

## 2. Production diagnosis

- [x] 2.1 Inspect the personal server's Compose state, health, recent targeted logs, and music configuration presence using read-only, redacted commands.
- [x] 2.2 Rank three to five falsifiable hypotheses and test them one variable at a time with container-internal and upstream probes.
- [x] 2.3 Document the confirmed root cause and the minimal repair/rollback decision without persisting secrets.

## 3. Repair and regression protection

- [x] 3.1 Back up the affected runtime configuration or record the recoverable pre-change state, then apply the smallest production repair to the relevant music service only.
- [x] 3.2 Reflect any non-secret durable configuration, code, or operational safeguard required to prevent redeployment regression in the repository.
- [x] 3.3 Re-run the original smoke check and representative media request until the production path is green, or restore the pre-change state if the hypothesis is falsified.

## 4. Verification and handoff

- [x] 4.1 Run focused tests, lint/build checks, `openspec validate --strict`, and a credential/temporary-URL leakage review.
- [x] 4.2 Update the runbook incident section with the root cause, repair, rollback, and post-repair evidence.
- [x] 4.3 Update OpenSpec task state, validate the change, review `git status`, and create the required local conventional commit without pushing.
