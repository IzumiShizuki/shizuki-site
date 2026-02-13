package io.github.shizuki.site.user.controller;

import io.github.shizuki.site.user.dto.MeResponse;
import io.github.shizuki.site.user.service.UserService;
import java.util.Map;
import java.util.Set;
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

@WebMvcTest(MeController.class)
class MeControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserService userService;

    @Test
    void shouldGetCurrentUserSuccessfully() throws Exception {
        Mockito.when(userService.currentUser()).thenReturn(
            new MeResponse(1L, "alice", Set.of("USER"), Set.of("media.asset.audit"))
        );

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/me"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.user_id").value(1))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.nickname").value("alice"));
    }

    @Test
    void shouldGetPreferencesSuccessfully() throws Exception {
        Mockito.when(userService.getPreference(ArgumentMatchers.anyLong()))
            .thenReturn(Map.of("active_role", 1001, "dock_mode", "minimal"));

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/me/preferences"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.active_role").value(1001))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.dock_mode").value("minimal"));
    }

    @Test
    void shouldUpdatePreferencesSuccessfully() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.put("/api/v1/me/preferences")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "preference_json": {
                        "active_role": 1001
                      }
                    }
                    """))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"));
    }
}
