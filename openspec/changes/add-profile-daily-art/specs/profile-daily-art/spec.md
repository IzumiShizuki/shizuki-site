## Purpose

为登录用户提供个人每日插画发现体验，将 Pixiv 账号关注和手动选择的画师转化为每天稳定的作品推荐，并提供妹系角色每日抽取、图片展示及可追溯的原作搜索入口。

## ADDED Requirements

### Requirement: Pixiv account connection
The system SHALL let an authenticated user connect a Pixiv account using its numeric ID or profile URL and PHPSESSID, verify the session before saving it, encrypt it at rest, and never return it in responses. Users SHALL be able to update the session or disconnect it.

#### Scenario: Valid connection
- **WHEN** a logged-in user supplies matching account and session information
- **THEN** the account name and connection state are shown and the session is stored encrypted for that website user only

#### Scenario: Failed validation or disconnect
- **WHEN** a session is invalid, mismatched, or the user disconnects
- **THEN** invalid data does not replace the existing connection, and disconnect removes credentials and imported follows while retaining manual artists

### Requirement: Artist preferences and following synchronization
The system SHALL let users add and remove numeric artist IDs or Pixiv profile links, reject duplicates, and synchronize public follows plus optionally private follows from the connected account. Synchronization SHALL report a bounded import and preserve manually selected artists on failures and future syncs.

#### Scenario: Following sync
- **WHEN** the user synchronizes a connected account
- **THEN** imported artists are deduplicated, manual choices remain, and truncation or unavailable authentication is explicitly shown

### Requirement: Stable daily recommendations
The system SHALL recommend up to six available all-ages images from the user's chosen artists, based on website user and Asia/Shanghai date, and persist successful daily selections across refreshes and server restarts. Empty preferences SHALL show an actionable setup state.

#### Scenario: Repeat visit and new date
- **WHEN** the same user reloads on the same Shanghai date
- **THEN** successful daily artwork and character selections remain unchanged, with new selections eligible on the next date

#### Scenario: Upstream failure
- **WHEN** some or all artwork sources fail
- **THEN** existing daily results remain available, missing sections can be retried, and failure is distinguished from no configured artists

### Requirement: Daily sister-type character
The system SHALL choose one character per user per Shanghai date from a named sister-type anime character pool, display a matching all-ages illustration, its artist attribution and character name, and provide Pixiv character search and original artwork links. Reloading SHALL not redraw a successful selection.

#### Scenario: Daily draw
- **WHEN** a user opens daily content
- **THEN** a stable character from the sister-type pool is selected and an available matching illustration is displayed, or a retry state and character search link are shown if upstream is unavailable

### Requirement: Artwork search and trustworthy previews
The system SHALL allow keyword search inside the personal daily content interface, show artwork and artist metadata with original links, and serve previews only for verified all-ages Pixiv artwork IDs from trusted HTTPS image hosts. Requests SHALL be bounded by size, time and rate limits.

#### Scenario: Search and preview
- **WHEN** a user searches a character or artwork keyword
- **THEN** matching all-ages works are shown with image, title, artist and original links; unsafe, masked or non-Pixiv destinations are rejected

### Requirement: Personal interface availability
The system SHALL expose these functions in both desktop and mobile personal interfaces with loading, empty, error, image-failure and logged-out states, accessible controls, and responsive layout.

#### Scenario: Logged-out visitor
- **WHEN** a visitor opens the desktop personal page without authentication
- **THEN** the daily content area shows a login action and does not request private data
