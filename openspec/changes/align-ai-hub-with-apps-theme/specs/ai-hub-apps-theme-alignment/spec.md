## Purpose

Keep AI Hub visually coherent with the Apps workspace by using the same background-derived semantic surfaces while retaining clear AI interaction and selection states.

## ADDED Requirements

### Requirement: Shared workspace surface family
AI Hub SHALL use the same theme-derived panel, elevated, soft, hover, border, shadow, and text roles as the Apps workspace instead of applying a broad accent-color wash to its large surfaces.

#### Scenario: AI Hub opens in night mode
- **WHEN** a visitor opens AI Hub while the site uses night mode
- **THEN** the workspace shell and its primary panels use the background-derived dark panel family seen in Apps
- **AND** the large panels do not resolve to the active accent fill

#### Scenario: AI Hub opens in day mode
- **WHEN** a visitor opens AI Hub while the site uses day mode
- **THEN** the workspace shell and its primary panels use the background-derived light panel family seen in Apps
- **AND** text, borders, and controls remain readable against those surfaces

### Requirement: Theme-derived town map
The AI Town map SHALL use a theme-derived base and pattern treatment rather than an independent navy palette.

#### Scenario: Visitor views the town map
- **WHEN** the town mode is active
- **THEN** the map base belongs to the same warm surface family as the surrounding workspace
- **AND** its texture remains visible without forming a dark blue island

### Requirement: Accent color remains semantic
AI Hub SHALL reserve the current accent color for active modes, selected nodes, focus indicators, primary actions, and small wayfinding details.

#### Scenario: Visitor changes a mode or map destination
- **WHEN** a visitor selects a different AI mode or town destination
- **THEN** the selected control remains distinguishable through accent color plus border, shape, or elevation
- **AND** inactive large surfaces remain on the shared neutral theme family

### Requirement: All AI modes inherit the aligned palette
Town, normal conversation, tavern, and administrator companion modes SHALL inherit the aligned AI surface roles without changing their behavior or information architecture.

#### Scenario: Visitor switches between available AI modes
- **WHEN** a visitor moves between town, normal conversation, tavern, or companion modes
- **THEN** each mode uses the same aligned canvas, elevated, input, border, and text roles
- **AND** existing sessions, actions, layouts, and responsive behavior remain available
