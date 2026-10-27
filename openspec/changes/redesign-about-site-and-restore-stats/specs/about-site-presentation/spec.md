## Purpose

Present the personal site's identity, interests and public content with distinctive geometric composition and reliable statistics that visitors can understand and trust.

## ADDED Requirements

### Requirement: Statistics reflect public content
The About page SHALL display the actual public article total and distinct public category and tag counts using existing public content sources. It SHALL NOT substitute absent profile values or invent project and traffic counts.

#### Scenario: Public content loads after the page mounts
- **WHEN** a delayed public response contains 12 articles, 3 categories and 4 tags
- **THEN** the data overview displays 12, 3 and 4 without remounting

#### Scenario: Genuine empty content
- **WHEN** public sources successfully report zero articles and empty category and tag catalogs
- **THEN** the data overview displays genuine zero values

### Requirement: Unavailable statistics remain distinguishable
The page SHALL distinguish loading and unavailable values from numeric zero, retain successful metrics on partial failure, and provide a retry action when a source fails or returns malformed data.

#### Scenario: Only one source succeeds
- **WHEN** article totals load but the category and tag request fails
- **THEN** the article total remains visible, category and tag values are unavailable and retry is available

#### Scenario: Recovery
- **WHEN** a visitor retries and the failed source succeeds
- **THEN** the missing statistics appear without hiding successful values

### Requirement: Expressive responsive About composition
The page SHALL combine asymmetric layout, curved imagery and visible orbital or star geometry with a clear reading hierarchy. Existing identity, biography, skills, destinations, edit actions and links SHALL remain available in day and night themes, at mobile widths and with reduced motion.

#### Scenario: Narrow viewport
- **WHEN** the page is viewed at 375 pixels wide
- **THEN** its content and controls remain readable without horizontal overflow and the visual geometry does not obstruct interaction

#### Scenario: Reduced motion and keyboard navigation
- **WHEN** a visitor requests reduced motion or uses a keyboard
- **THEN** all content is visible without animation and destination, retry and edit controls expose a visible focus state
