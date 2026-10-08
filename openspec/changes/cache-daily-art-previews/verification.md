## Verification: cache-daily-art-previews

| Dimension | Status |
| --- | --- |
| Completeness | 7/7 tasks complete; production delivery gates passed |
| Correctness | 3/3 requirements and all 7 scenarios covered |
| Coherence | Bounded process-local cache, fixed download locks, fresh safety validation and existing browser policy match design |

## Regression and requirement coverage

- `PixivClientTest.repeatPreviewsReuseDownloadedImageAfterFreshSafetyCheck` initially failed: expected one upstream image GET but received two, while both calls fetched current metadata. The same regression passes after the cache is inserted only after validation.
- Repeat/concurrent reuse: `PixivClient.java:169` and `PixivPreviewCache.java:34`; repeat test and a latch-controlled concurrent test enforce one image download through the actual preview path.
- Expiry and changed image source: four `PixivPreviewCacheTest` cases enforce non-sliding expiry, LRU entry and byte limits, oversized bypass and expired-entry cleanup. `cachedImageDoesNotHideValidationFailureOrChangedSource` verifies current URL changes fetch new bytes.
- Failure retry: `failedOrUnsupportedDownloadsCanBeRetried` proves neither unsupported MIME nor upstream 503 is stored as a successful image.
- Current verification: `PixivClient.java:152` fetches fresh detail and checks classification, visibility, identity and source before cache access. Warm-cache tests cover R-18/R-18G, unlisted/unclassified artwork, validation failure, hostile URL and wrong artwork identity. Preview transport carries no Cookie; existing authenticated-follow regression remains applicable.
- HTTP validators: `DailyArtPreviewController.java:25` supplies the ETag after validation. Three MockMvc tests enforce 304/no body for a matching validator, 200/new bytes for changed content, and failure instead of conditional success when validation fails. Existing max-age=1800, public and nosniff remain.

## Commands and results

Java 17 was activated using the canonical helper. The relevant Maven reactor test command passed 25 tests (PixivClientTest 12, PixivPreviewCacheTest 4, DailyArtPreviewControllerTest 3, DailyArtServiceTest 6), with no failures/errors:

```powershell
mvn -pl modules/user-module -am '-Dtest=PixivClientTest,PixivPreviewCacheTest,DailyArtPreviewControllerTest,DailyArtServiceTest' '-Dsurefire.failIfNoSpecifiedTests=false' test -q
```

The isolated, clean release checkout at `e50c7c3d66d60cced75f33d8542dd576260e4cdb` passed `mvn -pl apps/monolith-app -am -DskipTests package -q`. The packaged user-service library contains the cache/client/controller classes. JAR size: 74,817,122 bytes; SHA-256: `3479ad7731b06c9dcd52ea05fbcc37830b72526261e5668dd53f8e215666af38`.

Strict OpenSpec validation and `git diff --check` passed. The implementation was committed and pushed to master; unrelated TopMenu and concurrent wallpaper work were excluded. TopMenu fingerprint remains `76bdff18ea0afec40c38f1294b5d9351797f68529aefb8d810f70eb650601092`.

## Findings and lifecycle

The cause was repeated binary downloads despite already persisted daily selections. The regression distinguishes fresh safety metadata requests from image requests so caching cannot accidentally mask the verification step. No temporary debug instrumentation or disposable prototypes were introduced. Release manifest, executor, checkpoint and test/build outputs are retained as delivery evidence outside Git. In-memory images expire within 24 hours and clear on backend restart; upstream metadata latency remains on server requests by design.

## Production validation

The pinned backend was deployed on 2026-10-08. The same 435,598-byte safe preview took 2.622 seconds cold, then 0.363 and 0.379 seconds warm, compared with the pre-release consecutive requests of 4.463, 4.563 and 4.994 seconds. Measurements use the same server-local HTTP path and include the fresh metadata safety check. Conditional requests returned 304 with zero image bytes both directly and through the public HTTPS site. This measures server response behavior, not every user's network or browser rendering time.

Readiness, exact runtime JAR hash, 401 on private anonymous settings, 400 on invalid preview IDs, source hashes and unchanged private configuration/frontend/other container identities passed. See deployment-report.md and the retained credential-free release.json for recovery identities and detailed measurements.

No critical, warning or suggestion issues remain. No verification dimension was skipped. The change remains unarchived.
