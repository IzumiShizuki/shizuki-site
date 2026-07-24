package io.github.shizuki.site.media.integration;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withServerError;
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
    void shouldFillMissingAnonymousSongDetailsWithCookieAndPreserveOrder() {
        server.expect(requestTo(containsString("https://music.163.com/api/v6/playlist/detail")))
            .andExpect(request -> {
                Assertions.assertEquals(ACCOUNT_COOKIE, request.getHeaders().getFirst("Cookie"));
                Assertions.assertTrue(request.getURI().getQuery().contains("n=2"));
                Assertions.assertTrue(request.getURI().getQuery().contains("s=0"));
            })
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
                Assertions.assertEquals("ids=[\"202\",\"101\"]", decodedQuery(request.getURI().getRawQuery()));
            })
            .andRespond(withSuccess("""
                {
                  "code": 200,
                  "songs": [
                    {
                      "id": 202,
                      "name": "Anonymous detail",
                      "dt": 187999,
                      "ar": [{"name": "Artist B"}],
                      "al": {"name": "Album B", "picUrl": "https://cover.test/202.jpg"}
                    }
                  ]
                }
                """, MediaType.APPLICATION_JSON));

        server.expect(requestTo(containsString("https://music.163.com/api/song/detail")))
            .andExpect(request -> {
                Assertions.assertEquals(ACCOUNT_COOKIE, request.getHeaders().getFirst("Cookie"));
                Assertions.assertEquals("ids=[\"101\"]", decodedQuery(request.getURI().getRawQuery()));
            })
            .andRespond(withSuccess("""
                {
                  "code": 200,
                  "songs": [
                    {
                      "id": 101,
                      "name": "Account-only detail",
                      "dt": 245000,
                      "ar": [{"name": "Artist A"}],
                      "al": {"name": "Album A", "picUrl": "https://cover.test/101.jpg"}
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

    @Test
    void shouldContinueResolveWhenAnonymousAndAccountDetailRequestsFail() {
        server.expect(requestTo(containsString("https://music.163.com/api/song/detail")))
            .andExpect(request -> Assertions.assertFalse(request.getHeaders().containsKey("Cookie")))
            .andRespond(withServerError());
        server.expect(requestTo(containsString("https://music.163.com/api/song/detail")))
            .andExpect(request -> Assertions.assertEquals(
                ACCOUNT_COOKIE,
                request.getHeaders().getFirst("Cookie")
            ))
            .andRespond(withServerError());
        server.expect(requestTo(containsString("https://music.163.com/api/song/lyric")))
            .andExpect(request -> Assertions.assertEquals(
                ACCOUNT_COOKIE,
                request.getHeaders().getFirst("Cookie")
            ))
            .andRespond(withSuccess("""
                {
                  "code": 200,
                  "lrc": {"lyric": "[00:00.00]fallback lyric"}
                }
                """, MediaType.APPLICATION_JSON));

        NeteaseCookieProvider.ResolvedTrack resolved =
            provider.resolveTrack("private-404", ACCOUNT_COOKIE, true);

        Assertions.assertEquals("private-404", resolved.trackId());
        Assertions.assertEquals("", resolved.title());
        Assertions.assertEquals(
            "https://music.163.com/song/media/outer/url?id=private-404.mp3",
            resolved.audioUrl()
        );
        Assertions.assertEquals("[00:00.00]fallback lyric", resolved.lyricText());
        server.verify();
    }

    @Test
    void shouldRetainAnonymousDetailsWhenAccountFallbackFails() {
        expectPlaylistDetail("""
            {
              "code": 200,
              "playlist": {
                "trackIds": [{"id": 202}, {"id": 101}],
                "tracks": []
              }
            }
            """);
        server.expect(requestTo(containsString("https://music.163.com/api/song/detail")))
            .andExpect(request -> Assertions.assertFalse(request.getHeaders().containsKey("Cookie")))
            .andRespond(withSuccess("""
                {
                  "code": 200,
                  "songs": [
                    {
                      "id": 202,
                      "name": "Public detail",
                      "dt": 187000,
                      "ar": [{"name": "Artist B"}],
                      "al": {"name": "Album B"}
                    }
                  ]
                }
                """, MediaType.APPLICATION_JSON));
        server.expect(requestTo(containsString("https://music.163.com/api/song/detail")))
            .andExpect(request -> Assertions.assertEquals(
                ACCOUNT_COOKIE,
                request.getHeaders().getFirst("Cookie")
            ))
            .andRespond(withServerError());

        List<NeteaseCookieProvider.TrackSummary> tracks =
            provider.listPlaylistTracks("playlist-1", ACCOUNT_COOKIE, 2);

        Assertions.assertEquals(List.of("202"), tracks.stream()
            .map(NeteaseCookieProvider.TrackSummary::trackId)
            .toList());
        Assertions.assertEquals(187, tracks.get(0).durationSec());
        server.verify();
    }

    @Test
    void shouldDeduplicateTrackIdsBeforeApplyingLimit() {
        expectPlaylistDetail("""
            {
              "code": 200,
              "playlist": {
                "trackIds": [
                  {"id": 202},
                  {"id": 202},
                  {"id": 101},
                  {"id": 303}
                ],
                "tracks": []
              }
            }
            """);
        server.expect(requestTo(containsString("https://music.163.com/api/song/detail")))
            .andExpect(request -> {
                Assertions.assertFalse(request.getHeaders().containsKey("Cookie"));
                Assertions.assertEquals("ids=[\"202\",\"101\"]", decodedQuery(request.getURI().getRawQuery()));
            })
            .andRespond(withSuccess("""
                {
                  "code": 200,
                  "songs": [
                    {"id": 101, "name": "Track 101", "dt": 245000},
                    {"id": 202, "name": "Track 202", "dt": 187000}
                  ]
                }
                """, MediaType.APPLICATION_JSON));

        List<NeteaseCookieProvider.TrackSummary> tracks =
            provider.listPlaylistTracks("playlist-1", ACCOUNT_COOKIE, 2);

        Assertions.assertEquals(List.of("202", "101"), tracks.stream()
            .map(NeteaseCookieProvider.TrackSummary::trackId)
            .toList());
        server.verify();
    }

    private void expectPlaylistDetail(String body) {
        server.expect(requestTo(containsString("https://music.163.com/api/v6/playlist/detail")))
            .andExpect(request -> Assertions.assertEquals(
                ACCOUNT_COOKIE,
                request.getHeaders().getFirst("Cookie")
            ))
            .andRespond(withSuccess(body, MediaType.APPLICATION_JSON));
    }

    private String decodedQuery(String rawQuery) {
        return URLDecoder.decode(
            URLDecoder.decode(rawQuery, StandardCharsets.UTF_8),
            StandardCharsets.UTF_8
        );
    }
}
