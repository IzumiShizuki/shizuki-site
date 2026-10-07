## Purpose

Let users view their daily recommended illustrations comfortably at a larger size, navigate the existing daily selection accessibly, and see complete artwork without bands introduced by fixed preview frames.

## ADDED Requirements

### Requirement: Large daily recommendation carousel
The personal daily-art interface SHALL display one prominent recommended artwork at a time, with title, artist and original links. Users SHALL be able to choose previous, next or a specific image. Navigation SHALL wrap at the ends and SHALL NOT redraw or mutate the daily selection. A single image SHALL remain viewable without redundant navigation controls.

#### Scenario: Browse several images
- **WHEN** a user selects next, previous or a particular image
- **THEN** the corresponding artwork and attribution are displayed, the current position is indicated, and end navigation wraps within the existing selection

#### Scenario: Replace daily content
- **WHEN** the artwork set changes or the website account changes
- **THEN** the carousel starts with the first available image and does not show a previous user's artwork

### Requirement: Accessible carousel navigation
The carousel SHALL offer labeled focusable controls, an announced current position, keyboard arrow navigation and first/last navigation. Horizontal touch swipes SHALL change the slide while vertical movement SHALL remain ordinary page scrolling. The carousel SHALL stay stationary until a user navigates.

#### Scenario: Keyboard and touch input
- **WHEN** a user navigates with arrow keys, Home/End or a horizontal touch swipe
- **THEN** the expected slide is shown; vertical and multi-touch gestures do not advance the selection

### Requirement: Proportionate responsive images
Recommendation, character and search previews SHALL preserve the complete artwork's proportions and SHALL NOT introduce a fixed-ratio colored band around loaded images. Featured artwork SHALL fit the available width and a readable viewport height, and phone layouts SHALL avoid horizontal overflow. Image failures SHALL retain actionable original-artwork links.

#### Scenario: Portrait and landscape works
- **WHEN** differently proportioned images load on desktop or phone
- **THEN** images are neither stretched nor cropped, the image frame follows the displayed image size, and artwork remains readable with working original links

#### Scenario: Image failure
- **WHEN** a slide preview fails
- **THEN** an original-work fallback remains visible and the user can navigate to other slides
