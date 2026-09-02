## Context

See `proposal.md` for motivation and the two delta specs for observable behavior. The Vue frontend already centralizes persisted appearance data in `useUiPreferences`, emits CSS variables on `:root`, and exposes full color controls through `AppearanceSettingsContent`. The blog already contains search, categories, archives, featured/list cards, a three-column reader, table of contents, related posts, reading progress, rich Markdown, Mermaid, and responsive workspace logic, so this change should strengthen theme coherence and interaction quality rather than recreate those features.

Shirone's useful architectural lesson is its thin HCT engine followed by semantic CSS roles and then component consumption. Its framework, component inventory, page-transition stack, and static-content model do not map directly to this Vue application. Google's M3 Expressive guidance further favors deliberate personalization, deeper tonal palettes, contrasting shapes, meaningful motion, visible states, and accessibility over decorative excess.

## Goals / Non-Goals

**Goals:**

- Introduce real HCT-derived Material color roles while maintaining the current preference API and CSS-variable compatibility.
- Make palette personality a stable preference and expose it from both full appearance settings and a compact atmosphere-panel destination.
- Apply the semantic hierarchy first to public blog discovery and reading surfaces, where long-form readability and navigation states matter most.
- Give blog routes one recognizable expressive signature: a restrained, theme-derived ambient color field with reduced-motion handling.
- Keep the implementation responsive, keyboard-visible, and inexpensive at runtime.

**Non-Goals:**

- Port Shirone's Astro/Svelte component system, Swup navigation, content pipeline, or full feature catalog.
- Replace the current typography families, wallpaper system, editor architecture, backend APIs, or authentication rules.
- Convert every site component to M3E in this change; legacy variables remain supported so adoption can continue incrementally.
- Add background textures, remote assets, WebGL, or canvas animation.

## Decisions

### 1. Use Google's HCT utility instead of extending RGB mixing

Add `@material/material-color-utilities@0.4.0` and a small local adapter that accepts a hex seed, day/night mode, and palette personality. The adapter resolves the subset of M3 roles required by the site from `SchemeTonalSpot`, `SchemeExpressive`, `SchemeVibrant`, and `SchemeContent`.

This matches Shirone's proven palette architecture and produces intentional tonal relationships and foreground pairs. Continuing to hand-mix RGB values was considered, but that approach cannot faithfully express different palette personalities and increases the burden of contrast maintenance.

The four visitor-facing personalities will be named for the experience rather than library internals:

- `soft` / 柔和陪伴 → Tonal Spot (default)
- `expressive` / 灵动跳色 → Expressive
- `vibrant` / 鲜明能量 → Vibrant
- `content` / 忠于原色 → Content

### 2. Preserve one preference state and one migration path

`paletteStyle` will be added to the existing reactive preference state, persisted in the existing payload, normalized on load, and defaulted to `soft` for legacy payloads. Setters will continue calling the same apply-and-persist path used by solid, gradient, and day/night controls.

Creating atmosphere-specific color state was rejected because it would create conflicts, duplicated migrations, and confusing reload behavior.

### 3. Use both gradient endpoints without inventing a multi-seed HCT algorithm

For solid mode, one dynamic scheme supplies all roles. For gradient mode, the start seed supplies primary and neutral/surface roles; a companion scheme from the end seed supplies secondary and tertiary families plus the second ambient-field color. Existing gradient CSS variables remain available for controls that intentionally render a literal gradient.

This is deterministic and preserves both user choices. Averaging the endpoints into one seed was rejected because opposite or distant colors collapse into a muddy third color and no longer reflect the chosen gradient.

### 4. Emit M3 roles alongside backward-compatible site aliases

The adapter output will be written as `--m3-*` variables (primary, containers, surfaces, outlines, foregrounds, inverse, shadow/scrim) plus M3E motion, shape, spacing, elevation, and state-alpha tokens. Existing `--theme-*` and `--accent-*` variables will map to or be derived from these roles so unrelated pages remain stable.

New blog styles will consume semantic roles directly. This incremental bridge avoids a risky site-wide rewrite and makes the new design system available to later changes.

