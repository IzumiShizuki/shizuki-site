## 1. Regression coverage

- [x] 1.1 Add AI Hub component coverage for the shared ordinary-conversation workbench, its normal-mode contract, and guest state.
- [x] 1.2 Add a failing network-error recovery test that verifies actionable Chinese copy and the existing scene retry path.
- [x] 1.3 Add focused source coverage for AI-scoped semantic surfaces across the hub, chat canvas, and session rail.

## 2. Implementation

- [x] 2.1 Correct ordinary-conversation status copy and translate connection-level town failures without hiding other service errors.
- [x] 2.2 Define setting-derived AI Hub surface aliases and apply them to the workspace and conversation layout.
- [x] 2.3 Update the shared chat dialog and session rail to consume inherited AI surface aliases while preserving existing states and responsive behavior.

## 3. Verification

- [x] 3.1 Run focused AI Hub component and theme regression tests.
- [x] 3.2 Run the full frontend test/build pipeline and the Impeccable detector.
- [x] 3.3 Verify town recovery, ordinary conversation, and representative computed colors in night and day modes in the local browser.
