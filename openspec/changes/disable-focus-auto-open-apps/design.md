## Context

See `proposal.md` for motivation. Focus activation is observed in the application shell, where it currently closes Menu and AI surfaces and then creates every window listed by the Focus preset. The same preset list is also used independently by the light-app host to filter which existing or manually opened windows may appear.

## Goals / Non-Goals

**Goals:**

- Separate Focus workspace activation from light-app window creation.
- Preserve the existing Focus whitelist, floating launcher, and manual window flow.
- Keep Menu and AI suppression unchanged.

**Non-Goals:**

- Changing the Focus preset contents.
- Closing light-app windows that were already open before Focus starts.
- Changing light-app persistence, positioning, or launcher behavior.

## Decisions

### Remove window creation from the Focus activation watcher

The Focus watcher will continue to collapse Menu and AI surfaces, but it will no longer iterate over preset app codes and call the window-opening API. This is the narrowest behavior change and keeps session state independent from tool choice.

Alternative considered: add an `autoOpenApps` flag to Focus presets. This adds configuration and migration surface for a behavior the user wants disabled universally, so it is unnecessary.

### Retain preset app codes as a display whitelist

The preset's app-code list remains intact because the light-app host uses it to decide which windows are visible in Focus. Removing the list would either hide manually opened tools or allow unrelated tools, neither of which matches the requested behavior.

## Risks / Trade-offs

- [Users accustomed to automatic Todo/Pomodoro windows see an empty Focus surface] → Keep the floating light-app launcher visible and preserve manual access.
- [Removing the only consumer of a window-opening import may leave dead code] → Remove only imports that become unused and rely on lint/build checks.

## Migration Plan

Ship as a frontend behavior change with no data migration. Roll back by restoring the Focus activation loop if needed.
