## Why

The user reports slow entry, an apparently stale About UI at the ordinary production URL, and a collapsed menu handle floating below the top edge. A production cold run measured a 16.3s load, 5.5MB in two CJK fonts plus the default PNG, missing HTML cache directives, and the collapsed handle at y=115px.

## What Changes

- Make HTML revalidate and versioned static assets cache reliably without caching API responses or breaking shared DJ/Folia resources.
- Reduce the measured first-viewport image/font cost while preserving the approved typography, content and selected wallpaper behavior.
- Dock the collapsed desktop menu handle at the top, preserving expanded/mobile/keyboard behavior.
- Add focused regressions, compare cold/warm production measurements, and publish/deploy the verified frontend through the already authorized isolated release workflow.

## Capabilities

### New Capabilities

- `reliable-site-entry`: Fresh entry documents, bounded startup resource cost and a correctly docked collapsed navigation handle.

### Modified Capabilities

None. API and account behavior remain unchanged.

## Impact

Frontend entry/cache delivery, font/background resource selection, TopMenu layout and tests; production frontend image only. No backend, DJ deployment, secrets, new service or dependency reinstall. Retain restore-point, static-asset and unaffected-service guards used in the preceding deployment.
