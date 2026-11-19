## 1. Catalogue improvements

- [x] Maintain search context and improve tag discoverability.
- [x] Guard request order, defer covers and validate error/pagination behavior.
- [x] Run focused tests and isolated desktop/narrow Edge QA.

## Verification

- 22 focused frontend tests, 60 controller/service tests (with synthetic upstream), strict OpenSpec validation, and the production frontend build passed.
- Edge 1366px desktop and 390px touch: verified localized display and original-name tag lookup, keyword plus tag combination, keyboard detail navigation, returning with the same query, retry and genuine empty results. All requests were served with synthetic data or loopback. Existing anonymous-denial routing and default age filter remain covered.
- Before scrolling through 20 synthetic covers, baseline requested 20 on both clients; candidate requested 15 on desktop and 12 on touch. Counts describe this fixture, not live time.
