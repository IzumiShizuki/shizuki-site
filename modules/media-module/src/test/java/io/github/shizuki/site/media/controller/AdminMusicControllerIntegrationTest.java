package io.github.shizuki.site.media.controller;

import io.github.shizuki.site.media.dto.MusicDefaultPlaylistBundleResponse;
import io.github.shizuki.site.media.dto.MusicPlaylistProfileResponse;
import io.github.shizuki.site.media.dto.MusicTrackResponse;
import io.github.shizuki.site.media.service.MediaService;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(AdminMusicController.class)
class AdminMusicControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private MediaService mediaService;

    @Test
    void shouldGetDefaultPlaylistBundleSuccessfully() throws Exception {
        MusicDefaultPlaylistBundleResponse response = new MusicDefaultPlaylistBundleResponse(
            new MusicPlaylistProfileResponse(
                "default_public",
                "默认歌单",
                "简介",
                "https://cdn.example.com/default-cover.png"
            ),
            List.of(
                new MusicTrackResponse(
                    "track-1",
                    "local",
                    "Rain",
                    "Shizuki",
                    "https://cdn.example.com/cover.png",
                    "https://cdn.example.com/audio.mp3",
                    "https://cdn.example.com/lyric.lrc",
                    1,
                    true
                )
            )
        );
        Mockito.when(mediaService.getAdminDefaultPlaylistBundle()).thenReturn(response);

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/admin/music/default-playlist/bundle"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.profile.playlist_code").value("default_public"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.tracks[0].title").value("Rain"));
    }

    @Test
    void shouldReplaceDefaultPlaylistBundleSuccessfully() throws Exception {
        MusicDefaultPlaylistBundleResponse response = new MusicDefaultPlaylistBundleResponse(
            new MusicPlaylistProfileResponse(
                "default_public",
                "学习歌单",
                "安静陪伴",
                "https://cdn.example.com/cover-new.png"
            ),
            List.of(
                new MusicTrackResponse(
                    "track-new-1",
                    "local",
                    "Night Walk",
                    "Izumi",
                    "https://cdn.example.com/night-cover.png",
                    "https://cdn.example.com/night.mp3",
                    "https://cdn.example.com/night.lrc",
                    1,
                    true
                )
            )
        );
        Mockito.when(mediaService.replaceAdminDefaultPlaylistBundle(ArgumentMatchers.any())).thenReturn(response);

        mockMvc.perform(MockMvcRequestBuilders.put("/api/v1/admin/music/default-playlist/bundle")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "profile": {
                        "playlist_code": "default_public",
                        "name": "学习歌单",
                        "description": "安静陪伴",
                        "cover": "https://cdn.example.com/cover-new.png"
                      },
                      "tracks": [
                        {
                          "track_id": "track-new-1",
                          "provider": "local",
                          "title": "Night Walk",
                          "artist": "Izumi",
                          "cover": "https://cdn.example.com/night-cover.png",
                          "audio": "https://cdn.example.com/night.mp3",
                          "lyric": "https://cdn.example.com/night.lrc",
                          "sort": 1,
                          "enabled": true
                        }
                      ]
                    }
                    """))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.profile.name").value("学习歌单"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.tracks[0].track_id").value("track-new-1"));
    }
}
