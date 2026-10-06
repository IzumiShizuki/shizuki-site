package io.github.shizuki.site.media.controller;

import io.github.shizuki.site.media.service.PlatformMusicLibraryService;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(PlatformMusicLibraryController.class)
class PlatformMusicLibraryControllerIntegrationTest {
    @Autowired private MockMvc mvc;
    @MockBean private PlatformMusicLibraryService service;

    @Test
    void shouldPassExplicitUnlikeToAccountService() throws Exception {
        Mockito.when(service.setTrackLiked("netease", "42", false)).thenReturn(Map.of("provider", "netease", "trackId", "42", "liked", false));
        mvc.perform(MockMvcRequestBuilders.put("/api/v1/me/music/source-accounts/netease/likes/42")
            .contentType(MediaType.APPLICATION_JSON).content("{\"liked\":false}"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.liked").value(false));
        Mockito.verify(service).setTrackLiked("netease", "42", false);
    }

    @Test
    void shouldRejectMissingDesiredStateWithoutCallingPlatform() throws Exception {
        mvc.perform(MockMvcRequestBuilders.put("/api/v1/me/music/source-accounts/netease/likes/42")
            .contentType(MediaType.APPLICATION_JSON).content("{}"))
            .andExpect(MockMvcResultMatchers.status().isBadRequest());
        Mockito.verifyNoInteractions(service);
    }

    @Test
    void shouldValidateProgramDesiredStateAndRequireACollectionSource() throws Exception {
        mvc.perform(MockMvcRequestBuilders.put("/api/v1/me/music/source-accounts/netease/podcast-likes/777")
            .contentType(MediaType.APPLICATION_JSON).content("{}"))
            .andExpect(MockMvcResultMatchers.status().isBadRequest());
        mvc.perform(MockMvcRequestBuilders.get("/api/v1/me/music/source-accounts/netease/podcasts"))
            .andExpect(MockMvcResultMatchers.status().isBadRequest());
        Mockito.verifyNoInteractions(service);
        Mockito.when(service.setProgramLiked("netease", "777", false)).thenReturn(Map.of("programId", "777", "liked", false));
        mvc.perform(MockMvcRequestBuilders.put("/api/v1/me/music/source-accounts/netease/podcast-likes/777")
            .contentType(MediaType.APPLICATION_JSON).content("{\"liked\":false}"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.programId").value("777"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.liked").value(false));
        Mockito.verify(service).setProgramLiked("netease", "777", false);
    }

    @Test
    void shouldReadCloudLikesAndSearchPodcasts() throws Exception {
        Mockito.when(service.likedTrackIds("netease")).thenReturn(List.of("42"));
        Mockito.when(service.podcasts("声音")).thenReturn(List.of());
        mvc.perform(MockMvcRequestBuilders.get("/api/v1/me/music/source-accounts/netease/likes"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.data[0]").value("42"));
        mvc.perform(MockMvcRequestBuilders.get("/api/v1/music/discovery/podcasts").param("q", "声音"))
            .andExpect(MockMvcResultMatchers.status().isOk());
        Mockito.verify(service).podcasts("声音");
    }
}
