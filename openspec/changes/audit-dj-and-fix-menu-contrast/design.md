## Context

See proposal.md for motivation. The frontend already generates Material 3 semantic roles with the installed material-color-utilities package, but TopMenu and AtmospherePanel still combine legacy translucent gradients, hardcoded white ink and locally overridden warm colors. Global accent ink is estimated against the page rather than every individual translucent control. The mobile dock uses color-mix with a gradient operand, which is invalid CSS. The user corrected the DJ URL to https://dj.shizuki.online/#/; it serves the Bible reading application. The earlier ERR_CONNECTION_CLOSED at dj.shizuki.site was a check of an incorrect URL and does not describe the application. Authenticated QA evidence and exact coverage limits are in dj-audit.md.

## Goals / Non-Goals

**Goals:** retain warm Shizuki styling and user color controls while establishing stable paired menu surfaces; verify real computed styles and interaction paths, and document the exact DJ test boundary.

**Non-Goals:** redesign page layout, rewrite unrelated features, change API contracts or deploy automatically.

## Decisions

- Reuse generated Material surface/on-surface and primary/on-primary role pairs for menu controls, with matching static fallbacks. Opaque menu surfaces prevent arbitrary wallpaper colors from undermining contrast; the existing wallpaper remains visible around them. A text shadow cannot repair insufficient luminance contrast.
- Use semantic primary-container/on-primary-container for selected navigation and primary/on-primary for primary buttons. Arbitrary black-to-white gradients cannot support a single foreground at 4.5:1 across their full range, so raw accent gradients stay in decorative previews rather than menu action backgrounds.
- Share menu semantic tokens across navigation, atmosphere panel and embedded color studio. Preserve existing dimensions and content. Add readable selected/focus states and keyboard semantics where the touched controls currently lack them.
- Verify token pair luminance across presets, extremes and palette styles, plus browser checks over light/dark wallpaper and narrow/wide viewports. Record existing test failures separately and run an optimized production build.
- Share the mobile collapsed-by-default decision in the existing navigation presentation helper. The page-top desktop default must not make the mobile toggle close a drawer that is already visually hidden.

## Risks / Trade-offs

- [Menu glass becomes less transparent] → Retain tonal brand color and existing shape/shadow; readability has priority inside controls.
- [Legacy selectors override new pairs] → Inspect computed styles and capture screenshots after changing themes and tabs; fix owning rules rather than stack broad overrides.
- [DJ login/network prevents end-to-end coverage] → Investigate read-only connectivity and public routes, report exact failures and keep inaccessible workflows explicitly pending.

## Migration Plan

No data migration or dependency installation is required. Validate locally and commit the change. Rollback is a revert of the local commit. Publishing remains a separate action.
