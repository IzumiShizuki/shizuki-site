## Context

The global workspace currently caps every route at 1320px and reserves 134px above nested-scroll routes. The author center column claims the app scroll owner on desktop, so that second rule survives even after the top menu becomes compact. The About build-history preview is correctly present at the end of the center flow, but the narrow/short canvas and persistent bottom overlays make it easy to miss. The small control attached to the theme item is a Home appearance trigger, not a system-status badge.

The wallpaper backend already models direct, SteamCMD, and unavailable channels. Compose passes the runtime variables and mounts persistent Steam home/download volumes, but production has the channel disabled and the documentation does not enumerate every supported variable or the Compose build arguments.

## Goals / Non-Goals

**Goals:**
- Give only the author route a wider desktop canvas and more usable vertical space.
- Preserve fixed author rails and center-only scrolling.
- Make menu collapse release the full-menu offset even when the center owns scrolling.
- Turn the unexplained Home badge into a clear, independently focusable Home appearance action.
- Safely enable and verify every wallpaper capability that the available private credentials actually support.

**Non-Goals:**
- Redesign the author page into a different visual language or change its mobile single-column contract.
- Turn Home clock/color settings into global settings.
- Invent provider keys, bypass Steam Guard, or use a Steam account that does not own Wallpaper Engine.

## Decisions

### Use a route-scoped wide-canvas modifier
Add an author route class at the application workspace boundary and raise its desktop width to a fluid cap around 1600–1760px. Keep the left rail around 240–280px and right rail around 300–350px so most of the new space benefits the center. This avoids globally stretching music, profile, and editor routes.

Alternative considered: change the global 1320px token. Rejected because it would alter every desktop route and create unrelated regression work.

### Make navigation visibility the sole owner of the top offset
Derive the expanded workspace class from the resolved full-navigation state. Nested scroll ownership continues to determine the active scroll source, but no longer forces expanded spacing. The compact offset remains large enough for the standalone Menu control.

Alternative considered: special-case AuthorPage. Rejected because the bug is in the global coupling between scroll ownership and menu geometry and can affect every nested-scroll route.

### Add center-flow bottom clearance instead of moving fixed global overlays
Give the public author center flow a modest safe-area-aware bottom inset so the final build-history cards can scroll fully above the lyric/player overlay. Keep overlays fixed because their placement is global behavior.

### Promote the Home appearance badge into a labelled micro-control
Keep the action Home-only, but render it as a small labelled pill adjacent to—not overlaid on—the global theme action. Its copy and tooltip state that it controls Home clock, wallpaper color, and motion. Selected panel buttons expose `aria-pressed`.

The visual plan retains the current graphite/rose liquid-glass palette and type system. The signature interaction is the complete menu folding into one Menu control while the whole author canvas glides upward in the same 260ms motion curve; the appearance action stays quiet and informative.

### Treat Steam/Wallhaven keys as capability enhancers, not fabricated prerequisites
Enable no-key discovery flags and validate executable/storage readiness automatically. Configure real provider keys only when they already exist or can be issued through the user's authenticated provider account. Steam Guard remains an interactive owner step whose cached session lives in the persistent Steam home volume.

Add Compose build-argument passthrough and document all supported runtime variables so a standard deployment can repair a missing SteamCMD image without ad-hoc commands.

## Risks / Trade-offs

- [Very wide layouts can dilute visual focus] → Cap the author canvas and grow rails conservatively while allocating most width to the center.
- [Changing top-offset ownership can affect other nested-scroll routes] → Add a contract test around full navigation versus nested scroll ownership and run the full frontend suite.
- [Persistent lyrics can still overlap unusually tall controls] → Use bottom safe-area padding in the author center flow rather than fixed element assumptions inside individual cards.
- [Steam credentials or keys can leak through diagnostics] → Validate only set/unset and command success; never print values or commit the server environment.
- [Steam Guard blocks unattended login] → Keep the channel unavailable until the owner completes the one-time interactive login and verify cached authentication afterward.

## Migration Plan

1. Land frontend geometry, accessibility, tests, Compose build-arg passthrough, and documentation changes.
2. Back up the private server environment, set non-secret wallpaper defaults, and add only available real credentials.
3. Recreate the backend if runtime variables changed; rebuild it if SteamCMD is absent.
4. Complete the one-time interactive Steam Guard login when required, then verify a no-key discovery source and a SteamCMD-required Workshop item.
5. Roll back code through the guarded deployment restore point and restore the private environment backup if health or import verification fails.
