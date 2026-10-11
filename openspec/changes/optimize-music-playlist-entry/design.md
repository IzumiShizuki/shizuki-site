## Context

See proposal.md. Account bundles iterate upstream `/playlist/track/all` pages before returning. The Vue list only bounds rendering, and both the host and list reactively reveal the current entry. The remote master baseline excludes four local frontend optimization commits and uncommitted backend work.

## Goals / Non-Goals

Goals: bounded initial network work, correct totals/order, retryable pages, no stale account/route results, explicit location, complete playback compatibility.

Non-goals: replace providers, change database schema, merge the frontend optimization branch or alter Folia navigation without evidence that it is the reported surface.

## Decisions

- Add optional offset/limit to the existing bundle route. No query retains full-bundle behavior. Account playlists directly request one upstream page; other playlist types retain their existing implementation. This avoids an API-breaking response change.
- Ordinary account browsing requests 100 tracks and loads additional pages on demand. Coalesce identical active initial requests. Keep generation and account guards on every result; failed appends retain prior rows.
- Explicit playback obtains a full bundle if browsing is partial before handing off the queue. This preserves shuffle, duplicate entries and Folia behavior without introducing another queue lifecycle.
- Add a visible location button to the ordinary playlist/queue header and expand rows only upon that action. Song changes, pagination and returning from Folia never force ordinary-list location.
- Verify provider requests with MockRestServiceServer and deferred mounted Vue regressions, then run the complete frontend suite and production build. Publish from an isolated clean master checkout with the existing guarded personal-server deployment.

## Risks / Trade-offs

- Full queue handoff still needs all tracks → defer this cost to the explicit playback action; ordinary browsing is bounded.
- Third-party track totals can change → retain authoritative totals, reject incomplete empty pages and allow retry.
- Concurrent route/account changes → discard obsolete results and playback handoffs.

## Migration Plan

Deploy the compatible backend and frontend together to 111.228.35.186. The established deployment script creates a restore point and restores it if health checks fail. Keep this OpenSpec change active with verification and deployment evidence.
