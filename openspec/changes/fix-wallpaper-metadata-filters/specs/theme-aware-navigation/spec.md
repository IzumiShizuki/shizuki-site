## Purpose

Keep the persistent site navigation visually connected to the user's configured or wallpaper-derived color while preserving readable controls across theme modes.

## ADDED Requirements

### Requirement: Top navigation surface reflects the active accent
The application SHALL derive the full desktop and mobile top-navigation surfaces from the active semantic theme and accent tokens. Navigation text and icons MUST continue to use contrast-safe semantic foreground tokens.

#### Scenario: Visitor changes the configured color
- **WHEN** the configured or wallpaper-derived accent color changes
- **THEN** the visible top menu surface updates to a restrained tint of that accent
- **THEN** menu labels and icons remain readable in both day and night modes

#### Scenario: Visitor prefers reduced motion
- **WHEN** the operating system reports a reduced-motion preference
- **THEN** the menu color change does not introduce a decorative motion dependency
