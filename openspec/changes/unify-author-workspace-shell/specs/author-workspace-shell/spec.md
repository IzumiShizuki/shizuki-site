## Purpose

Defines a coherent author workspace whose navigation and life-signal rails remain stable while every author destination uses the same central reading and management canvas.

## ADDED Requirements

### Requirement: Every author destination uses the shared workspace shell
The author area SHALL render the same left route rail, center content column, and right life-signals rail for every public and authorized management destination at desktop workspace widths. Destination-specific content MUST render inside the center column without replacing the shell.

#### Scenario: Visitor changes public destinations
- **WHEN** a visitor moves among overview, journey, site posts, and site about
- **THEN** the same left and right rails remain present while only the center destination content changes

#### Scenario: Administrator opens a management destination
- **WHEN** an administrator selects a settings or management route from the author navigation
- **THEN** the management surface opens in the same center column without changing the workspace's visual topology

### Requirement: Desktop scrolling belongs to the center column
At desktop workspace widths, the author shell SHALL occupy the available route viewport, keep the left and right rails stationary, and assign vertical content scrolling to the center column. Center scrolling MUST NOT move either rail or the global top menu.

#### Scenario: Long center content is scrolled
- **WHEN** a desktop visitor scrolls a long author destination
- **THEN** only the center column scroll position changes and both side rails remain visually stationary

### Requirement: Author navigation is a vertical route rail
The left navigation SHALL present route groups and destinations in one vertical reading order without a horizontally draggable route list. When the available height cannot contain every route, overflow MUST remain vertical and the active destination MUST be brought into view without horizontal movement.

#### Scenario: Route groups exceed the available height
- **WHEN** the left rail contains more destinations than fit in its viewport
- **THEN** the route list can scroll vertically, has no horizontal scrollbar or drag affordance, and keeps the active destination visible

### Requirement: Narrow layouts preserve access without forcing three columns
Below the desktop workspace breakpoint, the author area SHALL reflow into a single primary content column and provide navigation and life signals through an accessible auxiliary surface. DOM order and keyboard focus order MUST continue to follow the user-visible reading order.

#### Scenario: Author area opens on a narrow viewport
- **WHEN** the viewport is narrower than the desktop workspace breakpoint
- **THEN** center content remains directly readable and the visitor can open an explicitly labelled auxiliary control for navigation, weather, and daily quote
