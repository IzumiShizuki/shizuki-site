## 1. Authentication and account settings

- [x] 1.1 Verify the reset route is blocked and add gateway regression coverage for reset and protected password change.
- [x] 1.2 Allow anonymous password reset in both monolith configurations.
- [x] 1.3 Use the bound email in account settings and provide a binding shortcut, with frontend regression coverage.

## 2. Verification and deployment

- [x] 2.1 Run relevant automated tests, production builds and strict OpenSpec validation.
- [x] 2.2 Deploy the fix to the personal site and verify public reset, protected change and site health.

## Verification record

- The working branch passed 1,829 frontend tests, 47 authentication tests and Maven packaging. The production source branch passed 22 frontend tests, 46 authentication tests and the Vite production build.
- Deployed revision `2269daa419a5` on 2026-11-04. Verified 288 published static files and all 406 application JAR entries. The live profile bundle matched the build and the DJ entry page matched its pre-release checksum.
- The first activation rolled back when the deployment probe sent camelCase keys. The retry used the same snake_case keys as the browser. The public reset reached validation and rejected an expired code, the unauthenticated account change returned HTTP 401, and both the site and health endpoint returned HTTP 200. Production probes used an invalid test address and did not send email.
- Previous images are tagged `before-password-recovery-2269daa419a5`. The pre-release snapshot is `/opt/shizuki-site-backups/snapshot-20261104-200325-2269daa419a5`.
