## Context

See proposal.md for motivation. The rail uses nested auto-row CSS grids inside a desktop-stretched container. AI Hub similarly stretches implicit toolbar and stage rows. Current semantic theme variables provide the visual authority; this is a refinement in Operate mode.

The ignored `.env.local` points at `http://127.0.0.1:7070`, where no service listens. Read-only SSH probes of the personal server confirmed anonymous scenes and public map requests return 200 from the deployed backend. Direct client HTTP probes are affected by this machine's configured proxy, so the final gateway must be validated from a real browser.

## Goals / Non-Goals

**Goals:** predictable content heights, clearly separated label/action columns, compact folder sections, working public scene requests and recovery.

**Non-Goals:** replacement theme, redesigned catalog, fabricated offline town data, changes to administrator permissions, or deployments to the other project's server.

## Decisions

1. Align rail grid content to the top and size rows from content. Use a shared rail-width custom property with enough space for the longest incumbent app title; use a row action column instead of absolutely overlaying the removal control. Keep the eight drop slots and stored state unchanged. Flatten the folder section's redundant container; use spacing and a divider for grouping.
2. Give AI Hub an explicit auto toolbar row and align town stage content to the top. Preserve the flexible conversation workspace separately. Make the mode switch auto-fit its actual visible options so non-admin visitors do not see a blank third column.
3. Route development `/api` requests through Vite's same-origin proxy, targeting the personal website's verified HTTP gateway on `111.228.35.186:5173` and allowing an explicit environment override. That gateway reaches the backend internally; direct public access to 8080 times out from this machine. Update the local environment to use the same-origin route. Prefer the existing deployed backend over starting a second monolith or changing middleware.
4. Keep map/list success independently when their companion request fails. Fetch scene details before committing the selected code, capture destination errors in the click handler, and clear stale errors after success. Use request sequencing if necessary to prevent late responses overwriting a newer selection. No silent fallback or artificial map data.

## Risks / Trade-offs

- [Client proxy interception] → Validate the Vite gateway in-browser and use an existing authorized SSH transport for a local forwarding route if direct access fails; document the actual verified route.
- [Long labels and smaller screens] → Ellipsis, accessible full names, minimum 28px action targets and narrow-screen checks.
- [Conversation height regression] → Scope content alignment to town mode and run existing conversation tests.
- [Backend failures] → Preserve independently successful data, show the failure, allow retry, and avoid claiming remote uptime from mocked tests.

## Migration Plan

Apply local source and dev config updates, restart the development preview where needed, run targeted tests, build, validate in Edge and create a local commit. The production frontend still uses its existing same-origin gateway; rollback is a revert of this commit and restoration of the local gateway setting.
