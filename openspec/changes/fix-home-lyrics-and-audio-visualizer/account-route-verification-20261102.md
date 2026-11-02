# Account-route lyric verification

The App visibility predicate now excludes `/auth` and descendants, including login, registration and OAuth callbacks. Existing `/m`, subtitle-toggle, active-track, music-focus and desktop-home rules are preserved.

- 2026-11-02: `pnpm exec vitest run src/utils/globalLyricBarRoute.spec.js src/utils/lyricAlignment.spec.js` passed 23 tests.
- Fresh delivery build passed: `pnpm exec vite build --outDir ../../tmp/account-route-delivery-20261102` (18.15s, existing Sass/chunk warnings). Active dist was not replaced.
- Real App.vue/player browser verification used only a synthetic local WAV/LRC and a localhost-only mock API; audio was muted. Playback remained active on Home → `/auth` → `/auth/register` → Home. Global lyrics were visible only on Home and restored after returning. GitHub and LinuxDo buttons were visually unobstructed by lyrics. No real login was submitted.
- Local evidence remains in `C:/Users/IzumiShizuki/Documents/Codex/2026-11-02/task/lyric-active-fixture-20261102/playing-{home,login,register}.png`. The fixture server and browser were closed after testing.
- The local Android debug build remains blocked before compilation by `Unable to establish loopback connection`; this is not an APK delivery claim.
- This publication targets the current task branch, not master. Unrelated publisher node_modules and lockfile are excluded.
