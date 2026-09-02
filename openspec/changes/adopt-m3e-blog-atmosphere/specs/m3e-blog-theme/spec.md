## Purpose

Provide a personalized, accessible blog appearance that turns the visitor's existing color choice into a coherent Material 3 Expressive-inspired reading environment while preserving Shizuki's own warm visual character.

## ADDED Requirements

### Requirement: Existing colors produce a semantic theme
The frontend SHALL derive primary, secondary, tertiary, surface, outline, foreground, focus, and interaction-state roles from the visitor's current solid or gradient color selection and current day/night mode. Blog components SHALL consume semantic roles rather than requiring their own fixed palette.

#### Scenario: Solid seed color is changed
- **WHEN** a visitor selects a different solid accent color
- **THEN** the blog background, surfaces, controls, borders, and readable foreground roles update together without a page reload

#### Scenario: Gradient colors are changed
- **WHEN** a visitor selects or customizes a gradient accent
- **THEN** the semantic theme uses both gradient endpoints for expressive roles while maintaining readable foregrounds on the resulting surfaces

### Requirement: Visitors can choose a palette personality
The frontend SHALL offer a small set of named palette personalities that alter the relationship between the current seed colors and the derived semantic roles. The selected personality SHALL apply immediately, remain compatible with both day and night modes, and persist with the visitor's existing appearance preferences.

#### Scenario: Palette personality is selected
- **WHEN** a visitor selects a different palette personality
- **THEN** the blog's semantic colors and preview update immediately while the visitor's chosen seed color or gradient remains unchanged

#### Scenario: Persisted preference is restored
- **WHEN** the application starts with a previously saved palette personality
- **THEN** that personality is restored together with the saved seed colors, accent mode, and day/night mode

#### Scenario: Legacy preferences are restored
- **WHEN** the application starts with appearance data saved before palette personalities existed
- **THEN** the existing colors remain valid and the system applies the default palette personality without discarding the visitor's other preferences

### Requirement: Blog hierarchy follows expressive semantic roles
The blog list and reader SHALL distinguish page, container, elevated container, interactive accent, and supporting content through semantic tonal roles, intentional shape contrast, and consistent hover, focus, pressed, selected, and disabled states. Keyboard focus SHALL remain visibly distinguishable in both day and night modes.

#### Scenario: Visitor navigates blog controls by keyboard
- **WHEN** a visitor tabs through blog search, categories, article cards, table of contents, and reader actions
- **THEN** every actionable item exposes a visible focus state derived from the semantic focus role and remains operable without a pointer

#### Scenario: Blog is viewed on a narrow screen
- **WHEN** the blog list or reader is displayed at a mobile-width viewport
- **THEN** semantic hierarchy and controls remain readable without horizontal page overflow or loss of primary reading actions

### Requirement: Blog routes include an ambient color field
Blog routes SHALL render a decorative ambient color field derived from the active semantic theme behind their content. The field SHALL not capture input, SHALL preserve content contrast, and SHALL coexist with the site's selected wallpaper/background behavior.

#### Scenario: Blog route is opened
- **WHEN** a visitor opens the blog list or a blog article
- **THEN** the route shows a restrained color field that reflects the active seed colors and palette personality without reducing article readability

#### Scenario: Reduced motion is requested
- **WHEN** the visitor or operating system requests reduced motion
- **THEN** the ambient color field remains visually present but does not animate

#### Scenario: Visitor leaves the blog
- **WHEN** the visitor navigates to a non-blog route
- **THEN** blog-specific ambient decoration no longer affects that route
