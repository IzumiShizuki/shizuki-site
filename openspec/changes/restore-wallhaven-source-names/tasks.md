## 1. Resolve Wallhaven source names

- [x] 1.1 Add a shared backend title resolver that prefers provider title metadata, descriptive source URL segments, meaningful tags, and finally a Wallhaven ID fallback.
- [x] 1.2 Return the resolved title in Wallhaven search results and use it for imports when the request title is blank or a legacy category-and-ID placeholder.

## 2. Display source names in discovery

- [x] 2.1 Use the backend title for Wallhaven result cards and retain category only in result metadata.
- [x] 2.2 Preserve a user-entered custom import title while sending the source-derived title by default.

## 3. Review change

- [x] 3.1 Inspect the focused diff and validate the OpenSpec change.
- [x] 3.2 Verify source-name resolution and custom-title preservation through backend and frontend regressions and production builds.
