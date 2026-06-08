"""One-off bulk rename script for MediaServiceImpl.java.

Performs literal token replacements that are safe because the replaced tokens
are unique identifiers (or unique substrings within method bodies). The script
is idempotent: running it twice produces the same result as running it once.
"""
from __future__ import annotations

from pathlib import Path

ROOT = Path(__file__).resolve().parents[4]
TARGET = ROOT / "modules/media-module/src/main/java/io/github/shizuki/site/media/service/impl/MediaServiceImpl.java"

REPLACEMENTS: list[tuple[str, str]] = [
    # ---- inner record types ----
    ("TuneHubApiContext", "MusicApiContext"),
    ("TuneHubVirtualPlaylistRef", "MusicVirtualPlaylistRef"),
    # ---- provider/properties bean refs ----
    # Static type qualified accesses: TuneHubMusicProvider.<inner>
    ("TuneHubMusicProvider.SearchTrackResult", "MetingMusicProvider.SearchTrackResult"),
    ("TuneHubMusicProvider.VirtualPlaylistSummary", "MetingMusicProvider.VirtualPlaylistSummary"),
    ("TuneHubMusicProvider.ParseTrackResult", "MetingMusicProvider.ParseTrackResult"),
    # Instance variable access (lowercase)
    ("tuneHubMusicProvider.", "metingMusicProvider."),
    ("tuneHubMusicProperties.", "metingMusicProperties."),
    # ---- constants (already partly renamed in declarations) ----
    ("TUNEHUB_PLAYLIST_PLATFORMS", "MUSIC_PLATFORMS"),
    ("TUNEHUB_REAL_PLAYLIST_SEARCH_PLATFORMS", "MUSIC_REAL_PLAYLIST_SEARCH_PLATFORMS"),
    ("VIRTUAL_TUNEHUB_PLAYLIST_CODE_PATTERN", "VIRTUAL_LEGACY_PLAYLIST_CODE_PATTERN"),
    ("SOURCE_MODE_TUNEHUB_FIRST", "SOURCE_MODE_METING_FIRST"),
    ("SOURCE_MODE_TUNEHUB_ONLY", "SOURCE_MODE_METING_ONLY"),
    # ---- helper method names ----
    ("resolveTuneHubApiContext", "resolveMusicApiContext"),
    ("parseVirtualTunehubPlaylistCode", "parseVirtualMusicPlaylistCode"),
    ("loadVirtualTunehubPlaylistBundle", "loadVirtualMusicPlaylistBundle"),
    ("resolveTuneHubPlatformOrder", "resolveMusicPlatformOrder"),
    ("normalizeTuneHubPlatformOrder", "normalizeMusicPlatformOrder"),
    # ---- local variable rename (R1.4 sweep) ----
    ("tunehubResolvable", "aggregatorResolvable"),
    # ---- string literals (UI text & log events) ----
    # Note: "vh_tunehub_" inside VIRTUAL_LEGACY_PLAYLIST_CODE_PATTERN regex MUST stay
    # untouched; we therefore process the write-side literal explicitly with a fuller
    # surrounding context.
    ('"TuneHub 推荐歌单"', '"Meting 推荐歌单"'),
    ('"MUSIC_TUNEHUB_HOME_LOAD_FAIL"', '"MUSIC_METING_HOME_LOAD_FAIL"'),
    ('"TuneHub API key missing"', '"Music api key missing"'),
    ('"TuneHub 虚拟歌单"', '"Meting 虚拟歌单"'),
    ('"TuneHub 歌单"', '"Meting 歌单"'),
    ('"TuneHub parse failed"', '"Music parse failed"'),
    # resolved_source playback metadata literal
    ('"resolved_source", "tunehub"', '"resolved_source", "meting"'),
    # write-side virtual playlist code prefix (R6.3)
    ('"vh_tunehub_" + normalizedProvider', '"vh_meting_" + normalizedProvider'),
]


def main() -> int:
    raw = TARGET.read_text(encoding="utf-8")
    for old, new in REPLACEMENTS:
        if old == new:
            continue
        if old not in raw and new in raw:
            print(f"[skip] already renamed: {old!r} -> {new!r}")
            continue
        before = raw
        raw = raw.replace(old, new)
        delta = raw.count(new) - before.count(new)
        print(f"[ok]   {old!r} -> {new!r} ({delta} replacements)")
    TARGET.write_text(raw, encoding="utf-8")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
