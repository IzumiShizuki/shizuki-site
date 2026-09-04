## Purpose

Defines the public site entry and About experience so visitors reach the consolidated site story directly, with responsive menu motion and colors derived consistently from the active background theme.

## ADDED Requirements

### Requirement: Public site entry navigates directly to About
The application SHALL navigate the desktop Site entry and mobile Life entry directly to `/author?tab=about` without opening an intermediate destination menu.

#### Scenario: Desktop visitor selects Site
- **WHEN** a visitor activates the desktop Site entry
- **THEN** the application navigates directly to the public About view
- **THEN** no second-level Site destination panel is displayed

#### Scenario: Mobile visitor selects Life
- **WHEN** a visitor activates the mobile Life entry
- **THEN** the application navigates directly to the public About view
- **THEN** no drawer or second-level destination panel is displayed

### Requirement: About is the canonical public-site landing view
The application SHALL present About as the canonical public-site landing view and SHALL not expose a separate public “网站主页” navigation item.

#### Scenario: Visitor opens the author route without a tab
- **WHEN** a visitor opens `/author` without a recognized tab query
- **THEN** the application selects the About view

#### Scenario: Visitor follows a legacy overview link
- **WHEN** a visitor opens `/author?tab=overview`
- **THEN** the application replaces the query with `tab=about`
- **THEN** the consolidated About view is displayed

#### Scenario: Visitor views public navigation
- **WHEN** the public author workspace is rendered
- **THEN** its navigation includes About, Journey, and Posts as applicable
- **THEN** it does not include a separate “网站主页” item

### Requirement: About includes the useful former homepage content
The consolidated About experience SHALL combine the existing About story with the useful public identity, status, skill, and site-portal information previously available only from “网站主页”.

#### Scenario: Visitor opens About
- **WHEN** the About view finishes loading
- **THEN** the visitor can see the site story and configured About content
- **THEN** the visitor can see the author identity, public status, skill directions, and primary site destinations
- **THEN** Albums and Moments remain reachable from the consolidated experience

### Requirement: Menu disclosure remains mounted and compositor-friendly
The top navigation SHALL preserve its full menu subtree across expanded and collapsed states and SHALL use compositor-friendly disclosure transitions that do not animate layout-driving dimensions.

#### Scenario: Visitor repeatedly toggles the menu
- **WHEN** the visitor expands and collapses the top menu repeatedly
- **THEN** the same menu surface remains mounted
- **THEN** disclosure is expressed through transform and opacity state changes
- **THEN** interactive descendants cannot receive focus or pointer input while collapsed

#### Scenario: Visitor prefers reduced motion
- **WHEN** the operating system reports a reduced-motion preference
- **THEN** the menu reaches its final expanded or collapsed state without decorative transition delay

### Requirement: Affected colors derive from semantic background tokens
Navigation and public About surfaces SHALL derive neutral text, icon, border, surface, focus, and scrollbar colors from the active semantic theme and accent tokens instead of fixed gray or blue component colors.

#### Scenario: Visitor changes the site theme or background accent
- **WHEN** the active theme mode or background-derived accent changes
- **THEN** the affected menu and About surfaces update from the same semantic token set
- **THEN** equivalent elements do not retain a conflicting fixed neutral hue

#### Scenario: Text appears on an accent-filled control
- **WHEN** a control uses the strong accent surface
- **THEN** its text and icon color use the contrast-safe accent-surface text token
