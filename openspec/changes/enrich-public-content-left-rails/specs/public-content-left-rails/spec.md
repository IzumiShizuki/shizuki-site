## Purpose

Give public visitors useful, compact author context and reliable navigation in the blog and site-introduction left rails without duplicating discovery widgets.

## ADDED Requirements

### Requirement: Blog left rail provides compact public author context
The blog list SHALL retain its existing primary navigation and SHALL show a compact public author entry when public author data is available. The entry SHALL link to the public site introduction and SHALL omit unavailable profile fields rather than inventing content.

#### Scenario: Public profile is available
- **WHEN** a visitor opens the blog list
- **THEN** the left rail shows the available author identity and an accessible link to the site introduction

#### Scenario: Optional profile fields are absent
- **WHEN** the public profile omits an optional identity field
- **THEN** the rail omits that field without leaving an empty placeholder

### Requirement: Public author rail retains content navigation
The public site-introduction left rail SHALL show a compact identity summary and retain the existing same-page navigation. It SHALL expose only confirmed public routes and SHALL omit unavailable route data.

#### Scenario: Visitor uses the public introduction rail
- **WHEN** a visitor opens the public site-introduction page
- **THEN** the compact identity summary, same-page navigation, and available public routes are keyboard accessible

### Requirement: Left rails remain usable in constrained layouts
The public left rail content SHALL remain keyboard operable and free of horizontal overflow at narrow desktop widths and when shown in the mobile auxiliary drawer.

#### Scenario: Narrow or drawer layout
- **WHEN** the viewport or auxiliary drawer constrains rail width
- **THEN** controls remain reachable and labels or accessible names identify their actions
