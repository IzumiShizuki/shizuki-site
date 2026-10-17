## Purpose

Keep public content readable and operable on narrow phones, including searching, navigating article sections and returning to the previous list, without toolbars, media, keyboard or floating controls obscuring the reading task.

## ADDED Requirements

### Requirement: Mobile reading hierarchy
At narrow viewport widths the article body SHALL remain the primary content, with reachable directory and navigation actions. Long code, tables, titles and media SHALL not cause horizontal document overflow, and new controls SHALL account for safe areas and keyboard focus.

#### Scenario: Narrow screen and long content
- **WHEN** a 360px-wide viewport displays a long title, code block, image or nested directory
- **THEN** the page remains within the viewport and overflowing code or tables scroll within their own container

### Requirement: Recoverable list context
Returning from an article SHALL restore the relevant blog-list filters, page and reading position for the current browser session, rather than resetting to an unrelated unfiltered list.

#### Scenario: Filtered article round trip
- **WHEN** a visitor searches and filters the list, opens an article and returns
- **THEN** the list retains the query, filters, page and prior position within the session

### Requirement: Accessible mobile actions
Mobile directory, search and content actions SHALL expose descriptive accessible names, visible focus and usable touch targets; overlays SHALL close predictably and return focus to their trigger.

#### Scenario: Keyboard directory use
- **WHEN** a visitor opens and closes the directory using a keyboard
- **THEN** focus stays in a usable sequence and returns to the initiating control after closure
