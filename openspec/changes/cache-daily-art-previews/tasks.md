## 1. Reproduce

- [x] 1.1 Capture production repeated-preview timings and run a deterministic failing repeat-download regression.

## 2. Implement

- [x] 2.1 Add bounded expiring image caching and concurrent download coalescing behind fresh artwork validation.
- [x] 2.2 Add content validators and conditional HTTP responses after validation.
- [x] 2.3 Cover warm safety rejection, changed URLs, retry, concurrency, eviction/expiry and HTTP conditionals with regressions.

## 3. Verify and deliver

- [x] 3.1 Run applicable tests, isolated backend build, strict OpenSpec validation and specification verification.
- [x] 3.2 Commit and push the verified change while preserving unrelated workspace edits.
- [x] 3.3 Deploy verified backend artifact with recovery checkpoint; verify warm timings, conditional responses, runtime identity and unchanged private configuration/frontend.
