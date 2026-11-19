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

## November 19 gateway provenance

The live DJ gateway source at `429bd902` is byte-identical to
`AuthEntryFilter.java` on DJ's published development commit
`75cc34f561f14604cc412e1f0c22a8c71ee03e90`. Its Git blob bytes have SHA-256
`5045a616c2aa3e9e54766cd4bc030a45f9e1fb8065ef0ef26143076f64cc04b6`.
Use that file in a separate checkout of the exact live backend source,
then apply `dj-auth-gateway.patch` from this folder. The patch is additive;
the merged source (UTF-8 with LF) has SHA-256
`f9d60e922dacfcc3ac86d3c9515dc5e0bc04f57a90fd149fe3f2a62e6b2e23ac`.
The forward mainline gateway in this branch is not a replacement for the
DJ gateway in the existing Docker image.
