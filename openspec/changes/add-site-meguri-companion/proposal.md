## Why

Meguri / 爱莉 already has a website gateway and an AI Hub stage, but the owner's independently running desktop companion has no persistent presence while browsing the rest of the site. The Home companion entry still opens the separate generic AI companion, and gateway failures can be misreported as disabled configuration.

## What Changes

- Add an owner-only, lazy-loaded floating Meguri companion across ordinary website routes, with a compact character launcher, minimize, close, and an AI Hub handoff.
- Keep the active companion mounted during ordinary navigation and minimization; isolate it by account and avoid concurrent companion stages in AI Hub.
- Connect the Home companion entry and an AI Hub deep link to the same Meguri experience.
- Surface actual gateway errors and provide refresh/retry for Core offline states; make Chinese input composition safe.
- Document the implemented AI capabilities, confirmed gaps, and a prioritized follow-up plan based on website and desktop source contracts.

## Capabilities

### New Capabilities

- `site-meguri-companion`: Persistent owner-only website companionship and consistent entry points using the existing Meguri gateway.

### Modified Capabilities

None.

## Impact

- Vue application shell, Home, AI Hub, Meguri stage, companion utilities, and focused frontend tests.
- No new dependencies, backend API changes, automatic native desktop access, remote deployment, or changes to the separate `meguri-pet` checkout.
- Existing ADMIN authorization and server-held Core credentials remain the integration boundary.
