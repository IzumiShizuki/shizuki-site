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

#### Scenario: Track-specific entry reveals the requested song
- **WHEN** a visitor opens Folia from a normal-mode song row or the current playback detail
- **THEN** the main-site player resolves and selects that exact provider-and-track identifier before Folia becomes visible
- **AND THEN** Folia opens its player view with the resulting authoritative session instead of exposing a previously viewed song or lattice surface

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

#### Scenario: Embedded lyric focus advances once
- **WHEN** playback crosses from one timestamped lyric line to the next
- **THEN** the continuous site-owned playback clock is the only writer that advances Folia's active line
- **AND THEN** an unchanged lyric timeline is not remounted or retransmitted solely because its active index changed

#### Scenario: Folia is integrated with the current music workspace
- **WHEN** a visitor opens immersive lyrics from a normal playlist or track
- **THEN** the playlist, queue, and next/previous behavior remain backed by the full main-site queue
- **AND THEN** the visitor does not need a separate mode-switch control to return to music browsing

#### Scenario: Wallpaper is shared with the Home surface
- **WHEN** the main site has an active Home wallpaper and Folia is rendered in the music workspace
- **THEN** Folia uses that wallpaper as a softened background and a sharp image within its music content region
- **AND WHEN** the visitor expands Folia across the website viewport
- **THEN** the wallpaper is sharp across the website display area without invoking the browser Fullscreen API or hiding browser chrome

#### Scenario: Folia controls preserve main-player ordering and seek immediately
- **WHEN** a visitor uses Folia previous/next while the main player is in random mode
- **THEN** Folia sends an intent to the main player instead of choosing from its own visual queue
- **AND THEN** the main player's randomized ordering decides the resulting track
- **WHEN** a visitor clicks or drags Folia's playback range
- **THEN** the site-owned audio and Folia lyric clock update during the gesture, without waiting for pointer exit

#### Scenario: Latest Folia account authorization is used in normal playback
- **WHEN** a visitor completes or refreshes a NetEase login in Folia
- **THEN** the resulting authorized Cookie is persisted for the visitor and becomes eligible for normal-mode resolution immediately
- **AND THEN** normal-mode NetEase playback prefers the account-authorized source even if the account-status projection has not refreshed yet

#### Scenario: Folia changes its provider Cookie storage key
- **WHEN** Folia stores the NetEase session under its current `online_provider:netease:cookie` key
- **THEN** the site reads that key before the legacy `netease_cookie` alias and persists the same authorized session
- **AND THEN** site-to-Folia synchronization writes both keys so an upgrade cannot silently disconnect normal playback from Folia login

#### Scenario: Normal playback reuses Folia's NCM member source
- **WHEN** a visitor with a valid NetEase Cookie resolves a member-only track from the normal music workspace
- **THEN** the site requests the stream through the same internal NCM source used by Folia, with the Cookie applied to that request
- **AND THEN** it uses Folia's signed-URL options and never reports the public `outer/url` trial as an authorized member stream

#### Scenario: NCM transiently returns a trial for a valid member session
- **WHEN** the first authorized NCM response is explicitly marked as a trial or is much shorter than the track duration
- **THEN** the normal player retries the Folia-compatible member request with a fresh cache key before falling back
- **AND THEN** it accepts only a full-duration authorized response and never exposes the rejected trial URL

#### Scenario: Embedded lyric text fits the music workspace
- **WHEN** Folia is rendered inside a music workspace narrower than the browser viewport
- **THEN** the primary lyric is scaled to the actual embed width and its longest unbreakable text span remains fully readable instead of clipping at either edge
- **AND WHEN** the visitor enters fullscreen
- **THEN** the primary lyric returns to the visitor's preferred scale for the full viewport

#### Scenario: Playlist can open as a Folia browsing surface
- **WHEN** a visitor opens a music playlist and chooses its Folia browsing action
- **THEN** the full playlist is installed as the site-owned queue and displayed in Folia's lattice view
- **AND THEN** later next/previous controls continue to use that complete queue
