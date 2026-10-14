## Context

See proposal.md for the exposure findings. The site already has ADMIN-only management, group permissions, PUBLIC/PRIVATE wallpaper audit, authenticated Meguri sprite delivery, and an on-demand companion. The public external wallpaper proxy currently serves unmoderated upstream material. Voice search checks `music.asmr.access`, but playback resolution (including shared cache hits) does not.

## Goals / Non-Goals

**Goals:** Enforce authorization before fetching or returning sensitive material; use existing group management; default every browser session to an ordinary companion; preserve the existing owner-only Meguri runtime.

**Non-Goals:** Automatic visual moderation, classifying arbitrary uploads as adult, granting access to Meguri Core to other users, editing the standalone pet repository, or deployment.

## Decisions

1. Keep `music.asmr.access` as the entire voice-zone grant, covering every age category. Add a forward migration removing the historical built-in FRIEND/USER/GUEST grant; leave custom groups and ADMIN intact. Authorized custom groups can be created and assigned from the existing backend. Never rewrite applied migrations.
2. Check voice access before any playback cache lookup or upstream call. Omit ASMR provider records and deny ASMR guide/virtual playlist requests for unauthorized viewers. Exclude public user playlists containing ASMR and filter default tracks. The shared home cache must contain only ordinary public music so an administrator cannot poison a visitor response.
3. Gate all external wallpaper discovery behind `media.wallpaper.discovery` because Steam results and user-generated upstream tags cannot establish a reliable public moderation boundary. Enforce in the service and controller; use private no-store previews to prevent an authorized preview becoming a shared public cache entry. Gate Workshop imports as well. PUBLIC wallpapers remain subject to the existing approval process.
   Search results do not use the former shared frontend cache. Preview fallback uses an authenticated blob URL, revoked on retry/unmount. ASMR playback does not reuse historical public audio caches, and both publisher and consumer refuse voice uploads to the public bucket. Monolith MySQL/PostgreSQL each have their own forward migration in addition to the standalone user module.
4. Introduce a reactive, runtime-only per-account companion mode shared by Home, the floating companion, and AI Hub. Normal mode is universal and uses a small web-native cat, with focus/music shortcuts. Only an authenticated ADMIN can activate anime mode by five activations of the cat within three seconds, or the same gesture with keyboard Enter/Space. No public labels describe the hidden mode. A visible return-to-normal action exists inside anime mode. Account change/logout resets the state and unmounts sensitive UI.
5. Keep hidden-mode state separate from authorization: local state cannot grant backend access. AI Hub ignores a `mode=meguri` URL unless ADMIN has explicitly enabled anime mode. MeguriPage is dynamically imported only in that branch.

## Risks / Trade-offs

- [Risk] Existing PUBLIC media or manually mislabelled public playlists may already contain sensitive material. → Document the required owner audit; code authorization cannot infer image/audio meaning. Do not claim the current production dataset was inspected.
- [Risk] Removing the FRIEND default affects existing friends. → Provide explicit custom-group authorization instructions and keep custom grants intact.
- [Risk] Existing tokens/cache may retain old permissions until refresh. → Explain logout/refresh after deployment; normal request authorization still applies.
- [Risk] External wallpaper discovery is more restricted than SFW-only browsing. → Intentional conservative boundary; curated public wallpapers remain available.
- [Risk] Hidden gesture is less discoverable. → Document it for the owner; support keyboard activation and normal-mode escape.

## Migration Plan

Run focused regression tests, frontend suite/build and appropriate Maven reactor tests; strictly validate OpenSpec; commit locally. On a separately authorized deployment, apply the new Flyway migration, refresh existing sessions, then audit approved public wallpapers/media and login artwork in ADMIN. Reverting code alone does not regrant the removed default permission; restore only deliberate group grants.
