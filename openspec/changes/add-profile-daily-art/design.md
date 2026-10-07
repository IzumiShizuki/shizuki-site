## Context

See proposal.md for motivation. ProfilePage uses persistent visible accordion sections; MobileProfilePage is a separate shell. Existing user preferences are replaced as a whole and music keeps a snapshot, so storing this feature in that JSON would risk overwrites. AES-256-GCM is already available through MusicApiKeyCryptoService.

Live checks on 2026-10-07 confirmed public artwork metadata, latest artist works and safe tag search work anonymously. Following requests return 400 without login. Pixiv has no confirmed official third-party OAuth registration suitable for this site; do not present cookie connection as OAuth.

## Goals / Non-Goals

**Goals:** Real images, account association, independent per-user preferences, stable persisted daily outcomes, useful failures, safe bounded server-side reads.

**Non-Goals:** Pixiv password collection, browser cookie extraction, modifying Pixiv follows/bookmarks, mass downloading, scheduling messages, installing a bot.

## Decisions

- Use a dedicated USR_DAILY_ART row with independent config_json and daily_json. Config contains account metadata, encrypted PHPSESSID and separate manual/imported artists. Daily JSON contains date and successful section results; atomic upsert preserves already-selected sections on the same date. This avoids races with music preferences and permits retrying only missing sections.
- Implement Pixiv access in user-module, alongside connection ownership. Fixed upstream www.pixiv.net, HTTPS pximg.net preview allowlist, no redirects, bounded response bodies, request timeouts, short bounded metadata caching and a bounded worker pool. Optional proxy reuses the configured wallpaper proxy unless a Pixiv-specific proxy is set.
- Validate the PHPSESSID UID prefix against the provided account and verify authenticated following access before encrypted persistence. Accept bare session value or extract PHPSESSID from cookie input without retaining other cookies. No credentials in logs, API responses or browser storage.
- Sync up to 240 artists total using paginated public and optional private requests; return imported count and truncation. Manual artists remain separate. Daily fetch rotates deterministically over three configured artists, samples their available all-ages illustrations, and persists up to six recommendations. Completed daily choices survive preference edits and become eligible to change the next day.
- Daily wife uses a built-in named sister-type character catalog with precise Japanese Pixiv tags. The character is deterministically chosen by user and date; image retrieval uses safe tag search and server-side filtering. No unreviewed random image endpoint.
- Require a numeric all-ages xRestrict value of zero; reject adult tags in either listing arrays or detail tag objects, malformed optional restrict/sl fields, R-18 and R-18G. Use the same predicate for latest works, search and freshly fetched previews so classification failures never fall through to downloading an image.
- User-requested account setup may save verified association data for the website user shown in the logged-in personal UI. If the running site is older than this feature, prepare only the additive table from V1016 and its encrypted account row; do not deploy unrelated code or mark Flyway migrations manually. PHPSESSID renewal remains a manual user action.
- Reuse one Vue DailyArtPanel component on desktop and mobile. Layout: an image-first daily gallery with a companion portrait alongside it; account and artist editing are tucked into native details, and search has its own explicit submit/results. Existing warm peach theme tokens, inherited body fonts, restrained serif character name, utility date digits. Reference colors: peach #F2B39D, rose #EFA0A8, ink #403843, soft surface #FFF8F5, muted #8B7885; derive actual surfaces and text from existing CSS variables to respect theme/background. The single visual emphasis is the daily character portrait, with no added animation.

## Risks / Trade-offs

- [Unofficial API can change or expire] → document the source, show actionable session renewal and upstream errors, retain successful cached selections.
- [Real account validation boundary] → initial development used anonymous live endpoints and mocked authenticated contracts. Subsequent user-authorized setup verified the actual public following contract and encrypted storage; private follows and production form submission remain unverified until deployment.
- [Server cannot reach Pixiv] → optional existing proxy and finite timeouts; no false successful import.
- [Artwork visibility can change after selection] → preview always revalidates current all-ages visibility, and image failure shows original link.
- [Large following lists] → visible 240-artist cap, per-day rotating subset, manual overrides.

## Migration Plan

Add PostgreSQL-compatible V1016 for the supported monolith runtime. The historical user-module migrations are MySQL scripts, so do not add a PostgreSQL migration into that legacy root. Deploy backend before frontend; Flyway creates the independent table. Rollback code leaves dormant data; remove the table only through an explicitly requested data cleanup. No deployment or push is included in this local implementation.

The subsequent user-requested deployment uses the existing deployed commit a3f9225d as the local master baseline and applies only the two daily-art commits. Build from that master tree and publish verified immutable artifacts using the existing artifact-release approach; keep production private configuration, old hashed frontend assets and rollback images. Create a fresh database/config/source/volume restore point before changes, use the existing host-key validation, and check API health, migration, account isolation, safe previews and authenticated browser results. Git push is a separate action and is not part of this deployment request.
