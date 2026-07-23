package io.github.shizuki.site.media.integration;

import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withServerError;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.site.media.config.MetingMusicProperties;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.http.MediaType;
import org.springframework.test.web.client.MockRestServiceServer;
import org.springframework.web.client.RestClient;

class MetingMusicProviderTest {

    private MockRestServiceServer server;
    private MetingMusicProvider provider;
    private MetingMusicProperties properties;

    @BeforeEach
    void setUp() {
        properties = new MetingMusicProperties();
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
    void shouldHydrateConfiguredToplistCoverFromPlaylistSummary() {
        properties.setDefaultPlaylistIds(Map.of("netease", "3778678"));
        server.expect(requestTo(allOf(
                containsString("http://meting.test/v1/playlist?"),
                containsString("provider=netease"),
                containsString("playlist_id=3778678")
            )))
            .andRespond(withSuccess("""
                {
                  "name": "云音乐热歌榜",
                  "description": "每日更新",
                  "cover": "https://cover.example/netease-hot.png",
                  "trackCount": 200
                }
                """, MediaType.APPLICATION_JSON));

        List<MetingMusicProvider.VirtualPlaylistSummary> playlists =
            provider.listToplistPlaylists("system-key", List.of("netease"), 1);

        Assertions.assertEquals(1, playlists.size());
        Assertions.assertEquals("playlist", playlists.get(0).sourceType());
        Assertions.assertEquals("https://cover.example/netease-hot.png", playlists.get(0).cover());
        Assertions.assertEquals(200, playlists.get(0).trackCount());
        server.verify();
    }

    @Test
    void shouldUseFirstSearchTrackCoverForSearchToplist() {
        server.expect(requestTo(allOf(
                containsString("http://meting.test/v1/search?"),
                containsString("provider=kuwo"),
                containsString("q="),
                containsString("page=1"),
                containsString("limit=1")
            )))
            .andRespond(withSuccess("""
                {
                  "tracks": [
                    {
                      "trackId": "search-track-1",
                      "provider": "kuwo",
                      "title": "热门歌曲",
                      "artist": "歌手",
                      "cover": "https://cover.example/kuwo-hot.png",
                      "durationSec": 240
                    }
                  ]
                }
                """, MediaType.APPLICATION_JSON));

        List<MetingMusicProvider.VirtualPlaylistSummary> playlists =
            provider.listToplistPlaylists("system-key", List.of("kuwo"), 1);

        Assertions.assertEquals(1, playlists.size());
        Assertions.assertEquals("search", playlists.get(0).sourceType());
        Assertions.assertEquals("https://cover.example/kuwo-hot.png", playlists.get(0).cover());
        server.verify();
    }

    @Test
    void shouldKeepSearchToplistWhenCoverLookupFails() {
        server.expect(requestTo(allOf(
                containsString("http://meting.test/v1/search?"),
                containsString("provider=qq"),
                containsString("limit=1")
            )))
            .andRespond(withServerError());

        List<MetingMusicProvider.VirtualPlaylistSummary> playlists =
            provider.listToplistPlaylists("system-key", List.of("qq"), 1);

        Assertions.assertEquals(1, playlists.size());
        Assertions.assertEquals("search", playlists.get(0).sourceType());
        Assertions.assertEquals("", playlists.get(0).cover());
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

    @Test
    void shouldUseDependencyInjectionConstructorWhenSpringCreatesBean() {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext()) {
            context.registerBean(MetingMusicProperties.class);
            context.registerBean(RestClient.Builder.class, () -> RestClient.builder());
            context.registerBean(ObjectMapper.class);
            context.register(MetingMusicProvider.class);
            context.refresh();

            Assertions.assertNotNull(context.getBean(MetingMusicProvider.class));
        }
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
