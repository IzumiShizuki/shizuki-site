## 1. Backend playback source selection

- [x] 1.1 Make account-bound Netease playback take precedence over generic source-cache hits in account-first/account-only modes.
- [x] 1.2 Update Netease account playback resolution to request the Cookie-authorized stream URL, prefer the member-capable upstream response, and keep a bounded public fallback.
- [x] 1.3 Extend account playback lyric mapping to return original, translated, and pronunciation tracks without logging credentials.
- [x] 1.4 Add backend regression tests for account-source cache bypass, member stream URL selection, and bilingual account lyrics.

## 2. Frontend playback recovery

- [x] 2.1 Pass `forceRefresh` when the player proactively refreshes an existing provider playback URL.
- [x] 2.2 Keep first-attempt media failures inside the same click flow and limit silent source recovery to one retry.
- [x] 2.3 Delay or remove transient playback alerts so a recoverable cached-source failure is not shown as a user-facing error.
- [x] 2.4 Add frontend regression tests proving the refresh flag, one-click recovery, and final-failure behavior.

## 3. Cross-module lyric presentation

- [x] 3.1 Add translation fields to the player lyric context while preserving previous/current/next original lines and existing render-mode preferences.
- [x] 3.2 Render current and next bilingual subtitle content in the compact player and global subtitle bar used by other modules.
- [x] 3.3 Add frontend tests for translated context rows, first/last line edge cases, and default bilingual rendering.

## 4. Verification

- [x] 4.1 Validate the OpenSpec change and run focused frontend and backend test suites.
- [x] 4.2 Run the relevant frontend build and backend build/check, then review the final diff for credential/URL leakage and unrelated changes.
