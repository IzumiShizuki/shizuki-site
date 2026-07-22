package io.github.shizuki.site.media.integration;

import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.site.media.config.MetingMusicProperties;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.client.MockRestServiceServer;
import org.springframework.web.client.RestClient;

class MetingMusicProviderTest {

    private MockRestServiceServer server;
    private MetingMusicProvider provider;

    @BeforeEach
    void setUp() {
        MetingMusicProperties properties = new MetingMusicProperties();
        properties.setBaseUrl("http://meting.test");
        RestClient.Builder builder = RestClient.builder();
        server = MockRestServiceServer.bindTo(builder).build();
        provider = new MetingMusicProvider(properties, builder.build(), new ObjectMapper());
    }

    @Test
    void shouldMapNormalizedDurationFromSearchRows() {
        expectSearchResponse("netease", """
            {
              "tracks": [
                {
                  "trackId": "28712251",
                  "provider": "netease",
                  "title": "WHITE ALBUM",
                  "artist": "平野綾",
                  "album": "WHITE ALBUM",
                  "cover": "https://cover.example/white-album.png",
                  "durationSec": 275
                }
              ]
            }
            """);

        List<MetingMusicProvider.SearchTrackResult> tracks =
            provider.searchTracks("system-key", "netease", "白色相簿", 1, 24);

        Assertions.assertEquals(1, tracks.size());
        Assertions.assertEquals(275, tracks.get(0).durationSec());
        server.verify();
    }

    @Test
    void shouldBuildVirtualSearchPlaylistFromExistingPreviewWithoutInventingTotalCount() {
        List<MetingMusicProvider.VirtualPlaylistSummary> playlists =
            provider.buildSearchPlaylists(
                "qq",
                "夜曲",
                List.of(
                    new MetingMusicProvider.SearchTrackResult(
                        "0039MnYb0qxYhV",
                        "qq",
                        "夜曲",
                        "周杰伦",
                        "十一月的萧邦",
                        "https://cover.example/nocturne.png",
                        226
                    ),
                    new MetingMusicProvider.SearchTrackResult(
                        "second-track",
                        "qq",
                        "夜曲 Live",
                        "周杰伦",
                        "Live",
                        "https://cover.example/nocturne-live.png",
                        240
                    )
                )
            );

        Assertions.assertEquals(1, playlists.size());
        Assertions.assertEquals("https://cover.example/nocturne.png", playlists.get(0).cover());
        Assertions.assertNull(playlists.get(0).trackCount());
        Assertions.assertEquals("search", playlists.get(0).sourceType());
        server.verify();
    }

    private void expectSearchResponse(String providerCode, String body) {
        server.expect(requestTo(allOf(
                containsString("http://meting.test/v1/search?"),
                containsString("provider=" + providerCode),
                containsString("q="),
                containsString("page=1"),
                containsString("limit=24")
            )))
            .andRespond(withSuccess(body, MediaType.APPLICATION_JSON));
    }
}
