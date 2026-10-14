## 1. Audit and authorization

- [x] 1.1 Record exposure findings and admin/public-media review guidance.
- [x] 1.2 Add regression coverage and enforce voice playback, provider and public-playlist isolation.
- [x] 1.3 Remove built-in default voice grants through a forward migration and label explicit wallpaper access in admin catalogs.
- [x] 1.4 Gate external wallpaper search/details/previews/imports on the server and hide unauthorized frontend controls.

## 2. Companion separation

- [x] 2.1 Add runtime-only owner mode and generic cat companion with ordinary shortcuts and hidden accessible activation.
- [x] 2.2 Gate Home and AI Hub character views by the shared mode; reset/unmount on account change, logout and return to normal.
- [x] 2.3 Cover visitor, owner, direct route, lifecycle and hidden-mode cases with frontend regression tests.

## 3. Verification and delivery

- [x] 3.1 Run applicable frontend/Maven tests and production build; inspect the ordinary companion in a browser and run the UI detector.
- [x] 3.2 Verify requirements against implementation, strictly validate OpenSpec, document remaining deployment/data-audit boundaries, and commit only this change locally.

## Handoff

Production deployment and existing PUBLIC media/CDN review are outside this local change; see audit.md for required checks. Full frontend suite has 24 baseline failures in the unchanged About component due to missing IntersectionObserver in jsdom; relevant tests and builds pass. The independent untracked OAuth helper and astrbot-bible project are not part of this commit.
