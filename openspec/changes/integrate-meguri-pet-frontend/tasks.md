## 1. Character presentation foundation

- [x] 1.1 Add a pure web character-presentation utility for safe expression, intensity, outfit, sprite, and motion mapping.
- [x] 1.2 Extend canonical expression event tracking with motion cues and add focused utility/reducer tests.

## 2. Web companion experience

- [x] 2.1 Refactor `MeguriPage` into the browser-adapted character stage, compact/expanded chat dock, status rail, and control island.
- [x] 2.2 Add outfit switching, chat visibility/history preferences, retry, refresh, keyboard behavior, safe sprite fallback, and reduced-motion handling.
- [x] 2.3 Update `MeguriPage` regression tests for streaming, failure/retry, session isolation, controls, and character presentation.

## 3. AI Hub integration

- [x] 3.1 Add an ADMIN-only “爱莉伴聊” primary AI Hub mode that embeds the Web companion and uses the full-width workspace layout.
- [x] 3.2 Update AI Hub tests to prove the mode is present for administrators, absent for other users, and activates the embedded companion.

## 4. Verification

- [x] 4.1 Run focused and full frontend unit tests, production build, and strict OpenSpec validation.
- [x] 4.2 Inspect the integrated companion in desktop and narrow browser viewports and correct material layout or interaction defects.
