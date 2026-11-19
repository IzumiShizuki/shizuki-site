## Context
LightApp Todo owns identity, ownership, project and existing reminder data. Legacy PUT is a full update and is not suitable for development progress.

## Goals / Non-Goals
Reuse Todo as the source of truth. Keep stage and status distinct. Do not start agents from the website or grant source control/deployment privileges.

## Decisions
- Add one development workflow and append-only events per opt-in Todo. Use transactional version checks and per-Todo request IDs. A replay with changed payload fails; a replay with the same request does not duplicate records.
- First template: RESEARCH (optional), DESIGN, IMPLEMENTATION, VERIFICATION. Progress remains in the current stage. DESIGN and VERIFICATION require website approval. Completion does not rewrite the ordinary Todo.
- Search and context return only opted-in tasks. The dedicated website account MCP token (see add-account-mcp-token) is disabled for Todo by default and restricted to the one currently authorized project. It cannot approve, enable, delete or touch other endpoints. The prototype static credential is retired. Existing authenticated UI handles human controls.
- MCP provides verified repository context and named Skill hints; the local coding client resolves installed Skills, rather than executing stored task text. Credentials stay out of tools and repository.

## Risks / Trade-offs
Finish and retry may race; preserve transactional consistency and return conflicts. Never migrate corporate tasks or expose existing personal Todo content to the MCP integration.
