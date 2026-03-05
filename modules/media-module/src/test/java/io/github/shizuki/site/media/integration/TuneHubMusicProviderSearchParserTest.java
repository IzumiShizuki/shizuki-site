package io.github.shizuki.site.media.integration;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.site.media.config.TuneHubMusicProperties;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.web.client.RestClient;

class TuneHubMusicProviderSearchParserTest {

    private TuneHubMusicProvider provider;

    @BeforeEach
    void setUp() {
        provider = new TuneHubMusicProvider(
            new TuneHubMusicProperties(),
            RestClient.builder(),
            new ObjectMapper()
        );
    }

    @Test
    void shouldParseNeteaseSongsFromResultNode() {
        Map<String, Object> raw = Map.of(
            "result",
            Map.of(
                "songs",
                List.of(
                    Map.of(
                        "id", 1366570351,
                        "name", "Sweet",
                        "artists", List.of(Map.of("name", "Bren Joy"), Map.of("name", "Landon Sears")),
                        "album", Map.of("name", "Twenties", "picUrl", "https://cover.example/netease.png"),
                        "duration", 226153
                    )
                )
            )
        );

        List<TuneHubMusicProvider.SearchTrackResult> rows = parseRows("netease", raw);

        Assertions.assertEquals(1, rows.size());
        TuneHubMusicProvider.SearchTrackResult item = rows.get(0);
        Assertions.assertEquals("1366570351", item.trackId());
        Assertions.assertEquals("Sweet", item.title());
        Assertions.assertEquals("Bren Joy, Landon Sears", item.artist());
        Assertions.assertEquals("Twenties", item.album());
        Assertions.assertEquals("https://cover.example/netease.png", item.cover());
        Assertions.assertEquals(226, item.durationSec());
    }

    @Test
    void shouldParseKuwoSongsFromAbslistNode() {
        Map<String, Object> raw = Map.of(
            "abslist",
            List.of(
                Map.of(
                    "id", "0",
                    "MUSICRID", "MUSIC_168060593",
                    "SONGNAME", "Sweet",
                    "ARTIST", "Bren Joy&Landon Sears",
                    "ALBUM", "Twenties (Explicit)",
                    "DURATION", "226",
                    "albumpic", "http://img4.kuwo.cn/star/albumcover/500/120/40/78/4180484296.jpg"
                )
            )
        );

        List<TuneHubMusicProvider.SearchTrackResult> rows = parseRows("kuwo", raw);

        Assertions.assertEquals(1, rows.size());
        TuneHubMusicProvider.SearchTrackResult item = rows.get(0);
        Assertions.assertEquals("168060593", item.trackId());
        Assertions.assertEquals("Sweet", item.title());
        Assertions.assertEquals("Bren Joy, Landon Sears", item.artist());
        Assertions.assertEquals("Twenties (Explicit)", item.album());
        Assertions.assertEquals("https://img4.kuwo.cn/star/albumcover/500/120/40/78/4180484296.jpg", item.cover());
        Assertions.assertEquals(226, item.durationSec());
    }

    @Test
    void shouldParseQqSongsFromReqBodyNode() {
        Map<String, Object> raw = Map.of(
            "req",
            Map.of(
                "data",
                Map.of(
                    "body",
                    Map.of(
                        "song",
                        Map.of(
                            "list",
                            List.of(
                                Map.of(
                                    "mid", "0042QMdr3F6tdY",
                                    "name", "Sweet Child O' Mine",
                                    "singer", List.of(Map.of("name", "Guns N' Roses")),
                                    "album", Map.of("name", "Appetite for Destruction", "picUrl", "https://cover.example/qq.png"),
                                    "interval", 355
                                )
                            )
                        )
                    )
                )
            )
        );

        List<TuneHubMusicProvider.SearchTrackResult> rows = parseRows("qq", raw);

        Assertions.assertEquals(1, rows.size());
        TuneHubMusicProvider.SearchTrackResult item = rows.get(0);
        Assertions.assertEquals("0042QMdr3F6tdY", item.trackId());
        Assertions.assertEquals("Sweet Child O' Mine", item.title());
        Assertions.assertEquals("Guns N' Roses", item.artist());
        Assertions.assertEquals("Appetite for Destruction", item.album());
        Assertions.assertEquals("https://cover.example/qq.png", item.cover());
        Assertions.assertEquals(355, item.durationSec());
    }

    @Test
    void shouldNormalizeKuwoRelativeCoverPathWithoutForced500Prefix() {
        Object normalized = ReflectionTestUtils.invokeMethod(
            provider,
            "normalizeCoverUrl",
            "kuwo",
            "120/40/78/4180484296.jpg"
        );

        Assertions.assertEquals(
            "https://img4.kuwo.cn/star/albumcover/120/40/78/4180484296.jpg",
            String.valueOf(normalized)
        );
    }

