## Why

Members need opt-in WeChat reminders when other members of their website groups publish articles or moments. AstrBot is the selected delivery bridge and has not yet been connected.

## What Changes

- Add verified private-chat binding with expiring, single-use website codes, unbinding and pause controls.
- Add explicit subscriptions by current website group and content type, quiet hours, and delivery history in the personal center.
- Persist publication notifications transactionally, deduplicate and retry bounded deliveries, and recheck authorization before sending.
- Provide an installable AstrBot plugin and configuration/runbook, disabled until configured.

## Capabilities

### New Capabilities
- `wechat-group-notifications`: Website account binding, opt-in group update subscriptions, durable authorized delivery and AstrBot bridge.

### Modified Capabilities

None.

## Impact

User module, content publication services, shared contracts, monolith integration and database migrations, personal-center frontend, and a new Python AstrBot plugin. No production deployment or live messaging is part of this implementation.
