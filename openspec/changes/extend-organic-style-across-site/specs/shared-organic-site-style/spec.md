## Purpose

Extend the user-approved About visual language into a coherent first-party website, combining open readable composition, natural imagery and consistent accessible day/night colors while retaining existing site behavior.

## ADDED Requirements

### Requirement: Shared visual identity across route families
The site SHALL apply the approved natural visual language across home/navigation, blog discovery/reading, galleries/moments, music, apps, AI, authentication and profile. Presentation areas SHALL use typography, proximity, imagery and varied spacing as their primary grouping mechanisms rather than repeating equivalent framed translucent cards. Operational controls SHALL retain meaningful boundaries and affordances.

#### Scenario: Moving between content and tool routes
- **WHEN** a visitor navigates from About to Blog, Albums, Music, Apps or AI
- **THEN** the shared colors, text hierarchy and control treatment remain coherent
- **AND** each route retains its appropriate reading, browsing or operating layout

### Requirement: Theme and personalization remain coherent
Day and night modes SHALL use shared readable palette roles across the first-party shell and routes. Accent and wallpaper preferences SHALL remain functional, and the approved About layout SHALL retain its visual identity.

#### Scenario: Switching the theme across routes
- **WHEN** a visitor switches day/night mode and navigates among supported routes
- **THEN** canvas, text, inputs, menus and status treatments update coherently
- **AND** content and controls remain legible without stacked muddy translucent surfaces

### Requirement: Responsive and accessible behavior survives styling
The site SHALL retain keyboard focus, reduced-motion support, visible loading/error/empty states, real content and existing scroll/navigation semantics. At mobile and intermediate widths, content SHALL reflow without document-level horizontal overflow.

#### Scenario: Narrow layouts and keyboard use
- **WHEN** a visitor uses 375px, 768px or 1024px widths or navigates with a keyboard
- **THEN** primary content and controls remain reachable and visibly focused
- **AND** images, decorative geometry and sticky controls do not create horizontal overflow

### Requirement: Existing application actions remain intact
Visual changes SHALL preserve authentication, account recovery, article navigation/editing, playback, search, app launching, AI state and permissions. API contracts and stored user content SHALL remain unchanged.

#### Scenario: Existing content and operation states
- **WHEN** route data loads, is empty, fails or requires authentication
- **THEN** the existing state and recovery controls remain available in the new presentation
- **AND** styling does not fabricate data, trigger external actions or alter permissions
