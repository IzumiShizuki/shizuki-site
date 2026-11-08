## 1. Shared Foundation

- [x] 1.1 Extract the approved palette/spacing/control roles, register the shared styles and preserve About through aliases.
- [x] 1.2 Implement coherent shell/navigation/mobile theme bridges without altering runtime preference behavior.

## 2. Route Adaptation

- [x] 2.1 Have Claude implement the content composition module for Home, Blog, Albums and Moments.
- [x] 2.2 Have Claude implement the operational module for Music, Apps, AI, Auth, Profile and mobile containers.
- [x] 2.3 Review rendered routes and fix cascade, contrast, overflow and state integration problems.

## 3. Verification and Publication

- [x] 3.1 Verify representative routes in both themes and at mobile/intermediate widths, including focus, motion and real loading/empty/error states.
- [x] 3.2 Run the relevant/full frontend regressions, production build and design checks; record evidence and limitations.
- [x] 3.3 Verify the change against specs, validate strictly and create the scoped local commit.
- [x] 3.4 Fetch/prune, integrate remote changes if any, rerun applicable checks, push verified refs and confirm remote synchronization.

Evidence: verification.md and claude-layout.md. Implementation, checks and authorized publication are complete. Native /m routes redirect in this desktop preview, and authenticated/admin states are covered by existing fixtures rather than a live privileged session. The final documentation-only commit records the verified publication.

## 4. Authorized Production Deployment (2026-11-08)

- [x] 4.1 Freeze the approved frontend release and reuse production build arguments without exposing secrets.
- [x] 4.2 Create and verify a restore point, stage a frontend-only image, preserve shared assets and guard existing backend/DJ state.
- [x] 4.3 Activate only the site service, verify public assets, API health and rendered production pages; record deployment and rollback evidence.

Deployment evidence: deployment-report.md. All 12 tasks are complete. Existing unrelated deploy-test drift (`PAGE_SIZE=24` assertion against the current `72` example) is recorded there; no backend or DJ source/runtime update was included in this frontend release.
