## 1. Regression Coverage

- [x] 1.1 Add TopMenu tests proving desktop Site and mobile Life emit direct author navigation without mounting a second-level destination panel.
- [x] 1.2 Add AuthorPage tests proving missing and legacy overview tabs canonicalize to About and public navigation no longer exposes “网站主页”.
- [x] 1.3 Add About composition assertions for migrated identity, status, skill, portal, Albums, and Moments access.
- [x] 1.4 Add source-contract tests for persistent menu mounting, collapsed accessibility state, compositor-only disclosure, reduced motion, and semantic color tokens.

## 2. Direct About Navigation

- [x] 2.1 Replace the desktop Site and mobile Life popover triggers with accessible direct About navigation controls.
- [x] 2.2 Remove the unused Site popover state, preview-fetch lifecycle, outside-pointer listener, component import, and obsolete component files.
- [x] 2.3 Canonicalize `/author`, invalid public tabs, edit, and legacy overview links to `tab=about` while preserving eligible admin tabs.

## 3. Consolidated Public Experience

- [x] 3.1 Remove the public Overview navigation item and large overview-only render branch.
- [x] 3.2 Add a compact About introduction block that presents hero identity, public status, skills, and primary site destinations from existing profile data.
- [x] 3.3 Preserve About story editing, Journey/Posts navigation, and direct Albums/Moments access in the shared public workspace.

## 4. Menu Motion and Theme Consistency

- [x] 4.1 Keep the liquid top-bar subtree mounted across disclosure state changes and apply collapsed `inert`, `aria-hidden`, pointer, and visibility behavior.
- [x] 4.2 Replace broad and layout-driving menu transitions with explicit transform, opacity, color, and shadow transitions plus a reduced-motion override.
- [x] 4.3 Replace fixed neutral/blue-gray colors in the affected menu and public About components with semantic surface, border, text, icon, shadow, focus, and accent tokens.

## 5. Verification and Delivery

- [x] 5.1 Run focused TopMenu, AuthorPage, and About component tests.
- [x] 5.2 Run the full frontend unit suite and production build.
- [x] 5.3 Run the Impeccable design detector and perform browser checks in day/night themes at desktop and mobile widths.
- [x] 5.4 Validate the OpenSpec change strictly, update task state, inspect the final diff/status, and create a local conventional commit.
