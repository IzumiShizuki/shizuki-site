package io.github.shizuki.site.user.controller;

import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.common.security.model.LoginUser;
import io.github.shizuki.common.security.service.AdminPrivilegeService;
import io.github.shizuki.site.user.support.ApiErrorAssertions;
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

@WebMvcTest(AdminPrivilegeController.class)
class AdminPrivilegeControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private AdminPrivilegeService adminPrivilegeService;

    @AfterEach
    void tearDown() {
        LoginUserContext.clear();
    }

    @Test
    void shouldUnlockAdminPrivilegeSuccessfully() throws Exception {
        LoginUserContext.set(new LoginUser(1L, Set.of("ADMIN"), Set.of()));
        Mockito.when(adminPrivilegeService.getUnlockTtlSeconds()).thenReturn(1800L);

        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/admin/privileges/unlock")
                .header("Authorization", "Bearer token-123")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "code": "Izumi2486"
                    }
                    """))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.status").value("UNLOCKED"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.expires_in_sec").value(1800));

        Mockito.verify(adminPrivilegeService).verifyAndUnlock(
            ArgumentMatchers.any(LoginUser.class),
            ArgumentMatchers.eq("Bearer token-123"),
            ArgumentMatchers.eq("Izumi2486")
        );
    }

    @Test
    void shouldReturnBadRequestWhenCodeBlank() throws Exception {
        LoginUserContext.set(new LoginUser(1L, Set.of("ADMIN"), Set.of()));

        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/admin/privileges/unlock")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "code": ""
                    }
                    """))
            .andExpect(MockMvcResultMatchers.status().isBadRequest());
    }

    @Test
    void shouldReturnUnauthorizedWhenLoginContextMissing() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/admin/privileges/unlock")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "code": "Izumi2486"
                    }
                    """))
            .andExpect(ApiErrorAssertions.hasProblem(401, "UNAUTHORIZED"));
    }
}
