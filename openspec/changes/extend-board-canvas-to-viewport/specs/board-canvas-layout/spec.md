## ADDED Requirements

### Requirement: Board Canvas opens near the viewport bottom
When a Board Canvas window is created, its initial height SHALL use nearly all available viewport height and leave no more than 16 CSS pixels between the window and the viewport bottom, while respecting the viewport's existing edge padding.

#### Scenario: Opening Board Canvas in a tall viewport
- **WHEN** a new Board Canvas window opens in a viewport tall enough for its minimum usable size
- **THEN** the window reaches to within 16 CSS pixels of the viewport bottom

#### Scenario: Opening Board Canvas in a compact viewport
- **WHEN** a new Board Canvas window opens in a viewport shorter than its preferred height
- **THEN** its initial bounds are clamped to the available viewport height and the editor remains reachable through the window's scrolling behavior

#### Scenario: Resizing Board Canvas after opening
- **WHEN** the user resizes the Board Canvas window
- **THEN** the window continues to follow the shared light-app resize and viewport-clamping behavior
