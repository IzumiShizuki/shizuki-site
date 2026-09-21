package io.github.shizuki.site.media.integration;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withServerError;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;

import io.github.shizuki.common.core.error.BusinessException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.client.ExpectedCount;
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
                assertEncodedOnce(request.getURI().getRawQuery(), "ids=[\"202\",\"101\"]");
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
                assertEncodedOnce(request.getURI().getRawQuery(), "ids=[\"101\"]");
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
    void shouldRejectTrialFallbackWhenAccountStreamCannotBeResolved() {
        server.expect(requestTo(containsString("https://music.163.com/api/song/detail")))
            .andExpect(request -> Assertions.assertFalse(request.getHeaders().containsKey("Cookie")))
            .andRespond(withServerError());
        server.expect(requestTo(containsString("https://music.163.com/api/song/detail")))
            .andExpect(request -> Assertions.assertEquals(
                ACCOUNT_COOKIE,
                request.getHeaders().getFirst("Cookie")
            ))
            .andRespond(withServerError());
        server.expect(requestTo(containsString("https://music.163.com/api/song/url/v1")))
            .andExpect(request -> Assertions.assertEquals(
                ACCOUNT_COOKIE,
                request.getHeaders().getFirst("Cookie")
            ))
            .andRespond(withServerError());
        BusinessException exception = Assertions.assertThrows(
            BusinessException.class,
            () -> provider.resolveTrack("private-404", ACCOUNT_COOKIE, true)
        );

        Assertions.assertEquals("Netease account did not return an authorized audio URL", exception.getMessage());
        server.verify();
    }

    @Test
    void shouldUseCookieAuthorizedMemberStreamAndPreserveTranslatedLyrics() {
        server.expect(requestTo(containsString("https://music.163.com/api/song/detail")))
            .andExpect(request -> Assertions.assertFalse(request.getHeaders().containsKey("Cookie")))
            .andRespond(withSuccess("""
                {
                  "code": 200,
                  "songs": [
                    {
                      "id": 101,
                      "name": "Member track",
                      "ar": [{"name": "Singer"}],
                      "al": {"picUrl": "https://cover.test/member.jpg"}
                    }
                  ]
                }
                """, MediaType.APPLICATION_JSON));
        server.expect(requestTo(containsString("https://music.163.com/api/song/url/v1")))
            .andExpect(request -> {
                Assertions.assertEquals(ACCOUNT_COOKIE, request.getHeaders().getFirst("Cookie"));
                Assertions.assertTrue(request.getURI().getQuery().contains("level=exhigh"));
            })
            .andRespond(withSuccess("""
                {
                  "code": 200,
                  "data": [{"id": 101, "url": "https://stream.test/member-exhigh.mp3"}]
                }
                """, MediaType.APPLICATION_JSON));
        server.expect(requestTo(containsString("https://music.163.com/api/song/lyric")))
            .andExpect(request -> Assertions.assertEquals(ACCOUNT_COOKIE, request.getHeaders().getFirst("Cookie")))
            .andRespond(withSuccess("""
                {
                  "code": 200,
                  "lrc": {"lyric": "[00:01.00]original"},
                  "tlyric": {"lyric": "[00:01.00]translation"},
                  "romalrc": {"lyric": "[00:01.00]pronunciation"}
                }
                """, MediaType.APPLICATION_JSON));

        NeteaseCookieProvider.ResolvedTrack resolved = provider.resolveTrack("101", ACCOUNT_COOKIE, true);

        Assertions.assertEquals("https://stream.test/member-exhigh.mp3", resolved.audioUrl());
        Assertions.assertEquals("[00:01.00]original", resolved.lyricText());
        Assertions.assertEquals("[00:01.00]translation", resolved.translationLyricText());
        Assertions.assertEquals("[00:01.00]pronunciation", resolved.furiganaLyricText());
        server.verify();
    }

    @Test
    void shouldPreferTheSameNcmMemberStreamUsedByFolia() {
        RestClient.Builder builder = RestClient.builder();
        server = MockRestServiceServer.bindTo(builder).build();
        provider = new NeteaseCookieProvider(builder.build(), "https://ncm.test");

        server.expect(requestTo(containsString("https://music.163.com/api/song/detail")))
            .andRespond(withSuccess("""
                {
                  "code": 200,
                  "songs": [{"id": 101, "name": "Member track", "dt": 245000}]
                }
                """, MediaType.APPLICATION_JSON));
        server.expect(requestTo(containsString("https://ncm.test/song/url/v1")))
            .andExpect(request -> {
                assertEncodedOnce(
                    request.getURI().getRawQuery(),
                    "id=101&level=exhigh&randomCNIP=true&https=true&cookie=" + ACCOUNT_COOKIE
                );
                Assertions.assertFalse(request.getHeaders().containsKey("Cookie"));
            })
            .andRespond(withSuccess("""
                {
                  "code": 200,
                  "data": [{
                    "id": 101,
                    "url": "https://stream.test/folia-member.mp3",
                    "freeTrialInfo": null,
                    "freeTimeTrialPrivilege": {
                      "remainTime": 0,
                      "resConsumable": false,
                      "type": 0,
                      "userConsumable": false
                    },
                    "time": 245000,
                    "size": 3920000
                  }]
                }
                """, MediaType.APPLICATION_JSON));

        NeteaseCookieProvider.ResolvedTrack resolved = provider.resolveTrack("101", ACCOUNT_COOKIE, false);

        Assertions.assertEquals("https://stream.test/folia-member.mp3", resolved.audioUrl());
        Assertions.assertEquals(245000L, resolved.durationMs());
        server.verify();
    }

    @Test
    void shouldAcceptFullLengthMemberStreamWhenTrialPrivilegeIsAlsoPresent() {
        RestClient.Builder builder = RestClient.builder();
        server = MockRestServiceServer.bindTo(builder).build();
        provider = new NeteaseCookieProvider(builder.build(), "https://ncm.test");

        server.expect(requestTo(containsString("https://music.163.com/api/song/detail")))
            .andRespond(withSuccess("""
                {
                  "code": 200,
                  "songs": [{"id": 101, "name": "Member track", "dt": 245000}]
                }
                """, MediaType.APPLICATION_JSON));
        server.expect(requestTo(containsString("https://ncm.test/song/url/v1")))
            .andExpect(request -> assertEncodedOnce(
                request.getURI().getRawQuery(),
                "id=101&level=exhigh&randomCNIP=true&https=true&cookie=" + ACCOUNT_COOKIE
            ))
            .andRespond(withSuccess("""
                {
                  "code": 200,
                  "data": [{
                    "id": 101,
                    "url": "https://stream.test/full-member.mp3",
                    "freeTrialInfo": null,
                    "freeTimeTrialPrivilege": {
                      "remainTime": 0,
                      "resConsumable": true,
                      "type": 1,
                      "userConsumable": false
                    },
                    "time": 245000,
                    "size": 3920000
                  }]
                }
                """, MediaType.APPLICATION_JSON));

        NeteaseCookieProvider.ResolvedTrack resolved = provider.resolveTrack("101", ACCOUNT_COOKIE, false);

        Assertions.assertEquals("https://stream.test/full-member.mp3", resolved.audioUrl());
        Assertions.assertEquals(245000L, resolved.durationMs());
        server.verify();
    }

    @Test
    void shouldRetryTransientTrialResponseAndReturnTheFullTargetTrack() {
        RestClient.Builder builder = RestClient.builder();
        server = MockRestServiceServer.bindTo(builder).build();
        provider = new NeteaseCookieProvider(builder.build(), "https://ncm.test");

        server.expect(requestTo(containsString("https://music.163.com/api/song/detail")))
            .andRespond(withSuccess("""
                {
                  "code": 200,
                  "songs": [{
                    "id": 1880877106,
                    "name": "ALMIGHTY～仮面の約束",
                    "duration": 247766,
                    "artists": [{"name": "KAMEN RIDER GIRLS"}],
                    "album": {"name": "仮面ライダーリバイス", "picUrl": "https://cover.test/almighty.jpg"}
                  }]
                }
                """, MediaType.APPLICATION_JSON));
        server.expect(requestTo(containsString("https://ncm.test/song/url/v1")))
            .andExpect(request -> assertEncodedOnce(
                request.getURI().getRawQuery(),
                "id=1880877106&level=exhigh&randomCNIP=true&https=true&cookie=" + ACCOUNT_COOKIE
            ))
            .andRespond(withSuccess("""
                {
                  "code": 200,
                  "data": [{
                    "id": 1880877106,
                    "url": "https://stream.test/transient-trial.mp3",
                    "freeTrialInfo": {"start": 0},
                    "time": 30040,
                    "size": 481115
                  }]
                }
                """, MediaType.APPLICATION_JSON));
        server.expect(requestTo(containsString("https://ncm.test/song/url/v1")))
            .andExpect(request -> {
                String rawQuery = request.getURI().getRawQuery();
                Assertions.assertFalse(rawQuery.contains("%25"), "query parameters must not be encoded twice");
                String decodedQuery = URLDecoder.decode(rawQuery, StandardCharsets.UTF_8);
                String prefix = "id=1880877106&level=exhigh&randomCNIP=true&https=true&timestamp=";
                Assertions.assertTrue(decodedQuery.startsWith(prefix));
                Assertions.assertTrue(decodedQuery.endsWith("&cookie=" + ACCOUNT_COOKIE));
                String timestamp = decodedQuery.substring(
                    prefix.length(),
                    decodedQuery.length() - ("&cookie=" + ACCOUNT_COOKIE).length()
                );
                Assertions.assertDoesNotThrow(() -> Long.parseLong(timestamp));
            })
            .andRespond(withSuccess("""
                {
                  "code": 200,
                  "data": [{
                    "id": 1880877106,
                    "url": "https://stream.test/almighty-full.mp3",
                    "freeTrialInfo": null,
                    "freeTimeTrialPrivilege": {"resConsumable": false, "userConsumable": false},
                    "time": 247766,
                    "size": 9912991
                  }]
                }
                """, MediaType.APPLICATION_JSON));

        NeteaseCookieProvider.ResolvedTrack resolved = provider.resolveTrack("1880877106", ACCOUNT_COOKIE, false);

        Assertions.assertEquals("https://stream.test/almighty-full.mp3", resolved.audioUrl());
        Assertions.assertEquals(247766L, resolved.durationMs());
        Assertions.assertEquals("KAMEN RIDER GIRLS", resolved.artist());
        Assertions.assertEquals("https://cover.test/almighty.jpg", resolved.cover());
        server.verify();
    }

    @Test
    void shouldRejectNcmTrialStreamAndUseTheFullCookieAuthorizedFallback() {
        RestClient.Builder builder = RestClient.builder();
        server = MockRestServiceServer.bindTo(builder).build();
        provider = new NeteaseCookieProvider(builder.build(), "https://ncm.test");

        server.expect(requestTo(containsString("https://music.163.com/api/song/detail")))
            .andRespond(withSuccess("""
                {
                  "code": 200,
                  "songs": [{"id": 1880877106, "name": "Full member track", "dt": 245000}]
                }
                """, MediaType.APPLICATION_JSON));
        server.expect(ExpectedCount.times(3), requestTo(containsString("https://ncm.test/song/url/v1")))
            .andExpect(request -> {
                Assertions.assertTrue(request.getURI().getQuery().contains("cookie="));
                Assertions.assertFalse(request.getHeaders().containsKey("Cookie"));
            })
            .andRespond(withSuccess("""
                {
                  "code": 200,
                  "data": [{
                    "id": 1880877106,
                    "url": "https://stream.test/trial.mp3",
                    "freeTrialInfo": {"start": 0},
                    "freeTimeTrialPrivilege": {"resConsumable": true},
                    "time": 30040,
                    "size": 481115
                  }]
                }
                """, MediaType.APPLICATION_JSON));
        server.expect(requestTo(containsString("https://ncm.test/song/url")))
            .andRespond(withSuccess("""
                {"code": 200, "data": [{"id": 1880877106, "url": null}]}
                """, MediaType.APPLICATION_JSON));
        server.expect(requestTo(containsString("https://music.163.com/api/song/url/v1")))
            .andExpect(request -> Assertions.assertEquals(ACCOUNT_COOKIE, request.getHeaders().getFirst("Cookie")))
            .andRespond(withSuccess("""
                {
                  "code": 200,
                  "data": [{
                    "id": 1880877106,
                    "url": "https://stream.test/full-member.mp3",
                    "freeTrialInfo": null,
                    "freeTimeTrialPrivilege": null,
                    "time": 245000,
                    "size": 3920000
                  }]
                }
                """, MediaType.APPLICATION_JSON));

        NeteaseCookieProvider.ResolvedTrack resolved = provider.resolveTrack("1880877106", ACCOUNT_COOKIE, false);

        Assertions.assertEquals("https://stream.test/full-member.mp3", resolved.audioUrl());
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
    void shouldRetryTransientNeteaseDetailCodeFailuresBeforeImportingTracks() {
        expectPlaylistDetail("""
            {
              "code": 200,
              "playlist": {
                "trackIds": [{"id": 101}],
                "tracks": []
              }
            }
            """);
        server.expect(requestTo(containsString("https://music.163.com/api/song/detail")))
            .andExpect(request -> Assertions.assertFalse(request.getHeaders().containsKey("Cookie")))
            .andRespond(withSuccess("""
                {"code": -460}
                """, MediaType.APPLICATION_JSON));
        server.expect(requestTo(containsString("https://music.163.com/api/song/detail")))
            .andExpect(request -> Assertions.assertFalse(request.getHeaders().containsKey("Cookie")))
            .andRespond(withSuccess("""
                {
                  "code": 200,
                  "songs": [
                    {"id": 101, "name": "Retried track", "dt": 245000}
                  ]
                }
                """, MediaType.APPLICATION_JSON));

        List<NeteaseCookieProvider.TrackSummary> tracks =
            provider.listPlaylistTracks("playlist-1", ACCOUNT_COOKIE, 1);

        Assertions.assertEquals(List.of("101"), tracks.stream()
            .map(NeteaseCookieProvider.TrackSummary::trackId)
            .toList());
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
                assertEncodedOnce(request.getURI().getRawQuery(), "ids=[\"202\",\"101\"]");
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

    private void assertEncodedOnce(String rawQuery, String expectedDecodedQuery) {
        Assertions.assertFalse(rawQuery.contains("%25"), "query parameters must not be encoded twice");
        Assertions.assertEquals(
            expectedDecodedQuery,
            URLDecoder.decode(rawQuery, StandardCharsets.UTF_8)
        );
    }
}
