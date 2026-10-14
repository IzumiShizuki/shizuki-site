# Verification: isolate-private-media-and-companion

## Summary

| Dimension | Result |
| --- | --- |
| Completeness | 9/9 local implementation, verification and delivery tasks complete |
| Correctness | All 6 requirements mapped to code and regression/browser evidence |
| Coherence | Existing group authorization, public wallpaper approval and owner-only Meguri gateway retained |

## Requirement evidence

- Explicit voice authorization: `MediaServiceImpl` gates search, work bundles, virtual bundles and playback before cache/provider access; unauthorized provider/guide/default/public/private-sidebar responses are filtered. `MediaServiceImplTest` verifies cache denial, virtual-route denial, public mixed playlists, custom permission and historical homepage cache isolation. Voice publisher/consumer reject public cache uploads; queued-voice regression passes.
- Private wallpaper discovery: `WallpaperDiscoveryAccess`, `WallpaperDiscoveryServiceImpl`, `WallpaperServiceImpl` and controller permission enforce every external read/import. Controller returns private no-store previews; frontend uses authenticated blob fallback and revokes object URLs. Tests exercise all direct read/import denials before upstream calls, custom grants, hidden controls and preview retry cleanup.
- Owner management and audit guidance: both admin permission catalogs include the new grant; existing ADMIN controllers retain group/secondary-privilege enforcement. `audit.md` records assignment through custom groups and production data boundaries. Both monolith database profiles and standalone user module have forward migrations; migration contract test passes.
- Ordinary companion: `MeguriCompanion` defaults to the generic cat with focus/music controls and no character stage. Home exposes the same generic entry. Browser network inspection shows zero `/api/v1/meguri/` requests and zero `MeguriPage.vue` requests in ordinary mode.
- Hidden owner mode: `useCompanionMode` requires authenticated ADMIN for five activations in three seconds, stores no mode in browser storage and resets on identity/access changes. Component tests cover owner activation, timeout, USER/FRIEND/guest rejection, retained draft, return to normal, account switch and logout. Browser keyboard activation of the generic button succeeds.
- Mode lifecycle: Home and AI Hub use the shared state. AI Hub lazy-loads the role only in anime mode, rejects the deep link in ordinary mode and unmounts on normal-mode return; frontend tests cover these cases. The existing backend and authenticated sprite gateway remain ADMIN-only.

## Checks

- Focused frontend: 7 files / 71 tests passed. Final UI follow-up: 2 files / 33 tests passed.
- Maven reactor: 129 relevant tests passed across common security, user catalog, media, auth filter, Meguri gateway and migrations. Windows Java 17 AF_UNIX temporary-path issue resolved using a task-local `jdk.net.unixdomain.tmpdir`, based on installed JDK source, without changing permanent toolchain settings.
- Frontend production build passed, including final UI changes. Standard `D:\environment\build-shizuki-monolith.cmd` passed.
- Browser verified ordinary companion, direct role URL denial, keyboard use and 390px width without horizontal overflow. Screenshots stored under evidence/.
- OpenSpec strict validation and `git diff --check` passed.
- UI detector reported only two existing advisories in unchanged style sections (AI Hub grid background and wallpaper progress width animation).

## Warnings and handoff

1. Full frontend suite has 24 baseline failures (1666 passed / 1690 total) in unchanged `AuthorAboutOverviewPremium.vue`, which directly uses IntersectionObserver absent in jsdom. Confirmed that invocation exists in HEAD before this change. This does not invalidate the passing privacy/companion tests or builds; it remains a separate quality issue.
2. Deployment, existing PUBLIC media classification and historical ASMR public/CDN-object cleanup have not been performed. Ordinary homepage wallpaper/avatar and public login artwork remain existing site content; see audit.md before making a production privacy guarantee. This is a production-data follow-up, not missing local implementation.

No critical implementation issue remains within this change. Preserve the OpenSpec change without archiving until the owner closes the workflow.
