## Purpose

让目录中的每个轻应用都能进入覆盖整个站点视口的专注工作空间，同时保持既有窗口状态、安全边界和可访问的退出路径。

## ADDED Requirements

### Requirement: Every light application offers page fullscreen
The system SHALL expose the same page-fullscreen action for every registered light application without requiring application-specific fullscreen implementations.

#### Scenario: Catalog applications receive the shared action
- **WHEN** a user opens any registered light application as a floating window
- **THEN** its shared window chrome provides an action named “进入网页全屏”

#### Scenario: App page entry opens the shared fullscreen shell
- **WHEN** a user chooses the page-opening action from an Apps catalog card
- **THEN** the system opens that application in the same shared page-fullscreen shell used by floating windows

### Requirement: Page fullscreen covers and isolates the site viewport
The system SHALL render exactly one fullscreen light application over the complete site viewport and SHALL prevent pointer, keyboard, and scroll interaction with the obscured site until fullscreen exits.

#### Scenario: Fullscreen occupies the viewport
- **WHEN** a light application enters page fullscreen
- **THEN** its shell covers the viewport edges and safe areas above site navigation, the global player, floating controls, and page content

#### Scenario: Fullscreen ownership is exclusive
- **WHEN** another light application requests page fullscreen while one is already fullscreen
- **THEN** the new application becomes the sole fullscreen owner and the previous application returns to its preserved floating-window state

#### Scenario: Browser fullscreen permission is not requested
- **WHEN** a user enters page fullscreen
- **THEN** the system uses an in-page overlay and does not invoke the browser native Fullscreen API

### Requirement: Fullscreen preserves application and window state
The system SHALL keep the existing application instance mounted while changing presentation and SHALL restore its prior floating geometry and working state after fullscreen exits.

#### Scenario: Exit restores floating geometry
- **WHEN** a user enters fullscreen, changes application data, and exits
- **THEN** the application returns to its previous floating position and dimensions with its input and internal module state intact

#### Scenario: Minimized application enters fullscreen
- **WHEN** a minimized light application is asked to enter fullscreen
- **THEN** it becomes visible and fullscreen without discarding its state

#### Scenario: Closing a fullscreen application
- **WHEN** a user activates the window close action while the application is fullscreen
- **THEN** the fullscreen layer closes and the application follows the existing close and state-release behavior

### Requirement: Fullscreen has accessible entry and exit behavior
The system SHALL provide visible, labeled, keyboard-operable controls and SHALL restore focus predictably when fullscreen exits.

#### Scenario: Toolbar exit
- **WHEN** a user activates “退出网页全屏”
- **THEN** fullscreen exits and focus returns to the control that entered fullscreen when it still exists, otherwise to the restored light-application window

#### Scenario: Escape exit
- **WHEN** fullscreen is active and the user presses Escape outside an application-owned modal or editable escape context
- **THEN** fullscreen exits without closing the application

#### Scenario: Focus remains in the fullscreen surface
- **WHEN** a user navigates with Tab while fullscreen is active
- **THEN** focus stays within the fullscreen light-application shell and its controls

### Requirement: Fullscreen respects themes, motion modes, and constrained viewports
The system SHALL use the existing site theme and motion tokens, preserve a readable application header, and allow the application body to scroll within the available viewport.

#### Scenario: Theme and motion compatibility
- **WHEN** fullscreen is entered in daytime or night theme and immersive or soothing motion mode
- **THEN** the shell remains legible and soothing/reduced motion avoids large spatial transitions

#### Scenario: Constrained viewport
- **WHEN** the light-application surface is displayed at a narrow or short supported viewport
- **THEN** the header actions remain reachable and the application body scrolls without causing page-level horizontal overflow

### Requirement: Application security boundaries remain unchanged
The system SHALL NOT broaden network, iframe, download, storage, or authentication permissions merely because a light application is fullscreen.

#### Scenario: Sandboxed application enters fullscreen
- **WHEN** a sandboxed community or embedded application enters page fullscreen
- **THEN** its existing sandbox, referrer, navigation, and permission restrictions remain unchanged
