## 1. Layout Contract Coverage

- [x] 1.1 Add component tests proving coverless entries omit the cover modifier while covered entries opt into it.
- [x] 1.2 Add assertions for the Blog-aligned metadata, title, summary, tag, and explicit reading-action structure.

## 2. Author Post Card Layout

- [x] 2.1 Make the default card a full-width content surface and activate a named text-and-cover grid only for entries with real cover media.
- [x] 2.2 Reorder and style article copy into a Blog-aligned hierarchy with readable two-line titles, bounded summaries, icons, wrapping tags, and a stable reading action.
- [x] 2.3 Preserve narrow-screen stacking, focus visibility, semantic theme surfaces, and reduced-motion behavior.

## 3. Local Verification and Commit

- [x] 3.1 Run focused component tests, the final layout detector, the complete frontend unit suite, and the production build.
- [x] 3.2 Verify coverless card width, long-copy hierarchy, and wide/narrow day/night states in the local browser against the Blog feed.
- [x] 3.3 Run strict OpenSpec validation and diff checks, review the scoped changes, and create a clean local commit on `master`.

## 4. Guarded Production Delivery

- [ ] 4.1 Fetch and fast-forward `origin/master`, confirm the verified local commit is the exact clean publish candidate, and push it to `origin/master`.
- [ ] 4.2 Run the guarded deployer against `111.228.35.186`, including the required private restore point, protected sync, affected-service rebuild, and automatic rollback gates.
- [ ] 4.3 Verify the production API/site health, Author and Blog routes, and the server's recorded deployed commit.
