## Purpose

Keep a user's applied wallpaper visible across reopening and temporary network failures, using bounded browser storage while preserving route scope and account access boundaries.

## ADDED Requirements

### Requirement: Restore an applied wallpaper before library loading completes
The application SHALL persist the last successfully applied wallpaper's stable identity, display snapshot and selection scope, and SHALL restore that selection before a fresh library request completes. Importing without applying SHALL NOT change the active wallpaper.

#### Scenario: Reopen with a previously applied wallpaper
- **WHEN** the user applies a wallpaper, closes and reopens the application while library loading is delayed
- **THEN** the stored wallpaper image or dynamic poster is displayed and the global or current-route selection is preserved

#### Scenario: Download without selecting
- **WHEN** an import completes without a wallpaper application action
- **THEN** the wallpaper is available in the library without replacing the existing active selection

### Requirement: Temporary failures preserve selection
The application SHALL retain saved selection identities when library requests fail or authentication is still initializing. It SHALL reconcile against authoritative successful library data and SHALL honor explicit deletion or access revocation.

#### Scenario: Temporary library failure followed by recovery
- **WHEN** a selected wallpaper exists in storage, the library request fails and a later successful request contains that wallpaper
- **THEN** the saved global and route identities survive the failure and the recovered wallpaper is selected automatically

#### Scenario: Explicit removal
- **WHEN** the user deletes an applied wallpaper successfully
- **THEN** it is removed from restored snapshots and the application selects a valid fallback

### Requirement: Browser image storage is bounded and safely optional
The application SHALL cache recent static wallpaper image bytes and available dynamic preview images in bounded browser storage. Cache misses, unavailable storage, CORS errors and expired media links SHALL degrade safely without erasing selection. It SHALL invalidate private restored data on logout or account change.

#### Scenario: Cached image with an expired signed URL
- **WHEN** an applied image was cached and the application reopens with an expired signed URL
- **THEN** cached image bytes display while fresh authorized metadata is fetched

#### Scenario: Storage unavailable
- **WHEN** browser storage is unavailable or image caching fails
- **THEN** the application remains usable and preserves any available selection preferences

#### Scenario: Logout removes private restoration
- **WHEN** the user signs out or changes accounts after applying a private wallpaper
- **THEN** the previous account's private snapshot and cached display do not restore for the new session
