## Purpose

Provide a reliable and responsive first visit to the approved site UI, with fresh entry documents, efficient typography/background delivery and navigation that remains attached to the expected screen edge.

## ADDED Requirements

### Requirement: Entry documents revalidate across releases
The main site HTML SHALL explicitly require cache revalidation, while versioned build assets SHALL remain reusable. Ordinary public URLs SHALL load the approved current frontend without a permanent version query. API responses and shared application resources SHALL retain their own behavior.

#### Scenario: Revisiting the ordinary About URL
- **WHEN** a visitor loads the ordinary About URL after a frontend release
- **THEN** the HTML response explicitly requires revalidation and references the current build
- **AND** previously opened pages can still retrieve their existing hashed resources

### Requirement: Startup assets preserve appearance efficiently
The site SHALL retain the approved font families and glyph coverage while avoiding whole multi-megabyte CJK font downloads for the initial About viewport. The default wallpaper SHALL use the equivalent efficient built-in resource; custom wallpaper selections SHALL remain intact.

#### Scenario: Cold About entry
- **WHEN** a fresh desktop browser loads About with the default wallpaper
- **THEN** requested font and default-background encoded payload is materially below the measured 5.5MB baseline
- **AND** approved Chinese/Latin typography, real public statistics and chosen theme remain visible

### Requirement: Collapsed desktop menu docks at the top
The collapsed desktop navigation handle SHALL sit at the top edge and SHALL remain keyboard reachable. The hidden expanded navigation SHALL not leave an invisible layout gap above the handle.

#### Scenario: Collapsing and expanding desktop navigation
- **WHEN** the visitor collapses the desktop menu
- **THEN** its visible handle begins within 24px of the viewport top
- **AND** expanding it restores the full navigation and mobile controls remain usable
