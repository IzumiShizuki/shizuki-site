## 1. Shared workspace frame

- [x] 1.1 Replace the two-mode picker header with My Wallpapers, Discover, and Workshop navigation while retaining the existing picker mode contract.
- [x] 1.2 Rebuild the dialog as one responsive frosted workspace with a gallery region, persistent detail rail, and compact bottom actions.
- [x] 1.3 Move route/global scope, library refresh, import status, and add-wallpaper controls into concise shared toolbars/disclosures.

## 2. Installed wallpaper experience

- [x] 2.1 Render installed wallpapers with the shared card treatment and selected detail preview.
- [x] 2.2 Move owned-wallpaper core settings and actions into the installed detail rail without changing emitted events.
- [x] 2.3 Preserve type filtering, current selection, route/global application, and narrow-screen behavior.

## 3. Online browsing experience

- [x] 3.1 Make the discovery source controllable by the parent navigation and map Discover to Wallhaven and Workshop to Steam.
- [x] 3.2 Restyle online search, gallery, pagination, preview states, and inspector with Shizuki theme/accent tokens.
- [x] 3.3 Remove redundant rail copy and decorative labels while preserving source filters, guest browsing, and authenticated imports.

## 4. Verification

- [x] 4.1 Update component tests for workspace navigation, installed details, controlled online sources, concise guest import state, and existing event payloads.
- [x] 4.2 Run targeted frontend tests, production build, Impeccable detector, and strict OpenSpec validation.
- [x] 4.3 Verify all three workspace sections, preview loading, selection, responsive layout, and visual continuity in the local Shizuki browser.
