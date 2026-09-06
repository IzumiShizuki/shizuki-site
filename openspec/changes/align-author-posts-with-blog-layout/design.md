## Context

See `proposal.md` for motivation. The Author archive uses optional cover URLs, but its card grid always declares a media column. CSS auto-placement therefore puts the only child—the copy block—into that narrow first column whenever the image is absent. The main Blog feed already establishes a familiar title-first content rhythm, while the Author surface supplies its own semantic theme tokens and router links.

## Goals / Non-Goals

**Goals:**

- Make no-cover entries consume the full card width and remain readable with long real-world content.
- Reuse the Blog feed's scan order without copying its entire component or changing the Author page's visual material.
- Keep covered and coverless cards stable at wide, intermediate, and narrow container sizes.
- Preserve semantic HTML, focus behavior, route targets, theme inheritance, and reduced-motion handling.

**Non-Goals:**

- Rebuild the Blog feed, change article data, or introduce a new shared card abstraction.
- Add placeholder covers for articles that intentionally have none.
- Change API pagination, publication rules, routes, or backend behavior.

## Decisions

### Decision: Encode cover presence as an explicit card state

The link receives a `post-entry--with-cover` modifier only when a normalized cover URL exists. The default card is a one-column text surface; the modifier activates a named `content / cover` grid. This makes the no-cover case correct by construction and avoids positional selectors whose behavior depends on optional DOM children.

Alternative considered: always render a generated placeholder image. Rejected because it invents media, increases visual noise, and hides the actual optional-data contract.

### Decision: Use the Blog feed's reading order, not its full visual implementation

The copy column follows category/date context, a two-line-capable title, reading metadata, a two-line summary, then tags and an explicit “阅读全文” action. The Author surface keeps its existing borders, theme colors, and restrained hover motion. This produces recognizable Blog behavior without coupling two independently sized layouts.

Alternative considered: import or extract the Blog feed card. Rejected because the Blog card depends on mandatory resolved covers, alternating placement, filters, and click handlers that do not belong in the embedded Author archive.

### Decision: Let the footer wrap while keeping the action stable

Tags occupy a flexible wrapping group and the reading action uses an inline no-wrap treatment at the trailing edge. On small screens the covered grid stacks, and the footer remains a wrapping row rather than forcing overflow.

Alternative considered: hide tags or the action at narrow widths. Rejected because both are useful reading cues and fit when the layout is allowed to wrap.

### Decision: Publish through the existing guarded deployer

After local tests, build, browser verification, strict OpenSpec validation, and a scoped commit, the clean master commit is pushed and deployed only through the repository's guarded personal-site workflow. That workflow creates a restore point, protects private files, selects affected services from the commit delta, verifies API/site health, records the deployed commit, and automatically rolls back failed gates.

## Risks / Trade-offs

- [A cover image creates an overly dominant media block] → Cap the cover column and use `object-fit: cover` with a consistent aspect ratio when stacked.
- [Long localized metadata wraps unevenly] → Use flexible wrapping groups, bounded preview lines, and no fixed card height.
- [A deployment-only regression appears] → Retain the pre-deployment snapshot and rely on the guarded health checks and automatic rollback path.

## Migration Plan

1. Add structural regression coverage for covered and coverless entries.
2. Apply the cover-state modifier and Blog-aligned copy hierarchy.
3. Verify wide and narrow layouts in both theme modes, then run the full frontend suite and production build.
4. Commit on clean `master`, push the verified commit, and run the guarded deployer against `111.228.35.186`.
5. Confirm the recorded deployed commit, API health, site entry, and production Author/Blog routes. A failed remote gate restores the pre-deployment snapshot automatically.
