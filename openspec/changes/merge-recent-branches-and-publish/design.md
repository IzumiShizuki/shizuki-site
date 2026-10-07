## Context

Master bb54b60c contains deployed music and daily-art fixes, with some original commits still absent from its ancestry. Recent branches are music-podcast-release-20261007 and refine-wallpaper-recovery-and-search; the remaining October branch tips already precede master. The primary checkout contains an unrelated user edit in TopMenu.vue.

## Goals / Non-Goals

**Goals:** Complete recent commit ancestry, preserve the strongest already deployed behavior, verify the resulting tree, and publish master.

**Non-Goals:** Integrating unrelated pre-October branch work, forcing pushes, rewriting history, or including uncommitted user edits.

## Decisions

- Define recent as October 1–7, 2026 in Asia/Shanghai. Audit all local/fetched remote refs with both ancestry and patch equivalence; record commit IDs and subjects.
- Use the clean existing master release worktree. Merge music release first, then the current wallpaper branch with ordinary merge commits. Cherry-picking alone would leave the requested ancestry gaps unresolved.
- Resolve conflicts hunk by hunk against originating commits and specifications. Retain production request-generation, queue and cold-entry protections while integrating the branch's intended features; do not replace whole music files with older branch copies.
- Re-run full Vue tests/build, focused daily-art/auth/media backend tests, Maven packaging and strict validations for affected originating changes.
- Fetch again before a normal master push and verify equal local/remote heads. Existing private settings and stored Pixiv credentials are excluded from Git.

## Risks / Trade-offs

- Equivalent but amended music fixes can conflict → compare each originating commit and keep production safeguards with regression coverage.
- Other chats may advance refs while integrating → capture audited tips and re-audit the recent remainder before publication.
- Runtime artifact and source drift → record deployed revision and verify health, feature routes, and actual image preview separately from Git synchronization.

## Migration Plan

Daily-art bb54b60c is already deployed with database migration V1016 and a verified app/database/volume checkpoint. Complete online checks, integrate branches, and use a new checkpoint for any combined runtime update. Rollback uses the retained previous backend/site images and the recorded snapshot; middleware is not restarted.
