## 1. Wallpaper Synchronization

- [x] 1.1 Resolve the current music-route wallpaper before the Home fallback while preserving dynamic preview handling.
- [x] 1.2 Keep the existing wallpaper watcher and update both the ambient Folia surface and bridge payload when the effective selection changes.

## 2. Toolbar Layout

- [x] 2.1 Increase desktop toolbar padding, control height, and action spacing, and remove the unused fixed right-side reservation.
- [x] 2.2 Reflow the toolbar at intermediate widths and keep narrow-screen icon actions accessible with at least 36px targets.

## 3. Verification

- [x] 3.1 Run the layout detector and review the wide and narrow toolbar rules against the provided screenshot.
- [x] 3.2 Build the frontend and validate this OpenSpec change strictly.
