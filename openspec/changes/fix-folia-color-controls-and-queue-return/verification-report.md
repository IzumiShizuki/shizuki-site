# Verification: Folia controls and ordinary list return, 2026-10-02

## Implementation verification

| Dimension | Evidence |
| --- | --- |
| Completeness | 5/9 tasks complete; three requirements implemented. Exact artifact build/public source delivery/deployment and live acceptance remain pending. |
| Correctness | Mounted RED reproduced input-only preference loss, duplicate Folia dock, two active duplicate rows and missing entry 870. GREEN checks cover input/change deduplication, Folia dock removal, exact entry identity, expanded list/paging, same-route return token, native queue route/profile and overlay activation without clock scrolling. |
| Coherence | Shared audio/queue ownership retained; native Folia transport remains. Ordinary presentation uses authoritative source context and exact queue entries; reveal uses discrete selection/return/list activation. Unrelated wallpaper branch work is excluded from the clean release. |

Luna's final full host run: **251 files / 1512 tests passed**, production build passed. Root independently ran **4 mounted files / 29 tests** and **3 existing navigation/lyrics/coordinator files / 34 tests**, all passed. The fork's shared renderer and non-lyric background separation were reviewed and independently tested. Existing chunk-size/empty React chunk warnings remain; no backend change is part of this follow-up.

Actual baseline evidence and ranked hypotheses are in diagnosis.md. Signed-in late-entry list return, native controls, primary glyph color/reset and single transport will be checked on the exact deployed artifacts before marking the remaining tasks complete. Native OS picker dragging is outside DOM automation; the mounted input-only regression specifically checks the pre-commit event.
