# Flyway release preflight

Run from the repository root. Use the **verified backend release source** as the
reference, not the newest frontend-only deployment or the GitHub default branch.

```text
python tools/flyway-history/check_flyway_history.py --against <verified-backend-sha> --candidate HEAD
python -B -m unittest discover -s tools/flyway-history -v
```

The check treats monolith PostgreSQL, monolith MySQL, and standalone content-module migrations as separate locations. It
rejects duplicate versions, new versions that would fall behind the selected
release, and edits or removals of historical versioned SQL in the three managed
top-level locations. It runs entirely against Git objects. It does not query a
database, inspect non-versioned files, publish anything, or run migrations.

Keep applied `V*__*.sql` immutable. Add small new scripts with a clear name and
keep business data backfills separate from schema changes where practical.
Before publication, independently match the reference SHA to the target ledger
(`flyway info` / `flyway validate` using that backend's effective configuration).
Then test the candidate both on an isolated database already at that release and
from an empty database. This check is not a substitute for either procedure.
Only consider a `B*__*.sql` baseline if fresh-database provisioning actually
becomes slow and the project's Flyway version supports it; keep historical SQL.
