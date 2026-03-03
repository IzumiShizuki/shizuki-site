# Agent Instructions

This project uses **bd** (beads) for issue tracking. Run `bd onboard` to get started.

## Quick Reference

```bash
bd ready              # Find available work
bd show <id>          # View issue details
bd update <id> --status in_progress  # Claim work
bd close <id>         # Complete work
bd sync               # Sync with git
```

## Landing the Plane (Session Completion)

**When ending a work session**, you MUST complete ALL steps below.  
默认交付目标为**本机提交完成**（不自动推送远端）。

**MANDATORY WORKFLOW:**

1. **File issues for remaining work** - Create issues for anything that needs follow-up
2. **Run quality gates** (if code changed) - Tests, linters, builds
3. **Update issue status** - Close finished work, update in-progress items
4. **Sync local status**:
   ```bash
   bd sync
   git status  # MUST show clean working tree
   ```
5. **Clean up** - Clear stashes, prune temporary files/branches
6. **Verify** - All changes committed locally
7. **Hand off** - Provide context for next session

**CRITICAL RULES:**
- Work is complete once local commit + quality gates + `bd sync` are done
- DO NOT push to GitHub unless user explicitly asks for remote push
- If user explicitly requests push, execute:
  - `git pull --rebase`
  - `bd sync`
  - `git push`
  - `git status` must show up-to-date with origin

## Commit Rules

- Commit identity must use:
  - `user.name = Izumi`
  - `user.email = 29301481@qq.com`
- Commit message format must be:
  - ``fix|feat : 具体内容（简要说明做了什么）``
