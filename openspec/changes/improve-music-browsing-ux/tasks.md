## 1. Implementation

- [x] Improve mobile search lifecycle and playlist browsing.
- [x] Improve desktop keyboard/search states and recovery.

## 2. Verification

- [x] Verify 49 targeted Vitest tests, production build, and strict OpenSpec validation.
- [x] In isolated Edge, verify 1280px desktop keyboard search/retry/clear/play and 360px touch search/retry/playlist/back. Synthetic 503 recovery and stale-request supersession pass on both; playlist browsing starts no audio. No live provider or signed-in account was used.
