package io.github.shizuki.site.user.controller;

import io.github.shizuki.site.user.dto.AdminGroupOptionResponse;
import io.github.shizuki.site.user.dto.AdminOptionsResponse;
import io.github.shizuki.site.user.service.UserService;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(AdminOptionsController.class)
class AdminOptionsControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserService userService;

    @Test
    void shouldGetAdminOptionsSuccessfully() throws Exception {
        AdminOptionsResponse response = new AdminOptionsResponse(
            List.of(new AdminGroupOptionResponse("USER", "用户", "ACTIVE", 1)),
            List.of("basic.read", "group.permission.write"),
            List.of("ai_round_total", "music_song_pick_total")
        );
        Mockito.when(userService.getAdminOptions()).thenReturn(response);

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/admin/options"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.groups[0].group_code").value("USER"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.permission_catalog[0]").value("basic.read"));
    }
}
