package io.github.shizuki.site.user.controller;

import io.github.shizuki.site.user.response.MeResponse;
import io.github.shizuki.site.user.service.AuthService;
import io.github.shizuki.site.user.service.UserService;
import io.github.shizuki.site.user.service.AccountClosureService;
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

    @MockBean
    private AuthService authService;

    @MockBean
    private AccountClosureService accountClosureService;

    @Test
    void shouldCloseOnlyTheAuthenticatedAccount() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.delete("/api/v1/me/account")
                .header("X-User-Id", "7")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"confirmation\":\"注销账号\",\"user_id\":99}"))
            .andExpect(MockMvcResultMatchers.status().isOk());
        Mockito.verify(accountClosureService).closeAccount(7L, "注销账号");
    }

    @Test
    void shouldRejectAnonymousClosure() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.delete("/api/v1/me/account")
                .contentType(MediaType.APPLICATION_JSON).content("{\"confirmation\":\"注销账号\"}"))
            .andExpect(MockMvcResultMatchers.status().isUnauthorized());
        Mockito.verifyNoInteractions(accountClosureService);
    }

    @Test
    void shouldRejectWrongClosureConfirmation() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.delete("/api/v1/me/account")
                .header("X-User-Id", "7")
                .contentType(MediaType.APPLICATION_JSON).content("{\"confirmation\":\"删除\"}"))
            .andExpect(MockMvcResultMatchers.status().isBadRequest());
        Mockito.verifyNoInteractions(accountClosureService);
    }

    @Test
    void shouldGetCurrentUserSuccessfully() throws Exception {
        Mockito.when(userService.currentUser()).thenReturn(
            new MeResponse(1L, "alice", "https://cdn.example.com/avatar/alice.png", Set.of("USER"), Set.of("media.asset.audit"))
        );

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/me"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.user_id").value(1))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.nickname").value("alice"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.avatar_url").value("https://cdn.example.com/avatar/alice.png"));
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

    @Test
    void shouldReturnUnauthorizedWhenAccountWithoutLogin() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/me/account"))
            .andExpect(MockMvcResultMatchers.status().isUnauthorized())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("UNAUTHORIZED"));
    }

    @Test
    void shouldReturnUnauthorizedWhenUpdateProfileWithoutLogin() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.put("/api/v1/me/profile")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "nickname": "alice-updated"
                    }
                    """))
            .andExpect(MockMvcResultMatchers.status().isUnauthorized())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("UNAUTHORIZED"));
    }

    @Test
    void shouldReturnUnauthorizedWhenChangePasswordWithoutLogin() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.put("/api/v1/me/password")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "email": "alice@example.com",
                      "email_code": "123456",
                      "new_password": "new-password-123",
                      "confirm_password": "new-password-123"
                    }
                    """))
            .andExpect(MockMvcResultMatchers.status().isUnauthorized())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("UNAUTHORIZED"));
    }
}
