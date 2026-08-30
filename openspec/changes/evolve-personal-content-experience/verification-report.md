# Verification report — `evolve-personal-content-experience`

Verification date: 2026-08-29
Scope: local build, automated tests, browser checks, and the remaining external gates.
No production feature flag, deployment, push, provider request, or destructive operation was performed.

## Automated verification

### Backend

- Java runtime: Temurin 17.0.19.
- `mvn -pl apps/monolith-app -am -DskipTests package`: pass for all ten reactor modules.
- Reactor test run excluding ten host-loopback-dependent HTTP client classes: pass for all ten modules on 2026-08-30.
- Studio feature-gate integration tests pass: disabled management surfaces return
  `404 / FEATURE_DISABLED` before invoking content or media services.
- Nearby-weather caller-key tests pass: forwarding headers are ignored by default and are
  accepted only from an explicitly configured transport peer.
- `SpringBeanConstructorContractTest`: pass after making the intended production constructors explicit.
- Provider/failure gate: Open-Meteo, Hitokoto, Redis and OSS success, invalid-response,
  timeout, last-good, lock, no-stampede, metadata-rejection and redacted-failure tests pass.
- Tracked media configuration now defaults to the personal-site `shizuki-private` /
  `shizuki-public` namespace; startup still validates the explicitly configured OSS endpoint,
  credentials and bucket existence before serving traffic.
- PostgreSQL Testcontainers migration integration tests were skipped because Docker is not
  available on this host.
- The default unfiltered suite is not recorded as green: this Windows host returns
  `Unable to establish loopback connection` from existing JDK `HttpClient` / local
  `HttpServer` tests. The excluded class list is:
  `SpotifyOAuthProviderStrategyTest`, `NcmQrAuthClientTest`, `MeguriGatewayServiceTest`,
  `PostVideoConverterClientTest`, `PostPresentationGeneratorClientTest`,
  `LightAppBalanceBillSyncAgentClientTest`, `AsmrMusicProviderFailoverTest`,
  `TranslateToolServiceTest`, `MetingMusicProviderTest`, and `AdminOpsInsightServiceTest`.

### Frontend

- Production build: pass on 2026-08-30.
- Personal-content, motion-preference, About/Blog failure-isolation, weather and quote
  targeted Vitest groups: pass.
- The full suite reports 870/870 passing across 175 test files. The two earlier wallpaper
  query/filter regressions were reproduced and fixed without weakening their assertions.
- `package.json` does not define a lint script, so the requested lint gate cannot be run
  without first selecting and configuring a lint tool.

## Browser verification

The Vite application was exercised in the Codex in-app Chromium browser at the exact
viewports required by task 11.4.

| Viewport | Routes and state checked | Result |
| --- | --- | --- |
| `1440x900` | About, Blog, Albums, Moments; daytime/immersive and night/soothing; full navigation and Site menu | Desktop three-column composition, sticky side regions, compact content rails and menus rendered without horizontal page overflow. |
| `1024x768` | About and Blog; responsive navigation | Two-column/tablet composition rendered without horizontal page overflow. |
| `390x844` | About, Blog, Albums, Moments; night/soothing; mobile navigation and Life drawer | Single-column composition rendered without horizontal page overflow; visible primary touch targets measured 44–48 px. |

Additional checks:

- Theme and motion state are reflected on the document as `data-theme-mode="night"`
  and `data-effective-motion-mode="soothing"`; the selected controls remain active
  after navigation/reload.
- The desktop Site dialog exposes About, Albums and Moments plus honest recent-content
  failure states. Escape closes it and returns focus to the Site trigger.
- The mobile Life drawer exposes the same destinations and returns focus to the Life
  trigger when closed.
- Albums and Moments show honest unavailable/empty copy and no content images when the
  API is unavailable; avatar or wallpaper assets are not presented as album/moment data.
- Blog main content remains readable while album/moment auxiliary requests fail.
- Direct anonymous navigation to `/admin` redirects to `/auth?redirect=/admin&mode=login`.
- No browser console warnings or errors were captured during the final inspected route.

## Gates that still require a suitable environment

1. Run the unfiltered backend suite on a host where JDK loopback sockets work, and run
   the PostgreSQL migration integration tests with Docker or the target PostgreSQL
   environment.
2. Select and add a lint tool in a separate change if linting is to become a repository
   gate; the current package does not define a lint script.
3. Sign in with a non-production test administrator to inspect the authenticated studio
   at all three viewports. Do not use saved credentials or submit a login as part of an
   unattended browser check.
4. Seed or point a non-production environment at real published public/unlisted content
   to manually verify card transitions, share fallback, lightbox navigation, focus
   return, authorized download behavior, touch gestures and media-error recovery.
5. Complete the target PostgreSQL/OSS exercise with GPS JPEG, disguised MIME, oversized,
   corrupt and animated images, then execute the reverse-proxy/CDN/log checks listed in
   `privacy-audit.md`.

## Specification validation

`openspec validate evolve-personal-content-experience --type change --strict --no-interactive`
passes. Final acceptance remains open until the environmental gates above are complete.
