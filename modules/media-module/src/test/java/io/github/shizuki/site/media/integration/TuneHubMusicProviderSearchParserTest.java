package io.github.shizuki.site.media.integration;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.site.media.config.TuneHubMusicProperties;
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

    @SuppressWarnings("unchecked")
    private List<TuneHubMusicProvider.SearchTrackResult> parseRows(String platform, Map<String, Object> raw) {
        Object result = ReflectionTestUtils.invokeMethod(provider, "parseSearchTracks", platform, raw, 24);
        return result instanceof List<?> list ? (List<TuneHubMusicProvider.SearchTrackResult>) list : List.of();
    }
}
