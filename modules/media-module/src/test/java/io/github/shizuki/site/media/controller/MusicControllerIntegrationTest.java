package io.github.shizuki.site.media.controller;

import io.github.shizuki.site.media.response.MusicDefaultPlaylistBundleResponse;
import io.github.shizuki.site.media.response.MusicPlaylistBundleResponse;
import io.github.shizuki.site.media.response.MusicPlaylistSummaryResponse;
import io.github.shizuki.site.media.response.MusicPlaylistProfileResponse;
import io.github.shizuki.site.media.response.MusicTrackResponse;
import io.github.shizuki.site.media.response.MusicVoicePlayableTrackResponse;
import io.github.shizuki.site.media.response.MusicVoiceTagResponse;
import io.github.shizuki.site.media.response.MusicVoiceTrackNodeResponse;
import io.github.shizuki.site.media.response.MusicVoiceWorkBundleResponse;
import io.github.shizuki.site.media.response.MusicVoiceWorkDetailResponse;
import io.github.shizuki.site.media.response.MusicVoiceWorkItemResponse;
import io.github.shizuki.site.media.response.MusicVoiceWorksResponse;
import io.github.shizuki.site.media.service.MediaService;
import java.util.List;
import java.util.Map;
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

    @Test
    void shouldSearchVoiceWorksSuccessfully() throws Exception {
        MusicVoiceWorksResponse response = new MusicVoiceWorksResponse(
            List.of(
                new MusicVoiceWorkItemResponse(
                    1001L,
                    "夜色耳语",
                    "白噪研究社",
                    "https://cdn.example.com/voice-cover.png",
                    "2026-03-01",
                    3600,
                    12345,
                    88,
                    100,
                    4.8,
                    true,
                    "18+",
                    "RJ01001",
                    "https://www.dlsite.com/home/work/=/product_id/RJ01001.html",
                    List.of(new MusicVoiceTagResponse(1L, "耳搔")),
                    List.of("白樺玲奈")
                )
            ),
            1,
            24,
            true,
            List.of(new MusicVoiceTagResponse(1L, "耳搔"))
        );
        Mockito.when(mediaService.searchVoiceWorks("", 1, 24, "release", "desc", "1")).thenReturn(response);

        mockMvc.perform(
                MockMvcRequestBuilders.get("/api/v1/music/voice/works")
                    .queryParam("q", "")
                    .queryParam("page", "1")
                    .queryParam("limit", "24")
                    .queryParam("order", "release")
                    .queryParam("sort", "desc")
                    .queryParam("tag_ids", "1")
            )
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.items[0].work_id").value(1001))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.available_tags[0].tag_id").value(1));
    }

    @Test
    void shouldGetVoiceWorkBundleSuccessfully() throws Exception {
        MusicVoiceWorkBundleResponse response = new MusicVoiceWorkBundleResponse(
            new MusicVoiceWorkDetailResponse(
                1001L,
                "夜色耳语",
                "白噪研究社",
                "https://cdn.example.com/voice-cover.png",
                true,
                "18+",
                "2026-03-01",
                3600,
                12345,
                88,
                100,
                4.8,
                Map.of("rank", 1),
                List.of(new MusicVoiceTagResponse(1L, "耳搔")),
                List.of("白樺玲奈"),
                List.of(Map.of("lang", "zh-cn")),
                "RJ01001",
                "https://www.dlsite.com/home/work/=/product_id/RJ01001.html",
                "RJ01001",
                "简介",
                Map.of("source_type", "DLSITE")
            ),
            List.of(
                new MusicVoiceTrackNodeResponse(
                    "audio",
                    "track-1.mp3",
                    "1001/1",
                    "https://api.asmr-300.com/api/media/stream/1001/1",
                    "",
                    "",
                    120.0,
                    List.of()
                )
            ),
            List.of(
                new MusicVoicePlayableTrackResponse(
                    "1001|1001/1",
                    "1001/1",
                    "track-1.mp3",
                    "folder/track-1.mp3",
                    "白噪研究社",
                    "https://cdn.example.com/voice-cover.png",
                    "",
                    120,
                    "RJ01001",
                    "https://www.dlsite.com/home/work/=/product_id/RJ01001.html",
                    "夜色耳语"
                )
            )
        );
        Mockito.when(mediaService.getVoiceWorkBundle(1001L)).thenReturn(response);

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/music/voice/works/1001/bundle"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.work.work_id").value(1001))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.playable_tracks[0].track_id").value("1001|1001/1"));
    }
}
