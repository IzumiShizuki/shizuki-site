## 1. Agent context structure

- [x] 1.1 Create `.agent/README.md` with source-of-truth priority, reading order, and task-based navigation.
- [x] 1.2 Create `.agent/01-project-map.md` and `.agent/02-architecture.md` from the current repository modules, source entry points, and frontend structure.
- [x] 1.3 Create `.agent/03-development.md` and `.agent/04-configuration-and-boundaries.md` with verified commands, environment dependencies, private configuration paths, and server ownership rules.
- [x] 1.4 Create `.agent/05-testing-and-delivery.md` and `.agent/06-reference-index.md` with quality gates, handoff steps, and links to existing authoritative documents.

## 2. Consistency and safety validation

- [x] 2.1 Check that every repository-relative link and referenced path in `.agent/` exists, and correct stale or ambiguous instructions.
- [x] 2.2 Check that `.agent/` contains no credentials or private configuration values and that the documented server boundary remains `111.228.35.186` unless explicitly overridden by the user.
- [x] 2.3 Run `openspec validate add-agent-project-context --type change --strict --no-interactive` and `git diff --check`.

## 3. Project handoff

- [x] 3.1 Run the feasible documentation/project checks, record any environment-limited checks, and review the final diff.
- [x] 3.2 Update the OpenSpec task state and report the created `.agent/` entry point and maintenance expectations.
