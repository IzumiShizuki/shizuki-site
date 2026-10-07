# Verification: profile artwork carousel

Reviewed proposal, design, tasks and profile-art-carousel requirements using openspec-verify-change on 2026-10-07.

| Dimension | Result |
| --- | --- |
| Completeness | All five tasks and all three requirements implemented and delivered |
| Correctness | Six carousel interaction regressions plus seven panel and four daily-art API tests pass; production build succeeds |
| Coherence | Reuses shared desktop/mobile panel and safe artwork component; no dependency, API, backend or credential changes |

## Requirement and scenario coverage

- Large carousel / browse several images: DailyArtCarousel displays one artwork and its attribution; tests cover wraparound, direct selection, original links and announced position. Live next/previous changed the actual image and retained the six stored choices.
- Replacement daily content: component watches the artwork identity set; tests replace/clear content and ensure old artwork disappears. DailyArtPanel retains its existing account-reset behavior and ownership regressions.
- Accessible navigation: tests cover arrows, Home/End, modified-shortcut preservation, clear horizontal swipe, vertical movement, multi-touch and cancel. No auto-advance timer is introduced. Real phone controls are at least 44×44px.
- Proportionate images: fixed 4:3 and 3:4 frames are removed; featured images use intrinsic size with viewport and width limits. Actual browser measurements below confirm frame/image bounds match within a fraction of a pixel. Character and search previews retain full natural proportions.
- Image failure: tests preserve original links after failed preview and allow moving to a working image. Existing panel failure regressions pass.

## Browser evidence

| Context | Image / matching frame size | Result |
| --- | --- | --- |
| Desktop portrait fixture, 900×1300 | 443.06×639.99 / 443.07×639.99 | Full ratio, no overflow or extra band |
| Desktop landscape fixture, 1600×900 | 735.70×413.83 / 735.71×413.83 | Full ratio, no extra band |
| Phone portrait fixture, 375×812 viewport | 327.99×473.77 / 328×473.77 | No horizontal overflow |
| Live recommendation, 829×1200 | 442.11×639.98 / 442.13×639.98 | Complete image; original links retained |
| Live character, 768×1152 | 258.10×387.16 / same | No portrait-frame band |
| Live phone personal interface | 213.32×308.80 / 213.33×308.80 | Page/carousel have no horizontal overflow; six selectors fit and all controls are 44px high |

Browser viewport override was reset. Live screenshots are in D:/program/_codex_deploy/profile-carousel-release-20261007. The temporary preview fixtures were synthetic ratio checks, with no secrets or stored user account data. A combined shell cleanup was rejected by automatic policy; the owned process was subsequently stopped through its execution session and the five exact fixture files removed with apply_patch, without recursive deletion.

## Checks and assessment

`vitest run` for DailyArtCarousel.spec.js, DailyArtPanel.spec.js and dailyArtApi.spec.js: **17 passed**. Vite production build from the clean release checkout: **passed**, using existing production settings read in memory. Strict OpenSpec validation and git diff --check pass. No new concerns justify running backend tests for this presentation-only change. The existing Vite chunk-size advisory remains.

All required behavior and delivery checks passed. The user's preexisting TopMenu.vue edit was excluded from commits/build/deployment and its SHA-256 remains unchanged.
