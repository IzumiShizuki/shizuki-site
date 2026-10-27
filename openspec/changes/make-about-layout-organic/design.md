## Context

See proposal.md for the user feedback. The previous change fixed real statistics and introduced a curved hero, but boxed life previews, journey entries, article cards and side rails still dominate. Existing component events and regression tests define the behavior that must survive.

## Goals / Non-Goals

The user explicitly delegates this round's layout to Claude. Claude owns the visual implementation; Codex coordinates specifications, reviews the actual rendering, fixes integration issues and validates delivery. Do not alter authentication work, editable profile data, public statistics semantics, admin workspaces, global theme selection or backend endpoints.

## Decisions

- Treat this as one public reading composition. Remove enclosure before adding ornament: identity leads, public statistics support, biography and interests breathe, life previews flow into the journey and writing. Use varied spacing and imagery silhouettes to group material instead of full rectangular borders around every group.
- Give Claude discretion over the detailed typography, section topology and natural dark palette within the existing personal-site identity and fonts. Explicitly reject another pass that only increases border radius or adds decorative blobs behind unchanged card grids. Record its implemented palette and layout decisions after review.
- Scope page palette tokens and any side-rail overrides under `.author-page--public-workspace`. Keep day/night colors coherent, preserve selected accent behavior where possible, and avoid changing shared global theme defaults. Component presentation can consume locally inherited About tokens with existing theme fallbacks.
- Preserve DOM reading/focus order, IDs and events used by the shared author navigation and editor. Statistics continue using `usePublicSiteStats` with Vue rendering. Empty, unavailable and loading states remain real and actionable.
- Use container-aware layout for the center column plus viewport-aware shell changes. Default content stays visible; motion remains optional, with no continuous particle effect or pointer-dependent layout.

## Risks / Trade-offs

- Existing ancestor styles can reintroduce borders and shadows → inspect computed rendering and scope overrides explicitly to the public workspace rather than adding global important rules.
- Natural spacing may lengthen the page → maintain a clear hierarchy, working section navigation and readable body measure instead of making every region equally large.
- Translucent dark surfaces can look muddy over wallpaper → define deliberate local neutral surfaces and test both themes against the actual wallpaper.
- Shared components may be reused → do not alter their content loading or routing contracts; prefer scoped styling for shell widgets.

## Migration Plan

Frontend-only local commit after browser checks, existing component/page tests, production build and strict OpenSpec validation. No schema migration or deployment. Roll back the scoped commit if needed.
