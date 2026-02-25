package io.github.shizuki.site.media.controller;

import io.github.shizuki.site.media.dto.MusicDefaultPlaylistBundleResponse;
import io.github.shizuki.site.media.dto.MusicPlaylistBundleResponse;
import io.github.shizuki.site.media.dto.MusicPlaylistSummaryResponse;
import io.github.shizuki.site.media.dto.MusicPlaylistProfileResponse;
import io.github.shizuki.site.media.dto.MusicTrackResponse;
import io.github.shizuki.site.media.service.MediaService;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(MusicController.class)
class MusicControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private MediaService mediaService;

    @Test
    void shouldListDefaultPlaylistBundleSuccessfully() throws Exception {
        MusicTrackResponse track = new MusicTrackResponse(
            "track-1",
            "local",
            "Rain",
            "Shizuki",
            "https://cdn.example.com/cover.png",
            "https://cdn.example.com/audio.mp3",
            "https://cdn.example.com/lyric.lrc",
            1,
            true
        );
        MusicDefaultPlaylistBundleResponse response = new MusicDefaultPlaylistBundleResponse(
            new MusicPlaylistProfileResponse(
                "default_public",
                "默认歌单",
                "全站共通默认歌单",
                "https://cdn.example.com/default-cover.png"
            ),
            List.of(track)
        );
        Mockito.when(mediaService.getDefaultPlaylistBundle()).thenReturn(response);

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/music/playlist/default/bundle"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.profile.playlist_code").value("default_public"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.profile.name").value("默认歌单"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.tracks[0].track_id").value("track-1"));
    }

    @Test
    void shouldGetPlaylistBundleByCodeSuccessfully() throws Exception {
        MusicTrackResponse track = new MusicTrackResponse(
            "track-2",
            "spotify",
            "Cloud",
            "Shizuki",
            "",
            "https://cdn.example.com/cloud.mp3",
            "",
            1,
            true
        );
        Mockito.when(mediaService.getMusicPlaylistBundle("default_public")).thenReturn(
            new MusicPlaylistBundleResponse(
                new MusicPlaylistSummaryResponse(
                    "default_public",
                    "默认歌单",
                    "",
                    "",
                    "DEFAULT",
                    0L,
                    true,
                    1
                ),
                List.of(track)
            )
        );

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/music/playlists/default_public/bundle"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.profile.playlist_code").value("default_public"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.tracks[0].track_id").value("track-2"));
    }
}
