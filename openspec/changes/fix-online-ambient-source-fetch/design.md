## Context

The production provider is enabled and Freesound returns eligible JSON results, yet the public search response has a non-zero total with no items. See `proposal.md` and `specs/online-ambient-search-results/spec.md` for the required behavior.

## Goals / Non-Goals

**Goals:**

- Reproduce the real Freesound payload at the provider boundary.
- Preserve the existing allowlist, license filtering, and preview-only import policy while returning eligible results.
- Verify the public website route after deployment.

**Non-Goals:**

- Change the provider, expose its credential, or relax the allowed-license policy.
- Add bulk catalog mirroring or alter the authenticated import contract.

## Decisions

### 1. Test the provider boundary with a production-shaped payload

The regression test will supply the fields returned by the real Freesound search endpoint and assert that an eligible result reaches `PageResponse.items`. This distinguishes JSON/result normalization failures from frontend rendering, deployment, or credential errors.

Alternative considered: test only the public controller. That would not identify whether a failure originated in provider mapping or HTTP serialization.

### 2. Preserve strict eligibility while normalizing the upstream response

The implementation will keep rejecting invalid identifiers, unsupported licenses, and missing MP3 previews. Any mapping correction will be limited to accepting the valid response representation proven by the regression payload.

Alternative considered: return every upstream result. This would bypass license and preview safeguards.

## Risks / Trade-offs

- [Freesound changes response fields again] → Keep the provider-boundary regression fixture explicit and fail closed for unknown/unsafe entries.
- [A deployment uses an old image] → Validate the public route returns at least one item after rollout, not merely an enabled flag.

## Migration Plan

1. Run the focused provider test and existing backend checks.
2. Build and replace only the backend container.
3. Query the public ambient-library status and search endpoints; roll back to the prior backend image if the search result is not usable.
