## 1. Implement

- [x] 1.1 Build the large manual carousel with wraparound controls, direct selection, keyboard and touch navigation, and content-change reset.
- [x] 1.2 Integrate it into the shared personal panel and adapt recommendation, character and search preview proportions.

## 2. Verify and deliver

- [x] 2.1 Run interaction regressions and existing daily-art tests/build; inspect desktop and phone layouts and image bounds.
- [x] 2.2 Verify against the requirements, validate OpenSpec, and commit/push only task-owned files while preserving TopMenu edits.
- [x] 2.3 Publish the verified frontend with rollback identity, verify the real personal-page carousel, and record deployment evidence.

Handoff: carousel implementation f951682a is on origin/master and deployed. Only site was recreated; backend and private configuration are unchanged. The final record commit contains OpenSpec documentation only. The existing TopMenu.vue edit remains byte-for-byte intact. Preview server was stopped and exact temporary fixture files removed; release manifests, screenshots and rollback artifacts are retained. No unfinished implementation or delivery tasks; change remains unarchived.
