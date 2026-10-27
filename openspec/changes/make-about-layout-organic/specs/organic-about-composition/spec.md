## Purpose

Make the personal site's About page feel like a connected, naturally paced reading experience, with intentional imagery and dark colors rather than a sequence of framed rectangular modules.

## ADDED Requirements

### Requirement: Open connected content composition
The public About experience SHALL use a visibly open composition across its introduction, biography, interests, life previews, journey and writing. Repeated full rectangular borders and equivalent card enclosures SHALL NOT be the primary grouping mechanism. Existing text, imagery, destinations, section navigation and editor actions SHALL remain available.

#### Scenario: Reading the full public page
- **WHEN** a visitor scrolls through About, its life previews, journey and writing
- **THEN** the sections have distinct hierarchy and naturally varied grouping without a repeated framed-card scaffold
- **AND** all existing destinations and editor actions retain their behavior

### Requirement: Coherent readable About themes
The public About page SHALL provide deliberate, readable day and dark colors across the main content and supporting rails. Public theme refinements SHALL remain scoped to About and SHALL NOT change administration or unrelated pages.

#### Scenario: Dark reading
- **WHEN** a visitor switches About to dark mode
- **THEN** text, controls and images remain legible on coordinated neutral surfaces and section boundaries do not depend on muddy stacked translucent rectangles

### Requirement: Responsive behavior and real data survive redesign
The About page SHALL retain real public statistics, loading/error/retry states, keyboard focus and reduced-motion behavior. Its composition SHALL reflow without horizontal overflow or decorative interference on mobile and intermediate widths.

#### Scenario: Narrow and intermediate layouts
- **WHEN** the page is viewed at 375px, 768px or 1024px wide
- **THEN** its content remains readable, controls remain reachable and decorative shapes do not obscure interaction

#### Scenario: Statistics and reduced motion
- **WHEN** public counts arrive after mount or a visitor enables reduced motion
- **THEN** counts update correctly, failures remain distinguishable from zero and all content stays visible
