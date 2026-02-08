package io.github.shizuki.site.user.controller;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import io.github.shizuki.site.user.dto.OAuthLoginCreateRequest;
import io.github.shizuki.site.user.dto.OAuthLoginCreateResponse;
import io.github.shizuki.site.user.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(OAuthLoginController.class)
class OAuthLoginControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserService userService;

    @Test
    void shouldCreateOauthLoginSuccessfully() throws Exception {
        OAuthLoginCreateResponse response = new OAuthLoginCreateResponse(
            "oauth-login-001",
            "https://github.com/login/oauth/authorize?...",
            "state-001"
        );
        when(userService.createOAuthLogin(org.mockito.ArgumentMatchers.any(OAuthLoginCreateRequest.class)))
            .thenReturn(response);

        mockMvc.perform(post("/api/v1/oauth-logins")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "provider": "github",
                      "redirectUri": "https://example.com/oauth/callback"
                    }
                    """))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.code").value("OK"))
            .andExpect(jsonPath("$.data.oauthLoginId").value("oauth-login-001"))
            .andExpect(jsonPath("$.data.state").value("state-001"));
    }

    @Test
    void shouldExchangeTokenSuccessfully() throws Exception {
        when(userService.exchangeOAuthToken(eq("oauth-login-001"), eq("code-001"), eq("state-001")))
            .thenReturn("token-001");

        mockMvc.perform(post("/api/v1/oauth-logins/oauth-login-001/tokens")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "code": "code-001",
                      "state": "state-001"
                    }
                    """))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.code").value("OK"))
            .andExpect(jsonPath("$.data.token").value("token-001"))
            .andExpect(jsonPath("$.data.authorization").value("Bearer token-001"));
    }
}
