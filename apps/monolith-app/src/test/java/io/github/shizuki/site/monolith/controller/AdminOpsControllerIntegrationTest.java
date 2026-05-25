package io.github.shizuki.site.monolith.controller;

import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.common.security.model.LoginUser;
import io.github.shizuki.common.security.service.AdminPrivilegeService;
import io.github.shizuki.site.admin.response.AdminOpsContainerActionResponse;
import io.github.shizuki.site.admin.response.AdminOpsOverviewResponse;
import io.github.shizuki.site.media.response.MusicMetingStatusResponse;
import io.github.shizuki.site.monolith.config.GatewayAuthProperties;
import io.github.shizuki.site.monolith.ops.AdminOpsService;
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
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(AdminOpsController.class)
class AdminOpsControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private AdminOpsService adminOpsService;
    @MockBean
    private AdminPrivilegeService adminPrivilegeService;
    @MockBean
    private GatewayAuthProperties gatewayAuthProperties;
    @MockBean
    private AuthService authService;

    @AfterEach
    void tearDown() {
        LoginUserContext.clear();
    }

    @Test
    void shouldRejectOverviewWhenLoginMissing() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/admin/ops/overview"))
            .andExpect(MockMvcResultMatchers.status().isUnauthorized())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("UNAUTHORIZED"));
    }

    @Test
    void shouldRejectOverviewWhenUserNotAdmin() throws Exception {
        LoginUserContext.set(new LoginUser(7L, Set.of("USER"), Set.of()));

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/admin/ops/overview"))
            .andExpect(MockMvcResultMatchers.status().isForbidden())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("FORBIDDEN"));
    }

    @Test
    void shouldRejectContainerActionWhenPrivilegeNotUnlocked() throws Exception {
        LoginUserContext.set(new LoginUser(1L, Set.of("ADMIN"), Set.of()));
        Mockito.when(adminPrivilegeService.isUnlocked(ArgumentMatchers.any(), ArgumentMatchers.eq("Bearer test-token"))).thenReturn(false);
        Mockito.when(adminPrivilegeService.getUnlockTtlSeconds()).thenReturn(1800L);

        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/admin/ops/containers/id-backend/actions")
                .header("Authorization", "Bearer test-token")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "action": "restart"
                    }
                    """))
            .andExpect(MockMvcResultMatchers.status().isForbidden())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("FORBIDDEN"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.reason").value("ADMIN_PRIVILEGE_REQUIRED"));
    }

    @Test
    void shouldReturnOverviewSuccessfullyForAdmin() throws Exception {
        LoginUserContext.set(new LoginUser(1L, Set.of("ADMIN"), Set.of()));
        Mockito.when(adminOpsService.getOverview()).thenReturn(
            new AdminOpsOverviewResponse(
                "https://ops.shizuki.online",
                new MusicMetingStatusResponse(true, List.of("netease", "kuwo")),
                true,
                "OK",
                2,
                1,
                1
            )
        );

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/admin/ops/overview"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.portainer_reachable").value(true))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.meting.available").value(true));
    }

    @Test
    void shouldExecuteContainerActionWhenPrivilegeUnlocked() throws Exception {
        LoginUserContext.set(new LoginUser(1L, Set.of("ADMIN"), Set.of()));
        Mockito.when(adminPrivilegeService.isUnlocked(ArgumentMatchers.any(), ArgumentMatchers.eq("Bearer unlocked-token"))).thenReturn(true);
        Mockito.when(adminOpsService.actionContainer("id-backend", "restart")).thenReturn(
            new AdminOpsContainerActionResponse("id-backend", "shizuki-site-backend", "restart", "ACCEPTED", "ok")
        );

        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/admin/ops/containers/id-backend/actions")
                .header("Authorization", "Bearer unlocked-token")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "action": "restart"
                    }
                    """))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.action").value("restart"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.status").value("ACCEPTED"));
    }
}
