## 1. Author Workspace Shell

- [x] 1.1 Move the shared author profile rail and life-signal rail to the outer author page so every destination uses one desktop shell
- [x] 1.2 Reduce the about/posts experience to center-column content without a nested three-column scaffold
- [x] 1.3 Make the desktop author shell viewport-bound with fixed side rails and center-only vertical scrolling
- [x] 1.4 Preserve the narrow-screen auxiliary drawer and verify visible, DOM, and focus order

## 2. Vertical Route Rail

- [x] 2.1 Remove the menu-variant horizontal carousel layout and keep route groups vertically stacked
- [x] 2.2 Adjust active-route reveal to use vertical movement only and add regression coverage for horizontal overflow

## 3. Weather and Daily Quote

- [x] 3.1 Verify weather and quote cards independently call the normalized public site-widget resources and preserve their retry/fallback states
- [x] 3.2 Pass external-widget, weather, quote, and upstream-request feature flags through server Compose and document safe production defaults
- [x] 3.3 Add or update tests for independent weather/quote rendering and production configuration wiring

## 4. Two-State Top Menu

- [x] 4.1 Remove the compact desktop route dock so collapsed mode exposes only the standalone `MENU` control
- [x] 4.2 Preserve the existing Home appearance and atmosphere controls inside the full menu
- [x] 4.3 Update menu presentation and component tests for full/collapsed semantics, manual expansion, route scrolling, and keyboard labels

## 5. Verification and Delivery

- [x] 5.1 Run focused author, route-rail, site-widget, and top-menu tests
- [x] 5.2 Run the full frontend test suite and production build
- [x] 5.3 Run the Impeccable detector and browser-check all author destinations at desktop and narrow viewports
- [x] 5.4 Validate the OpenSpec change strictly, inspect the diff, and commit the completed change locally
