## 1. Home preference state

- [x] 1.1 Add a normalized, versioned Home appearance preference module for global clock behavior, wallpaper overrides, and vivid/calm/off motion
- [x] 1.2 Add unit tests for defaults, persistence, dynamic-wallpaper automatic behavior, and override precedence

## 2. Home time stage

- [x] 2.1 Replace the Home card layout with the centered geometric clock, greeting/date support, and Home-only ambient treatment
- [x] 2.2 Implement at most three responsive music, Focus/Todo, and reminder islands using existing player, Focus, and light-app APIs
- [x] 2.3 Apply vivid/calm/off and reduced-motion policies to Home animations and interactions
- [x] 2.4 Update Home component tests for clock visibility, island actions, Focus entry, and content-route navigation boundaries

## 3. Shell controls and wallpaper context

- [x] 3.1 Provide active wallpaper metadata to Home and pass the effective Home appearance state into TopMenu
- [x] 3.2 Extend the existing Menu theme item with a secondary day/night and Home appearance panel while preserving collapsed Menu and route shortcuts
- [x] 3.3 Add or update TopMenu tests for route-aware appearance controls and emitted preference actions
- [x] 3.4 Add representative-frame wallpaper color sampling with a Home-only automatic/manual accent preference
- [x] 3.5 Add tests for color sampling fallback, preview-frame selection, and manual override controls

## 4. Levitation ball behavior

- [x] 4.1 Add upper-middle right default placement, nearest-edge snapping, side-aware expansion, and versioned position persistence
- [x] 4.2 Add focused tests for default placement, edge selection, and saved vertical position restoration

## 5. Verification

- [x] 5.1 Run targeted Vitest suites for Home preferences, HomePage, TopMenu, Focus/light-app policies, and levitation behavior
- [x] 5.2 Run the frontend production build and strict OpenSpec validation
- [x] 5.3 Verify Home and Menu interactions at 1440px and 1024px in a browser, plus Blog route containment and reduced-motion behavior
