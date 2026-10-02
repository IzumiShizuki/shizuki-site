# Verification report: fix-home-lyrics-and-audio-visualizer

## Result

| Dimension | Result |
|---|---|
| Completeness | 7/7 tasks complete; both capabilities have requirements and scenarios. |
| Correctness | All subtitle and shared visualizer requirements verified in a browser or component tests. |
| Coherence | The shared audio analyser and Canvas lifecycle are reused; route styles no longer control subtitle placement. |

## Evidence

- Reproduced subtitles moving down 76px on `/apps` at 1440×900. Removing the `apps-rail-mode` bottom override restored the original position.
- `scripts/check-home-music.py --screenshots <directory>` passed route stability, user dragging, music-route hide/return and reload checks at 1440×900, 1000×800, 900×800 and 760×1000. All checks also preserved the `lyricOffset` drag position.
- The same browser run played a generated local audio fixture and confirmed Home Canvas pixels, a centered 140px stage, crystal-bar and orbit-ring selection, pause decay, route cleanup, and `guard_no_visualizer`. Desktop and narrow screenshots were visually reviewed.
- Focused tests passed: 5 files, 40 tests. Full frontend suite passed: 254 files, 1556 tests.
- `pnpm build` succeeded. Vite reported its existing large-chunk advisory.
- `openspec validate fix-home-lyrics-and-audio-visualizer --type change --strict --no-interactive` passed.
- `git diff --check` passed for implementation files.

## Scenario coverage

| Scenario | Evidence |
|---|---|
| Navigate Home, applications, and blog | Browser coordinate assertions at four desktop and narrow viewports. |
| Drag, visit another route, return from music, reload | Browser assertions verified the exact relative drag offset through each state. |
| Audio transient peak hold and fall | Shared component test verified the peak remains during hold, then falls without crossing below the live level. |
| Change bars and ring styles | Shared component and browser checks verified named painters and persisted selection. |
| Pause, page visibility, route exit and runtime guard | Component lifecycle and local-audio browser checks verified decay, animation cleanup and route suppression. |

## Notes

- No critical issues found. Existing build output includes a large-chunk advisory unrelated to this change.
- Screenshots are stored outside the repository at `C:\Users\IzumiShizuki\.codex\visualizations\2026\10\02\01a0fcd1-acc9-7352-b6b7-25969a8a3fe3`.
