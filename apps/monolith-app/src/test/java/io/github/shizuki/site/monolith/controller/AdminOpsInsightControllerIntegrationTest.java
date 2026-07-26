package io.github.shizuki.site.monolith.controller;

import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.common.security.model.LoginUser;
import io.github.shizuki.site.admin.response.AdminOpsContainerLogsResponse;
import io.github.shizuki.site.admin.response.AdminOpsMeguriStatusResponse;
import io.github.shizuki.site.admin.response.AdminOpsServiceHealthResponse;
import io.github.shizuki.site.monolith.auth.GuestAuthorTokenService;
import io.github.shizuki.site.monolith.config.GatewayAuthProperties;
import io.github.shizuki.site.monolith.ops.AdminOpsInsightService;
import io.github.shizuki.site.user.service.AuthService;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(AdminOpsInsightController.class)
class AdminOpsInsightControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private AdminOpsInsightService insightService;
    @MockBean
    private GatewayAuthProperties gatewayAuthProperties;
    @MockBean
    private AuthService authService;
    @MockBean
    private GuestAuthorTokenService guestAuthorTokenService;

    @AfterEach
    void tearDown() {
        LoginUserContext.clear();
    }

    @Test
    void returnsContainerLogsForAdmin() throws Exception {
        LoginUserContext.set(new LoginUser(1L, Set.of("ADMIN"), Set.of()));
        Mockito.when(insightService.getContainerLogs(ArgumentMatchers.eq("meguri-pet"), ArgumentMatchers.eq(120)))
            .thenReturn(new AdminOpsContainerLogsResponse("abc123", "meguri-pet", 120, List.of("line-1")));

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/admin/ops/containers/meguri-pet/logs")
                .param("tail", "120"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.container_name").value("meguri-pet"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.lines[0]").value("line-1"));
    }

    @Test
    void returnsServiceHealthForAdmin() throws Exception {
        LoginUserContext.set(new LoginUser(1L, Set.of("ADMIN"), Set.of()));
        Mockito.when(insightService.checkServiceHealth()).thenReturn(List.of(
            new AdminOpsServiceHealthResponse("memoryos", "http://host.docker.internal:8788/health", true, 200, 12L, "OK")));

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/admin/ops/services/health"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.data[0].name").value("memoryos"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data[0].healthy").value(true));
    }

    @Test
    void returnsMeguriStatusForAdmin() throws Exception {
        LoginUserContext.set(new LoginUser(1L, Set.of("ADMIN"), Set.of()));
        Mockito.when(insightService.getMeguriStatus()).thenReturn(new AdminOpsMeguriStatusResponse(
            true, "abc123", "meguri-pet", "running", "Up 3 hours", true, true,
            true, "2026-07-26T09:00:00Z", 42L, false, null));

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/admin/ops/meguri/status"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.container_name").value("meguri-pet"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.running").value(true))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.metrics_age_seconds").value(42));
    }

    @Test
    void rejectsNonAdminUser() throws Exception {
        LoginUserContext.set(new LoginUser(2L, Set.of("USER"), Set.of()));

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/admin/ops/meguri/status"))
            .andExpect(MockMvcResultMatchers.status().is4xxClientError());
    }
}
