## Context

`BackgroundPickerDialog` currently owns installed-wallpaper selection, scope, import controls, and owned-wallpaper settings. `WallpaperDiscoveryPanel` owns source search, gallery preview state, selection, and import events. Their data contracts are compatible, but they render as separate visual products. See `proposal.md` and `specs/unified-wallpaper-workspace/spec.md` for the observable contract.

## Goals / Non-Goals

**Goals:**

- Make the entire dialog read as one task-oriented desktop wallpaper client.
- Preserve all parent-owned events and mutable state rather than moving behavior into a new store.
- Reuse the existing theme/accent variables and liquid material conventions.
- Keep online source logic isolated in the discovery component while letting the parent select its source from the shared top navigation.
- Reduce vertical overflow and copy density at common laptop sizes.

**Non-Goals:**

- Do not copy Wallpaper Engine trademarks, artwork, exact colors, or proprietary assets.
- Do not add playlists, voting, subscriptions, displays, or editor capabilities that Shizuki does not support.
- Do not change discovery APIs, authentication, imports, persistence, or background application semantics.

## Decisions

### 1. Map the existing two modes to three familiar workspace sections

The existing `select` mode becomes My Wallpapers. The existing `acquire` mode remains the parent compatibility boundary, while a local acquisition source selects Discover (Wallhaven) or Workshop (Steam). Top navigation emits the existing picker mode update, so `App.vue` remains unchanged.

Alternative: add a third parent mode. Rejected because it expands the public contract without adding behavior.

### 2. Use the same two-column composition in every section

The main region contains a compact toolbar and thumbnail gallery; a fixed-width right rail owns the selected preview, metadata, settings, and the primary action. Installed cards and online cards use the same aspect ratio, selection edge, typography, and spacing. On narrow screens the rail moves below the gallery.

Alternative: retain a separate full-width installed grid. Rejected because it recreates the visual discontinuity the change addresses.

### 3. Invert ownership only for source selection

The parent passes a controlled `source` to the discovery component. The discovery component keeps query, filters, pagination, selected online item, and preview state. This small seam lets the shared top navigation switch online sources while retaining the existing import events.

### 4. Use Shizuki tokens as the visual authority

The workspace derives translucent surfaces from `--theme-panel-surface`, `--theme-surface-soft`, and `--theme-panel-surface-elevated`; active controls and selection derive from the accent mode tokens. A restrained neutral field plus one user-configured accent replaces the hard-coded black/orange palette.

### 5. Collapse secondary tools instead of deleting them

Refresh and import job status stay in the toolbar. Package upload and manual URL import live in one disclosure panel. Owned-wallpaper properties live in the installed detail rail. Contextual errors remain near their action. Repeated prose and decorative English micro-labels are removed.

## Risks / Trade-offs

- [Many controls compete in the installed detail rail] -> Show editable settings only for an owned active wallpaper and keep advanced custom values grouped below core controls.
- [Controlled source can reset search unexpectedly] -> Watch source changes and reset only source-specific result state before searching.
- [Glass surfaces lose contrast on bright wallpapers] -> Layer theme surfaces with a subtle neutral tint and keep borders/text tied to existing contrast tokens.
- [Mobile height becomes long] -> Use a single document scroll and stack detail below gallery at the existing breakpoint.

## Migration Plan

No data migration is required. Replace the two component templates/styles while preserving props and emitted events, update tests, and roll back by reverting the frontend commit if visual verification fails.
