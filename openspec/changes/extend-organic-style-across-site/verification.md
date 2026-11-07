# Verification: extend-organic-style-across-site

Date: 2026-11-08. Base: `7f79978c4c076a9f9158dd6a4ab2f019e8e42cbf`.

## Implementation mapping

| Requirement | Evidence |
| --- | --- |
| Shared visual identity | `src/styles/organic-theme.css`, `organic-content.css`, `organic-workspaces.css`; registered in `src/main.js` and scoped with `App.vue`'s `site-organic` marker. Open editorial Blog/reader, image frames, frameless life/archive headers, separated app entries and operational panes. |
| Coherent themes and personalization | Shared day/night roles, legacy/M3/mobile aliases, About aliases. Runtime preference code unchanged; `useUiPreferences.spec.js` passes. Home wallpaper remains visible. |
| Responsive and accessible | Rendered 1440px, 375px, 768px and 1024px checks; no observed document horizontal overflow; phone header space repaired; keyboard focus computes to a solid 3px outline; reduced-motion browser checks and existing motion regressions pass. |
| Existing application actions | App and Author script sections compared byte-for-byte with base and unchanged. All other route scripts/templates untouched. Real navigation, auth modes, public stats and app disabled states checked; full regression suite passes. |

## Rendered browser coverage

Isolated `agent-browser` session against the existing Vite preview at `http://127.0.0.1:5190`, using live guest data. Screenshots were inspected together at each batch, with transition settling before capture. Captures are local ignored evidence in `.codex/scratch/organic-*.png`.

- 1440 x 1000, both themes: Blog list and real article `/blog/17`, Music, Apps, AI town, Auth, Profile guest overview, Albums, Moments and About. Home wallpaper/clock/context controls checked in night mode. Document width did not exceed viewport width.
- 375 x 950, both themes: Blog, Music, Apps, Auth, About and AI. Reader also checked in night mode. The compact header no longer covers initial headings/actions. No document horizontal overflow observed.
- 768 x 1024, night: Blog, Music, Apps, Auth, About and AI; 1024 x 800 Blog. No document horizontal overflow observed.
- About shows real public counts **12 posts / 3 categories / 4 tags**; Albums/Moments show their actual empty states. No substitute gallery content was added.
- Auth login/register/forgot tabs switch correctly; required inputs remain present, with 44px standard input heights (captcha 50px). No email, registration, password reset or OAuth action was submitted.
- Apps renders 8 entries, with the actual 1 enabled entry and 35 disabled buttons preserved. No saved preference was changed by enabling an app.
- Keyboard Tab yields `:focus-visible` and solid 3px outline. `prefers-reduced-motion: reduce` was enabled for the narrow/night and intermediate-width checks. Browser `errors` returned no captured JavaScript errors.

Measured shared role contrast from settled browser-computed colors (not a claim about every image or embedded surface):

| Foreground / background | Day | Night |
| --- | ---: | ---: |
| Body / canvas | 10.75 | 13.28 |
| Muted / canvas | 5.86 | 8.09 |
| Subtle / soft surface | 5.54 | 6.17 |
| Accent / canvas | 5.09 | 10.29 |
| On-accent / accent | 5.43 | 10.29 |

## Automated checks

- Focused About/stats/preferences/scroll checks: **9 files, 73 tests passed**.
- Full `pnpm test:unit --maxWorkers=4 --minWorkers=1`: **283 files, 1,829 tests passed**, including account recovery, Blog workspace, Apps, Profile, life media, player and motion fixtures. Repeated after integration with the same passing result.
- `pnpm build`: production build passed. Existing Sass legacy API/import deprecations and large chunk warnings remain; no dependency or bundle-splitting changes are part of this CSS change.
- Impeccable detector on all three new style modules: **[]**, no reported findings.
- `git diff --check`: passed.
- `openspec validate extend-organic-style-across-site --type change --strict --no-interactive`: passed.

## Limits and disposition

- This desktop web preview redirects `/m/music` and `/m/auth` to desktop routes. Native mobile palette changes are source-reviewed and compiled; a real Capacitor runtime was not launched or visually checked.
- No privileged account was used. Signed-in/admin/editor and populated gallery/error states rely on existing component/fixture regressions and unchanged business logic; live guest empty, disabled and authentication states were checked.
- Folia/embedded documents keep their internal layouts. Their first-party surrounding chrome inherits the shared system.
- Shared text/neutral-role contrast is measured above; custom wallpapers, custom images and external embeds are not certified by those numbers.
- No critical implementation issue found. Publication task 3.4 remains pending until verified refs are pushed. No archive or production service commands have been run.

## Publication

Fetched/pruned origin after integration: both `origin/master` and `origin/codex/local-master-frontend-20261011` still match the base (ahead/behind 0/0). No remote integration was necessary. Final commit/ref evidence will be recorded after publication.
