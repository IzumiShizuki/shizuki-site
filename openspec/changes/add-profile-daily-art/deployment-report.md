# Daily artwork production delivery

Date: 2026-10-07. Personal server 111.228.35.186; application /opt/shizuki-site; deployed source revision bb54b60ced5afc213e166398b59f1b525078ff4a.

## Build and runtime identity

- Initial merged release: all 1,596 Vue tests passed; 29 daily-art/auth backend tests passed; Vite production build and ten-module Maven package succeeded.
- Frontend built with the existing production settings read in memory; no private configuration committed.
- Runtime JAR SHA-256: d39966ab51bb35f3a92d30781ac68472a8133d221471bd9586b00210097e596f.
- All 231 expected static files were checked against runtime SHA-256. Both backend and site OCI revision labels match the deployed commit. Previous hashed assets are retained.
- Private configuration fingerprints are unchanged. Middleware and Folia were not restarted.

## Verified production behavior

- Backend health UP; public website responds successfully.
- Flyway version 1016 succeeded in public.flyway_schema_history. public.usr_daily_art user 1 retains a nonempty encrypted session, 17 followed artists, Shanghai date 2026-10-07 and six persisted artworks.
- Logged-in Administrator personal page displays six daily works and sister-type character 司波深雪. All seven preview images completed with nonzero natural dimensions.
- Searching 司波深雪 returned artwork results in the live personal page. Artist and original artwork links are present.
- Anonymous personal-settings access returns 401; invalid public preview ID returns 400. Unit regressions enforce numeric age classifications and R-18/R-18G exclusion before listing/search/image transport.
- Credentials are not disclosed in UI responses, reports, Git, or screenshots. PHPSESSID requires manual replacement after expiry.

## Recovery

Verified pre-release app/config/database/named-volume snapshot:

`/opt/shizuki-site-backups/snapshot-20261007-183405-a3f9225d367f`

READY marker, tar listing, pg_restore catalog and backup SHA-256 checks passed. Previous backend/site images are retained under backup-before-dailyart-bb54b60ced5a tags. Deployment gates restore previous images on runtime failure.

Screenshot: `D:/program/_codex_deploy/daily-art-release-20261007/production-profile.jpg`. Machine-readable runtime identity: sibling release.json. Both are local evidence outside Git; no credentials are stored in either.
