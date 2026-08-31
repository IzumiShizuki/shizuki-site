## Context

See `proposal.md` for motivation and `specs/public-content-workspace/spec.md` for observable behavior. The application currently treats public routes as document-scroll pages: `App.vue` owns the scroll source, while blog and author center areas explicitly disable their internal scroll containers. Menu compaction also reads that outer scroll source. The author About tab is the only public author tab using the newer three-column experience; Posts is an older placeholder. Optional personal-content and widget APIs can intentionally be disabled by server configuration, but the frontend currently renders those responses like recoverable failures.

## Goals / Non-Goals

**Goals:**

- Introduce one active scroll-owner contract that preserves existing menu and scroll-observer behavior when ownership moves from the route shell into a center column.
- Reuse the author experience shell for About and Posts instead of maintaining two visual systems.
- Render optional capabilities according to machine-readable availability while retaining useful recovery for transient failures.
- Keep responsive behavior and existing administrative author tabs intact.

**Non-Goals:**

- Enabling private albums, moments, weather, or quote providers in production configuration.
- Redesigning the author administration console or changing backend API contracts.
- Adding a new carousel, animation framework, or general-purpose layout dependency.

## Decisions

### Register the active nested scroll owner with the application shell

The application scroll context will accept a temporary nested scroll owner. When registered, that element becomes the source used for menu presentation, scroll restoration, and observers, while the route shell switches to a fixed-workspace overflow mode. Scroll ownership will be exposed through the existing scroll-area component so each page does not implement lifecycle wiring independently.

This preserves one source of truth for route motion. Keeping the route shell as the source while intercepting wheel events was rejected because it would create synthetic scrolling, weaken keyboard/touch behavior, and leave restoration inconsistent.

### Apply center-owned scrolling only in the desktop workspace

Blog list, blog detail, and public author experience will establish a viewport-bounded height chain with `min-height: 0`; their center scroll areas will own vertical overflow. Side rails remain in the same grid and can use their own overflow only when their content exceeds the available height. At compact breakpoints, layout CSS releases the fixed height and nested overflow so existing stacked/drawer behavior remains natural.

### Generalize the public author experience around a shared shell

The current About experience becomes the host for both public About and Posts. Its persistent profile and life-widget slots remain unchanged, while the center content selects either the About story or a dedicated Posts column. The Posts column consumes the existing public blog service, uses the same author-page type and surface tokens, and links each record to the existing article route.

Embedding the complete blog-list page was rejected because it would duplicate its navigation rails and create nested page landmarks. Keeping the redirect-only placeholder was rejected because it does not satisfy a usable Posts tab.

### Make menu auto state and manual state explicit

Menu presentation will resolve three inputs: active scroll position, a manual expand override, and a manual collapse override. The desktop toggle is always rendered; activating it changes the manual state rather than depending on a threshold-created element. Automatic compaction still follows the registered center scroll source when no conflicting manual override exists.

### Classify optional-content outcomes at the data boundary

A small shared classifier will identify feature-disabled API errors separately from transient request errors. Components will suppress retry and dead navigation for the former, while preserving retry for the latter. Widget responses that successfully report `available: false` are treated as unconfigured data, not failed requests. This keeps deployment configuration authoritative and avoids falsely claiming content exists.

## Risks / Trade-offs

- [Nested scroll regions can feel awkward on narrow screens] → Enable them only in the desktop three-column workspace and release overflow at responsive breakpoints.
- [Changing the active scroll element can break restoration or menu compaction] → Centralize registration in the existing scroll context and add focused unit tests for claim, release, threshold, and manual overrides.
- [Side-rail content can exceed viewport height] → Allow rail-local overflow without letting center-wheel scrolling move the rails.
- [Public post fields may be incomplete] → Use the same normalized public blog records and fallbacks already accepted by the main blog list.
- [Feature-disabled error shapes can vary] → Classify by stable application error code first and retain the transient failure path for unknown shapes.

## Migration Plan

1. Ship frontend changes with no database or backend migration.
2. Verify desktop center scrolling, compact responsive flow, menu manual controls, public post navigation, and disabled/transient states against production-compatible API responses.
3. Roll back the frontend commit if the fixed-workspace height chain causes a regression; server configuration and stored content remain unaffected.
