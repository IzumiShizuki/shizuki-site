# Verification: add-site-meguri-companion

Date: 2026-10-12. Local implementation reviewed using the OpenSpec verify workflow; no change was archived or deployed.

| Dimension | Result |
| --- | --- |
| Completeness | Seven local delivery tasks completed; all four capability requirements implemented |
| Correctness | 71 focused tests pass across seven files; desktop and narrow browser flows inspected |
| Coherence | Existing authenticated gateway, session contract and character stage reused; no backend or dependency changes |

## Requirement evidence

| Requirement | Implementation and verification |
| --- | --- |
| Owner can use the companion across pages | `MeguriCompanion.vue`: authenticated ADMIN gate, lazy stage, runtime retained via visibility, account watcher/key, explicit close. Six host tests cover visitors, minimization, route continuity, focus suspension, handoff, account switch and teardown. |
| Home and AI Hub provide a consistent entry | Home emits the companion event; Hub handles `mode=meguri` after auth readiness and requires authentication plus ADMIN. Three deep-link tests cover owner, non-owner and stale unauthenticated ADMIN snapshot. Real stage tests cover late accepted turns, successor recovery, and a newer session taking priority. |
| Connection states and IME input | Bootstrap request failures display their error; offline refresh recovers sending; composition Enter and Shift+Enter do not send. Failed creation retains the unsent draft. A disconnected stream keeps its accepted turn and retry follows it once instead of resubmitting. |
| Constrained viewports and focus | Browser inspection at 1440×1000 and 390×844 confirmed the panel, composer and close/minimize controls fit. Focus suspension retains the runtime; native mobile shell is gated in App. Visible focus outlines and launcher focus restoration verified. |

## Validation

- `pnpm exec vitest run` for host, Meguri page, Home, Hub, API, stream and presentation: **71 passed**.
- Full `pnpm test:unit`: **1,662 passed / 24 failed**, 263 passing / two failing files. Both failures are author-page test suites; each reports `ReferenceError: IntersectionObserver is not defined` from the existing author experience. None of those source or test files were changed. The same failures appeared on both full runs. No new companion failure was observed.
- `pnpm build`: passes; existing large-chunk advisory remains.
- `openspec validate add-site-meguri-companion --type change --strict --no-interactive`: passes.
- `git diff --check`: passes. No configured frontend lint script exists in package.json.
- Independent Impeccable finish reviewer identified account-key isolation, acceptance during handoff, and an empty chat grid row. All three were corrected and regression-tested or visually rechecked.
- Mechanical detector run once: no finding in the new host. Existing character CSS produces bounce/grid style advisories; those incumbent character presentation choices are preserved.

## Browser evidence and practical limits

The browser used a separate Edge QA session, the original desktop sprite and explicitly synthetic auth/Turn/SSE responses. Home entry, a streamed reply, minimizing, Blog navigation with retained conversation, and AI Hub handoff with no floating duplicate were exercised. Final desktop/mobile screenshots are saved in the chat's visualization directory. The temporary copied sprite and QA script are removed before the delivery build.

The remote Core health entry returns HTTP 401 without credentials, and localhost Core did not respond during inspection. These are not real AI/model acceptance results. Before publication, use a real ADMIN session to verify gateway bootstrap, authenticated sprite delivery, a real model response, and interrupted-stream recovery.

## Remaining work

No critical implementation issue remains within this change. Warnings: repair the independent author test environment and perform authenticated remote acceptance before deployment. Later AI stages (protocol handshake/snapshot, durable Meguri history, dedicated memory review, page assistance and optional speech) are explicitly scoped in `docs/ai-companion-integration.md` and are not claimed as implemented.
