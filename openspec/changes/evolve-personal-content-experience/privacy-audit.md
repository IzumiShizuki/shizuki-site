# Privacy audit — `evolve-personal-content-experience` task 11.7

Audit date: 2026-08-29
Scope: the personal-content provider, nearby-weather, public/protected media gateway,
derivative-processing, audit, and storage-startup paths introduced or exercised by this
change.  This is a source-and-test audit; no deployment or external provider was called.

## Result

| Area | Result | Evidence |
| --- | --- | --- |
| Source attribution | Pass after remediation | `ProviderAttribution` and `NormalizedDailyQuote` require HTTPS source destinations; `HitokotoDailyQuoteProvider` constructs the stable source link from its validated UUID. `LocalQuoteCurationService` now rejects non-HTTPS, credential-bearing, fragment-bearing, and signed/sensitive URLs before they can be stored and returned in `DailyQuoteView`. |
| Provider HTTPS / SSRF boundary | Pass | `ExternalWidgetProviderPolicies` has fixed Open-Meteo and Hitokoto HTTPS origins. `ProviderHttpPolicy` rejects non-HTTPS, non-whitelisted hosts, non-443 ports, user-info, and fragments. `JdkProviderHttpTransport` rechecks the policy and uses `HttpClient.Redirect.NEVER`; provider implementations construct URLs from the fixed origin instead of accepting a caller URL. |
| Visitor coordinates | Pass, with ingress configuration warning | `NearbyWeatherService` requires consent, validates ranges, rounds coordinates, and derives an SHA-256 cache key from the rounded pair. `NearbyWeatherCache` is bounded process-local TTL state; the weather controller returns `Cache-Control: private, no-store, max-age=0` and never returns the coordinates. No snapshot mapper or durable site-Redis cache is injected into this flow. |
| Signed URLs and media routes | Pass | `MediaGatewayController` / `MediaOriginalDownloadController` stream bytes through same-origin routes and do not redirect. The route DTOs reject absolute URLs and keep an unlisted-media capability in a separate field rather than a query string. `MediaGatewayService` and `MediaOriginalDownloadService` do not call storage `generateGetUrl`. Gateway headers are controlled and tests assert that they contain neither OSS identifiers nor a redirect. |
| EXIF / embedded metadata | Pass | `DefaultPhotoUploadDraftValidator` keeps detection within protected processing context. `DefaultDerivativeOutputInspector` rejects EXIF, XMP, ICCP, GPS, camera, and device metadata; `OssMediaDerivativeProcessor` only approves an independently inspected public derivative. |
| OSS bucket/object identifiers in logs | Pass after remediation | Related failure, startup, and wallpaper-bootstrap logs no longer interpolate bucket/object-key values. `SensitiveMasker.maskText` now treats storage-identity material as sensitive, covering derivative-worker failure reasons and audit values. |

## Remediation applied during this audit

1. `LocalQuoteCurationService` previously accepted an HTTPS attribution URL containing
   user-info or a presigned-url query (for example `X-Amz-Signature`).  That URL can be
   returned to visitors.  It now rejects both forms through URI checks and
   `SensitiveMasker`; `LocalQuoteCurationServiceTest` covers both rejections.
2. `MediaDerivativeWorker.safeFailureReason` already uses `SensitiveMasker`, but free
   text containing `bucketName` / `objectKey` was not classified as sensitive.  The
   masker now redacts storage-identity material, with a `MediaDerivativeWorkerTest`.
3. `OssBucketStartupValidator` and `WallpaperBootstrapInitializer` logged configured
   bucket names and a bootstrap object key directly.  Their log and exception messages
   now use count/status/type-only diagnostics. `OssBucketStartupValidatorTest` verifies
   the thrown startup message does not disclose the configured bucket name.

## Test evidence

The following targeted Maven run completed successfully (all listed reports have zero
failures and zero errors):

```text
mvn -q -pl modules/content-module,libs/common-servlet,modules/media-module -am \
  -Dtest=LocalQuoteCurationServiceTest,AdminMutationAuditRecorderTest,MediaDerivativeWorkerTest, \
OssBucketStartupValidatorTest,WallpaperBootstrapInitializerTest,ProviderBoundaryTest, \
OpenMeteoWeatherProviderTest,HitokotoDailyQuoteProviderTest,NearbyWeatherServiceTest, \
NearbyWeatherCacheTest,SiteWeatherControllerTest,PublicAlbumQueryServiceTest, \
PublicMomentQueryServiceTest -Dsurefire.failIfNoSpecifiedTests=false test
```

The source tests provide the following direct checks:

- `ProviderBoundaryTest`, `OpenMeteoWeatherProviderTest`, and
  `HitokotoDailyQuoteProviderTest`: exact HTTPS provider endpoints, host policy,
  disabled-provider no-network behavior, and redirect/schema rejection.
- `NearbyWeatherServiceTest`, `NearbyWeatherCacheTest`, and
  `SiteWeatherControllerTest`: consent/range rejection before traffic, rounded/hash
  cache behavior, bounded non-durable cache, and no-store responses.
- `PublicAlbumQueryServiceTest`, `PublicMomentQueryServiceTest`,
  `MediaGatewayControllerTest`, `MediaGatewayServiceTest`,
  `MediaOriginalDownloadControllerTest`, and `MediaOriginalDownloadServiceTest`:
  opaque local routes, no storage redirect/generated URL, and no storage identity in
  browser response fields or headers.
- `DefaultDerivativeOutputInspectorTest` and `OssMediaDerivativeProcessorTest`: EXIF/
  XMP/ICCP rejection and no approval after unsafe derivative processing.
- `AdminMutationAuditRecorderTest`, `MediaDerivativeWorkerTest`,
  `LocalQuoteCurationServiceTest`, and `OssBucketStartupValidatorTest`: signed URL,
  coordinate, capability, storage-identifier, and attribution-link redaction paths.

## Remaining external-environment checks

1. `NearbyWeatherCallerKeyResolver` accepts `X-Forwarded-For` then `X-Real-IP` without
   a code-level trusted-proxy allowlist. It hashes the selected value and does not store
   a coordinate, but a client reaching the application directly could spoof the
   per-caller rate-limit identity. Production ingress must strip and overwrite these
   headers, or the resolver should be restricted to configured trusted proxies.
2. Exercise real Open-Meteo/Hitokoto egress through the production DNS, TLS, and proxy
   configuration. Confirm that a proxy cannot follow redirects or bypass the fixed-host
   policy.
3. Download a real GPS-tagged JPEG through the production media gateway after derivative
   processing and inspect the public derivative. Also inspect gateway, CDN, and reverse
   proxy headers for storage names, object keys, redirects, or capability values.
4. Review the deployed application, reverse-proxy, CDN, and log-aggregation formats.
   The application code keeps capabilities out of URLs, but infrastructure must not log
   sensitive request headers or reintroduce request-body/query capture.