### 5. Scope the expressive signature to blog routes

`BlogListPage` and `BlogPage` will receive a shared route class and pseudo-element color field behind their content. Two large blurred radial forms will use primary/tertiary container roles and a slow translate/scale cycle. They will be `pointer-events: none`, sit below workspaces, avoid filters on content, and become static when either the app preference or `prefers-reduced-motion` indicates reduced motion.

Particle systems, canvas, and additional texture DOM were rejected because the site already has wallpaper and atmosphere effects; the blog signature should remain calm enough for long-form reading.

### 6. Share controls between full and compact surfaces

Extract the preference-facing controls into a reusable `ThemeColorStudio` component with `full` and `compact` presentation modes. Full mode retains custom HEX/color-picker and gradient editing. Compact mode prioritizes day/night, solid/gradient, seed presets, palette personality, and a live semantic-role preview appropriate for the atmosphere panel.

`AppearanceSettingsContent` becomes a thin full-mode host. `AtmospherePanel` adds a `colors` tab and mounts compact mode. Both instances import the same composable and need no synchronization events beyond Vue's shared reactive state.

### 7. Refine rather than replace the blog information architecture

Existing featured articles, cards, filters, TOC, related posts, and reader actions remain. CSS and small markup adjustments will establish:

- page surface → surface-container-low;
- content panels → surface/container roles with tonal elevation;
- hero/selected actions → primary or tertiary containers with paired foregrounds;
- supporting metadata → on-surface-variant;
- borders/dividers → outline-variant;
- keyboard focus → primary focus ring;
- hover/focus/pressed overlays → 8%/10%/12% semantic state layers;
- cards at 16px, chips/pills fully rounded, and panels/dialog-like destinations at 28px where compatible with existing layout.

The existing warm shapes and content density remain the visual identity. A complete atomic-component migration was rejected as too broad for a blog-focused change.

### 8. Verification combines unit contracts and rendered inspection

Unit tests will cover style normalization, legacy restoration, persistence, role emission from solid and gradient inputs, and shared-control selection. Component tests will assert the atmosphere color tab and blog route hooks. The production build and focused unit suite must pass. A local browser pass will inspect desktop and mobile blog list/reader states, day/night switching, focus visibility, compact atmosphere controls, and reduced motion.

## Risks / Trade-offs

- **[Risk] New color utility increases the initial frontend bundle.** → Import only the required schemes in one adapter and verify the production chunk size; the dependency is small relative to existing rich-editor packages.
- **[Risk] M3 surface roles could visually disturb non-blog routes through legacy aliases.** → Keep existing aliases stable where practical, add new direct roles, and visually sample home/profile as regression routes.
- **[Risk] Dynamic colors can still produce surprising brand combinations.** → Limit personalities to four tested choices, keep the warm default, and rely on role-paired foregrounds rather than arbitrary text-over-accent combinations.
- **[Risk] Scoped Vue CSS cannot style pseudo-elements or teleported content as expected.** → Put route-level ambient hooks in the page styles where the route root is directly available and keep panel controls self-contained.
- **[Risk] The atmosphere panel already contains many destinations.** → Use a responsive tab strip that can wrap/scroll while preserving labels and keyboard semantics; color controls remain compact.
- **[Trade-off] Gradient mode combines two valid schemes rather than implementing a formal multi-seed Material algorithm.** → Document the deterministic mapping and test both endpoints; this preserves user intent without claiming unsupported standard behavior.

## Migration Plan

1. Add the color utility and adapter with isolated tests.
2. Extend preference state with a normalized `paletteStyle`; legacy payloads default to `soft` without version-gated destructive migration.
3. Emit new semantic roles while retaining existing variables and run preference tests.
4. Extract shared controls and add the atmosphere `colors` destination.
5. Apply route-scoped blog tokens and ambient field, then run responsive/reduced-motion checks.
6. Run focused tests, the full frontend unit suite, production build, OpenSpec strict validation, and local browser visual verification.

Rollback is a normal code revert: saved payloads containing `paletteStyle` remain harmless to older code because unknown JSON fields are ignored. No data or backend migration is required.
