## Context

See proposal.md for motivation. The author page already embeds AdminPage and has permission-filtered destinations, but public mode substitutes a smaller rail. Author editing shares a whole-profile form between dialogs and site settings; public and administrator requests can both replace it. Studio photo responses also reset text forms.

## Goals / Non-Goals

**Goals:** Reuse the existing shell, routes, permission catalog and APIs; make drafts independent of asynchronous read responses; verify observable behavior through mounted Vue components.

**Non-Goals:** API redesign, deployment, account profile changes or replacement of the visual design system.

## Decisions

1. Use the existing complete permission-filtered rail in both author modes. Public keys continue scrolling within the page; management keys continue using `admin:` routes. A separate workspace route would duplicate navigation and retain the reported separation.
2. Track editor readiness separately from loading and derive dirtiness from a saved form snapshot including pending tag input. Guard replacement actions and Vue Router update/leave hooks plus browser unload. Request generations prevent a stale public response replacing newer administrator data; failed administrator reads never enable saving stale fallback data.
3. Normalize supplied empty strings and arrays as intentional values. Missing values still fall back to existing defaults for compatibility with old profiles. Keep display, editable-form and save normalization aligned; deleting the final journey or link row leaves an empty list that can be saved and reopened.
4. Add a small reusable draft guard for studio forms. Photo mutations update server state and ETags while preserving dirty form fields. Save commits the snapshot; switching and refresh require confirmation; preview/publish require a saved form. Snapshot specific photo metadata separately where needed so one metadata save cannot erase other edits.
5. Keep existing explicit album ETag conflict handling. Preserve drafts on failures and never automatically publish or retry conflicting writes.
6. Quote and site-component conflicts keep their submitted drafts and show an actionable message. Re-reading the server is a guarded explicit action. Each independent appearance resource tracks readiness so a failed read cannot enable saving fallback data.

## Risks / Trade-offs

- Whole-profile writes can still conflict across browser sessions because the author API has no ETag contract → retain drafts on request failure and avoid overlapping local writes; cross-session author locking is outside this frontend fix.
- Native discard confirmation can interrupt navigation → show it only for actual unsaved changes, not section scrolling.
- Legacy malformed data needs defaults → distinguish absent/malformed values from explicit empty values and cover both in tests.

## Migration Plan

No schema or dependency migration. Deploy the usual frontend artifact; revert this commit to roll back. No server publishing is part of this request.
