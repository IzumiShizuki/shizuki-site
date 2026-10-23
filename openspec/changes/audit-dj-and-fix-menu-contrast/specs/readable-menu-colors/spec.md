## Purpose

Ensure site navigation, MENU atmosphere controls and appearance popovers remain readable when visitors change the day/night theme, wallpaper, solid accent or custom gradient, including mobile layouts and interactive states.

## ADDED Requirements

### Requirement: Menu text maintains sufficient contrast
Navigation, atmosphere controls and appearance popovers SHALL provide at least 4.5:1 contrast for ordinary enabled text and at least 3:1 for meaningful icons and focus indicators against their rendered adjacent backgrounds.

#### Scenario: Theme and wallpaper change
- **WHEN** a visitor changes between day and night themes over a bright or dark wallpaper
- **THEN** enabled menu labels, descriptions and controls remain readable against stable surfaces meeting the required contrast

#### Scenario: Custom accents and gradients
- **WHEN** a visitor selects a white, black, saturated accent or a gradient spanning light and dark endpoints
- **THEN** selected and primary menu controls use a matching foreground and background that meet the contrast requirement

### Requirement: Menu states remain identifiable
Selected items SHALL expose an additional non-color cue, and keyboard-operable menu actions SHALL expose a visible focus indicator. Mobile and desktop presentations SHALL preserve readable text and meaningful icons.

#### Scenario: Selected and focused navigation
- **WHEN** a visitor selects a route or focuses a menu control with a keyboard
- **THEN** selection remains identifiable and the focused control has a visible indicator

#### Scenario: Narrow screen
- **WHEN** the viewport changes to a mobile width
- **THEN** the navigation dock and expanded drawer retain valid backgrounds and readable controls without horizontal page overflow caused by navigation

#### Scenario: First mobile drawer disclosure
- **WHEN** a visitor first activates More at the top of a mobile page
- **THEN** the drawer opens on that activation and its expanded state matches the visible navigation
- **AND** activating More again closes the drawer
