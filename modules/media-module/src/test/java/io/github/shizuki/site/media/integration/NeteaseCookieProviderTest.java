package io.github.shizuki.site.media.integration;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;

import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.client.MockRestServiceServer;
import org.springframework.web.client.RestClient;

class NeteaseCookieProviderTest {

    private static final String ACCOUNT_COOKIE = "MUSIC_U=account-secret; __csrf=csrf-token";

    private MockRestServiceServer server;
    private NeteaseCookieProvider provider;

    @BeforeEach
    void setUp() {
        RestClient.Builder builder = RestClient.builder();
        server = MockRestServiceServer.bindTo(builder).build();
        provider = new NeteaseCookieProvider(builder.build());
    }

    @Test
    void shouldKeepCookieOnPlaylistDetailButLoadOnlyLimitedSongDetailsAnonymously() {
        server.expect(requestTo(containsString("https://music.163.com/api/v6/playlist/detail")))
            .andExpect(request -> Assertions.assertEquals(
                ACCOUNT_COOKIE,
                request.getHeaders().getFirst("Cookie")
            ))
            .andRespond(withSuccess("""
                {
                  "code": 200,
                  "playlist": {
                    "trackIds": [
                      {"id": 202},
                      {"id": 101},
                      {"id": 303}
                    ],
                    "tracks": []
                  }
                }
                """, MediaType.APPLICATION_JSON));

        server.expect(requestTo(containsString("https://music.163.com/api/song/detail")))
            .andExpect(request -> {
                Assertions.assertFalse(request.getHeaders().containsKey("Cookie"));
                String decodedQuery = URLDecoder.decode(
                    URLDecoder.decode(request.getURI().getRawQuery(), StandardCharsets.UTF_8),
                    StandardCharsets.UTF_8
                );
                Assertions.assertEquals("ids=[\"202\",\"101\"]", decodedQuery);
            })
            .andRespond(withSuccess("""
                {
                  "code": 200,
                  "songs": [
                    {
                      "id": 101,
                      "name": "First from response",
                      "dt": 245000,
                      "ar": [{"name": "Artist A"}],
                      "al": {"name": "Album A", "picUrl": "https://cover.test/101.jpg"}
                    },
                    {
                      "id": 202,
                      "name": "Second from response",
                      "dt": 187999,
                      "ar": [{"name": "Artist B"}],
                      "al": {"name": "Album B", "picUrl": "https://cover.test/202.jpg"}
                    }
                  ]
                }
                """, MediaType.APPLICATION_JSON));

        List<NeteaseCookieProvider.TrackSummary> tracks =
            provider.listPlaylistTracks("playlist-1", ACCOUNT_COOKIE, 2);

        Assertions.assertEquals(List.of("202", "101"), tracks.stream()
            .map(NeteaseCookieProvider.TrackSummary::trackId)
            .toList());
        Assertions.assertEquals(List.of(187, 245), tracks.stream()
            .map(NeteaseCookieProvider.TrackSummary::durationSec)
            .toList());
        server.verify();
    }
}