    @Test
    void shouldParseLyricTextFromNestedLrcAndNormalizeEscapedNewlines() {
        Object lyricText = ReflectionTestUtils.invokeMethod(
            provider,
            "readParseLyricText",
            Map.of("lrc", Map.of("lyric", "[00:01.00]line1\\n[00:03.00]line2")),
            Map.of()
        );

        Assertions.assertEquals("[00:01.00]line1\n[00:03.00]line2", String.valueOf(lyricText));
    }

    @Test
    void shouldParseKuwoToplistTrackCoverAndDuration() {
        Map<String, Object> raw = Map.of(
            "musiclist",
            List.of(
                Map.of(
                    "rid", "168060593",
                    "name", "Sweet",
                    "artist", "Bren Joy&Landon Sears",
                    "web_albumpic_short", "120/40/78/4180484296.jpg",
                    "duration", 226153
                )
            )
        );

        @SuppressWarnings("unchecked")
        List<Object> rows = (List<Object>) ReflectionTestUtils.invokeMethod(provider, "parseToplistTracks", "kuwo", raw);
        Assertions.assertEquals(1, rows.size());
        Object row = rows.get(0);
        Assertions.assertEquals(
            "https://img4.kuwo.cn/star/albumcover/120/40/78/4180484296.jpg",
            String.valueOf(ReflectionTestUtils.getField(row, "cover"))
        );
        Assertions.assertEquals(226, ReflectionTestUtils.getField(row, "durationSec"));
    }

    @Test
    void shouldParseQqPlaylistTrackCoverAndDuration() {
        Map<String, Object> raw = Map.of(
            "cdlist",
            List.of(
                Map.of(
                    "songlist",
                    List.of(
                        Map.of(
                            "songmid", "0042QMdr3F6tdY",
                            "songname", "Sweet Child O' Mine",
                            "singer", List.of(Map.of("name", "Guns N' Roses")),
                            "albummid", "001A2B3C4D",
                            "interval", 355
                        )
                    )
                )
            )
        );

        @SuppressWarnings("unchecked")
        List<Object> rows = (List<Object>) ReflectionTestUtils.invokeMethod(provider, "parseQqPlaylistTracks", raw);
        Assertions.assertEquals(1, rows.size());
        Object row = rows.get(0);
        Assertions.assertEquals(
            "https://y.gtimg.cn/music/photo_new/T002R300x300M000001A2B3C4D.jpg",
            String.valueOf(ReflectionTestUtils.getField(row, "cover"))
        );
        Assertions.assertEquals(355, ReflectionTestUtils.getField(row, "durationSec"));
    }

    @Test
    void shouldMergeNeteasePlaylistTracksByTrackIdsWhenFirstPageContainsTenRowsOnly() {
        List<Map<String, Object>> trackIds = new ArrayList<>();
        List<Map<String, Object>> firstPageTracks = new ArrayList<>();
        for (int index = 1; index <= 80; index += 1) {
            trackIds.add(Map.of("id", index));
            if (index <= 10) {
                firstPageTracks.add(Map.of(
                    "id", index,
                    "name", "Song " + index,
                    "artists", List.of(Map.of("name", "Artist " + index)),
                    "album", Map.of("picUrl", "https://cover.example/" + index + ".png"),
                    "duration", 180000
                ));
            }
        }

        Map<String, Object> playlistRaw = Map.of(
            "result",
            Map.of(
                "trackCount", 80,
                "trackIds", trackIds,
                "tracks", firstPageTracks
            )
        );
        Map<String, Map<String, Object>> detailRowsById = new LinkedHashMap<>();
        for (int index = 11; index <= 80; index += 1) {
            detailRowsById.put(
                String.valueOf(index),
                Map.of(
                    "id", index,
                    "name", "Song " + index,
                    "artists", List.of(Map.of("name", "Artist " + index)),
                    "album", Map.of("picUrl", "https://cover.example/" + index + ".png"),
                    "duration", 180000
                )
            );
        }

        @SuppressWarnings("unchecked")
        List<Object> merged = (List<Object>) ReflectionTestUtils.invokeMethod(
            provider,
            "mergeNeteasePlaylistTracks",
            playlistRaw,
            detailRowsById
        );

        Assertions.assertNotNull(merged);
        Assertions.assertEquals(80, merged.size());
        Assertions.assertEquals("1", String.valueOf(ReflectionTestUtils.getField(merged.get(0), "id")));
        Assertions.assertEquals("10", String.valueOf(ReflectionTestUtils.getField(merged.get(9), "id")));
        Assertions.assertEquals("11", String.valueOf(ReflectionTestUtils.getField(merged.get(10), "id")));
    }

    @SuppressWarnings("unchecked")
    private List<TuneHubMusicProvider.SearchTrackResult> parseRows(String platform, Map<String, Object> raw) {
        Object result = ReflectionTestUtils.invokeMethod(provider, "parseSearchTracks", platform, raw, 24);
        return result instanceof List<?> list ? (List<TuneHubMusicProvider.SearchTrackResult>) list : List.of();
    }
}
