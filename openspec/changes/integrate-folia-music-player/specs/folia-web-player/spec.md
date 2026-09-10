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
