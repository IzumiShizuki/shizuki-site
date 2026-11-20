# Player runtime verification

- 77 targeted Vitest assertions passed across queue/engine, lyric routing and mobile compact controls. The queue case represents 1,000 records with no speculative Audio instances, explicit selection, pause/resume, next and supplied catalogue duration.
- Vite production bundles built for baseline `440b675f` and the candidate.
- Fresh isolated local Edge at desktop 1440 and iPhone 13 emulation. A forced public playback bridge load of the same 25-song fake bundle produced 26 pre-play audio requests across 25 distinct tracks and 26 Audio instances in each baseline run; candidate produced zero pre-play audio requests and one Audio instance in each run. After explicit Play the candidate issued one audio request and successfully advanced to the next synthetic track. Baseline Enter on the mobile Play button opened the full-player dialog; candidate Enter started playback without opening it. Desktop lyrics remained live on a permitted route while playing and disappeared on pause.
- All HTTP routing was intercepted with local data and a synthetic 20-second WAV. This is not a measurement of production traffic, provider latency, system audio outputs or real devices.

To reproduce from the repository root with an installed Playwright and Microsoft Edge: `python openspec/changes/improve-music-player-runtime/player-browser-smoke.py <absolute vite dist path>`. For candidate assertions, choose a dist directory whose name includes `after`.


## Next-track native standby

Edge loopback fixture, with the same 180-second synthetic WAV, 320 ms stream-header delay and identical resolver delay on both arms. Control sets Save-Data (address warm, audio cold). Timing is the click to the native `playing` event, not the metadata or button update.

| Surface | No audio standby | Ready standby | Bytes sent before click |
| --- | ---: | ---: | ---: |
| Standard desktop | 669 ms | 34 ms | 311,296 |
| Mobile Edge emulation | 616 ms | 14 ms | 311,296 |
| Folia desktop (embedded actual Next button) | 632 ms | 46 ms | 425,984 |

Each ready arm started the same native element that loaded in the background, resolved the song once, and issued only one stream request by the time of `playing`. No second element played. The 47-second clock-shift case used a freshly issued URL after one bounded refresh (2 resolves, 20 ms). A simulated range-ignoring upstream also promoted the ready element, without a repeated start request at playback (24 ms; 376,832 bytes before click). Browser metadata preload is not a hard bandwidth cap; only one eligible standby is retained, with a short deadline for incomplete loads. Signed gateway and private no-store headers are unchanged.

Vitest: 294 files, 1,883 cases passed; omitted unrelated `desktop/control-service.spec.mjs` (restricted local loopback for desktop control service). Production Vite build and OpenSpec strict succeeded. Edge smoke used an isolated fresh profile and controlled synthetic media only. Results are not live provider or iOS Safari latency measurements.
