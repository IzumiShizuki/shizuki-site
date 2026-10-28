## Context

DJ latest stable work is codex/dj-native-reading-reminders, while the primary checkout contains newer main-site work. Another chat is finishing a DJ download link. Preserve its committed snapshot and operate in a new root.

## Goals / Non-Goals

Goals: independent repository and build ownership, preserve current users and shared account compatibility. No production data migration is included.

## Decisions

- Extract the committed DJ source with provenance to a fresh project history, removing main-site frontend entrypoints and unrelated delivery documentation. Keep backend compatibility infrastructure that DJ still needs; document remaining shared account/storage integration.
- Use D:/program/dj and IzumiShizuki/dj. Default a newly created repository to private to avoid widening visibility during extraction.
- Keep the main-site delivery on its existing branch and push verified commits without force, preserving every existing commit. Inventory and publish relevant committed DJ branch work before extracting.
- Retain secrets and signing material only in existing local configuration; do not copy them into either repository.

## Risks / Trade-offs

- Shared backend packages remain during extraction → document compatibility rather than claim a separate database or authentication migration.
- Concurrent chat activity → extract committed snapshot and check for later commits before finalizing.
- Existing unrelated tests fail → record exact results and repair issues blocking requested changes; never report unchecked work as verified.
