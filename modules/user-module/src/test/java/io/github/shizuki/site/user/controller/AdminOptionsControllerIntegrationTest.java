package io.github.shizuki.site.user.controller;

import io.github.shizuki.site.user.response.AdminGroupOptionResponse;
import io.github.shizuki.site.user.response.AdminOptionsResponse;
import io.github.shizuki.site.user.response.AdminPermissionOptionResponse;
import io.github.shizuki.site.user.response.AdminQuotaOptionResponse;
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
            List.of("ai_round_total", "music_song_pick_total"),
            List.of(new AdminPermissionOptionResponse("basic.read", "基础浏览", "基础读取权限", "基础", true)),
            List.of(new AdminQuotaOptionResponse("ai_round_total", "AI 对话轮次", "AI 对话总轮数", "count", true))
        );
        Mockito.when(userService.getAdminOptions()).thenReturn(response);

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/admin/options"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.groups[0].group_code").value("USER"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.permission_catalog[0]").value("basic.read"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.permission_options[0].code").value("basic.read"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.permission_options[0].label").value("基础浏览"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.quota_options[0].unit").value("count"));
    }

    @Test
    void shouldKeepLegacyConstructorCompatible() throws Exception {
        AdminOptionsResponse response = new AdminOptionsResponse(
            List.of(new AdminGroupOptionResponse("USER", "用户", "ACTIVE", 1)),
            List.of("basic.read"),
            List.of("ai_round_total")
        );
        Mockito.when(userService.getAdminOptions()).thenReturn(response);

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/admin/options"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.permission_options").isEmpty())
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.quota_options").isEmpty());
    }
}
