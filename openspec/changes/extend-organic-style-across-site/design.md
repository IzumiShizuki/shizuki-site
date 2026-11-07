## Context

About's approved palette and layout live in AuthorPage and six child components. The rest of the site uses semantic theme variables, global forced card rules, route-scoped styles, M3 blog aliases and mobile/Folia surfaces. Existing preference code writes legacy variables on the document root. See proposal.md for the requested expansion.

## Goals / Non-Goals

Share the approved visual language while fitting each route's purpose. Keep all real content and business logic, route guards, scroll ownership, player state, account flows, admin permissions and editor/canvas boundaries. This is a frontend presentation change, not a backend, DJ, dependency or deployment change. The user explicitly authorizes pushing after completion.

## Decisions

- Add a shared `organic-theme.css` foundation in the existing styles directory. Register it after existing theme imports and add a `site-organic` marker to the app shell. Define reusable `--site-*` roles and bridge existing semantic variables at this marker, so runtime accent preferences stay intact and old root assignments do not undo the local palette.
- Reuse About's exact graphite #1a1f26 / warm neutral #f6f7f3 canvases and readable warm-white/green-ink text. Move duplicated About palette constants to the foundation and alias `--about-*` to shared roles; preserve About's accepted composition.
- Separate content composition (`organic-content.css`) from operational composition (`organic-workspaces.css`). Claude implements these two route-scoped style modules after inspecting real templates. Codex implements the foundation, registration and integration, then reviews actual rendering. No generic wildcard that strips every panel: imagery, inputs, dialogs, tables and genuine operational groups retain boundaries where useful.
- Scope overrides through `.site-organic` plus explicit route/component classes. Defeat existing important card skins only on known presentation surfaces. Keep list behavior, document reading measure, route heights and canvas scrolling untouched. Wallpapers remain visible where they are the content, particularly Home, and selected accents continue through derived colors.
- Apply operational palettes to desktop/mobile shells and first-party tool containers. Embedded external documents and Folia/editor content keep their own functional internal layout; their first-party navigation and surrounding controls inherit the shared theme.
- Verify real guest routes in a rendered browser, use existing unit tests for signed-in/editor/admin states, and record inaccessible live states precisely rather than inventing authenticated access or content. Test theme switching, keyboard focus, reduced motion and representative mobile/intermediate widths.

## Risks / Trade-offs

- Root inline variables and M3/local themes can override new colors → bridge at the shell and appropriate route roots, inspect computed values in both modes.
- Broad resets could break editors, music lists or dialogs → explicit selectors, visual-only mutations, and compare script sections with the base revision.
- Empty galleries hide populated layout issues → existing fixture tests plus state-aware browser checks; preserve image aspect ratios and real media rather than insert decorative data.
- Remote changes during implementation → fetch/prune before final integration; apply non-destructive fast-forward/rebase as needed, rerun applicable checks, and push without force. The starting current branch and remote master are identical; publish the verified commit to both only while fast-forward-safe.

## Migration Plan

Ship a scoped frontend commit plus OpenSpec evidence, followed by the publication record. Complete local verification, fetch remote updates, integrate as needed, repeat affected tests and strict validation, then push the verified current branch and fast-forward master. Confirm remote commit IDs. No production service deployment commands are included. Roll back with a scoped revert if necessary.
