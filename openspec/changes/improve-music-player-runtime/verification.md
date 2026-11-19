# Player runtime verification

- 77 targeted Vitest assertions passed across queue/engine, lyric routing and mobile compact controls. The queue case represents 1,000 records with no speculative Audio instances, explicit selection, pause/resume, next and supplied catalogue duration.
- Vite production bundles built for baseline `440b675f` and the candidate.
- Fresh isolated local Edge at desktop 1440 and iPhone 13 emulation. A forced public playback bridge load of the same 25-song fake bundle produced 26 pre-play audio requests across 25 distinct tracks and 26 Audio instances in each baseline run; candidate produced zero pre-play audio requests and one Audio instance in each run. After explicit Play the candidate issued one audio request and successfully advanced to the next synthetic track. Baseline Enter on the mobile Play button opened the full-player dialog; candidate Enter started playback without opening it. Desktop lyrics remained live on a permitted route while playing and disappeared on pause.
- All HTTP routing was intercepted with local data and a synthetic 20-second WAV. This is not a measurement of production traffic, provider latency, system audio outputs or real devices.

To reproduce from the repository root with an installed Playwright and Microsoft Edge: `python openspec/changes/improve-music-player-runtime/player-browser-smoke.py <absolute vite dist path>`. For candidate assertions, choose a dist directory whose name includes `after`.
