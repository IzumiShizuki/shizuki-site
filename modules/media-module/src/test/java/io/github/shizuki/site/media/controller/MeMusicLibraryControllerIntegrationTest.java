package io.github.shizuki.site.media.controller;

import io.github.shizuki.site.media.dto.MeMusicLibrarySidebarResponse;
import io.github.shizuki.site.media.dto.MusicPlaylistSummaryResponse;
import io.github.shizuki.site.media.service.MediaService;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(MeMusicLibraryController.class)
class MeMusicLibraryControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private MediaService mediaService;

    @Test
    void shouldGetSidebarSuccessfully() throws Exception {
        MusicPlaylistSummaryResponse summary = new MusicPlaylistSummaryResponse(
            "default_public",
            "默认歌单",
            "简介",
            "https://cdn.example.com/cover.png",
            "DEFAULT",
            0L,
            true,
            3
        );
        Mockito.when(mediaService.getMyMusicLibrarySidebar()).thenReturn(
            new MeMusicLibrarySidebarResponse(summary, summary, List.of(), List.of())
        );

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/me/music/library/sidebar"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.default_playlist.playlist_code").value("default_public"));
    }

    @Test
    void shouldCreateMyPlaylistSuccessfully() throws Exception {
        Mockito.when(mediaService.createMyMusicPlaylist(Mockito.any())).thenReturn(
            new MusicPlaylistSummaryResponse(
                "upl_1_xxxx",
                "新歌单",
                "",
                "",
                "CUSTOM",
                1L,
                false,
                0
            )
        );

        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/me/music/playlists")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "name": "新歌单",
                      "description": "test"
                    }
                    """))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.playlist_code").value("upl_1_xxxx"));
    }
}
