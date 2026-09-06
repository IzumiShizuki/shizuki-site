## Context

See `proposal.md` for motivation. Apps already resolves its large panels and cards through the shared semantic surface family. AI Hub defines a parallel alias family, but its canvas and elevated aliases are currently accent-heavy gradients; those aliases are also inherited by the normal conversation dialog and session rail. AI Town additionally uses a fixed navy map background. Shared global styles apply some semantic surfaces, but AI Hub’s later `!important` declarations win on the largest panels.

This is an Operate surface. The intended emotional temperature is warm and restrained: background-derived wine/brown or warm-light panels own large regions, contrast remains moderate, and the current accent is rare enough to make selection and primary actions obvious.

## Goals / Non-Goals

**Goals:**

- Make AI Hub visibly belong to the same theme system as Apps without flattening its interaction hierarchy.
- Keep one AI alias family that automatically propagates to town, conversation, tavern, session rail, and companion surfaces.
- Preserve readable day and night compositions and existing non-color selection cues.

**Non-Goals:**

- Changing AI Hub layout, copy, data behavior, routes, or mode availability.
- Redesigning the map topology, NPC content, or conversation component structure.
- Copying Apps-specific hard-coded legacy color values into AI Hub.

## Decisions

### 1. Rebind AI aliases to shared semantic theme roles

The AI canvas alias maps to the same panel surface used by Apps. The elevated alias maps to the shared elevated panel, soft and input aliases map to their corresponding semantic surfaces, and hover maps to the shared floating hover surface. Border, shadow, and text aliases continue to map to the existing semantic tokens.

Directly copying Apps’ historical RGBA values was rejected because those values can be overridden by the shared theme contract and would drift when wallpaper-derived colors change.

### 2. Keep large surfaces neutral and use accent only for state

The workspace shell, primary/side panels, conversation rail, dialog, and inputs consume the aligned aliases. Mode selection, active map nodes, focus rings, primary actions, and small map glows continue to consume accent tokens. This preserves wayfinding while eliminating the broad peach wash.

Reducing the opacity of the current accent gradients was considered, but it would still make large panels an accent role and remain inconsistent with Apps.

### 3. Recompose the map from semantic base plus restrained accent atmosphere

The fixed navy linear gradient is replaced with the shared panel base. Low-opacity accent and soft-accent radial lights create location atmosphere, while the existing texture is recolored from neutral white/black to accent-derived lines. Map nodes keep shape, borders, labels, and elevation in addition to color, so selection is not color-only.

Removing the map atmosphere entirely was rejected because it would erase useful spatial differentiation and make the town mode look like a generic card grid.

### 4. Remove redundant day-only palette inversion

Day mode should use the same alias mapping and let the global theme provide its light surface values. The AI-specific day map override remains only where it controls pattern contrast, using semantic theme spots and panel surface rather than independent color constants.

This keeps day and night as separately composed theme values while avoiding duplicate component palettes.

## Risks / Trade-offs

- [Nested panels could become visually flat] → Use canvas versus elevated aliases, borders, and the existing spacing/elevation hierarchy rather than stronger accent fills.
- [Map texture could become too subtle on some wallpaper palettes] → Retain two low-opacity accent radial lights and semantic border contrast; verify computed results in both themes.
- [Shared tokens may be gradients] → Apply them as complete background roles instead of attempting color arithmetic on gradient values.
- [Conversation components inherit the aliases indirectly] → Keep their existing fallback chains and cover them with source contract tests plus browser mode switching.

## Migration Plan

1. Add regression assertions for semantic alias mappings and removal of fixed large-surface palettes.
2. Update AI Hub aliases, major panel surfaces, text roles, and map styling.
3. Update the shared day map override to the same semantic family.
4. Run unit tests, production build, static UI detection, and day/night browser comparison against Apps.

Rollback is a frontend-only revert of the theme declarations. No data or API migration is required.
