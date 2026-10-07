## 1. Reproduce production failure

- [x] 1.1 Run a failing regression using a video project whose runtime MP4 exceeds the ordinary upload cap.
- [x] 1.2 Record sanitized production job, download-log and manifest evidence.

## 2. Repair cached media imports

- [x] 2.1 Add the separate Workshop media import cap and map it through monolith and Compose configuration.
- [x] 2.2 Filter and size-check eligible files before reading, then persist selected cached assets through closed file streams.
- [x] 2.3 Distinguish oversized visual media from actual native scene files and preserve inspection diagnostics after SteamCMD completes.

## 3. Verify and deliver

- [x] 3.1 Cover the observed file size, cap boundary, streaming persistence and native-scene fallback with focused regressions.
- [x] 3.2 Run relevant media/frontend checks and build the monolith and frontend with the existing toolchain.
- [x] 3.3 Update operations guidance, verify both wallpaper changes, validate OpenSpec and commit the focused local changes.
