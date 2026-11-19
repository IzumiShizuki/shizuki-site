## Implementation

- [x] Port the existing Todo and monthly calendar selectors and shared palette without changing templates or scripts.
- [x] Verify focused tests, production build, local browser and contrast before merging.

## Local verification

- Production Vite build and 56 focused Vitest cases across 10 files passed. Both Vue templates and scripts matched `d2e35287` byte for byte; no migrations, feature modules or window behavior changes.
- In isolated Edge at 1440 px day/night and 390 px touch day, opened synthetic guest Todo, triggered the completed filter with the keyboard, verified completion contrast and line-through, switched to monthly Calendar with the keyboard, and verified the palette and today badge. Six screen captures, no uncaught page errors in the tested scenarios.
- Observed title/card contrast 12.10:1 dark and 14.58:1 light; metadata/card 7.50:1 dark and 7.06:1 light. These are observed palette pairs, not full accessibility certification.
- The base branch's 760 px floating shell on a 390 px screen is unchanged. No iOS hardware, remote service or signed-in actions used.
