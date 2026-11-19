# Todo backend overlay, not an activation script

The website's live executable JAR contains independently shipped DJ code.
Never deploy a plain Maven rebuild of the Shizuki repository over it. Use only
the tracked, merged gateway (exact DJ release filter plus the Todo MCP gate)
combined with compiled Todo-specific classes and the two PostgreSQL resources
listed in `overlay_backend.py`. No frontend artifacts are involved here.

1. Recheck the currently active Compose project, exact running backend image
   ID, app JAR SHA-256, and current ledger. Capture the JAR using a read-only
   operation and verify the same SHA-256 on the staging host. Keep the exact
   old image separately tagged for rollback. No use of the latest tag as a
   mutable base identifier in staging.
2. Compile from the exact candidate source with Java 17 and run account token,
   Todo, and merged gateway tests. Diff the merged `AuthEntryFilter` against
   the deployed DJ source. Only imports, the dedicated route block, and the
   exact Todo-route allowlist may differ.
3. Build the overlay locally or on the designated staging host:
   `python tools/todo-release/overlay_backend.py active.jar <verified-sha256> . candidate.jar proof.json`
   The proof lists the only replacements/additions and confirms every
   unrelated uncompressed entry is byte-for-byte identical. This preserves
   all deployed DJ SQL, classes, push libraries, and classpath metadata.
4. Before activation, test the candidate image with an isolated PostgreSQL
   database replayed/cloned at the verified ledger, never the live database.
   Check no other schema statements/data changes, actual Flyway ordering,
   health, account create/token/scope/rotate/revoke, Todo human approval,
   rejected MCP admin/cross-project calls, and DJ auth and device endpoints.
   Run the previous image against the migrated isolated DB as a rollback
   rehearsal. Additive schema is retained on an image rollback; do not
   drop new tables or edit the ledger automatically.
5. Freeze on unexpected ledger/image changes, failed validation, unresolved
   applied migration checksums, unexpected active DJ entrypoint/feature
   changes, or missing rollback proof. Re-read the ledger again before
   any separately authorized activation.
