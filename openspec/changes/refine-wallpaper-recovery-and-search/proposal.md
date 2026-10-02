## Why

Recently applied wallpapers return to the default after reopening because the existing browser cache is not connected to the application and transient library failures erase saved selection IDs. Workshop imports report a generic SteamCMD failure, while the sparse, translucent search gallery makes browsing slower and less efficient than the supplied Wallpaper Engine reference.

## What Changes

- Restore the last applied wallpaper and its scope immediately from bounded browser storage, then reconcile with refreshed library data without deleting preferences on temporary failure.
- Cache recent static wallpaper image bytes and dynamic wallpaper posters while preserving the selected dynamic profile for normal runtime restoration.
- Diagnose SteamCMD failures using bounded, sanitized output, recover from transient download failures with bounded retries, and provide an explicit retry action with a truthful channel status.
- Reshape discovery into a compact filter rail, dense image grid, pagination and selection inspector using existing site theme tokens.
- Reduce repeated search, detail and preview requests with bounded caching, request deduplication and stale-response protection; measure the resulting improvement.
- Delegate all implementation and acceptance work to Luna on the new local branch.

## Capabilities

### New Capabilities

- `wallpaper-session-recovery`: Scoped wallpaper selection, browser startup cache, and recovery across temporary library/network failures.
- `workshop-import-reliability`: Classified SteamCMD errors, bounded transient recovery and actionable import retry states.
- `wallpaper-discovery-efficiency`: Compact discovery layout and responsive browsing with fewer repeated upstream requests.

### Modified Capabilities

None. The repository currently has no populated main specifications for these contracts; related unarchived changes supply historical context.

## Impact

Affected surfaces include App.vue, browser startup, wallpaperBootCache, UI preference reconciliation, BackgroundPickerDialog, WallpaperDiscoveryPanel, wallpaper API helpers, and media-module discovery/import services and tests. Preserve public API compatibility, existing media access controls, local upload import and Wallpaper Engine format support. No new framework, database migration, push or deployment is required. Production Steam login, ownership, Steam Guard and connectivity remain external conditions that must be reported separately from deterministic acceptance results.
