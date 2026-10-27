## Verification: redesign-about-site-and-restore-stats

Date: 2026-10-27 (Asia/Shanghai).

| Dimension | Result |
| --- | --- |
| Completeness | All three requirements implemented; all six scenarios verified |
| Correctness | Public totals, delayed updates, genuine zeroes, partial failure and retry covered |
| Coherence | Existing theme/fonts and workspace retained; Claude reviewed before and after implementation |

### Implementation evidence

- Public content statistics: `fronted/vue3-merged/src/composables/usePublicSiteStats.js:17` requests the article total and complete catalogs anonymously, validates counts, deduplicates codes, preserves successful values and ignores disposed results.
- Reactive count display and recovery: `fronted/vue3-merged/src/components/author/AuthorAboutOverviewPremium.vue:38` renders loading/unavailable states, counts and retry controls through Vue; there are no DOM number timers or global selectors.
- Shared wiring: `fronted/vue3-merged/src/components/author/AuthorAboutExperience.vue:11` passes the public statistics and retry state into the overview.
- Visual composition: `fronted/vue3-merged/src/components/author/AuthorAboutOverviewPremium.vue:131` defines the asymmetric hero, arched photo, orbit lines and star, with container breakpoints at lines 528 and 569 and reduced motion at lines 515 and 611.
- Story sections: `fronted/vue3-merged/src/components/author/AuthorAboutStoryColumn.vue:237` owns its surfaces independently of the parent page's forced rectangular card styles. Existing editing, content and link behavior remain covered by AuthorPage tests.

### Browser evidence

Microsoft Edge through an isolated agent-browser session against `http://127.0.0.1:5190/#/author?tab=about`, using the existing remote personal-site API through Vite's configured proxy.

- Live anonymous API and rendered output: 12 public articles, 3 categories, 4 tags. These are observed values, not hardcoded fixtures in the page.
- Deliberately aborting the sidebar request leaves `12 / — / —` and an actionable retry. Removing interception and retrying restores `12 / 3 / 4`.
- Day/night screenshots inspected at 1440px and 375px; 1024px also checked. No document horizontal overflow at these widths. Mobile top spacing keeps the introduction below the floating menu.
- Reduced-motion emulation reports `orbital-art` animation `none`, while content remains visible.
- Keyboard Tab reaches a destination button with `:focus-visible` and a computed 3px outline.
- Scoped axe audit reports zero confirmed violations. Contrast remains an automated incomplete check because existing theme surfaces use gradients; screenshots were reviewed in both themes. This is not a claim of complete automated contrast certification.
- Impeccable detector on both redesigned components returns no findings (`[]`).

Screenshots retained as local review artifacts in `.codex/scratch/about-after-desktop-day.png`, `about-after-desktop-night.png`, `about-after-mobile-day.png`, `about-after-mobile-night.png` and `about-story-day.png`.

### Automated validation

- Regression reproduced before implementation: delayed counts remained `[0, 0, 0, 0]` instead of `[12, 3, 4]`.
- Final targeted checks cover the composable, overview, experience and AuthorPage; 45 tests pass.
- Final full frontend suite: `pnpm test:unit --maxWorkers=4 --minWorkers=1` — 282 test files, 1,801 tests passed. Production build: `pnpm build` — passed.
- Strict OpenSpec validation and `git diff --check` pass.
- Existing Sass import deprecations and large-chunk advisories remain build warnings; the build succeeds.

### Findings and handoff

No blocking implementation defects or unresolved requested work. No backend migration or deployment is required for local review. The change remains unarchived. Delivery includes only this change's files; pre-existing account/avatar/backend work stays in the working tree. No push is authorized or performed.
