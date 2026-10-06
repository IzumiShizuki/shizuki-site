package io.github.shizuki.site.media.integration;

import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.method;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.site.media.response.MeMusicLibrarySidebarResponse;
import io.github.shizuki.site.media.response.MusicPlaylistBundleResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.test.web.client.MockRestServiceServer;
import org.springframework.web.client.RestClient;

class NeteasePlatformLibraryTest {
    private MockRestServiceServer server;
    private NeteaseCookieProvider provider;
    private static final String COOKIE = "MUSIC_U=test-secret";

    @BeforeEach
    void setUp() {
        RestClient.Builder builder = RestClient.builder();
        server = MockRestServiceServer.bindTo(builder).build();
        provider = new NeteaseCookieProvider(builder.build(), "http://ncm.test");
    }

    private void expect(String path, String json) {
        server.expect(requestTo("http://ncm.test" + path)).andExpect(method(HttpMethod.POST))
            .andExpect(content().json("{\"cookie\":\"" + COOKIE + "\"}", false))
            .andRespond(withSuccess(json, MediaType.APPLICATION_JSON));
    }

    @Test
    void shouldSendUnlikeAsStringAndKeepCookieOutOfUrl() {
        server.expect(requestTo("http://ncm.test/like")).andExpect(method(HttpMethod.POST))
            .andExpect(content().json("{\"id\":\"42\",\"like\":\"false\",\"cookie\":\"MUSIC_U=test-secret\"}", false))
            .andRespond(withSuccess("{\"code\":200}", MediaType.APPLICATION_JSON));
        provider.setTrackLiked("42", false, COOKIE);
        server.verify();
    }

    @Test
    void shouldRejectExpiredSessionAndMalformedAcknowledgement() {
        expect("/like", "{\"code\":301}");
        expect("/like", "{}");
        Assertions.assertThrows(BusinessException.class, () -> provider.setTrackLiked("42", true, COOKIE));
        Assertions.assertThrows(BusinessException.class, () -> provider.setTrackLiked("42", false, COOKIE));
        server.verify();
    }

    @Test
    void shouldReadActualLikedIdsUsingAccountIdentity() {
        expect("/user/account", "{\"code\":200,\"profile\":{\"userId\":12}}");
        server.expect(requestTo("http://ncm.test/likelist"))
            .andExpect(content().json("{\"uid\":12,\"cookie\":\"MUSIC_U=test-secret\"}", false))
            .andRespond(withSuccess("{\"code\":200,\"ids\":[42,55,42]}", MediaType.APPLICATION_JSON));
        Assertions.assertEquals(java.util.List.of("42", "55"), provider.likedTrackIds(COOKIE));
        server.verify();
    }

    @Test
    void shouldSeparateOwnedLikedCreatedAndSubscribedPlaylistsWithoutDefault() {
        expect("/user/account", "{\"code\":200,\"profile\":{\"userId\":12}}");
        expect("/user/playlist", """
            {"code":200,"playlist":[
              {"id":1,"name":"喜欢","specialType":5,"creator":{"userId":12},"trackCount":50},
              {"id":2,"name":"自建","creator":{"userId":12}},
              {"id":3,"name":"订阅","specialType":5,"creator":{"userId":99}}
            ]}
            """);
        MeMusicLibrarySidebarResponse result = provider.accountLibrary(COOKIE, 7L);
        Assertions.assertNull(result.defaultPlaylist());
        Assertions.assertEquals("account_netease_1", result.likedPlaylist().playlistCode());
        Assertions.assertEquals("account_netease_2", result.createdPlaylists().get(0).playlistCode());
        Assertions.assertEquals("account_netease_3", result.collectedPlaylists().get(0).playlistCode());
        server.verify();
    }

    @Test
    void shouldMapPodcastProgramToPlayableMainSongIdentity() {
        expect("/dj/detail", "{\"code\":200,\"data\":{\"id\":90,\"name\":\"声音\"}}");
        expect("/dj/program", """
            {"code":200,"programs":[{"id":777,"name":"节目标题","mainSong":{"id":42,"name":"主音轨","duration":123000,"artists":[{"name":"主播"}]}}],"more":false}
            """);
        MusicPlaylistBundleResponse result = provider.podcastBundle("90", COOKIE);
        Assertions.assertEquals("podcast_netease_90", result.profile().playlistCode());
        Assertions.assertEquals("42", result.tracks().get(0).trackId());
        Assertions.assertEquals("节目标题", result.tracks().get(0).title());
        Assertions.assertEquals("777", result.tracks().get(0).metadata().get("programId"));
        server.verify();
    }

    @Test
    void shouldLoadCompleteCurrentAccountPlaylistInsteadOfImportedCopy() {
        expect("/playlist/detail", "{\"code\":200,\"playlist\":{\"id\":5,\"name\":\"实时歌单\",\"trackCount\":2}}");
        expect("/playlist/track/all", "{\"code\":200,\"songs\":[{\"id\":42},{\"id\":43}]}");
        MusicPlaylistBundleResponse result = provider.accountPlaylistBundle("5", COOKIE, 7L);
        Assertions.assertEquals("account_netease_5", result.profile().playlistCode());
        Assertions.assertEquals(java.util.List.of("42", "43"), result.tracks().stream().map(track -> track.trackId()).toList());
        server.verify();
    }

    @Test
    void shouldReturnRealPodcastRecommendationsAndFmTracks() {
        expect("/dj/recommend", "{\"code\":200,\"djRadios\":[{\"id\":90,\"name\":\"声音\"}]}");
        expect("/personal_fm", "{\"code\":200,\"data\":[{\"id\":42,\"name\":\"FM song\"}]}");
        Assertions.assertEquals("podcast_netease_90", provider.recommendedPodcasts(COOKIE, "").get(0).playlistCode());
        Assertions.assertEquals("42", provider.personalFmTracks(COOKIE).get(0).trackId());
        server.verify();
    }

    @Test
    void shouldSearchPodcastTypeAndRejectFalseEmptySuccess() {
        server.expect(requestTo("http://ncm.test/search"))
            .andExpect(content().json("{\"keywords\":\"声音\",\"type\":1009}", false))
            .andRespond(withSuccess("{\"code\":200,\"result\":{\"djRadios\":[{\"id\":90}]}}", MediaType.APPLICATION_JSON));
        expect("/dj/recommend", "{\"code\":200}");
        Assertions.assertEquals(1, provider.recommendedPodcasts(COOKIE, "声音").size());
        Assertions.assertThrows(BusinessException.class, () -> provider.recommendedPodcasts(COOKIE, ""));
        server.verify();
    }
}
