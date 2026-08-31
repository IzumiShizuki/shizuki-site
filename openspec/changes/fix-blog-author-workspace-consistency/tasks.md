## 1. Active Scroll Ownership

- [x] 1.1 Extend the application scroll context and scroll-area component with safe nested-owner claim/release behavior, restoration support, and unit coverage.
- [x] 1.2 Convert the desktop blog list and its alternate center panels to a fixed three-column workspace whose center is the active scroll owner, while preserving compact flow.
- [x] 1.3 Convert the desktop blog detail reader to center-owned scrolling with stationary navigation and context rails, and update architecture tests.

## 2. Menu Control

- [x] 2.1 Add explicit manual collapsed/expanded menu state to the presentation resolver and cover top-of-page and scrolled behavior with unit tests.
- [x] 2.2 Keep the desktop menu toggle rendered and accessible in both full and compact presentations without duplicating the compact mobile control.

## 3. Unified Public Author Experience

- [x] 3.1 Generalize the current public author three-column experience so About and Posts share the same persistent profile, center, and life-widget structure.
- [x] 3.2 Implement a real author Posts center column using normalized public blog data, post navigation, loading/error/empty states, and focused component tests.
- [x] 3.3 Make the public author center the active desktop scroll owner and preserve natural compact layout and a single main landmark.

## 4. Capability-Aware Optional Content

- [x] 4.1 Add and test shared classification of feature-disabled versus transient API failures.
- [x] 4.2 Update album, moment, weather, and quote surfaces to remove dead links or ineffective retry controls for disabled/unconfigured capabilities while retaining transient recovery.

## 5. Verification and Delivery

- [x] 5.1 Run focused Vitest suites, frontend lint/type/build checks, and fix any regressions.
- [x] 5.2 Verify desktop and compact behavior in a real browser, including independent scroll positions, menu controls, author About/Posts consistency, post navigation, and unavailable states.
- [x] 5.3 Run the Impeccable UI detector, strict OpenSpec validation, review the final diff, and create the required local conventional commit.
