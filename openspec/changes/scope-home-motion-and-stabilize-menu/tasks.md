## 1. Regression Signals

- [x] 1.1 Add a failing test that proves Home soothing does not bind the global motion provider or hide route content.
- [x] 1.2 Add a failing TopMenu test that proves visible menu-entry count and order stay identical across Home and content routes.
- [x] 1.3 Add a failing TopMenu interaction test for opening Home appearance through the active Home entry without a separate settings item.

## 2. Home Motion Ownership

- [x] 2.1 Move motion-level persistence and legacy migration into Home appearance state with immersive as the deterministic default.
- [x] 2.2 Decouple the application shell, root attributes, and non-Home routes from the Home motion choice.
- [x] 2.3 Keep Home-owned stage and background behavior responsive to the local immersive/soothing value.

## 3. Stable Menu Composition

- [x] 3.1 Remove the route-conditional Home appearance menu item and anchor its popover to the existing Home entry.
- [x] 3.2 Preserve Home navigation from other routes and toggle appearance only when Home is already active.
- [x] 3.3 Update accessible names, descriptions, and popover positioning for the reused Home entry.

## 4. Verification

- [x] 4.1 Run focused motion, Home, TopMenu, and navigation regression tests.
- [x] 4.2 Run the full frontend test suite and production build.
- [x] 4.3 Perform desktop browser checks for mode switching, route rendering, stable menu composition, and popover placement.
- [x] 4.4 Validate the OpenSpec change strictly and record the completed task state.
