## Purpose

Provide an independent Folia Web music player at `music.shizuki.online` so visitors can experience Folia's full-screen immersive lyric animation UI in a browser, without merging Folia (AGPL-3.0) code into the private `vue3-merged` repository.

## ADDED Requirements

### Requirement: Folia Web instance availability
The site SHALL expose a reachable Folia Web player on the `music.shizuki.online` origin, backed by the official Folia Docker stack running on the `111.228.35.186` server.

#### Scenario: Player is healthy
- **WHEN** a visitor opens `https://music.shizuki.online` and the Folia gateway and its dependent services are healthy
- **THEN** the visitor sees the Folia Web UI and can search, play, and view full-screen lyric animations

#### Scenario: Gateway health probe fails
- **WHEN** the Folia gateway `/healthz` or backend `/api/healthz` fails
- **THEN** the deployment runbook detects the unhealthy service via `docker compose ps` and the visitor gets a normal upstream error instead of a broken partial page

### Requirement: Origin isolation from the main site
The Folia player SHALL be served from a separate origin (`music.shizuki.online`) and SHALL NOT be bundled into the `vue3-merged` frontend or the monolith backend.

#### Scenario: Repository boundary
- **WHEN** the deployment is inspected
- **THEN** no Folia source files are present in `fronted/vue3-merged` or `apps/monolith-app`, keeping the private repositories outside the AGPL-3.0 derivative-work surface

### Requirement: Main-site navigation entry
The main site navigation SHALL include an external entry labeled for Folia that opens the player origin in a new context (tab) so the immersive full-screen UI is not constrained by an embedded frame.

#### Scenario: Navigate from main site
- **WHEN** a visitor clicks the Folia entry in the main-site navigation
- **THEN** the browser opens `https://music.shizuki.online` in a new tab and the main site remains unaffected

### Requirement: Music-source connectivity
The player SHALL be able to play music from at least one online source: NetEase (reusing the existing `music-ncm-api` sidecar when reachable, otherwise the Folia bundled netease-api), plus KuGou and QQ music when their respective services are configured.

#### Scenario: NetEase playback
- **WHEN** a visitor searches and plays a NetEase track while the configured NetEase API base is reachable
- **THEN** audio plays and lyrics/cover load

#### Scenario: QQ music requires login
- **WHEN** QQ music is configured and a visitor has not signed in
- **THEN** the player prompts for QQ login (device-code/QR) and playback is gated behind a successful session as documented upstream

### Requirement: Deployability and rollback
The deployment SHALL be reproducible from checked-in compose and environment template files and SHALL be rollbackable without affecting the existing site containers.

#### Scenario: Reproduce deployment
- **WHEN** an operator follows the checked-in `deploy/folia/` runbook on a fresh server with Docker and Compose available
- **THEN** the Folia stack comes up with the same topology and exposed port

#### Scenario: Roll back
- **WHEN** an operator removes the Caddy rule and runs `docker compose down` in the Folia directory
- **THEN** the existing main-site containers keep running and the Folia origin stops serving

### Requirement: Seamless main-site mode transition
The embedded music experience SHALL keep the main-site player as the single audio owner while allowing visitors to switch between the normal Vue workspace and the Folia React workspace without restarting the current track or rebuilding either workspace tree.

#### Scenario: Switch modes during playback
- **WHEN** a visitor switches from normal mode to Folia mode or back while a track is playing
- **THEN** the same main-site audio element continues at the current position, both workspace roots retain their DOM identity, and no additional audio element is created by the transition

#### Scenario: Folia bridge is still warming up
- **WHEN** the visitor enters Folia mode before the remote React bundle and bridge are ready
- **THEN** the site retains the complete current playback snapshot and delivers it through the follow-playback protocol after mount without invoking Folia-owned track playback

#### Scenario: Folia visuals follow the main-site clock
- **WHEN** the main-site audio is playing in Folia mode
- **THEN** Folia continuously projects progress and lyric focus between periodic clock corrections, and Folia play or pause commands are relayed back to the main-site player

#### Scenario: Both modes render one authoritative playback session
- **WHEN** a visitor switches modes or changes a track from either mode
- **THEN** Folia receives one versioned snapshot containing the main-site track metadata, cover, complete queue, playlist metadata, parsed lyric timeline, lyric focus, duration, position, and playback state
- **AND THEN** both modes render the same title, artist, cover, queue contents, lyric text, and active lyric line without Folia resolving replacement metadata or lyrics

#### Scenario: Embedded Folia cannot produce a second audio stream
- **WHEN** Folia follows the main-site playback session, including after a local Folia state restoration or an internal control action
- **THEN** every Folia-owned audio element is paused and has no playable source
- **AND THEN** only the main-site `usePlayerEngine.audioElement` can produce audible output

#### Scenario: Upstream CDN is unreachable from the browser
- **WHEN** a resolved third-party audio URL cannot be read reliably from the visitor's browser network
- **THEN** the player receives a short-lived same-origin stream URL, the backend relays the audio with byte-range support, and the browser never needs to connect to the third-party CDN directly

#### Scenario: Return after navigating away
- **WHEN** a visitor leaves the music route and later returns during the same document session
- **THEN** the previously mounted Folia root is reattached instead of cold-started again

#### Scenario: Switch modes on a narrow viewport
- **WHEN** the viewport is 390 CSS pixels wide
- **THEN** the Folia toolbar and mode controls remain visible without horizontal overflow or overlapping command labels

#### Scenario: Embedded lyrics retain the primary line
- **WHEN** the main-site session contains a timestamped primary lyric and an optional translation
- **THEN** Folia renders the primary line in the immersive lyric area and the translation as secondary text
- **AND THEN** an active-line transition does not leave the immersive lyric area empty

#### Scenario: Folia is integrated with the current music workspace
- **WHEN** a visitor opens immersive lyrics from a normal playlist or track
- **THEN** the playlist, queue, and next/previous behavior remain backed by the full main-site queue
- **AND THEN** the visitor does not need a separate mode-switch control to return to music browsing

#### Scenario: Wallpaper is shared with the Home surface
- **WHEN** the main site has an active Home wallpaper and Folia is rendered in the music workspace
- **THEN** Folia uses that wallpaper as a softened background and a sharp image within its music content region
- **AND WHEN** the visitor enters full-screen immersive playback
- **THEN** the wallpaper is sharp across the entire viewport
