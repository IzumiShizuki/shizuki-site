## Verification: fix-voice-search-filter-before-pagination

Verified on 2026-10-26 (Asia/Shanghai).

| Dimension | Result |
| --- | --- |
| Completeness | 8/8 implementation tasks; all 3 requirements implemented; authorized deployment is recorded separately in deployment-report.md |
| Correctness | All 7 scenarios covered by service, provider HTTP, frontend, and live upstream checks |
| Coherence | Matches the design: upstream filtering, native age union, explicit pageSize, unchanged response shape |

No critical issues, warnings, or skipped requirement checks. The change remains unarchived.

## Reproduction and cause

`MediaServiceImplTest.shouldFindTaggedWorksBeyondUnfilteredFirstPage` uses the real service and provider against an in-process HTTP upstream. The fixture places three unrelated works before three matching works. Before the fix, requesting page 1 / size 2 / tag 11 returned `[]` instead of `[4, 5]`. After the fix, the two matching pages contain `[4, 5]` and `[6]`, with hasMore true then false.

The service filtered the already-paginated upstream page, and the provider omitted `pageSize`. The provider now combines selected tag names and age conditions with the keyword before requesting a page; the service uses the filtered upstream total for continuation.

## Requirement and scenario evidence

| Requirement / scenario | Implementation and verification |
| --- | --- |
| Filter the collection before pagination; matches beyond the first unfiltered page | `AsmrMusicProvider.searchFilteredWorks`; real service/provider regression above |
| Combined keyword, all tags, and one of the selected ages | `shouldCombineKeywordAllTagsAndAgeUnionBeforePaging`; eight age combinations in `shouldTranslateAgeUnionIntoUpstreamCondition`; live combined-tag probe |
| Consecutive filtered pages | Service regression returns `[4, 5]`, then `[6]` without omissions or overlaps |
| No later filtered matches | Service regression asserts the final page hasMore false; `shouldAdvancePagesWithinFilteredVoiceWorks` checks exhaustion even on a later requested page |
| Initial 20, append 10 | Provider HTTP tests verify IDs 1–20, 21–30, and 31–35; existing frontend test verifies page 1/20 followed by page 3/10 |
| Access grant required before upstream work | `shouldRejectFilteredVoiceSearchBeforeContactingUpstreamWithoutGrant` asserts FORBIDDEN and no provider calls |
| No keyword or filters | Provider parameterized test routes to `/api/works`; list pagination test verifies the requested sizes |

Additional regressions cover generated expressions exceeding 64 characters while preserving user keyword validation, unknown tag IDs yielding no results, Unicode encoding, source failover, and existing music controller/service behavior.

## Validation commands and results

- Backend: 77 tests passed, 0 failures/errors/skips across `MediaServiceImplTest` (52), `AsmrMusicProviderSearchTest` (13), `AsmrMusicProviderFailoverTest` (5), and `MusicControllerIntegrationTest` (7).

  ```text
  cmd.exe /d /c "call D:\environment\activate-shizuki-site.cmd && mvn -B -o -pl modules/media-module -am -Dtest=MediaServiceImplTest,AsmrMusicProviderSearchTest,AsmrMusicProviderFailoverTest,MusicControllerIntegrationTest -Dsurefire.failIfNoSpecifiedTests=false -DargLine=-Djdk.net.unixdomain.tmpdir=D:/program/shizuki-site/target/disabled-unix-sockets test"
  ```

  The JVM argument is a command-only workaround for this Windows JDK's Unix-domain loopback error during selector initialization: a nonexistent Unix socket directory makes the JDK use TCP loopback. The same argument was used for the failing reproduction and passing tests. No toolchain files or application runtime settings were changed.

- Frontend: 12 tests passed across `MusicVoiceHomeView.spec.js`, `MusicVoiceWorkDetailView.spec.js`, and `voiceAgeCategory.spec.js`, using the existing Node 24 runtime and Vitest.
- Build: `D:\environment\build-shizuki-monolith.cmd` completed with BUILD SUCCESS (all monolith reactor modules).
- OpenSpec: `openspec validate fix-voice-search-filter-before-pagination --type change --strict --no-interactive` passed.
- Whitespace: `git diff --check` passed for the change. No dedicated Java linter is configured in the relevant Maven build; Java compilation and the targeted tests passed.

## Live upstream evidence

Checked the [upstream application's current JavaScript](https://asmr.one/js/app.c5f7e7ac.js), its `/api/tags/` metadata, and read-only search requests against `https://api.asmr-300.com`.

- `$age:general/r15$` returns no matches; the site's documented-in-code general/R15 choice is `$-age:adult$`.
- Numeric tag IDs are resolved to catalogue names before building `$tagw:<name>$` clauses. One metadata request handles all selected IDs.
- Query `$tagw:ASMR$ $tagw:治愈$ $-age:adult$` returned a filtered total of 3038. Page 1 / size 20 returned 20 matches; page 3 / size 10 returned 10 matches. Every returned work contained both tag IDs 497 and 56, no returned work had category adult, and the two pages had no duplicate work IDs.
- Only pagination, IDs, tags, and age metadata were inspected; no media was downloaded.

## Delivery and limits

The implementation commit contains only this voice-search fix and its OpenSpec artifacts. Existing unrelated working-tree changes are preserved. Production deployment was subsequently authorized and completed on 2026-10-27; see [deployment-report.md](deployment-report.md) for the isolated production baseline, runtime identity, backup, and live acceptance. No Git push or OpenSpec archive was performed.

Tag-filtered requests add one upstream catalogue lookup. Pagination retains upstream ordering and does not promise a catalogue snapshot if upstream data changes between requests. The HTTP regression tests prevent future omission of the requested page size or reintroduction of page-local filtering.
