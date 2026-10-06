# Verification: cloud unlikes and personal NetEase podcasts

## Result

| Dimension | Result |
| --- | --- |
| Completeness | 7/7 tasks; all 5 requirements implemented |
| Correctness | All 10 scenarios mapped to code and applicable checks |
| Coherence | Existing account credentials, shared queue, explicit acknowledgements and account/route generations retained |

## Requirement and scenario evidence

| Requirement | Implementation | Verification |
| --- | --- | --- |
| Remove a like from the cloud liked playlist | `PlatformMusicLibraryService.unlikePlaylistTrack`, platform routing in `MediaServiceImpl`, explicit `/like` string state and cache bypass in `NeteaseCookieProvider`, acknowledged local row removal in `MusicLibraryPage` | Real service red/green regression; controller validation; failed-write state tests; production-JAR normal and legacy cloud unlike roundtrips with original song likes restored |
| Preserve playback and account identity | Scoped fetches, like generations, playlist request generation and visible-list mutation without replacing the playback queue | Music-page integration, account-switch like tests and playlist queue tests; production baseline additionally required its existing `playlistBrowseLoadGeneration` name |
| Select personal podcast sources | Authenticated favourite programs, subscribed collections and created collections; radio view selectors and accurate empty/binding states | Contract fixtures including pagination/truncation; UI selection, failure/empty/source-switch tests; actual bound account returned 23 subscriptions, 2 created collections and 0 voice favourites |
| Preserve program identity | Playable main-song ID in `trackId`; program ID in metadata and `netease:program:` heart keys; programme notifications isolated from song/Folia likes | Distinct-ID contract and playback-queue tests; actual favourite voice row's main-song ID differed from program ID; favourite roundtrip and original state restoration verified |
| Protect personal podcast data | Current website user credentials, protected `/me/` endpoints, obsolete-response guards, malformed-response errors | Service credential/account isolation, MVC request validation, monolith auth gates including spoofed user headers; five live anonymous personal requests returned 401; public discovery remained 200 |

## Checks

- Working checkout: 93 frontend tests passed across the affected workspace, likes, account, routing and queue tests.
- Isolated production checkout: 105 frontend tests passed in 11 files. This includes the extra playback/account regressions already present in production.
- Backend: 85 media tests plus 13 monolith auth tests passed. The final authoritative favourite-state correction reran its 17 affected provider/service tests successfully and repackaged the monolith.
- Frontend production build and monolith package completed using the existing Node/Java 17/Maven environment. Vite reports its existing large-chunk warning; there is no separate lint script in the frontend package.
- `openspec validate fix-netease-unlike-and-podcast-library --type change --strict --no-interactive` passed; implementation changes were committed locally.
- Controlled real-account verification used the exact production JAR's provider/platform service, the current user's stored encrypted binding and real NCM responses over SSH. An explicit website-user context and a credential seam were supplied by the probe; no upstream responses were mocked. The Windows probe used a simple HTTP transport because the local JDK HTTP client's Unix-domain selector failed. Normal unlike, legacy cloud-playlist unlike and voice favourite changes all applied, and original account states were restored.
- Live runtime/image/JAR/static-file and HTTPS checks are recorded in `deployment-report.md`.

## Limitations

Browser automation could not load its request-header policy, so no new live UI screenshot or full logged-in browser smoke test is claimed. No reusable backend access-token session was available for an authenticated REST smoke test. Coverage combines mounted UI integration tests, authenticated controller/service tests, live authentication gates, actual account operations in the production JAR, and deployed artifact identity checks.

No critical implementation or delivery issues remain. The change is complete and retained for review; it has not been archived or pushed.
